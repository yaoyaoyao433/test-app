package com.sankuai.waimai.store.goods.list.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SuperSaleModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<AddCrossSkus> addSuperSkus;
    public boolean isSuperOrder;
    public ArrayList<Long> mAddListids;

    public SuperSaleModel(boolean z, ArrayList<Long> arrayList, ArrayList<AddCrossSkus> arrayList2) {
        this.isSuperOrder = z;
        this.mAddListids = arrayList;
        this.addSuperSkus = arrayList2;
    }
}
