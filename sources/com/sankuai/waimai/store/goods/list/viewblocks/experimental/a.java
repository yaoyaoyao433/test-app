package com.sankuai.waimai.store.goods.list.viewblocks.experimental;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.helper.e;
import com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f;
import com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.goods.list.viewblocks.header.a implements f {
    public static ChangeQuickRedirect c;
    public boolean d;
    private g l;
    private e m;

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int a() {
        return 0;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi) {
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_st_goods_list_market_layout_header_extperimental;
    }

    public a(@NonNull d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3373a997864cd3f96505ccd553fc6e6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3373a997864cd3f96505ccd553fc6e6e");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ed4a3df09c9f06844fa81a034dbeb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ed4a3df09c9f06844fa81a034dbeb0");
            return;
        }
        super.c_(i);
        float a = n.a((i * 2.0f) / b(), 0.0f, 1.0f);
        this.g.b(a);
        this.h.setAlpha(a);
        k.c((Activity) this.mContext, ((double) a) < 0.5d);
        this.m.a(this.g, this.l.c(), b());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f214abcabfb9e5f25a3f4a02f05df3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f214abcabfb9e5f25a3f4a02f05df3d");
            return;
        }
        this.l = new g(this, (LinearLayout) view.findViewById(R.id.layout_header_view), i.h().a(SCConfigPath.SGC_POI_HEADER_MACH_SYNC, false));
        this.m = new e(this.f);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final com.sankuai.waimai.store.viewblocks.i a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15881a106d40a1b41533e74253252000", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.viewblocks.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15881a106d40a1b41533e74253252000") : new com.sankuai.waimai.store.viewblocks.i(dVar) { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.a.1
            @Override // com.sankuai.waimai.store.viewblocks.i
            public final int a() {
                return R.layout.wm_sc_goods_list_standard_shop_action_bar;
            }
        };
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7969f6e129fb361ee253642126998076", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7969f6e129fb361ee253642126998076")).intValue() : u.a(this.mContext) + h.a(this.mContext, 48.0f);
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c796973a19ae1880d0c8b9c6ec727a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c796973a19ae1880d0c8b9c6ec727a")).intValue() : b() - h.a(this.mContext, 15.0f);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull Poi poi, List<BaseModuleDesc> list) {
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7107f435fc0d7e83bd14ac577ca6dd63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7107f435fc0d7e83bd14ac577ca6dd63");
            return;
        }
        super.a(poi, list);
        if (this.d) {
            a((Drawable) null);
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "482e495c1b30d4eeb4cd0232c423b8e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "482e495c1b30d4eeb4cd0232c423b8e5");
                return;
            } else if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            } else {
                ArrayList arrayList = new ArrayList();
                for (BaseModuleDesc baseModuleDesc : list) {
                    if (TextUtils.equals(BaseModuleDesc.MACH_MODULE_EXPERIMENT_POI_HEADER, baseModuleDesc.moduleId) || TextUtils.equals(BaseModuleDesc.MACH_MODULE_HEADER, baseModuleDesc.moduleId) || TextUtils.equals("food_discount", baseModuleDesc.moduleId)) {
                        arrayList.add(baseModuleDesc);
                    }
                }
                a(arrayList);
                return;
            }
        }
        b(poi, list);
    }

    private void b(Poi poi, List<BaseModuleDesc> list) {
        BaseModuleDesc baseModuleDesc;
        Object[] objArr = {poi, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af9e1368a302d83f2e4493888ba623c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af9e1368a302d83f2e4493888ba623c");
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        if (poi.isUserHeaderInfoModule && com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            Iterator<BaseModuleDesc> it = list.iterator();
            while (it.hasNext()) {
                baseModuleDesc = it.next();
                if (baseModuleDesc != null && !TextUtils.equals(baseModuleDesc.nativeId, "native") && TextUtils.equals(BaseModuleDesc.MACH_MODULE_EXPERIMENT_POI_HEADER, baseModuleDesc.moduleId)) {
                    break;
                }
            }
        }
        baseModuleDesc = null;
        if (baseModuleDesc != null) {
            arrayList.add(baseModuleDesc);
            a(arrayList);
        }
    }

    private void a(List<BaseModuleDesc> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c23ee5338da02868fc04736d8943573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c23ee5338da02868fc04736d8943573");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            ViewParent parent = this.mView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setPadding(0, 0, 0, 0);
            }
            if (this.l != null) {
                this.l.a(list);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0960b517395489e09abd0881ff429b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0960b517395489e09abd0881ff429b");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb716e82729139639849aa1d4bd19c5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb716e82729139639849aa1d4bd19c5e");
            return;
        }
        if (this.l != null) {
            this.l.b();
        }
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.f
    public final d f() {
        return this.a;
    }
}
