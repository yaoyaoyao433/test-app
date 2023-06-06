package com.sankuai.waimai.foundation.location.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static float a(com.sankuai.waimai.foundation.location.model.a aVar, com.sankuai.waimai.foundation.location.model.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90b0bdebdca129b821ddd6f32bbb0728", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90b0bdebdca129b821ddd6f32bbb0728")).floatValue();
        }
        try {
            double d = aVar.d;
            double d2 = d * 0.01745329251994329d;
            double d3 = aVar.c * 0.01745329251994329d;
            double d4 = aVar2.d * 0.01745329251994329d;
            double d5 = aVar2.c * 0.01745329251994329d;
            double sin = Math.sin(d2);
            double sin2 = Math.sin(d3);
            double cos = Math.cos(d2);
            double cos2 = Math.cos(d3);
            double sin3 = Math.sin(d4);
            double sin4 = Math.sin(d5);
            double cos3 = Math.cos(d4);
            double cos4 = Math.cos(d5);
            double[] dArr = {cos * cos2, cos2 * sin, sin2};
            double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
            return (float) (Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d);
        } catch (Throwable th) {
            b.a(th);
            return 0.0f;
        }
    }
}
