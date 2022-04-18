//um ID, sexo, idade, gestante (s/n), lactante(s/n), necessidade especial(s/n). O atendimento do posto deve seguir uma ordem de prioridade, sendo:
// 0                    Normal
// 1                    acima de 60 anos
// 2                    Necessidades especiais
// 3                    Gestante / lactante

public class Pessoa {
    int prioridade;
    int id;
    int idade;
    boolean sexo;
    boolean gestante;
    boolean lactante;
    boolean neceEspecial;

    Pessoa(int id, int idade, boolean sexo, boolean gestante, boolean lactante, boolean neceEspecial) {
        this.id = id;
        this.idade = idade;
        this.sexo = sexo;
        this.gestante = gestante;
        this.lactante = lactante;
        this.neceEspecial = neceEspecial;
        prioridade = 0;

        if(gestante || lactante) {
            prioridade = 3;
        } 

        if(neceEspecial) {
            prioridade = 2;
        }

        if(idade > 60) {
            prioridade = 1;
        }
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\n-------------------------" + "\nPrioridade: " + this.prioridade +"\nID: " + this.id + "\nSexo: " + this.sexo + "\nIdade: " + this.idade + "\nGestante: " + this.gestante + "\nLactante: " + this.lactante + "\nNecessidade Especial: " + this.neceEspecial + "\n-------------------------";
    }
}
