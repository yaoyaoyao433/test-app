package com.sankuai.waimai.alita.platform.horn;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaHornResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enableAlita")
    public boolean enableAlita = true;
    @SerializedName("enableModelPredict")
    public boolean enableModelPredict = true;
}
