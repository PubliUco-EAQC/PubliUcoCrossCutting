package co.edu.uco.publiuco.crosscutting.utils;

public final class UtilText {
	
	private static final UtilText INSTANCE = new UtilText();
	public static final String EMPTY = "";
	
	private UtilText() {
		super();
	}

	public static final UtilText getUtilText() {
		return INSTANCE;
	}
	
	public static boolean isNull(final String text) {
		return UtilObject.isNull(text);
	}
	
	public final static String getDefault(final String text, final String defaultValue) {
		/*String result = text;
		
		if (isNull(text)) {
			result = isNull(defaultValue)? EMPTY : defaultValue;
		}
		
		return result;*/
		
		return isEmpty(text)? getDefault(defaultValue): text;
	}
	
	public final static String getDefault(final String text) {
		return getDefault(text, EMPTY);
	}
	
	public final static boolean isEmpty(final String text) {
		return applyTrim(text).equals(EMPTY);
	}
	
	public final String getDefaultIsEmpty(final String text, final String defaultValue) {
		String result = text;
		
		if(isEmpty(text)) {
			result = getDefault(defaultValue);
		}
		
		return result;
	}
	
	public final static String getDefaultValue() {
		return EMPTY;
	}
	
	public final static String applyTrim(final String text) {
		return getDefault(text).trim();
	}
	
	public static final boolean matchPattern(final String text, final String pattern) {
		return getDefault(text).matches(getDefault(pattern));
	}
}