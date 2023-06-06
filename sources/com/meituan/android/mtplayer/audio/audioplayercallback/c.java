package com.meituan.android.mtplayer.audio.audioplayercallback;

import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends a {
    public static ChangeQuickRedirect a;
    private static final Pools.Pool<c> c = new Pools.SynchronizedPool(10);
    public int b;

    public static c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "953f514d945ca63c89187b8ffd1c0fe6", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "953f514d945ca63c89187b8ffd1c0fe6");
        }
        c acquire = c.acquire();
        if (acquire == null) {
            acquire = new c();
        }
        acquire.b = i;
        return acquire;
    }

    public static void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d780ac7e276dcb2925b6f1ad33e9469b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d780ac7e276dcb2925b6f1ad33e9469b");
        } else {
            c.release(cVar);
        }
    }
}
