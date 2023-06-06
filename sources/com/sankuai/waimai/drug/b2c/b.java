package com.sankuai.waimai.drug.b2c;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends j {
    public static ChangeQuickRedirect h;
    private TextView i;

    public b(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(activity, aVar);
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f767fc074eb96b2dff34da887d1b9172", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f767fc074eb96b2dff34da887d1b9172");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f890d9de2e1f7ea40bafc27754bac4b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f890d9de2e1f7ea40bafc27754bac4b2");
            return;
        }
        super.onViewCreated();
        this.i = (TextView) findView(R.id.b2c_poi_empty_shopping_cart_txt);
    }

    @Override // com.sankuai.waimai.drug.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2530365af68e64f132748c1b6d14c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2530365af68e64f132748c1b6d14c2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "410a6bc74b4e5bfebd203465285c0c11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "410a6bc74b4e5bfebd203465285c0c11");
        } else if (this.c == null || this.c.z() || com.sankuai.waimai.store.order.a.e().i(this.c.d())) {
            hide();
        } else {
            show();
            this.i.setText(this.c.k());
        }
    }
}
