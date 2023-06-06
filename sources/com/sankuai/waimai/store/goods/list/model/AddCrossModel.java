package com.sankuai.waimai.store.goods.list.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AddCrossModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap<Long, ArrayList<AddCrossSkus>> addCrossSkus;
    public boolean isCrossOrder;
    public ArrayList<Long> mAddListids;

    public AddCrossModel(boolean z, ArrayList<Long> arrayList, HashMap<Long, ArrayList<AddCrossSkus>> hashMap) {
        this.isCrossOrder = z;
        this.mAddListids = arrayList;
        this.addCrossSkus = hashMap;
    }
}
