package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.jj;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class jq<D extends jj> implements ji<D>, jp<D> {
    private ReentrantReadWriteLock a = new ReentrantReadWriteLock();

    @Override // com.tencent.mapsdk.internal.jp
    public final jp<D> m() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.jp
    public final void b(String str, D d) {
        try {
            this.a.writeLock().lock();
            a(str, (String) d);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.jp
    public final D b(String str, Class<D> cls) {
        try {
            this.a.readLock().lock();
            return a(str, cls);
        } finally {
            this.a.readLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.jp
    public final boolean b(String str) {
        try {
            this.a.writeLock().lock();
            return a(str);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.jp
    public final void j() {
        try {
            this.a.writeLock().lock();
            b();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.jp
    public final long k() {
        try {
            this.a.readLock().lock();
            return c();
        } finally {
            this.a.readLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.jp
    public final long l() {
        try {
            this.a.readLock().lock();
            return d();
        } finally {
            this.a.readLock().unlock();
        }
    }
}
