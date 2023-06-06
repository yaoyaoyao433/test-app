package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes6.dex */
public final class au implements ServiceConnection {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(a aVar) {
        this.a = aVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        List<Message> list;
        List list2;
        Messenger messenger;
        synchronized (this.a) {
            this.a.j = new Messenger(iBinder);
            a.a(this.a, false);
            list = this.a.h;
            for (Message message : list) {
                try {
                    messenger = this.a.j;
                    messenger.send(message);
                } catch (RemoteException e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                }
            }
            list2 = this.a.h;
            list2.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.j = null;
        a.a(this.a, false);
    }
}
