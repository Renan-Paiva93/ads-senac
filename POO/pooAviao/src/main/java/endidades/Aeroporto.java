
package endidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renan.paiva
 */
public class Aeroporto {
  private String codigo;
  private String nome;
  private boolean internacional;
  private List< Aeroporto > destinos;
  private List< Aeroporto > origens;
  private List< Aviao > aviaoes;
  public Aeroporto( String codigo, String nome ) {
    this.codigo = codigo;
    this.nome = nome;
    this.internacional = false;
    this.destinos = new ArrayList< Aeroporto >();
    this.origens = new ArrayList< Aeroporto >();
    this.aviaoes = new ArrayList< Aviao >();
  }

  public void setInternacional( boolean internacional ) {
    this.internacional = internacional;
  }

  public String getCodigo () {
    return this.codigo;
  }

  public boolean getInternacional() {
    return this.internacional;
  }

  public boolean equals ( Aeroporto aeroporto ) {
    return this.codigo == aeroporto.getCodigo();
  }

  public boolean aviaoPatio ( Aviao _aviao ) {
    for ( Aviao aviao : this.aviaoes ) {
      if ( aviao.getPrefixo() == _aviao.getPrefixo() ) {
        return true;
      }
    }
    return false;
  }

  public boolean possuiRota ( Aeroporto aeroporto ) {
    String _codigo = aeroporto.getCodigo();

    for ( Aeroporto destino : this.destinos ) {
      if ( destino.codigo == _codigo ) {
        return true;
      }
    }
    return false;
  }
}
