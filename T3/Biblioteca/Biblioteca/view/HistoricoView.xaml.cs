using Biblioteca.controller;
using Biblioteca.model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace Biblioteca.view
{
    /// <summary>
    /// Interaction logic for HistoricoView.xaml
    /// </summary>
    public partial class HistoricoView : Window
    {
        public BibliotecaController controller { get; set; }

        public HistoricoView()
        {
            InitializeComponent();
        }

        private void button_procurar_Click(object sender, RoutedEventArgs e)
        {
            string matricula = textBox_matricula.Text;
            if (controller.VerificaMatricula(matricula))
            {
                foreach (Livro l in controller.LivrosDoUsuario(matricula)){
                    listView.Items.Add(l);
                }
            }
        }
    }
}
