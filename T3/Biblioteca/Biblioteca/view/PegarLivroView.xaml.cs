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
    /// Interaction logic for PegarLivroView.xaml
    /// </summary>
    public partial class PegarLivroView : Window
    {
        public PegarLivroView()
        {          
            InitializeComponent();
        }

        private void comboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {

        }

        private void button_cancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        public void populateCombo(List<Livro> livros)
        {
           
        }
    }
}
