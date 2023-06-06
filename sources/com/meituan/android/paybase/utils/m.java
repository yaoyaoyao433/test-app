package com.meituan.android.paybase.utils;

import android.content.Context;
import android.graphics.Typeface;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a = null;
    private static String b = "fonts/MTfin-Regular3.0.ttf";

    public static Typeface a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee862ea1fe1e95f612aedb1a95009126", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee862ea1fe1e95f612aedb1a95009126");
        }
        try {
            return Typeface.createFromAsset(context.getAssets(), b);
        } catch (Throwable th) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "FontUtils_getKeyboardFontType").a("message", th.getMessage()).b);
            return null;
        }
    }
}
