package com.dianping.nvnetwork.cache;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class f implements d, h {
    public static ChangeQuickRedirect a;
    d b;

    public abstract q a(Request request, a aVar);

    public f(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c8ef9e517e62bb4ceb853f5914e6da4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c8ef9e517e62bb4ceb853f5914e6da4");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.dianping.nvnetwork.cache.h, com.dianping.nvnetwork.http.a
    public rx.d<q> exec(final Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb501a0fc1793c9712f25b272bbedb7", 6917529027641081856L) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb501a0fc1793c9712f25b272bbedb7") : rx.d.a((d.a) new d.a<a>() { // from class: com.dianping.nvnetwork.cache.f.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                String str;
                rx.j jVar = (rx.j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "261e24a2de58cc1ea9010ecfdd44da9e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "261e24a2de58cc1ea9010ecfdd44da9e");
                    return;
                }
                if (TextUtils.isEmpty(request.k)) {
                    str = request.d;
                } else {
                    str = request.k;
                }
                jVar.onNext(f.this.b.a(str));
                jVar.onCompleted();
            }
        }).d(new rx.functions.g<a, q>() { // from class: com.dianping.nvnetwork.cache.f.1
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // rx.functions.g
            /* renamed from: a */
            public q call(a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd631276e7a7f2c711496861deab906f", 6917529027641081856L)) {
                    return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd631276e7a7f2c711496861deab906f");
                }
                q a2 = f.this.a(request, aVar);
                if (aVar != null && !a2.isSuccess()) {
                    f.this.a(request);
                }
                return a2;
            }
        });
    }

    @Override // com.dianping.nvnetwork.cache.d
    public final a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d11b5d9c4b4b970871e0d0266a7434", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d11b5d9c4b4b970871e0d0266a7434") : this.b.a(str);
    }

    @Override // com.dianping.nvnetwork.cache.d
    public final int a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cbb949877daf24f74c46a63f7ffbfda", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cbb949877daf24f74c46a63f7ffbfda")).intValue() : this.b.a(aVar);
    }

    @Override // com.dianping.nvnetwork.cache.d
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be70877c48893b8257b4b0930a29b6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be70877c48893b8257b4b0930a29b6e");
        } else {
            this.b.b(str);
        }
    }

    @Override // com.dianping.nvnetwork.cache.h
    public boolean a(Request request, q qVar) {
        String str;
        Object[] objArr = {request, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e8d3bda1b8dceaf393fbbd91d7dd3c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e8d3bda1b8dceaf393fbbd91d7dd3c")).booleanValue();
        }
        if (request == null || qVar == null || qVar.result() == null) {
            return false;
        }
        if (TextUtils.isEmpty(request.k)) {
            str = request.d;
        } else {
            str = request.k;
        }
        return a(new a(str, qVar.result(), System.currentTimeMillis(), a(qVar.headers()))) > 0;
    }

    @Override // com.dianping.nvnetwork.cache.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75eabc1c52b8619669342029cb24d8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75eabc1c52b8619669342029cb24d8f");
        } else {
            this.b.a();
        }
    }

    public final HashMap<String, String> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d233d07f403a2533e95a3d27e5aa82ed", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d233d07f403a2533e95a3d27e5aa82ed");
        }
        if (str == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final String a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29184d4e2058c08dbf85200a14d763f0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29184d4e2058c08dbf85200a14d763f0");
        }
        if (hashMap == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject.put(entry.getKey().toLowerCase(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.dianping.nvnetwork.cache.h
    public final void a(Request request) {
        String str;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2e16b204d9835aab2af1250db5a915", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2e16b204d9835aab2af1250db5a915");
            return;
        }
        if (TextUtils.isEmpty(request.k)) {
            str = request.d;
        } else {
            str = request.k;
        }
        b(str);
    }
}
