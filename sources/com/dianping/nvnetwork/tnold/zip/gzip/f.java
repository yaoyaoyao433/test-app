package com.dianping.nvnetwork.tnold.zip.gzip;

import com.dianping.nvnetwork.tnold.zip.h;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements com.dianping.nvnetwork.tnold.zip.f {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.tnold.zip.f
    public final byte[] a(v vVar, boolean z) throws Exception {
        Object[] objArr = {vVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eaaef60b84979103fcc4cf821aa3609", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eaaef60b84979103fcc4cf821aa3609");
        }
        if (vVar == null) {
            return new byte[0];
        }
        try {
            h.b(vVar);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("m", vVar.h);
            jSONObject.put("h", vVar.d == null ? new JSONObject() : vVar.d);
            jSONObject.put("u", vVar.i);
            jSONObject.put("i", vVar.c);
            return g.a(jSONObject.toString().getBytes());
        } catch (Exception unused) {
            throw g.b;
        }
    }

    @Override // com.dianping.nvnetwork.tnold.zip.f
    public final com.dianping.nvnetwork.tnold.zip.g a() {
        return h.e;
    }
}
