package com.sankuai.waimai.store.widgets.filterbar.sortlist.item;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, int i2);

        void a(String str, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected b b;

        public abstract void a();

        public abstract void a(long j, SGSortModel sGSortModel);

        public a(@NonNull b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba1b662ccf883cd8c7531d4de207ccb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba1b662ccf883cd8c7531d4de207ccb");
            } else {
                this.b = bVar;
            }
        }
    }
}
