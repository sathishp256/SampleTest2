package video10;

public class BOX {

	double height,width,depth;
	
	BOX(){
		
		height=width=depth=1;
		
	}
	
	BOX(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	BOX(double len){
		height=width=depth=len;
	}
	
	double volume() {
		return height*width*depth;
	}

}
