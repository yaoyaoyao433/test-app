package com.sankuai.xm.im.vcard;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends e {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.im.vcard.e
    @NonNull
    public final String c() {
        return "ul";
    }

    public g(long j) {
        super("/uinfo/api/v1/user/get", true, 1, Collections.singletonList(Long.valueOf(j)));
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37b55a3631c5bfe09a85f6f77118669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37b55a3631c5bfe09a85f6f77118669");
        } else {
            this.f = j;
        }
    }

    public g(Collection<Long> collection) {
        super("/uinfo/api/v1/user/get", false, 1, collection);
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a5ffd509ac0ed7c8e4a2bb6d112707", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a5ffd509ac0ed7c8e4a2bb6d112707");
        }
    }
}
