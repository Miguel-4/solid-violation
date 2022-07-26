public class Envio {

  String tipo;
  Integer precio;

  //Poniendo publica la funcion
  public Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  public String getTipoEnvio() {
    return this.tipo;
  }

  void crearTipoEnvio(Envio envio) {
    //Save Envio DB
  }
}