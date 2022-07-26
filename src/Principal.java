public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000),
        new Envio("Intermunicipal",15000),
        new Envio("Internacional",25000)
    };

    //Aqui modifique como se imprime el tiempo de envio, se puede modificar para que recorra
    //todo el array o solo el numero de veces que queramos
    for (int i = 0; i < envios.length; i++)
    {
      imprimirTiempoDeEnvio(envios);
    }
  }

  //Aqui lo privatizo por que no es llamado externamente
  private static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      //Aqui lo simplifique con un switch, le da la posiblidad de ser mas flexible para introducir nuevos
      switch (coche.tipo)
      {
        case "Municipal":
          System.out.println("Tiempo envio 12 horas");
          break;
        case "Intermunicipal":
          System.out.println("Tiempo envio 36 horas");
          break;
        case "Internacional":
          System.out.println("Tiempo envio 90 horas");
          break;
        default:
          System.out.println("No envio fue encontrado");
          break;
      }
      /*
      if(coche.tipo.equals("Municipal")) System.out.println("Tiempo envio 12 horas");
      if(coche.tipo.equals("Intermunicipal")) System.out.println("Tiempo envio 36 horas");
      if(coche.tipo.equals("Internacional")) System.out.println("Tiempo envio 90 horas");
       */
    }
  }
}
