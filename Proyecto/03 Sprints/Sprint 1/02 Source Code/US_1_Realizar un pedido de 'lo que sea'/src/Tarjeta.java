

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matia
 */
public class Tarjeta {
  public  final int INVALIDO          = -1;  
  public  final int VISA             = 0;
  public  final int MASTERCARD       = 1;
  public  final int AMERICAN_EXPRESS = 2;

    public Tarjeta() {
    }

  private  final String [] cardNames = 
      {   "Visa" , 
          "Mastercard", 
          "American Express", 

      };
        
  /**
   * Valida un numero de tarjeta de credito
     * @param number, numero de tarjeta
     * @return valido o no valido
     * @throws java.lang.Exception
   */
  public  boolean validarTarjeta(String number)
    throws Exception {   
    int CardID;
    if ( (CardID = getCardID(number)) != -1)
        return numeroValido(number);
    return false;
    }
    
  /**
   * Obtiene el tipo de tarjeta y lo retorn

   *      INVALIDO          = -1;  
   *      VISA             = 0;
   *      MASTERCARD       = 1;
   *      AMERICAN_EXPRESS = 2;
   *      EN_ROUTE         = 3;
   *      DINERS_CLUB      = 4;
     * @param number, numero de tarjeta de credito
     * @return tipo de tarjeta
   */
  public  int getCardID(String number) {
    int valid = INVALIDO;
        
    String digit1 = number.substring(0,1);
    String digit2 = number.substring(0,2);
    String digit3 = number.substring(0,3);
    String digit4 = number.substring(0,4);
    
    if (isNumber(number)) {
      /* ----
      ** VISA  prefix=4
      ** ----  length=13 or 16  (can be 15 too!?! maybe)
      */
      if (digit1.equals("4"))  {  
        if (number.length() == 13 || number.length() == 16) 
           valid = VISA;
        }
      /* ----------
      ** MASTERCARD  prefix= 51 ... 55
      ** ----------  length= 16
      */
      else if (digit2.compareTo("51")>=0 && digit2.compareTo("55")<=0) {
        if (number.length() == 16) 
           valid = MASTERCARD;
        }
      /* ----
      ** AMEX  prefix=34 or 37
      ** ----  length=15
      */
      else if (digit2.equals("34") || digit2.equals("37")) {
        if (number.length() == 15) 
           valid = AMERICAN_EXPRESS;
        }
      }           
      return valid;
      
    }
    /**
     * Verifica que el numero ingresado, en efecto es un numero
     * @param n
     * @return 
     */
  public  boolean isNumber(String n) {
    try  {
      double d = Double.valueOf(n).doubleValue();
      return true;
      }
    catch (NumberFormatException e) {
      e.printStackTrace();
      return false;
      }
    }

/**
 * Recibe como parametro un entero ID para buscar un nombre de tarjeta en el arreglo de tarjetas
 * @param id numero ID de un tipo de tarjeta
 * @return Nombre de la tarjeta
 */
  public  String getCardName(int id) {
    return (id > -1 && id < cardNames.length ? cardNames[id] : "");
    }
  
/**
   * Usando el algoritmo de Luhn, verifica un numero de tarjeta de credito
   * @param n numero de tarjeta de credito
   * @return true si es valida, false si no
   */
  public  boolean numeroValido(String n) {
    try {

      int j = n.length();
  
      String [] s1 = new String[j];
      for (int i=0; i < n.length(); i++) s1[i] = "" + n.charAt(i);
  
      int checksum = 0;         
    
      for (int i=s1.length-1; i >= 0; i-= 2) {
        int k = 0;
        
        if (i > 0) {
           k = Integer.valueOf(s1[i-1]).intValue() * 2;
           if (k > 9) {
              String s = "" + k;
              k = Integer.valueOf(s.substring(0,1)).intValue() + 
                  Integer.valueOf(s.substring(1)).intValue();
              }
              checksum += Integer.valueOf(s1[i]).intValue() + k;            
           }
           else
              checksum += Integer.valueOf(s1[0]).intValue();            
        }
      return ((checksum % 10) == 0);
      }
    catch (Exception e) {
      e.printStackTrace();
      return false;
      }
    }



}
