package com.meituan.android.mtplayer.video.proxy.file;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h extends e {
    public static ChangeQuickRedirect b;
    private final long c;

    public h(long j) {
        Object[] objArr = {134217728L};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b1aec65b1fac55bad7f105c55ae8b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b1aec65b1fac55bad7f105c55ae8b4");
        } else {
            this.c = 134217728L;
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.file.e
    public final boolean a(File file, long j, int i) {
        Object[] objArr = {file, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4c3f0edf43b47f03e9c31cf977e61f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4c3f0edf43b47f03e9c31cf977e61f")).booleanValue() : j <= this.c;
    }
}
