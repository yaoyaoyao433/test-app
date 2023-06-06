package com.sankuai.waimai.store.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class s {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(T t);

        void b(T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b<T> {
        void a(T t);

        void b(T t);
    }

    public static void a(GoodsSpu goodsSpu, a<GoodsSpu> aVar) {
        Object[] objArr = {goodsSpu, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1476fefc43b0e327a4689e1084991618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1476fefc43b0e327a4689e1084991618");
        } else if (com.sankuai.shangou.stone.util.p.a(aVar, goodsSpu)) {
        } else {
            if (goodsSpu != null && com.sankuai.shangou.stone.util.i.e(Double.valueOf(goodsSpu.memberPrice), Double.valueOf(0.0d)) && !goodsSpu.isBuyPlus()) {
                aVar.b(goodsSpu);
            } else {
                aVar.a(goodsSpu);
            }
        }
    }

    public static void a(boolean z, GoodsSku goodsSku, a<GoodsSku> aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), goodsSku, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a909b33391323b94fc307f6c4490ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a909b33391323b94fc307f6c4490ed0");
        } else if (com.sankuai.shangou.stone.util.p.a(aVar, goodsSku)) {
        } else {
            if (!com.sankuai.shangou.stone.util.i.e(Double.valueOf(goodsSku.memberPrice), Double.valueOf(0.0d))) {
                aVar.a(goodsSku);
            } else if (z) {
                aVar.b(goodsSku);
            } else {
                double d = goodsSku.price;
                double d2 = goodsSku.originPrice;
                double d3 = goodsSku.memberPrice;
                if (Math.abs(d - d2) < 1.0E-5d) {
                    aVar.b(goodsSku);
                } else if (d3 < d) {
                    aVar.b(goodsSku);
                } else {
                    aVar.a(goodsSku);
                }
            }
        }
    }
}
