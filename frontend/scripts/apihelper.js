var home="http://localhost:8080/api";
function addAnswer(questionId,answer,fullName){
   	$.ajax({
        url : home+"/answer/"+questionId+"?fullName="+fullName+"&answer="+answer,
        type: "GET",
        success : handleData,
        error: handleError
    });
}
function handleData(data, textStatus, xhr) {
	alert("success");
}
function handleError(xhr, textStatus, errorThrown) {
	alert(xhr.responseText);
}

function getQuestionAnswers(questionId){
    $.ajax({
        url : home+"/answer/"+questionId+"/all",
        type: "GET",
        success : gotQuestions,
        error: handleError
    });
}

function gotQuestions(data,textStatus,xhr){
   htmlText="<table class=\"table\"><thead><tr><th>Nume complet</th><th>Raspuns</th><th>Data</th></tr></thead>";
   htmlText+="<tbody>";
   data.forEach(function(obj) {
    htmlText+="<tr>";
    htmlText+="<td>"+obj.fullName+"</td>";
    htmlText+="<td>"+obj.answer+"</td>";
     htmlText+="<td>"+obj.createdDate+"</td>";
    htmlText+="</tr>";
   });
   htmlText+="</tbody></table>";
    $("#answers").html(htmlText);

}
