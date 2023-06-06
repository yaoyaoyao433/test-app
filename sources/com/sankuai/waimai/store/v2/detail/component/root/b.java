package com.sankuai.waimai.store.v2.detail.component.root;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.v2.detail.component.root.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1337b {
        void a(GetMenuResponse getMenuResponse);

        void b(long j);

        SCBaseActivity q();

        void s();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected InterfaceC1337b b;

        public abstract void a();

        public abstract void a(Bundle bundle);

        public abstract void a(String str);

        @NonNull
        public abstract com.sankuai.waimai.store.platform.domain.manager.poi.a b();

        public abstract void b(Bundle bundle);

        public abstract GoodsSpu c();

        public abstract boolean d();

        public abstract void e();

        public abstract void f();

        public abstract String g();

        public a(InterfaceC1337b interfaceC1337b) {
            Object[] objArr = {interfaceC1337b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9616f03cbf59a19c3e6537ce84c68857", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9616f03cbf59a19c3e6537ce84c68857");
            } else {
                this.b = interfaceC1337b;
            }
        }
    }
}
