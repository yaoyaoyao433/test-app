package com.sankuai.waimai.store.mrn.preload;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    com.meituan.android.mrn.network.h b;

    public g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55c12022b1faa1e81c9f89fecbce397b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55c12022b1faa1e81c9f89fecbce397b");
        } else {
            this.b = new com.meituan.android.mrn.network.h(context);
        }
    }

    public final void a(JSONObject jSONObject, @NonNull com.meituan.android.mrn.module.utils.c cVar) {
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb09f0bab0f5e9de086e1e25247cbc32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb09f0bab0f5e9de086e1e25247cbc32");
        } else {
            this.b.a(jSONObject, cVar);
        }
    }
}
