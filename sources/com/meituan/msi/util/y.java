package com.meituan.msi.util;

import android.os.SystemClock;
import com.meituan.msi.bean.DownloadProgressUpdateEvent;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y extends ResponseBody {
    public static ChangeQuickRedirect a;
    private final ResponseBody b;
    private final g c;
    private okio.e d;
    private final MsiContext e;

    public y(MsiContext msiContext, ResponseBody responseBody, g gVar) {
        Object[] objArr = {msiContext, responseBody, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0cf930d8d70045843802dccd1deb41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0cf930d8d70045843802dccd1deb41");
            return;
        }
        this.e = msiContext;
        this.b = responseBody;
        this.c = gVar;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a52beb74b86bd14f3124db6790163b", RobustBitConfig.DEFAULT_VALUE) ? (MediaType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a52beb74b86bd14f3124db6790163b") : this.b.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb5b0ec9e69bf8bb00e485caeb7a22ce", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb5b0ec9e69bf8bb00e485caeb7a22ce")).longValue() : this.b.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final okio.e source() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f591e1974ff28722eecb2619e7c5098", RobustBitConfig.DEFAULT_VALUE)) {
            return (okio.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f591e1974ff28722eecb2619e7c5098");
        }
        if (this.d == null) {
            okio.e source = this.b.source();
            Object[] objArr2 = {source};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.d = okio.m.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "434d76375af85809960558ba8fbe31dc", RobustBitConfig.DEFAULT_VALUE) ? (okio.s) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "434d76375af85809960558ba8fbe31dc") : new okio.i(source) { // from class: com.meituan.msi.util.y.1
                public static ChangeQuickRedirect a;
                public long b = 0;

                @Override // okio.i, okio.s
                public final long read(okio.c cVar, long j) throws IOException {
                    Object[] objArr3 = {cVar, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7f8ba008acb4623df55ce924e436c50d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7f8ba008acb4623df55ce924e436c50d")).longValue();
                    }
                    long read = super.read(cVar, j);
                    int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                    this.b += i != 0 ? read : 0L;
                    g gVar = y.this.c;
                    long j2 = this.b;
                    long contentLength = y.this.b.contentLength();
                    byte b = i == 0 ? (byte) 1 : (byte) 0;
                    MsiContext msiContext = y.this.e;
                    Object[] objArr4 = {new Long(j2), new Long(contentLength), Byte.valueOf(b), msiContext};
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "b495a183255844a6457bbf3a25f7b7a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "b495a183255844a6457bbf3a25f7b7a5");
                    } else if (msiContext == null) {
                        com.meituan.msi.log.a.a("onProgressUpdate msiContext is null");
                    } else {
                        DownloadProgressUpdateEvent downloadProgressUpdateEvent = new DownloadProgressUpdateEvent();
                        downloadProgressUpdateEvent.taskId = gVar.d;
                        downloadProgressUpdateEvent.totalBytesWritten = j2;
                        downloadProgressUpdateEvent.totalBytesExpectedToWrite = contentLength;
                        downloadProgressUpdateEvent.progress = contentLength == 0 ? 0.0d : (j2 * 100) / contentLength;
                        if (Math.abs(SystemClock.elapsedRealtime() - gVar.b) > 100 || b != 0) {
                            gVar.b = SystemClock.elapsedRealtime();
                            msiContext.dispatchEvent("UploadTask.onProgressUpdate".equals(gVar.c) ? "UploadTask.onProgressUpdate" : "DownloadTask.onProgressUpdate", downloadProgressUpdateEvent, gVar.d);
                        }
                    }
                    return read;
                }
            });
        }
        return this.d;
    }
}
