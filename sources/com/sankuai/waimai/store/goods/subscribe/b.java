package com.sankuai.waimai.store.goods.subscribe;

import android.database.Observable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends Observable<c> {
    public static ChangeQuickRedirect a;

    public final void a(long j, String str, long j2, long j3, int i) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6162cbca398d06a0b30ac8e8cb2296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6162cbca398d06a0b30ac8e8cb2296");
            return;
        }
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.a(j, str, j2, j3, 2);
            }
        }
    }
}
