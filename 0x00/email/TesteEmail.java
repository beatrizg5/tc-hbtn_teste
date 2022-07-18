public class TesteEmail {
    public static boolean testar_email_com_arroba() {
        return Pessoa.emailValid("email_teste@dominio.com.br");
    }

    public static boolean testar_email_sem_arroba() {
        if(Pessoa.emailValid("email_testedominio.com.br")){
            testar_email_com_arroba();
        }
        return true;
    }

    public static boolean testar_email_mais_50_caracteres() {
        if(Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br")) {
            testar_email_mais_50_caracteres();
        }
        return true;
    }
}
