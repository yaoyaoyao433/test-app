package com.meituan.msi.lib.map.view.model;

import android.util.SparseArray;
import com.google.gson.JsonObject;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    public static ChangeQuickRedirect a;
    public final MTMap b;
    public final MsiContext c;
    public final JsonObject d;
    public final SparseArray<s> e;

    public t(MTMap mTMap, MsiContext msiContext, JsonObject jsonObject, SparseArray<s> sparseArray) {
        Object[] objArr = {mTMap, msiContext, jsonObject, sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b85d432b56e10b783307b16b0b4b8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b85d432b56e10b783307b16b0b4b8f");
            return;
        }
        this.b = mTMap;
        this.c = msiContext;
        this.e = sparseArray;
        this.d = jsonObject;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c4d0b1d82ffd95d56e7cfe763191b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c4d0b1d82ffd95d56e7cfe763191b7");
            return;
        }
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.e.keyAt(i);
            this.e.get(keyAt).b();
            this.e.remove(keyAt);
        }
    }
}
