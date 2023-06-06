package com.sankuai.waimai.store.search.ui.result.dynamictag;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.widget.tag.api.e;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGSearchTagInfo extends com.sankuai.waimai.platform.widget.tag.api.a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2704246372981060473L;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("margin_bottom")
    public String marginBottom;
    @SerializedName("priority")
    public int priority;
    @SerializedName("rule_id")
    public long ruleId;
    @SerializedName("sub_tags")
    public List<e> subTagBaseInfoList;
    @SerializedName("use_specific_margin")
    public boolean useSpecificMargin;
}
