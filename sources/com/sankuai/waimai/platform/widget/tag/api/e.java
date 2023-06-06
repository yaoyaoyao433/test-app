package com.sankuai.waimai.platform.widget.tag.api;

import android.support.v4.provider.FontsContractCompat;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.entity.DataConstants;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a implements Serializable {
    @SerializedName("type")
    public int a;
    @SerializedName(DataConstants.CATEGORY_ID)
    public long b;
    @SerializedName("left_space")
    public String c;
    @SerializedName("right_space")
    public String d;
    @SerializedName("url")
    public String e;
    @SerializedName("width")
    public String f;
    @SerializedName("height")
    public String g;
    @SerializedName("text")
    public String h;
    @SerializedName("voice_text")
    public String i;
    @SerializedName("text_color")
    public String j;
    @SerializedName("font_size")
    public String k;
    @SerializedName(FontsContractCompat.Columns.WEIGHT)
    public String l;
    @SerializedName("horizontal_padding")
    public String m;
    @SerializedName("view_expose_info")
    public Map<String, String> n;
    @SerializedName("click_expose_info")
    public Map<String, String> o;
    @SerializedName("line_numbers")
    public String p;
    @SerializedName("line_space")
    public String q;
    @SerializedName("vertical_padding")
    public String r;
}
