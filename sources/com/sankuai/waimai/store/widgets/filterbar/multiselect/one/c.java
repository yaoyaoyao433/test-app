package com.sankuai.waimai.store.widgets.filterbar.multiselect.one;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(String str, boolean z);

        void a(List<com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.d> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected b b;

        public abstract void a(List<Long> list, SGSortModel sGSortModel);

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f251a2c55bc7b03b245c985eb797442d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f251a2c55bc7b03b245c985eb797442d");
            } else {
                this.b = bVar;
            }
        }
    }
}
