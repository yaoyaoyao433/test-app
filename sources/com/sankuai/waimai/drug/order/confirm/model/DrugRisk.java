package com.sankuai.waimai.drug.order.confirm.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DrugRisk implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -326339496300900139L;
    @SerializedName("info")
    public String info;
    @SerializedName("new_risk")
    public boolean newRisk;
}
