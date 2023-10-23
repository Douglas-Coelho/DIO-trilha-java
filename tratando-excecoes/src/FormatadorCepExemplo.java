public class FormatadorCepExemplo {
    
    public static void main(String[] args){
    String CepFormatado;
    try {
        CepFormatado = formatarCep("237650");
        System.out.println(CepFormatado);
    } catch (CepInvalidoException e) {
        // TODO Auto-generated catch block
        System.out.println("O Cep não corresponde com as regras de negócio.");
    }
    

}
static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
