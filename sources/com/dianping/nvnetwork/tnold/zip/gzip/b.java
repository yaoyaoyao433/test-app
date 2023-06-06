package com.dianping.nvnetwork.tnold.zip.gzip;

import com.dianping.nvnetwork.tnold.zip.h;
import com.dianping.nvnetwork.v;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements com.dianping.nvnetwork.tnold.zip.b {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("GzipBodyEncoder");
    private int c;
    private int d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bac9b0016d3588cfc0bf6874c44a3ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bac9b0016d3588cfc0bf6874c44a3ad");
            return;
        }
        this.c = 0;
        this.d = 0;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.b
    public final byte[] a(v vVar, boolean z) throws Exception {
        Object[] objArr = {vVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ceccb6b16effdc9920939d38dbeee3", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ceccb6b16effdc9920939d38dbeee3");
        }
        h.c(vVar);
        com.dianping.nvnetwork.tnold.f a2 = com.dianping.nvnetwork.tnold.f.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.tnold.f.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "db5a8716721399534f26bb9cb26c3683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "db5a8716721399534f26bb9cb26c3683");
        } else if (a2.b && a2.d) {
            throw new d("mock gzip encode exception");
        }
        Objects.requireNonNull(vVar);
        byte b2 = vVar.a;
        byte[] bArr = vVar.e;
        if (h.b(bArr)) {
            return bArr;
        }
        Map<String, String> map = vVar.d;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if ((key.equalsIgnoreCase("content-encoding") && value.contains("gzip")) || (key.equalsIgnoreCase("content-type") && !value.contains(DaBaiDao.JSON_DATA) && !value.contains("text"))) {
                    if (b2 == 4) {
                        vVar.a = (byte) 104;
                        int length = bArr.length;
                        this.d = length;
                        this.c = length;
                        return bArr;
                    } else if (b2 == 5) {
                        vVar.a = (byte) 105;
                        int length2 = bArr.length;
                        this.d = length2;
                        this.c = length2;
                        return bArr;
                    }
                }
            }
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            byte[] a3 = g.a(bArr);
            this.c = bArr.length;
            this.d = a3.length;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (bArr.length < a3.length) {
                vVar.a = (byte) (vVar.a + 100);
                int length3 = bArr.length;
                this.d = length3;
                this.c = length3;
                return bArr;
            }
            com.dianping.nvnetwork.tnold.g.b(z, b2, currentTimeMillis, currentTimeMillis2, bArr.length, a3.length);
            return a3;
        } catch (Exception unused) {
            com.dianping.nvtunnelkit.logger.b.b(b, "Hpack-gzip: body gzip compressing failed");
            throw g.c;
        }
    }

    @Override // com.dianping.nvnetwork.tnold.zip.b
    public final com.dianping.nvnetwork.tnold.zip.g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f69bce7945030be8638d67309cac671", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.tnold.zip.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f69bce7945030be8638d67309cac671");
        }
        com.dianping.nvnetwork.tnold.zip.g gVar = new com.dianping.nvnetwork.tnold.zip.g(this.c, this.d);
        this.c = 0;
        this.d = 0;
        return gVar;
    }
}
