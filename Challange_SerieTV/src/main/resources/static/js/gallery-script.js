$('#foto').on(function(){

    $.ajax({
        url: "https://localhost:9100/api/serietv",
        type: "get",
        dataType: "json", 
        success: function(data){
            let oggetto = {
                "titolo": data[0].show.name,
                "img": data[0].show.image.original
            }
            console.log(oggetto);
        }
    })
})
