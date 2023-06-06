package com.sankuai.meituan.mtliveqos.utils.network;

import android.net.TrafficStats;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public long d;
    private float e;
    private long f;
    private float g;
    private long h;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40495ff73522dfe6e4dec79c39073c2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40495ff73522dfe6e4dec79c39073c2c");
            return;
        }
        this.e = 0.0f;
        this.f = 0L;
        this.g = 0.0f;
        this.h = 0L;
        this.b = 0.0f;
        this.d = 0L;
    }

    public final float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d1a807036153232c8033473b33e2f0", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d1a807036153232c8033473b33e2f0")).floatValue() : b() + c();
    }

    private float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627c5cc51f085b7a974208c47612e8cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627c5cc51f085b7a974208c47612e8cd")).floatValue();
        }
        if (TrafficStats.getUidRxBytes(Process.myUid()) == -1) {
            return 0.0f;
        }
        return ((float) TrafficStats.getTotalTxBytes()) / 1024.0f;
    }

    private float c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca744c80d6b938bee3e2e03020bb3e73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca744c80d6b938bee3e2e03020bb3e73")).floatValue();
        }
        if (TrafficStats.getUidRxBytes(Process.myUid()) == -1) {
            return 0.0f;
        }
        return ((float) TrafficStats.getTotalTxPackets()) / 1024.0f;
    }
}
