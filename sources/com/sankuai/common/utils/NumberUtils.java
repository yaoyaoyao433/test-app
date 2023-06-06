package com.sankuai.common.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class NumberUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static long parseLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "722056a6e2762aa0f0b6c645fe3b6b0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "722056a6e2762aa0f0b6c645fe3b6b0b")).longValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? j : Long.parseLong(trim);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public static int parseInt(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0d97639af56aec1afbd9c56d4eb6a4e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0d97639af56aec1afbd9c56d4eb6a4e0")).intValue();
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

    public static float parseFloat(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b685612c8071296c63c482af13354ce4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b685612c8071296c63c482af13354ce4")).floatValue();
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

    public static double parseDouble(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e7b2fbe9aa63698e2b690b69553ff7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e7b2fbe9aa63698e2b690b69553ff7e")).doubleValue();
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
