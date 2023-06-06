package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class p implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1d31ca89e5578b096d150cd0affdf3", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1d31ca89e5578b096d150cd0affdf3");
        }
        aj request = aVar.request();
        if (request.h == null || request.a("Content-Encoding") != null) {
            return aVar.a(request);
        }
        aj.a a2 = request.a().a("Content-Encoding", "gzip");
        final ak akVar = request.h;
        Object[] objArr2 = {akVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        a2.d = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2639581076a20b3bf8dcb4e9c54fb146", 6917529027641081856L) ? (ak) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2639581076a20b3bf8dcb4e9c54fb146") : new ak() { // from class: com.sankuai.meituan.retrofit2.p.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.ak
            public final long contentLength() {
                return -1L;
            }

            @Override // com.sankuai.meituan.retrofit2.ak
            public final String contentType() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2b9e0c274d8c7506495386dc6783d417", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2b9e0c274d8c7506495386dc6783d417") : akVar.contentType();
            }

            @Override // com.sankuai.meituan.retrofit2.ak
            public final void writeTo(OutputStream outputStream) throws IOException {
                Object[] objArr3 = {outputStream};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79c5da8bb3d002f2fc7515420f0e8ac4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79c5da8bb3d002f2fc7515420f0e8ac4");
                    return;
                }
                GZIPOutputStream gZIPOutputStream = null;
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    try {
                        akVar.writeTo(gZIPOutputStream2);
                        gZIPOutputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        };
        return aVar.a(a2.a());
    }
}
