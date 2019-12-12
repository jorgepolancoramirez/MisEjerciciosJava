function Registrar_Elementos(){

    var Codigo = $("#Codigo").val();
    var Nombre = $("#Nombre").val();
    var Valor = $("#Valor").val();
    var Cantidad = $("#Cantidad").val();
     var parametros = { 'Operacion' : 'Registrar','Cod':Codigo,'Nom':Nombre,'Val':Valor,'Can':Cantidad};
  $.ajax({
      type: "POST",
      url: "Cont_Elementos",
      data: parametros,
      dataType: "text",
      success: function (resp){
          $("#Codigo").val('');
          $("#Nombre").val('');
          $("#Valor").val('');
          $("#Cantidad").val('');
          $('#respuesta_servidor').html(resp);
      }
  }).fail (function (jqXHR, textStatus, errorThrown){
      alert("Error : " + jqXHR.status);
  });  
}
function Listar_Elementos(){
    var parametros = { 'Operacion':'Listar'};
    $.ajax({
        type: "POST",
        url: "Cont_Elementos",
        data: parametros,
        dataType: "text",
        success: function (resp){
            $('#Listar_Elementos').html(resp);
        }
    }).fail (function (jqXHR, textStatus, errorThrown){
      alert("Error : " + jqXHR.status);
  });
}
function Listar_Elementos_Json(){
    var parametros = { 'Operacion':'Listar_Json'};
    $.ajax({
        type: "POST",
        url: "Cont_Elementos",
        data: parametros,
        dataType: "json",
        success: function (resp){
        var tbody="";
        var i=0;
        $.each(resp,function (index, val){
              tbody +="<tr><td>"+i+"</td>";
              tbody +="<td>"+val.Codigo+"</td>";
              tbody +="<td>"+val.Nombre+"</td>";   
              tbody +="<td>"+val.Valor+"</td>";
              tbody +="<td>"+val.Cantidad+"</td>";
              tbody +="<td><a href ='javascript:Eliminar_Elemen("+i+" );'>Eliminar</a></td></tr>";
              
              i++;
              });
                  alert("Respuesta de Backend con Json");
                  $('#Listar_Elementos').html(tbody);


        }
    }).fail (function (jqXHR, textStatus, errorThrown){
      alert("Error : " + jqXHR.status);
  });
}
function Eliminar_Elemen(id){
       var parametros = { 'Operacion':'Eliminar','id':id};
    alert(id);
    $.ajax({
     type: "POST",
     url: "Cont_Elementos",
     data: parametros,
     dataType: "text",
     success: function (resp){
       
     $('#respuesta_servidor').html(resp);
        Listar_Elementos();
     }
     }).fail (function (jqXHR, textStatus, errorThrown){
     alert("Error : " + jqXHR.status);
     });
}
