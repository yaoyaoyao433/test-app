package com.sankuai.xm.base.util.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private JSONObject b;

    public c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d7e69cc276b29c4008a932d39992da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d7e69cc276b29c4008a932d39992da");
            return;
        }
        try {
            this.b = new JSONObject(str);
        } catch (Exception unused) {
            this.b = null;
        }
    }

    public c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7030eb5491151e133ea2ffdb566ec09b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7030eb5491151e133ea2ffdb566ec09b");
        } else {
            this.b = jSONObject;
        }
    }

    public final c a(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf302096edf78542dcc2695d2cfa619", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf302096edf78542dcc2695d2cfa619");
        }
        if (a() || this.b.isNull(str) || !this.b.has(str)) {
            return null;
        }
        return new c(this.b.getJSONObject(str));
    }

    public final String b(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50aa1f9e368e0e8caa5b3c236e3e24f4", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50aa1f9e368e0e8caa5b3c236e3e24f4") : (a() || this.b.isNull(str) || !this.b.has(str)) ? "" : this.b.getString(str);
    }

    public final int c(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd212aa33227ee967574258d58baa6b1", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd212aa33227ee967574258d58baa6b1")).intValue();
        }
        if (a() || this.b.isNull(str) || !this.b.has(str)) {
            return 0;
        }
        return this.b.getInt(str);
    }

    public final long d(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88baa989ee7fcb0df1c9f50c235babf", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88baa989ee7fcb0df1c9f50c235babf")).longValue();
        }
        if (a() || this.b.isNull(str) || !this.b.has(str)) {
            return 0L;
        }
        return this.b.getLong(str);
    }

    public final boolean e(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8fe2267d519bf3eb652840b6b6a88d1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8fe2267d519bf3eb652840b6b6a88d1")).booleanValue();
        }
        if (a() || this.b.isNull(str) || !this.b.has(str)) {
            return false;
        }
        return this.b.getBoolean(str);
    }

    public final JSONArray f(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64577482e480b3079f4e94f4fb5643b2", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64577482e480b3079f4e94f4fb5643b2");
        }
        if (a() || this.b.isNull(str) || !this.b.has(str)) {
            return null;
        }
        return this.b.getJSONArray(str);
    }

    public final JSONObject g(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e6783410c148c9cf9fb07e8625c25de", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e6783410c148c9cf9fb07e8625c25de");
        }
        if (a() || this.b.isNull(str) || !this.b.has(str)) {
            return null;
        }
        return this.b.getJSONObject(str);
    }

    private boolean a() {
        return this.b == null;
    }
}
