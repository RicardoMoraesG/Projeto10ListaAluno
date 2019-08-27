
package modelo;

import java.util.ArrayList;


public class principal {

  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //INSTANCIAR 10 OBJETOS DA CLASS ALUNO USANDO O CONSTRUTOR CHEIO
        Aluno aluno01 = new Aluno(111, "Alberto", "(14)11111-1111");
        Aluno aluno02 = new Aluno(222, "Alberto", "(14)22222-2222");
        Aluno aluno03 = new Aluno(333, "Alberto", "(14)33333-3333");
        Aluno aluno04 = new Aluno(444, "Alberto", "(14)44444-4444");
        Aluno aluno05 = new Aluno(555, "Alberto", "(14)55555-5555");
        Aluno aluno06 = new Aluno(666, "Alberto", "(14)66666-6666");
        Aluno aluno07 = new Aluno(777, "Alberto", "(14)77777-7777");
        Aluno aluno08 = new Aluno(888, "Alberto", "(14)88888-8888");
        Aluno aluno09 = new Aluno(999, "Alberto", "(14)99999-9999");
        Aluno aluno10 = new Aluno(100, "Alberto", "(14)10101-0101");
     
    
        //OBJETO 'ListaAlunos' pertence à Classe ArrayList
        //instanciando uma lista vaziaque só receberá objetos da
        //classe Aluno
        //Classe TIPADA ArrayList<T>
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        //Adicionando 10 objetos da classe Aluno
        //na lista instanciada usando método add()
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
     
     
        //listaAluno.add(aluno11);//ERRO: 
        //não permite add um objeto que não esteja na ClasseAluno
        //pois é lista TIPADA.
      
        //instanciar 5 objetos da classe Aluno
        //e adicionar na listaAluno
        //usando um laço FOR
     
        /*for(int i=10;i>=14;i++){
         Aluno aluno[i] = new Aluno(aluno[i])
        }*/
          
        for(int j = 11;j <= 15; j++){
             Aluno objAluno = new Aluno(j, "aluno" +j, "9999-" +j+j);//CRIA UM NOVO OBJETO NA CLASSE ALUNO
             listaAluno.add(objAluno);//ADICIONA O OBJETO CRIADO NA LISTA
        }
     
         //Novos Objetos definidos fora do FOR
        //teremos a referencia a um unico objeto(GLOBAL)
        //nesse caso teremos de colocar o objeto dentro do for
        //Não posso declarar fora do laço
        Aluno objAluno1 = new Aluno();//esta linha teria que estar dentro do laço
        for(int j = 11;j <= 15; j++){
            objAluno1.setIdAluno(j);//aqui atribui o valor uma vez apenas e depois apenas repete
            objAluno1.setNome("novo-aluno"+j);
            objAluno1.setCelular("xxx-"+j+j);
            listaAluno.add(objAluno1);
        }
   
        //LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA USANDO O LAÇO FOR
        //Método size() retorna o tamando da lista
        //Metodo get(index) retorna o elemento da posicao INDEX
        for (int i = 0; i < listaAluno.size(); i++){
            System.out.println("Aluno "+
                    listaAluno.get(i).getIdAluno()+ "-" +
                    listaAluno.get(i).getNome());
         
        //******Nao devo declarar dentro do laço for*****
        Aluno objAluno = new Aluno();
        for( i = 0; i < listaAluno.size(); i++){
            objAluno = listaAluno.get(i);   
            //Aluno ID 999
            if (objAluno.getIdAluno() == 999){
                System.out.println("Encontrei o " +objAluno.getNome());
            }
            System.out.println("Aluno "+
                objAluno.getIdAluno()+ "-" +
                objAluno.getNome());
        }   

    }//Fim For
    
    }//Fim main()
}//Fim CLASSE.
    

