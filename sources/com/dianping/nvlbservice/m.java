package com.dianping.nvlbservice;

import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum m {
    SHARK(1, TrafficRecord.Detail.TUNNEL_SHARK),
    SHARK_WHALE(2, "shark-whale"),
    QUIC(4, "quic"),
    PIKE(8, "pike"),
    PIKE_IPV6(16, "pike-ipv6");
    
    public static ChangeQuickRedirect a;
    public int g;
    public String h;

    public static m valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bea5d3788d845aa48a619bd24441e505", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bea5d3788d845aa48a619bd24441e505") : (m) Enum.valueOf(m.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0629ef746f2f7f13f7aeb8e3381de6ce", RobustBitConfig.DEFAULT_VALUE) ? (m[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0629ef746f2f7f13f7aeb8e3381de6ce") : (m[]) values().clone();
    }

    m(int i2, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f8a66014149ccc0bebc1b198316c3be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f8a66014149ccc0bebc1b198316c3be");
            return;
        }
        this.g = i2;
        this.h = str;
    }

    public static m[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd689b085aabcf95d759339f7c4d79d5", RobustBitConfig.DEFAULT_VALUE) ? (m[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd689b085aabcf95d759339f7c4d79d5") : valuesCustom();
    }
}
