package com.sankuai.android.share.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33927b374ee60e205fc9f94c2c20b198", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33927b374ee60e205fc9f94c2c20b198") : TextUtils.isEmpty(str) ? "" : str.replace("/w.h/", "/");
    }

    public static String a(Context context, Bitmap bitmap) {
        Object[] objArr = {context, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c520eb3aef63d884f66a1b71cfc4efde", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c520eb3aef63d884f66a1b71cfc4efde");
        }
        Object a2 = com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", null, "1"), LyingkitKernel_share.SHARE_UTILSERVICE_GETLOCALIMAGEURL, context, bitmap);
        return a2 instanceof String ? (String) a2 : "";
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78db9f29735d6fb11f1a87d17c51965c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78db9f29735d6fb11f1a87d17c51965c")).intValue();
        }
        if (context == null || context.getResources() == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
