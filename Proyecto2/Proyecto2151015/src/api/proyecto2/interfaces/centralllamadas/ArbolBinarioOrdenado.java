package.api;

import estructuras.cola.ILista;
public class ArbolBinarioOrdenado <Key extends Comparable<Key>, Value>
{
 // raiz 
 private Nodo raiz; 
 //crear clase nodo             
    private class Nodo
    {
        private Key key;           
        private Value val;         
        private Nodo right;  
        private Nodo left;
        private int N;            

        public Nodo(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }
 //------------------------------------
    //Constructors
    //------------------------------------
    //un construtor para una estructura vacía 

    public ArbolBinarioOrdenado()
    {
    }

    public boolean estaVacio()
    {
        return size() == 0;
    }

    public int size() {
        return size(raiz);
    }

    private int size(Nodo aBuscar) {
        if (aBuscar == null)
        {
         return 0;
        }
        else
        {
         return aBuscar.N;
     }
    }

    public boolean contieneLlave(Key key) {
        return get(key) != null;
    }

    public Value get(Key key) {
        return get(raiz, key);
    }

    private Value get(Nodo x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else              return x.val;
    }

    public void put(Key key, Value val) {
        if (val == null) {
            delete(key);
            return;
        }
        raiz = put(raiz, key, val);
        assert check();
    }

    private Nodo put(Nodo x, Key key, Value val) {
        if (x == null) return new Nodo(key, val, 1);
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left  = put(x.left,  key, val);
        else if (cmp > 0) x.right = put(x.right, key, val);
        else              x.val   = val;
        x.N = 1 + size(x.left) + size(x.right);
        return x;
    }


    public void deleteMin() {
        if (estaVacio()) throw new NoSuchElementException("Symbol table underflow");
        raiz = deleteMin(raiz);
        assert check();
    }

    private Nodo deleteMin(Nodo x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void deleteMax() {
        if (estaVacio()) throw new NoSuchElementException("Symbol table underflow");
        raiz = deleteMax(raiz);
        assert check();
    }

    private Nodo deleteMax(Nodo x) {
        if (x.right == null) return x.left;
        x.right = deleteMax(x.right);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

   
    public void delete(Key key) {
        raiz = delete(raiz, key);
        assert check();
    }

    private Nodo delete(Nodo x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) x.left  = delete(x.left,  key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else { 
            if (x.right == null) return x.left;
            if (x.left  == null) return x.right;
            Nodo t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        } 
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    } 


    public Key min() {
        if (estaVacio()) throw new NoSuchElementException("called min() with empty symbol table");
        return min(raiz).key;
    } 

    private Nodo min(Nodo x) { 
        if (x.left == null) return x; 
        else                return min(x.left); 
    } 


    public Key max() {
        if (estaVacio()) throw new NoSuchElementException("called max() with empty symbol table");
        return max(raiz).key;
    } 

    private Nodo max(Nodo x) {
        if (x.right == null) return x; 
        else                 return max(x.right); 
    } 

    public Key floor(Key key) {
        if (estaVacio()) throw new NoSuchElementException("called floor() with empty symbol table");
        Nodo x = floor(raiz, key);
        if (x == null) return null;
        else return x.key;
    } 

    private Nodo floor(Nodo x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp <  0) return floor(x.left, key);
        Nodo t = floor(x.right, key); 
        if (t != null) return t;
        else return x; 
    } 

    public Key ceiling(Key key) {
        if (estaVacio()) throw new NoSuchElementException("called ceiling() with empty symbol table");
        Nodo x = ceiling(raiz, key);
        if (x == null) return null;
        else return x.key;
    }

    private Nodo ceiling(Nodo x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) { 
            Nodo t = ceiling(x.left, key); 
            if (t != null) return t;
            else return x; 
        } 
        return ceiling(x.right, key); 
    } 

    public Key select(int k) {
        if (k < 0 || k >= size()) throw new IllegalArgumentException();
        Nodo x = select(raiz, k);
        return x.key;
    }

    private Nodo select(Nodo x, int k) {
        if (x == null) return null; 
        int t = size(x.left); 
        if      (t > k) return select(x.left,  k); 
        else if (t < k) return select(x.right, k-t-1); 
        else            return x; 
    } 

    public int rank(Key key) {
        return rank(key, raiz);
    } 

    private int rank(Key key, Nodo x) {
        if (x == null) return 0; 
        int cmp = key.compareTo(x.key); 
        if      (cmp < 0) return rank(key, x.left); 
        else if (cmp > 0) return 1 + size(x.left) + rank(key, x.right); 
        else              return size(x.left); 
    } 

    public Iterable<Key> keys() {
        return keys(min(), max());
    }

    public Iterable<Key> keys(Key lo, Key hi) {
        Queue<Key> queue = new Queue<Key>();
        keys(raiz, queue, lo, hi);
        return queue;
    } 

    private void keys(Nodo x, Queue<Key> queue, Key lo, Key hi) { 
        if (x == null) return; 
        int cmplo = lo.compareTo(x.key); 
        int cmphi = hi.compareTo(x.key); 
        if (cmplo < 0) keys(x.left, queue, lo, hi); 
        if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key); 
        if (cmphi > 0) keys(x.right, queue, lo, hi); 
    } 


    public int size(Key lo, Key hi) {
        if (lo.compareTo(hi) > 0) return 0;
        if (contieneLlave(hi)) return rank(hi) - rank(lo) + 1;
        else              return rank(hi) - rank(lo);
    }

    public int height() {
        return height(raiz);
    }
    private int height(Nodo x) {
        if (x == null) return -1;
        return 1 + Math.max(height(x.left), height(x.right));
    }


    public Iterable<Key> levelOrder() {
        Queue<Key> keys = new Queue<Key>();
        Queue<Nodo> queue = new Queue<Nodo>();
        queue.enqueue(raiz);
        while (!queue.estaVacio()) {
            Nodo x = queue.dequeue();
            if (x == null) continue;
            keys.enqueue(x.key);
            queue.enqueue(x.left);
            queue.enqueue(x.right);
        }
        return keys;
    }



}