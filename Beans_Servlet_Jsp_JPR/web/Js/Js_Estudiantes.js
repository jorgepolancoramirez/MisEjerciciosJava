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
                $('#Lista_Estuadiante').html(resp);
                   
            }
        }).fail(function (jqXHR, textStatus, errorThrown){
            alert("Error  : " + jqXHR.Status);
    })    
                
                }


