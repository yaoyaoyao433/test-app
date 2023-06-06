package com.meituan.android.cashier.dialog;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.NoPswGuide;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutomaticPayGuideDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    public a b;
    private NoPswGuide e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private Button k;
    private Cashier l;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Cashier cashier);

        void a(String str);
    }

    public AutomaticPayGuideDialog(Context context, Cashier cashier, a aVar) {
        super(context, R.style.mpay__TransparentDialog);
        Object[] objArr = {context, cashier, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c399f4a3d0f0b53165037a538a26d18a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c399f4a3d0f0b53165037a538a26d18a");
            return;
        }
        this.e = cashier.getNoPswGuide();
        this.l = cashier;
        this.b = aVar;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.cashier__no_psw_guide_dialog, (ViewGroup) null);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        setContentView(inflate, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5299ef5e745fd2854f48c3c8e40a5ef", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5299ef5e745fd2854f48c3c8e40a5ef") : new ViewGroup.LayoutParams((int) (getOwnerActivity().getWindowManager().getDefaultDisplay().getWidth() * 0.833d), -2));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "275c52df685dea7dbdf518f1af41f0b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "275c52df685dea7dbdf518f1af41f0b2");
        } else if (this.e != null) {
            this.f = (TextView) findViewById(R.id.guide_title);
            this.g = (TextView) findViewById(R.id.guide_description);
            this.h = (TextView) findViewById(R.id.guide_agreement_tip);
            this.i = (TextView) findViewById(R.id.guide_agreement);
            this.j = (TextView) findViewById(R.id.guide_cancel);
            this.k = (Button) findViewById(R.id.guide_open);
            if (!TextUtils.isEmpty(this.e.getGuideTitle())) {
                this.f.setText(this.e.getGuideTitle());
            }
            if (!TextUtils.isEmpty(this.e.getDescription())) {
                this.g.setText(this.e.getDescription());
            }
            if (!TextUtils.isEmpty(this.e.getAgreeTip())) {
                this.h.setText(this.e.getAgreeTip());
            }
            if (!TextUtils.isEmpty(this.e.getAgreeName())) {
                this.i.setText(this.e.getAgreeName());
            }
            if (!TextUtils.isEmpty(this.e.getAgreementUrl())) {
                this.i.setOnClickListener(com.meituan.android.cashier.dialog.a.a(this));
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "打车代扣协议链接为空");
            }
            if (!TextUtils.isEmpty(this.e.getOpenButton())) {
                this.k.setText(this.e.getOpenButton());
                this.k.setOnClickListener(b.a(this));
            }
            if (!TextUtils.isEmpty(this.e.getCancleButton())) {
                this.j.setText(this.e.getCancleButton());
                this.j.setOnClickListener(c.a(this));
            }
            setCanceledOnTouchOutside(false);
        }
    }

    public static /* synthetic */ void c(AutomaticPayGuideDialog automaticPayGuideDialog, View view) {
        Object[] objArr = {automaticPayGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "121d8044f6a13c8ae3ff9d992fae5311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "121d8044f6a13c8ae3ff9d992fae5311");
        } else {
            al.a(automaticPayGuideDialog.getContext(), automaticPayGuideDialog.e.getAgreementUrl());
        }
    }

    public static /* synthetic */ void b(AutomaticPayGuideDialog automaticPayGuideDialog, View view) {
        Object[] objArr = {automaticPayGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "398ed3d18b5dd8048e65ae52590d09e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "398ed3d18b5dd8048e65ae52590d09e1");
            return;
        }
        automaticPayGuideDialog.dismiss();
        if (automaticPayGuideDialog.b != null) {
            automaticPayGuideDialog.b.a(automaticPayGuideDialog.e.getSubmitUrl());
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", 200);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_oysht4uc", (Map<String, Object>) null);
    }

    public static /* synthetic */ void a(AutomaticPayGuideDialog automaticPayGuideDialog, View view) {
        Object[] objArr = {automaticPayGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "982960cbe07f0857fdbe7f6727641b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "982960cbe07f0857fdbe7f6727641b2e");
            return;
        }
        automaticPayGuideDialog.dismiss();
        if (automaticPayGuideDialog.b != null) {
            if (automaticPayGuideDialog.getOwnerActivity() instanceof MTCashierActivity) {
                automaticPayGuideDialog.getOwnerActivity();
                com.meituan.android.cashier.common.q.a("pop_cashier_cancel", (Map<String, Object>) null, (List<Float>) null, automaticPayGuideDialog.b());
                com.meituan.android.cashier.common.q.b("b_pay_pop_cashier_cancel_sc", null, automaticPayGuideDialog.b());
            }
            automaticPayGuideDialog.b.a(automaticPayGuideDialog.l);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_efw02ysi", (Map<String, Object>) null);
    }
}
