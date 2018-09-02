package week_6;

import java.awt.Color;

public class ImageEditor2 {
	
	public static Picture threshold(Picture p, int thresh) {
        Picture result = new Picture(p.width(), p.height());
        for (int i = 0; i < p.width(); i++) {
            for (int j = 0; j < p.height(); j++) {
                Color pixel = p.get(i, j);
                int grey = (int) Math.round(ImageEditor1.luminance(pixel));
                if (grey < thresh) {
                    result.set(i, j, Color.BLACK);
                }
                else {
                    result.set(i, j, ImageEditor1.toGrey(pixel));
                }
            }
        }
        return result;
    }
	public static void main(String[] args) {
		Picture p = new Picture("lion2.jpg"); // or use any other colour image
		Picture greyscale = ImageEditor1.makeGreyscale(p);
		greyscale.show();
		
		Picture t = threshold(p, 120);
		t.show();
	}
}
