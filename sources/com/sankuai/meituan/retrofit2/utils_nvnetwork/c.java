package com.sankuai.meituan.retrofit2.utils_nvnetwork;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ap;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements com.sankuai.meituan.retrofit2.raw.b {
    public static ChangeQuickRedirect a;
    private Request b;
    private q c;
    private List<com.sankuai.meituan.retrofit2.q> d;

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final String reason() {
        return null;
    }

    public c(q qVar, Request request) {
        Object[] objArr = {qVar, request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25695f6df3d3527bdb7aac12e1766dc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25695f6df3d3527bdb7aac12e1766dc6");
            return;
        }
        this.b = request;
        this.c = qVar;
        HashMap<String, String> headers = qVar.headers();
        if (headers == null || headers.size() <= 0) {
            return;
        }
        this.d = new ArrayList(headers.size());
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            this.d.add(new com.sankuai.meituan.retrofit2.q(entry.getKey(), entry.getValue()));
        }
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final String url() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846a7da7ef3b90b0ff5b00b72ddebe9a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846a7da7ef3b90b0ff5b00b72ddebe9a") : this.b.d;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final int code() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54213bfe5fab0b8f06ba7ce247fced1", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54213bfe5fab0b8f06ba7ce247fced1")).intValue() : this.c.statusCode();
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final List<com.sankuai.meituan.retrofit2.q> headers() {
        return this.d;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final ap body() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947ed1cf64c7ea2b9be16d88a096ba7d", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947ed1cf64c7ea2b9be16d88a096ba7d") : new ap() { // from class: com.sankuai.meituan.retrofit2.utils_nvnetwork.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.ap
            public final String contentType() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca9b5a2f760496e7eb76f4de5f34fa32", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca9b5a2f760496e7eb76f4de5f34fa32") : b.b(c.this.c.headers(), "Content-Type");
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final long contentLength() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7cae2fb02bfca7debb2b3c799d22844", 6917529027641081856L)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7cae2fb02bfca7debb2b3c799d22844")).longValue();
                }
                long a2 = b.a(c.this.c.headers());
                return (a2 >= 0 || c.this.c.result() == null) ? a2 : c.this.c.result().length;
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final InputStream source() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e45a818aea890299559c27ea3158e36", 6917529027641081856L)) {
                    return (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e45a818aea890299559c27ea3158e36");
                }
                if (c.this.c.result() == null) {
                    return new ByteArrayInputStream(new byte[0]);
                }
                return new ByteArrayInputStream(c.this.c.result());
            }
        };
    }
}
