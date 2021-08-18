class green extends Stainer{
	green(PaintShop ps){
		this.ps=ps;
	}
	public String base(){
		return ps.base()+" + Green";
	}
	public int cost(){
		return ps.cost()+275;
	}
	}