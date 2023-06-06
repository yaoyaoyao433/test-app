package com.sankuai.waimai.platform.privacy.dialog;

import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BootAgreementConfirmDialog extends BaseBootAgreementDialog implements View.OnClickListener {
    public static ChangeQuickRedirect c;
    private View d;
    private View e;

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog
    public final int a() {
        return R.layout.wm_privacy_agreement_confirm_dialog;
    }

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4cd1b7936202c379fb589e370f298b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4cd1b7936202c379fb589e370f298b");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.TakeoutPermission_Dialog);
    }

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d09f72089982251cb7d47d6c01fcca58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d09f72089982251cb7d47d6c01fcca58");
            return;
        }
        this.d = view.findViewById(R.id.positive_button);
        this.e = view.findViewById(R.id.negative_button);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead68d63ce0aed0023721a8c0affba10", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead68d63ce0aed0023721a8c0affba10");
        } else if (this.b == null) {
        } else {
            int id = view.getId();
            if (id == R.id.positive_button) {
                dismissAllowingStateLoss();
                this.b.a(view);
            } else if (id == R.id.negative_button) {
                dismissAllowingStateLoss();
                this.b.b(view);
                this.e.setEnabled(false);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa67b602cf97ff474800fd3a175fd6b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa67b602cf97ff474800fd3a175fd6b6");
        } else if (this.e != null) {
            this.e.setEnabled(true);
        }
    }
}
