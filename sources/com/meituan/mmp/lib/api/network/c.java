package com.meituan.mmp.lib.api.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.h;
import okio.m;
import okio.r;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends RequestBody {
    public static ChangeQuickRedirect a;
    private RequestBody b;
    private b c;
    private okio.d d;

    public c(RequestBody requestBody, b bVar) {
        Object[] objArr = {requestBody, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89eb83c1105c99d407b2b5c26d299fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89eb83c1105c99d407b2b5c26d299fb");
            return;
        }
        this.b = requestBody;
        this.c = bVar;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a9c4c91d9deb6d9c1c6762ab7f4ebc", RobustBitConfig.DEFAULT_VALUE) ? (MediaType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a9c4c91d9deb6d9c1c6762ab7f4ebc") : this.b.contentType();
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca5e9607534817eb14a4f84e1c73daba", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca5e9607534817eb14a4f84e1c73daba")).longValue() : this.b.contentLength();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.d dVar) throws IOException {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff3ad223997b8928ca0a9aad6704296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff3ad223997b8928ca0a9aad6704296");
            return;
        }
        if (this.d == null) {
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.d = m.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64d0deaa16207bda50e9f305d5e6310c", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64d0deaa16207bda50e9f305d5e6310c") : new h(dVar) { // from class: com.meituan.mmp.lib.api.network.c.1
                public static ChangeQuickRedirect a;
                public long b = 0;
                public long c = 0;

                @Override // okio.h, okio.r
                public final void write(okio.c cVar, long j) throws IOException {
                    Object[] objArr3 = {cVar, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27bdc445dba0ac181255b4f4fc83e048", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27bdc445dba0ac181255b4f4fc83e048");
                        return;
                    }
                    super.write(cVar, j);
                    if (this.c == 0) {
                        this.c = c.this.contentLength();
                    }
                    this.b += j;
                    c.this.c.a(this.b, this.c, this.b == this.c);
                }
            });
        }
        this.b.writeTo(this.d);
        this.d.flush();
    }
}
