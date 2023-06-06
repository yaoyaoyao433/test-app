package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes6.dex */
public final class ak implements ServiceConnection {
    final /* synthetic */ ag a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(ag agVar) {
        this.a = agVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        List<Message> list;
        List list2;
        Messenger messenger;
        synchronized (this.a) {
            this.a.e = new Messenger(iBinder);
            ag.a(this.a, false);
            list = this.a.i;
            for (Message message : list) {
                try {
                    messenger = this.a.e;
                    messenger.send(message);
                } catch (RemoteException e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                }
            }
            list2 = this.a.i;
            list2.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.e = null;
        ag.a(this.a, false);
    }
}
