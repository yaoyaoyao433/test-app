package com.sankuai.meituan.kernel.net.zstd;

import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public volatile q b;
    public volatile int c;
    public volatile long d;

    public final synchronized void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d9a00b90b78b15adfd806561cd6846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d9a00b90b78b15adfd806561cd6846");
        } else if (this.b == null) {
        } else {
            if (z) {
                this.d = System.currentTimeMillis();
            } else {
                this.d = -1L;
            }
            this.b.a("fail_last_time", this.d);
            f.a("setFailUser, setFailUser canRecover=" + z + " reason=" + str);
        }
    }
}
