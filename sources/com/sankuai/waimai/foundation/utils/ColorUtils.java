package com.sankuai.waimai.foundation.utils;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ColorUtils {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Lightness {
    }

    @ColorInt
    private static int a(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d557d5b60fb76c6ee7844b5c74d9d53e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d557d5b60fb76c6ee7844b5c74d9d53e")).intValue() : (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    @ColorInt
    public static int a(String str, @ColorInt int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7190c1dd5bc2c5fd2fe47828bdfad8e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7190c1dd5bc2c5fd2fe47828bdfad8e4")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Color.parseColor(str);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    @ColorInt
    public static Integer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ed8b19b335bf5ecb2522cd290683f01", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ed8b19b335bf5ecb2522cd290683f01");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @ColorInt
    public static int a(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(0.8f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a23cc460577ac4001db4aeacdd84ff9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a23cc460577ac4001db4aeacdd84ff9")).intValue() : a(i, (int) ((byte) (o.a(0.8f, 0.0f, 1.0f) * 255.0f)));
    }
}
