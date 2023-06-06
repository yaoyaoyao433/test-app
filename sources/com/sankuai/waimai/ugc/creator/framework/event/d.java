package com.sankuai.waimai.ugc.creator.framework.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d<E> extends ArrayList<E> {
    public static ChangeQuickRedirect a;

    public final void a(c<? super E> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0160dbf42b6b147f65b5194cccbef4c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0160dbf42b6b147f65b5194cccbef4c1");
            return;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            cVar.a(it.next());
        }
    }
}
