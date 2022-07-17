import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        boolean rodando = true;
        while(rodando) {
            System.out.println("[1] Cadastrar aluno.");
            System.out.println("[2] Listar todos os alunos cadastrados.");
            System.out.println("[3] Procurar aluno por cpf.");
            System.out.println("[4] Atualizar dados de um aluno.");
            System.out.println("[5] Remover um aluno.");
            System.out.println("[0] Sair.");
            System.out.print("Digite uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao){
                case "1":{
                    System.out.println("======= CADASTRO DE ALUNO ========");
                    System.out.println("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite email: ");
                    String email = scanner.nextLine();
                    System.out.println("Digite o telefone");
                    String telefone = scanner.nextLine();
                    Aluno a = new Aluno();
                    a.setNome(nome);
                    a.setCpf(cpf);
                    a.setEmail(email);
                    a.setTelefone(telefone);
                    alunos.add(a);
                    break;
                }
                case "2":{
                    System.out.println("======= ALUNOS CADASTRADOS ========");
                    for (int i = 0;i< alunos.size();i++) {
                        Aluno uTemp = alunos.get(i);
                        System.out.println("Usuário "+i);
                        System.out.println("\tNome: " + alunos.get(i).getNome());
                        System.out.println("\tCpf: " + alunos.get(i).getCpf());
                        System.out.println("\tEmail:"+alunos.get(i).getEmail());
                        System.out.println("\tTelefone"+alunos.get(i).getTelefone());
                    }
                    break;
                }
                case "3":{
                    System.out.println("======= PROCURAR ALUNO POR CPF =======");
                    System.out.print("Digite o cpf: ");
                    String cpf = scanner.nextLine();

                    boolean encontrado = false;
                    for(int i=0;i<alunos.size();i++){
                        Aluno aTemp = alunos.get(i);
                        if((cpf.equals(aTemp.getCpf()))){
                            System.out.println("Aluno encontrado");
                            System.out.println("\tCpf: " + aTemp.getCpf());
                            System.out.println("\tAluno: " + aTemp.getNome());
                            System.out.println("\tEmail: "+ aTemp.getEmail());
                            System.out.println("\tTelefone: "+ aTemp.getTelefone());
                            break;
                        }
                    if(!encontrado) {
                        System.out.println("CPF não cadastrado.");
                    }
                    }
                    break;
                }
                case "4":{
                    System.out.println("===== ATUALIZAR DADOS CADASTRAIS ======");
                    for (int i = 0;i< alunos.size();i++){
                        Aluno aTemp = alunos.get(i);
                        System.out.println("["+ i +"]"+ aTemp.getNome());
                    }
                    System.out.println("Digite o número do aluno");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o novo email do aluno");
                    String novoEmail = scanner.nextLine();

                    Aluno a = alunos.get(referencia);
                    a.setEmail(novoEmail);

                    break;
                }

                case "5": {
                    System.out.println("===== REMOVER CADASTRO DE ALUNO ======");
                    for (int i = 0; i < alunos.size(); i++) {
                        Aluno aTemp = alunos.get(i);
                        System.out.println("[" + i + "]" + aTemp.getNome());
                    }
                    System.out.println("Digite o número do aluno");
                    int referencia = scanner.nextInt();
                    scanner.nextLine();

                    alunos.remove(referencia);
                    break;
                }

                case "0": {
                    rodando=false;
                    break;
                }
            }
        }
        System.out.println(alunos);

    }


}
