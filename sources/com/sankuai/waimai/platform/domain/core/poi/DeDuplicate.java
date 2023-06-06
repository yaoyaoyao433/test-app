package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class DeDuplicate {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract String getDeDuplicateId();

    public static <T extends DeDuplicate> void deleteDuplicate(ArrayList<T> arrayList) {
        int i = 0;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e7c2743c8742e12522000bb0da94353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e7c2743c8742e12522000bb0da94353");
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            HashMap hashMap = new HashMap();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next != null) {
                    if (((Integer) hashMap.get(next.getDeDuplicateId())) != null) {
                        arrayList.set(i, null);
                    }
                    hashMap.put(next.getDeDuplicateId(), Integer.valueOf(i));
                    i++;
                }
            }
            Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    it2.remove();
                }
            }
        }
    }
}
