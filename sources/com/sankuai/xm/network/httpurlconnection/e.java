package com.sankuai.xm.network.httpurlconnection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends com.sankuai.xm.network.c {
    public static ChangeQuickRedirect q;
    protected Map<String, Object> r;
    protected JSONObject s;

    public e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2379abc81a28e5105050104c591ffd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2379abc81a28e5105050104c591ffd");
            return;
        }
        this.s = null;
        this.r = null;
        this.j = str;
    }

    public final e b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7070099521d17b5ee4bda0ee66ff3f3d", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7070099521d17b5ee4bda0ee66ff3f3d");
        }
        a(str, str2);
        return this;
    }

    public final JSONObject F() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846b21116bd58878e0896ddfcd1f3a52", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846b21116bd58878e0896ddfcd1f3a52");
        }
        if (this.s == null) {
            JSONObject bY_ = bY_();
            this.s = bY_;
            return bY_;
        }
        return this.s;
    }

    public final e a(JSONObject jSONObject) {
        this.s = jSONObject;
        return this;
    }

    public final e b(Map<String, Object> map) {
        this.r = map;
        return this;
    }

    public final Object c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "887fa440e95bf7f5ed6486834d743a60", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "887fa440e95bf7f5ed6486834d743a60");
        }
        try {
            if (F() != null) {
                return F().get(str);
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject bY_() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "787b336995472209e927e0008e03c9e3", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "787b336995472209e927e0008e03c9e3");
        }
        if (this.r != null) {
            return new JSONObject(this.r);
        }
        return null;
    }

    @Override // com.sankuai.xm.network.c
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f549e8a47b616c80cc1a6b2ac4f85171", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f549e8a47b616c80cc1a6b2ac4f85171");
        }
        try {
            JSONObject F = F();
            return F != null ? F.toString() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public final e a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d21447e852cce8c7d3c064e69e863ff", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d21447e852cce8c7d3c064e69e863ff");
        }
        this.m = cVar;
        return this;
    }

    public final com.sankuai.xm.network.httpurlconnection.retry.d G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99b8f4263b241507fc6514e7b20dca99", 6917529027641081856L) ? (com.sankuai.xm.network.httpurlconnection.retry.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99b8f4263b241507fc6514e7b20dca99") : this.o;
    }

    public final e a(com.sankuai.xm.network.httpurlconnection.retry.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a4985ebc800e63ecb4018be15980a4", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a4985ebc800e63ecb4018be15980a4");
        }
        this.o = dVar;
        return this;
    }
}
