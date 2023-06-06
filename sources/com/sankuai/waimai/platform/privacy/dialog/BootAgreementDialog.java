package com.sankuai.waimai.platform.privacy.dialog;

import android.os.Bundle;
import android.support.constraint.R;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BootAgreementDialog extends BaseBootAgreementDialog implements View.OnClickListener {
    public static ChangeQuickRedirect c;
    private View d;
    private View e;

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog
    public final int a() {
        return R.layout.wm_privacy_agreement_info_dialog_new;
    }

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b878ea44fe55a4bbfab549cc4470899f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b878ea44fe55a4bbfab549cc4470899f");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.TakeoutPermission_Dialog_FullScreen);
    }

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae63b6c04993cbfe0df1454cd1b4d261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae63b6c04993cbfe0df1454cd1b4d261");
            return;
        }
        ((TextView) view.findViewById(R.id.privacy_policy)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) view.findViewById(R.id.privacy_policy_desc)).setMovementMethod(LinkMovementMethod.getInstance());
        setCancelable(false);
        this.d = view.findViewById(R.id.positive_button);
        this.e = view.findViewById(R.id.negative_button);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c81f87b174730ebd2700f7b9aee02ad4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c81f87b174730ebd2700f7b9aee02ad4");
        } else if (this.b == null) {
        } else {
            int id = view.getId();
            if (id == R.id.positive_button) {
                dismissAllowingStateLoss();
                this.b.a(view);
            } else if (id == R.id.negative_button) {
                this.b.b(view);
                this.e.setEnabled(false);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838e98d969fd131f7b9f77e9ed4b1376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838e98d969fd131f7b9f77e9ed4b1376");
        } else if (this.e != null) {
            this.e.setEnabled(true);
        }
    }
}
