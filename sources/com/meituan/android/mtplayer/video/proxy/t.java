package com.meituan.android.mtplayer.video.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.OutputStream;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t {
    public static ChangeQuickRedirect a;
    final r b;

    public t(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c2543f97fd5e8f8b8469601341f88a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c2543f97fd5e8f8b8469601341f88a");
        } else {
            this.b = (r) n.a(rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(OutputStream outputStream, long j) {
        Object[] objArr = {outputStream, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a01f1079a6f48eac3f43f6b09d1da282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a01f1079a6f48eac3f43f6b09d1da282");
            return;
        }
        try {
            this.b.a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a2 = this.b.a(bArr, 0, 8192);
                if (a2 != -1) {
                    outputStream.write(bArr, 0, a2);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "29b384c679e73a8ee87e89eb46b6575f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "29b384c679e73a8ee87e89eb46b6575f") : String.format(Locale.US, str, objArr);
    }
}
