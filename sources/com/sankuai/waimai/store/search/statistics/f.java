package com.sankuai.waimai.store.search.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public f b;
    public String c;
    public String d;
    public int e;
    public final Map<String, Object> f;
    public Map<String, Object> g;
    private Map<String, Object> h;
    private Map<String, Object> i;
    private final Map<String, Object> j;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa4ec2aa8bb2117f1f339dccdac33c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa4ec2aa8bb2117f1f339dccdac33c7");
            return;
        }
        this.e = -1;
        this.f = new HashMap();
        this.j = new HashMap();
    }

    public final f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4630da32d0320a8739420a827a40e39c", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4630da32d0320a8739420a827a40e39c");
        }
        this.e = -1;
        this.b = null;
        this.c = "";
        this.d = "";
        this.f.clear();
        this.g = null;
        if (this.h != null) {
            this.h.clear();
        }
        if (this.i != null) {
            this.i.clear();
        }
        return this;
    }

    public final f a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6799fed3aee04fdc93fb472c6ab67b0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6799fed3aee04fdc93fb472c6ab67b0d");
        }
        this.f.put(str, obj);
        return this;
    }

    public final f b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ef7e31c1899d5df050233091974f79", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ef7e31c1899d5df050233091974f79");
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        this.h.put(str, obj);
        return this;
    }

    public final f c(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "917cb698b334965bf5d71ad5a9cd4d48", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "917cb698b334965bf5d71ad5a9cd4d48");
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        this.i.put(str, obj);
        return this;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa95f157b75a58ddff71333ae9d7697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa95f157b75a58ddff71333ae9d7697");
        } else if (context == null || TextUtils.isEmpty(this.c)) {
        } else {
            a(0);
            com.sankuai.waimai.store.manager.judas.b.b(context, this.c).b(this.j).a();
        }
    }

    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b811d0951320c82c5a6d8b93ce64c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b811d0951320c82c5a6d8b93ce64c86");
        } else if (context == null || TextUtils.isEmpty(this.d)) {
        } else {
            a(1);
            com.sankuai.waimai.store.manager.judas.b.a(context, this.d).b(this.j).a();
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4da0f5b42f11439f53ae01d3ab4301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4da0f5b42f11439f53ae01d3ab4301");
            return;
        }
        this.j.clear();
        a(this.j, this.b, i);
        b(i);
        c(i);
    }

    private void a(Map<String, Object> map, f fVar, int i) {
        Object[] objArr = {map, fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d55cc304df7316b8e067b9fd4ef80657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d55cc304df7316b8e067b9fd4ef80657");
        } else if (fVar == null) {
        } else {
            a(map, fVar.b, i);
            map.putAll(fVar.f);
            if (i == 0) {
                if (fVar.h != null) {
                    map.putAll(fVar.h);
                }
                if (fVar.d(i) != null) {
                    map.putAll(fVar.d(i));
                }
            }
            if (i == 1) {
                if (fVar.i != null) {
                    map.putAll(fVar.i);
                }
                if (fVar.e(i) != null) {
                    map.putAll(fVar.e(i));
                }
            }
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66cd2ab6780e464daefb0af42d877322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66cd2ab6780e464daefb0af42d877322");
            return;
        }
        this.j.putAll(this.f);
        if (i == 0 && this.h != null) {
            this.j.putAll(this.h);
        }
        if (i != 1 || this.i == null) {
            return;
        }
        this.j.putAll(this.i);
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37f1cef84917397b478b2fe3e4a0661c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37f1cef84917397b478b2fe3e4a0661c");
            return;
        }
        if (i == 0 && d(i) != null) {
            this.j.putAll(d(i));
        }
        if (i != 1 || e(i) == null) {
            return;
        }
        this.j.putAll(e(i));
    }

    private Map<String, Object> d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c1e9a3cccf25bb78e824e7b69d9ffe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c1e9a3cccf25bb78e824e7b69d9ffe");
        }
        Map<String, Object> map = null;
        if (i == 0 && this.g != null && !TextUtils.isEmpty(this.c)) {
            if (this.e == -1) {
                map = e.a(this.g, this.c);
            } else {
                map = e.a(this.g, this.c, this.e);
            }
        }
        e.a(map);
        return map;
    }

    private Map<String, Object> e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da54915f9cda2e9067d6440ca1cca3cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da54915f9cda2e9067d6440ca1cca3cd");
        }
        Map<String, Object> map = null;
        if (i == 1 && this.g != null && !TextUtils.isEmpty(this.d)) {
            if (this.e == -1) {
                map = e.a(this.g, this.d);
            } else {
                map = e.a(this.g, this.d, this.e);
            }
        }
        e.a(map);
        return map;
    }
}
