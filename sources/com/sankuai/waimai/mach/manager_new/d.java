package com.sankuai.waimai.mach.manager_new;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static volatile d b;
    private ConcurrentHashMap<String, c> c;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbceec56e37b6343ce7a668263a70e6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbceec56e37b6343ce7a668263a70e6f");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0b689877b12bd44f2de2f4276859eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0b689877b12bd44f2de2f4276859eb");
        } else {
            this.c = new ConcurrentHashMap<>();
        }
    }

    private c c(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "435f98dadaf7875ae555c2276abc9f56", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "435f98dadaf7875ae555c2276abc9f56");
        }
        c cVar = this.c.get(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
        if (cVar == null) {
            com.sankuai.waimai.mach.manager_new.common.c.m("状态机中获取不到bundle | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo) + " | 返回EMPTY_STATE");
        }
        return cVar != null ? cVar : c.b;
    }

    public final c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab91c4d08b27919af5e33d67e35571a", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab91c4d08b27919af5e33d67e35571a");
        }
        c cVar = this.c.get(str);
        if (cVar == null) {
            com.sankuai.waimai.mach.manager_new.common.c.m("状态机中获取不到bundle | " + str + " | 返回EMPTY_STATE");
        }
        return cVar != null ? cVar : c.b;
    }

    public final void a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89165e38627a1424b3a1846ecf375f60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89165e38627a1424b3a1846ecf375f60");
            return;
        }
        String b2 = com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo);
        this.c.put(b2, new c(b2, bundleInfo));
        com.sankuai.waimai.mach.manager_new.common.c.m(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo) + " | 注册进入状态机");
    }

    public final void a(String str, BundleInfo bundleInfo) {
        Object[] objArr = {str, bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed5b1282c07ebdbd3d6692e634affc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed5b1282c07ebdbd3d6692e634affc1");
            return;
        }
        this.c.put(str, new c(str, bundleInfo));
        com.sankuai.waimai.mach.manager_new.common.c.m(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo) + " | 注册进入状态机");
    }

    public final void a(BundleInfo bundleInfo, int i) {
        Object[] objArr = {bundleInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1f5df1dfc40db47b444c1ea9e56c4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1f5df1dfc40db47b444c1ea9e56c4d");
            return;
        }
        c c = c(bundleInfo);
        if (c == c.b) {
            d(bundleInfo);
            return;
        }
        int a2 = c.a();
        if (a2 == i) {
            com.sankuai.waimai.mach.manager_new.common.c.l(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo) + " | 已经是 " + c.b(i) + " 状态，无需切换");
            return;
        }
        a(c.a(), i);
        c.a(i);
        com.sankuai.waimai.mach.manager_new.common.c.m(com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo) + " | 切换状态 | " + c.b(a2) + " -> " + c.b(i));
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b49755f6fd0ac8b2c36c84c5d901a3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b49755f6fd0ac8b2c36c84c5d901a3d");
            return;
        }
        c a2 = a(str);
        if (a2 == c.b) {
            b(str);
            return;
        }
        int a3 = a2.a();
        if (a3 == i) {
            com.sankuai.waimai.mach.manager_new.common.c.l(str + " | 已经是 " + c.b(i) + " 状态，无需切换");
            return;
        }
        a(a2.a(), i);
        a2.a(i);
        com.sankuai.waimai.mach.manager_new.common.c.m(str + " | 切换状态 | " + c.b(a3) + " -> " + c.b(i));
    }

    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0766f38f8f68470d265322d845f7f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0766f38f8f68470d265322d845f7f9");
        } else if (i < 4 || i2 >= i) {
        } else {
            com.sankuai.waimai.mach.manager_new.common.c.b("已经加载状态的Bundle不允许降级状态 | " + c.b(i) + " -> " + c.b(i2));
        }
    }

    private void d(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1a5903a80bd729ae548f74acbd9220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1a5903a80bd729ae548f74acbd9220");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.d.a("找不对Bundle对应的运行状态，致命错误 | " + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo));
    }

    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae43fbd6f43f8acecd21639c955bccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae43fbd6f43f8acecd21639c955bccf");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.d.a("找不对Bundle对应的运行状态，致命错误 | " + str);
    }

    public final boolean b(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50dbfeabc264ac26aab27d87483cfc9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50dbfeabc264ac26aab27d87483cfc9")).booleanValue() : a().c(bundleInfo).a() >= 3;
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3406befefe9eedd52c967d0db11a17", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3406befefe9eedd52c967d0db11a17")).booleanValue() : a().a(str).a() >= 5 && b.a().d(str);
    }
}
