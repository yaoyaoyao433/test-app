package com.sankuai.waimai.platform.widget.tag.api;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a implements Serializable {
    public static final int ALIGNMENT_DEFAULT = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alignment")
    public String alignment;
    @SerializedName("background_color")
    public String backgroundColor;
    @SerializedName("background_image")
    public String backgroundImage;
    @SerializedName("background_url")
    public String backgroundUrl;
    @SerializedName("border_color")
    public String borderColor;
    @SerializedName("border_width")
    public String borderWidth;
    @SerializedName("corner_radius")
    public String[] cornerRadiusArray;
    @SerializedName("gradient_color")
    public b gradientColor;
    @SerializedName("use_dynamic_border_width")
    public boolean useDynamicBorderWidth;
}
