package com.sankuai.waimai.store.goods.list.viewblocks;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends ShopContentRootBlock {
    public static ChangeQuickRedirect a;
    @NonNull
    private final com.sankuai.waimai.store.goods.list.delegate.d b;
    private final d.a c;

    public b(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, a.InterfaceC1266a interfaceC1266a, d.a aVar) {
        super(dVar, null);
        Object[] objArr = {dVar, null, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403a5d2418f9d37929a9c08ca5aa56b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403a5d2418f9d37929a9c08ca5aa56b9");
            return;
        }
        this.b = dVar;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8d6c9eea4c1cbd60d7b0f9d0a0d88d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8d6c9eea4c1cbd60d7b0f9d0a0d88d");
        } else {
            this.c.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381a5520d1c9df5269b81f7c6705d251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381a5520d1c9df5269b81f7c6705d251");
        } else {
            this.c.c();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f92dfa61e5becbdcc48ecb7465a29fc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f92dfa61e5becbdcc48ecb7465a29fc") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b3708df914b817c2e2fbeb519480b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b3708df914b817c2e2fbeb519480b1");
        } else if (this.c.e() != null) {
            this.c.e().setNestedScrollEnabled(z);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d037dbc608d0b2935379e80fc255e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d037dbc608d0b2935379e80fc255e9");
        } else if (this.c.e() != null) {
            this.c.e().setForbidScroll(z);
        }
    }
}
