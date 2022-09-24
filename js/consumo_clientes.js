//Declaración de varibles base de datos Oracle
//UrlCar= "https://gb47cdc0cd0d1af-productos.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/car/car"
UrlClient = "https://g4cab850130b15d-ciclo3proyectocar.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/client/client"

function peticionListaGet(){
   /* var diccionarioGet = {
        id: $("#idGet").val(),
        name: $("#nameGet").val(),
        email: $("#emailGet").val(),
        age: $("#ageGet").val()
    };*/
    
    //var jsonGet = JSON.stringify(diccionarioGet);
    //let valores = Object.values(diccionarioGet);
    $.ajax({
        url:UrlClient,
        type:'GET',
        dataType: 'json',
        success:function(data){
            let numreg = data.count
            let clientes = data.items
            console.log(numreg)
            console.log(clientes)
            console.log("*****************")
            for(let i=0; i<numreg; i++){
                alert("Cliente : "+ (i+1)+" --> Identificador: "+ clientes[i].id);
                console.log("Identificador: "+ clientes[i].id);
                console.log("Nombre: "+ clientes[i].name);
                //console.log("E-mail: "+ clientes[i].email);
                //console.log("Edad: "+ clientes[i].age);
            }
        },
    });
    //console.log(jsonGet)
    
}


function peticionPost() {
    var diccionario = {
        id: $("#id").val(),
        name: $("#name").val(),
        email: $("#email").val(),
        age: $("#age").val()
    };
    var datos_enviados = JSON.stringify(diccionario);
    console.log(diccionario);
    $.ajax({
        type: "POST",
        url: UrlClient,
        data: diccionario,
        success: function () { alert("Informacion enviada"); },
        dataType: "json"

    });

}

function peticionDetallesGet(){
     var diccionarioGet = {
         id: $("#idGet").val(),
     };
     
     //var jsonGet = JSON.stringify(diccionarioGet);
     //let valores = Object.values(diccionarioGet);
     $.ajax({
         url:UrlClient,
         type:'GET',
         dataType: 'json',
         success:function(data){
             let numreg = data.count
             let clientes = data.items
             console.log(numreg)
             console.log(clientes)
             console.log("*****************")
                for(let i=0; i<numreg; i++){
                 //console.log("Cliente : "+ (i+1));
                 //console.log("Identificador: "+ clientes[i].id);
                 //console.log("Nombre: "+ clientes[i].name);
                 //console.log("E-mail: "+ clientes[i].email);
                 //console.log("Edad: "+ clientes[i].age);
                 console.log("**Detalles**")
                 if(idGet==clientes[i]){
                 console.log("Identificador: "+ clientes[i].id);
                 console.log("Nombre: "+ clientes[i].name);
                 console.log("E-mail: "+ clientes[i].email);
                 console.log("Edad: "+ clientes[i].age);
                 }
 
             }
         },
     });
     //console.log(jsonGet)
     
 }
 
 
 function peticionPost() {
     var diccionario = {
         id: $("#id").val(),
         name: $("#name").val(),
         email: $("#email").val(),
         age: $("#age").val()
     };
     var datos_enviados = JSON.stringify(diccionario);
     console.log(diccionario);
     $.ajax({
         type: "POST",
         url: UrlClient,
         data: diccionario,
         success: function () { alert("Informacion enviada"); },
         dataType: "json"
 
     });
 
 }

function peticionPut(){
    var diccionarioPut = {
        id: $("#idPut").val(),
        brand: $("#namePut").val(),
        model: $("#emailPut").val(),
        category_id: $("#agePut").val()
    };
    
    var jsonPut = JSON.stringify(diccionarioPut);
    $.ajax({
        type:'PUT',
        url:UrlClient,
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
        url:UrlClient,
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

