package com.sankuai.waimai.drug.b2c;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.j;
import com.sankuai.waimai.foundation.core.service.order.d;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.store.shopping.cart.ui.c {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.shopping.cart.a b;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private e d;
    private boolean m;
    private boolean n;

    public a(@NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, com.sankuai.waimai.store.shopping.cart.a aVar2) {
        super(aVar.i(), aVar, null);
        boolean z = false;
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6616492aa982964822a9e1d75985fbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6616492aa982964822a9e1d75985fbd");
            return;
        }
        this.m = false;
        this.b = aVar2;
        this.c = aVar.g();
        if (this.b != null && this.b.a) {
            z = true;
        }
        this.n = z;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad7e45d2e516f849c0ffc210d53fd56", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad7e45d2e516f849c0ffc210d53fd56") : layoutInflater.inflate(R.layout.wm_st_shopcart_b2c_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d623ea1b844e9ce591417c5e3468a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d623ea1b844e9ce591417c5e3468a7a");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "783c89e0c24dac552f61b8557847b11a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "783c89e0c24dac552f61b8557847b11a");
            return;
        }
        this.d = new e(this.h, this.g, this.b);
        this.d.createAndReplaceView(this.mView, R.id.shop_cart_b2c_poi);
        this.d.a();
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633fab2c3fca1b743b3e912ce5effd3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633fab2c3fca1b743b3e912ce5effd3d");
            return;
        }
        e eVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "ec2c29c403fcb3a9a7d9bf28a3f46a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "ec2c29c403fcb3a9a7d9bf28a3f46a21");
            return;
        }
        eVar.c.a();
        Iterator<j> it = eVar.b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c92ffbd153248b03ffb5c24bd3a6cff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c92ffbd153248b03ffb5c24bd3a6cff5");
            return;
        }
        e eVar = this.d;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "9ddb12cdd841498f5dfc99c59b62f6d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "9ddb12cdd841498f5dfc99c59b62f6d1");
        } else {
            eVar.c.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dad8cc3bd20093ede07cb4ce82871b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dad8cc3bd20093ede07cb4ce82871b6");
            return;
        }
        super.a(z);
        if (this.n) {
            this.d.setVisible(z);
            if (!z || this.m) {
                return;
            }
            this.m = true;
            this.d.a();
        }
    }
}
