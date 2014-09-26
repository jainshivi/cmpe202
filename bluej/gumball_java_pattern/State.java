

public interface State {
 
	public void insertQuarter();
	void insertDime( ) ;
    void insertNickel( ) ;
	public void ejectQuarter();
	public void ejectNickel();
	public void ejectDime();
	public void turnCrank();
	public void dispense();
}
