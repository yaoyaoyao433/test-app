package com.meituan.passport.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ag;
import com.meituan.passport.dialogs.WarningDialog;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.utils.aa;
import com.meituan.passport.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PrivicyPolicyDialog extends DialogFragment {
    public static ChangeQuickRedirect a;
    public DialogInterface.OnDismissListener b;
    private boolean c;
    private DialogInterface.OnDismissListener d;

    public static /* synthetic */ void a(PrivicyPolicyDialog privicyPolicyDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privicyPolicyDialog, changeQuickRedirect, false, "b616a234f941bf9da0dd80ab491c6c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privicyPolicyDialog, changeQuickRedirect, false, "b616a234f941bf9da0dd80ab491c6c87");
            return;
        }
        aj.a(privicyPolicyDialog, "b_bzoq343h", "c_wl8bn6xi");
        com.meituan.android.cipstorage.q a2 = com.meituan.android.cipstorage.q.a(privicyPolicyDialog.getContext(), "homepage_passport", 2);
        aa.a(privicyPolicyDialog.getContext(), "homepage_passport", "passport");
        a2.a("showPolicyDialog", false);
        if (privicyPolicyDialog.d != null) {
            privicyPolicyDialog.d.onDismiss(privicyPolicyDialog.getDialog());
        } else {
            privicyPolicyDialog.dismissAllowingStateLoss();
        }
    }

    public static /* synthetic */ void b(PrivicyPolicyDialog privicyPolicyDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privicyPolicyDialog, changeQuickRedirect, false, "2f164b311884f53a06c7ab5b1922eba0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privicyPolicyDialog, changeQuickRedirect, false, "2f164b311884f53a06c7ab5b1922eba0");
        } else {
            privicyPolicyDialog.a();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public /* synthetic */ android.app.Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598fdb3111b7f1b1f190807a8616d48e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598fdb3111b7f1b1f190807a8616d48e");
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        return new Dialog(getContext(), getTheme(), PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "129c19f4a8e12ef8b6b31e4096d292b1", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnDismissListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "129c19f4a8e12ef8b6b31e4096d292b1") : new m(this));
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9db37615a457ccd4642f18d5461c791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9db37615a457ccd4642f18d5461c791");
            return;
        }
        super.onCreate(bundle);
        this.c = getActivity() instanceof com.meituan.passport.m;
        setStyle(0, R.style.PassportDialogFragment);
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba9f13122ac6f74c30d5c20785d31e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba9f13122ac6f74c30d5c20785d31e7");
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public static /* synthetic */ void a(PrivicyPolicyDialog privicyPolicyDialog, DialogInterface dialogInterface) {
        Object[] objArr = {privicyPolicyDialog, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56b28c9afe5a8a4275739d2915976d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56b28c9afe5a8a4275739d2915976d30");
        } else {
            privicyPolicyDialog.a();
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1958d9ebc94b3606bb9aa0a9052c96", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1958d9ebc94b3606bb9aa0a9052c96") : layoutInflater.inflate(R.layout.passport_fragment_policy_dialog, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e7c117d78331dad0492c89dc9002de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e7c117d78331dad0492c89dc9002de");
            return;
        }
        super.onViewCreated(view, bundle);
        aj.b(this, "b_z0rotfoz", "c_wl8bn6xi");
        TextView textView = (TextView) view.findViewById(R.id.passport_policy_agree);
        TextView textView2 = (TextView) view.findViewById(R.id.passport_policy_disagree);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.passport.dialogs.PrivicyPolicyDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dabfb43a59dc236d98ea1def21a122b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dabfb43a59dc236d98ea1def21a122b");
                    } else {
                        PrivicyPolicyDialog.a(PrivicyPolicyDialog.this);
                    }
                }
            });
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.passport.dialogs.PrivicyPolicyDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54ff883185af03aeb15dc66c624f0e6b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54ff883185af03aeb15dc66c624f0e6b");
                    } else {
                        PrivicyPolicyDialog.b(PrivicyPolicyDialog.this);
                    }
                }
            });
        }
        ((TextView) view.findViewById(R.id.passport_policy_first2)).setMovementMethod(ag.a());
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7d3169e60d9537d6f278731a0e80e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7d3169e60d9537d6f278731a0e80e5");
            return;
        }
        WarningDialog.a a2 = WarningDialog.a.a();
        a2.b = getString(this.c ? R.string.passport_policy_dialog_tip_login : R.string.passport_policy_dialog_tip_home);
        a2.c = getString(R.string.passport_confirm);
        a2.e = n.a(this);
        a2.f = o.a(this);
        a2.g = true;
        a2.h = 1;
        a2.b().show(getFragmentManager(), "tipsdialog");
    }

    public static /* synthetic */ void b(PrivicyPolicyDialog privicyPolicyDialog, View view) {
        Object[] objArr = {privicyPolicyDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3b29c367e3651c76ad0602d8eb59f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3b29c367e3651c76ad0602d8eb59f71");
            return;
        }
        aj.a(privicyPolicyDialog, "b_4b240oml", "c_wl8bn6xi");
        if (!privicyPolicyDialog.c) {
            UserCenter userCenter = UserCenter.getInstance(privicyPolicyDialog.getContext());
            if (userCenter.isLogin()) {
                userCenter.negativeLogout(new LogoutInfo("com.meituan.passport", new LogoutInfo.DefaultData("disagree privacy dialog"), (HashMap<String, String>) null), null);
            }
        }
        android.app.Dialog dialog = privicyPolicyDialog.getDialog();
        Object[] objArr2 = {dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, privicyPolicyDialog, changeQuickRedirect2, false, "cb1476cec68cd728352cd62caa5b7cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, privicyPolicyDialog, changeQuickRedirect2, false, "cb1476cec68cd728352cd62caa5b7cb4");
        } else if (privicyPolicyDialog.isAdded()) {
            aj.a(privicyPolicyDialog, "b_l6gl6spw", "c_wl8bn6xi");
            if (privicyPolicyDialog.b != null) {
                privicyPolicyDialog.b.onDismiss(dialog);
            } else {
                privicyPolicyDialog.getActivity().onBackPressed();
            }
        }
    }

    public static /* synthetic */ void a(PrivicyPolicyDialog privicyPolicyDialog, View view) {
        Object[] objArr = {privicyPolicyDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a2b44421dda122d46df1fdcf8ea9c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a2b44421dda122d46df1fdcf8ea9c54");
        } else {
            aj.a(privicyPolicyDialog, "b_ev6dsx64", "c_wl8bn6xi");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class Dialog extends android.app.Dialog {
        public static ChangeQuickRedirect a;
        private DialogInterface.OnDismissListener b;

        public Dialog(@NonNull Context context, @StyleRes int i, DialogInterface.OnDismissListener onDismissListener) {
            super(context, i);
            Object[] objArr = {context, Integer.valueOf(i), onDismissListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca38e9baedef50399540f680faecacdc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca38e9baedef50399540f680faecacdc");
            } else {
                this.b = onDismissListener;
            }
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66f1174450397446abe58b59782fdf1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66f1174450397446abe58b59782fdf1");
            } else if (this.b != null) {
                this.b.onDismiss(this);
            } else {
                super.cancel();
            }
        }
    }
}
