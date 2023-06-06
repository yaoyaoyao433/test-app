package com.meituan.msi.api.dialog;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.DialogInterface;
import android.view.View;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lifecycle.a;
import com.meituan.msi.lifecycle.b;
import com.meituan.msi.view.ActionSheetDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ActionSheetApi implements IMsiApi, a, b {
    public static ChangeQuickRedirect a;
    private int b;
    private ActionSheetDialog c;
    private Activity d;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d88feec268c19fc2579073adc7b973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d88feec268c19fc2579073adc7b973");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbaa40f8698ffcb6d33a8949e77a91c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbaa40f8698ffcb6d33a8949e77a91c");
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void b(int i) {
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce438df7f868e5fa1f86fdbd8abd8499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce438df7f868e5fa1f86fdbd8abd8499");
        }
    }

    public ActionSheetApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8baaffd071040b4a68585aada1b89302", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8baaffd071040b4a68585aada1b89302");
        } else {
            this.b = -1;
        }
    }

    @MsiApiMethod(name = "showActionSheet", onUiThread = true, request = ActionSheetParam.class, response = ActionSheetResponse.class)
    public void showActionSheet(ActionSheetParam actionSheetParam, final MsiContext msiContext) {
        Object[] objArr = {actionSheetParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f9af50c64222219a83ad6466b93174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f9af50c64222219a83ad6466b93174");
        } else if (d.a.ON_PAUSE.equals(msiContext.getLifecycleState()) || msiContext.getActivity() == null) {
            msiContext.onError("fail to show dialog in background");
        } else {
            Activity activity = msiContext.getActivity();
            if (this.c == null || this.d != activity) {
                this.c = new ActionSheetDialog(activity);
                this.d = activity;
                this.c.setCanceledOnTouchOutside(true);
            }
            this.c.a(actionSheetParam.itemList, com.meituan.msi.util.d.a(actionSheetParam.itemColor));
            this.c.b = new ActionSheetDialog.a() { // from class: com.meituan.msi.api.dialog.ActionSheetApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.view.ActionSheetDialog.a
                public final void a(int i, View view) {
                    Object[] objArr2 = {Integer.valueOf(i), view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf5ef7b9016390bc86696222f68e83d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf5ef7b9016390bc86696222f68e83d8");
                        return;
                    }
                    ActionSheetResponse actionSheetResponse = new ActionSheetResponse();
                    if (i == -1) {
                        msiContext.onError("cancel");
                        return;
                    }
                    actionSheetResponse.tapIndex = i;
                    msiContext.onSuccess(actionSheetResponse);
                }
            };
            this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.msi.api.dialog.ActionSheetApi.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Object[] objArr2 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af0b55e013f610ef9f0f6f03d4cffe43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af0b55e013f610ef9f0f6f03d4cffe43");
                    } else {
                        msiContext.onError("cancel");
                    }
                }
            });
            this.c.show();
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f0dfc57903f8ec06bf6258a177785a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f0dfc57903f8ec06bf6258a177785a");
            return;
        }
        if (this.b != i && this.b != -1 && this.c != null) {
            this.c.dismiss();
        }
        this.b = i;
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86b3709de4072c6187f7dfe3a7ca5b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86b3709de4072c6187f7dfe3a7ca5b3");
        } else if (this.c == null || this.d.isDestroyed()) {
        } else {
            this.c.dismiss();
            this.c = null;
        }
    }
}
