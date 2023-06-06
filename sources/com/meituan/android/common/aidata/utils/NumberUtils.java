package com.meituan.android.common.aidata.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NumberUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int parseInt(@Nullable String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70c52cd2437055b0fb17204eb5872f67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70c52cd2437055b0fb17204eb5872f67")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? i : Integer.parseInt(trim);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static float parseFloat(@Nullable String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "588b99b9134f4fa09678faff029e2732", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "588b99b9134f4fa09678faff029e2732")).floatValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? f : Float.parseFloat(trim);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public static double parseDouble(@Nullable String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fdcc1f83b41d4e4870d1eef44b9b4412", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fdcc1f83b41d4e4870d1eef44b9b4412")).doubleValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? d : Double.parseDouble(trim);
            } catch (Exception unused) {
            }
        }
        return d;
    }
}
