package com.unionpay;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class d extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Handler handler;
        com.unionpay.a.d dVar;
        Context context;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        handler = UPPayAssistEx.R;
        handler.sendEmptyMessageDelayed(1001, 800L);
        dVar = UPPayAssistEx.Q;
        context = UPPayAssistEx.G;
        com.unionpay.a.c cVar = new com.unionpay.a.c(dVar, context);
        cVar.a();
        String b = cVar.b();
        handler2 = UPPayAssistEx.R;
        if (handler2 != null) {
            handler3 = UPPayAssistEx.R;
            Message obtainMessage = handler3.obtainMessage();
            obtainMessage.what = 1002;
            obtainMessage.obj = b;
            handler4 = UPPayAssistEx.R;
            handler4.removeMessages(1001);
            handler5 = UPPayAssistEx.R;
            handler5.sendMessage(obtainMessage);
        }
    }
}
