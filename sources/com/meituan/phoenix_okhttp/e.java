package com.meituan.phoenix_okhttp;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements t {
    public static ChangeQuickRedirect a;
    private a b;
    private b c;

    public e(@NonNull Context context, @NonNull com.meituan.phoenix.core.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc9f38ffef1b651b7998203ee1709c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc9f38ffef1b651b7998203ee1709c4");
        } else if (aVar.b()) {
            this.c = new b(context, aVar);
            if (com.meituan.phoenix.a.a) {
                com.meituan.phoenix.util.b.a("Phoenix", "-----> open self request Thread: " + Thread.currentThread().getName(), new Object[0]);
            }
        } else {
            this.b = new a(context, aVar);
            if (com.meituan.phoenix.a.a) {
                com.meituan.phoenix.util.b.a("Phoenix", "-----> close self request Thread: " + Thread.currentThread().getName(), new Object[0]);
            }
        }
    }

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        IOException iOException;
        z zVar;
        int a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6266bec16a9ad7fd600e969a8164f5f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6266bec16a9ad7fd600e969a8164f5f8");
        }
        if (com.meituan.phoenix.a.a) {
            com.meituan.phoenix.util.b.a("Phoenix", "-----> res prepare to download: " + aVar.a().a().getHost() + " Thread: " + Thread.currentThread().getName(), new Object[0]);
        }
        x a3 = aVar.a();
        z zVar2 = null;
        try {
            zVar = aVar.a(a3);
            iOException = null;
        } catch (IOException e) {
            iOException = e;
            zVar = null;
        }
        if (zVar != null && zVar.c()) {
            if (com.meituan.phoenix.a.a) {
                com.meituan.phoenix.util.b.a("Phoenix", "-----> res download Success Thread: " + Thread.currentThread().getName(), new Object[0]);
            }
            return zVar;
        }
        if (zVar != null) {
            a2 = zVar.c;
        } else if (iOException != null) {
            a2 = com.meituan.phoenix.util.a.a(iOException);
        } else {
            a2 = com.meituan.phoenix.util.a.a();
        }
        if (com.meituan.phoenix.a.a) {
            com.meituan.phoenix.util.b.a("Phoenix", "-----> src host: " + a3.a().getHost() + " failed!  Thread: " + Thread.currentThread().getName() + " srcCode: " + a2, new Object[0]);
        }
        if (this.b != null) {
            zVar2 = this.b.a(a3.a().toString(), a2, (int) a3, (x) aVar);
        } else if (this.c != null) {
            zVar2 = this.c.a(a3.a().toString(), a2, (int) a3, (x) null);
        }
        if (com.meituan.phoenix.a.a) {
            if (zVar2 != null) {
                com.meituan.phoenix.util.b.a("Phoenix", "-----> Phoenix Success: " + zVar2.a.a().getHost() + " Thread: " + Thread.currentThread().getName(), new Object[0]);
            } else {
                com.meituan.phoenix.util.b.a("Phoenix", "-----> Phoenix Failed Thread: " + Thread.currentThread().getName(), new Object[0]);
            }
        }
        if (zVar2 == null) {
            if (iOException == null) {
                return zVar;
            }
            throw iOException;
        }
        return zVar2;
    }
}
