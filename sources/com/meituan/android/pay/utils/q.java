package com.meituan.android.pay.utils;

import android.content.Context;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f3284c784cd1a3d537885855e247867", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f3284c784cd1a3d537885855e247867");
        }
        try {
            return com.sankuai.meituan.abtestv2.d.a(context).a("ab_A_group_pay_ocr_card");
        } catch (Exception e) {
            com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OcrAbTestUtils_getStrategy").a("message", e.getMessage()).b, str);
            return "a";
        }
    }
}
