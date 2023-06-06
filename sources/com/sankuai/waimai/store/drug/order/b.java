package com.sankuai.waimai.store.drug.order;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b {
    public static ChangeQuickRedirect a;
    @Nullable
    private final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b b;

    public b(@Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97458d9be682d227bddc0c1430718c12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97458d9be682d227bddc0c1430718c12");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3bc0ffeb7f7cc42956bd2b9482ebbd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3bc0ffeb7f7cc42956bd2b9482ebbd4");
        } else if (this.b != null) {
            this.b.a(eVar);
        } else {
            super.a(eVar);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a9890d8ecc9018b0ea5ea217449117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a9890d8ecc9018b0ea5ea217449117");
        } else if (this.b != null) {
            this.b.a();
        } else {
            super.a();
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d38f54ddfb6aefd4ddfd02eca4fe3d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d38f54ddfb6aefd4ddfd02eca4fe3d2");
        } else if (this.b != null) {
            this.b.a(bVar);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa24c5256d090c2d59d34f769f53e76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa24c5256d090c2d59d34f769f53e76d");
        } else if (this.b != null) {
            this.b.a(aVar);
        } else {
            super.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beac1a90332b00521b6a20a082974af7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beac1a90332b00521b6a20a082974af7");
        }
        if (this.b != null) {
            return this.b.b();
        }
        return super.b();
    }
}
