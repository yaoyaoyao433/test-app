package com.meituan.android.paycommon.lib.utils;

import android.support.constraint.R;
import android.widget.ImageView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w {
    public static ChangeQuickRedirect a;

    public static void a(String str, ImageView imageView) {
        Object[] objArr = {str, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45444f569171e60031634a28f5859789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45444f569171e60031634a28f5859789");
            return;
        }
        try {
            com.meituan.android.paycommon.lib.config.a.a().r().a(str).d(imageView.getTag(R.id.pay__gif_play_count) instanceof Integer ? ((Integer) imageView.getTag(R.id.pay__gif_play_count)).intValue() : 0).a(imageView);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "WebpImageLoader_load").a("message", e.getMessage()).b);
        }
    }

    public static void a(String str, ImageView imageView, int i, int i2) {
        Object[] objArr = {str, imageView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "109853893072daf3b3c53f870cbde9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "109853893072daf3b3c53f870cbde9f7");
            return;
        }
        try {
            com.meituan.android.paycommon.lib.config.a.a().r().a(str).c(i).b(i2).d(imageView.getTag(R.id.pay__gif_play_count) instanceof Integer ? ((Integer) imageView.getTag(R.id.pay__gif_play_count)).intValue() : 0).a(imageView);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "WebpImageLoader_load").a("message", e.getMessage()).b);
        }
    }
}
