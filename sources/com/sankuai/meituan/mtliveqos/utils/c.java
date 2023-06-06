package com.sankuai.meituan.mtliveqos.utils;

import android.content.Context;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static com.sankuai.meituan.mtliveqos.utils.network.b b = new com.sankuai.meituan.mtliveqos.utils.network.b();

    public static float a() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "372e34d822eabf203d6420d154239ceb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "372e34d822eabf203d6420d154239ceb")).floatValue();
        }
        com.sankuai.meituan.mtliveqos.utils.network.b bVar = b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mtliveqos.utils.network.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "5cbf71dd37fe3a1b11de50164b67c3da", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Float) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "5cbf71dd37fe3a1b11de50164b67c3da")).floatValue();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (bVar.d == 0) {
                float a2 = bVar.a();
                bVar.d = currentTimeMillis;
                bVar.b = a2;
            }
            if (bVar.d > 0 && currentTimeMillis - bVar.d > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                float a3 = bVar.a();
                bVar.c = ((a3 - bVar.b) * 1000.0f) / ((float) (currentTimeMillis - bVar.d));
                bVar.d = currentTimeMillis;
                bVar.b = a3;
            }
            f = bVar.c;
        }
        return d.a(f);
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "509f48fe3340a36fbeee3058d5fe6bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "509f48fe3340a36fbeee3058d5fe6bfb")).intValue();
        }
        Object[] objArr2 = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mtliveqos.utils.network.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "661d596a42ee5573da07b95036fc7de5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "661d596a42ee5573da07b95036fc7de5")).intValue();
        }
        int a2 = com.sankuai.meituan.mtliveqos.utils.network.a.a(context);
        if (a2 == c.e.NETWORK_UNAVAILABLE.k) {
            return 6;
        }
        if (a2 == c.e.NETWORK_UNKNOWN.k) {
            return 0;
        }
        if (a2 == c.e.NETWORK_3G.k || a2 == c.e.NETWORK_2G.k) {
            return 3;
        }
        if (f < 100.0f) {
            return 5;
        }
        if (f < 300.0f) {
            return 4;
        }
        if (f < 550.0f) {
            return 3;
        }
        return f < 2000.0f ? 2 : 1;
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7632e599af9374c91fcfb70cc2ee63ce", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7632e599af9374c91fcfb70cc2ee63ce")).intValue() : com.sankuai.meituan.mtliveqos.utils.network.a.a(context);
    }
}
