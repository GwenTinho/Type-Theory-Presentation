class Pairing {
          boolean b;
          int i;

          Pairing(int i, boolean b) {
            this.b = b;
            this.i=i;
          }

          boolean first() { return b; }
          int second() { return i; }
        }
