package com.sankuai.xm.imui.session.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class f<P extends Plugin, D> extends com.sankuai.xm.base.entity.b<D> {
    public static ChangeQuickRedirect b;
    private final P c;

    public f(P p, D d) {
        super(d);
        Object[] objArr = {p, d};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c405873f17373c77f1d7b121e866bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c405873f17373c77f1d7b121e866bb");
        } else {
            this.c = p;
        }
    }
}
