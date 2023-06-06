package com.meituan.android.mtplayer.audio.audioplayercallback;

import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends a {
    public static ChangeQuickRedirect a;
    private static final Pools.Pool<b> d = new Pools.SynchronizedPool(10);
    public int b;
    public int c;

    public static b a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68018899b26ddfbb0f342272679be388", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68018899b26ddfbb0f342272679be388");
        }
        b acquire = d.acquire();
        if (acquire == null) {
            acquire = new b();
        }
        acquire.b = i;
        acquire.c = i2;
        return acquire;
    }

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "338929e57ab52ca1c4c3538c48ba501d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "338929e57ab52ca1c4c3538c48ba501d");
        } else {
            d.release(bVar);
        }
    }
}
