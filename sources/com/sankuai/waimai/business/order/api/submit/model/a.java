package com.sankuai.waimai.business.order.api.submit.model;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("show")
    public boolean b;
    @SerializedName(DMKeys.KEY_SELECTED)
    public int c;
}
