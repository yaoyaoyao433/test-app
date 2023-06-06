package com.sankuai.waimai.store.v2.detail.component.pricebar;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.v2.detail.component.pricebar.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1335b {
        void a(@NonNull g gVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected InterfaceC1335b b;

        public abstract void a(GoodsSpu goodsSpu);

        public a(InterfaceC1335b interfaceC1335b) {
            Object[] objArr = {interfaceC1335b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b024a29d2ea9af936ff79c21fb9bce3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b024a29d2ea9af936ff79c21fb9bce3");
            } else {
                this.b = interfaceC1335b;
            }
        }
    }
}
