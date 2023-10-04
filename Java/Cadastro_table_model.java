
package com.mycompany.cadastro_aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.mycompany.cadastro_aluno.Cadastro_aluno;

public class Cadastro_table_model extends AbstractTableModel {
    
    private List<Cadastro_aluno> dados = new ArrayList<>();
    private String[] colunas = {"Nome do aluno", "Data de nascimento", "Email", "Telefone", "Cpf", "Periodo", "Curso"};
    
    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getNomedoaluno();
            case 1:
                return dados.get(linha).getDatadenascimento();
            case 2:
                return dados.get(linha).getEmail();
            case 3:
                return dados.get(linha).getTelefone(); 
            case 4:
                return dados.get(linha).getCpf();
            case 5:
                return dados.get(linha).getPeriodo();
            case 6:
                return dados.get(linha).getCurso();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch (coluna)
        {
            case 0:
                dados.get(linha).setNomedoaluno((String) valor);
                break;
            case 1:
                dados.get(linha).setDatadenascimento((String) valor);
                break;
            case 2:
                dados.get(linha).setEmail((String) valor);
                break;
            case 3:
                dados.get(linha).setTelefone((String) valor);
                break;
            case 4:
                dados.get(linha).setCpf((String) valor);
                break;
            case 5:
                dados.get(linha).setPeriodo((String) valor);
                break;
            case 6:
                dados.get(linha).setCurso((String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);  
    }

    public void adicionaLinha(Cadastro_aluno p) {
        this.dados.add(p);
        this.fireTableDataChanged();
    }

    public void removeLinha(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public Cadastro_aluno getDados (int linha){
        return dados.get(linha);
    }   
}
