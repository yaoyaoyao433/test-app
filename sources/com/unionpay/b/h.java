package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.tsmservice.mi.ITsmCallback;
import com.unionpay.tsmservice.mi.result.VendorPayStatusResult;
import com.unionpay.utils.j;
/* loaded from: classes6.dex */
public final class h extends ITsmCallback.Stub {
    private int a = 4000;
    private Handler b;

    public h(Handler handler) {
        this.b = handler;
    }

    @Override // com.unionpay.tsmservice.mi.ITsmCallback
    public final void onError(String str, String str2) {
        j.b("uppay", "errorCode:" + str + ", errorDesc:" + str2);
        Handler handler = this.b;
        Handler handler2 = this.b;
        int i = this.a;
        handler.sendMessage(Message.obtain(handler2, 1, i, 0, str + str2));
    }

    @Override // com.unionpay.tsmservice.mi.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.a != 4000) {
            return;
        }
        j.b("uppay-spay", "query vendor pay status callback");
        bundle.setClassLoader(VendorPayStatusResult.class.getClassLoader());
        this.b.sendMessage(Message.obtain(this.b, 4000, ((VendorPayStatusResult) bundle.get("result")).getVendorPayStatusResult()));
    }
}
