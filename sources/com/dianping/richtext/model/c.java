package com.dianping.richtext.model;

import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.core.config.UIConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c extends a {
    @SerializedName(alternate = {UIConfig.BACKGROUND_COLOR}, value = "bgc")
    public String d;
    @SerializedName(alternate = {"fontname"}, value = "fn")
    public String e;
    @SerializedName(alternate = {"kerning"}, value = "ke")
    public Integer f;
    @SerializedName(alternate = {"strikethrough"}, value = "st")
    public Boolean g;
    @SerializedName(alternate = {"text"}, value = "te")
    public String h;
    @SerializedName(alternate = {"textcolor"}, value = Constants.Environment.KEY_TC)
    public String i;
    @SerializedName(alternate = {"textsize"}, value = "ts")
    public Integer j;
    @SerializedName(alternate = {"textstyle"}, value = "tst")
    public String k;
    @SerializedName(alternate = {DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE}, value = "ul")
    public Boolean l;

    public c() {
        this.a = 0;
    }
}
