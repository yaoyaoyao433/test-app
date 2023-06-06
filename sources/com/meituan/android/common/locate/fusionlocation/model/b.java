package com.meituan.android.common.locate.fusionlocation.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(Double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9680583ec7548ebf62dec80cd282b743", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9680583ec7548ebf62dec80cd282b743")).doubleValue();
        }
        double d = (dArr[1] == null || dArr[1].doubleValue() < 1244.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 20.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 8.0d) ? -0.03036291d : 0.08051082d : (dArr[1] == null || dArr[1].doubleValue() < 21.0d) ? -0.16197823d : 0.15880682d : (dArr[1] == null || dArr[1].doubleValue() < 2660.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 9.0d) ? -0.19029851d : -0.10576271d : (dArr[1] == null || dArr[1].doubleValue() < 4437.0d) ? -0.16519175d : -0.18036772d;
        double d2 = (dArr[1] == null || dArr[1].doubleValue() < 1106.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 20.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 8.0d) ? -0.022715492d : 0.07473374d : (dArr[1] == null || dArr[1].doubleValue() < 20.0d) ? -0.1471474d : 0.14146297d : (dArr[1] == null || dArr[1].doubleValue() < 1721.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 10.0d) ? -0.1555337d : -0.04710312d : (dArr[0] == null || dArr[0].doubleValue() < 20.0d) ? -0.15586637d : 0.16175266d;
        double d3 = (dArr[1] == null || dArr[1].doubleValue() < 952.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 20.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 8.0d) ? -0.019014958d : 0.069773644d : (dArr[1] == null || dArr[1].doubleValue() < 20.0d) ? -0.13282923d : 0.12904726d : (dArr[1] == null || dArr[1].doubleValue() < 1721.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 10.0d) ? -0.15572283d : -0.027240703d : (dArr[1] == null || dArr[1].doubleValue() < 3783.0d) ? -0.123698734d : -0.15154825d;
        return com.meituan.android.common.locate.fusionlocation.utils.b.d(d + d2 + d3 + ((dArr[1] == null || dArr[1].doubleValue() < 665.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 17.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 8.0d) ? -0.014015906d : 0.09174225d : (dArr[0] == null || dArr[0].doubleValue() < 20.0d) ? 0.012909698d : -0.052358206d : (dArr[1] == null || dArr[1].doubleValue() < 1489.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 10.0d) ? -0.17419271d : 0.0029479044d : (dArr[1] == null || dArr[1].doubleValue() < 2810.0d) ? -0.10309167d : -0.13703543d) + ((dArr[1] == null || dArr[1].doubleValue() < 1326.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 17.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 9.0d) ? -0.0011160575d : 0.08166d : (dArr[1] == null || dArr[1].doubleValue() < 105.0d) ? -0.011762563d : -0.08761051d : (dArr[1] == null || dArr[1].doubleValue() < 2605.0d) ? (dArr[0] == null || dArr[0].doubleValue() < 20.0d) ? -0.089891694d : 0.1833347d : (dArr[1] == null || dArr[1].doubleValue() < 3782.0d) ? -0.1137866d : -0.13247806d));
    }
}
