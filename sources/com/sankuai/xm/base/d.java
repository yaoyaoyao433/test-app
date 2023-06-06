package com.sankuai.xm.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends com.sankuai.xm.network.httpurlconnection.e {
    public static ChangeQuickRedirect a;
    private boolean b;

    public d(String str, com.sankuai.xm.network.httpurlconnection.d dVar) {
        super(str);
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0918409f693818354d886f704e20e2f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0918409f693818354d886f704e20e2f4");
            return;
        }
        this.b = false;
        f();
        a(dVar);
    }

    public d(String str, Map<String, Object> map, com.sankuai.xm.network.httpurlconnection.d dVar) {
        super(str);
        Object[] objArr = {str, map, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b12f2ab74ab2fc2f727eb4949337cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b12f2ab74ab2fc2f727eb4949337cd");
            return;
        }
        this.b = false;
        f();
        b(map);
        a(dVar);
    }

    public d(String str, JSONObject jSONObject, com.sankuai.xm.network.httpurlconnection.d dVar) {
        super(str);
        Object[] objArr = {str, jSONObject, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1842146a089e5348be6f178f9e0e873", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1842146a089e5348be6f178f9e0e873");
            return;
        }
        this.b = false;
        f();
        ((com.sankuai.xm.network.httpurlconnection.e) this).s = jSONObject;
        a(dVar);
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6425fdfffad219ea5426ad4df9f822", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6425fdfffad219ea5426ad4df9f822");
            return;
        }
        this.b = true;
        f();
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05afdad8dddaf967cbea96f1c3309f49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05afdad8dddaf967cbea96f1c3309f49");
            return;
        }
        try {
            if (F() != null) {
                F().put(str, obj);
            }
        } catch (JSONException e) {
            com.sankuai.xm.login.d.a(e);
        }
    }

    @Override // com.sankuai.xm.network.c
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e8350cebf1dc8d243c352c1d180f29", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e8350cebf1dc8d243c352c1d180f29")).intValue();
        }
        int b = super.b();
        if (b == 0 && e()) {
            return 19100;
        }
        return b;
    }

    @Override // com.sankuai.xm.network.c
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d21d01e081f8803696af3ae8b33161", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d21d01e081f8803696af3ae8b33161");
            return;
        }
        com.sankuai.xm.login.d.a("ElephantAuthRequest::onPreExecute: url:%s, useCache:%s params:%s", this.j, Boolean.valueOf(this.b), D());
        if (z && e()) {
            a(19100, "account was changed during requesting.");
        } else {
            super.b(z);
        }
        if (this.b) {
            com.sankuai.xm.login.d.c("ElephantAuthRequest::onPostExecute: success: %s, url: %s", Boolean.valueOf(z), this.j);
        }
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "919052ab699076718c97d6f38e8b69e9", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "919052ab699076718c97d6f38e8b69e9")).booleanValue() : !ac.a(g(), this.k.get("u"));
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088adff47054ec04f23c58b7e645a1c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088adff47054ec04f23c58b7e645a1c2");
            return;
        }
        b("u", g());
        b("ai", Short.toString(com.sankuai.xm.login.a.a().d));
        m.a();
        b(MsgAddition.DT, "1");
        b("ck", com.sankuai.xm.login.a.a().i());
        StringBuilder sb = new StringBuilder();
        m.a();
        sb.append(1);
        sb.append(CommonConstant.Symbol.MINUS);
        sb.append(m.a().e());
        b("os", sb.toString());
        String f = com.sankuai.xm.login.a.a().f();
        if (ac.a(f) && this.b) {
            com.sankuai.xm.login.d.b("ElephantAuthRequest::initDXAuthHeader: use cache alToken : %s", this.j);
            f = com.sankuai.xm.login.a.a().d(com.sankuai.xm.login.a.a().q());
        }
        if (f != null) {
            b("uu", com.sankuai.xm.login.a.a().k());
            b("al", f);
        }
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6672d090456c48ee7d4a92f76056afb7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6672d090456c48ee7d4a92f76056afb7");
        }
        if (this.b) {
            StringBuilder sb = new StringBuilder();
            sb.append(com.sankuai.xm.login.a.a().q());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.sankuai.xm.login.a.a().b);
        return sb2.toString();
    }
}
