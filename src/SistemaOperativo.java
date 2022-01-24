
public abstract class SistemaOperativo {

	public final void crossCompiler(){
		compileIOS();
		compileAndroid();
	}
	
	public abstract void compileIOS();
	public abstract void compileAndroid();
	
}
