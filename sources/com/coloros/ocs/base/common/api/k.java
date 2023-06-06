package com.coloros.ocs.base.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.coloros.ocs.base.common.AuthResult;
import com.coloros.ocs.base.common.api.a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class k implements d {
    private static final String a = "k";
    private Lock b = new ReentrantLock();
    private a c;
    private a.e d;

    public k(Context context, a aVar, a.c cVar, com.coloros.ocs.base.internal.a aVar2) {
        com.coloros.ocs.base.a.a.d(a, "init color client impl");
        this.c = aVar;
        a aVar3 = this.c;
        if (aVar3.a != null) {
            this.d = aVar3.a.a(context, Looper.getMainLooper(), aVar2, cVar);
            return;
        }
        throw new IllegalStateException(String.valueOf("The ClientBuilder is null"));
    }

    @Override // com.coloros.ocs.base.common.api.d
    public final void a() {
        com.coloros.ocs.base.a.a.a(a, "connect()");
        this.b.lock();
        try {
            try {
                if (this.d != null) {
                    this.d.a();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.coloros.ocs.base.common.api.d
    public final void b() {
        this.b.lock();
        try {
            try {
                if (this.d != null && this.d.c()) {
                    this.d.b();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.coloros.ocs.base.common.api.d
    public final boolean c() {
        if (this.d != null) {
            return this.d.c();
        }
        return false;
    }

    @Override // com.coloros.ocs.base.common.api.d
    public final <T> void a(g<T> gVar) {
        if (this.d != null) {
            this.d.a(gVar);
        }
    }

    @Override // com.coloros.ocs.base.common.api.d
    public final AuthResult d() {
        if (this.d != null) {
            return this.d.d();
        }
        return null;
    }

    @Override // com.coloros.ocs.base.common.api.d
    public final void a(f fVar, @Nullable Handler handler) {
        if (this.d != null) {
            this.d.a(fVar, handler);
        }
    }

    @Override // com.coloros.ocs.base.common.api.d
    public final void a(l lVar) {
        if (this.d != null) {
            this.d.a(lVar);
        }
    }
}
