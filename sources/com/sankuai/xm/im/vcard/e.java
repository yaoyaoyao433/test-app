package com.sankuai.xm.im.vcard;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class e extends com.sankuai.xm.base.d {
    public static ChangeQuickRedirect c;
    final Set<Long> d;
    final int e;
    protected long f;

    @NonNull
    public abstract String c();

    public e(String str, boolean z, int i, Collection<Long> collection) {
        super(com.sankuai.xm.im.http.a.a(str), null);
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), collection};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982ed9cdcc9684392fb2e6f0de86c5dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982ed9cdcc9684392fb2e6f0de86c5dc");
            return;
        }
        this.d = new HashSet();
        this.e = i;
        if (collection != null) {
            this.d.addAll(collection);
        }
        if (z) {
            a(new a());
        }
    }

    @Override // com.sankuai.xm.network.httpurlconnection.e
    public final JSONObject bY_() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259f24de262b5d37a3e5d16cf57bfed1", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259f24de262b5d37a3e5d16cf57bfed1");
        }
        JSONObject jSONObject = new JSONObject();
        synchronized (this.d) {
            if (this.f > 0 && !this.d.contains(Long.valueOf(this.f))) {
                this.d.add(Long.valueOf(this.f));
            }
            jSONObject.put(c(), new JSONArray((Collection) this.d));
        }
        return jSONObject;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a implements com.sankuai.xm.network.httpurlconnection.merge.a {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d10fa617304bdeb4ba8513231b7ff7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d10fa617304bdeb4ba8513231b7ff7");
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.merge.a
        public final void a(com.sankuai.xm.network.c cVar, com.sankuai.xm.network.c cVar2) {
            Object[] objArr = {cVar, cVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a038dd1b3246cc8b746d1d99ae6447ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a038dd1b3246cc8b746d1d99ae6447ce");
            } else if (cVar != null && (cVar instanceof e) && (cVar2 instanceof e)) {
                e eVar = (e) cVar;
                e eVar2 = (e) cVar2;
                synchronized (eVar2.d) {
                    eVar2.d.add(Long.valueOf(eVar.f));
                }
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.merge.a
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41d1df7b3fe1d502dc924c5eeb361e2", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41d1df7b3fe1d502dc924c5eeb361e2") : e.this.j();
        }
    }
}
