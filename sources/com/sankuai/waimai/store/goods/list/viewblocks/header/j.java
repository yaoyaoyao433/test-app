package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.viewblocks.header.widget.MemberLevelLogoView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiMemberInfo;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.repository.model.PoiNavigationSecondCategotyList;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.view.banner.AutoScrollPagerView;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class j extends com.sankuai.waimai.store.goods.list.base.d {
    public static ChangeQuickRedirect e;
    private GridView c;
    private GridView d;
    public AutoScrollPagerView f;
    private MemberLevelLogoView g;

    public abstract int a();

    public j(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, ViewGroup viewGroup) {
        super(dVar);
        Object[] objArr = {dVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0fb3bef62506df92bb85e98052caf17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0fb3bef62506df92bb85e98052caf17");
        } else {
            createView(viewGroup);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e3700b910a370928562f8a66e97171", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e3700b910a370928562f8a66e97171");
        }
        View inflate = getLayoutInflater().inflate(a(), viewGroup, false);
        this.f = (AutoScrollPagerView) inflate.findViewById(R.id.rl_ad);
        this.c = (GridView) inflate.findViewById(R.id.gv_major_poi_category);
        this.d = (GridView) inflate.findViewById(R.id.gv_major_poi_category_new_navigation);
        this.g = (MemberLevelLogoView) inflate.findViewById(R.id.rl_member_card_info);
        viewGroup.addView(inflate);
        return inflate;
    }

    public final boolean a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "296ba8891c31c25310f50e436e6c7ddd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "296ba8891c31c25310f50e436e6c7ddd")).booleanValue() : Math.abs(f) <= ((float) i);
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ac8e420bf4c0b897edcfbe67f44de2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ac8e420bf4c0b897edcfbe67f44de2")).intValue() : this.c.getHeight() + this.d.getHeight();
    }

    public void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda5f37aec2ad4a99b3329ab489b3491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda5f37aec2ad4a99b3329ab489b3491");
        } else {
            a(restMenuResponse, (d) null);
        }
    }

    public void a(RestMenuResponse restMenuResponse, d dVar) {
        int i;
        int i2;
        Object[] objArr = {restMenuResponse, dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5101873944d708a1cf40eec408490a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5101873944d708a1cf40eec408490a2b");
            return;
        }
        if (restMenuResponse.mBanners != null) {
            List<PoiOperationItem> list = restMenuResponse.mBanners;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54438810d824ca23ea95d7d3e3bd8b39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54438810d824ca23ea95d7d3e3bd8b39");
            } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                if (this.f.d()) {
                    a(true);
                }
                this.f.a(list, new GoodsListScrollViewPagerAdapter(getContext(), list, this.b, new BannerPagerAdapter.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.j.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    public final int a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7f86451710df36d7eedf2a5fd32be7d7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7f86451710df36d7eedf2a5fd32be7d7")).intValue() : com.sankuai.shangou.stone.util.h.a(j.this.mContext, 12.0f);
                    }

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    @NonNull
                    public final ImageView.ScaleType b() {
                        return ImageView.ScaleType.FIT_XY;
                    }
                }));
                if (list.size() > 1) {
                    this.f.b();
                }
            } else {
                this.f.c();
                if (this.f.d()) {
                    a(false);
                }
            }
        } else {
            this.f.setVisibility(8);
        }
        List<RestMenuResponse.NavigateItem> list2 = restMenuResponse.mNavigateItemList;
        List<PoiNavigationSecondCategotyList> list3 = restMenuResponse.mPoiNavigationSecondCategotyList;
        int c = com.sankuai.shangou.stone.util.a.c(list2);
        Object[] objArr3 = {Integer.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect3 = e;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa972615daed3f3e6142332a879712b6", RobustBitConfig.DEFAULT_VALUE)) {
            c = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa972615daed3f3e6142332a879712b6")).intValue();
        } else if (c == 5 || c > 8) {
            c = 5;
        } else if (c > 5 && c <= 8) {
            c = 4;
        }
        int c2 = com.sankuai.shangou.stone.util.a.c(list3);
        if (c2 == 4) {
            com.sankuai.waimai.store.goods.list.adapter.c cVar = new com.sankuai.waimai.store.goods.list.adapter.c(this.a, restMenuResponse.mPoiNavigationSecondCategotyList);
            this.d.setNumColumns(c2);
            this.d.setSelector(new ColorDrawable(0));
            this.d.setAdapter((ListAdapter) cVar);
            i = 1;
            u.a(this.d);
        } else {
            i = 1;
            u.c(this.d);
        }
        if (com.sankuai.shangou.stone.util.a.b(restMenuResponse.mNavigateItemList)) {
            View[] viewArr = new View[i];
            viewArr[0] = this.c;
            u.c(viewArr);
            i2 = 1;
        } else {
            com.sankuai.waimai.store.goods.list.adapter.c cVar2 = new com.sankuai.waimai.store.goods.list.adapter.c(this.a, restMenuResponse.mNavigateItemList, dVar);
            this.c.setNumColumns(c);
            this.c.setSelector(new ColorDrawable(0));
            this.c.setAdapter((ListAdapter) cVar2);
            i2 = 1;
            u.a(this.c);
        }
        Poi poi = restMenuResponse.getPoi();
        Object[] objArr4 = new Object[i2];
        objArr4[0] = poi;
        ChangeQuickRedirect changeQuickRedirect4 = e;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "253b64e4017b0ab1676291f8a230d769", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "253b64e4017b0ab1676291f8a230d769")).booleanValue();
            return;
        }
        PoiMemberInfo poiMemberInfo = poi.memberInfo;
        this.g.setMemberLevel(poiMemberInfo);
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_pq2bus9u", this.g);
        bVar.a("is_vip", Integer.valueOf((poiMemberInfo == null || !poiMemberInfo.isPoiMember) ? 0 : 1));
        bVar.a("poi_id", poi.getOfficialPoiId());
        this.g.a(bVar);
        HashMap hashMap = new HashMap();
        hashMap.put("is_vip", Integer.valueOf((poiMemberInfo == null || !poiMemberInfo.isPoiMember) ? 0 : 0));
        hashMap.put("poi_id", poi.getOfficialPoiId());
        this.g.a("b_atsidyig", hashMap);
        this.g.getVisibility();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "673ac0e083add7490c3cbf55257eecc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "673ac0e083add7490c3cbf55257eecc1");
        } else {
            this.f.b();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a52055aa855b0dc2249fff977d88081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a52055aa855b0dc2249fff977d88081");
            return;
        }
        super.onDestroy();
        this.f.c();
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9040baf3871f940483c6ea1b4ec4fd84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9040baf3871f940483c6ea1b4ec4fd84");
        } else if (this.f.d()) {
            if (z) {
                this.f.setVisibility(0);
            } else {
                this.f.setVisibility(8);
            }
        }
    }
}
