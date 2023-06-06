package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import com.unionpay.uppay.PayActivity;
/* loaded from: classes6.dex */
public final class x extends y {
    public x(Context context, com.unionpay.mobile.android.model.e eVar) {
        super(context, eVar);
    }

    @Override // com.unionpay.mobile.android.pro.views.y
    public final com.unionpay.mobile.android.pro.pboc.engine.b s() {
        Object a = ((PayActivity) this.d).a(com.unionpay.mobile.android.pro.pboc.engine.b.class.toString());
        if (a != null) {
            return (com.unionpay.mobile.android.pro.pboc.engine.b) a;
        }
        return null;
    }
}
