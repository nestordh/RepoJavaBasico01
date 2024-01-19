package otrosEjemplos;

/*
Con selecciono una seccion de parrafo letra o cadena y con ctrol+r reemplazao con lo que quiero
 */

import java.util.Scanner;

public class cuento {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del personaje principal : ");
        String nombrePersonaje = teclado.nextLine();

        System.out.println("Ingrese el nombre del lugar donde se desarrolla la historia: ");
        String lugar = teclado.nextLine();

        //String nombrePersonaje = "Jose";
        //String lugar = "Avellaneda ";

        String cuento= "\n" + "Había una vez en un pequeño pueblo llamado "+ lugar + " rodeado de bosques y montañas, un niño llamado "+ nombrePersonaje +"." + "\n" +
                ""+ nombrePersonaje +" era un soñador empedernido, siempre perdido en su mundo de imaginación. Un día, mientras exploraba el bosque cercano, descubrió una " +
                "antigua puerta de madera tallada que parecía llevar a algún lugar misterioso.\n" +
                "Intrigado, "+ nombrePersonaje +" decidió abrirla y se encontró en un mundo mágico lleno de colores brillantes y criaturas encantadoras. Este lugar, " +
                "conocido como Fantasia, estaba habitado por seres mágicos y seres mitológicos. " + "\n" +
                "Uno de ellos, un hada llamada Aurora, se acercó a "+ nombrePersonaje +" y le explicó que Fantasia estaba en peligro. La fuente de la magia quesostenía el" +
                " mundo estaba perdiendo su brillo, y necesitaban la ayuda de "+ nombrePersonaje +" para restaurarla.\n" +
                ""+ nombrePersonaje +", emocionado por la aventura que se avecinaba, aceptó el desafío. Acompañado por Aurora, se embarcaron en un viaje a través de bosques " +
                "encantados, ríos de luz y montañas mágicas. A lo largo de su viaje, " + "\n" +
                "conocieron a seres extraordinarios que les brindaron valiosas lecciones sobre amistad, valentía y esperanza.\n" +
                "Finalmente, llegaron al corazón de Fantasia, donde se encontraba la fuente de la magia. "+ nombrePersonaje +" descubrió que la fuente estaba perdiendo su brillo" +
                " porque la gente del mundo real había dejado de creer en la magia. Con su corazón lleno de determinación, "+ nombrePersonaje +" compartió historias de su vida " +
                "cotidiana, de sus sueños y de la maravilla que veía en el mundo.\n" +
                "\n" +
                "A medida que "+ nombrePersonaje +" compartía sus experiencias, la fuente comenzó a brillar con intensidad renovada. La magia se extendió por todo Fantasia, " +
                "devolviendo la vida y la alegría al mundo. Agradecidos, los habitantes de Fantasia celebraron junto a "+ nombrePersonaje +" y Aurora, quienes regresaron al pueblo " +
                "con el corazón lleno de gratitud y recuerdos inolvidables.\n" +
                "\n" +
                "Desde aquel día, "+ nombrePersonaje +" siguió siendo un soñador, pero ahora entendía la importancia de compartir la magia de la vida con los demás. La puerta " +
                "mágica se cerró, pero su espíritu aventurero y las lecciones aprendidas en Fantasia lo acompañaron para siempre. Y así, en el pequeño pueblo rodeado " +
                "de bosques y montañas, la magia perduró gracias al corazón de un niño que creía en los sueños.";

        System.out.printf(cuento);
    }
}
