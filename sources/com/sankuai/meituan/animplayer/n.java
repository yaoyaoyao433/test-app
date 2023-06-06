package com.sankuai.meituan.animplayer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static float[] a(int i, int i2, k kVar, float[] fArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), kVar, fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "162d5eae88c574ff1d0f21a7b8918229", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "162d5eae88c574ff1d0f21a7b8918229");
        }
        float f = i;
        fArr[0] = (kVar.a * 1.0f) / f;
        float f2 = i2;
        fArr[1] = ((i2 - kVar.b) * 1.0f) / f2;
        fArr[2] = (kVar.a * 1.0f) / f;
        fArr[3] = (((i2 - kVar.b) - kVar.d) * 1.0f) / f2;
        fArr[4] = ((kVar.a + kVar.c) * 1.0f) / f;
        fArr[5] = ((i2 - kVar.b) * 1.0f) / f2;
        fArr[6] = ((kVar.a + kVar.c) * 1.0f) / f;
        fArr[7] = (((i2 - kVar.b) - kVar.d) * 1.0f) / f2;
        return fArr;
    }
}
