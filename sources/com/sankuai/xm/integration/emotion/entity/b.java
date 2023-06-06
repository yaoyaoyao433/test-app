package com.sankuai.xm.integration.emotion.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.imui.common.entity.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public final a h;
    public List<c> i;
    public c j;
    public long k;

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53b32ab38d5960ed3ef048d51ff7701", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53b32ab38d5960ed3ef048d51ff7701");
            return;
        }
        this.h = new a();
        this.b = str;
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513ba2cc320c7192dc94005b6c78c7ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513ba2cc320c7192dc94005b6c78c7ff");
        } else if (jSONObject == null) {
            com.sankuai.xm.log.c.d(b.class, "parse:: json is null", new Object[0]);
        } else {
            this.c = jSONObject.optString("ver");
            this.d = jSONObject.optString("baseUrl");
            this.e = jSONObject.optString("name");
            this.f = jSONObject.optString("type");
            this.g = jSONObject.optString("iconMediaId");
            a aVar = this.h;
            JSONObject optJSONObject = jSONObject.optJSONObject("extInfo");
            Object[] objArr2 = {optJSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c99afd2d5e550b256bf5b0e57c769d32", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c99afd2d5e550b256bf5b0e57c769d32");
            } else if (optJSONObject == null) {
                com.sankuai.xm.log.c.d(a.class, "parse:: json is null", new Object[0]);
            } else {
                aVar.f = optJSONObject;
                aVar.b = optJSONObject.optString("primaryW");
                aVar.c = optJSONObject.optString("primaryH");
                aVar.d = optJSONObject.optString("thumbW");
                aVar.e = optJSONObject.optString("thumbH");
            }
            this.k = jSONObject.optLong("lastQueryTime", 0L);
            JSONArray optJSONArray = jSONObject.optJSONArray("stickers");
            if (optJSONArray != null) {
                this.i = new ArrayList(optJSONArray.length());
                for (int i = 0; i < optJSONArray.length(); i++) {
                    c cVar = new c();
                    cVar.a(optJSONArray.optJSONObject(i), this);
                    this.i.add(cVar);
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("sticker");
            if (optJSONObject2 != null) {
                this.j = new c();
                this.j.a(optJSONObject2, this);
            }
        }
    }

    public final com.sankuai.xm.imui.common.entity.a a() {
        String jSONObject;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2165f151b01c64237cbaf6cb7b79c19", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.common.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2165f151b01c64237cbaf6cb7b79c19");
        }
        com.sankuai.xm.imui.common.entity.a aVar = new com.sankuai.xm.imui.common.entity.a();
        aVar.h = this.b;
        aVar.i = this.e;
        aVar.g = this.f;
        aVar.c = this.d + this.g;
        aVar.e = this.e;
        char c2 = 3;
        aVar.d = 3;
        char c3 = 1;
        aVar.f = true;
        a aVar2 = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "3919a7e15ea57e1e3ad4c213b59c0aba", 6917529027641081856L)) {
            jSONObject = (String) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "3919a7e15ea57e1e3ad4c213b59c0aba");
        } else {
            jSONObject = aVar2.f == null ? null : aVar2.f.toString();
        }
        aVar.j = jSONObject;
        if (!com.sankuai.xm.base.util.b.a(this.i)) {
            for (c cVar : this.i) {
                String str = cVar.e;
                String str2 = this.d + cVar.h;
                String str3 = cVar.f;
                String str4 = cVar.b.b;
                Object[] objArr3 = new Object[4];
                objArr3[c] = str;
                objArr3[c3] = str2;
                objArr3[2] = str3;
                objArr3[c2] = str4;
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.imui.common.entity.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "381e59be44163229a60ca20aee092fea", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "381e59be44163229a60ca20aee092fea");
                } else {
                    a.C1398a c1398a = new a.C1398a();
                    c1398a.d = str;
                    c1398a.e = str2;
                    c1398a.c = str3;
                    c1398a.f = str4;
                    aVar.m.add(c1398a);
                }
                c2 = 3;
                c3 = 1;
                c = 0;
            }
        }
        return aVar;
    }

    public final c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d058108603a02e36a1480894a3c2d02", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d058108603a02e36a1480894a3c2d02");
        }
        if (this.j != null && ac.a(str, this.j.e)) {
            return this.j;
        }
        if (this.i != null) {
            for (c cVar : this.i) {
                if (cVar != null && ac.a(str, cVar.e)) {
                    return cVar;
                }
            }
            return null;
        }
        return null;
    }
}
