document.getElementById("contactForm").addEventListener("submit", function (event) {
    event.preventDefault();

    let formData = new FormData(this);

    fetch("contact", {
        method: "POST",
        body: formData
    })
    .then((response) => {
        if (response.ok) {
            alert("✅ Your request has been sent successfully!");
            document.getElementById("contactForm").reset();
        } else {
            alert("❌ Failed to send your request. Please try again later.");
        }
    })
    .catch((error) => {
        console.error(error);
        alert("❌ Server error! Please try again later.");
    });
});