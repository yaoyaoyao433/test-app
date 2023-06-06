package com.sankuai.waimai.ad.view.mach.nested;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d c;
    LruCache<a, e> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;

        public a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b0404db0dbac3be1bf3dc56388e0b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b0404db0dbac3be1bf3dc56388e0b1");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6f567f570f0b7881b931e315c3d24d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6f567f570f0b7881b931e315c3d24d")).booleanValue();
            }
            if (obj instanceof a) {
                return TextUtils.equals(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7753e6f168914d662ef718be7adc2f22", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7753e6f168914d662ef718be7adc2f22")).intValue() : this.b.hashCode();
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd4a3db496ea88555272a08b1801b2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd4a3db496ea88555272a08b1801b2c");
            return;
        }
        this.b = new LruCache<a, e>(10) { // from class: com.sankuai.waimai.ad.view.mach.nested.d.1
            public static ChangeQuickRedirect a;

            {
                super(10);
            }

            @Override // android.util.LruCache
            public final /* synthetic */ e create(a aVar) {
                a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba9f4ec7aa3bbfb7e4de6769a4ad5dcb", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba9f4ec7aa3bbfb7e4de6769a4ad5dcb") : com.sankuai.waimai.mach.manager.a.a().a(aVar2.b, (String) null, aVar2.c, aVar2.d);
            }
        };
        com.meituan.android.singleton.b.a.registerComponentCallbacks(new ComponentCallbacks() { // from class: com.sankuai.waimai.ad.view.mach.nested.d.2
            public static ChangeQuickRedirect a;

            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d7e7619e3d8eff13e8a3df2c302a90f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d7e7619e3d8eff13e8a3df2c302a90f");
                } else {
                    d.this.b.evictAll();
                }
            }
        });
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32dd0b7d4fba4e89fd7c462c736977e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32dd0b7d4fba4e89fd7c462c736977e3");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }
}
