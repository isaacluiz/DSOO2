using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Biblioteca.model
{    
    class Livro
    {
        private String titulo { get; set; }

        private String autor { get; set; }

        private int id { get; set; }

        private DateTime dataEmprestimo { get; set; }

        private DateTime dataDevolucao { get; set; }

    }
}
