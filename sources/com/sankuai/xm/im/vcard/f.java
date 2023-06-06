package com.sankuai.xm.im.vcard;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collection;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends e {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.im.vcard.e
    @NonNull
    public final String c() {
        return "pubIds";
    }

    public f(long j) {
        super("/pubinfo/info/v1/get/simple", true, 3, Collections.singletonList(Long.valueOf(j)));
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473a1f3f6896ddb85ba39e8bdc9f2904", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473a1f3f6896ddb85ba39e8bdc9f2904");
        } else {
            this.f = j;
        }
    }

    public f(Collection<Long> collection) {
        super("/pubinfo/info/v1/get/simple", false, 3, collection);
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4787d1d84f8840912ca8848c3c567b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4787d1d84f8840912ca8848c3c567b3");
        }
    }
}
