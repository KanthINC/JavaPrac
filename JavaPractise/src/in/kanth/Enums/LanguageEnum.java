package in.kanth.Enums;

public enum LanguageEnum {
	DEFAULT("DEFAULT", null, "en"), 
	EN_US("en-us", "English", "en"),
	MS_MY("ms-my", "Malay", "my"),
	ZH_CN("zh-cn", "implified Chinese", "zh"),
	ZH_CNT("zh-cnt", "Traditional Chinese","zh"),
	TH_THAI("zh", "Thai", "zh-tw"),
	KO_KR("ko-kr", "Korean", "kr");
	private String langid;
	private String desc;
	private String coloum;



	private LanguageEnum(String langid, String desc, String coloum) {
		this.langid = langid;
		this.desc = desc;
		this.coloum = coloum;
	}

	public String getLangid() {
		return langid;
	}

	public void setLangid(String langid) {
		this.langid = langid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getColoum() {
		return coloum;
	}

	public void setColoum(String coloum) {
		this.coloum = coloum;
	}

	public static LanguageEnum getLang(String langid) {
		try {
			String langVal = langid.replaceAll("-", "_").toUpperCase();
			System.out.println(langVal);
			LanguageEnum lang = LanguageEnum.valueOf(langVal);
			if (lang == null) {
				return DEFAULT;
			} else {
				return lang;
			}
		} catch (IllegalArgumentException ex) {
			return LanguageEnum.DEFAULT;
		}
	}
}
