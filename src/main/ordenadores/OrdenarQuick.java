package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int p = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++){
            if(array[j]< p){
                i++;
                int tem = array[i];
                array[i] = array[i];
                array[j] = tem;
            }
        }
        return i;
    }
}
