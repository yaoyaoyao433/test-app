package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PresenterDelegateFactory {
    public static ChangeQuickRedirect a;
    private final SparseArray<a> b;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface LoadType {
        public static final int DEFAULT = 0;
        public static final int DEFAULT_AND_CLEAR_DATA = 1;
        public static final int NEXT_PAGE = 2;
        public static final int PREVIOUS_PAGE = 4;
    }

    public PresenterDelegateFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a160313a896aa19e6f00f0763d983785", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a160313a896aa19e6f00f0763d983785");
        } else {
            this.b = new SparseArray<>();
        }
    }

    public final a a(int i, @NonNull i.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e4f8530b32799f16d7fbd8e001c1783", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e4f8530b32799f16d7fbd8e001c1783");
        }
        a aVar = this.b.get(i);
        if (aVar == null) {
            a b = b(i, bVar);
            this.b.put(i, b);
            return b;
        }
        return aVar;
    }

    private a b(int i, @NonNull i.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b8942217402a5a145a575619835bf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b8942217402a5a145a575619835bf5");
        }
        if (i != 4) {
            switch (i) {
                case 0:
                    return new c(bVar);
                case 1:
                    return new b(bVar);
                case 2:
                    return new d(bVar);
                default:
                    return null;
            }
        }
        return new e(bVar);
    }
}
