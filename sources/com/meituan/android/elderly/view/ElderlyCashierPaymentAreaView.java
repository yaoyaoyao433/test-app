package com.meituan.android.elderly.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.android.elderly.bean.Cashier;
import com.meituan.android.elderly.bean.CashierPayment;
import com.meituan.android.elderly.view.revision.f;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.desk.payment.b;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ElderlyCashierPaymentAreaView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(CashierPayment cashierPayment);
    }

    public ElderlyCashierPaymentAreaView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c19f3ec2a49f6b42ad5f76c47a06413", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c19f3ec2a49f6b42ad5f76c47a06413");
        } else {
            a();
        }
    }

    public ElderlyCashierPaymentAreaView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729484d86a5009d7d64372479e368caf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729484d86a5009d7d64372479e368caf");
        } else {
            a();
        }
    }

    public ElderlyCashierPaymentAreaView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "970198ca49e4006a92d8a7a1b98afc0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "970198ca49e4006a92d8a7a1b98afc0f");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30929519095df2ac244ffd0a1380f7a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30929519095df2ac244ffd0a1380f7a9");
        } else {
            setOrientation(1);
        }
    }

    public final void a(List<CashierPayment> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d249b95201c782b7c17f321fa4d2204a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d249b95201c782b7c17f321fa4d2204a");
            return;
        }
        removeAllViews();
        if (i.a((Collection) list)) {
            return;
        }
        for (CashierPayment cashierPayment : list) {
            a(cashierPayment);
        }
    }

    private ViewGroup a(CashierPayment cashierPayment) {
        Object[] objArr = {cashierPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8989c3307635fb179fc2e337d8da1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8989c3307635fb179fc2e337d8da1c");
        }
        LinearLayout b = b();
        b.addView(b(cashierPayment));
        return b;
    }

    private LinearLayout b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf51d697bde3131786b532e9bf97df1", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf51d697bde3131786b532e9bf97df1");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.cashier__bg_paytype);
        linearLayout.setTag("elderlycashier_tag_area_third_pay");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.cashierelderly___pay_type_card_margin);
        layoutParams.leftMargin = dimensionPixelOffset;
        layoutParams.rightMargin = dimensionPixelOffset;
        layoutParams.topMargin = dimensionPixelOffset;
        addView(linearLayout, layoutParams);
        return linearLayout;
    }

    private f b(CashierPayment cashierPayment) {
        Object[] objArr = {cashierPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2bf18757b8119874a4e613802579a4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2bf18757b8119874a4e613802579a4a");
        }
        f fVar = new f(getContext());
        fVar.setNoPromoInfo(cashierPayment.getNoPromoInfo());
        fVar.b(cashierPayment);
        fVar.setOnClickListener(com.meituan.android.elderly.view.a.a(this, cashierPayment));
        return fVar;
    }

    public static /* synthetic */ void a(ElderlyCashierPaymentAreaView elderlyCashierPaymentAreaView, CashierPayment cashierPayment, View view) {
        Object[] objArr = {elderlyCashierPaymentAreaView, cashierPayment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5a3087781a2d08d4e77b36d9bc742cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5a3087781a2d08d4e77b36d9bc742cf");
        } else if (elderlyCashierPaymentAreaView.b != null) {
            elderlyCashierPaymentAreaView.b.a(cashierPayment);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d69ee55a68d2e26741ca3d3b16de6a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d69ee55a68d2e26741ca3d3b16de6a3");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("ElderlyCashierPaymentAreaView_state", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589bfacd88df246d093f3db694c6f581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589bfacd88df246d093f3db694c6f581");
        } else {
            super.onRestoreInstanceState(((Bundle) parcelable).getParcelable("ElderlyCashierPaymentAreaView_state"));
        }
    }

    public void setOnThirdPaymentClickListener(@Nullable a aVar) {
        this.b = aVar;
    }

    public void a(d dVar, ViewGroup viewGroup, Cashier cashier) {
        Object[] objArr = {dVar, viewGroup, cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea505c262353060f1be5e18d8f7cfb20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea505c262353060f1be5e18d8f7cfb20");
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof b) && dVar != null) {
                ((b) childAt).a(dVar);
            } else if (childAt instanceof LinearLayout) {
                a(dVar, (LinearLayout) childAt, cashier);
            }
        }
    }
}
