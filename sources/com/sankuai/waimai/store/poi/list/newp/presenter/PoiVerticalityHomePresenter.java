package com.sankuai.waimai.store.poi.list.newp.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.event.f;
import com.sankuai.waimai.store.event.j;
import com.sankuai.waimai.store.newwidgets.indicator.TabInfo;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
import com.sankuai.waimai.store.repository.model.TabItem;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.widgets.lottie.d;
import com.sankuai.waimai.store.widgets.lottie.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiVerticalityHomePresenter {
    public static ChangeQuickRedirect a;
    public final a b;
    public final com.sankuai.waimai.store.param.a c;
    public final List<TabInfo> d;
    private final com.sankuai.waimai.store.widgets.lottie.a e;
    private String f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(TabInfo tabInfo);

        void a(@NonNull List<TabInfo> list);

        void b(int i);

        void c(String str);

        SCBaseActivity h();

        void j();

        com.sankuai.waimai.store.poi.list.widget.c k();

        String l();
    }

    public PoiVerticalityHomePresenter(@NonNull a aVar, @NonNull com.sankuai.waimai.store.param.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a21968b2769cc6881f7ac02d8cdf25b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a21968b2769cc6881f7ac02d8cdf25b");
            return;
        }
        this.d = new ArrayList();
        this.e = new com.sankuai.waimai.store.widgets.lottie.a(aVar.h());
        this.b = aVar;
        this.c = aVar2;
        com.meituan.android.bus.a.a().a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateMsgRedCount(j jVar) {
        TabInfo a2;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad7eba8e7fab6f7ecb7abd7b3b10db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad7eba8e7fab6f7ecb7abd7b3b10db8");
        } else if (jVar == null || (a2 = a(jVar.a)) == null || a2.b == null) {
        } else {
            a2.h = jVar.b;
            this.b.j();
        }
    }

    private void a(List<TabItem> list) {
        TabInfo tabInfo;
        boolean z;
        boolean z2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224538bc8dbffcd79932dee166b1a8ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224538bc8dbffcd79932dee166b1a8ab");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (TabItem tabItem : list) {
                if (tabItem != null) {
                    if (tabItem.tabType == 2) {
                        Object[] objArr2 = {tabItem};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75553d4b0f410ec012b57513d5e4f070", RobustBitConfig.DEFAULT_VALUE)) {
                            tabInfo = (TabInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75553d4b0f410ec012b57513d5e4f070");
                        } else {
                            tabInfo = new TabInfo();
                            tabInfo.a(tabItem);
                            tabInfo.b = new OrderListFragment();
                        }
                    } else {
                        Object[] objArr3 = {tabItem};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "89f624666053f8716988c861f64cb0e9", RobustBitConfig.DEFAULT_VALUE)) {
                            tabInfo = (TabInfo) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "89f624666053f8716988c861f64cb0e9");
                        } else {
                            tabInfo = new TabInfo();
                            Object[] objArr4 = {tabItem};
                            ChangeQuickRedirect changeQuickRedirect4 = TabInfo.a;
                            if (PatchProxy.isSupport(objArr4, tabInfo, changeQuickRedirect4, false, "3d79e3b57cc0652976de8d2a8aa9df32", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, tabInfo, changeQuickRedirect4, false, "3d79e3b57cc0652976de8d2a8aa9df32");
                            } else {
                                tabInfo.a(tabItem);
                                tabInfo.l = tabItem.cartoonSwitch;
                                tabInfo.m = tabItem.cartoonJsonUrl;
                                tabInfo.n = tabItem.cartoonDisplayNum;
                                tabInfo.o = tabItem.gifBubbleSwitch;
                                tabInfo.p = tabItem.gifBubbleUrl;
                                tabInfo.q = tabItem.gifBubbleDisplaySeconds;
                                tabInfo.r = tabItem.staticConfigSceneSwitch;
                                tabInfo.s = tabItem.dynamicConfigSceneSwitch;
                                tabInfo.t = tabItem.sceneText;
                                tabInfo.u = tabItem.sceneUrl;
                                tabInfo.v = tabItem.sceneUrlResourceType;
                                tabInfo.w = tabItem.sceneBubbleDisplaySeconds;
                                tabInfo.z = tabItem.sceneActivityConfigID;
                                tabInfo.x = tabItem.categoryType;
                                tabInfo.y = tabItem.navigateType;
                                tabInfo.h = tabItem.unreadMessageCount;
                                if (!tabItem.cartoonSwitch) {
                                    Object[] objArr5 = {tabItem};
                                    ChangeQuickRedirect changeQuickRedirect5 = TabInfo.a;
                                    if (PatchProxy.isSupport(objArr5, tabInfo, changeQuickRedirect5, false, "9e0d35efd232474ca6621478a12d1eed", RobustBitConfig.DEFAULT_VALUE)) {
                                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, tabInfo, changeQuickRedirect5, false, "9e0d35efd232474ca6621478a12d1eed")).booleanValue();
                                    } else {
                                        z2 = (com.sankuai.waimai.store.poi.list.widget.c.a(com.sankuai.waimai.store.util.b.a(), tabItem.sceneActivityConfigID) || tabItem.gifBubbleSwitch || (!tabItem.staticConfigSceneSwitch && !tabItem.dynamicConfigSceneSwitch)) ? false : true;
                                    }
                                    if (!z2) {
                                        z = false;
                                        tabInfo.D = z;
                                    }
                                }
                                z = true;
                                tabInfo.D = z;
                            }
                            tabInfo.b = SGCommonRNFragment.a(tabItem.scheme);
                        }
                    }
                    this.d.add(tabInfo);
                }
            }
        }
    }

    private void b(List<TabItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45046e591a1f47f163826be319ca7bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45046e591a1f47f163826be319ca7bae");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (TabItem tabItem : list) {
                if (tabItem != null) {
                    if (!TextUtils.isEmpty(tabItem.cartoonJsonUrl) && !arrayList.contains(tabItem.cartoonJsonUrl)) {
                        arrayList.add(tabItem.cartoonJsonUrl);
                    }
                    if (tabItem.sceneUrlResourceType == 1 && !TextUtils.isEmpty(tabItem.sceneUrl) && !arrayList.contains(tabItem.sceneUrl)) {
                        arrayList.add(tabItem.sceneUrl);
                    }
                    String str = tabItem.cartonFileUrl;
                    if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
            this.b.k().a(a(4));
            return;
        }
        com.sankuai.waimai.store.widgets.lottie.a aVar = this.e;
        String l = this.b.l();
        e eVar = new e() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.PoiVerticalityHomePresenter.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.lottie.e
            public final void a(@Nullable Map<String, com.airbnb.lottie.e> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5e3451e7b1a8d986a60330f2ab83be9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5e3451e7b1a8d986a60330f2ab83be9");
                } else {
                    PoiVerticalityHomePresenter.this.b.k().a(PoiVerticalityHomePresenter.this.a(4));
                }
            }
        };
        Object[] objArr2 = {arrayList, l, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.lottie.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e62f3fe76f82d15c0e5fc0cb6ba6d188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e62f3fe76f82d15c0e5fc0cb6ba6d188");
        } else if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
            aVar.c = eVar;
            aVar.b.clear();
            al.a(new d(arrayList, aVar.d, aVar), l);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62acebfcb7da5afef6cb20255827d228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62acebfcb7da5afef6cb20255827d228");
            return;
        }
        TabInfo a2 = a(0);
        this.d.clear();
        this.d.add(a2);
    }

    public final TabInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e154e2cd8431d53d2013f737d37caad", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e154e2cd8431d53d2013f737d37caad");
        }
        for (TabInfo tabInfo : this.d) {
            if (tabInfo != null && tabInfo.f) {
                return tabInfo;
            }
        }
        return null;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffee3779719da83cc42f0961a17bfa02", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffee3779719da83cc42f0961a17bfa02")).intValue() : this.d.size();
    }

    public final TabInfo a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91f8cc9c2d0963e6ddc1f8acfe899b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91f8cc9c2d0963e6ddc1f8acfe899b6");
        }
        for (TabInfo tabInfo : this.d) {
            if (tabInfo != null && tabInfo.c == i) {
                return tabInfo;
            }
        }
        return null;
    }

    public final TabInfo b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8c4cd5a03e637d930e102d56ed771f", RobustBitConfig.DEFAULT_VALUE) ? (TabInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8c4cd5a03e637d930e102d56ed771f") : (TabInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i);
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d38c5280c3519c1a51749ad47bb47b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d38c5280c3519c1a51749ad47bb47b");
        } else {
            this.b.a(this.d);
        }
    }

    public final com.airbnb.lottie.e a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc74628fba67c715f320f076174e4ea", RobustBitConfig.DEFAULT_VALUE) ? (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc74628fba67c715f320f076174e4ea") : this.e.a(str);
    }

    @Subscribe
    public void notifyChangeRockState(com.sankuai.waimai.store.poi.list.model.d dVar) {
        TabInfo a2;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39dcc9b85d172c44835814d4f04f5d94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39dcc9b85d172c44835814d4f04f5d94");
        } else if (dVar == null || (a2 = a(0)) == null || a2.g == dVar.a) {
        } else {
            a2.g = dVar.a;
            this.b.a(a2);
        }
    }

    @Subscribe
    public void onPoiDataReady4(f.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0a7d3b7bca19b352a4607a361b24fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0a7d3b7bca19b352a4607a361b24fb");
        } else if (aVar == null || aVar.a == null || aVar.a.getToolbarBlock() == null || aVar.a.getToolbarBlock().data == null || !f()) {
        } else {
            List<TabItem> list = aVar.a.getToolbarBlock().data.tabList;
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            a(list, aVar.a.categoryTitle);
            String str = aVar.a.getToolbarBlock().propsData.backImageUrl;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e26b2aaaf774d118a26d2e2a533a1273", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e26b2aaaf774d118a26d2e2a533a1273");
            } else {
                this.b.c(str);
            }
        }
    }

    @Subscribe
    public void onPoiDataReady(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe565eb90a636d09bf04302f31a3970d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe565eb90a636d09bf04302f31a3970d");
        } else if (fVar == null || fVar.a == null || !f()) {
        } else {
            List<TabItem> tabList = fVar.a.getTabList();
            if (com.sankuai.shangou.stone.util.a.b(tabList)) {
                return;
            }
            a(tabList, fVar.a.categoryTitle);
        }
    }

    private void a(@NonNull List<TabItem> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc9ada7022f1b82ab107474c4d8b43c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc9ada7022f1b82ab107474c4d8b43c");
            return;
        }
        this.f = str;
        e();
        a(list);
        b(list);
        this.b.b(0);
        c();
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eabdc920fc676af9ee98711f5d317f8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eabdc920fc676af9ee98711f5d317f8") : TextUtils.isEmpty(this.f) ? this.b.h().getString(R.string.wm_sc_nearby_poi) : this.f;
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdc483e168d84ac93ef2887e25a58387", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdc483e168d84ac93ef2887e25a58387")).booleanValue() : this.d.size() == 1;
    }
}
