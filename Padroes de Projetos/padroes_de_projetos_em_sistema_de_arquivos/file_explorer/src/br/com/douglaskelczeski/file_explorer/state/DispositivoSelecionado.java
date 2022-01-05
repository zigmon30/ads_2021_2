package br.com.douglaskelczeski.file_explorer.state;

//import br.com.douglaskelczeski.file_explorer.entidades.Dispositivo;

public class DispositivoSelecionado implements DispositivoState {

	@Override
	public DispositivoState selecionarDispositivo() {
		System.out.println("Dispositivo  selecionado:");
		return this;
	}

	@Override
	public DispositivoState formatarDispositivo() {
		System.out.println("Dispositivo formatado" );
		return new DispositivoFormatar();
	}

	@Override
	public DispositivoState ejetarDispositivo() {
		System.out.println("Dispositivo Ejetado");
		return new DispositivoEjetado();
	}

}
