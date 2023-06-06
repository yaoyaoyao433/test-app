package com.sankuai.waimai.store.util.toast;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.util.toast.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static com.sankuai.meituan.android.ui.widget.a a(@NonNull View view, @NonNull String str, int i, int i2) {
        Object[] objArr = {view, str, -1, 17};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3e777b390747ccaa3ddebf3d5a3686c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.android.ui.widget.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3e777b390747ccaa3ddebf3d5a3686c") : new com.sankuai.meituan.android.ui.widget.a(view, str, -1).c(-1).e(17);
    }

    public static void a(@NonNull Activity activity, @NonNull String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ae17a166d6869c56be1006e6f85424a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ae17a166d6869c56be1006e6f85424a");
        } else if (activity == null) {
        } else {
            a(activity.findViewById(16908290), str, -1, 17).a();
        }
    }

    public static void b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5193746704e3ba7b56980bca0fca990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5193746704e3ba7b56980bca0fca990");
        } else {
            a((Context) activity, str, true, true);
        }
    }

    public static void a(Context context, String str, boolean z, boolean z2) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d12a60edac8854667d02a8106c4b3bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d12a60edac8854667d02a8106c4b3bd6");
        } else if (context != null) {
            if (!(context instanceof Activity)) {
                if (k.a()) {
                    throw new IllegalArgumentException("context must be activity if forceShow = true");
                }
                com.sankuai.shangou.stone.util.log.a.d("SnackbarUtil", "context must be activity if forceShow = true", new Object[0]);
            } else if (z2) {
                a.C1334a a2 = a.C1334a.a();
                a2.c = str;
                a2.a((Activity) context);
            } else {
                a((Activity) context, str);
            }
        }
    }
}
