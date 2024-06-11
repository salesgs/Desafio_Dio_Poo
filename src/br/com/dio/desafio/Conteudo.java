package br.com.dio.desafio;

public abstract class Conteudo {

	protected final static double XP_PADRAO =10;
    
	private String titulo;
    private String descricao;
    
    public String getTitulo() {return titulo;}
    public String getDescricao() {return descricao;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    
    
    public abstract double calcularXp();
    
    
    
}
