//Declaración de varibles base de datos Oracle
UrlCar = "https://gb47cdc0cd0d1af-productos.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/car/car"


// Función que permite detallar el por medio del id los campos de los clientes recibe como parámetro #idGet del frondend 
function peticionGet() {
    var diccionarioget = {
        id: $("#idGet").val()
    };
    var variableHtml = $("#idGet")
   // AJAx GET funcion detallada
    $.ajax({
        type: "GET",
        url: UrlCar,
        data: diccionarioget,
        success: function (data) {
            let numreg = data.count
            let datos = data.items
            for (i = 0; i < numreg; i++) {
                iterador = ((i+1))
                var identificador = (datos[i].id)
                if (identificador == 25){   
                alert("Marca Auto Movil :"+datos[i].brand)
                alert("Modelo del Auto Movil: "+datos[i].model)
                alert("CategoriaID  Auto Movil:"+datos[i].category_id)
                }
                
                
            }
        },
        error: function () {

        },
        complete: function () {

        }

    });
}
//Peticion Post modulo de CRUD carros
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
//Peticion Put modulo de CRUD carros
function peticionPut() {
    var diccionarioPut = {
        id: $("#idPut").val(),
        brand: $("#brandPut").val(),
        model: $("#modelPut").val(),
        category_id: $("#category_idPut").val()
    };

    var jsonPut = JSON.stringify(diccionarioPut);
    $.ajax({
        type: 'PUT',
        url: UrlCar,
        data: jsonPut,
        contentType: "application/json",
        complete: function (response) {
            if (response.status == 201) {
                alert("Editado con éxito!!")
            }
            console.log(response.status)
        }
    });
    console.log(jsonPut)

}

function peticionDelete() {
    var diccionarioDelete = {
        id: $("#idDelete").val(),
    };

    var jsonDelete = JSON.stringify(diccionarioDelete);
    $.ajax({
        type: 'DELETE',
        url: UrlCar,
        data: jsonDelete,
        contentType: "application/json",
        complete: function (response) {
            if (response.status == 204) {
                alert("Eliminado con éxito!!")
            }
            console.log(response.status)
        }
    });
    console.log(jsonDelete)

}

