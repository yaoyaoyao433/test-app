package com.sankuai.waimai.store.util;

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
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static Dialog a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7113bf8b4c7bbf29286935ea07b1053", RobustBitConfig.DEFAULT_VALUE) ? (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7113bf8b4c7bbf29286935ea07b1053") : a(context, 0);
    }

    public static Dialog a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29faeda04b4fe1abaeff88731c240691", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29faeda04b4fe1abaeff88731c240691");
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        try {
            AlertDialog create = new AlertDialog.Builder(context, 2131559287).create();
            create.setCanceledOnTouchOutside(false);
            create.show();
            Window window = create.getWindow();
            if (window != null) {
                window.setContentView(R.layout.wm_st_common_view_progress_round);
                if (i > 0) {
                    window.findViewById(R.id.sc_progress_bar).setPadding(i, 0, 0, 0);
                }
            }
            return create;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }

    public static void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fab59227237dcccc21b58ec34c2305f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fab59227237dcccc21b58ec34c2305f2");
        } else if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    dialog.dismiss();
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    public static void b(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f64c2d690b742c5d701ccddc44924cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f64c2d690b742c5d701ccddc44924cdf");
        } else if (dialog != null) {
            try {
                if (dialog.isShowing()) {
                    return;
                }
                dialog.show();
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }
}
