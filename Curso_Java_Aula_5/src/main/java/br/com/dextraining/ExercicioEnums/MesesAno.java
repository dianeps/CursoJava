package br.com.dextraining.ExercicioEnums;

public enum MesesAno {
	JANEIRO(31),
	FEVEREIRO(28),
	MARÇO(31),
	ABRIL(30),
	MAIO(31),
	JUNHO(30),
	JULHO(31),
	AGOSTO(31),
	SETEMBRO(30),
	OUTUBRO(31),
	NOVEMBRO(30),
	DEZEMBRO(31);
	
	//construtor
	private MesesAno (int quantidadeDias){
		this.quantidadeDias = quantidadeDias;
	}
	
	private int quantidadeDias;
	
	public boolean diaValido(int dia, int ano){
		if (dia <= 0){
			return false;
		}
		if(this == MesesAno.FEVEREIRO){
			//verificar ano bissexto
			
		}		
		return (dia <= quantidadeDias);
	}
}
