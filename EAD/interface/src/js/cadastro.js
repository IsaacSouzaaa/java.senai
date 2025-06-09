document.getElementById('cep').addEventListener('blur', async function() {
    const cep = this.value.replace(/\D/g, '');
    const erroSpan = document.getElementById('cep-erro');
    if (cep.length !== 8) {
        erroSpan.style.display = 'inline';
        limparCampos();
        return;
    }
    try {
        const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
        const data = await response.json();
        if (data.erro) {
            erroSpan.style.display = 'inline';
            limparCampos();
        } else {
            erroSpan.style.display = 'none';
            document.getElementById('endereco').value = data.logradouro || '';
            document.getElementById('bairro').value = data.bairro || '';
            document.getElementById('cidade').value = data.localidade || '';
            document.getElementById('estado').value = data.uf || '';
        }
    } catch {
        erroSpan.style.display = 'inline';
        limparCampos();
    }
});

function limparCampos() {
    document.getElementById('endereco').value = '';
    document.getElementById('bairro').value = '';
    document.getElementById('cidade').value = '';
    document.getElementById('estado').value = '';
}