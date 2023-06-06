package com.meituan.android.pay.hellodialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.model.bean.DiscountDowngrade;
import com.meituan.android.pay.model.bean.DiscountDowngradeDetail;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DiscountDowngradeDialog extends Dialog {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    public DiscountDowngradeDialog(Context context, DiscountDowngrade discountDowngrade, a aVar) {
        super(context, R.style.mpay__guide_dialog);
        Object[] objArr = {context, discountDowngrade, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0053d26cdab7746a1a735b06b1ad9156", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0053d26cdab7746a1a735b06b1ad9156");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.mpay__discount_downgrade, (ViewGroup) null);
        int a2 = aj.a(context, 300.0f);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        setContentView(inflate, new ViewGroup.LayoutParams(windowManager != null ? (int) (windowManager.getDefaultDisplay().getWidth() * 0.833d) : a2, -2));
        setCancelable(false);
        a(discountDowngrade, aVar);
    }

    @SuppressLint({"InflateParams"})
    private void a(DiscountDowngrade discountDowngrade, a aVar) {
        Object[] objArr = {discountDowngrade, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dd25af8a038c36b870819241e21b009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dd25af8a038c36b870819241e21b009");
            return;
        }
        TextView textView = (TextView) findViewById(R.id.mpay__real_price);
        textView.setText(com.meituan.android.paybase.utils.d.a(discountDowngrade.getOrderMoney()).toString());
        ((TextView) findViewById(R.id.mpay__discount_downgrade_tip)).setText(discountDowngrade.getMessage());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mpay__discount_downgrade_combine_detail_container);
        List<DiscountDowngradeDetail> downgradeDetail = discountDowngrade.getDowngradeDetail();
        if (!i.a((Collection) downgradeDetail)) {
            for (DiscountDowngradeDetail discountDowngradeDetail : downgradeDetail) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__discount_downgrade_combine_detail, (ViewGroup) null);
                if (discountDowngradeDetail != null) {
                    ((TextView) inflate.findViewById(R.id.mpay__discount_downgrade_combine_pay_name)).setText(discountDowngradeDetail.getTitle());
                    ((TextView) inflate.findViewById(R.id.mpay__discount_downgrade_combine_pay_amount)).setText(discountDowngradeDetail.getMsg());
                    linearLayout.addView(inflate);
                }
            }
            linearLayout.setVisibility(0);
        }
        Typeface a2 = m.a(getContext());
        if (a2 != null) {
            textView.setTypeface(a2);
            ((TextView) findViewById(R.id.mpay__money_symbol)).setTypeface(a2);
        }
        findViewById(R.id.mpay__dialog_cancel).setOnClickListener(com.meituan.android.pay.hellodialog.a.a(this, aVar));
        findViewById(R.id.mpay__discount_downgrade_submit_button).setOnClickListener(b.a(this, aVar));
    }

    public static /* synthetic */ void b(DiscountDowngradeDialog discountDowngradeDialog, a aVar, View view) {
        Object[] objArr = {discountDowngradeDialog, aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62a135412b866985472bd4036d7bbcc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62a135412b866985472bd4036d7bbcc0");
            return;
        }
        if (aVar != null) {
            aVar.b();
        }
        discountDowngradeDialog.dismiss();
    }

    public static /* synthetic */ void a(DiscountDowngradeDialog discountDowngradeDialog, a aVar, View view) {
        Object[] objArr = {discountDowngradeDialog, aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf9e45aa8f661b7949795b5ddafac1fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf9e45aa8f661b7949795b5ddafac1fa");
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        discountDowngradeDialog.dismiss();
    }
}
