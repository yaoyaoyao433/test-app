package com.sankuai.eh.component.web.module;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public c b;
    public List<com.sankuai.eh.component.web.plugins.e> c;
    public List<com.sankuai.eh.component.web.plugins.e> d;
    public List<com.sankuai.eh.component.web.model.a> e;
    public h f;
    public String g;
    public String h;
    public Activity i;
    public JsonElement j;
    public WebView k;
    public View l;
    public ITitansContainerContext m;
    public KNBWebCompat n;
    public j o;
    public ViewGroup p;
    public Bundle q;
    public int r;
    public int s;
    public final Map<String, Object> t;
    private final Map<String, Object> u;

    public c(String str, Activity activity, Bundle bundle) {
        Object[] objArr = {str, activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "254be84ec51966e08ea1a78871ebe203", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "254be84ec51966e08ea1a78871ebe203");
            return;
        }
        this.t = new HashMap();
        this.u = new HashMap();
        this.h = str;
        if (activity.getIntent() != null && !TextUtils.isEmpty(activity.getIntent().getDataString())) {
            this.g = activity.getIntent().getDataString();
            String a2 = com.sankuai.waimai.platform.utils.f.a(activity.getIntent(), "ehc_intentData");
            if (com.sankuai.eh.component.service.utils.e.b(a2, com.sankuai.eh.component.service.a.a()) != null) {
                this.g = a2;
            }
        } else {
            this.g = str;
        }
        this.i = activity;
        this.q = bundle;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "edf4600518e90900feba71bfba281001", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "edf4600518e90900feba71bfba281001");
            return;
        }
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532129f12d79309d72e8525b53fe8157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532129f12d79309d72e8525b53fe8157");
        } else {
            this.t.put(str, obj);
        }
    }

    private <T> T e(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae47df8ac28b77921e2cb12cadddf74d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae47df8ac28b77921e2cb12cadddf74d");
        }
        try {
            return this.t.get(str) != null ? (T) this.t.get(str) : t;
        } catch (Exception unused) {
            return t;
        }
    }

    public final void b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9beead65d4afa33e3c9bc4646e1a0f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9beead65d4afa33e3c9bc4646e1a0f3");
        } else {
            this.u.put(str, obj);
        }
    }

    public final <T> T c(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b766ea680af631405d2f05690ef2bc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b766ea680af631405d2f05690ef2bc1");
        }
        try {
            return this.u.get(str) != null ? (T) this.u.get(str) : t;
        } catch (Exception unused) {
            return t;
        }
    }

    public final <T> T d(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131603cf5775fd6143aa4115934e26ed", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131603cf5775fd6143aa4115934e26ed") : this.f != null ? (T) this.f.d(str, t) : t;
    }

    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81548255430640539689fa6133368f08", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81548255430640539689fa6133368f08");
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.t);
        if (this.f != null) {
            hashMap.putAll(this.f.h);
        }
        return hashMap;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c55e615f8132b9493efc619a42160b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c55e615f8132b9493efc619a42160b")).booleanValue();
        }
        if (!a(this.c, str)) {
            if (!a(this.f != null ? this.f.f : new ArrayList<>(), str) && !a(this.d, str)) {
                if (!a(this.f != null ? this.f.g : new ArrayList<>(), str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a(List<com.sankuai.eh.component.web.plugins.e> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221a9029b34b8f012730a1f34f9befe3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221a9029b34b8f012730a1f34f9befe3")).booleanValue();
        }
        for (com.sankuai.eh.component.web.plugins.e eVar : list) {
            if (str != null && str.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f4370ecb4b361c696b97a708b0df54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f4370ecb4b361c696b97a708b0df54") : (String) e("currentUrl", this.h);
    }

    public final com.sankuai.eh.component.web.plugins.e b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8162902769d0a3d3eb7301b767967795", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.eh.component.web.plugins.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8162902769d0a3d3eb7301b767967795");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.sankuai.eh.component.web.plugins.e eVar : this.c) {
            if (str.equals(eVar.b())) {
                return eVar;
            }
        }
        for (com.sankuai.eh.component.web.plugins.e eVar2 : this.d) {
            if (str.equals(eVar2.b())) {
                return eVar2;
            }
        }
        if (this.f != null) {
            for (com.sankuai.eh.component.web.plugins.e eVar3 : this.f.f) {
                if (str.equals(eVar3.b())) {
                    return eVar3;
                }
            }
            for (com.sankuai.eh.component.web.plugins.e eVar4 : this.f.g) {
                if (str.equals(eVar4.b())) {
                    return eVar4;
                }
            }
        }
        return null;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7d3a90e638de781ef1d9ca7bffe9cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7d3a90e638de781ef1d9ca7bffe9cb");
        }
        StringBuilder sb = new StringBuilder();
        Iterator<com.sankuai.eh.component.web.plugins.e> it = this.c.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getClass().getSimpleName() + ", ");
        }
        Iterator<com.sankuai.eh.component.web.plugins.e> it2 = this.d.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getClass().getSimpleName() + ", ");
        }
        return sb.toString();
    }

    public final void a(com.sankuai.eh.component.web.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7504367616a88bfc896b4d38d2064ebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7504367616a88bfc896b4d38d2064ebc");
        } else if (this.e == null || aVar == null) {
        } else {
            if (this.e.size() > 0 && this.e.get(this.e.size() - 1) != null) {
                aVar.a(aVar.b - this.e.get(this.e.size() - 1).b);
            } else {
                aVar.a(0L);
            }
            this.e.add(aVar);
        }
    }
}
