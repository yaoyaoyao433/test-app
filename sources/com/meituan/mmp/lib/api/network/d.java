package com.meituan.mmp.lib.api.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.e;
import okio.i;
import okio.m;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends ResponseBody {
    public static ChangeQuickRedirect a;
    private ResponseBody b;
    private b c;
    private e d;

    public d(ResponseBody responseBody, b bVar) {
        Object[] objArr = {responseBody, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149a1d5ae2c48c953acca7709e2f0655", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149a1d5ae2c48c953acca7709e2f0655");
            return;
        }
        this.b = responseBody;
        this.c = bVar;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66677b2be37e1db5d7f9639c30f4799b", RobustBitConfig.DEFAULT_VALUE) ? (MediaType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66677b2be37e1db5d7f9639c30f4799b") : this.b.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a1b81f075524f53df50098ecb41bc2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a1b81f075524f53df50098ecb41bc2")).longValue() : this.b.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final e source() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4696446d0de0128b7e7c2d88973378", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4696446d0de0128b7e7c2d88973378");
        }
        if (this.d == null) {
            e source = this.b.source();
            Object[] objArr2 = {source};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.d = m.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "232806ec84d0b5f3343f7156e9a73f6f", RobustBitConfig.DEFAULT_VALUE) ? (s) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "232806ec84d0b5f3343f7156e9a73f6f") : new i(source) { // from class: com.meituan.mmp.lib.api.network.d.1
                public static ChangeQuickRedirect a;
                public long b = 0;

                @Override // okio.i, okio.s
                public final long read(okio.c cVar, long j) throws IOException {
                    Object[] objArr3 = {cVar, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9fb0c21e48b2fd1da01f3fad89ba4c98", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9fb0c21e48b2fd1da01f3fad89ba4c98")).longValue();
                    }
                    long read = super.read(cVar, j);
                    int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                    this.b += i != 0 ? read : 0L;
                    d.this.c.a(this.b, d.this.b.contentLength(), i == 0);
                    return read;
                }
            });
        }
        return this.d;
    }
}
