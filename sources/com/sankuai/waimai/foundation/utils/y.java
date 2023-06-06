package com.sankuai.waimai.foundation.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.toast.RooToast;
import com.sankuai.waimai.foundation.utils.x;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class y {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RooToast a(@NonNull View view, @NonNull String str, int i, int i2) {
        Object[] objArr = {view, str, -1, 17};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e242a27d11bf8f57fe2d44582097e79", RobustBitConfig.DEFAULT_VALUE) ? (RooToast) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e242a27d11bf8f57fe2d44582097e79") : RooToast.a(view, str, -1);
    }

    public static void a(@NonNull Activity activity, @NonNull String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77f841fd5db1715e5f8f5c6b9d9e62f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77f841fd5db1715e5f8f5c6b9d9e62f0");
        } else if (activity == null) {
        } else {
            a(activity.findViewById(16908290), str, -1, 17).a();
        }
    }

    public static void b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5934a49217c0e3c1b5edd1a513913db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5934a49217c0e3c1b5edd1a513913db9");
        } else {
            a((Context) activity, str, true, true);
        }
    }

    public static void a(Context context, String str, boolean z, boolean z2) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f46b6b4ae571f65ba6f37e824c38181d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f46b6b4ae571f65ba6f37e824c38181d");
        } else if (context != null) {
            if (!(context instanceof Activity)) {
                com.sankuai.waimai.foundation.utils.log.a.e("SnackbarUtil", "context must be activity if forceShow = true", new Object[0]);
            } else if (z2) {
                x.a a2 = x.a.a();
                a2.c = str;
                a2.a((Activity) context);
            } else {
                a((Activity) context, str);
            }
        }
    }
}
