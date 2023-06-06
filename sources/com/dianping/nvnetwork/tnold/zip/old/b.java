package com.dianping.nvnetwork.tnold.zip.old;

import com.dianping.nvnetwork.tnold.zip.g;
import com.dianping.nvnetwork.tnold.zip.h;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements com.dianping.nvnetwork.tnold.zip.b {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.tnold.zip.b
    public final byte[] a(v vVar, boolean z) throws Exception {
        Object[] objArr = {vVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0573eb407867d0794c8db6beb97616", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0573eb407867d0794c8db6beb97616");
        }
        Objects.requireNonNull(vVar);
        return vVar.e;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.b
    public final g a() {
        return h.e;
    }
}
