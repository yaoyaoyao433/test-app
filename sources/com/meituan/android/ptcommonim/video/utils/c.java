package com.meituan.android.ptcommonim.video.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.util.ad;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(final Activity activity, int... iArr) {
        Object[] objArr = {activity, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cbad4d36bdbc478119eef579bc611ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cbad4d36bdbc478119eef579bc611ba");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 0; i++) {
            sb.append(activity.getResources().getString(iArr[0]));
        }
        String sb2 = sb.toString();
        if (Build.VERSION.SDK_INT >= 23) {
            new AlertDialog.a(activity).b(activity.getString(R.string.ptim_commonbus_permission_content, new Object[]{sb2, sb2})).a(R.string.ptim_commonbus_permission_setting, new DialogInterface.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.utils.c.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea7a8367623282abfd0a8e545d5e537a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea7a8367623282abfd0a8e545d5e537a");
                        return;
                    }
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                    activity.startActivity(intent);
                    a.b(activity);
                }
            }).b(R.string.ptim_commonbus_permission_cancel, new DialogInterface.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.utils.c.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a316c5151efbd619b1ac51679b12afe5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a316c5151efbd619b1ac51679b12afe5");
                    } else {
                        activity.finish();
                    }
                }
            }).b();
        } else {
            ad.a(activity, activity.getString(R.string.ptim_commonbus_permission_no_permission, new Object[]{sb2}));
        }
    }
}
