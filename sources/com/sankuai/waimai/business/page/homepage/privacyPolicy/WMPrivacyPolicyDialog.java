package com.sankuai.waimai.business.page.homepage.privacyPolicy;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.passport.dialogs.PrivicyPolicyDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMPrivacyPolicyDialog extends PrivicyPolicyDialog implements DialogInterface.OnShowListener {
    public static ChangeQuickRedirect c;
    public a d;
    private Boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(DialogInterface dialogInterface);

        void b(DialogInterface dialogInterface);

        void cancel();
    }

    public WMPrivacyPolicyDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a6a3048130a8657433fa12da835653", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a6a3048130a8657433fa12da835653");
        } else {
            this.e = Boolean.FALSE;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0c274fd44d96a70fb650d5a38aeb9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0c274fd44d96a70fb650d5a38aeb9f");
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(this);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1da0dca1e4e5115377a2d7c5ceba64a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1da0dca1e4e5115377a2d7c5ceba64a");
            return;
        }
        super.onDismiss(dialogInterface);
        this.e = Boolean.FALSE;
        if (this.d != null) {
            this.d.b(dialogInterface);
        }
    }

    @Override // com.meituan.passport.dialogs.PrivicyPolicyDialog, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c5f7cb0eaa7ac4d52d5ff775956de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c5f7cb0eaa7ac4d52d5ff775956de7");
            return;
        }
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.passport_policy_agree);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(getResources().getColor(R.color.wm_common_theme_light));
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c4ddd32a3d494405081987bf678da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c4ddd32a3d494405081987bf678da2");
            return;
        }
        this.e = Boolean.TRUE;
        if (this.d != null) {
            this.d.a(dialogInterface);
        }
    }
}
