package com.sankuai.xm.integration.emotion;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.d;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.network.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends d {
    public static ChangeQuickRedirect b = null;
    public static int c = 20;
    private Map<String, String> d;

    public a(String str, Map<String, String> map) {
        super(str, null);
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e91f8f96b53e50010d7faada0fa2f8bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e91f8f96b53e50010d7faada0fa2f8bb");
            return;
        }
        this.d = map;
        a(new C1405a());
    }

    @Override // com.sankuai.xm.network.httpurlconnection.e
    public final JSONObject bY_() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a304c8dd6c9af455829a11f8afa74a", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a304c8dd6c9af455829a11f8afa74a");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("packages", jSONObject2);
        HashMap hashMap = null;
        synchronized (this) {
            if (this.d != null && this.d.size() > 0) {
                hashMap = new HashMap(this.d);
            }
        }
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                if (!ac.a((String) entry.getValue())) {
                    jSONObject3.put("ver", entry.getValue());
                }
                jSONObject2.put(((String) entry.getKey()), jSONObject3);
            }
        }
        return jSONObject;
    }

    @Override // com.sankuai.xm.network.c
    public final boolean bZ_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703fc3f84bb8f6540e7626c852c1ff70", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703fc3f84bb8f6540e7626c852c1ff70")).booleanValue();
        }
        synchronized (this) {
            if (this.d == null || this.d.size() < c / 2) {
                return super.bZ_();
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.integration.emotion.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C1405a implements com.sankuai.xm.network.httpurlconnection.merge.a {
        public static ChangeQuickRedirect a;

        private C1405a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f288357a6c522697b4cf165b18b20d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f288357a6c522697b4cf165b18b20d");
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.merge.a
        public final void a(c cVar, c cVar2) {
            Object[] objArr = {cVar, cVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef14824f4253ee5e3870f3d6b7417c62", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef14824f4253ee5e3870f3d6b7417c62");
            } else if ((cVar instanceof a) && (cVar2 instanceof a)) {
                synchronized (a.this) {
                    if (((a) cVar2).d == null) {
                        ((a) cVar2).d = new HashMap();
                    }
                    if (((a) cVar).d != null) {
                        ((a) cVar2).d.putAll(((a) cVar).d);
                    }
                }
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.merge.a
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "194bcdbe5c4c6f496d7cf781a42b5efa", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "194bcdbe5c4c6f496d7cf781a42b5efa") : a.this.j();
        }
    }
}
