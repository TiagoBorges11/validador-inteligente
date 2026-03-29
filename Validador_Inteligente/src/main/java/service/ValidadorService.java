/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tiago
 */
public class ValidadorService {
    
    String regex;
  
    
    
    public ValidadorService() {
        
       
        
    }
    
    public boolean validarNome(String nome){
       regex ="^[A-Za-zÀ-ÿ ]{2,}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(nome);
       return matcher.matches();   
    }
    
     public boolean validarEmail(String email){
         regex="^[\\w.-]+@[\\w.-]+\\.\\w+$";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(email);
         return matcher.matches();   
    }
     
      public boolean validarCpf(String cpf){
          regex="(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})";
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(cpf);
          return matcher.matches();   
    }
      
       public boolean validarTelefone(String telefone){
           regex=regex = "^(\\(\\d{2}\\)\\s?)?\\d{4,5}-?\\d{4}$";
           Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(telefone);
           return matcher.matches();   
    }
       
        public boolean validarSenha(String senha){
            regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{6,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(senha);
            return matcher.matches();
    }
        
        public boolean validarUsuario(Usuario usuario){
            List<String> erros= new ArrayList<>();
            
            if (!validarNome(usuario.getNome())){
                erros.add("Nome invalido");
            }
            if(!validarEmail(usuario.getEmail())){
                erros.add("Email invalido");
            }
            if(!validarCpf(usuario.getCpf())){
                erros.add("CPF invalido");
            }
            if(!validarTelefone(usuario.getTelefone())){
                erros.add("Telefone invalido");
            }
            if(!validarSenha(usuario.getSenha())){
                erros.add("Senha invalida");
            }
            if(erros.isEmpty()){
                System.out.println("Cadastro valido");
                return true;
            }else{
                System.out.println("Cadastro invalido");
                for(String erro: erros){
                    System.out.println("-"+erro);
                }
                return false;
            }
            
    
        }
    
    
}
