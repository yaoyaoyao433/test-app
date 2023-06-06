package com.meituan.android.customerservice.channel.upload;

import com.facebook.react.modules.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements t {
    public static ChangeQuickRedirect a;
    a b;

    public c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec735d742a56aa5dacfb25ace24f161", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec735d742a56aa5dacfb25ace24f161");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c182c7756219a9cf6558d6b4e552b915", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c182c7756219a9cf6558d6b4e552b915");
        }
        x a2 = aVar.a();
        if (a2.d == null) {
            return aVar.a(a2);
        }
        return aVar.a(a2.f().a(a2.b, new b(a2.d, new i() { // from class: com.meituan.android.customerservice.channel.upload.c.1
            public static ChangeQuickRedirect a;
            private long c = 0;

            @Override // com.facebook.react.modules.network.i
            public final void a(long j, long j2, boolean z) {
                Object[] objArr2 = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45f34d05b792224a70548f4fe7ad97c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45f34d05b792224a70548f4fe7ad97c6");
                    return;
                }
                c.this.b.a(j - this.c);
                this.c = j;
            }
        })).a());
    }
}
