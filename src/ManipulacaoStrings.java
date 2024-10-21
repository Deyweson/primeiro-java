public class ManipulacaoStrings {
    public static void main(String[] args) {

        // valueOf
        // Converte um valor para String
        double num1 = 13.5;
        String num1Convertido = String.valueOf(num1);


        // charAt
        // Retorna o char na posição passada
        System.out.println(num1Convertido.charAt(1));


        // Verifica se a string começa ou termina
        // com o valor passado
        // startWith e endWith são case sensitive
        String name = "Deyweson";
        // startWith
        boolean comecaComA = name.startsWith("A");
        boolean comecaComANoIndice = name.startsWith("A", 1);
        // endWith
        boolean terminaComA = name.endsWith("A");

        // Verificar tamanho da string
        System.out.println(name.length());

        // Remover os espaços no começo e final da string
        System.out.println(name.trim());

        // Deixa toda a string em minusculo
        System.out.println(name.toLowerCase());
        // Deixa toda a string em maiusculo
        System.out.println(name.toUpperCase());

        // IndexOf
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a', 3));

        // lastIndexOf
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('a', 3));

        // replace
        System.out.println(name.replace('a', 'b'));

        //subString
        System.out.println(name.substring(1, 2));



    }
}
