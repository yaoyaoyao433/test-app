package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.pay.common.payment.bean.installment.PeriodCoupon;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.desk.component.bean.standardcomponent.HelloPayTransInfo;
import com.meituan.android.pay.desk.component.bean.standardcomponent.SelectedInstallment;
import com.meituan.android.paycommon.lib.utils.w;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private com.meituan.android.pay.common.payment.data.c c;

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
    }

    public n(LinearLayout linearLayout, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {linearLayout, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ae783ddd1c1446eaf1a6f19871d7a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ae783ddd1c1446eaf1a6f19871d7a8");
            return;
        }
        this.b = linearLayout;
        this.c = cVar;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37f62c65eb39a611cacfb55ea14db0ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37f62c65eb39a611cacfb55ea14db0ff")).booleanValue();
        }
        HelloPayTransInfo e = com.meituan.android.pay.desk.component.data.a.e(this.c);
        return (e == null || TextUtils.isEmpty(e.getDisplayName())) ? false : true;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76611340f78910e6cf7a569435d8fd2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76611340f78910e6cf7a569435d8fd2e");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_no_select_payment_view), (int) R.layout.paycommon__cobranded_card_container);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b237eae2aba2a96033adb36c18ad364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b237eae2aba2a96033adb36c18ad364");
            return;
        }
        HelloPayTransInfo e = com.meituan.android.pay.desk.component.data.a.e(this.c);
        LinearLayout linearLayout = this.b;
        Object[] objArr2 = {linearLayout, e};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b66fc3a5dfbf29029da146d9779874bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b66fc3a5dfbf29029da146d9779874bd");
        } else {
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.payment_icon);
            if (e.getIcon() != null && !TextUtils.isEmpty(e.getIcon().getEnable())) {
                w.a(e.getIcon().getEnable(), imageView, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
            } else {
                imageView.setImageResource(R.drawable.mpay__payment_default_pic);
            }
            List<CombineLabel> labels = e.getLabels();
            if (!com.meituan.android.paybase.utils.i.a((Collection) labels)) {
                ((PayLabelContainer) linearLayout.findViewById(R.id.payment_label_container)).b(labels, 3);
            }
            TextView textView = (TextView) linearLayout.findViewById(R.id.bank_name_tip);
            String displayName = e.getDisplayName();
            if (!TextUtils.isEmpty(displayName)) {
                textView.setVisibility(0);
                textView.setText(displayName);
            }
        }
        LinearLayout linearLayout2 = this.b;
        Object[] objArr3 = {linearLayout2, e};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9f181a013de1fe0f55f660ada1a2107e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9f181a013de1fe0f55f660ada1a2107e");
            return;
        }
        SelectedInstallment selectedInstallment = e.getSelectedInstallment();
        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.installment_info);
        if (com.meituan.android.pay.common.payment.utils.e.a(e.getIsSupportInstallment())) {
            if (selectedInstallment != null && selectedInstallment.getPeriod() != null) {
                Period period = selectedInstallment.getPeriod();
                linearLayout3.setVisibility(0);
                TextView textView2 = (TextView) linearLayout2.findViewById(R.id.installment_title);
                TextView textView3 = (TextView) linearLayout2.findViewById(R.id.installment_content);
                String title = period.getTitle();
                String content = period.getContent();
                List<PeriodCoupon> coupons = period.getCoupons();
                if (TextUtils.isEmpty(title)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(title);
                }
                if (com.meituan.android.paybase.utils.i.a((Collection) coupons)) {
                    textView3.setText(content);
                    textView3.setTextColor(linearLayout2.getResources().getColor(R.color.mpay__installment_content_color));
                    return;
                } else if (coupons.get(0) != null) {
                    textView3.setText(coupons.get(0).getContent());
                    textView3.setTextColor(linearLayout2.getResources().getColor(R.color.mpay__installment_content_color1));
                    return;
                } else {
                    return;
                }
            }
            linearLayout3.setVisibility(8);
        } else if (TextUtils.isEmpty(e.getUnsupportedInstallmentReason())) {
        } else {
            TextView textView4 = (TextView) linearLayout2.findViewById(R.id.paycommon__installment_unavailable_reason);
            textView4.setVisibility(0);
            textView4.setText(e.getUnsupportedInstallmentReason());
        }
    }
}
