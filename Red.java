class red extends Stainer{
	red(PaintShop ps){
		this.ps=ps;
	}
	public String base(){
		return ps.base()+" + Red";
	}
	public int cost(){
		return ps.cost()+300;
	}
}