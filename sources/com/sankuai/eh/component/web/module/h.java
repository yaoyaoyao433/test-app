package com.sankuai.eh.component.web.module;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public String b;
    public boolean c;
    public c d;
    public JsonElement e;
    public List<com.sankuai.eh.component.web.plugins.e> f;
    public List<com.sankuai.eh.component.web.plugins.e> g;
    final Map<String, Object> h;
    public final Map<String, Object> i;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8727b59157fc63bb148adac0ecbef9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8727b59157fc63bb148adac0ecbef9");
            return;
        }
        this.h = new HashMap();
        this.i = new HashMap();
    }

    public h(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb15c6459e5eca0361c6d58e2a4d921d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb15c6459e5eca0361c6d58e2a4d921d");
            return;
        }
        this.h = new HashMap();
        this.i = new HashMap();
        this.b = str;
        this.d = cVar;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9fd01a05feadcea0f025a62b07f2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9fd01a05feadcea0f025a62b07f2b4");
        } else {
            this.h.put(str, obj);
        }
    }

    public final <T> T b(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b16b7eb124e09dbd6ea93985ee7ff976", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b16b7eb124e09dbd6ea93985ee7ff976");
        }
        try {
            return this.h.get(str) != null ? (T) this.h.get(str) : t;
        } catch (Exception unused) {
            return t;
        }
    }

    public final void c(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a80f4bf1aa3ea7aed6ba7d3cddfe9f33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a80f4bf1aa3ea7aed6ba7d3cddfe9f33");
        } else {
            this.i.put(str, obj);
        }
    }

    public final <T> T d(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e235341cd32d3f6e408be51e58fb774", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e235341cd32d3f6e408be51e58fb774");
        }
        try {
            return this.i.get(str) != null ? (T) this.i.get(str) : t;
        } catch (Exception unused) {
            return t;
        }
    }

    public final com.sankuai.eh.component.web.plugins.e a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2456c7c68f4d22643f9664a19c91efec", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.eh.component.web.plugins.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2456c7c68f4d22643f9664a19c91efec");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.sankuai.eh.component.web.plugins.e eVar : this.f) {
            if (str.equals(eVar.b())) {
                return eVar;
            }
        }
        for (com.sankuai.eh.component.web.plugins.e eVar2 : this.g) {
            if (str.equals(eVar2.b())) {
                return eVar2;
            }
        }
        return null;
    }
}
