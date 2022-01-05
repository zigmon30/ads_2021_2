package br.com.douglaskelczeski.file_explorer.state;

public class DispositivoFormatar implements DispositivoState {

	@Override
	public DispositivoState selecionarDispositivo() {
		System.out.println("Dispositivo selecionado:" );
		return new DispositivoSelecionado();
	}

	@Override
	public DispositivoState formatarDispositivo() {
		System.out.println("Dispositivo formatado" );
		return this;
	}

	@Override
	public DispositivoState ejetarDispositivo() {
		System.out.println("Dispositivo Ejetado");
		return new DispositivoEjetado();
	}

}
