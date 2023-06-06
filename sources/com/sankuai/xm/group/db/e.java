package com.sankuai.xm.group.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends b {
    public static ChangeQuickRedirect b;
    public PersonalDBProxy c;

    public e(PersonalDBProxy personalDBProxy) {
        Object[] objArr = {personalDBProxy};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf964b7c321a11a8d3707b9e34c6f804", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf964b7c321a11a8d3707b9e34c6f804");
        } else {
            this.c = personalDBProxy;
        }
    }
}
