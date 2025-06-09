document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('loginForm');
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('password');
    const loginButton = document.getElementById('loginButton');

    loginButton.addEventListener('click', function(event) {
        event.preventDefault();
        const email = emailInput.value.trim();
        const password = passwordInput.value.trim();

        if (validateForm(email, password)) {
            // Handle login logic here (e.g., send data to server)
            console.log('Logging in with:', { email, password });
        }
    });

    function validateForm(email, password) {
        if (!email || !password) {
            alert('Please fill in all fields.');
            return false;
        }
        // Additional validation can be added here (e.g., email format)
        return true;
    }
});