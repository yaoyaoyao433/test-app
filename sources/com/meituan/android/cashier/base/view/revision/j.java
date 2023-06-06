package com.meituan.android.cashier.base.view.revision;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.android.paycommon.lib.abtest.CommonABTestManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j extends com.meituan.android.pay.desk.payment.view.d {
    public static ChangeQuickRedirect a;
    private boolean m;
    private String n;

    public j(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07d9c1fa86edf37e6bfad22059daace", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07d9c1fa86edf37e6bfad22059daace");
        } else {
            this.m = true;
        }
    }

    public final void setNoPromoInfo(String str) {
        this.n = str;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90f11ccaf476abca34efe1895ff52ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90f11ccaf476abca34efe1895ff52ec");
            return;
        }
        super.b();
        if (CommonABTestManager.b() && !TextUtils.isEmpty(this.n)) {
            this.l.setVisibility(0);
            this.l.setTextColor(ContextCompat.getColor(getContext(), R.color.cashier__third_payment_discount_tag_color));
            this.l.setText(this.n);
            return;
        }
        this.l.setVisibility(8);
    }

    public final void setShowDivider(boolean z) {
        this.m = z;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "625af36746cd1bec605ad3cf8936f5cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "625af36746cd1bec605ad3cf8936f5cf")).booleanValue() : this.m;
    }
}
