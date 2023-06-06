package com.sankuai.waimai.foundation.core.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static Dialog a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09c1d8f90364fb26e702227d89e99492", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09c1d8f90364fb26e702227d89e99492");
        }
        try {
            AlertDialog create = new AlertDialog.Builder(activity, R.style.WmCoreDialog).create();
            create.setCanceledOnTouchOutside(false);
            if (activity != null && !activity.isFinishing()) {
                create.show();
                Window window = create.getWindow();
                if (window != null) {
                    window.setContentView(R.layout.wm_core_view_progress_round);
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2f616f99b3edf06cf6ae5ea44b22863", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2f616f99b3edf06cf6ae5ea44b22863");
        }
        try {
            if (context instanceof Activity) {
                return a((Activity) context);
            }
            AlertDialog create = new AlertDialog.Builder(context, R.style.WmCoreDialog).create();
            create.setCanceledOnTouchOutside(false);
            create.show();
            Window window = create.getWindow();
            if (window != null) {
                window.setContentView(R.layout.wm_core_view_progress_round);
            }
            return create;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a75a0a99266e1b61fc0a8456db7c1cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a75a0a99266e1b61fc0a8456db7c1cb");
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
