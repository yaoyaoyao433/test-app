package com.sankuai.waimai.kit.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    private static com.sankuai.meituan.android.ui.widget.a a(@NonNull View view, @NonNull String str, int i, int i2) {
        Object[] objArr = {view, str, -1, 17};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a20f6634ab1a6e37ff5bd426db49dd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.android.ui.widget.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a20f6634ab1a6e37ff5bd426db49dd6");
        }
        com.sankuai.meituan.android.ui.widget.a c = new com.sankuai.meituan.android.ui.widget.a(view, str, -1).c(-1);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.android.ui.widget.a.d;
        if (PatchProxy.isSupport(objArr2, c, changeQuickRedirect2, false, "00f257806e0fa0f8ce24d67f7cab18a5", RobustBitConfig.DEFAULT_VALUE)) {
            c = (com.sankuai.meituan.android.ui.widget.a) PatchProxy.accessDispatch(objArr2, c, changeQuickRedirect2, false, "00f257806e0fa0f8ce24d67f7cab18a5");
        } else if (Build.VERSION.SDK_INT >= 17 && c.e != null) {
            TextView textView = (TextView) c.e.d.findViewById(R.id.snackbar_text);
            textView.setTextAlignment(1);
            textView.setGravity(17);
        }
        return c.e(17);
    }

    public static void a(@NonNull Activity activity, @NonNull String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8ec65c4ba1057d542606d1ccb9d180b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8ec65c4ba1057d542606d1ccb9d180b");
        } else if (activity == null) {
        } else {
            a(activity.findViewById(16908290), str, -1, 17).a();
        }
    }

    public static void b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffa312ee6035f6059e7c1d9d598060d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffa312ee6035f6059e7c1d9d598060d3");
        } else {
            a((Context) activity, str, true, true);
        }
    }

    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c7259277529dd5a92507f82e73d74be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c7259277529dd5a92507f82e73d74be");
            return;
        }
        Object[] objArr2 = {activity, Integer.valueOf(i), (byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ac3e5f2388116e7bc055e86800c84914", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ac3e5f2388116e7bc055e86800c84914");
        } else if (activity != null) {
            a((Context) activity, activity.getResources().getString(i), true, true);
        }
    }

    private static void a(Context context, String str, boolean z, boolean z2) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36951b8afecfe9780a7164bcfbc644c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36951b8afecfe9780a7164bcfbc644c1");
        } else if (context == null || !(context instanceof Activity)) {
        } else {
            if (z2) {
                b.a a2 = b.a.a();
                a2.c = str;
                a2.a((Activity) context);
                return;
            }
            a((Activity) context, str);
        }
    }
}
