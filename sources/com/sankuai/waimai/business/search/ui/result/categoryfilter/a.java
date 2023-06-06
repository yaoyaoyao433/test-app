package com.sankuai.waimai.business.search.ui.result.categoryfilter;

import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Interpolator {
    public static ChangeQuickRedirect a = null;
    private static int b = 4096;
    private float[] c;
    private float[] d;
    private String e;

    private float a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98b548766659c1cf5b2473159b7410a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98b548766659c1cf5b2473159b7410a")).floatValue();
        }
        float f4 = 1.0f - f;
        float f5 = 3.0f * f4;
        return (f4 * f5 * f * f2) + (f5 * f * f * f3) + (f * f * f);
    }

    public a(float f, float f2, float f3, float f4, String str) {
        Object[] objArr = {Float.valueOf(0.4f), Float.valueOf(0.0f), Float.valueOf(0.2f), Float.valueOf(1.0f), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1dddf201f9c84c41352378bdf0aa497", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1dddf201f9c84c41352378bdf0aa497");
            return;
        }
        this.c = new float[b + 1];
        this.d = new float[b + 1];
        for (int i = 0; i <= b; i++) {
            float f5 = (i * 1.0f) / b;
            this.c[i] = a(f5, 0.4f, 0.2f);
            this.d[i] = a(f5, 0.0f, 1.0f);
        }
        this.e = str;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e93a25d05fb8e73c228952f6bae7bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e93a25d05fb8e73c228952f6bae7bb")).floatValue();
        }
        int i = 0;
        while (true) {
            if (i > b) {
                i = 0;
                break;
            } else if (f <= this.c[i]) {
                break;
            } else {
                i++;
            }
        }
        return this.d[i];
    }
}
