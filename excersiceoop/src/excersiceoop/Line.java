package excersiceoop;

public class Line {
	public Point begin;
	public Point end;
	
	public Line(Point begin, Point end) {
		
		this.begin = begin;
		this.end = end;
	}
	
	public Line(int beginx, int beginy, int endx, int endy) {
		begin= new Point(beginx, beginy);
		end = new Point(endx, endy);
	}
	
	@Override
	public String toString() {
		return "Line (begin=" + begin + ", end=" + end + ")";
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return begin.getX();
	}
	
	public int getBeginY() {
		return begin.getY();
	}
	
	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}
	
	public void setBeginX(int beginx) {
		begin.setX(beginx);
	}
	
	public void setBeginY(int beginy) {
		begin.setY(beginy);
	}
	
	public void setBeginXY(int beginx, int beginy) {
		begin.setXY(beginx, beginy);
	}
	
	public void setEndX(int endx){
		end.setX(endx);
	}
	
	public void setEndY(int endy) {
		end.setY(endy);
	}
	
	public void setEndXY(int endx, int endy) {
		end.setXY(endx, endy);
	}
	
	public double getLength() {
		return  Math.sqrt(this.getEndX()-this.getBeginX())*(this.getEndX()-this.getBeginX())+
				(this.getEndY()-this.getBeginY())*(this.getEndY()-this.getBeginY());
	}
	
	public double getGradient() {
		return Math.atan2((this.getEndY()-this.getBeginY()), this.getEndX()-this.getBeginX())*(this.getEndX())  ;
	}
}
