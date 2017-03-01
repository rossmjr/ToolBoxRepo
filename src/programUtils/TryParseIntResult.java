package programUtils;

public class TryParseIntResult {

	public final boolean didParse;
	public final Integer result;
	
	public TryParseIntResult(boolean didParse, Integer result){
		this.didParse = didParse;
		this.result = result;
	}
}
