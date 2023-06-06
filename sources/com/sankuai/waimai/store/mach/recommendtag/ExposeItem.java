package com.sankuai.waimai.store.mach.recommendtag;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ExposeItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("rank_label_info")
    public String rank_label_info;
    @SerializedName("rank_label_text")
    public String rank_label_text;
    @SerializedName("recommend")
    public String recommend;
}
