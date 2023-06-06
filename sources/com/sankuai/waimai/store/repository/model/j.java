package com.sankuai.waimai.store.repository.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j implements Serializable {
    public static ChangeQuickRedirect a;
    public String b;

    public j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6596e31742c84a12e085cf1b0685dac4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6596e31742c84a12e085cf1b0685dac4");
        } else {
            this.b = str;
        }
    }
}
