package com.sankuai.waimai.mach.animator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.g;
import com.sankuai.waimai.mach.utils.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static float a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1cd056a9241cb959ed9a191fe5275f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1cd056a9241cb959ed9a191fe5275f4")).floatValue();
        }
        if (z || str.endsWith("px") || str.endsWith("dp")) {
            return a(str);
        }
        if (str.endsWith("deg")) {
            return g.a(str.substring(0, str.length() - 3));
        }
        return g.a(str);
    }

    public static float a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "669d31d8448a6d1a62bf4dabc4d281cf", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "669d31d8448a6d1a62bf4dabc4d281cf")).floatValue() : i.c(str);
    }

    public static long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bf2b0c0065edcfab7eb17ab66c6b70c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bf2b0c0065edcfab7eb17ab66c6b70c")).longValue();
        }
        if (str.endsWith("ms")) {
            return g.a(str.substring(0, str.length() - 2));
        }
        if (str.endsWith("s")) {
            return g.a(str.substring(0, str.length() - 1)) * 1000.0f;
        }
        return 1000L;
    }

    public static float[] b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98e98388564693895348094d13627e8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98e98388564693895348094d13627e8a");
        }
        String substring = str.substring(str.indexOf(CommonConstant.Symbol.BRACKET_LEFT) + 1, str.indexOf(CommonConstant.Symbol.BRACKET_RIGHT));
        if (substring.contains(CommonConstant.Symbol.COMMA)) {
            String[] split = substring.split(CommonConstant.Symbol.COMMA);
            float[] fArr = new float[split.length];
            for (int i = 0; i < split.length; i++) {
                fArr[i] = a(split[i], z);
            }
            return fArr;
        }
        return new float[]{a(substring, z)};
    }

    public static float c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b36b7ad34fa2f6779bc6f6f45599b560", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b36b7ad34fa2f6779bc6f6f45599b560")).floatValue();
        }
        if (str.endsWith("%")) {
            return g.a(str.substring(0, str.length() - 1)) * 0.01f;
        }
        return g.a(str);
    }

    public static String[] d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e60d45840d165273e280f4730827247e", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e60d45840d165273e280f4730827247e") : str.trim().split(StringUtil.SPACE);
    }
}
