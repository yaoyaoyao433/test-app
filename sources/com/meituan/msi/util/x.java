package com.meituan.msi.util;

import android.os.SystemClock;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ProgressUpdateEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x extends RequestBody {
    public static ChangeQuickRedirect a;
    private final RequestBody b;
    private final ab c;
    private okio.d d;
    private final MsiContext e;

    public x(MsiContext msiContext, RequestBody requestBody, ab abVar) {
        Object[] objArr = {msiContext, requestBody, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b9751225a02c3435ba7988447e1022e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b9751225a02c3435ba7988447e1022e");
            return;
        }
        this.e = msiContext;
        this.b = requestBody;
        this.c = abVar;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cad7fb5ba52d38514eaa94ef3de5197", RobustBitConfig.DEFAULT_VALUE) ? (MediaType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cad7fb5ba52d38514eaa94ef3de5197") : this.b.contentType();
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf934ecc9be8fa1538399311b116e077", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf934ecc9be8fa1538399311b116e077")).longValue() : this.b.contentLength();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.d dVar) throws IOException {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc90819455eae91835130d9509bfb6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc90819455eae91835130d9509bfb6f");
            return;
        }
        if (this.d == null) {
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.d = okio.m.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "348e72aa93d5b2ecf2c1fd61674c6b02", RobustBitConfig.DEFAULT_VALUE) ? (okio.r) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "348e72aa93d5b2ecf2c1fd61674c6b02") : new okio.h(dVar) { // from class: com.meituan.msi.util.x.1
                public static ChangeQuickRedirect a;
                public long b = 0;
                public long c = 0;

                @Override // okio.h, okio.r
                public final void write(okio.c cVar, long j) throws IOException {
                    Object[] objArr3 = {cVar, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79e93322a3f20296b9b433fe273f2c0e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79e93322a3f20296b9b433fe273f2c0e");
                        return;
                    }
                    super.write(cVar, j);
                    if (this.c == 0) {
                        this.c = x.this.contentLength();
                    }
                    this.b += j;
                    ab abVar = x.this.c;
                    long j2 = this.b;
                    long j3 = this.c;
                    byte b = this.b == this.c ? (byte) 1 : (byte) 0;
                    MsiContext msiContext = x.this.e;
                    Object[] objArr4 = {new Long(j2), new Long(j3), Byte.valueOf(b), msiContext};
                    ChangeQuickRedirect changeQuickRedirect4 = ab.a;
                    if (PatchProxy.isSupport(objArr4, abVar, changeQuickRedirect4, false, "634b1acc82eb5a9b1e52eb8fe9d44376", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, abVar, changeQuickRedirect4, false, "634b1acc82eb5a9b1e52eb8fe9d44376");
                    } else if (msiContext == null) {
                        com.meituan.msi.log.a.a("onProgressUpdate msiContext is null");
                    } else {
                        ProgressUpdateEvent progressUpdateEvent = new ProgressUpdateEvent();
                        progressUpdateEvent.taskId = abVar.d;
                        progressUpdateEvent.totalBytesWritten = j2;
                        progressUpdateEvent.totalBytesExpectedToWrite = j3;
                        progressUpdateEvent.totalBytesSent = j2;
                        progressUpdateEvent.totalBytesExpectedToSend = j3;
                        progressUpdateEvent.progress = j3 == 0 ? 0.0d : (j2 * 100) / j3;
                        if (Math.abs(SystemClock.elapsedRealtime() - abVar.b) > 100 || b != 0) {
                            abVar.b = SystemClock.elapsedRealtime();
                            msiContext.dispatchEvent("UploadTask.onProgressUpdate".equals(abVar.c) ? "UploadTask.onProgressUpdate" : "DownloadTask.onProgressUpdate", progressUpdateEvent, abVar.d);
                        }
                    }
                }
            });
        }
        this.b.writeTo(this.d);
        this.d.flush();
    }
}
