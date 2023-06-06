package com.sankuai.waimai.ugc.creator.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.constraint.R;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static Dialog a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83ba6698dfa74b1f2f9e3de96bbb1948", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83ba6698dfa74b1f2f9e3de96bbb1948");
        }
        try {
            AlertDialog create = new AlertDialog.Builder(activity, 2131558940).create();
            create.setCancelable(false);
            if (o.a(activity)) {
                create.show();
                Window window = create.getWindow();
                if (window != null) {
                    window.setContentView(R.layout.wm_ugc_creator_rotate_progress_dialog);
                }
            }
            return create;
        } catch (Exception unused) {
            return null;
        }
    }
}
