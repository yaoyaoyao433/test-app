package com.dianping.nvnetwork.tnold.zip.old;

import com.dianping.nvnetwork.tnold.zip.f;
import com.dianping.nvnetwork.tnold.zip.g;
import com.dianping.nvnetwork.tnold.zip.h;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements f {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.tnold.zip.f
    public final byte[] a(v vVar, boolean z) throws Exception {
        Object[] objArr = {vVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a94e53ea9b1f0e7c1f1041a43bcbb7e", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a94e53ea9b1f0e7c1f1041a43bcbb7e");
        }
        if (vVar == null) {
            return new byte[0];
        }
        if (vVar.g) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("m", vVar.h);
                JSONObject jSONObject2 = new JSONObject();
                if (vVar.d != null) {
                    for (Map.Entry<String, String> entry : vVar.d.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("h", jSONObject2);
                jSONObject.put("u", vVar.i);
                jSONObject.put("i", vVar.c);
                if (vVar.f > 0) {
                    jSONObject.put("t", vVar.f);
                }
                return jSONObject.toString().getBytes();
            } catch (JSONException e) {
                throw e;
            }
        }
        return new byte[0];
    }

    @Override // com.dianping.nvnetwork.tnold.zip.f
    public final g a() {
        return h.e;
    }
}
