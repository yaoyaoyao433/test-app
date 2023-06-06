package com.sankuai.xm.integration.emotion.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.ui.service.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends b.a implements Cloneable {
    public static ChangeQuickRedirect a;
    public final d b;
    public b c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a7c40154baafe08d4d02c413be45e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a7c40154baafe08d4d02c413be45e4");
        } else {
            this.b = new d();
        }
    }

    public final void a(JSONObject jSONObject, b bVar) {
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e4b75c49e17247078085c820cc248a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e4b75c49e17247078085c820cc248a");
        } else if (jSONObject == null) {
            com.sankuai.xm.log.c.d(c.class, "parse:: json is null", new Object[0]);
        } else {
            this.c = bVar;
            this.e = jSONObject.optString("stickerId");
            this.f = jSONObject.optString("keyword");
            this.g = jSONObject.optString("primaryMediaId");
            this.h = jSONObject.optString("thumbMediaId");
            this.b.a(jSONObject.optJSONObject("extInfo"));
            this.d = bVar.b;
            this.i = bVar.d + this.g;
            this.j = bVar.d + this.h;
        }
    }

    /* renamed from: a */
    public final c clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b05de51ecdd0d99e7d3340aff351ae6", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b05de51ecdd0d99e7d3340aff351ae6");
        }
        c cVar = new c();
        cVar.c = this.c;
        cVar.b.b = this.b.b;
        cVar.d = this.d;
        cVar.e = this.e;
        cVar.f = this.f;
        cVar.g = this.g;
        cVar.h = this.h;
        cVar.i = this.i;
        cVar.j = this.j;
        cVar.k = this.k;
        cVar.l = this.l;
        return cVar;
    }
}
