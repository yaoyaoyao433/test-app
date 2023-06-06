package com.dianping.imagemanager.image.loader.decode.task;

import com.dianping.imagemanager.image.cache.memory.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.dianping.imagemanager.imagedecode.b {
    public static ChangeQuickRedirect a;

    public a(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4342ee1a7d1e5ce63219d15c74776957", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4342ee1a7d1e5ce63219d15c74776957");
        }
    }

    @Override // com.dianping.imagemanager.imagedecode.b, com.dianping.imagemanager.imagedecode.a
    public final byte[] a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8130fa3043243b6c19fe7290a98b7f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8130fa3043243b6c19fe7290a98b7f2");
        }
        byte[] a2 = z ? a.C0080a.a.a(this.f) : null;
        if (a2 == null && (a2 = super.a(z)) != null && z) {
            a.C0080a.a.a(this.f, a2);
        }
        return a2;
    }
}
