package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiDrugSpuScrollKingKong implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("drug_selling_point")
    public DrugSellingPointInfo drugSellingPoint;
    @SerializedName("primary_filter_condlist")
    public ArrayList<PrimaryFilterCondList> primaryFilterList;
}
