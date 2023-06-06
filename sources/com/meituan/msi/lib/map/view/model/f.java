package com.meituan.msi.lib.map.view.model;

import android.util.SparseArray;
import com.google.gson.JsonObject;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.mapsdk.maps.MTMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public final MTMap b;
    public final MsiContext c;
    public final JsonObject d;
    public final SparseArray<e> e;

    public f(MTMap mTMap, MsiContext msiContext, JsonObject jsonObject, SparseArray<e> sparseArray) {
        Object[] objArr = {mTMap, msiContext, jsonObject, sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e80732ab6e1ecb3aa65a36d7d4bd958", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e80732ab6e1ecb3aa65a36d7d4bd958");
            return;
        }
        this.b = mTMap;
        this.c = msiContext;
        this.d = jsonObject;
        this.e = sparseArray;
    }
}
