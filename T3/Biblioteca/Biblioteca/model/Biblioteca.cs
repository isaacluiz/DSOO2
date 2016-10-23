using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Biblioteca.model
{
    class Biblioteca
    {
        public List<Livro> livros { get; set; }

        public List<Usuario> usuariosDaBiblioteca { get; set; }

        Biblioteca()
        {
            livros = new List<Livro>;
            usuariosDaBiblioteca = new List<Usuario>;
            populateLivros();
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
