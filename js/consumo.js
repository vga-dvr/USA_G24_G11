
/* Funcion definida que permite el envio de datos del formulario a la base de datos Oracle CLoud*/
function peticionPOST() {
    /*Crecion del diccionario con los valores del formulario crear.html */
    var diccionario = {
        id: $("#id").val(),
        brand: $("#brand").val(),
        model: $("#model").val(),
        category_id: $("#category_id").val()
    };
    /* Variable y librearia que realiza la convercion de los datos a JSON*/
    var datos_enviados = JSON.stringify(diccionario);
    console.log(diccionario);
    $.ajax({
        type: "POST",
        url: "https://g1a275dd941b3f6-dbamintic.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/car/car",
        data: diccionario,
        complete: function () { alert("Informacin enviada"); },
        dataType: "json"

    });

}