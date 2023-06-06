package com.sankuai.waimai.platform.widget.tag.api;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("click_callback_info")
    public c clickCallbackInfo;
    @SerializedName("click_expose_info")
    public Map<String, String> clickExposeInfo;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("margin_bottom")
    public String marginBottom;
    @SerializedName("rule_id")
    public long ruleId;
    @SerializedName("sub_tags")
    public List<e> subTagBaseInfoList;
    @SerializedName("tag_height")
    public String tagHeight;
    @SerializedName("use_dynamic_height")
    public boolean useDynamicHeight;
    @SerializedName("use_specific_margin")
    public boolean useSpecificMargin;
}
