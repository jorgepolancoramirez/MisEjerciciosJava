function Registrar_proveedores (){
    

    
   
    var nombre = $("#nombre").val();
    var cedula = $("#cedula").val();
    var telefono = $("#telefono").val();
    var ciudad = $("#ciudad").val();
    var parametros = { 'Operacion': 'Registrar','cc':cedula,'tel':telefono,'ciudad':ciudad,'nomb':nombre};
    
       

    $.ajax({
           type:"POST",
           url:"Cont_Proveedores",
           data:parametros,
           dataType:"text",
           success: function (resp){
                  
               $("#nombre").val('');
               $("#cedula").val('');
               $("#telefono").val('');
               $("#ciudad").val('');
               $('#respuesta_servidor').html(resp);               
           }
           
    }).fail(function(jqXHR, textStatus, errorThrown){
        alert("Error  :" + jqXHR.Status);
    });
  

}
function Listar_proveedores (){
    var parametros = { 'Operacion' : 'Listar'};
    $.ajax({
            type:"POST",
            url:"Cont_Proveedores",
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#Lista_proveedores').html(resp);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    })    
                
                }

