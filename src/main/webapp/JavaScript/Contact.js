fetch("contact", {
	method: "POST",
	body: new
	FormData(document.getElementById("contactForm"))
})

.then(response => {
	if(response.ok){
		alert("Your Request Has Sent Succesfully!");
		
		document.getElementById("contactForm").reset();
		}else{
			alert("Failed To Send Your Request. Please Try Again Later");
		}
})
.catch(error => {
	console.error(error);
	alert("Server Error! Please Try Again Later");
});