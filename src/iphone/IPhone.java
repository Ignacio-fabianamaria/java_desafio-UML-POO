package iphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  // atributos
  private String modelo;
  private long numeroDeSerie;
  // constructor
  public IPhone(String modelo, long numeroDeSerie) {
    this.modelo = modelo;
    this.numeroDeSerie = numeroDeSerie;
  }
  //metodos
  public void exibirInformcoesTelefone() {
    System.out.println(
        "Modelo: " + modelo + " - " + "N° Série: " + numeroDeSerie);
  }
  @Override
  public void exibirPaginaWeb(String url) {
    System.out.println(
      modelo + " Exibindo página: " + url
      );
  }
  @Override
  public void adicionarNovaAbaWeb() {
    System.out.println(modelo + " - Adicionando nova aba web");;
  }
  @Override
  public void atualizarPaginaWeb() {
    System.out.println(modelo + " - Atualizando pagina web");;
  }
  @Override
  public void fazerLigacao(String telefone) {
    System.out.println(modelo + " - Fazendo ligação para o: " + telefone);;
  }
  @Override
  public void atenderLigacao() {
    System.out.println(modelo + " - Atendendo ligação");
  }
  @Override
  public void tocarMusica() {
    System.out.println(modelo + " - Tocando música");;
  }
  @Override
  public void pausarMusica() {
    System.out.println(modelo + " - Pausando música");;
  }
  public static void main(String[] args) {
    IPhone iPhone = new IPhone("IPhone X", 123004560789l);

    iPhone.exibirInformcoesTelefone();
    iPhone.exibirPaginaWeb("www.google.com");
    iPhone.adicionarNovaAbaWeb();
    iPhone.atualizarPaginaWeb();
    iPhone.fazerLigacao("(21) 98999-4455");
    iPhone.atenderLigacao();
    iPhone.tocarMusica();
    iPhone.pausarMusica();
  }
}
