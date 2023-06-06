package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PicElement implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4012828003968626254L;
    @SerializedName("pic")
    public String pic;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("word")
    public String word;
    @SerializedName("word_scheme")
    public String wordScheme;
}
