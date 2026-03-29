/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.List;
import model.Usuario;
import service.ValidadorService;

/*=[0121000
 *
 * @author Tiago
 */
public class Teste {
    public static void main(String[] args) {
        
        ValidadorService service = new ValidadorService();
        
 // 🔴 Usuário com dados inválidos
         System.out.println( " ____Usuário com dados inválidos____");
 
   
   
        Usuario usuarioInvalido = new Usuario(
            "Tiago123",
            "email.com",
            "123",
            "11999999999",
            "abc"
        );
        
        service.validarUsuario(usuarioInvalido);

        // 🟢 Usuário com dados válidos
         System.out.println( " ____Usuário com dados válidos____");
        Usuario usuarioValido = new Usuario(
            "Tiago Borges",
            "tiago@email.com",
            "123.456.789-00",
            "(11) 99999-9999",
            "Senha@123"
        );
      
        
        service.validarUsuario(usuarioValido);
        
        

        
    }
}
   
    
