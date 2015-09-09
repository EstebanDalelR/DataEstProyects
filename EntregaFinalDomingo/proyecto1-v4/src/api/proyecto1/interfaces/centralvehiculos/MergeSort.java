package api.proyecto1.interfaces.centralvehiculos;
public class MergeSort {
 

   public static void main(EventoVehiculo args[]){
     EventoVehiculo arrayEntrada[]= args[];
       mergeSort(arrayEntrada); //llamada al metodo mergeSort 
     }//fin del main
     
    public static void mergeSort( Iterable bitacora ){
        EventoVehiculo tmpArray[] = new int[ a.size() ];

        mergeSort( a, tmpArray, 0, a.length - 1 );
    }
    private static void mergeSort( EventoVehiculo a[ ], EventoVehiculo tmpArray[],int left, int right ){
        if( left < right )
        {
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }

    private static void merge( EventoVehiculo a[ ],EventoVehiculo tmpArray[],int leftPos, int rightPos, int rightEnd){
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd ){
            if( a[ leftPos ].compareTo( a[ rightPos ] ) <0){
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            }
            else{
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];
            }
        }
        while( leftPos <= leftEnd ){    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];
        }
        while( rightPos <= rightEnd ){  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];
        }
        // Copy TmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- ){
            a[ rightEnd ] = tmpArray[ rightEnd ];
        }
    }
}