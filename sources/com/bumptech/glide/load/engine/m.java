package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    public final void a(l<?> lVar) {
        com.bumptech.glide.util.h.a();
        if (this.a) {
            this.b.obtainMessage(1, lVar).sendToTarget();
            return;
        }
        this.a = true;
        lVar.d();
        this.a = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((l) message.obj).d();
                return true;
            }
            return false;
        }
    }
}
