
package endidades;

import interfaces.IAviao;

/**
 *
 * @author renan.paiva
 */
public class Aviao implements IAviao {
  private String prefixo;
  private String modelo;
  private String fabricante;
  private int assentos;
  private int assentosOcupados;
  public Aviao( String prefixo, String modelo, String fabricante, int assentos, int assentosOcupados ) {
    this.prefixo = prefixo;
    this.modelo = modelo;
    this.fabricante = fabricante;
    this.assentos = assentos;
    this.assentosOcupados = assentosOcupados;
  }

  public String getPrefixo() {
    return this.prefixo;
  }
}