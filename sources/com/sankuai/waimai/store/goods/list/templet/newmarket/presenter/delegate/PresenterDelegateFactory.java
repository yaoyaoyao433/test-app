package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9ba9aa22928f8dc5c02b83b63c707a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9ba9aa22928f8dc5c02b83b63c707a");
        } else {
            this.b = new SparseArray<>();
        }
    }

    public final a a(int i, @NonNull f.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bedc405aeb76147bc0255d10d331b857", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bedc405aeb76147bc0255d10d331b857");
        }
        a aVar = this.b.get(i);
        if (aVar == null) {
            a b = b(i, bVar);
            this.b.put(i, b);
            return b;
        }
        return aVar;
    }

    private a b(int i, @NonNull f.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "753f2bdfd9eee2ed74d81e5deec9e8a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "753f2bdfd9eee2ed74d81e5deec9e8a1");
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
