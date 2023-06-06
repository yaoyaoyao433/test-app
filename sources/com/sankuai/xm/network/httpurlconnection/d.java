package com.sankuai.xm.network.httpurlconnection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.network.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class d extends c {
    public static ChangeQuickRedirect l;

    public abstract void a(int i, String str) throws Exception;

    public abstract void a(JSONObject jSONObject) throws Exception;

    @Override // com.sankuai.xm.network.httpurlconnection.c
    public final void a(com.sankuai.xm.network.d dVar) {
        JSONObject jSONObject;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea3ab7d533e68c45669decd2a032dda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea3ab7d533e68c45669decd2a032dda");
            return;
        }
        com.sankuai.xm.monitor.cat.b bVar = new com.sankuai.xm.monitor.cat.b();
        bVar.d = dVar.b;
        bVar.f = dVar.c.getBytes().length;
        bVar.e = dVar.d.l().getBytes().length;
        bVar.i = dVar.e;
        try {
            try {
                jSONObject = new JSONObject(dVar.c);
            } catch (Exception e) {
                com.sankuai.xm.log.a.a(e, "HttpJsonCallback::onSuccess => exception." + e.getMessage(), new Object[0]);
                jSONObject = null;
            }
            if (jSONObject == null) {
                bVar.c = 5000;
                a(5000, "");
            } else if (jSONObject.has("rescode")) {
                int i = jSONObject.getInt("rescode");
                int optInt = jSONObject.optInt("dgcode", 0);
                bVar.c = i;
                com.sankuai.xm.log.a.a("HttpJsonCallback::onSuccess => req = %s,rescode = %d,dgcode = %d", dVar.d, Integer.valueOf(i), Integer.valueOf(optInt));
                if (i != 0) {
                    a(i, b(jSONObject));
                } else if (optInt == 996) {
                    bVar.c = optInt;
                    a(optInt, jSONObject.optString("dgreason", "API speed limit"));
                } else if (optInt == 161) {
                    com.sankuai.xm.network.httpurlconnection.retry.d dVar2 = dVar.d.o;
                    if (dVar2 != null && dVar2.b()) {
                        dVar.d.c(dVar2.c());
                        m.f().b(dVar.d);
                        return;
                    }
                    bVar.c = optInt;
                    a(optInt, jSONObject.optString("dgreason", "API server request time out"));
                } else if (optInt > 0) {
                    bVar.c = optInt;
                    Object[] objArr2 = {Integer.valueOf(optInt), jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = l;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "043d9379e72c58fd97fb8f29ea351d02", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "043d9379e72c58fd97fb8f29ea351d02");
                    } else {
                        com.sankuai.xm.log.a.c("HttpJsonCallback::onDegrade:: code = " + optInt + CommonConstant.Symbol.COMMA + jSONObject.optString("dgreason", "API degrade") + CommonConstant.Symbol.COMMA + this.k, new Object[0]);
                        if (optInt != 162) {
                            a(optInt, jSONObject.optString("dgreason", "API degrade"));
                        } else {
                            a(jSONObject);
                        }
                    }
                } else {
                    a(jSONObject);
                }
            } else if (jSONObject.has("code")) {
                bVar.c = 5000;
                int i2 = jSONObject.getInt("code");
                com.sankuai.xm.log.a.c("HttpJsonCallback::onSuccess => url = " + this.k + ",code = " + i2);
                if (i2 == 200) {
                    bVar.c = 0;
                    a(jSONObject);
                } else {
                    a(i2, b(jSONObject));
                }
            } else {
                bVar.c = 5000;
                a(5000, "");
            }
            bVar.b = this.k;
            bVar.g = this.i;
            m.d().a(bVar);
        } catch (Exception e2) {
            com.sankuai.xm.log.a.a(e2, "HttpJsonCallback::onSuccess => exception.", new Object[0]);
            try {
                a(5000, "");
            } catch (Throwable unused) {
                com.sankuai.xm.log.a.a(e2, "HttpJsonCallback::onSuccess => exception again", new Object[0]);
            }
        }
    }

    private String b(JSONObject jSONObject) throws Exception {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac486ea44750cce5bb566dafe2be3770", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac486ea44750cce5bb566dafe2be3770");
        }
        if (jSONObject.has("msg")) {
            return jSONObject.getString("msg");
        }
        if (jSONObject.has("message")) {
            return jSONObject.getString("message");
        }
        if (jSONObject.has("data")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            return jSONObject2.has("message") ? jSONObject2.getString("message") : "";
        }
        return "";
    }

    @Override // com.sankuai.xm.network.httpurlconnection.c
    public final void a(com.sankuai.xm.network.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8142983e9d4127ea14f2ae4e629afb2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8142983e9d4127ea14f2ae4e629afb2a");
            return;
        }
        try {
            c.a aVar = cVar.n;
            if (aVar.c != -1001 && aVar.c != -1002) {
                com.sankuai.xm.monitor.cat.b bVar = new com.sankuai.xm.monitor.cat.b();
                bVar.c = aVar.c;
                bVar.d = aVar.e;
                bVar.f = 0;
                bVar.e = cVar.l().getBytes().length;
                bVar.b = this.k;
                bVar.h = aVar.d;
                bVar.i = aVar.g;
                m.d().a(bVar);
                com.sankuai.xm.log.a.b("HttpJsonCallback::reportToMagic result:" + bVar.c + ", " + cVar);
            }
            a(aVar.c, "");
        } catch (Exception e) {
            com.sankuai.xm.log.a.a(e, "HttpJsonCallback::onFailure => exception.", new Object[0]);
        }
    }
}
