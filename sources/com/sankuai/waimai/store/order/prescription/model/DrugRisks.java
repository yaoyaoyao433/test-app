package com.sankuai.waimai.store.order.prescription.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugRisks implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1878933248418938507L;
    @SerializedName("show")
    public boolean isAutoUnFold;
    @SerializedName("risk_key")
    public String riskKey;
    @SerializedName("risks")
    public List<DrugRisk> riskList;
    public long updateTime;
}
