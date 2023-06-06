package com.sankuai.waimai.platform.domain.manager.poi.collect;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CheckPoiCollectResponse {
    public static final int COLLECTED = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("collect")
    public int collect;
}
