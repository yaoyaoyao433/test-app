package com.meituan.android.mtplayer.video.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends o {
    public static ChangeQuickRedirect a;
    final i b;
    final com.meituan.android.mtplayer.video.proxy.file.b c;
    b d;

    public g(i iVar, com.meituan.android.mtplayer.video.proxy.file.b bVar) {
        super(iVar, bVar);
        Object[] objArr = {iVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe159a1857719a67535881ff0855d2aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe159a1857719a67535881ff0855d2aa");
            return;
        }
        this.c = bVar;
        this.b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(OutputStream outputStream, long j) throws p, j {
        Object[] objArr = {outputStream, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "463a23b5d2707b89054f0815c7648536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "463a23b5d2707b89054f0815c7648536");
            return;
        }
        byte[] bArr = new byte[8192];
        try {
            a(j);
            while (true) {
                int a2 = a(bArr, j, 8192);
                if (a2 != -1) {
                    outputStream.write(bArr, 0, a2);
                    j += a2;
                    b(j);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } catch (SocketException unused) {
            com.meituan.android.mtplayer.video.utils.c.a("Proxy", "HttpProxyCache: in responseWithCache(), media or predownload closed");
        } catch (IOException unused2) {
            com.meituan.android.mtplayer.video.utils.c.d("Proxy", "HttpProxyCache: in responseWithCache(), outputStream has closed ,io exception,ignore");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(OutputStream outputStream, long j) throws p, j {
        Object[] objArr = {outputStream, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b81c90b701dfa7f97d08e19f56d75f9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b81c90b701dfa7f97d08e19f56d75f9f");
            return;
        }
        i iVar = new i(this.b);
        try {
            iVar.a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a2 = iVar.a(bArr, 0, 8192);
                if (a2 != -1) {
                    outputStream.write(bArr, 0, a2);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } catch (IOException unused) {
            com.meituan.android.mtplayer.video.utils.c.d("Proxy", "HttpProxyCache: in responseWithoutCache(), outputStream has closed ,io exception,ignore");
        } finally {
            iVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "76aab56367cb5b06a801199588411408", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "76aab56367cb5b06a801199588411408") : String.format(Locale.US, str, objArr);
    }

    @Override // com.meituan.android.mtplayer.video.proxy.o
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412a815d1585980b8b7670145a4b0b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412a815d1585980b8b7670145a4b0b17");
        } else if (this.d != null) {
            this.d.a(this.b.b.b, i, j);
        }
    }
}
