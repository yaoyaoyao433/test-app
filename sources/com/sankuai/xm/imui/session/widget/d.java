package com.sankuai.xm.imui.session.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class d extends com.sankuai.xm.imui.common.widget.b<j> {
    public static ChangeQuickRedirect i;

    public int a() {
        return 0;
    }

    public final <T> void a(Class<T> cls, com.sankuai.xm.base.callback.c<T> cVar) {
        Object[] objArr = {cls, cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c878bf9dafabf2156ebc26534e100d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c878bf9dafabf2156ebc26534e100d");
        } else {
            com.sankuai.xm.imui.session.b.b(this.f).a(cls, cVar, true);
        }
    }
}
