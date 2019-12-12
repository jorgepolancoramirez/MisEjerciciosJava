function Registrar_Recetas (){
    

    
    var nombre = $("#nombre").val();
    var ingredientes = $("#ingredientes").val();
    var preparacion = $("#preparacion").val();
    var parametros = { 'Operacion': 'Registrar','ing':ingredientes,'pre':preparacion,'nomb':nombre};
    
       

    $.ajax({
           type:"POST",
           url:"Cont_Recetas",
           data:parametros,
           dataType:"text",
           success: function (resp){
               $("#nombre").val('');
               $("#ingredientes").val('');
               $("#preparacion").val('');
               alert(resp);
               $('#respuesta_servidor').html(resp);               
           }
           
    }).fail(function(jqXHR, textStatus, errorThrown){
        alert("Error  :" + jqXHR.Status);
    });
  

}
function Listar_Recetas (){
    var parametros = { 'Operacion' : 'Listar'};
    $.ajax({
            type:"POST",
            url:"Cont_Recetas",
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#Lista_Recetas').html(resp);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    })    
                
                };
                
  function Listar_Recetas_json(){
    
     var parametros = { 'Operacion' : 'Listar_Json'};
    $.ajax({
            type:"POST",
            url:"Cont_Recetas",
            data:parametros,
            dataType:"json",
            success: function (resp){
            var tbody="";
            var i=0;
            
            $.each(resp, function (index, val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.NOMBRE+"</td>";
                tbody +="<td>"+val.INGREDIENTES+"</td>";
                tbody +="<td>"+val.PREPARACION+"</td>";
                tbody +="<td><a href='javascript:Eliminar_Recetas("+i+");'> Eliminar</a></td></tr>";
                
                i++;
            });
            
            alert ("Respuesta de Backend con json");
                $('#Lista_Recetas').html(tbody);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    }) ;   
                
                }


 function Eliminar_Recetas (id){
     
    var parametros = { 'Operacion' : 'Eliminar','id':id};
    $.ajax({
        
            type:"POST",
            url:"Cont_Recetas",                                                
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#respuesta_servidor').html(resp);
                alert(resp);
                Listar_Recetas();
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    });    
                
                };

