package com.sankuai.waimai.kit.share.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.constraint.R;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Dialog a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cfe794537a1d61cfb11ee1ecc0cd388", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cfe794537a1d61cfb11ee1ecc0cd388");
        }
        try {
            AlertDialog create = new AlertDialog.Builder(activity, 2131559193).create();
            create.setCanceledOnTouchOutside(false);
            if (activity != null && !activity.isFinishing()) {
                create.show();
                Window window = create.getWindow();
                if (window != null) {
                    window.setContentView(R.layout.wm_share_view_progress_round);
                }
            }
            return create;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02507e42644d3142aaa33d88bcf7dc38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02507e42644d3142aaa33d88bcf7dc38");
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
