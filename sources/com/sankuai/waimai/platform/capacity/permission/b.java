package com.sankuai.waimai.platform.capacity.permission;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(final Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd98dbf115c824f5d16bbe5801d9bf3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd98dbf115c824f5d16bbe5801d9bf3b");
            return;
        }
        AlertDialog.a a2 = new AlertDialog.a(context).a(context.getString(R.string.wm_permission_dialog_title)).b(str).a(context.getString(R.string.wm_permission_dialog_btn_go_setting), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.capacity.permission.b.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "577c8d52d63c15757557b098881576ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "577c8d52d63c15757557b098881576ff");
                } else {
                    b.a(context, true);
                }
            }
        }).b(context.getString(R.string.dialog_btn_cancel), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.capacity.permission.b.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4655d0b7ce22b7b9300473b9e79c712b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4655d0b7ce22b7b9300473b9e79c712b");
                    return;
                }
                dialogInterface.dismiss();
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }).a(false);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return;
            }
            if (Build.VERSION.SDK_INT > 16 && activity.isDestroyed()) {
                return;
            }
        }
        a2.a().show();
    }

    public static void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49da67ae3739e0017c119ce83c29749f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49da67ae3739e0017c119ce83c29749f");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(y.a);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                Intent intent2 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
                intent2.addFlags(y.a);
                if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                    context.startActivity(intent2);
                }
            }
        } else {
            Intent intent3 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
            intent3.addFlags(y.a);
            if (context.getPackageManager().resolveActivity(intent3, 65536) != null) {
                context.startActivity(intent3);
            }
        }
        if ((context instanceof Activity) && z) {
            ((Activity) context).finish();
        }
    }
}
