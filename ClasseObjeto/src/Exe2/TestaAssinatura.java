public class TestaAssinatura {

    public static void main(String[] args) {

        // 1º usuário
        Assinatura a1 = new Assinatura("Carlos", "Premium");

        a1.assistirFilme("Vingadores");

        System.out.println(a1.toString());

        // 2º usuário
        Assinatura a2 = new Assinatura("Ana", "Básico");

        a2.assistirFilme("Frozen");

        System.out.println(a2.toString());

        // Cancelando assinatura
        System.out.println("Cancelando assinatura de Carlos...");
        a1.cancelarAssinatura();

        // Tentando assistir após cancelamento
        a1.assistirFilme("Avatar");

        System.out.println(a1.toString());
    }
}