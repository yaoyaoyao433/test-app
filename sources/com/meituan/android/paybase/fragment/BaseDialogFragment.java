package com.meituan.android.paybase.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.aa;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.utils.k;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public abstract class BaseDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect j;
    @MTPayNeedToPersist
    private boolean a;

    public abstract BaseDialog a(Bundle bundle);

    public abstract String a();

    public BaseDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98af670b4fbb88165b3070ceb7fb55d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98af670b4fbb88165b3070ceb7fb55d5");
        } else {
            this.a = true;
        }
    }

    public final void a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a4ae0409b15bb77707088d194c0b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a4ae0409b15bb77707088d194c0b75");
        } else if (fragmentManager != null && fragmentManager.findFragmentByTag(a()) == null) {
            this.a = false;
            try {
                a(fragmentManager, a());
            } catch (IllegalStateException e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BaseDialogFragment_show").a("message", e.getMessage()).b);
            }
        } else if (!this.a || getDialog() == null) {
        } else {
            this.a = false;
            getDialog().show();
        }
    }

    private void a(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ff6e07396849b5033cd66407a0ca436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ff6e07396849b5033cd66407a0ca436");
            return;
        }
        try {
            Field declaredField = getClass().getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            Field declaredField2 = getClass().getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(this, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BaseDialogFragment_showInternal").a("message", e.getMessage()).b);
        } catch (NoSuchFieldException e2) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BaseDialogFragment_showInternal").a("message", e2.getMessage()).b);
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, str);
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ad1985fac228ba2e8d8112d1eb1930", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ad1985fac228ba2e8d8112d1eb1930");
        }
        BaseDialog a = a(bundle);
        a(a);
        return a;
    }

    public void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "898ca5b933d4a33ecc9a87dae672d081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "898ca5b933d4a33ecc9a87dae672d081");
        } else {
            ((BaseDialog) dialog).d = this;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a1e8b734106baef7dfdcf7b58d275d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a1e8b734106baef7dfdcf7b58d275d");
            return;
        }
        aa.a(this, getClass(), bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13de0a526f0e388db34060b086c47c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13de0a526f0e388db34060b086c47c0f");
            return;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            aa.b(this, getClass(), bundle);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c1dfb0416ccc9291769e11ac465744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c1dfb0416ccc9291769e11ac465744");
            return;
        }
        super.onStart();
        if (this.a) {
            getDialog().hide();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8f0c115627bf7b9a46de6136b1cd74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8f0c115627bf7b9a46de6136b1cd74");
        } else {
            super.onCancel(dialogInterface);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134fe95b42dc0ce50a6b5acbb80ba5c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134fe95b42dc0ce50a6b5acbb80ba5c8");
            return;
        }
        super.onDismiss(dialogInterface);
        Object[] objArr2 = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f970c5e62b6dcaa40f151b05b038108a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f970c5e62b6dcaa40f151b05b038108a");
        } else if (dialogInterface != null) {
            if (Build.VERSION.SDK_INT >= 26 || Build.VERSION.SDK_INT < 21) {
                try {
                    k.a(Dialog.class.getDeclaredField("mCancelMessage"), dialogInterface);
                    k.a(Dialog.class.getDeclaredField("mDismissMessage"), dialogInterface);
                    k.a(Dialog.class.getDeclaredField("mShowMessage"), dialogInterface);
                } catch (Throwable th) {
                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "DialogUtil_recycleDialog").a("message", th.getMessage()).b);
                }
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe63a0e1503d40938bb6637a6b2bfd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe63a0e1503d40938bb6637a6b2bfd0");
            return;
        }
        this.a = true;
        getDialog().hide();
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904ff741d77dbf93db051a38b041fcd2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904ff741d77dbf93db051a38b041fcd2") : ak.a(getActivity());
    }
}
