package com.meituan.android.identifycardrecognizer.utils;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.identifycardrecognizer.bean.CustomColorInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static int b;
    private static int c;
    private static int d;

    public static void a(Context context, CustomColorInfo customColorInfo) {
        Object[] objArr = {context, customColorInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f865239a70436f92e90871ffecabc943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f865239a70436f92e90871ffecabc943");
            return;
        }
        if (customColorInfo != null && !TextUtils.isEmpty(customColorInfo.getCommonColor())) {
            try {
                b = Color.parseColor(customColorInfo.getCommonColor());
            } catch (IllegalArgumentException e) {
                if (context != null) {
                    b = context.getResources().getColor(R.color.identifycard_recognizer_color_default);
                }
                com.meituan.android.paybase.common.analyse.a.a((Exception) e);
            }
        } else if (context != null) {
            b = context.getResources().getColor(R.color.identifycard_recognizer_color_default);
        }
        if (customColorInfo != null && !TextUtils.isEmpty(customColorInfo.getDemoCheckedColor())) {
            try {
                c = Color.parseColor(customColorInfo.getDemoCheckedColor());
            } catch (IllegalArgumentException e2) {
                if (context != null) {
                    c = context.getResources().getColor(R.color.identifycard_recognizer_color_demo_positive);
                }
                com.meituan.android.paybase.common.analyse.a.a((Exception) e2);
            }
        } else if (context != null) {
            c = context.getResources().getColor(R.color.identifycard_recognizer_color_demo_positive);
        }
        if (customColorInfo == null || TextUtils.isEmpty(customColorInfo.getDemoFaultColor())) {
            if (context != null) {
                d = context.getResources().getColor(R.color.identifycard_recognizer_color_demo_negative);
                return;
            }
            return;
        }
        try {
            d = Color.parseColor(customColorInfo.getDemoFaultColor());
        } catch (IllegalArgumentException e3) {
            if (context != null) {
                d = context.getResources().getColor(R.color.identifycard_recognizer_color_demo_negative);
            }
            com.meituan.android.paybase.common.analyse.a.a((Exception) e3);
        }
    }
}
