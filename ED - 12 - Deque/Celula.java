public class Celula {
    Celula proxima; //aponta para a próxima celula
    Celula anterior; //aponta para a célula anterior
    Pessoa elemento; // Objeto armazenado(informação)

    //dois métodos construtores.
    Celula(Celula proxima, Pessoa elemento) {
        this.proxima = proxima;
        this.anterior = null;
        this.elemento = elemento;

    }

    Celula(Pessoa elemento) {
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;

    }

    //Definir qual é a próxima célula;

    void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
    // Define qual é a célula anterior

    void setAnterior(Celula anterior) {
        this.anterior = anterior;

    }

    //Pegar a próxima célula

    Celula getProxima() {
        return this.proxima;
    }
    //pega a célula anterior
    Celula getAnterior() {
        return this.anterior;
    }
    // recupera a informação dentro da célula
    Object getElemento() {
        return this.elemento;
    }




}