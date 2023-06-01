      import java.util.*;

        public class TriObjets {
            static class Objet {
                int c;
                int p;

                public Objet(int c, int p) {
                    this.c = c;
                    this.p = p;
                }

                public double rapport() {
                    return (double) c / p;
                }
            }

            public static void trierObjets(Objet[] objets) {
                Arrays.sort(objets, new Comparator<Objet>() {
                    public int compare(Objet o1, Objet o2) {
                        return Double.compare(o2.rapport(), o1.rapport());
                    }
                });
            }
        }
