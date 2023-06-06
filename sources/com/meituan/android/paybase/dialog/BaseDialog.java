package com.meituan.android.paybase.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fragment.BaseDialogFragment;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseDialog extends Dialog {
    public static ChangeQuickRedirect c;
    public BaseDialogFragment d;

    public BaseDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b065eb911358596ad89a3861f112a374", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b065eb911358596ad89a3861f112a374");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "415f0be47e123cd1f6274690e6d3e96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "415f0be47e123cd1f6274690e6d3e96d");
        } else if (context instanceof Activity) {
            setOwnerActivity((Activity) context);
        } else {
            throw new IllegalStateException("must use activity as context");
        }
    }

    public BaseDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e69be02e5d8a4da0c814317cb6f89b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e69be02e5d8a4da0c814317cb6f89b");
        } else {
            a(context);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506fffaa891ef04cc1379da8dab988f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506fffaa891ef04cc1379da8dab988f6");
            return;
        }
        try {
            super.show();
        } catch (WindowManager.BadTokenException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BaseDialog_show").a("message", e.getMessage()).b);
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1b5a3fc2939cbd91b45de4c339812f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1b5a3fc2939cbd91b45de4c339812f") : ak.a(getOwnerActivity());
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        Object[] objArr = {onCancelListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a91ba74d062eb0bab15d7771b6fe6e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a91ba74d062eb0bab15d7771b6fe6e8");
        } else if (this.d != null) {
            super.setOnCancelListener(onCancelListener);
        } else {
            throw new IllegalStateException("Do not call this method, Override onCancel in DialogFragment");
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d212fab47729257b550611a5faec43a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d212fab47729257b550611a5faec43a5");
        } else if (this.d != null) {
            super.setOnDismissListener(onDismissListener);
        } else {
            throw new IllegalStateException("Do not call this method, Override onDismiss in DialogFragment");
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f484f187707eed0e18c8a25fba95cb1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f484f187707eed0e18c8a25fba95cb1a");
        } else if (this.d != null) {
            super.setCancelable(z);
        } else {
            throw new IllegalStateException("Do not call this method, call setCancelable in DialogFragment");
        }
    }
}
