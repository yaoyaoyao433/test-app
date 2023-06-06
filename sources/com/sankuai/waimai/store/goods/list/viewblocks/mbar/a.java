package com.sankuai.waimai.store.goods.list.viewblocks.mbar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.List;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        SCBaseActivity a();

        void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar);

        void a(List<GoodsSpu> list, @Nullable String str);

        com.sankuai.waimai.store.platform.domain.manager.poi.a b();

        void d();

        void j();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.mbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1197a {
        public static ChangeQuickRedirect a;
        protected b b;

        public AbstractC1197a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bf1ebd1aeb799b3db50af771383b00a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bf1ebd1aeb799b3db50af771383b00a");
            } else {
                this.b = bVar;
            }
        }
    }
}
