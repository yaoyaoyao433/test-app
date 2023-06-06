package com.sankuai.waimai.store.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class am {
    public static ChangeQuickRedirect a;
    private static long b = System.currentTimeMillis();
    private static ap<PopupWindow> c = null;
    private static int d = 2000;
    private static int e = 3000;

    @Deprecated
    public static void a(Context context, String str) {
        Activity c2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3e74877cd68ca756c2b8b4d459c9974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3e74877cd68ca756c2b8b4d459c9974");
            return;
        }
        if (context instanceof Activity) {
            c2 = (Activity) context;
        } else {
            c2 = com.sankuai.waimai.store.manager.appinfo.a.c();
        }
        if (c2 != null) {
            a(c2, str);
        }
    }

    @Deprecated
    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09a937f1bc5ed608c97fa4c9bba93846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09a937f1bc5ed608c97fa4c9bba93846");
        } else if (context != null) {
            a(context, context.getResources().getString(i));
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "304640fb36d0f6b4816e8d40c7414b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "304640fb36d0f6b4816e8d40c7414b0a");
        } else {
            com.sankuai.waimai.store.util.toast.b.b(activity, str);
        }
    }

    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d416d2cf90be03559b6ae64d195a3f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d416d2cf90be03559b6ae64d195a3f30");
            return;
        }
        Object[] objArr2 = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.util.toast.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bde2ccb955c8e75de88cafe6680ae0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bde2ccb955c8e75de88cafe6680ae0f9");
            return;
        }
        Object[] objArr3 = {activity, Integer.valueOf(i), (byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.util.toast.b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "eb2e917898420be864be4c9769318ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "eb2e917898420be864be4c9769318ba9");
        } else if (activity != null) {
            com.sankuai.waimai.store.util.toast.b.a((Context) activity, activity.getResources().getString(i), true, true);
        }
    }

    public static void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05fcca4e26088f2fc9a14c04bba83962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05fcca4e26088f2fc9a14c04bba83962");
            return;
        }
        Object[] objArr2 = {view, str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.util.toast.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3100da53e093dc0b4ac823791684489c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3100da53e093dc0b4ac823791684489c");
        } else if (view != null) {
            View findViewById = view.getRootView().findViewById(16908290);
            if (findViewById == null || !(findViewById instanceof ViewGroup)) {
                if (com.sankuai.waimai.store.config.k.a()) {
                    throw new IllegalArgumentException("view error ! ");
                }
                return;
            }
            Object[] objArr3 = {findViewById, str};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.util.toast.b.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "57e76f9d059ebd1b911a9916740bb33c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "57e76f9d059ebd1b911a9916740bb33c");
            } else {
                com.sankuai.waimai.store.util.toast.b.a(findViewById, str, -1, 17).a();
            }
        }
    }

    public static void a(Dialog dialog, String str, Context context) {
        Object[] objArr = {dialog, str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56c7dbf43688132be4682a694845d6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56c7dbf43688132be4682a694845d6d9");
        } else if (dialog == null || dialog.getWindow() == null || !dialog.isShowing()) {
            if (b.a(context)) {
                return;
            }
            a(context, str);
        } else {
            View decorView = dialog.getWindow().getDecorView();
            if (decorView == null) {
                return;
            }
            a(decorView, str);
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b79a6ec626a5f60f3fc60dcf48fe1174", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b79a6ec626a5f60f3fc60dcf48fe1174")).booleanValue() : com.sankuai.waimai.store.config.i.h().a("toast/newStyle", false);
    }

    public static void a(Context context, Window window, String str, String str2) {
        Object[] objArr = {context, window, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f086279211e54a17b3224fd929c7d57d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f086279211e54a17b3224fd929c7d57d");
        } else if (b.a(context)) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            PopupWindow a2 = c != null ? c.a() : null;
            if (currentTimeMillis - b < d && a2 != null) {
                ar.a(a2);
            }
            final PopupWindow popupWindow = new PopupWindow(context);
            b = currentTimeMillis;
            ap<PopupWindow> apVar = new ap<>();
            c = apVar;
            apVar.a(popupWindow);
            popupWindow.setBackgroundDrawable(context.getDrawable(R.drawable.wm_sc_common_toast_bg));
            popupWindow.setFocusable(false);
            popupWindow.setOutsideTouchable(false);
            View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_common_toast, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.wm_sc_common_toast_msg)).setText(str2);
            popupWindow.setContentView(inflate);
            com.sankuai.waimai.platform.utils.p.a(popupWindow, window.getDecorView(), 17, 0, (-(context.getResources().getDisplayMetrics().heightPixels - window.getDecorView().getHeight())) / 2);
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.util.am.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40933c57dc66dc4f493cf7160a992778", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40933c57dc66dc4f493cf7160a992778");
                    } else {
                        ar.a(popupWindow);
                    }
                }
            }, d, str);
        }
    }
}
