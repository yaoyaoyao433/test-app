package com.coloros.ocs.base.common.api;

import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class g<T> {
    com.coloros.ocs.base.task.b<T> a;
    a<T> b;
    private final String c = g.class.getSimpleName();
    private Looper d;
    private int e;
    private b<T> f;
    private g<T>.c g;

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(com.coloros.ocs.base.task.b<T> bVar, int i, String str);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(com.coloros.ocs.base.task.b<T> bVar);
    }

    public g(Looper looper, com.coloros.ocs.base.task.b<T> bVar, b<T> bVar2, a<T> aVar) {
        this.d = looper;
        this.a = bVar;
        this.f = bVar2;
        this.b = aVar;
        this.g = new c(this.d);
    }

    public final void a(int i) {
        this.e = i;
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.arg1 = this.e;
        this.g.sendMessage(obtain);
    }

    /* loaded from: classes.dex */
    public class c extends com.coloros.ocs.base.common.b {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                g.a(g.this, message.arg1);
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    static /* synthetic */ void a(g gVar, int i) {
        com.coloros.ocs.base.a.a.c(gVar.c, "errorCode ".concat(String.valueOf(i)));
        if (i == 0) {
            if (gVar.f != null) {
                com.coloros.ocs.base.a.a.b(gVar.c, "notifier is not null ");
                gVar.f.a(gVar.a);
            }
        } else if (gVar.b != null) {
            gVar.b.a(gVar.a, i, com.coloros.ocs.base.common.constant.a.a(i));
        }
    }
}
