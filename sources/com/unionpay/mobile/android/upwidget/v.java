package com.unionpay.mobile.android.upwidget;

import android.os.Handler;
import android.os.Message;
import com.unionpay.mobile.android.upwidget.UPScrollView;
import java.lang.ref.WeakReference;
/* loaded from: classes6.dex */
public final class v extends Handler {
    final /* synthetic */ UPScrollView a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(UPScrollView uPScrollView) {
        this.a = uPScrollView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        Handler handler;
        Handler handler2;
        int scrollY = this.a.getScrollY();
        i = this.a.b;
        if (i != scrollY) {
            this.a.b = scrollY;
            handler = this.a.d;
            handler2 = this.a.d;
            handler.sendMessageDelayed(handler2.obtainMessage(), 5L);
        }
        weakReference = this.a.a;
        if (weakReference != null) {
            weakReference2 = this.a.a;
            if (weakReference2.get() != null) {
                weakReference3 = this.a.a;
                ((UPScrollView.a) weakReference3.get()).e(scrollY);
            }
        }
    }
}
