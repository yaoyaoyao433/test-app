package com.sankuai.waimai.machpro;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.module.MPModule;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f m;
    public com.sankuai.waimai.machpro.adapter.a b;
    public com.sankuai.waimai.machpro.adapter.c c;
    public com.sankuai.waimai.machpro.adapter.e d;
    public com.sankuai.waimai.machpro.adapter.d e;
    public ConcurrentHashMap<String, com.sankuai.waimai.machpro.module.a<? extends MPModule>> f;
    public ConcurrentHashMap<String, com.sankuai.waimai.machpro.component.b<? extends MPComponent<? extends View>>> g;
    public Context h;
    public c i;
    public com.sankuai.waimai.machpro.monitor.a j;
    public List<com.sankuai.waimai.machpro.container.e> k;
    public volatile boolean l;
    private final Map<String, Integer> n;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c757d840ce41d319a8c63447ebcb4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c757d840ce41d319a8c63447ebcb4b");
            return;
        }
        this.n = new ConcurrentHashMap();
        this.k = new LinkedList();
        this.f = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74c07605720eeb700207a3d3eebbef40", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74c07605720eeb700207a3d3eebbef40");
        }
        if (m == null) {
            synchronized (f.class) {
                if (m == null) {
                    m = new f();
                }
            }
        }
        return m;
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecec919df510cf03505d0d8130a4e5f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecec919df510cf03505d0d8130a4e5f2")).intValue();
        }
        if (this.n.containsKey(str)) {
            return this.n.get(str).intValue();
        }
        return -1;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9149e861fa8a77e4c77a0f86e26c41b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9149e861fa8a77e4c77a0f86e26c41b");
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            AssetManager assets = this.h.getResources().getAssets();
            String[] list = assets.list("mach/template/prod" + File.separator + str);
            if (list != null && list.length > 0) {
                this.n.put(str, 1);
                return;
            }
            this.n.put(str, 0);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a(str + " | 内置Bundle初始化失败！！！" + e.getMessage());
        }
    }

    public final com.sankuai.waimai.machpro.container.d c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f475a462e5fd1e18b7b786de2721ac52", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.container.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f475a462e5fd1e18b7b786de2721ac52");
        }
        for (com.sankuai.waimai.machpro.container.e eVar : this.k) {
            if (eVar != null) {
                return eVar.a();
            }
        }
        return null;
    }

    public final <T extends MPModule> void a(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "355f38b4e2fca36cd9214e7c7622294f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "355f38b4e2fca36cd9214e7c7622294f");
        } else if (TextUtils.isEmpty(str) || cls == null) {
        } else {
            this.f.put(str, new com.sankuai.waimai.machpro.module.a<>(str, cls));
        }
    }

    public final com.sankuai.waimai.machpro.module.a<? extends MPModule> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705157bd92d37f9686e23e378dddf594", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.module.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705157bd92d37f9686e23e378dddf594");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f.get(str);
    }

    public final <T extends MPComponent<? extends View>> void b(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab42fb5b86f6f70fe52589f45afbad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab42fb5b86f6f70fe52589f45afbad8");
        } else if (TextUtils.isEmpty(str) || cls == null) {
        } else {
            this.g.put(str, new com.sankuai.waimai.machpro.component.b<>(str, cls));
        }
    }

    public final com.sankuai.waimai.machpro.component.b<? extends MPComponent<? extends View>> e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff7604aa8cbac2b8eff54bc4b02d709", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.component.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff7604aa8cbac2b8eff54bc4b02d709");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.g.get(str);
    }
}
