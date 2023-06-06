package com.unionpay.mobile.android.pboctransaction.remoteapdu;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.mobile.tsm.connect.IInitCallback;
import com.unionpay.mobile.tsm.connect.IRemoteApdu;
/* loaded from: classes6.dex */
public final class c implements ServiceConnection {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a aVar) {
        this.a = aVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        Handler handler2;
        IRemoteApdu iRemoteApdu;
        IInitCallback.Stub stub;
        IRemoteApdu iRemoteApdu2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        k.a("plugin-tsm", "mConnection.onServiceConnected()");
        handler = this.a.e;
        if (handler != null) {
            handler5 = this.a.e;
            handler5.removeMessages(3000);
        }
        try {
            a.b(this.a);
            this.a.b = IRemoteApdu.Stub.asInterface(iBinder);
            handler2 = this.a.e;
            if (handler2 != null) {
                handler3 = this.a.e;
                handler4 = this.a.e;
                handler3.sendMessageDelayed(Message.obtain(handler4, 3000), 8000L);
            }
            iRemoteApdu = this.a.b;
            stub = this.a.i;
            iRemoteApdu.registerCallback(stub);
            iRemoteApdu2 = this.a.b;
            iRemoteApdu2.init();
        } catch (Exception unused) {
            if (this.a.a != null) {
                this.a.a.b();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Handler handler;
        Handler handler2;
        k.a("plugin-tsm", "mConnection.onServiceDisconnected()");
        handler = this.a.e;
        if (handler != null) {
            handler2 = this.a.e;
            handler2.removeMessages(3000);
        }
        this.a.b = null;
        if (this.a.a != null) {
            this.a.a.b();
        }
    }
}
