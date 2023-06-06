package com.coloros.ocs.base.common.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.coloros.ocs.base.IServiceBroker;
import com.coloros.ocs.base.common.AuthResult;
import com.coloros.ocs.base.common.CapabilityInfo;
import com.coloros.ocs.base.common.api.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/* loaded from: classes.dex */
public abstract class b<T extends IBinder> implements a.e {
    static final String a = "b";
    Context c;
    CapabilityInfo d;
    l f;
    IServiceBroker h;
    private Looper i;
    private h k;
    private boolean m;
    volatile int b = 4;
    b<T>.a e = null;
    private Queue<g> j = new LinkedList();
    i g = null;
    private int l = 3;
    private IBinder.DeathRecipient n = new IBinder.DeathRecipient() { // from class: com.coloros.ocs.base.common.api.b.1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.coloros.ocs.base.a.a.d(b.a, "binderDied()");
            b.f(b.this);
            if (b.this.h != null && b.this.h.asBinder() != null && b.this.h.asBinder().isBinderAlive()) {
                b.this.h.asBinder().unlinkToDeath(b.this.n, 0);
                b.this.h = null;
            }
            if (!b.this.m || b.this.d == null) {
                return;
            }
            b.e(b.this);
            b.this.a(true);
        }
    };

    public abstract String f();

    static /* synthetic */ int e(b bVar) {
        bVar.b = 13;
        return 13;
    }

    static /* synthetic */ a f(b bVar) {
        bVar.e = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, Looper looper) {
        if (context != null) {
            this.c = context;
            if (looper != null) {
                this.i = looper;
                this.k = h.a(this);
                String str = a;
                StringBuilder sb = new StringBuilder("build client, ");
                f();
                sb.append(f());
                com.coloros.ocs.base.a.a.b(str, sb.toString());
                return;
            }
            throw new NullPointerException(String.valueOf("Looper must not be null"));
        }
        throw new NullPointerException("null reference");
    }

    @RequiresApi(api = 4)
    private static Intent j() {
        Intent intent = new Intent("com.coloros.opencapabilityservice");
        com.coloros.ocs.base.a.a.a(a, "packageName = ".concat(String.valueOf("com.coloros.ocs.opencapabilityservice")));
        intent.setComponent(new ComponentName("com.coloros.ocs.opencapabilityservice", "com.coloros.ocs.opencapabilityservice.service.ColorOcsService"));
        return intent;
    }

    @Override // com.coloros.ocs.base.common.api.a.e
    @RequiresApi(api = 4)
    public final void a() {
        a(true);
    }

    void a(boolean z) {
        if (z) {
            this.l = 3;
        }
        com.coloros.ocs.base.a.a.b(a, "connect");
        this.b = 2;
        this.e = new a(this, (byte) 0);
        boolean bindService = this.c.getApplicationContext().bindService(j(), this.e, 1);
        com.coloros.ocs.base.a.a.c(a, "connect state ".concat(String.valueOf(bindService)));
        if (bindService) {
            return;
        }
        k();
    }

    private void k() {
        com.coloros.ocs.base.a.a.c(a, "retry");
        if (this.l != 0) {
            this.l--;
            a(false);
            return;
        }
        this.d = b(3);
        a(3);
        if (this.f != null) {
            this.f.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.m || this.e == null || this.e == null) {
            return;
        }
        com.coloros.ocs.base.a.a.b(a, "disconnect service.");
        this.c.getApplicationContext().unbindService(this.e);
        this.b = 5;
        if (this.m) {
            return;
        }
        this.h = null;
    }

    @Override // com.coloros.ocs.base.common.api.a.e
    public final void b() {
        if (this.e != null) {
            com.coloros.ocs.base.a.a.c(a, "disconnect service.");
            this.d = null;
            this.c.getApplicationContext().unbindService(this.e);
            this.b = 4;
        }
    }

    @Override // com.coloros.ocs.base.common.api.a.e
    public final AuthResult d() {
        return this.d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@Nullable Handler handler) {
        if (this.g == null) {
            if (handler == null) {
                this.g = new i(this.i, this.k);
            } else {
                this.g = new i(handler.getLooper(), this.k);
            }
        } else if (handler == null || this.g.getLooper() == handler.getLooper()) {
        } else {
            com.coloros.ocs.base.a.a.b(a, "the new handler looper is not the same as the old one.");
        }
    }

    @Override // com.coloros.ocs.base.common.api.a.e
    public final void a(f fVar, @Nullable Handler handler) {
        if (this.d == null || this.d.a == null || this.d.a.a != 1001) {
            a(handler);
            this.g.a = fVar;
        } else if (fVar != null) {
            fVar.onConnectionSucceed();
        }
    }

    @Override // com.coloros.ocs.base.common.api.a.e
    public final void a(l lVar) {
        this.f = lVar;
    }

    @Override // com.coloros.ocs.base.common.api.a.e
    public final boolean c() {
        return this.b == 1 || this.b == 5;
    }

    @Override // com.coloros.ocs.base.common.api.a.e
    public final <T> void a(g<T> gVar) {
        if (c()) {
            if (this.m) {
                if (this.h != null && this.h.asBinder() != null && this.h.asBinder().isBinderAlive()) {
                    b(gVar);
                    return;
                } else {
                    a((g) gVar, true);
                    return;
                }
            }
            b(gVar);
            return;
        }
        if (this.b == 13) {
            a((g) gVar, true);
        } else {
            a((g) gVar, false);
        }
    }

    private void a(g gVar, boolean z) {
        com.coloros.ocs.base.a.a.b(a, "add taskListenerHolder to queue,but whether is connect ".concat(String.valueOf(z)));
        this.j.add(gVar);
        if (z) {
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        while (this.j.size() > 0) {
            com.coloros.ocs.base.a.a.b(a, "handleQue");
            b(this.j.poll());
        }
        com.coloros.ocs.base.a.a.b(a, "task queue is end");
    }

    private void b(g gVar) {
        if (this.d == null || this.d.a == null) {
            return;
        }
        if (this.d.a.a == 1001) {
            gVar.a(0);
        } else {
            gVar.a(this.d.a.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        com.coloros.ocs.base.a.a.b(a, "handleAuthenticateFailure");
        if (this.g == null) {
            a((Handler) null);
        }
        Message obtain = Message.obtain();
        obtain.what = 101;
        obtain.arg1 = i;
        this.g.sendMessage(obtain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        com.coloros.ocs.base.a.a.b(a, "onReconnectSucceed");
        this.b = 1;
        try {
            this.d.b = this.h.getBinder(f(), "1.0.1");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        g();
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CapabilityInfo b(int i) {
        return new CapabilityInfo(new ArrayList(), 1, new AuthResult("", 0, 0, i, new byte[0]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements ServiceConnection {
        private a() {
        }

        /* synthetic */ a(b bVar, byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.coloros.ocs.base.a.a.b(b.a, "onServiceConnected");
            b.this.h = IServiceBroker.Stub.asInterface(iBinder);
            try {
                b.this.h.asBinder().linkToDeath(b.this.n, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (b.this.d == null) {
                com.coloros.ocs.base.a.a.b(b.a, "handle authenticate");
                b.this.k.sendEmptyMessage(3);
                return;
            }
            com.coloros.ocs.base.a.a.b(b.a, "handle reconnect");
            Message obtain = Message.obtain();
            obtain.what = 4;
            b.this.k.sendMessage(obtain);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            com.coloros.ocs.base.a.a.d(b.a, "onServiceDisconnected()");
            b.e(b.this);
            b.f(b.this);
            b.this.h = null;
        }
    }
}
