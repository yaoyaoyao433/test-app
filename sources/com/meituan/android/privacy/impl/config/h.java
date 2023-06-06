package com.meituan.android.privacy.impl.config;

import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h<T> {
    public static ChangeQuickRedirect a;
    private int b;
    private final int c;
    private final LruCache<T, Boolean> d;

    public h(int i) {
        Object[] objArr = {30};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bea1eafd735afa248b9148440c104c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bea1eafd735afa248b9148440c104c0");
            return;
        }
        this.c = 30;
        this.d = new LruCache<>(30);
    }

    public final void a(T t, boolean z) {
        Object[] objArr = {t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7e2305713eab850485781eea982e37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7e2305713eab850485781eea982e37");
        } else if (z) {
            if (this.b >= this.c) {
                return;
            }
            synchronized (this) {
                if (this.b >= this.c) {
                    return;
                }
                if (this.d.get(t) == null) {
                    this.b++;
                    this.d.put(t, Boolean.TRUE);
                }
            }
        } else {
            synchronized (this) {
                this.d.put(t, Boolean.TRUE);
            }
        }
    }

    public final Set<T> a() {
        Set<T> keySet;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c226cc30534581cb4b601fa0254c6a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c226cc30534581cb4b601fa0254c6a0d");
        }
        synchronized (this) {
            keySet = this.d.snapshot().keySet();
        }
        return keySet;
    }

    public final String toString() {
        Set<T> keySet;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ade2dc1a771994c7f20831c636426d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ade2dc1a771994c7f20831c636426d");
        }
        synchronized (this) {
            keySet = this.d.snapshot().keySet();
        }
        StringBuilder sb = new StringBuilder();
        for (T t : keySet) {
            sb.append(t);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return "LruCacheSet{mCurrentNum=" + this.b + ", mMaxNum=" + this.c + ", mCache=" + sb.toString() + '}';
    }
}
