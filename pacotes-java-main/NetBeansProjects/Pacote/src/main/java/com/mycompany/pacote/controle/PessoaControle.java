/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacote.controle;

import com.mycompany.pacote.DAO.PessoaDAO;
import com.mycompany.pacote.modelo.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class PessoaControle {
       private PessoaDAO dao = new PessoaDAO();
       
       public void cadastrar(String nome, int idade){
           Pessoa p = new Pessoa(nome, idade);
           dao.adicionar(p);
       }
       
       public ArrayList<Pessoa> listar() {
           return dao.listar();
       }
}
