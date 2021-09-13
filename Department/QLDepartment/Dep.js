var deps = []
$(function () {
    getdeps();
    $("#reset_btn").click(function () {
        $("#ID_ID").val("")
        $("#DepName_ID").val("")
    });
    $("#save").click(function () {
        
        var name=$("#DepName_ID").val()
        var dep = {
            name: name
        }
        $.ajax({
            url: 'http://localhost:8080/api/v1/departments/',
            type: 'POST',
            data: JSON.stringify(dep),
            contentType: "application/json",
            success: function () {
                getdeps();
            }
        });
        $("#myModal").modal('hide');
        $("#ID_ID").val("")
        $("#DepName_ID").val("")
        return false;
        
    })

})
function getdeps() {
    $.get("http://localhost:8080/api/v1/departments/", function (data) {
        deps = []
        data.forEach(function (item) {
            var dep = {
                'depid': item.id,
                'depname': item.name
            }
            deps.push(dep);
        });
        $("#Result_TB").empty()
        for (var index = 0; index < deps.length; index++) {
        $("#Result_TB").append(`
        <tr>
        <th style="background-color: gold;">${deps[index].depid}</th>
        <th style="background-color: chartreuse;">${deps[index].depname}</th>
        <th style="background-color: slateblue;"><button class="btn btn-warning" onclick=getdep(${index})>Edit</button></th>
        <th style="background-color: lightgreen;"><button class="btn btn-warning" onclick=deleteDep(${index})>Delete</button></th>
        </tr>
        `)
        }
    })
}
function deleteDep(index){
    var v_del=deps[index].depid
    var confimdel=confirm("bạn có chắc ko?")
    if (confimdel) {
        $.ajax({
        url:'http://localhost:8080/api/v1/departments/'+v_del,
        type:'DELETE',
        success:function(result){
            if (result==undefined||result==null) {
                alert("error when loading data")
                return;
            }
            getdeps();
        }
    }
    )
    }
    else{
        return;
    }
    
}
function getdep(Index) {
    var id=deps[Index].depid;
    $.get("http://localhost:8080/api/v1/departments/"+id, function (data) {
        $('#myModal1').modal('show');
            document.getElementById('ID_ID1').value=data.id;
            document.getElementById('DepName_ID1').value=data.name 
    })   
}
function updateDep(){
    var id=document.getElementById('ID_ID1').value;
    var name=document.getElementById('DepName_ID1').value;
    var dep = {
                name: name
            }
            $.ajax({
                url: 'http://localhost:8080/api/v1/departments/' + id,
                type: 'PUT',
                data: JSON.stringify(dep),
                contentType: "application/json",
                success: function () {
                    $('#myModal1').modal('hide');
                    alert('update thành công');
                    getdeps();
                }
            });
            
        
    
}