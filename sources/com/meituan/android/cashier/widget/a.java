package com.meituan.android.cashier.widget;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.cashier.common.q;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends LinearLayout {
    public static ChangeQuickRedirect a;
    public AppCompatCheckBox b;
    public Agreement c;
    public String d;
    private TextView e;
    private TextView f;
    private TextView g;
    private LinearLayout h;
    private Activity i;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ad69e5365f219de50e2e71196602751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ad69e5365f219de50e2e71196602751");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c933a38c76deebb7af31e40408f3c981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c933a38c76deebb7af31e40408f3c981");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.cashier__creditpay_brand_view, this);
        this.b = (AppCompatCheckBox) findViewById(R.id.cashier_agreement_check_box);
        this.e = (TextView) findViewById(R.id.cashier_agreement_name);
        this.f = (TextView) findViewById(R.id.cashier_agreement_prefix);
        this.g = (TextView) findViewById(R.id.cashier_brand_text);
        this.h = (LinearLayout) findViewById(R.id.cashier_agreement_tap_area);
    }

    public final void setActivity(Activity activity) {
        this.i = activity;
    }

    public final Agreement getBrandAgreement() {
        return this.c;
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8d07dfa380c78229420b827f0bdf4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8d07dfa380c78229420b827f0bdf4f")).booleanValue() : (getBrandAgreement() == null && TextUtils.isEmpty(this.d)) ? false : true;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dfdad42c89d1b69f30aaa0fd59935b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dfdad42c89d1b69f30aaa0fd59935b5")).booleanValue();
        }
        if (getBrandAgreement() != null) {
            return getBrandAgreement().canCheck();
        }
        return false;
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f13bdd691e3b8fc66912332c32549d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f13bdd691e3b8fc66912332c32549d8")).booleanValue();
        }
        if (getBrandAgreement() != null) {
            return getBrandAgreement().isChecked();
        }
        return false;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb493981b8f3804260075d1508b7263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb493981b8f3804260075d1508b7263");
        } else if (c()) {
            if (a()) {
                this.b.setChecked(d());
                this.b.setVisibility(0);
                this.b.setOnCheckedChangeListener(b.a(this));
                this.h.setEnabled(true);
                this.h.setOnClickListener(c.a(this));
            } else {
                this.h.setEnabled(false);
                this.b.setVisibility(8);
            }
            if (getBrandAgreement() != null) {
                if (TextUtils.isEmpty(getBrandAgreement().getName())) {
                    this.e.setVisibility(8);
                } else {
                    this.e.setVisibility(0);
                    this.e.setText(getBrandAgreement().getName());
                    this.e.setOnClickListener(d.a(this));
                }
                if (TextUtils.isEmpty(getBrandAgreement().getAgreementPrefix())) {
                    this.f.setVisibility(8);
                } else {
                    this.f.setVisibility(0);
                    this.f.setText(getBrandAgreement().getAgreementPrefix());
                }
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.d)) {
                this.g.setVisibility(8);
            } else {
                this.g.setVisibility(0);
                this.g.setText(this.d);
            }
            setVisibility(0);
            q.a("b_pay_tr4fl35l_mv", new a.c().a("info", "品宣view展示").b, getUniqueId());
        } else {
            setVisibility(8);
        }
    }

    public static /* synthetic */ void a(a aVar, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {aVar, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66bcc4714011d2499326450ddf5165b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66bcc4714011d2499326450ddf5165b8");
            return;
        }
        if (aVar.getBrandAgreement() != null) {
            aVar.getBrandAgreement().setIsChecked(z);
        } else {
            aVar.setVisibility(8);
            a.c cVar = new a.c();
            q.a("b_pay_27j1p3ms_mc", cVar.a("info", "getBrandAgreement()为空：" + z).b, aVar.getUniqueId());
        }
        a.c cVar2 = new a.c();
        q.a("b_pay_27j1p3ms_mc", cVar2.a("info", "checkout状态修改为：" + z).b, aVar.getUniqueId());
    }

    public static /* synthetic */ void b(a aVar, View view) {
        Object[] objArr = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d77e0a676505cd5388545405aecc9e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d77e0a676505cd5388545405aecc9e0d");
            return;
        }
        aVar.b.setChecked(!aVar.b.isChecked());
        q.a("b_pay_27j1p3ms_mc", new a.c().a("info", "点击我已阅读与同意").b, aVar.getUniqueId());
    }

    public static /* synthetic */ void a(a aVar, View view) {
        Object[] objArr = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4979908765d9f653be5e0c07bf2a5abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4979908765d9f653be5e0c07bf2a5abb");
        } else if (aVar.getBrandAgreement() != null && !TextUtils.isEmpty(aVar.getBrandAgreement().getUrl())) {
            WebViewDialogCloseActivity.b(aVar.getContext(), aVar.getBrandAgreement().getUrl());
            a.c cVar = new a.c();
            q.a("b_pay_26x8f4eq_mc", cVar.a("info", "点击月付协议" + aVar.getBrandAgreement().getUrl()).b, aVar.getUniqueId());
        } else {
            q.a("b_pay_26x8f4eq_mc", new a.c().a("info", "url为空").b, aVar.getUniqueId());
        }
    }

    private String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f741d7c1d9716440b00edf1f82fa43e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f741d7c1d9716440b00edf1f82fa43e");
        }
        Activity a2 = u.a(this);
        if (a2 == null) {
            a2 = this.i;
        }
        if (a2 instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) a2;
            return !TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }
}
