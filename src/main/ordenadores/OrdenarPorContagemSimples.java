package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
         if (array == null || array.length <=1)
         {
            return array; 
        }

        int m = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > m) 
            {
                m = array[i];
            }
        }
        int[] contagem = new int[m + 1];

        for (int i = 0; i < array.length; i++) {
            contagem[array[i]]++;
        }
        int[] arrayOrdenado = new int[array.length];
        int indiceArrayOrdenado = 0;

        for (int i = 0; i < contagem.length; i++) {
            while (contagem[i] > 0) {
                arrayOrdenado[indiceArrayOrdenado] = i;
                indiceArrayOrdenado++;
                contagem[i]--;
            }
        }
        return arrayOrdenado;
    }
}