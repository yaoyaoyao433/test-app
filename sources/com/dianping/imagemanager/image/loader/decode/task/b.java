package com.dianping.imagemanager.image.loader.decode.task;

import com.dianping.imagemanager.image.cache.memory.a;
import com.dianping.imagemanager.imagedecode.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;

    public b(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a75c579792b6182d58872f4bca5a3a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a75c579792b6182d58872f4bca5a3a4");
        }
    }

    @Override // com.dianping.imagemanager.imagedecode.c, com.dianping.imagemanager.imagedecode.a
    public final byte[] a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b72542799adc8e53b8a5b505ce6a70", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b72542799adc8e53b8a5b505ce6a70");
        }
        byte[] a2 = z ? a.C0080a.a.a(this.f) : null;
        if (a2 == null && (a2 = super.a(z)) != null && z) {
            a.C0080a.a.a(this.f, a2);
        }
        return a2;
    }
}
