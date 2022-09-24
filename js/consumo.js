
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
        url: "https://g1a275dd941b3f6-dbamintic.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/open-api-catalog/car/",
        data: diccionario,
        complete: function () { alert("Informacin enviada"); },
        dataType: "json"

    });

}


function peticionGET() {

    $.ajax({
        type: "GET",
        url: "https://g1a275dd941b3f6-dbamintic.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/car/car",
        dataType: "json",
        success: function (data) {
            /* count permite y verificar cuantos registros existen*/
            let numreg = data.count
            let car = data.items
            console.log(numreg)
            console.log(car)
            for (i = 0; i < numreg; i++) {
                console.log("ID " + (i + 1))
                console.log("Codigo " + car[i].brand)
                console.log("Model " + car[i].model)
                console.log("Categoria " + car[i].category_id)}
        }

    });
}
