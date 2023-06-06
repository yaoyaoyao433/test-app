package com.sankuai.xm.im.vcard;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends e {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.im.vcard.e
    @NonNull
    public final String c() {
        return "gul";
    }

    public a(long j) {
        super("/ginfo/api/v1/get", true, 2, Collections.singletonList(Long.valueOf(j)));
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87782548d52c70988e628443b45b2e57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87782548d52c70988e628443b45b2e57");
        } else {
            this.f = j;
        }
    }

    public a(Collection<Long> collection) {
        super("/ginfo/api/v1/get", false, 2, collection);
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffcd3cd090de33896695d1e46b1f5c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffcd3cd090de33896695d1e46b1f5c0");
        }
    }
}
