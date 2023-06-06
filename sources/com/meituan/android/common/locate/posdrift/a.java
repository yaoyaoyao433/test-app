package com.meituan.android.common.locate.posdrift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(float[] fArr, int i) {
        Object[] objArr = {fArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c94cf54ce6d34995e70bbdb50c5e0959", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c94cf54ce6d34995e70bbdb50c5e0959")).doubleValue();
        }
        double d = 0.0d;
        for (int i2 = 0; i2 < i; i2++) {
            d += fArr[i2] * fArr[i2];
        }
        return Math.sqrt(d);
    }

    public static float[] a(ArrayList<float[]> arrayList, int i, int i2) {
        Object[] objArr = {arrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f7a39dac1ec7c177a1db0cedb83472b", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f7a39dac1ec7c177a1db0cedb83472b");
        }
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                fArr[i4] = fArr[i4] + (arrayList.get(i3)[i4] / i);
            }
        }
        return fArr;
    }
}
