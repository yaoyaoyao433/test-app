package com.unionpay.mobile.android.hce;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class i implements ServiceConnection {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ f c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(f fVar, String str, String str2) {
        this.c = fVar;
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r9, android.os.IBinder r10) {
        /*
            r8 = this;
            com.unionpay.mobile.android.hce.f r9 = r8.c
            android.os.Handler r9 = com.unionpay.mobile.android.hce.f.d(r9)
            java.lang.String r0 = r8.a
            r1 = 2006(0x7d6, float:2.811E-42)
            r9.removeMessages(r1, r0)
            r9 = 0
            com.unionpay.mobile.android.hce.service.a r10 = com.unionpay.mobile.android.hce.service.a.AbstractBinderC1507a.a(r10)     // Catch: java.lang.Exception -> L13
            goto L18
        L13:
            r10 = move-exception
            r10.printStackTrace()
            r10 = r9
        L18:
            if (r10 == 0) goto Lac
            com.unionpay.mobile.android.hce.f r0 = r8.c     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            java.lang.String r0 = com.unionpay.mobile.android.hce.f.f(r0)     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            com.unionpay.mobile.android.hce.f r2 = r8.c     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            java.lang.String r2 = com.unionpay.mobile.android.hce.f.g(r2)     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            com.unionpay.mobile.android.hce.b r3 = new com.unionpay.mobile.android.hce.b     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            r4 = 2003(0x7d3, float:2.807E-42)
            java.lang.String r5 = r8.a     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            com.unionpay.mobile.android.hce.f r6 = r8.c     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            android.os.Handler r6 = com.unionpay.mobile.android.hce.f.d(r6)     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            java.lang.String r0 = r10.a(r0, r2, r3)     // Catch: android.os.RemoteException -> L5d java.lang.Exception -> L61
            com.unionpay.mobile.android.hce.f r9 = r8.c     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            android.os.Handler r9 = com.unionpay.mobile.android.hce.f.d(r9)     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            java.lang.String r2 = r8.a     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            android.os.Message r9 = r9.obtainMessage(r1, r2)     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            com.unionpay.mobile.android.hce.f r1 = r8.c     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            android.os.Handler r1 = com.unionpay.mobile.android.hce.f.d(r1)     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            com.unionpay.mobile.android.hce.f r2 = r8.c     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            int r2 = com.unionpay.mobile.android.hce.f.e(r2)     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            long r2 = (long) r2     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            r1.sendMessageDelayed(r9, r2)     // Catch: java.lang.Exception -> L56 android.os.RemoteException -> L58
            goto L62
        L56:
            goto L62
        L58:
            r9 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L5e
        L5d:
            r0 = move-exception
        L5e:
            r0.printStackTrace()
        L61:
            r0 = r9
        L62:
            if (r0 == 0) goto Lac
            java.lang.String r9 = r8.b
            java.lang.String r9 = com.unionpay.mobile.android.hce.a.a(r0, r9)
            com.unionpay.mobile.android.hce.f r0 = r8.c
            java.util.concurrent.ConcurrentHashMap r0 = com.unionpay.mobile.android.hce.f.c(r0)
            java.lang.String r1 = r8.a
            java.lang.Object r0 = r0.get(r1)
            com.unionpay.mobile.android.hce.l r0 = (com.unionpay.mobile.android.hce.l) r0
            if (r0 != 0) goto L81
            com.unionpay.mobile.android.hce.l r0 = new com.unionpay.mobile.android.hce.l
            java.lang.String r1 = r8.a
            r0.<init>(r1)
        L81:
            r0.a(r9)
            r0.a(r10)
            r0.d()
            com.unionpay.mobile.android.hce.f r9 = r8.c
            java.util.concurrent.ConcurrentHashMap r9 = com.unionpay.mobile.android.hce.f.c(r9)
            java.lang.String r10 = r8.a
            r9.put(r10, r0)
            com.unionpay.mobile.android.hce.f r9 = r8.c
            android.os.Handler r9 = com.unionpay.mobile.android.hce.f.d(r9)
            r10 = 2002(0x7d2, float:2.805E-42)
            java.lang.String r0 = r8.a
            android.os.Message r9 = r9.obtainMessage(r10, r0)
            com.unionpay.mobile.android.hce.f r10 = r8.c
            android.os.Handler r10 = com.unionpay.mobile.android.hce.f.d(r10)
            r10.sendMessage(r9)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.hce.i.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        handler = this.c.y;
        handler.removeMessages(2006, this.a);
        handler2 = this.c.y;
        Message obtainMessage = handler2.obtainMessage(2005, this.a);
        handler3 = this.c.y;
        handler3.sendMessage(obtainMessage);
    }
}
