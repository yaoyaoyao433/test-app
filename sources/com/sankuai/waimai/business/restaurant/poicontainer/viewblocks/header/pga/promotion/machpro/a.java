package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro;

import android.view.View;
import com.meituan.android.cube.pga.common.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<V extends View> extends MPComponent<V> {
    public static ChangeQuickRedirect d;
    private f a;

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f487854cd6677449c2d4e0be60486fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f487854cd6677449c2d4e0be60486fb");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e279010b9a4abae89aeba1fe7efe083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e279010b9a4abae89aeba1fe7efe083");
            return;
        }
        super.onDestroy();
        if (this.a != null) {
            this.a.a();
        }
    }

    public final f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a8fb50631df0413cfa44c839d5a61e", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a8fb50631df0413cfa44c839d5a61e");
        }
        if (this.a == null) {
            this.a = new f();
        }
        return this.a;
    }
}
