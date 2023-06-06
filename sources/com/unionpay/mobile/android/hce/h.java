package com.unionpay.mobile.android.hce;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class h extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ f c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(f fVar, String str, String str2) {
        this.c = fVar;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean a;
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        Handler handler6;
        int i;
        a = this.c.a(this.a, this.b);
        if (!a) {
            handler = this.c.y;
            if (handler != null) {
                handler2 = this.c.y;
                Message obtainMessage = handler2.obtainMessage(2005, this.a);
                handler3 = this.c.y;
                handler3.sendMessage(obtainMessage);
                return;
            }
            return;
        }
        handler4 = this.c.y;
        if (handler4 != null) {
            handler5 = this.c.y;
            Message obtainMessage2 = handler5.obtainMessage(2006, this.a);
            handler6 = this.c.y;
            i = this.c.i;
            handler6.sendMessageDelayed(obtainMessage2, i);
        }
    }
}
