package com.sankuai.waimai.store.shopping.patchwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(String str, int i);

        void a(List<com.sankuai.waimai.store.shopping.patchwork.model.c> list, int i, List<GoodsSpu> list2);

        String b();

        void b(String str);

        void c();

        void d();

        boolean e();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected b b;

        public abstract void a();

        public abstract void a(double d, int i);

        public abstract com.sankuai.waimai.store.platform.domain.manager.poi.a b();

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171c8682a125b058ed378687be1f9e2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171c8682a125b058ed378687be1f9e2f");
            } else {
                this.b = bVar;
            }
        }
    }
}
