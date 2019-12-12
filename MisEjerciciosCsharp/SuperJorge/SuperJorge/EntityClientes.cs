using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MiPrimerFormulario
{
    class EntityClientes
    {
        public int IdCliente { get; set; }
        public String NumeroDocumento { get; set; }
        public String PrimerNombre { get; set; }
        public String SegundoNombre { get; set; }
        public String PrimerApellido { get; set; }
        public String SegundoApellido { get; set; }
        public String Telefono { get; set; }
        public DateTime FechaNacimiento { get; set; }

    }
}
