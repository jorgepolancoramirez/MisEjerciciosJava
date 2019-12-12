function Registrar_Unidades_Productivas(){
    

    
   
    var Codigo = $("#codigo").val();
    var Nombre_Unidad = $("#nomunidad").val();
    var Nombre_Producto = $("#nomproducto").val();
    var Cantidad_de_Produccion = $("#canproduccion").val();
    var Precio = $("#precio").val();
    var Fecha = $("#fecha").val();

   
    
    var parametros = { 'Operacion': 'Registrar','cod':Codigo,'nom_uni':Nombre_Unidad,'nom_pro':Nombre_Producto,'can_pro':Cantidad_de_Produccion,'precio':Precio,'fecha':Fecha};
    
       

    $.ajax({
           type:"POST",
           url:"Cont_Examen",
           data:parametros,
           dataType:"text",
           success: function (resp){
                  
               $("#codigo").val('');
               $("#nomunidad").val('');
               $("#nomproducto").val('');
               $("#canproduccion").val('');
               $("#precio").val('');
               $("#fecha").val('');               
               alert(resp);
               $('#respuesta_servidor').html(resp);               
           }
           
    }).fail(function(jqXHR, textStatus, errorThrown){
        alert("Error  :" + jqXHR.Status);
    });
  

}
function Listar_Unidades_Productivas(){
    var parametros = { 'Operacion' : 'Listar'};
    $.ajax({
            type:"POST",
            url:"Cont_Examen",
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#Lista_Unidades_Productivas').html(resp);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    })    
                
                };
                
  function Listar_Unidades_Productivas_json (){
    
     var parametros = { 'Operacion' : 'Listar_Json'};
    $.ajax({
            type:"POST",
            url:"Cont_Examen",
            data:parametros,
            dataType:"json",
            success: function (resp){
            var tbody="";
            var i=0;
            
            $.each(resp, function (index, val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.CODIGO+"</td>";
                tbody +="<td>"+val.NOMBRE_UNIDAD+"</td>";
                tbody +="<td>"+val.NOMBRE_PRODUCTO+"</td>";
                tbody +="<td>"+val.CANTIDAD_DE_PRODUCCION+"</td>";
                tbody +="<td>"+val.PRECIO+"</td>";
                tbody +="<td>"+val.FECHA+"</td>";
                tbody +="<td>"+val.VALOR_PRODUCTO+"</td>";
                tbody +="<td>"+val.PROMEDIO_PRODUCTO+"</td>";

               

                tbody +="<td><a href='javascript:Eliminar_Unidades_Productivas("+i+");'> Eliminar</a></td></tr>";
                
                i++;
            });
            
            alert ("Respuesta de Backend con json");
                $('#Lista_Unidades_Productivas').html(tbody);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    }) ;   
                
                }


 function Eliminar_Unidades_Productivas (id){
     
    var parametros = { 'Operacion' : 'Eliminar','id':id};
    $.ajax({
        
            type:"POST",
            url:"Cont_Examen",                                                
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#respuesta_servidor').html(resp);
                alert(resp);
                Listar_Unidades_Productivas();
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    });    
                
                };

