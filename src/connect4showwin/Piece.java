package connect4showwin;
import java.awt.*;

public class Piece {
    private Color color;
    private int value;
    Piece(Color _color, int _value)
    {
        color = _color;
        value = _value;

    }
    public Color getColor()
    {
        return (color);
    }
    public int getValue()
    {
        return value;
    }
}
