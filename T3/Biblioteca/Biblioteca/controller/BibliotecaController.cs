﻿using Biblioteca.model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Biblioteca.controller
{
    class BibliotecaController
    {
        public BibliotecaModel biblioteca { get; set; }

        public BibliotecaController ()
        {
            biblioteca = new BibliotecaModel();
            
        }
    }
}
