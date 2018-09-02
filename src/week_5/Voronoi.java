package week_5;

import java.awt.Color;

public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        // ADD CODE HERE
    	int x1 = point1.getX();
    	int y1 = point1.getY();
    	int x2 = point2.getX();
    	int y2 = point2.getY();
    	int x = x2 - x1;
    	int y = y2 - y1;
    	
    	return Math.sqrt(x * x + y * y);
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        // ADD CODE HERE
    	int N = sites.length;
    	int minIndex = 0;
    	double minDist = pointDist(point, sites[0]);
    	
    	for (int i = 1; i < N; i++) {
    		double newDist = pointDist(point, sites[i]);
    		if (newDist < minDist) {
    			minDist = newDist;
    			minIndex = i;
    		}
    	}
    	
    	return minIndex;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        // ADD CODE HERE
    	int[][] indexMap = new int[width][height];
    	for (int i = 0; i < width; i++) {
    		for (int j = 0; j < height; j++) {
    			indexMap[i][j] = findClosestPoint(new Point2D(i, j), sites);
    		}
    	}
    	
    	return indexMap;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        // ADD CODE HERE
    	int width = indexMap.length;
    	int height = indexMap[0].length;

    	StdDraw.setCanvasSize(width, height);
    	StdDraw.setXscale(0, width);
    	StdDraw.setYscale(0, height);
    	
    	for (int i = 0; i < width; i++) {
    		for (int j = 0; j < height; j++) {
    			StdDraw.setPenColor(colors[indexMap[i][j]]);
    			StdDraw.point(i, j);
    		}
    	}
    	
    	StdDraw.setPenColor(Color.BLACK);
    	for (Point2D site : sites) {
    		StdDraw.filledCircle(site.getX(), site.getY(), 3);
    	}
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);

    }

}
