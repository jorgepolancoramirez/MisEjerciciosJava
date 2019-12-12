function Registrar_Insumos (){
    

    
    var codigo = $("#cod_insumo").val();
    var nombre = $("#nombre").val();
    var cantidad = $("#cantidad").val();
    var tipo = $("#tipo").val();
    var fecha_caducidad = $("#fec_caducidad").val();
    var parametros = { 'Operacion': 'Registrar','cod':codigo,'cant':cantidad,'tip':tipo,'nomb':nombre,'fech':fecha_caducidad};
    
       

    $.ajax({
           type:"POST",
           url:"Cont_Insumos",
           data:parametros,
           dataType:"text",
           success: function (resp){
               $("#cod_insumo").val('');
               $("#nombre").val('');
               $("#cantidad").val('');
               $("#tipo").val('');
               $("#fec_caducidad").val('');
               alert(resp);
               $('#respuesta_servidor').html(resp);               
           }
           
    }).fail(function(jqXHR, textStatus, errorThrown){
        alert("Error  :" + jqXHR.Status);
    });
  

}
function Listar_Insumos (){
    var parametros = { 'Operacion' : 'Listar'};
    $.ajax({
            type:"POST",
            url:"Cont_Insumos",
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#Lista_Insumos').html(resp);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    })    
                
                };
                
  function Listar_Insumos_json(){
    
     var parametros = { 'Operacion' : 'Listar_Json'};
    $.ajax({
            type:"POST",
            url:"Cont_Insumos",
            data:parametros,
            dataType:"json",
            success: function (resp){
            var tbody="";
            var i=0;
            
            $.each(resp, function (index, val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.CODIGO_INSUMO+"</td>";
                tbody +="<td>"+val.NOMBRE+"</td>";
                tbody +="<td>"+val.CANTIDAD+"</td>";
                tbody +="<td>"+val.TIPO+"</td>";
                tbody +="<td>"+val.FECHA_CADUCIDAD+"</td>";
                tbody +="<td><a href='javascript:Eliminar_Insumos("+i+");'> Eliminar</a></td></tr>";
                
                i++;
            });
            
            alert ("Respuesta de Backend con json");
                $('#Lista_Insumos').html(tbody);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    }) ;   
                
                }


 function Eliminar_Insumos (id){
     
    var parametros = { 'Operacion' : 'Eliminar','id':id};
    $.ajax({
        
            type:"POST",
            url:"Cont_Insumos",                                                
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#respuesta_servidor').html(resp);
                alert(resp);
                Listar_Insumos();
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    });    
                
                };

