package com.meituan.mmp.lib.msi;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p implements com.meituan.msi.location.b {
    public static ChangeQuickRedirect a;
    private final com.meituan.mmp.lib.map.c b;

    public p(com.meituan.mmp.lib.map.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3fe37d60831b50ae4a385fde11aa9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3fe37d60831b50ae4a385fde11aa9e");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.meituan.msi.location.b
    public final void a(@NonNull final com.meituan.msi.location.a aVar, @NonNull String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4927c6fcd89066812d8cc70684ac85f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4927c6fcd89066812d8cc70684ac85f5");
        } else {
            this.b.a(new com.meituan.mmp.lib.map.b() { // from class: com.meituan.mmp.lib.msi.p.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.map.b
                public final void a(int i, com.meituan.msi.api.location.a aVar2, String str2) {
                    Object[] objArr2 = {Integer.valueOf(i), aVar2, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "579ed1f304d19ffb772bfd3fd0f7b806", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "579ed1f304d19ffb772bfd3fd0f7b806");
                    } else {
                        aVar.a(i, aVar2, str2);
                    }
                }
            }, str);
        }
    }

    @Override // com.meituan.msi.location.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c405ee0be49bc79be1e2dc24ea015bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c405ee0be49bc79be1e2dc24ea015bce");
        } else {
            this.b.a();
        }
    }
}
