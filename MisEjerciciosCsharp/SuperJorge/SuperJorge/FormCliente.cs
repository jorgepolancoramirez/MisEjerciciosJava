using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using MySql.Data.MySqlClient;

namespace MiPrimerFormulario
{
    public partial class FormCliente : Form
    {
        public FormCliente()
        {
            InitializeComponent();
        }
        private bool Guardar()
        {
            EntityClientes cliente = new EntityClientes();
            cliente.NumeroDocumento = textNumero_Documento.Text;
            cliente.PrimerNombre = txtPrimerNombre.Text;
            cliente.SegundoNombre = txtSegundoNombre.Text;
            cliente.PrimerApellido = txtPrimerApellido.Text;
            cliente.SegundoApellido = txtSegundoApellido.Text;
            cliente.Telefono = txtTelefono.Text;
            cliente.FechaNacimiento = FechaNacimiento.Value;
            MySqlConnection Conex = new MySqlConnection();
            Conex.ConnectionString =
                "Server=127.0.0.1;" +
                "Database=bdsuperjorge;" +
                "User=root;" +
                "Pwd=;" +
                "SslMode=none;";
            Conex.Open();
            string Sql = @"INSERT INTO tbcliente
                         (Numero_Documento,Primer_Nombre,Segundo_Nombre,Primer_Apellido,Segundo_Apellido,Telefono,Fecha_Nacimiento)
                         VALUES
                         (@NumeroDocumento,@PrimerNombre,@SegundoNombre,@PrimerApellido,@SegundoApellido,@Telefono,@FechaNacimiento)";
            MySqlCommand Command = new MySqlCommand(Sql, Conex);
            Command.Parameters.AddWithValue("@NumeroDocumento", textNumero_Documento.Text);
            Command.Parameters.AddWithValue("@PrimerNombre", txtPrimerNombre.Text);
            Command.Parameters.AddWithValue("@SegundoNombre", txtSegundoNombre.Text);
            Command.Parameters.AddWithValue("@PrimerApellido", txtPrimerApellido.Text);
            Command.Parameters.AddWithValue("@SegundoApellido", txtSegundoApellido.Text);
            Command.Parameters.AddWithValue("@Telefono", txtTelefono.Text);
            Command.Parameters.AddWithValue("@FechaNacimiento", FechaNacimiento.Value);

            int NumFilas = Command.ExecuteNonQuery();

            if (NumFilas > 0)
            {
                MessageBox.Show("Se registro con exito el cliente");
                
            }
            return true;
        }

        private void btnRegistrar_Click(object sender, EventArgs e)
        {
            if (Guardar())
            {
                MessageBox.Show("Usuario Registrado con Exito", "Guardando Informacion de Usuario",
                    MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                MessageBox.Show("Error", "Guardando Informacion de Usuario",
                    MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
        }

    }
}

