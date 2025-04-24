/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacote.DAO;
import java.util.ArrayList;
import com.mycompany.pacote.modelo.Pessoa;
/**
 *
 * @author aluno.den
 */
public class PessoaDAO {
    
    private ArrayList<Pessoa> lista = new ArrayList<>();
        
        public void adicionar(Pessoa pessoa) {
            lista.add(pessoa);
        }
        
        public ArrayList<Pessoa> listar () {
            return lista;
        }
        
}
