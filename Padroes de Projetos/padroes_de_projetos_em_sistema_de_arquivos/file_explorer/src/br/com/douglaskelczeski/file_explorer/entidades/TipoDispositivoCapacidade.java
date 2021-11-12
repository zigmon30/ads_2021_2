package br.com.douglaskelczeski.file_explorer.entidades;


public enum TipoDispositivoCapacidade {
	
	Capacidade1 {
		@Override
		public TamanhoArmazenamento obterCapacidade() {
			// TODO Auto-generated method stub
			return new Capacidade1();
		}
	},
	Capacidade2 {
		@Override
		public TamanhoArmazenamento obterCapacidade() {
			// TODO Auto-generated method stub
			return new Capacidade2();
		}
	},
	Capacidade3 {
		@Override
		public TamanhoArmazenamento obterCapacidade() {
			// TODO Auto-generated method stub
			return new Capacidade3();
		}
	};
	
	public abstract TamanhoArmazenamento obterCapacidade();

}
