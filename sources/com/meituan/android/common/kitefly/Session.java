package com.meituan.android.common.kitefly;

import android.support.annotation.NonNull;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Session {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String mSessionId;
    private final ConcurrentHashMap<String, AtomicInteger> mType2Id;
    private final LruCache<String, AtomicInteger> mType2IdQuick;

    public static Session getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e2d10ba3dc118db510e22152b472a9a", 6917529027641081856L) ? (Session) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e2d10ba3dc118db510e22152b472a9a") : Inner.sInstance;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Inner {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final Session sInstance = new Session();
    }

    public Session() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b584868546b2575efbc5ac80cfbbec7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b584868546b2575efbc5ac80cfbbec7d");
            return;
        }
        this.mType2Id = new ConcurrentHashMap<>();
        this.mType2IdQuick = new LruCache<>(10);
        this.mSessionId = KiteFly.getUUID32();
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public int addAndGet(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4c17db740a9a692f8be5e37d1ae5623", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4c17db740a9a692f8be5e37d1ae5623")).intValue();
        }
        AtomicInteger atomicInteger = this.mType2IdQuick.get(str);
        if (atomicInteger != null) {
            return atomicInteger.addAndGet(1);
        }
        AtomicInteger atomicInteger2 = this.mType2Id.get(str);
        if (atomicInteger2 == null) {
            synchronized (this) {
                atomicInteger2 = this.mType2Id.get(str);
                if (atomicInteger2 == null) {
                    atomicInteger2 = new AtomicInteger(0);
                    this.mType2Id.put(str, atomicInteger2);
                }
            }
        }
        this.mType2IdQuick.put(str, atomicInteger2);
        return atomicInteger2.addAndGet(1);
    }
}
