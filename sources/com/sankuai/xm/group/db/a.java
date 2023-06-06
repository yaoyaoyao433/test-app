package com.sankuai.xm.group.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public PersonalDBProxy b;

    public a(PersonalDBProxy personalDBProxy) {
        Object[] objArr = {personalDBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997775b8e868faba3161520f62f21f35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997775b8e868faba3161520f62f21f35");
        } else {
            this.b = personalDBProxy;
        }
    }
}
