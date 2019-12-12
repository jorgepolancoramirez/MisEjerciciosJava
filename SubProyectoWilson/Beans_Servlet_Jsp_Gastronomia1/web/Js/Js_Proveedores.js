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
               alert(resp);
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
                
                };
                
  function Listar_Proveedores_json(){
    
     var parametros = { 'Operacion' : 'Listar_Json'};
    $.ajax({
            type:"POST",
            url:"Cont_proveedores",
            data:parametros,
            dataType:"json",
            success: function (resp){
            var tbody="";
            var i=0;
            
            $.each(resp, function (index, val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.nombre+"</td>";
                tbody +="<td>"+val.cedula+"</td>";
                tbody +="<td>"+val.telefono+"</td>";
                tbody +="<td>"+val.ciudad+"</td>";
                tbody +="<td><a href='javascript:Eliminar_Proveedores("+i+");'> Eliminar</a></td></tr>";
                
                i++;
            });
            
            alert ("Respuesta de Backend con json");
                $('#Lista_Proveedores').html(tbody);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    }) ;   
                
                }
   function Listar_Estudiantes_json (){
    
     var parametros = { 'Operacion' : 'Listar_Json'};
    $.ajax({
            type:"POST",
            url:"Cont_Proveedores",
            data:parametros,
            dataType:"json",
            success: function (resp){
            var tbody="";
            var i=0;
            
            $.each(resp, function (index, val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.nombre+"</td>";
                tbody +="<td>"+val.cedula+"</td>";
                tbody +="<td>"+val.telefono+"</td>";
                tbody +="<td>"+val.ciudad+"</td>";
                tbody +="<td><a href='javascript:Eliminar_Proveedores("+i+");'> Eliminar</a></td></tr>";
                
                i++;
            });
            
            alert ("Respuesta de Backend con json");
                $('#Lista_proveedores').html(tbody);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    }) ;   
                
                }
                

 function Eliminar_Proveedores (id){
     
    var parametros = { 'Operacion' : 'Eliminar','id':id};
    $.ajax({
        
            type:"POST",
            url:"Cont_Proveedores",                                                
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#respuesta_servidor').html(resp);
                alert(resp);
                Listar_proveedores();
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    });    
                
                };

