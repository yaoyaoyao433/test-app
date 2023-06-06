package com.meituan.android.mrn.network;

import com.meituan.android.mrn.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j implements i.a {
    public static ChangeQuickRedirect a;
    private final List<i> b;
    private final String c;
    private final int d;
    private final JSONObject e;
    private final JSONObject f;

    public j(String str, List<i> list, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {str, list, Integer.valueOf(i), jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f76f763d24de902077172e64d6a0c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f76f763d24de902077172e64d6a0c1");
            return;
        }
        this.b = list;
        this.d = i;
        this.e = jSONObject;
        this.f = jSONObject2;
        this.c = str;
    }

    @Override // com.meituan.android.mrn.network.i.a
    public final void a(JSONObject jSONObject, com.meituan.android.mrn.module.utils.c cVar) {
        Object[] objArr = {jSONObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff1ea52e03cfe83804282f9eb154692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff1ea52e03cfe83804282f9eb154692");
        } else if (this.d >= this.b.size()) {
        } else {
            this.b.get(this.d).a(new j(this.c, this.b, this.d + 1, jSONObject, this.f), cVar);
        }
    }

    @Override // com.meituan.android.mrn.network.i.a
    public final JSONObject a() {
        return this.e;
    }
}
