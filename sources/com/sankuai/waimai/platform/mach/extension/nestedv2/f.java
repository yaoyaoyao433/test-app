package com.sankuai.waimai.platform.mach.extension.nestedv2;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f c;
    LruCache<a, com.sankuai.waimai.mach.manager.cache.e> b;
    private ConcurrentHashMap<String, d> d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;

        public static a a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9278b0ef85d0a67d974176d45265236f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9278b0ef85d0a67d974176d45265236f") : new a(str, str2, str3);
        }

        private a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e09678822412ce890c2f56a21fb8ff6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e09678822412ce890c2f56a21fb8ff6");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db52b4571cb9ed22f4550c6447cc633", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db52b4571cb9ed22f4550c6447cc633")).booleanValue();
            }
            if (obj instanceof a) {
                return TextUtils.equals(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c36baec42a571c5e2bd0035e581ff4a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c36baec42a571c5e2bd0035e581ff4a")).intValue() : this.b.hashCode();
        }
    }

    public final void a(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34d394abc97de447ec43e4682b2bb7ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34d394abc97de447ec43e4682b2bb7ee");
        } else {
            this.d.putIfAbsent(str, dVar);
        }
    }

    public final d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3537953dcba0dd257070d98590d60bcc", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3537953dcba0dd257070d98590d60bcc") : this.d.get(str);
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab111ab95b65bd8e9975836fa4ffaae0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab111ab95b65bd8e9975836fa4ffaae0");
            return;
        }
        this.b = new LruCache<a, com.sankuai.waimai.mach.manager.cache.e>(10) { // from class: com.sankuai.waimai.platform.mach.extension.nestedv2.f.1
            public static ChangeQuickRedirect a;

            {
                super(10);
            }

            @Override // android.util.LruCache
            public final /* synthetic */ com.sankuai.waimai.mach.manager.cache.e create(a aVar) {
                a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "843f920133946fda3709dbb6f889136c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.manager.cache.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "843f920133946fda3709dbb6f889136c") : com.sankuai.waimai.mach.manager.a.a().a(aVar2.b, (String) null, aVar2.c, aVar2.d);
            }
        };
        this.d = new ConcurrentHashMap<>();
        com.meituan.android.singleton.b.a.registerComponentCallbacks(new ComponentCallbacks() { // from class: com.sankuai.waimai.platform.mach.extension.nestedv2.f.2
            public static ChangeQuickRedirect a;

            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2988048525f7f8b117364ff87ccb62f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2988048525f7f8b117364ff87ccb62f1");
                } else {
                    f.this.b.evictAll();
                }
            }
        });
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bb699a435eeb9b1d3d43b363ef5a4b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bb699a435eeb9b1d3d43b363ef5a4b8");
        }
        if (c == null) {
            synchronized (f.class) {
                if (c == null) {
                    c = new f();
                }
            }
        }
        return c;
    }
}
