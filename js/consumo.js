function diccionarioJSON() {
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
        url: "https://g1a275dd941b3f6-dbamintic.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/car/car",
        data: diccionario,
        success: function () { alert("Informacin enviada"); },
        dataType: "json"

    });

}