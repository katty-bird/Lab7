package Calc;


public class RunCalcEngine {
	public static void main(String[] args) {
		
//		CalcEngine calcEngine = new CalcEngine();
//		UserInterface userInterface = new UserInterface(calcEngine);

		CalcEngineHex calcEngineHex = new CalcEngineHex();
		UserInterfaceHex userInterfaceHex = new UserInterfaceHex(calcEngineHex);
		
		userInterfaceHex.setVisible(true);
	}
}
