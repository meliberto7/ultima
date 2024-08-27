
package global;


public class GlobalUser {
    
    private static int id_usuario;
    private static String nome;
    private static String email;
    private static String senha;
    private static String telefone;
    private static boolean very;

    public static boolean isVery() {
        return very;
    }

    public static void setVery(boolean very) {
        GlobalUser.very = very;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        GlobalUser.telefone = telefone;
    }
    
    public static int getId_usuario() {
        return id_usuario;
    }

    public static void setId_usuario(int id_usuario) {
        GlobalUser.id_usuario = id_usuario;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        GlobalUser.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        GlobalUser.email = email;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        GlobalUser.senha = senha;
    }
    
    
    
}
