
public class TestaVeterinario {
	public static void main(String[] args) {
		Animal adao = new Animal();
		adao.idade = "1 ano";
		adao.nome = "Claudio Adão";
		adao.raca = "pug";
		
		Caixa caixaVeterinario = new Caixa();
		Conta contaDoVitor  = new Conta();
		contaDoVitor.nome = "Vitor Bruno";
		
		contaDoVitor.paciente = adao;
		
		contaDoVitor.email = "vitor@gmail.com";
		contaDoVitor.telefone = 993399051;
		
		boolean resultadoDaConsulta = contaDoVitor.consulta("marcar mais uma consulta");
		if(resultadoDaConsulta) {
			caixaVeterinario.quantidadeAtendimentos += 1;
		    caixaVeterinario.dinheiroArrecadado += 200;
		} else {
			caixaVeterinario.quantidadeAtendimentos += 1;
			caixaVeterinario.dinheiroArrecadado += 400;
		}
		System.out.println(adao);
		
	}
}
