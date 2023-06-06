package com.meituan.android.mtplayer.video.proxy;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u implements k {
    public static ChangeQuickRedirect a;
    private volatile t b;
    private final String c;
    private final r d;

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final void a(b bVar) {
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final void b(b bVar) {
    }

    public u(String str, r rVar) {
        Object[] objArr = {str, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58aca79a4de6fa118ae72a009625c5d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58aca79a4de6fa118ae72a009625c5d9");
            return;
        }
        this.c = str;
        this.d = rVar;
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final void a(e eVar, Socket socket) throws p, j {
        t tVar;
        String sb;
        Object[] objArr = {eVar, socket};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6ee8a0eb1c4d42216903cd90824fea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6ee8a0eb1c4d42216903cd90824fea6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33fb1c48e241222f6876be2e4a119800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33fb1c48e241222f6876be2e4a119800");
        } else {
            if (this.b != null) {
                tVar = this.b;
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                tVar = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d426f63afa5aab3cb06775bf1f0222d", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d426f63afa5aab3cb06775bf1f0222d") : new t(this.d);
            }
            this.b = tVar;
        }
        t tVar2 = this.b;
        Object[] objArr4 = {eVar, socket};
        ChangeQuickRedirect changeQuickRedirect4 = t.a;
        if (PatchProxy.isSupport(objArr4, tVar2, changeQuickRedirect4, false, "10d3c3d366a7a0792e5a7a2bbe3185cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, tVar2, changeQuickRedirect4, false, "10d3c3d366a7a0792e5a7a2bbe3185cc");
            return;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            Object[] objArr5 = {eVar};
            ChangeQuickRedirect changeQuickRedirect5 = t.a;
            if (PatchProxy.isSupport(objArr5, tVar2, changeQuickRedirect5, false, "d60f999b328fe3628e459b718985da74", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr5, tVar2, changeQuickRedirect5, false, "d60f999b328fe3628e459b718985da74");
            } else {
                boolean z = !TextUtils.isEmpty("");
                long a2 = tVar2.b.a();
                boolean z2 = a2 >= 0;
                long j = eVar.d ? a2 - eVar.c : a2;
                boolean z3 = z2 && eVar.d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar.d ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                sb2.append("Accept-Ranges: bytes\n");
                sb2.append(z2 ? tVar2.a("Content-Length: %d\n", Long.valueOf(j)) : "");
                sb2.append(z3 ? tVar2.a("Content-Range: bytes %d-%d/%d\n", Long.valueOf(eVar.c), Long.valueOf(a2 - 1), Long.valueOf(a2)) : "");
                sb2.append(z ? tVar2.a("Content-Type: %s\n", "") : "");
                sb2.append("\n");
                sb = sb2.toString();
            }
            bufferedOutputStream.write(sb.getBytes("UTF-8"));
            tVar2.a(bufferedOutputStream, eVar.c);
        } catch (IOException e) {
            throw new j("source server cache ", e);
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddaa652955b4cc5d5c9d506077af6805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddaa652955b4cc5d5c9d506077af6805");
        } else if (this.d != null) {
            this.d.b();
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.k
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386f9a661c6e0f3e5030297341c6bc54", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386f9a661c6e0f3e5030297341c6bc54");
        }
        h b = l.a().b();
        if (b != null) {
            return b.a(this.c, str);
        }
        return this.c;
    }
}
