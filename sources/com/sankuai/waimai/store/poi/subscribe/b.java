package com.sankuai.waimai.store.poi.subscribe;

import android.database.Observable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends Observable<e> {
    public static ChangeQuickRedirect a;

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ca59d31f1d6fccd34f24d2d6d5f094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ca59d31f1d6fccd34f24d2d6d5f094");
            return;
        }
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                eVar.a(j, i);
            }
        }
    }
}
