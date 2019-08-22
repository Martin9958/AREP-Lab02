var calculatorKitModule = (function (){
    var errorMessage = function(){
        alert("Something was wrong in the application, try again later ")
    };

    return{
        getTheResult : async function getTheResult(){
                await Promise.resolve(axios.get('/result'))
                .then(function(response){
                    document.getElementById("result").innerHTML = JSON.stringify(response.data)
                })
                .catch(function(){
                    errorMessage();
                })
        }
    }
})();