using Biblioteca.controller;
using Biblioteca.view;
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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Biblioteca
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private BibliotecaController controller;

        public MainWindow()
        {
            InitializeComponent();
            controller = new BibliotecaController();
        }

        private void button_emprestar_Click(object sender, RoutedEventArgs e)
        {   
            PegarLivroView pegarLivro = new PegarLivroView();
            pegarLivro.populateCombo(controller.biblioteca.livros);
            pegarLivro.Show();
        }

        private void button_devolver_Click(object sender, RoutedEventArgs e)
        {
            DevolverLivroView devolverLivro = new DevolverLivroView();
            devolverLivro.Show();
        }
    }
}
