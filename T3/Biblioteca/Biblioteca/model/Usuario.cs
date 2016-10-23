using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Biblioteca.model
{
    class Usuario
    {
        public string matricula { get; set; }

        public string nome { get; set; }

        public List<Livro> livrosEmprestados { get; set; }
    }
}
