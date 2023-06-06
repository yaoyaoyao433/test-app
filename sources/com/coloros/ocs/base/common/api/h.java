package com.coloros.ocs.base.common.api;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.coloros.ocs.base.IAuthenticationListener;
import com.coloros.ocs.base.common.CapabilityInfo;
/* loaded from: classes.dex */
public class h extends com.coloros.ocs.base.common.b {
    private final String a;
    private b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(b bVar) {
        HandlerThread handlerThread = new HandlerThread("base_client");
        handlerThread.start();
        return new h(handlerThread.getLooper(), bVar);
    }

    private h(Looper looper, b bVar) {
        super(looper);
        this.a = h.class.getSimpleName();
        this.b = bVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        com.coloros.ocs.base.a.a.b(this.a, "base client handler what ".concat(String.valueOf(i)));
        switch (i) {
            case 1:
                b bVar = this.b;
                com.coloros.ocs.base.a.a.c(b.a, "onAuthenticateSucceed");
                bVar.b = 1;
                bVar.d = (CapabilityInfo) message.obj;
                com.coloros.ocs.base.a.a.b(b.a, "handleAuthenticateSuccess");
                if (bVar.g == null) {
                    bVar.a((Handler) null);
                }
                Message obtain = Message.obtain();
                obtain.what = 100;
                bVar.g.sendMessage(obtain);
                bVar.e();
                return;
            case 2:
                b bVar2 = this.b;
                int i2 = message.arg1;
                com.coloros.ocs.base.a.a.b(b.a, "onFailed time");
                if (bVar2.e != null) {
                    bVar2.c.getApplicationContext().unbindService(bVar2.e);
                    bVar2.h = null;
                }
                bVar2.b = 4;
                bVar2.d = b.b(i2);
                com.coloros.ocs.base.a.a.b(b.a, "connect failed , error code is ".concat(String.valueOf(i2)));
                if (i2 == 1002 || i2 == 1003 || i2 == 1004 || i2 == 1005 || i2 == 1006 || i2 == 1007 || i2 == 1008) {
                    bVar2.a(i2);
                    if (bVar2.f != null) {
                        bVar2.f.a();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                final b bVar3 = this.b;
                if (bVar3.h == null || bVar3.h.asBinder() == null || !bVar3.h.asBinder().isBinderAlive()) {
                    return;
                }
                try {
                    com.coloros.ocs.base.a.a.b(b.a, "thread handle authenticate");
                    bVar3.h.handleAuthentication(bVar3.f(), "1.0.1", new IAuthenticationListener.Stub() { // from class: com.coloros.ocs.base.common.api.BaseClient$1
                        @Override // com.coloros.ocs.base.IAuthenticationListener
                        public final void onSuccess(CapabilityInfo capabilityInfo) {
                            com.coloros.ocs.base.a.a.b(b.a, "thread authenticate success");
                            Message obtain2 = Message.obtain();
                            obtain2.what = 1;
                            obtain2.obj = capabilityInfo;
                            b.this.k.sendMessage(obtain2);
                        }

                        @Override // com.coloros.ocs.base.IAuthenticationListener
                        public final void onFail(int i3) {
                            com.coloros.ocs.base.a.a.c(b.a, "errorCode ".concat(String.valueOf(i3)));
                            Message obtain2 = Message.obtain();
                            obtain2.what = 2;
                            obtain2.arg1 = i3;
                            b.this.k.sendMessage(obtain2);
                        }
                    });
                    return;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    String str = b.a;
                    com.coloros.ocs.base.a.a.d(str, "the exception that service broker authenticates is " + e.getMessage());
                    return;
                }
            case 4:
                this.b.h();
                return;
            case 5:
                this.b.g();
                return;
            default:
                return;
        }
    }
}
