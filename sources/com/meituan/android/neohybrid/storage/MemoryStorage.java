package com.meituan.android.neohybrid.storage;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MemoryStorage implements e {
    public static ChangeQuickRedirect a;
    private Map<f, Map<String, Object>> b;
    private ReentrantReadWriteLock c;

    public MemoryStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e18c84908f93a5ae9105f15d2f42d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e18c84908f93a5ae9105f15d2f42d7");
            return;
        }
        this.b = new WeakHashMap();
        this.c = new ReentrantReadWriteLock();
    }

    public static MemoryStorage a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97f1e3454dc0403173a2724bd43f4c2f", RobustBitConfig.DEFAULT_VALUE) ? (MemoryStorage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97f1e3454dc0403173a2724bd43f4c2f") : a.a;
    }

    public final void a(f fVar, Map<String, Object> map) {
        Map<String, Object> map2;
        Object[] objArr = {fVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec32a6f250e33953948f6149edbc2171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec32a6f250e33953948f6149edbc2171");
        } else if (!b(fVar) || map == null || map.isEmpty()) {
        } else {
            this.c.writeLock().lock();
            try {
                if (this.b.containsKey(fVar)) {
                    map2 = this.b.get(fVar);
                } else {
                    HashMap hashMap = new HashMap();
                    this.b.put(fVar, hashMap);
                    fVar.getLifecycle().a(this);
                    map2 = hashMap;
                }
                map2.putAll(map);
            } finally {
                this.c.writeLock().unlock();
            }
        }
    }

    public final Map<String, Object> a(f fVar, Set<String> set) {
        Object[] objArr = {fVar, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f4538325e369a498ce2077d5a20bc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f4538325e369a498ce2077d5a20bc8");
        }
        if (!b(fVar) || set == null || set.isEmpty()) {
            return null;
        }
        this.c.readLock().lock();
        try {
            Map<String, Object> map = this.b.get(fVar);
            if (map != null && !map.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (String str : set) {
                    hashMap.put(str, map.get(str));
                }
                return hashMap;
            }
            return null;
        } finally {
            this.c.readLock().unlock();
        }
    }

    public final Map<String, Object> a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9632d09f0cc158b8aa850d072bbc4a76", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9632d09f0cc158b8aa850d072bbc4a76");
        }
        if (b(fVar)) {
            this.c.readLock().lock();
            try {
                return this.b.get(fVar);
            } finally {
                this.c.readLock().unlock();
            }
        }
        return null;
    }

    @OnLifecycleEvent(d.a.ON_DESTROY)
    private void onDestroy(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f1c602fa4d180a697737078d434f101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f1c602fa4d180a697737078d434f101");
        } else if (fVar != null) {
            Object[] objArr2 = {fVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "121b63c923320e53295a502af1d12f6c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "121b63c923320e53295a502af1d12f6c");
            } else {
                this.c.writeLock().lock();
                try {
                    this.b.remove(fVar);
                } finally {
                    this.c.writeLock().unlock();
                }
            }
            fVar.getLifecycle().b(this);
        }
    }

    private boolean b(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ded09e75754b4b76f931b736e239db0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ded09e75754b4b76f931b736e239db0")).booleanValue() : fVar != null && fVar.getLifecycle().a().a(d.b.INITIALIZED);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        private static final MemoryStorage a = new MemoryStorage();
    }
}
