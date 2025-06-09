document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('loginForm');
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('password');
    const errorMessage = document.getElementById('errorMessage');

    loginForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const email = emailInput.value.trim();
        const password = passwordInput.value.trim();

        if (validateEmail(email) && password) {
            console.log('Login successful for:', email);
        } else {
            errorMessage.textContent = 'Por favor, insira um email válido e uma senha.';
        }
    });

    function validateEmail(email) {
        const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(String(email).toLowerCase());
    }
});