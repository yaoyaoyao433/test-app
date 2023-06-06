package com.meituan.android.legwork.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c16c35dac8622e534faaf9b3e4fd7b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c16c35dac8622e534faaf9b3e4fd7b9d");
        } else if (b || context == null) {
        } else {
            b = true;
            com.sankuai.meituan.mtimageloader.config.a.a(context);
            com.sankuai.meituan.mtimageloader.config.a.a(5);
            com.sankuai.meituan.mtimageloader.config.a.c(720);
            com.sankuai.meituan.mtimageloader.config.a.b(true);
            com.sankuai.meituan.mtimageloader.config.a.a(new com.sankuai.waimai.picasso_loader.b());
        }
    }
}
