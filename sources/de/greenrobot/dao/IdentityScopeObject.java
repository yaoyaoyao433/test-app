package de.greenrobot.dao;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IdentityScopeObject<K, T> implements IdentityScope<K, T> {
    private final HashMap<K, Reference<T>> map = new HashMap<>();
    private final ReentrantLock lock = new ReentrantLock();

    @Override // de.greenrobot.dao.IdentityScope
    public void reserveRoom(int i) {
    }

    @Override // de.greenrobot.dao.IdentityScope
    public T get(K k) {
        this.lock.lock();
        try {
            Reference<T> reference = this.map.get(k);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.IdentityScope
    public T getNoLock(K k) {
        Reference<T> reference = this.map.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // de.greenrobot.dao.IdentityScope
    public void put(K k, T t) {
        this.lock.lock();
        try {
            this.map.put(k, new WeakReference(t));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.IdentityScope
    public void putNoLock(K k, T t) {
        this.map.put(k, new WeakReference(t));
    }

    @Override // de.greenrobot.dao.IdentityScope
    public boolean detach(K k, T t) {
        this.lock.lock();
        try {
            if (get(k) != t || t == null) {
                this.lock.unlock();
                return false;
            }
            remove((IdentityScopeObject<K, T>) k);
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // de.greenrobot.dao.IdentityScope
    public void remove(K k) {
        this.lock.lock();
        try {
            this.map.remove(k);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.IdentityScope
    public void remove(Iterable<K> iterable) {
        this.lock.lock();
        try {
            for (K k : iterable) {
                this.map.remove(k);
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.IdentityScope
    public void clear() {
        this.lock.lock();
        try {
            this.map.clear();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // de.greenrobot.dao.IdentityScope
    public void lock() {
        this.lock.lock();
    }

    @Override // de.greenrobot.dao.IdentityScope
    public void unlock() {
        this.lock.unlock();
    }
}
