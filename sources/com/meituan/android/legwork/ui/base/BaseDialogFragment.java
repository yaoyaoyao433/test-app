package com.meituan.android.legwork.ui.base;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8cbd3b3236d2fa6a6a686c2fd13999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8cbd3b3236d2fa6a6a686c2fd13999");
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // android.support.v4.app.DialogFragment
    @CallSuper
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c14cecfb4d7b7b5a85b0a4eda55f09", RobustBitConfig.DEFAULT_VALUE) ? (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c14cecfb4d7b7b5a85b0a4eda55f09") : new Dialog(getActivity(), getTheme()) { // from class: com.meituan.android.legwork.ui.base.BaseDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Dialog, android.view.Window.Callback
            public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "017b38848f66b76d7d8321c1b0672099", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "017b38848f66b76d7d8321c1b0672099")).booleanValue();
                }
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 5) {
                    com.meituan.android.legwork.monitor.b.a().b();
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd85fed1e9d36a00f449c3eafc406bca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd85fed1e9d36a00f449c3eafc406bca");
        } else if (fragmentManager == null) {
        } else {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5d98f355de8bb0dd7bea6eb462a202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5d98f355de8bb0dd7bea6eb462a202");
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    public final void a(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf((int) R.color.legwork_common_bg_color_transparent)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e49c2776999c140f302fd9c23c928fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e49c2776999c140f302fd9c23c928fd");
            return;
        }
        Window window = getDialog().getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.legwork_common_bg_color_transparent)));
        window.setLayout(-1, -2);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        window.setAttributes(attributes);
        window.setWindowAnimations(R.style.legwork_dialogAnim);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22333b63da91b65581edddc4d85a154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22333b63da91b65581edddc4d85a154");
        } else if (Build.VERSION.SDK_INT >= 30) {
            setStyle(1, R.style.bottom_fragment_dialog);
        }
    }
}
