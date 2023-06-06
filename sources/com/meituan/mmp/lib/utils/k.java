package com.meituan.mmp.lib.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @TargetApi(21)
    public static void a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80be3a8f30ae08126c7fc52ca62d08ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80be3a8f30ae08126c7fc52ca62d08ca");
        } else if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 23) {
        } else {
            imageView.invalidateDrawable(imageView.getDrawable());
        }
    }
}
