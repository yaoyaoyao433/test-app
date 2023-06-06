package com.sankuai.waimai.platform.net.callfactory;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.meituan.retrofit2.raw.b {
    public static ChangeQuickRedirect a;
    private final Request b;
    private final q c;
    private List<com.sankuai.meituan.retrofit2.q> d;

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final String reason() {
        return null;
    }

    public b(q qVar, Request request) {
        Object[] objArr = {qVar, request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "621b6da4235f3cc0bb01cf88c9948092", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "621b6da4235f3cc0bb01cf88c9948092");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8bac62c486e890c9105475ca32fdc4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8bac62c486e890c9105475ca32fdc4") : this.b.d;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final int code() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3713c3ee6fafdb6c1d06f7aa327c3e8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3713c3ee6fafdb6c1d06f7aa327c3e8")).intValue() : this.c.statusCode();
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final List<com.sankuai.meituan.retrofit2.q> headers() {
        return this.d;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.b
    public final ap body() {
        byte[] bArr;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1630d60ec125ff89ad4fdce51b87f23", RobustBitConfig.DEFAULT_VALUE)) {
            return (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1630d60ec125ff89ad4fdce51b87f23");
        }
        Object obj = this.c.j;
        JsonElement jsonElement = null;
        if (obj instanceof com.sankuai.waimai.platform.net.service.c) {
            com.sankuai.waimai.platform.net.service.c cVar = (com.sankuai.waimai.platform.net.service.c) obj;
            jsonElement = cVar.b;
            str = cVar.c;
            bArr = cVar.d;
        } else {
            bArr = null;
            str = null;
        }
        return new com.sankuai.waimai.platform.cache.a(jsonElement, str, bArr) { // from class: com.sankuai.waimai.platform.net.callfactory.b.1
            public static ChangeQuickRedirect d;

            @Override // com.sankuai.meituan.retrofit2.ap
            public final String contentType() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ee13ded6344b66232d9dc055a05a471", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ee13ded6344b66232d9dc055a05a471") : com.sankuai.meituan.retrofit2.utils_nvnetwork.b.b(b.this.c.headers(), "Content-Type");
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final long contentLength() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8eb9085ed450cd10c4a4b9b527a6b6f1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8eb9085ed450cd10c4a4b9b527a6b6f1")).longValue();
                }
                long a2 = com.sankuai.meituan.retrofit2.utils_nvnetwork.b.a(b.this.c.headers());
                return (a2 >= 0 || b.this.c.result() == null) ? a2 : b.this.c.result().length;
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final InputStream source() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a61e96dd6a7de77d784910830c124e84", RobustBitConfig.DEFAULT_VALUE)) {
                    return (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a61e96dd6a7de77d784910830c124e84");
                }
                if (b.this.c.result() == null) {
                    return new ByteArrayInputStream(new byte[0]);
                }
                return new ByteArrayInputStream(b.this.c.result());
            }
        };
    }
}
