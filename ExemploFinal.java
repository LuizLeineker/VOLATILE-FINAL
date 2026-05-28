public class ExemploFinal {

    public static void main(String[] args) {
       //FINAL, O valor dessa variável não pode ser alterado
        final String imutavel = "VALOR FIXO";

        //Exemplo: Senha de banco ou uma url fixa de api
        final String codigoBanco = "BANCO-001";
        final String API_URL = "https://api.site.com";

        // A variável pode ser UTILIZADA normalmente.
        System.out.println("SENHA BANCO: " + codigoBanco);

        // Concatenação de Strings
        // Se tentar concatenar a variável: 
        // codigoBanco = codigoBanco + "SENHA NOVA"
        
        // Vai gerar erro: 
        // Cannot assign a value to final variable

    }

}



