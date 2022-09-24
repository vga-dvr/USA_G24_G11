//Declaración de varibles base de datos Oracle
UrlCar= "https://gb47cdc0cd0d1af-productos.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/car/car"
UrlPut= "https://g4cab850130b15d-ciclo3proyectocar.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/car/car"

function peticionPost() {
    var diccionario = {
        id: $("#id").val(),
        brand: $("#brand").val(),
        model: $("#model").val(),
        category_id: $("#category_id").val()
    };
    var datos_enviados = JSON.stringify(diccionario);
    console.log(diccionario);
    $.ajax({
        type: "POST",
        url: UrlCar,
        data: diccionario,
        success: function () { alert("Informacion enviada"); },
        dataType: "json"

    });

}

function peticionPut(){
    var diccionarioPut = {
        id: $("#idPut").val(),
        brand: $("#brandPut").val(),
        model: $("#modelPut").val(),
        category_id: $("#category_idPut").val()
    };
    
    var jsonPut = JSON.stringify(diccionarioPut);
    $.ajax({
        type:'PUT',
        url:UrlCar,
        data: jsonPut,
        contentType:"application/json",
        complete:function(response){
            if(response.status == 201){
                alert("Editado con éxito!!")
            }
            console.log(response.status)
        }
    });
    console.log(jsonPut)
    
}

function peticionDelete(){
    var diccionarioDelete = {
        id: $("#idDelete").val(),
    };
    
    var jsonDelete = JSON.stringify(diccionarioDelete);
    $.ajax({
        type:'DELETE',
        url:UrlCar,
        data: jsonDelete,
        contentType:"application/json",
        complete:function(response){
            if(response.status == 204){
                alert("Eliminado con éxito!!")
            }
            console.log(response.status)
        }
    });
    console.log(jsonDelete)
    
}

