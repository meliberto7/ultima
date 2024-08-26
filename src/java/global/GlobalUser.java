
package global;


public class GlobalUser {
    
    private static int id_usuario;
    private static String nome;
    private static String email;
    private static String senha;

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
