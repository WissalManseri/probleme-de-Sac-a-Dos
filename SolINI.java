
/*
Voici une fonction de recherche d'une solution initiale pour le problème d'optimisation associé à cette classe :*/


public static int[] solutionInitiale(Objet[] objets, int capacite) {
trierObjets(objets);
int[] solution = new int[objets.length];

for (int i = 0; i < objets.length; i++) {
    if (objets[i].p <= capacite) {
        solution[i] = 1;
        capacite -= objets[i].p;
    }
}

return solution;
                 
                 
                 
 /*Cette fonction trie d'abord les objets en ordre décroissant du rapport ci/pi, puis sélectionne autant d'objets que possible dans l'ordre trié, en vérifiant que chaque objet peut s'adapter dans le sac à dos. 
 Elle renvoie un tableau d'entiers où 1 indique que l'objet correspondant est dans le sac à dos et 0 indique qu'il ne l'est pas.
