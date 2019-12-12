function Registrar_Administradores(){

    var Identificacion = $("#Identificacion").val();
    var Nombre = $("#Nombre").val();
    var Apellido = $("#Apellido").val();
    var Telefono = $("#Telefono").val();
    var Correo = $("#Correo").val();
     var parametros = { 'Operacion' : 'Registrar','ide':Identificacion,'Nom':Nombre,'Ape':Apellido,'Tel':Telefono,'Cor':Correo};
  $.ajax({
      type: "POST",
      url: "Cont_Administrador",
      data: parametros,
      dataType: "text",
      success: function (resp){
          $("#Identificacion").val('');
          $("#Nombre").val('');
          $("#Apellido").val('');
          $("#Telefono").val('');
          $("#Correo").val('');
          $('#respuesta_servidor').html(resp);
      }
  }).fail (function (jqXHR, textStatus, errorThrown){
      alert("Error : " + jqXHR.status);
  });  
}
function Listar_Administrador(){
    var parametros = { 'Operacion':'Listar'};
    $.ajax({
        type: "POST",
        url: "Cont_Administrador",
        data: parametros,
        dataType: "text",
        success: function (resp){
            $('#Listar_Administrador').html(resp);
        }
    }).fail (function (jqXHR, textStatus, errorThrown){
      alert("Error : " + jqXHR.status);
  });
}
function Listar_Administrador_Json(){
    var parametros = { 'Operacion':'Listar_Json'};
    $.ajax({
        type: "POST",
        url: "Cont_Administrador",
        data: parametros,
        dataType: "json",
        success: function (resp){
        var tbody="";
        var i=0;
        $.each(resp,function (index, val){
              tbody +="<tr><td>"+i+"</td>";
              tbody +="<td>"+val.Nombre+"</td>";
              tbody +="<td>"+val.Cedula+"</td>";
              tbody +="<td>"+val.Telefono+"</td>";
              tbody +="<td>"+val.Direccion+"</td>";
              tbody +="<td><a href ='javascript:Eliminar_Admi("+i+" );'>Eliminar</a></td></tr>";
              
              i++;
              });
                  alert("Respuesta de Backend con Json");
                  $('#Listar_Administrador').html(tbody);


        }
    }).fail (function (jqXHR, textStatus, errorThrown){
      alert("Error : " + jqXHR.status);
  });
}
function Eliminar_Admi(id){
       var parametros = { 'Operacion':'Eliminar','id':id};
    alert(id);
    $.ajax({
     type: "POST",
     url: "Cont_Administrador",
     data: parametros,
     dataType: "text",
     success: function (resp){
       
     $('#respuesta_servidor').html(resp);
        Listar_Administrador();
     }
     }).fail (function (jqXHR, textStatus, errorThrown){
     alert("Error : " + jqXHR.status);
     });
}

