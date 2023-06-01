                public static List<int[]> separer(int[] solutionPartielle) {
List<int[]> sousProblemes = new ArrayList<int[]>();

int indice = 0;
while (indice < solutionPartielle.length && solutionPartielle[indice] != 0) {
    indice++;
}

if (indice < solutionPartielle.length) {
    int[] sousProbleme1 = Arrays.copyOf(solutionPartielle, solutionPartielle.length);
    sousProbleme1[indice] = 1;
    sousProblemes.add(sousProbleme1);

    int[] sousProbleme2 = Arrays.copyOf(solutionPartielle, solutionPartielle.length);
    sousProbleme2[indice] = 0;
    sousProblemes.add(sousProbleme2);
}

return sousProblemes;
