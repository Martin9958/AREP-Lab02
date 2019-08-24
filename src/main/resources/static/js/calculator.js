var calculatorKitModule = (function (){
    var errorMessage = function(){
        alert("Something was wrong in the application, try again later ")
    };

    return{
        getTheResult : function getTheResult(){
                Promise.resolve(axios.post('http://localhost:4567/result'), {list : this.dataList() })
                .then(function(res){
                    document.getElementById("result").innerHTML = "Mocos"
                })
        },
        dataList : function dataList(){
            var data = document.getElementById("dataInput").value
            return data.split(" ").map(Number);
        }
    }
})();