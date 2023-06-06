package com.meituan.android.elderly.view.revision;

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
public final class f extends com.meituan.android.pay.desk.payment.view.d {
    public static ChangeQuickRedirect a;
    private String m;

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final boolean a() {
        return false;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final int getLayoutResource() {
        return R.layout.cashier_elderly_payment_view;
    }

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4724c7f778baaa2c3be7ca8fef2702b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4724c7f778baaa2c3be7ca8fef2702b");
        }
    }

    public final void setNoPromoInfo(String str) {
        this.m = str;
    }

    @Override // com.meituan.android.pay.desk.payment.view.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ce7eecac6587179a58506508ef3777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ce7eecac6587179a58506508ef3777");
            return;
        }
        super.b();
        if (CommonABTestManager.b() && !TextUtils.isEmpty(this.m)) {
            this.l.setVisibility(0);
            this.l.setTextColor(ContextCompat.getColor(getContext(), R.color.cashier__third_payment_discount_tag_color));
            this.l.setText(this.m);
            return;
        }
        this.l.setVisibility(8);
    }
}
