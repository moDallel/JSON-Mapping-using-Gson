module testAptitude {
	requires com.google.gson;
	exports json;
	exports jsonConverter;
	opens json;
	opens jsonConverter;
}