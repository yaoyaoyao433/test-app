package com.sankuai.waimai.platform.widget.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ab;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Dialog a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9d0e14acdeea2bb1ba544f8c5b7ca61", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9d0e14acdeea2bb1ba544f8c5b7ca61");
        }
        try {
            AlertDialog create = new AlertDialog.Builder(activity, 2131559193).create();
            create.setCanceledOnTouchOutside(false);
            if (activity != null && !activity.isFinishing()) {
                create.show();
                Window window = create.getWindow();
                if (window != null) {
                    window.setContentView(R.layout.wm_common_view_progress_round);
                }
            }
            return create;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Dialog a(Activity activity, int i, int i2) {
        Object[] objArr = {activity, 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e955fea25ac6d1057952074551a81d0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e955fea25ac6d1057952074551a81d0a");
        }
        try {
            AlertDialog create = new AlertDialog.Builder(activity, 2131559193).create();
            create.setCanceledOnTouchOutside(false);
            if (activity != null && !activity.isFinishing()) {
                create.show();
                Window window = create.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = 0;
                attributes.y = 0;
                window.setAttributes(attributes);
                if (window != null) {
                    window.setContentView(R.layout.wm_common_view_progress_round);
                }
            }
            return create;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Dialog a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9cce9c2bbe6c1de9d8d79d3cbcd76b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9cce9c2bbe6c1de9d8d79d3cbcd76b7");
        }
        try {
            if (context instanceof Activity) {
                return a((Activity) context);
            }
            AlertDialog create = new AlertDialog.Builder(context, 2131559193).create();
            create.setCanceledOnTouchOutside(false);
            create.show();
            Window window = create.getWindow();
            if (window != null) {
                window.setContentView(R.layout.wm_common_view_progress_round);
            }
            return create;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Dialog a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "385b7f87c3d5c30b5e70f4bc5bb51779", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "385b7f87c3d5c30b5e70f4bc5bb51779");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = ab.a(context, (int) R.string.wm_widget_dialog_progressing);
            }
            return ProgressDialog.show(context, "", str, true, false);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd35a1a8831e1d6c0380a45a03e37df4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd35a1a8831e1d6c0380a45a03e37df4");
        } else if (dialog == null) {
        } else {
            try {
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("error", "exception: " + e.getLocalizedMessage(), new Object[0]);
            }
        }
    }

    public static void b(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d56d75c8de49d97b9006c7c584db6f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d56d75c8de49d97b9006c7c584db6f5");
        } else if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }
}
