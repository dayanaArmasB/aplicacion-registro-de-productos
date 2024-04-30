document.addEventListener("DOMContentLoaded", function(){
    //alert("Este es un mensaje desde JS");
    var elementos = document.querySelector(".editarCategoria");

    elementos.addEventListener("click", function(event){
        alert("Hiciste click en el boton");
    })
})

(function(){
var listaBotonesEditar = document.querySelectorAll(".editarCategoria");
listaBotonesEditar.forEach(item => {
    item.addEventListener("click",e =>{
        document.getElementById("id").value =item.dataset.id
        document.getElementById("txtNombre").value =item.dataset.nombre
        document.getElementById("txtDescripcion").value =item.dataset.descripcion
        new bootstrap.Modal(document.getElementById('modalEditar')).show();
    })
});
 
})