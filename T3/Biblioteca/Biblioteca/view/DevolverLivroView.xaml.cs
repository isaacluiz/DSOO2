﻿using System;
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
    /// Interaction logic for DevolverLivroView.xaml
    /// </summary>
    public partial class DevolverLivroView : Window
    {
        public DevolverLivroView()
        {
            InitializeComponent();
        }

        private void button_cancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
