package com.sankuai.meituan.kernel.net.msi.progress;

import android.os.SystemClock;
import com.meituan.msi.bean.MsiContext;
import com.meituan.network.NetworkProgressUpdateEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private long b;
    private final String c;
    private final String d;
    private final MsiContext e;

    public e(String str, String str2, MsiContext msiContext) {
        Object[] objArr = {str, str2, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54064899cc2f4a2050fe34accd51370c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54064899cc2f4a2050fe34accd51370c");
            return;
        }
        this.c = str;
        this.d = str2;
        this.e = msiContext;
    }

    public final void a(long j, long j2, boolean z) {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a0c06547d14f61e931a508e825c1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a0c06547d14f61e931a508e825c1e1");
        } else if (this.e == null) {
            com.sankuai.meituan.kernel.net.msi.log.a.a("onProgressUpdate msiContext is null");
        } else {
            NetworkProgressUpdateEvent networkProgressUpdateEvent = new NetworkProgressUpdateEvent();
            networkProgressUpdateEvent.taskId = this.d;
            networkProgressUpdateEvent.totalBytesWritten = j;
            networkProgressUpdateEvent.totalBytesExpectedToWrite = j2;
            networkProgressUpdateEvent.totalBytesSent = j;
            networkProgressUpdateEvent.totalBytesExpectedToSend = j2;
            networkProgressUpdateEvent.progress = j2 == 0 ? 0.0d : (j * 100) / j2;
            if (Math.abs(SystemClock.elapsedRealtime() - this.b) > 100 || z) {
                this.b = SystemClock.elapsedRealtime();
                this.e.dispatchEvent(this.c, networkProgressUpdateEvent, this.d);
            }
        }
    }
}
