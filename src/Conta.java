public class Conta {
	String nome;
	int telefone;
	Animal paciente;
	String email;

	public boolean consulta(String resultado) {
		if(resultado == "marcar mais uma consulta") {
			System.out.println("ligar para o cliente " + this.nome + ", telefone: " + this.telefone);
			return false;
		} else {
				System.out.println("Está tudo ok!");
				return true;
			}
		}
	}

