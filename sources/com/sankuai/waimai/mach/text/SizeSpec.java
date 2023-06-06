package com.sankuai.waimai.mach.text;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SizeSpec {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface MeasureSpecMode {
    }

    private static int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94b715dd5b2055449287a3c7dcb25579", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94b715dd5b2055449287a3c7dcb25579")).intValue() : View.MeasureSpec.makeMeasureSpec(i, i2);
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcd959de9bef9c709ef3fc52ee1e347e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcd959de9bef9c709ef3fc52ee1e347e")).intValue() : View.MeasureSpec.getMode(i);
    }

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfe8aed2ab1a729eb0530ec63a88d705", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfe8aed2ab1a729eb0530ec63a88d705")).intValue() : View.MeasureSpec.getSize(i);
    }

    public static int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09b7cc1e6310e0ce686975b6adab26c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09b7cc1e6310e0ce686975b6adab26c7")).intValue();
        }
        int a2 = a(i);
        if (a2 != Integer.MIN_VALUE) {
            if (a2 != 0) {
                if (a2 == 1073741824) {
                    return b(i);
                }
                throw new IllegalStateException("Unexpected size mode: " + a(i));
            }
            return i2;
        }
        return Math.min(b(i), i2);
    }

    public static int a(float f, YogaMeasureMode yogaMeasureMode) {
        Object[] objArr = {Float.valueOf(f), yogaMeasureMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59a9fcdc0e25e29dd20bdf159d960859", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59a9fcdc0e25e29dd20bdf159d960859")).intValue();
        }
        switch (yogaMeasureMode) {
            case EXACTLY:
                return b((int) Math.ceil(f), 1073741824);
            case UNDEFINED:
                return b(0, 0);
            case AT_MOST:
                return b((int) Math.ceil(f), Integer.MIN_VALUE);
            default:
                throw new IllegalArgumentException("Unexpected YogaMeasureMode: " + yogaMeasureMode);
        }
    }
}
