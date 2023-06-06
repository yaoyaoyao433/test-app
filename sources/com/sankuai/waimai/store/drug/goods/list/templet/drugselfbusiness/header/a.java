package com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.header;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.goods.list.controller.i;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.f;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a implements e {
    public static ChangeQuickRedirect c;
    private FrameLayout i;
    private f j;

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_drug_header_mach_layout;
    }

    public a(@NonNull c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b35b76e8d87523eed7058ee558de1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b35b76e8d87523eed7058ee558de1b");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90933a55a8561144a861b58446116a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90933a55a8561144a861b58446116a02");
            return;
        }
        this.i = (FrameLayout) view.findViewById(R.id.poi_header_container);
        this.j = new f(this, this.i);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202d7d111ee4417d0cbf75ab87f186b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202d7d111ee4417d0cbf75ab87f186b8");
            return;
        }
        ArrayList arrayList = new ArrayList();
        BaseModuleDesc baseModuleDesc = new BaseModuleDesc();
        baseModuleDesc.jsonData = new HashMap();
        baseModuleDesc.templateId = "supermarket-drug-poi-header-info";
        baseModuleDesc.moduleTitle = "supermarket-drug-poi-header-info";
        baseModuleDesc.moduleId = "drug_food_header_info";
        baseModuleDesc.nativeId = "mach";
        a(poi, baseModuleDesc);
        arrayList.add(baseModuleDesc);
        this.j.a(arrayList);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a
    public final i a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc62e9ecfd5e70903b6b98f7346bae7", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc62e9ecfd5e70903b6b98f7346bae7") : new i(cVar) { // from class: com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.header.a.1
            @Override // com.sankuai.waimai.store.drug.goods.list.controller.i
            public final int a() {
                return R.layout.wm_drug_self_business_shop_action_bar;
            }
        };
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4daa1cccfe0537f77e84de694a1ab45", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4daa1cccfe0537f77e84de694a1ab45")).intValue() : this.mView.getMeasuredHeight();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b414d524ff6ca3ffc7afe382f22ad18", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b414d524ff6ca3ffc7afe382f22ad18")).intValue() : h.a(this.mContext, 63.0f) + u.a(getContext());
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4680c02be329919b061dd6f31da835a4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4680c02be329919b061dd6f31da835a4")).intValue() : a() - b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b7d59afeb116275614b84a9ff329c2", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b7d59afeb116275614b84a9ff329c2") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e
    public final c f() {
        return this.a;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a65e28085624642e2e2d209dc80229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a65e28085624642e2e2d209dc80229");
            return;
        }
        super.onDestroy();
        if (this.j != null) {
            this.j.b();
        }
    }
}
