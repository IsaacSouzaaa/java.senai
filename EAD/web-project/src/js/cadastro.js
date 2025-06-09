document.addEventListener('DOMContentLoaded', function() {
    const cepInput = document.getElementById('cep');
    const addressInput = document.getElementById('address');
    const numberInput = document.getElementById('number');
    const neighborhoodInput = document.getElementById('neighborhood');
    const cityInput = document.getElementById('city');
    const stateInput = document.getElementById('state');
    const messageBox = document.getElementById('message');

    cepInput.addEventListener('blur', function() {
        const cep = cepInput.value.replace(/\D/g, '');

        if (cep.length === 8) {
            fetch(`https://viacep.com.br/ws/${cep}/json/`)
                .then(response => response.json())
                .then(data => {
                    if (!data.erro) {
                        addressInput.value = data.logradouro;
                        neighborhoodInput.value = data.bairro;
                        cityInput.value = data.localidade;
                        stateInput.value = data.uf;
                        messageBox.textContent = '';
                    } else {
                        messageBox.textContent = 'CEP não encontrado.';
                        clearAddressFields();
                    }
                })
                .catch(error => {
                    messageBox.textContent = 'Erro ao buscar CEP.';
                    clearAddressFields();
                });
        } else {
            messageBox.textContent = 'CEP inválido.';
            clearAddressFields();
        }
    });

    function clearAddressFields() {
        addressInput.value = '';
        neighborhoodInput.value = '';
        cityInput.value = '';
        stateInput.value = '';
    }
});