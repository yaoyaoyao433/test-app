package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class q {
    public static ChangeQuickRedirect a;
    protected String b;
    protected String c;
    protected boolean d;
    protected volatile JSONArray e;
    protected volatile JSONObject f;
    protected a g;
    private com.sankuai.xm.base.callback.d<String> h;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, JSONObject jSONObject, JSONArray jSONArray);
    }

    public q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1806047306072dcd2d56f46c2e9703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1806047306072dcd2d56f46c2e9703");
            return;
        }
        this.b = "";
        this.c = "";
        this.e = new JSONArray();
        this.f = new JSONObject();
    }

    public final void a(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0950aca6cc9c1f5ed9e130d0e37b5833", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0950aca6cc9c1f5ed9e130d0e37b5833");
        } else {
            a(str, z, z2, null);
        }
    }

    public final void a(String str, boolean z, boolean z2, a aVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e499bc8b91e4389f70af2cc42fe434ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e499bc8b91e4389f70af2cc42fe434ee");
            return;
        }
        if (z2) {
            com.sankuai.xm.base.service.h hVar = (com.sankuai.xm.base.service.h) com.sankuai.xm.base.service.m.a(com.sankuai.xm.base.service.h.class);
            if (this.h != null) {
                hVar.b(this.h);
            }
            this.h = new com.sankuai.xm.base.callback.d<String>() { // from class: com.sankuai.xm.base.util.q.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.d
                public final void a(com.sankuai.xm.base.entity.b<String> bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d66cbfff2a49bd27ba34e37396bc2e6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d66cbfff2a49bd27ba34e37396bc2e6");
                    } else {
                        q.this.cb_();
                    }
                }
            };
            hVar.a(this.h);
        }
        synchronized (this) {
            this.b = str;
            this.d = z;
            this.g = aVar;
        }
        cb_();
    }

    synchronized void cb_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d5ab6e2630589936174037d103e78d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d5ab6e2630589936174037d103e78d");
            return;
        }
        try {
            String a2 = com.sankuai.xm.base.service.m.c().a(this.b);
            if (ac.a(a2, this.c)) {
                return;
            }
            try {
                if (this.d) {
                    this.e = new JSONArray(a2);
                } else {
                    this.f = new JSONObject(a2);
                }
            } catch (Exception unused) {
                this.e = new JSONArray();
                this.f = new JSONObject();
            }
            this.c = a2;
            b();
        } catch (Exception e) {
            com.sankuai.xm.log.a.a(e, "LocalConfigBase::load", new Object[0]);
        }
    }

    public void b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f1e4e48f8611ad53b1fd178d0a0847", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f1e4e48f8611ad53b1fd178d0a0847");
        } else if (this.g != null) {
            this.g.a(this.c, this.f, this.e);
        }
    }
}
