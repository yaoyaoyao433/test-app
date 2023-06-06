package com.sankuai.waimai.store.goods.detail.components.subroot.actionbar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        SCBaseActivity q();

        int v();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected b b;

        public abstract void a();

        public abstract void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, String str, String str2, String str3);

        public abstract void a(String str);

        public abstract long b();

        public abstract void b(String str);

        public abstract long c();

        public abstract String d();

        public abstract String e();

        public abstract com.sankuai.waimai.store.platform.domain.manager.poi.a f();

        public abstract void g();

        public abstract void h();

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed7560d79b76aec2f0a1f07081037ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed7560d79b76aec2f0a1f07081037ff");
            } else {
                this.b = bVar;
            }
        }
    }
}
