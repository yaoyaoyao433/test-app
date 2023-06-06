package com.unionpay.mobile.android.pboctransaction.samsung;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.unionpay.client3.tsm.ITsmConnection;
import com.unionpay.mobile.android.utils.k;
/* loaded from: classes6.dex */
public final class d implements ServiceConnection {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(b bVar) {
        this.a = bVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        k.a("plugin-clientV3", "startSamsungService onServiceConnected");
        try {
            this.a.c = ITsmConnection.Stub.asInterface(iBinder);
            handler = this.a.f;
            handler.removeMessages(1);
            this.a.a(true);
        } catch (Exception unused) {
            this.a.a(false);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Handler handler;
        k.a("plugin-clientV3", "startSamsungService onServiceDisconnected");
        this.a.c = null;
        handler = this.a.f;
        handler.removeMessages(1);
        this.a.a(false);
    }
}
