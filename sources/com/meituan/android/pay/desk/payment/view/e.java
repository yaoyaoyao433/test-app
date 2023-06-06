package com.meituan.android.pay.desk.payment.view;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.android.paycommon.lib.widgets.CommonGridView;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends d {
    public static ChangeQuickRedirect a;
    private boolean A;
    private int B;
    private boolean C;
    private Activity D;
    private View m;
    private RelativeLayout n;
    private TextView o;
    private TextView p;
    private CheckBox q;
    private MTPayment r;
    private FinanceServiceBean s;
    private Animator t;
    private LinearLayout u;
    private com.meituan.android.pay.desk.payment.view.adapter.a v;
    private CommonGridView w;
    private TextView x;
    private TextView y;
    private boolean z;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d957894495543f4f83c9f8f79155ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d957894495543f4f83c9f8f79155ec");
            return;
        }
        this.z = true;
        this.B = 0;
    }

    public final void setActivity(Activity activity) {
        this.D = activity;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void b(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210b8eec4ab5758223936b907db42edb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210b8eec4ab5758223936b907db42edb");
            return;
        }
        if (dVar instanceof FinanceServiceBean) {
            this.s = (FinanceServiceBean) dVar;
            this.A = true;
        } else if (dVar instanceof MTPayment) {
            this.r = (MTPayment) dVar;
            this.A = false;
        }
        super.b(dVar);
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final View d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8eea056787d4248b1380d7eb97305c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8eea056787d4248b1380d7eb97305c9");
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__payment_append_view_credit, (ViewGroup) null);
        this.m = inflate.findViewById(R.id.mpay__appendage);
        this.n = (RelativeLayout) inflate.findViewById(R.id.mpay__contract);
        this.o = (TextView) inflate.findViewById(R.id.mpay__protocol_prefix);
        this.p = (TextView) inflate.findViewById(R.id.mpay__protocol);
        this.q = (CheckBox) inflate.findViewById(R.id.mpay__checkbox);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9743f177bd3e0902f44d7fcc5b34952d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9743f177bd3e0902f44d7fcc5b34952d");
        } else if ((this.r != null || this.s != null) && this.m != null) {
            this.u = (LinearLayout) this.m.findViewById(R.id.mpay__installment_container);
            this.w = (CommonGridView) this.m.findViewById(R.id.mpay__installment_data_grid);
            this.x = (TextView) this.m.findViewById(R.id.mpay__installment_title);
            this.y = (TextView) this.m.findViewById(R.id.mpay__installment_unsupported);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.pay.desk.payment.view.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e8038f81aec04ed36bb0947b6ba8737", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e8038f81aec04ed36bb0947b6ba8737");
                    return;
                }
                e.this.setAnimOpen(true);
                if (Build.VERSION.SDK_INT >= 16) {
                    e.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    e.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
        return inflate;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void g() {
        boolean z;
        Installment installment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92152fce00dbd08b0908dbf751c40445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92152fce00dbd08b0908dbf751c40445");
            return;
        }
        super.g();
        if (j()) {
            if (this.i.isChecked()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2826322456e688ad9343469d81dc7e3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2826322456e688ad9343469d81dc7e3a");
                } else {
                    MTPayment mTPayment = this.A ? this.s : this.r;
                    Object[] objArr3 = {mTPayment};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "456f803f5681451cd0849c61c69ecfc8", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "456f803f5681451cd0849c61c69ecfc8")).booleanValue();
                    } else {
                        z = this.i.isChecked() && com.meituan.android.pay.common.payment.utils.e.b(mTPayment);
                    }
                    if (z) {
                        Object[] objArr4 = {mTPayment};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a6bed963d209c0959a666c64b1ce10b0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a6bed963d209c0959a666c64b1ce10b0");
                        } else {
                            Installment installment2 = mTPayment.getInstallment();
                            if (installment2 != null && !com.meituan.android.paybase.utils.i.a((Collection) installment2.getPeriodList())) {
                                this.m.setVisibility(0);
                                this.u.setVisibility(0);
                                this.y.setVisibility(8);
                                this.x.setText(installment2.getTitle());
                                if (this.v == null) {
                                    this.v = new com.meituan.android.pay.desk.payment.view.adapter.a(this.D, getContext());
                                }
                                Object[] objArr5 = {mTPayment};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "eee3511704090ba4210fc67de52a3db8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "eee3511704090ba4210fc67de52a3db8");
                                } else if (this.v != null) {
                                    if (mTPayment instanceof FinanceServiceBean) {
                                        Installment installment3 = ((FinanceServiceBean) mTPayment).getInstallment();
                                        if (installment3 != null && !com.meituan.android.paybase.utils.i.a((Collection) installment3.getPeriodList())) {
                                            this.v.a(installment3.getPeriodList(), this.i.isChecked());
                                            this.v.a(this.i.isChecked());
                                        }
                                    } else if ((mTPayment instanceof MTPayment) && (installment = mTPayment.getInstallment()) != null && !com.meituan.android.paybase.utils.i.a((Collection) installment.getPeriodList())) {
                                        this.v.a(installment.getPeriodList(), this.i.isChecked());
                                        this.v.a(this.i.isChecked());
                                    }
                                }
                                this.w.setAdapter((ListAdapter) this.v);
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_2vuveci2_mv", new a.c().a("pay_type", mTPayment.getPayType()).a("show_periods", mTPayment.getInstallment() != null ? mTPayment.getInstallment().getAllPeriods() : "不支持分期").b);
                                if (this.z) {
                                    com.meituan.android.pay.common.analyse.b.a("c_PJmoK", "b_pay_g40xmrfg_mv", "月付分期卡片", null, ae.a.VIEW, getUniqueId());
                                    this.z = false;
                                }
                            }
                        }
                    } else {
                        Object[] objArr6 = {mTPayment};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "86ca7533e98c59e8196de06bf75c093f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "86ca7533e98c59e8196de06bf75c093f");
                        } else if (!com.meituan.android.pay.common.payment.utils.e.b(mTPayment)) {
                            if (!TextUtils.isEmpty(mTPayment.getUnsupportedInstallmentReason())) {
                                this.m.setVisibility(0);
                                this.y.setVisibility(0);
                                this.y.setText(mTPayment.getUnsupportedInstallmentReason());
                                this.m.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            }
                            this.u.setVisibility(8);
                        }
                    }
                }
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "56fcb5572ae54d38b06a8d3631436e4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "56fcb5572ae54d38b06a8d3631436e4c");
                } else {
                    MTPayment mTPayment2 = this.A ? this.s : this.r;
                    if (mTPayment2 != null) {
                        if (mTPayment2.isOpenCreditPay() && mTPayment2.getUpdateAgreement() != null && mTPayment2.isCanUseNoPwdPay()) {
                            Agreement updateAgreement = mTPayment2.getUpdateAgreement();
                            Object[] objArr8 = {updateAgreement};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "6b138729743d27b6ea845cc99ead3dab", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "6b138729743d27b6ea845cc99ead3dab");
                            } else {
                                com.meituan.android.pay.common.payment.data.e eVar = this.A ? this.s : this.r;
                                if (eVar != null) {
                                    this.o.setText(updateAgreement.getAgreementPrefix());
                                    this.p.setText(updateAgreement.getName());
                                    String url = updateAgreement.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        this.p.setOnClickListener(f.a(this, url));
                                    } else {
                                        com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", eVar.getPayType() + "协议链接为空");
                                    }
                                    this.q.setVisibility(0);
                                    this.q.setChecked(updateAgreement.isChecked());
                                    this.n.setVisibility(0);
                                }
                            }
                            if (this.i.isChecked() && this.m.getVisibility() != 0) {
                                this.m.setVisibility(0);
                            }
                        }
                        if (this.m.getVisibility() == 0) {
                            Object[] objArr9 = {mTPayment2};
                            ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.pay.desk.payment.report.a.a;
                            if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "1de08eec0d0c83b3c98eb85131340977", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "1de08eec0d0c83b3c98eb85131340977");
                            } else if (mTPayment2 != null && com.meituan.android.pay.common.payment.utils.c.e(mTPayment2.getPayType())) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
                                Agreement agreement = mTPayment2.getAgreement() != null ? mTPayment2.getAgreement() : mTPayment2.getUpdateAgreement();
                                if (agreement != null) {
                                    hashMap.put("title", agreement.getName());
                                }
                                com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_s2hfy0sb_mv", "买单支付下拉框曝光", hashMap, a.EnumC0329a.VIEW, -1);
                            }
                        }
                    }
                }
                this.m.setVisibility(0);
                this.t = com.meituan.android.pay.desk.payment.anim.b.a(this.m, this.t, this.B, 300);
            } else {
                this.m.setVisibility(8);
            }
        }
        if (!this.A || this.s == null) {
            return;
        }
        Object[] objArr10 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = a;
        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "85a7bfff8b80e379c9424de5728cc9f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "85a7bfff8b80e379c9424de5728cc9f4");
            return;
        }
        String str = "";
        if (this.s.getCreditProductInfo() != null && !TextUtils.isEmpty(this.s.getCreditProductInfo().getPromptText())) {
            str = this.s.getCreditProductInfo().getPromptText();
        }
        PayLabelContainer payLabelContainer = this.f;
        int status = this.s.getStatus();
        Object[] objArr11 = {str, Integer.valueOf(status)};
        ChangeQuickRedirect changeQuickRedirect11 = PayLabelContainer.c;
        if (PatchProxy.isSupport(objArr11, payLabelContainer, changeQuickRedirect11, false, "32e27d0e423e622f411bee1f6d81e8bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, payLabelContainer, changeQuickRedirect11, false, "32e27d0e423e622f411bee1f6d81e8bb");
            return;
        }
        payLabelContainer.setVisibility(0);
        payLabelContainer.removeAllViews();
        TextView textView = new TextView(payLabelContainer.getContext());
        textView.setText(str);
        textView.setTextColor(payLabelContainer.getResources().getColor(status == 0 ? R.color.paycommon__prompt_text : R.color.paybase__black4));
        textView.setTextSize(2, 12.0f);
        payLabelContainer.addView(textView);
    }

    public final void setAnimOpen(boolean z) {
        this.C = z;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d, com.meituan.android.pay.desk.payment.b
    public final void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338cefa2d2d91d6950f408795f292a34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338cefa2d2d91d6950f408795f292a34");
            return;
        }
        if (this.C) {
            if (!this.i.isChecked() && this.h == dVar) {
                this.B = 1;
            } else {
                this.B = 0;
            }
        } else {
            this.B = 0;
        }
        super.a(dVar);
    }

    private String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5993a556f075189e5a8efc23ff32753", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5993a556f075189e5a8efc23ff32753") : (!(this.D instanceof PayBaseActivity) || TextUtils.isEmpty(((PayBaseActivity) this.D).p())) ? "" : ((PayBaseActivity) this.D).p();
    }

    public static /* synthetic */ void a(e eVar, String str, View view) {
        Object[] objArr = {eVar, str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3abae563602e1b7848ee5cd5c11830dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3abae563602e1b7848ee5cd5c11830dc");
        } else {
            WebViewDialogCloseActivity.b(eVar.getContext(), str);
        }
    }

    public final void setOnUpdateChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Object[] objArr = {onCheckedChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd99d350c9778f0b5d4b7e2d71ab5c62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd99d350c9778f0b5d4b7e2d71ab5c62");
        } else {
            this.q.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public final void setOnClickPeriodItemListener(AdapterView.OnItemClickListener onItemClickListener) {
        Object[] objArr = {onItemClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54882fb98ae971b0e85ae1ba04bc2b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54882fb98ae971b0e85ae1ba04bc2b6c");
            return;
        }
        MTPayment mTPayment = this.A ? this.s : this.r;
        if (mTPayment == null || mTPayment.getInstallment() == null) {
            return;
        }
        this.w.setOnItemClickListener(onItemClickListener);
    }
}
