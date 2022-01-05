package br.com.douglaskelczeski.file_explorer.state;

public class DispositivoEjetado implements DispositivoState {

	@Override
	public DispositivoState selecionarDispositivo() {
		System.out.println("Dispositivo Desconectado não foi possivel selecionalo");
		return this;
	}

	@Override
	public DispositivoState formatarDispositivo() {
		System.out.println("Dispositivo Desconectado não foi possivel formatalo ");
		return this;
	}

	@Override
	public DispositivoState ejetarDispositivo() {
		System.out.println("Dispositivo ja   ejetado do sistema");
		return this;
	}

}
