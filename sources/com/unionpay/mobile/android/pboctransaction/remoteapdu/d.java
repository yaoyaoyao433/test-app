package com.unionpay.mobile.android.pboctransaction.remoteapdu;

import android.os.Handler;
import android.os.RemoteException;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.mobile.tsm.connect.IInitCallback;
/* loaded from: classes6.dex */
public final class d extends IInitCallback.Stub {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar) {
        this.a = aVar;
    }

    @Override // com.unionpay.mobile.tsm.connect.IInitCallback
    public final void initFailed() throws RemoteException {
        Handler handler;
        Handler handler2;
        k.a("plugin-tsm", "mInitCallback.initFailed()");
        handler = this.a.e;
        if (handler != null) {
            handler2 = this.a.e;
            handler2.removeMessages(3000);
        }
        if (this.a.a != null) {
            this.a.a.b();
        }
    }

    @Override // com.unionpay.mobile.tsm.connect.IInitCallback
    public final void initSucceed() throws RemoteException {
        Handler handler;
        Handler handler2;
        k.a("plugin-tsm", "mInitCallback.initSucceed()");
        handler = this.a.e;
        if (handler != null) {
            handler2 = this.a.e;
            handler2.removeMessages(3000);
        }
        if (this.a.a != null) {
            this.a.a.a();
        }
    }
}
