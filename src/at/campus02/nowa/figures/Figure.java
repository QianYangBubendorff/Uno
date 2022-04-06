package at.campus02.nowa.figures;

public abstract class Figure {
    protected char[][] symbol = new char[3][3];
    protected int faktor;


    protected Figure() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            for (int f = 0; f < faktor; f++) {
                for (int col = 0; col < 3; col++) {
                    for (int g = 0; g < faktor; g++) {
                        sb.append(symbol[col][row]);
                    }
                }
                sb.append('\n');
            }

        }
        return sb.toString();

    }
}
