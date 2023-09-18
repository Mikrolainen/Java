public class H2 {
 
    public static void main(String[] args) {
 
    teisendamine(100.0f);
    ellips(5.4f,4.5f);
    tunnid(160.0f);
    kiirus(150,150,30,35);

    }  
    //arvutab tolli

    static void teisendamine (float toll){ 

    float meter = 0.0254f * toll;

    System.out.println(" ");
    System.out.println("Toll = "+meter+"m");
    System.out.println(" ");

    }   
    //arvutab ellipsi pindala

    static void ellips(float A, float B){ 

    float PI = 3.14f;
    float ellips = PI * A * B;

    System.out.println("Ellips S = "+ellips);
    System.out.println(" ");

    }  
    //arvutab minutid tunniks

    static void tunnid(float minutid){ 

    int tund = 60;
    float minut = minutid / tund;

    System.out.println("tunnid = "+minut);

    }
    //arvutab kiiruse
    
    static void kiirus(float esSportKM, float teSportKM, float esSportH, float teSportH){ 

    float eskiirus = esSportKM / esSportH;
    float tekiirus = teSportKM / teSportH;
    float vahe = tekiirus % eskiirus;

    System.out.println(" ");
    System.out.println("Esimese sportlase kiirus on "+eskiirus+" KM/H"); 
    System.out.println("Teise sportlase kiirus on "+tekiirus+" KM/H"); 
    System.out.println("Nende kiiruse vahe oli "+vahe+" KM/H"); 

    }
}