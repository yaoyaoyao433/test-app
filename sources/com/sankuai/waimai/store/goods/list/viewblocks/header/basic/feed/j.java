package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    Activity b;
    private UniversalImageView c;

    public j(@NonNull Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e247c015d520bb73bf5ce845b6c2042d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e247c015d520bb73bf5ce845b6c2042d");
        } else {
            this.b = activity;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5568d26445aada418204bc4a9a2171ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5568d26445aada418204bc4a9a2171ed");
            return;
        }
        super.onViewCreated();
        this.c = (UniversalImageView) findView(R.id.store_contract_poi);
        this.c.setColorFraction(1.0f);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e390bc4ecdce92dc65c3767c061a67b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e390bc4ecdce92dc65c3767c061a67b");
        } else {
            this.c.setColorFraction(1.0f - f);
        }
    }

    public final void a(final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, final SCPageConfig sCPageConfig, final String str) {
        Object[] objArr = {aVar, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36b84c7f99d2bbe69b3d518fc6a2775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36b84c7f99d2bbe69b3d518fc6a2775");
        } else if (aVar == null || aVar.b == null || !aVar.b.storeImNewStyle() || !aVar.B()) {
            hide();
        } else {
            show();
            Poi poi = aVar.b;
            if (poi.bottomPoiImInfo != null && poi.bottomPoiImInfo.b == 2) {
                this.c.setAlpha(0.6f);
            } else {
                this.c.setAlpha(1.0f);
            }
            this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.j.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdd09cd10dc3f618fda70bb211ebb042", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdd09cd10dc3f618fda70bb211ebb042");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(j.this.mContext, "b_waimai_37p63y8a_mc").a("poi_id", aVar.d()).a();
                    com.sankuai.waimai.store.shopping.cart.util.d.a(j.this.b, aVar, sCPageConfig, str);
                }
            });
        }
    }
}
