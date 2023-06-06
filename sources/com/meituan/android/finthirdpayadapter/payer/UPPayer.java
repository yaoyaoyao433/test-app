package com.meituan.android.finthirdpayadapter.payer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UPPayer implements Payer {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.payment.Payer
    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "665fe838c12631af4be01771dbadf563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "665fe838c12631af4be01771dbadf563");
        } else if (TextUtils.isEmpty(str)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("错误提示");
            builder.setMessage("网络连接失败,请重试!");
            builder.setNegativeButton("确定", a.a());
            builder.create().show();
            com.meituan.android.finthirdpayadapter.utils.a.a(activity, "not install", "upmppay");
        } else {
            UPPayHandle.b(activity, null, null, str, "00");
        }
    }

    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3adad5d261e8a600212739f65cd17a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3adad5d261e8a600212739f65cd17a35");
        } else {
            dialogInterface.dismiss();
        }
    }
}
