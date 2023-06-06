package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.pay.common.payment.bean.MTNewCardBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l extends k {
    public static ChangeQuickRedirect m;
    private MTNewCardBean n;

    public l(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca7128fc0c7cdef47eb0b4566a1b34af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca7128fc0c7cdef47eb0b4566a1b34af");
        }
    }

    public final void setMtNewCardBean(MTNewCardBean mTNewCardBean) {
        this.n = mTNewCardBean;
    }

    @Override // com.meituan.android.pay.desk.payment.view.k, com.meituan.android.pay.desk.payment.view.d
    public final String getNameText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68b81e8e6e4a85ee0d627aedefef2996", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68b81e8e6e4a85ee0d627aedefef2996");
        }
        if (this.n == null || TextUtils.isEmpty(this.n.getCommonTitle())) {
            return getContext().getResources().getString(R.string.mpay__add_newcard);
        }
        return this.n.getCommonTitle();
    }
}
