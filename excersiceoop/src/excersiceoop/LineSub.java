package excersiceoop;

public class LineSub extends Point {
	Point end;

	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new Point( endX, endY );	
	}
	
	public LineSub(Point begin, Point end ) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}

	@Override
	public String toString() {
		return "LineSub [end=" + end + ", x=" + x + ", y=" + y + "]";
	}

	public Point getEnd() {
		return end;
	}
	
	public Point getBegin() {
		return  ;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public void setBegin(Point begin) {
		super.begin=  ;
	}
	
	
	
}
