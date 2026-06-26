alert("Welcome to Tech In 60Academy");

fetch("contact", {
	method: "POST",
	body: new
	FormData(document.getElementById("contactForm"))
})

.then(response => response.text())
.then(data => {
	alert("Your Request Has Been Sent Successfully!");
	document.getElementById("contactForm").reset();
})
.catch(error => {
	alert("Failed to Send Your Request. Please Try Again Later");
});