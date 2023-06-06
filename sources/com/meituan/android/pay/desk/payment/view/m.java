package com.meituan.android.pay.desk.payment.view;

import android.animation.Animator;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.promotion.bean.CardInfo;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m extends d {
    public static ChangeQuickRedirect a;
    private int m;
    private MTPayment n;
    private LinearLayout o;
    private TextView p;
    private TextView q;
    private Animator r;
    private boolean s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        NORMAL_NO_COMBINE,
        NORMAL_COMBINE,
        ABNORMAL;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ccf3cebb407996a586e06c166f2ada", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ccf3cebb407996a586e06c166f2ada");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d3ff40f043f7966b7a5701d97358566", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d3ff40f043f7966b7a5701d97358566") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00908ae6d23dc18db53d79f2b2bfaff5", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00908ae6d23dc18db53d79f2b2bfaff5") : (a[]) values().clone();
        }
    }

    public m(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d69a212724fc83391d2f1f80c96c7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d69a212724fc83391d2f1f80c96c7a");
        } else {
            this.m = 0;
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void b(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3920a09577aa29d2c922827d8ede6eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3920a09577aa29d2c922827d8ede6eae");
            return;
        }
        if (dVar instanceof MTPayment) {
            this.n = (MTPayment) dVar;
        }
        super.b(dVar);
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final View d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709af60b209d56885ce19a74c8c39c7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709af60b209d56885ce19a74c8c39c7e");
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__payment_append_view_value_card, (ViewGroup) null);
        setValueCardAppendViewMargin(inflate);
        this.o = (LinearLayout) inflate.findViewById(R.id.combine_bank);
        this.p = (TextView) inflate.findViewById(R.id.combine_bank_name);
        this.q = (TextView) inflate.findViewById(R.id.combine_bank_name_ext);
        getViewTreeObserver().addOnGlobalLayoutListener(n.a(this));
        return inflate;
    }

    public static /* synthetic */ void a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb70d447cc9aab4d15b5bffe24e9d094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb70d447cc9aab4d15b5bffe24e9d094");
        } else {
            mVar.setAnimOpen(true);
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40523ba271272913ffdaeea69cc8538f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40523ba271272913ffdaeea69cc8538f")).booleanValue();
        }
        a k = k();
        return k == a.NORMAL_COMBINE || k == a.NORMAL_NO_COMBINE;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e54721a7259ba8bd0d50c7e8a2911c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e54721a7259ba8bd0d50c7e8a2911c");
            return;
        }
        super.g();
        switch (k()) {
            case NORMAL_COMBINE:
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c40b9ac256adef63fb079c24cf5a8f5e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c40b9ac256adef63fb079c24cf5a8f5e");
                    return;
                }
                if (this.i.isChecked()) {
                    if (this.o.getVisibility() != 0) {
                        this.o.setVisibility(0);
                    }
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e89661859f7a3fe4e938950add3313ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e89661859f7a3fe4e938950add3313ef");
                    } else {
                        Payment a2 = com.meituan.android.pay.common.payment.utils.d.a(this.n);
                        if (a2 != null) {
                            String name = a2.getName();
                            String str = "";
                            CardInfo cardInfo = a2.getCardInfo();
                            String str2 = getResources().getString(R.string.mpay__combine_pay_selected_bank_name) + name;
                            if (TextUtils.equals(a2.getPayType(), "quickbank")) {
                                str = (cardInfo != null ? cardInfo.getNameExt() : "") + getResources().getString(R.string.mpay__combine_pay_selected_bank_name_ext) + this.n.getCombineMoney();
                            } else if (TextUtils.equals(a2.getPayType(), "balancepay")) {
                                str = getResources().getString(R.string.mpay__combine_pay_selected_bank_name_ext) + this.n.getCombineMoney();
                            } else if (TextUtils.equals(a2.getPayType(), "cardpay")) {
                                str = this.n.getCombineMoney();
                            }
                            this.p.setText(str2);
                            this.q.setText(str);
                        } else {
                            this.o.setVisibility(8);
                        }
                    }
                }
                this.r = com.meituan.android.pay.desk.payment.anim.b.a(this.o, this.r, this.m, 100);
                return;
            case NORMAL_NO_COMBINE:
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d49f843080797af20fc2292787fcc966", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d49f843080797af20fc2292787fcc966");
                    return;
                } else {
                    this.o.setVisibility(8);
                    return;
                }
            case ABNORMAL:
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4fe231063907d022430dbcd2d1082984", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4fe231063907d022430dbcd2d1082984");
                    return;
                } else {
                    this.o.setVisibility(8);
                    return;
                }
            default:
                return;
        }
    }

    private a k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f1acb3764d3930873da9e6c97907b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f1acb3764d3930873da9e6c97907b5");
        }
        int status = this.n.getStatus();
        if (status == 0 || status == 2) {
            if (this.n.getMtPaymentListPage() != null && !com.meituan.android.pay.common.payment.utils.d.f(this.n.getMtPaymentListPage())) {
                return a.NORMAL_COMBINE;
            }
            return a.NORMAL_NO_COMBINE;
        } else if (status == 1 || status == 4) {
            return a.ABNORMAL;
        } else {
            return a.NORMAL_NO_COMBINE;
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.d, com.meituan.android.pay.desk.payment.b
    public final void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86948a0a4e031faefe583bb29c4f38c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86948a0a4e031faefe583bb29c4f38c0");
            return;
        }
        if (this.s) {
            if (this.i.isChecked() && this.h != dVar) {
                this.m = 2;
            } else if (!this.i.isChecked() && this.h == dVar) {
                this.m = 1;
            } else {
                this.m = 0;
            }
        } else {
            this.m = 0;
        }
        super.a(dVar);
    }

    public final void setAnimOpen(boolean z) {
        this.s = z;
    }

    public final void setOnClickChangeBankListener(View.OnClickListener onClickListener) {
        boolean z = true;
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ec0f671644d02cef1a15cdbc427d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ec0f671644d02cef1a15cdbc427d53");
            return;
        }
        if ((this.n.getMtPaymentListPage() == null || com.meituan.android.paybase.utils.i.a((Collection) this.n.getMtPaymentListPage().getMtPaymentList())) ? false : false) {
            this.o.setOnClickListener(onClickListener);
        }
    }

    private void setValueCardAppendViewMargin(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4925b45eb93d360e504f34304ff8c410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4925b45eb93d360e504f34304ff8c410");
        } else if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.combine_bank_name);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = aj.a(getContext(), 44.0f);
            textView.setLayoutParams(layoutParams);
        }
    }
}
