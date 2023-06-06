package com.sankuai.meituan.kernel.net.msi.progress;

import android.os.SystemClock;
import com.meituan.msi.bean.MsiContext;
import com.meituan.network.NetworkProgressUpdateEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private long b;
    private final String c;
    private final String d;
    private final MsiContext e;

    public b(String str, String str2, MsiContext msiContext) {
        Object[] objArr = {str, str2, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757bfc5e5e7bcfab34e499c475b729b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757bfc5e5e7bcfab34e499c475b729b3");
            return;
        }
        this.c = str;
        this.d = str2;
        this.e = msiContext;
    }

    public final void a(long j, long j2, boolean z) {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "579e1336bde20d88be458a2ccd1d916c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "579e1336bde20d88be458a2ccd1d916c");
        } else if (this.e == null) {
            com.sankuai.meituan.kernel.net.msi.log.a.a("onProgressUpdate msiContext is null");
        } else {
            NetworkProgressUpdateEvent networkProgressUpdateEvent = new NetworkProgressUpdateEvent();
            networkProgressUpdateEvent.taskId = this.d;
            networkProgressUpdateEvent.totalBytesWritten = j;
            networkProgressUpdateEvent.totalBytesExpectedToWrite = j2;
            networkProgressUpdateEvent.progress = j2 == 0 ? 0.0d : (j * 100) / j2;
            if (Math.abs(SystemClock.elapsedRealtime() - this.b) > 100 || z) {
                this.b = SystemClock.elapsedRealtime();
                this.e.dispatchEvent(this.c, networkProgressUpdateEvent, this.d);
            }
        }
    }
}
