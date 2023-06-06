package com.sankuai.meituan.android.knb.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class UIUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void showToast(Activity activity, CharSequence charSequence, int i) {
        Object[] objArr = {activity, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76b490596075ff591f001ed7f555b397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76b490596075ff591f001ed7f555b397");
            return;
        }
        try {
            new a(activity, charSequence, i).a();
        } catch (Throwable unused) {
        }
    }

    public static void showToast(View view, CharSequence charSequence, int i) {
        Object[] objArr = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca3ca54195a54cb180a4775563987461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca3ca54195a54cb180a4775563987461");
            return;
        }
        try {
            new a(view, charSequence, i).a();
        } catch (Throwable unused) {
        }
    }

    public static void showShortToast(Activity activity, CharSequence charSequence) {
        Object[] objArr = {activity, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc39c40f5f81b1f2a22b8d50e0ddd39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc39c40f5f81b1f2a22b8d50e0ddd39a");
        } else {
            showToast(activity, charSequence, -1);
        }
    }

    public static void showLongToast(Activity activity, CharSequence charSequence) {
        Object[] objArr = {activity, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd73c5f3e246f7f959a20ea1df61e9f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd73c5f3e246f7f959a20ea1df61e9f2");
        } else {
            showToast(activity, charSequence, 0);
        }
    }

    public static void showShortToast(View view, CharSequence charSequence) {
        Object[] objArr = {view, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45492524c005517fbb511438cfaacf59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45492524c005517fbb511438cfaacf59");
        } else {
            showToast(view, charSequence, -1);
        }
    }

    public static void showLongToast(View view, CharSequence charSequence) {
        Object[] objArr = {view, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41ac0a21c02e76580fc0a71beeb2e138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41ac0a21c02e76580fc0a71beeb2e138");
        } else {
            showToast(view, charSequence, 0);
        }
    }

    public static boolean isActivityLive(Activity activity) {
        boolean z = false;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ef35d333a199970a17ace5e41cf62f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ef35d333a199970a17ace5e41cf62f8")).booleanValue();
        }
        if (activity != null && !activity.isFinishing()) {
            z = true;
        }
        return (!z || Build.VERSION.SDK_INT < 17) ? z : !activity.isDestroyed();
    }

    public static int getStatusBarHeight(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a98577e51f72009747a6026c66f57bfa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a98577e51f72009747a6026c66f57bfa")).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
