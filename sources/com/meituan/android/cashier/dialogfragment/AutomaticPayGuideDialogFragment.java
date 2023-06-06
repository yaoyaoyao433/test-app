package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.cashier.NativeStandardCashierAdapter;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.activity.MTCashierWrapperActivity;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.dialog.AutomaticPayGuideDialog;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutomaticPayGuideDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private Cashier b;
    private AutomaticPayGuideDialog.a c;
    @MTPayNeedToPersist
    private boolean d;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "AutomaticPayGuideDialogFragment";
    }

    public AutomaticPayGuideDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78d35d9c25c1979c0f306fc5033698a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78d35d9c25c1979c0f306fc5033698a");
        } else {
            this.d = true;
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d81086406047ad3a90bdb55569b606a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d81086406047ad3a90bdb55569b606a9");
        }
        f();
        return new AutomaticPayGuideDialog(getContext(), this.b, this.c);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f8b8c936910534c84038194a84d98a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f8b8c936910534c84038194a84d98a");
            return;
        }
        super.onViewStateRestored(bundle);
        f();
        if (getDialog() instanceof AutomaticPayGuideDialog) {
            ((AutomaticPayGuideDialog) getDialog()).b = this.c;
        }
    }

    public static AutomaticPayGuideDialogFragment a(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1facc0be1cef5fc85be467752cd9cba", RobustBitConfig.DEFAULT_VALUE)) {
            return (AutomaticPayGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1facc0be1cef5fc85be467752cd9cba");
        }
        AutomaticPayGuideDialogFragment automaticPayGuideDialogFragment = new AutomaticPayGuideDialogFragment();
        Bundle bundle = new Bundle();
        if (cashier != null) {
            bundle.putSerializable("cashier", cashier);
        }
        automaticPayGuideDialogFragment.setArguments(bundle);
        return automaticPayGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe3c0da456d6a53494d302d7a86b9bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe3c0da456d6a53494d302d7a86b9bb0");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (Cashier) com.sankuai.waimai.platform.utils.f.a(getArguments(), "cashier");
        }
        if ((getActivity() instanceof MTCashierActivity) && this.d) {
            this.d = false;
            getActivity();
            q.a("native_standcashier_start_succ", (Map<String, Object>) null, (List<Float>) null, e());
            com.meituan.android.cashier.util.c.a(((MTCashierActivity) getActivity()).k(), e());
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d80862762d40dcb4f760c8c530fc56b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d80862762d40dcb4f760c8c530fc56b");
            return;
        }
        super.onAttach(activity);
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad16d23116ce35ae22d61a7f74be7ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad16d23116ce35ae22d61a7f74be7ea");
        } else if (this.c != null) {
        } else {
            if (!(getActivity() instanceof MTCashierActivity)) {
                if (getActivity() instanceof AutomaticPayGuideDialog.a) {
                    this.c = (AutomaticPayGuideDialog.a) getActivity();
                    return;
                }
                return;
            }
            ICashier iCashier = ((MTCashierActivity) getActivity()).e;
            if (iCashier instanceof NativeStandardCashierAdapter) {
                this.c = (NativeStandardCashierAdapter) iCashier;
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c678f568842d99b3fe572ac81ab2fb82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c678f568842d99b3fe572ac81ab2fb82");
            return;
        }
        this.c = null;
        super.onDetach();
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586de7ad5a72ab75a8008a5223a0bac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586de7ad5a72ab75a8008a5223a0bac3");
            return;
        }
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", 200);
        if (com.meituan.android.cashier.util.a.a().b()) {
            com.meituan.android.paycommon.lib.utils.d.a(getActivity(), MTCashierActivity.class);
        } else {
            com.meituan.android.paycommon.lib.utils.d.a(getActivity(), MTCashierWrapperActivity.class);
        }
    }
}
