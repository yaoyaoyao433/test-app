package com.dianping.nvtunnelkit.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a<K, V> {
    public static ChangeQuickRedirect a;
    public final Map<K, V> b;
    public final Map<V, K> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6954b7ee8bbdbb75675c68f625a785f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6954b7ee8bbdbb75675c68f625a785f0");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    public final void a(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39ae05f0cd6071c8528be113cd2600b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39ae05f0cd6071c8528be113cd2600b");
        } else if (k == null || v == null) {
        } else {
            this.b.put(k, v);
            this.c.put(v, k);
        }
    }

    public final V a(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78311029613900199a85f3c3bb8d86c", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78311029613900199a85f3c3bb8d86c");
        }
        if (k == null) {
            return null;
        }
        return this.b.get(k);
    }

    public final K b(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bb7670f03d23178d6143636d6964bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (K) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bb7670f03d23178d6143636d6964bb");
        }
        if (v == null) {
            return null;
        }
        return this.c.get(v);
    }

    public final V c(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39d2d117d0592909c8ce1ce0ce8c8cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39d2d117d0592909c8ce1ce0ce8c8cd");
        }
        if (k == null) {
            return null;
        }
        V remove = this.b.remove(k);
        if (remove != null) {
            this.c.remove(remove);
        }
        return remove;
    }
}
