using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Biblioteca.model
{
    class BibliotecaModel
    {
        public List<Livro> livros { get; set; }

        public List<Usuario> usuariosDaBiblioteca { get; set; }

        public BibliotecaModel()
        {
            livros = new List<Livro>();
            usuariosDaBiblioteca = new List<Usuario>();
           this.populateLivros();
        }

        private void populateLivros()
        {
            for (int i = 1; i <= 20; i++)
            {
                Livro livro = new Livro();
                livro.id = i;
                livro.autor = "Autor Teste";
                livro.titulo = "Titulo Teste" + i;     
            }
        }
    }
}
