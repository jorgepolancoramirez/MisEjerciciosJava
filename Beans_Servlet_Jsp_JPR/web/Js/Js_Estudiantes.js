function Registrar_Estudiantes (){
    

    
   
    var Nombre = $("#Nombre").val();
    var Nota1 = $("#Nota1").val();
    var Nota2 = $("#Nota2").val();
    var Nota3 = $("#Nota3").val();
    var parametros = { 'Operacion': 'Registrar','N1':Nota1,'N2':Nota2,'N3':Nota3,'Nomb':Nombre};
    
       

    $.ajax({
           type:"POST",
           url:"Cont_Estudiante",
           data:parametros,
           dataType:"text",
           success: function (resp){
                  
               $("#Nombre").val('');
               $("#Nota1").val('');
               $("#Nota2").val('');
               $("#Nota3").val('');
               $('#respuesta_servidor').html(resp);               
           }
           
    }).fail(function(jqXHR, textStatus, errorThrown){
        alert("Error  :" + jqXHR.Status);
    });
  

}
function Listar_Estudiantes (){
    var parametros = { 'Operacion' : 'Listar'};
    $.ajax({
            type:"POST",
            url:"Cont_Estudiante",
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#Listar_Estudiantes').html(resp);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    }) ;   
                
                }
                
 function Listar_Estudiantes_json (){
    
     var parametros = { 'Operacion' : 'Listar_Json'};
    $.ajax({
            type:"POST",
            url:"Cont_Estudiante",
            data:parametros,
            dataType:"json",
            success: function (resp){
            var tbody="";
            var i=0;
            
            $.each(resp, function (index, val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.Nombre+"</td>";
                tbody +="<td>"+val.nota1+"</td>";
                tbody +="<td>"+val.nota2+"</td>";
                tbody +="<td>"+val.nota3+"</td>";
                tbody +="<td>"+val.definitiva+"</td>";
                tbody +="<td><a href='javascript:Eliminar_Estudiante("+i+");'> Eliminar</a></td></tr>";
                
                i++;
            });
            
            alert ("Respuesta de Backend con json");
                $('#Lista_proveedores').html(tbody);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    }) ;   
                
                }
                
                               
                
                
                
 function Eliminar_Estudiante (id){
     
    var parametros = { 'Operacion' : 'Eliminar','id':id};
    $.ajax({
            type:"POST",
            url:"Cont_Estudiante",                                                
            data:parametros,
            dataType:"text",
            success: function (resp){
                $('#respuesta_servidor').html(resp);
                Listar_Estudiantes();
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    });    
                
                }



