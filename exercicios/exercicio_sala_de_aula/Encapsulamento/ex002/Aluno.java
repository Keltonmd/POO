public class Aluno {
    private String nome, situacao; // Atributos privados para o nome do aluno e sua situação (aprovado ou reprovado)
    private int matricula; // Atributo privado para a matrícula do aluno
    private Double media; // Atributo privado para a média do aluno

    // Construtor da classe Aluno que recebe o nome, matrícula e média como parâmetros
    public Aluno(String nome, int matricula, Double media){
        this.nome = nome; // Inicializa o nome do aluno
        this.matricula = matricula; // Inicializa a matrícula do aluno
        this.media = media; // Inicializa a média do aluno
        verificaSituacao(); // Chama o método para verificar a situação do aluno com base na média
    }

    // Método privado para verificar a situação do aluno com base na média
    private void verificaSituacao(){
        if(media >= 6.0)
            situacao = "Aprovado"; // Define a situação como "Aprovado" se a média for maior ou igual a 6.0
        else
            situacao = "Reprovado"; // Define a situação como "Reprovado" se a média for menor que 6.0
    }

    // Método para obter o resultado final do aluno (nome, matrícula, média e situação)
    public String resultadoFinal(){
        return "Nome: "+nome+"\nMatrícula: "+matricula+"\nMédia: "+media+"\nSituação: "+situacao;
    }

    // Métodos getter e setter para acessar e modificar o nome do aluno
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    // Métodos getter e setter para acessar e modificar a média do aluno
    public void setMedia(Double media){
        this.media = media;
        verificaSituacao(); // Chama o método para verificar a situação do aluno sempre que a média for modificada
    }
    public Double getMedia(){
        return media;
    }

    // Métodos getter e setter para acessar e modificar a matrícula do aluno
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }
}
