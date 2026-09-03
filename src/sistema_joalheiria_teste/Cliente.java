public class Cliente {
    private String nome;
    private String whatsApp;

    public Cliente(String nome, String whatsApp) {
        setNome(nome);
        setWhatsApp(whatsApp);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Digite o nome de cliente!");
        }
        else {
            this.nome = nome;
        }
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    private void setWhatsApp(String whatsApp) {
        if (whatsApp == null || whatsApp.isBlank()) {
            throw new IllegalArgumentException("Digite seu número de WhatsApp!");
        }
        else {
            this.whatsApp =whatsApp;
        }
    }
}

