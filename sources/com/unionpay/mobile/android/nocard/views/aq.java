package com.unionpay.mobile.android.nocard.views;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public final class aq implements Handler.Callback {
    final /* synthetic */ ao a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.a.a.aP != com.unionpay.mobile.android.views.order.l.a.intValue() || this.a.a.J) {
            return true;
        }
        if (!TextUtils.isEmpty(this.a.a.u)) {
            this.a.a(13, this.a.p);
            return true;
        } else if (this.a.a.aC) {
            ao.d(this.a);
            return true;
        } else {
            return true;
        }
    }
}
