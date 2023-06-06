package com.sankuai.waimai.platform.net.weaknetwork.strategy;

import com.dianping.nvnetwork.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"www.baidu.com", "www.qq.com", "www.meituan.com"};
    private boolean c;
    private double d;
    private double e;
    private double f;
    private double g;

    public e(com.sankuai.waimai.platform.net.weaknetwork.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e18057ad9d18eb3c31a267f0863d9cd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e18057ad9d18eb3c31a267f0863d9cd8");
            return;
        }
        this.c = true;
        this.d = 100.0d;
        this.e = 200.0d;
        this.f = 50.0d;
        this.g = 100.0d;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d16e6c57aa101386b4593fd071dcac39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d16e6c57aa101386b4593fd071dcac39");
        } else if (aVar != null) {
            this.c = aVar.c;
            this.d = aVar.n;
            this.e = aVar.o;
            this.f = aVar.p;
            this.g = aVar.q;
        }
    }

    private com.sankuai.waimai.platform.net.a a(float f, boolean z) {
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18124cb838a78c7f3afdac67ba39d237", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.net.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18124cb838a78c7f3afdac67ba39d237");
        }
        double d = f;
        if (d >= (z ? this.e : this.d)) {
            return com.sankuai.waimai.platform.net.a.POOR;
        }
        if (d >= (z ? this.g : this.f)) {
            return com.sankuai.waimai.platform.net.a.GOOD;
        }
        return com.sankuai.waimai.platform.net.a.EXCELLENT;
    }

    public final com.sankuai.waimai.platform.net.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35aa3bc0948cdfd540f919c0907fef5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.net.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35aa3bc0948cdfd540f919c0907fef5b");
        }
        int h = g.h();
        if (this.c && g.g() == 10000 && h < Integer.MAX_VALUE) {
            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "NetDetectionStrategy doStrategy tcp enable : true , rtt : %d, weakPingRtt : %f ", Integer.valueOf(h), Double.valueOf(this.d));
            com.sankuai.waimai.platform.capacity.log.c.a().a(1000, h, "waimai_network_ping_rtt_shark_success");
            return a(h, true);
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "NetDetectionStrategy doStrategy tcp enable : false , weakPingRtt : %f ", Double.valueOf(this.d));
        com.sankuai.waimai.platform.net.weaknetwork.b bVar = null;
        for (String str : b) {
            bVar = com.sankuai.waimai.platform.net.weaknetwork.c.a(str, 3, 3.0d);
            com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "NetDetectionStrategy detectNetState pingResponse : " + bVar, new Object[0]);
            if (bVar != null) {
                float f = bVar.d;
                com.sankuai.waimai.platform.net.a a2 = a(f, false);
                if (a2.f > com.sankuai.waimai.platform.net.a.POOR.f) {
                    com.sankuai.waimai.platform.capacity.log.c.a().a(1000, (int) f, "waimai_network_ping_rtt_okhttp_success");
                    return a2;
                }
            }
        }
        if (bVar == null) {
            com.sankuai.waimai.platform.capacity.log.c.a().a(1000, 1000, "waimai_network_ping_rtt_okhttp_failed");
            return com.sankuai.waimai.platform.net.a.POOR;
        }
        com.sankuai.waimai.platform.net.weaknetwork.b a3 = com.sankuai.waimai.platform.net.weaknetwork.c.a(com.sankuai.waimai.platform.net.util.f.b, 3, 3.0d);
        com.sankuai.waimai.foundation.utils.log.a.c("WeakNetwork", "NetDetectionStrategy detectNetState pingResponse : " + a3, new Object[0]);
        if (a3 == null) {
            com.sankuai.waimai.platform.capacity.log.c.a().a(1000, 1000, "waimai_network_ping_rtt_okhttp_failed");
            return com.sankuai.waimai.platform.net.a.POOR;
        }
        float f2 = a3.d;
        com.sankuai.waimai.platform.capacity.log.c.a().a(1000, (int) f2, "waimai_network_ping_rtt_okhttp_success");
        return a(f2, false);
    }
}
