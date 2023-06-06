package com.sankuai.waimai.store.platform.domain.manager.order.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<K extends Serializable> implements Serializable {
    public static ChangeQuickRedirect a;
    public final List<List<K>> b;

    public a(List<List<K>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf5bcce92d95c99086fad32540502f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf5bcce92d95c99086fad32540502f8");
        } else {
            this.b = list;
        }
    }

    public final boolean a(@NonNull K k) {
        boolean z;
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca1b3b6d8532bfb15b2411819fedcee9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca1b3b6d8532bfb15b2411819fedcee9")).booleanValue();
        }
        Object[] objArr2 = {k};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4bb8189266ef1258f6602735e2005ae", RobustBitConfig.DEFAULT_VALUE)) {
            Iterator<List<K>> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                List<K> next = it.next();
                if (next != null && next.contains(k)) {
                    z = true;
                    break;
                }
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4bb8189266ef1258f6602735e2005ae")).booleanValue();
        }
        if (z) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(k);
        this.b.add(arrayList);
        return true;
    }

    public final boolean a(@NonNull K k, @NonNull K k2) {
        Object[] objArr = {k, k2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecec4ca5c2e3e13c4dc8b0a58b1094d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecec4ca5c2e3e13c4dc8b0a58b1094d2")).booleanValue();
        }
        if (k.equals(k2)) {
            return true;
        }
        for (List<K> list : this.b) {
            if (list != null && list.contains(k) && list.contains(k2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final K b(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716755935ae819ef9581a6e82975d66f", RobustBitConfig.DEFAULT_VALUE)) {
            return (K) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716755935ae819ef9581a6e82975d66f");
        }
        for (List<K> list : this.b) {
            if (list != null && list.contains(k)) {
                for (K k2 : list) {
                    if (k2 instanceof String) {
                        try {
                            Long.parseLong((String) k2);
                            return k2;
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    }
                }
                return list.get(0);
            }
        }
        return null;
    }
}
