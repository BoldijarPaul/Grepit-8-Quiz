var home="http://localhost:8080/api";
function addAnswer(questionId,answer,fullName){
   	$.ajax({
        url : home+"/answer/"+questionId+"?fullName"+fullName+"&answer="+answer,
        type: "GET",
        success : handleData,
        error: handleError
    })
}
function handleData(data, textStatus, xhr) {
	alert("success");
}
function handleError(xhr, textStatus, errorThrown) {
	alert(xhr.responseText);
}
