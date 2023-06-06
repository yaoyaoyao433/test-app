package com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category;

import android.app.Activity;
import android.arch.lifecycle.q;
import android.graphics.Color;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.action.d;
import com.meituan.android.cube.pga.common.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageActivity;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.FilterBarFrameLayout;
import com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import com.sankuai.waimai.platform.widget.filterbar.view.model.SliderSelectData;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.business.page.home.interfacer.b {
    public static ChangeQuickRedirect a;
    final Activity b;
    final com.sankuai.waimai.business.page.kingkong.a c;
    com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a d;
    FilterBarFrameLayout e;
    f f;
    int g;
    private final com.sankuai.waimai.business.page.common.second.b h;
    private final FilterBarFrameLayout i;
    private boolean j;
    private com.sankuai.waimai.rocks.expose.a k;

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9768c1d8b7828693b09e500f380a6575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9768c1d8b7828693b09e500f380a6575");
            return;
        }
        if (bVar.g > g.b(bVar.b) * 3) {
            bVar.c.aj.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
        } else {
            bVar.c.aj.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
        }
    }

    public static /* synthetic */ void b(b bVar) {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9c3fcbcdec9d12a7fdd569362b816708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9c3fcbcdec9d12a7fdd569362b816708");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "39cf6739307ea02568575f82640f1d32", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "39cf6739307ea02568575f82640f1d32")).booleanValue();
        } else {
            com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar = bVar.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "2ccefe9ac43f204322601d14304d0c57", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "2ccefe9ac43f204322601d14304d0c57")).booleanValue();
            } else {
                z = (aVar.h == null || aVar.h.b == null) ? false : true;
            }
        }
        if (!z || bVar.j) {
            return;
        }
        bVar.j = true;
        com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar2 = bVar.d;
        Object[] objArr4 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "2a94816972c9387b528e5fdeba79a7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "2a94816972c9387b528e5fdeba79a7f1");
            return;
        }
        FilterBarViewController filterBarViewController = aVar2.h;
        Object[] objArr5 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect5 = FilterBarViewController.a;
        if (PatchProxy.isSupport(objArr5, filterBarViewController, changeQuickRedirect5, false, "4289da0b82b102345170dca9e02867e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, filterBarViewController, changeQuickRedirect5, false, "4289da0b82b102345170dca9e02867e7");
            return;
        }
        List<String> o = filterBarViewController.b.o();
        filterBarViewController.a(o, false);
        filterBarViewController.a(o, filterBarViewController.b());
        filterBarViewController.k = true;
    }

    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public b(com.sankuai.waimai.business.page.kingkong.a aVar, Activity activity, FragmentManager fragmentManager, View view) {
        long j;
        h E;
        int i;
        int i2;
        Object[] objArr = {aVar, activity, fragmentManager, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27286b03f1abe91896931a99d1fd1358", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27286b03f1abe91896931a99d1fd1358");
            return;
        }
        this.j = false;
        this.g = 0;
        this.b = activity;
        this.c = aVar;
        this.h = aVar.z.a().b;
        this.i = (FilterBarFrameLayout) view.findViewById(R.id.layout_float_filter_bar);
        FilterBarFrameLayout filterBarFrameLayout = this.i;
        Object[] objArr2 = {filterBarFrameLayout, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f703d9bf186206e94eeb77913d7273f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f703d9bf186206e94eeb77913d7273f1");
            i2 = 0;
        } else {
            this.e = new FilterBarFrameLayout(this.b);
            this.c.J.b = new d<View>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final /* synthetic */ View a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49ce018449e819434b4a1a71034a25e4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49ce018449e819434b4a1a71034a25e4") : b.this.e;
                }
            };
            KingkongInfo kingkongInfo = this.c.w.a().b;
            kingkongInfo = kingkongInfo == null ? new KingkongInfo() : kingkongInfo;
            this.c.O.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr3 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7aaec197e224204cd096c7fa58365512", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7aaec197e224204cd096c7fa58365512");
                    } else {
                        b.this.a(bool2.booleanValue());
                    }
                }
            }).a(b());
            this.d = new com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a((PageActivity) this.b, kingkongInfo, filterBarFrameLayout, this.h);
            final com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar2 = this.d;
            FilterBarFrameLayout filterBarFrameLayout2 = this.e;
            final a.InterfaceC0812a interfaceC0812a = new a.InterfaceC0812a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.InterfaceC0812a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "74f8d234a63a45013ea72c0eb463c803", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "74f8d234a63a45013ea72c0eb463c803");
                        return;
                    }
                    b.this.c.x.a((com.meituan.android.cube.pga.common.b<Void>) null);
                    b.this.c.y.a((com.meituan.android.cube.pga.common.b<Integer>) 0);
                }

                @Override // com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.InterfaceC0812a
                public final long b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c831830814f2ca4ebe3bd85b52072255", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c831830814f2ca4ebe3bd85b52072255")).longValue() : b.this.a();
                }

                @Override // com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.InterfaceC0812a
                public final void a(boolean z) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "38a6b8e62661242617115965107f1878", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "38a6b8e62661242617115965107f1878");
                        return;
                    }
                    com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.b = true;
                    b.this.c.S.a((com.meituan.android.cube.pga.common.b<Integer>) 5);
                }
            };
            Object[] objArr3 = {fragmentManager, filterBarFrameLayout2, interfaceC0812a};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "df157023108661c9040f2bee776834f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "df157023108661c9040f2bee776834f1");
                i = 0;
            } else {
                aVar2.k = com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(aVar2.f, a.b.a(aVar2.g), aVar2.a());
                com.sankuai.waimai.business.page.common.model.b bVar = aVar2.m;
                com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar2 = aVar2.k;
                Object[] objArr4 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "cd52d2dee5a2b237f687f8cce5899ae7", RobustBitConfig.DEFAULT_VALUE)) {
                    j = ((Long) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "cd52d2dee5a2b237f687f8cce5899ae7")).longValue();
                } else {
                    j = (bVar2 == null || (E = bVar2.E()) == null || E.b == null || E.b.isEmpty()) ? 0L : E.b.get(0).a;
                }
                bVar.f = j;
                aVar2.l = aVar2.k;
                FilterBarViewController.b bVar3 = new FilterBarViewController.b() { // from class: com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.b
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "00454dfb0b76f84565c6defe4eaf8aed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "00454dfb0b76f84565c6defe4eaf8aed");
                        } else {
                            interfaceC0812a.a();
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.b
                    public final void a(@NonNull c cVar) {
                        boolean z = true;
                        Object[] objArr5 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "76e6c8aa58d485c7bfb44f8051f92988", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "76e6c8aa58d485c7bfb44f8051f92988");
                            return;
                        }
                        if (aVar2.m == null) {
                            long b = interfaceC0812a.b();
                            aVar2.m = aVar2.a(b);
                            if (aVar2.e != null) {
                                aVar2.e.a(b, aVar2.m);
                            }
                        }
                        aVar2.m.f = cVar.a == null ? 0L : cVar.a.longValue();
                        if (cVar.b != null) {
                            aVar2.m.c = new ArrayList<>();
                            aVar2.m.c.addAll(cVar.b);
                        }
                        aVar2.m.d = com.sankuai.waimai.business.page.common.model.b.a(aVar2.m.c);
                        aVar2.m.e = SliderSelectData.a(cVar.c);
                        if (aVar2.m.f == 0 && TextUtils.isEmpty(aVar2.m.d) && com.sankuai.waimai.foundation.utils.d.a(aVar2.m.e)) {
                            z = false;
                        }
                        a.a(aVar2, interfaceC0812a, z);
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
                    public final void a(int i3) {
                        Object[] objArr5 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bc7dcb577ab36859a7c9488b25d1484a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bc7dcb577ab36859a7c9488b25d1484a");
                            return;
                        }
                        ((KingKongViewModel) q.a((FragmentActivity) aVar2.f).a(KingKongViewModel.class)).a(true);
                        List<FilterBarViewController.a> list = ((KingKongViewModel) q.a((FragmentActivity) aVar2.f).a(KingKongViewModel.class)).l;
                        if (list != null) {
                            for (FilterBarViewController.a aVar3 : list) {
                                if (aVar3 != null) {
                                    aVar3.a(i3);
                                }
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
                    public final void b(int i3) {
                        Object[] objArr5 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d30a0258dcd8089ffd7a625a818b3143", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d30a0258dcd8089ffd7a625a818b3143");
                            return;
                        }
                        ((KingKongViewModel) q.a((FragmentActivity) aVar2.f).a(KingKongViewModel.class)).a(false);
                        List<FilterBarViewController.a> list = ((KingKongViewModel) q.a((FragmentActivity) aVar2.f).a(KingKongViewModel.class)).l;
                        if (list != null) {
                            for (FilterBarViewController.a aVar3 : list) {
                                if (aVar3 != null) {
                                    aVar3.b(i3);
                                }
                            }
                        }
                    }
                };
                i = 0;
                aVar2.n = new com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a(aVar2.f, 1, fragmentManager, aVar2.d, filterBarFrameLayout2, bVar3, 2, AppUtil.generatePageInfoKey(aVar2.f));
                aVar2.j = filterBarFrameLayout2;
                aVar2.n.e = R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page;
                com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a aVar3 = aVar2.n;
                Object[] objArr5 = {Integer.valueOf((int) R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page_for_float)};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.a;
                if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "878c16736f42df4467535e1dbb734fa9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "878c16736f42df4467535e1dbb734fa9");
                } else {
                    aVar3.d.setFastFilterBarBackground(R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page_for_float);
                }
                aVar2.h = new FilterBarViewController(aVar2.n, aVar2.k, 1, 2, bVar3, aVar2.f);
                aVar2.h.a(aVar2.m.b, aVar2.m.g, (int) aVar2.m.h);
                aVar2.h.j = false;
            }
            com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar4 = this.d;
            long a2 = a();
            Object[] objArr6 = new Object[2];
            objArr6[i] = new Long(a2);
            objArr6[1] = (byte) 1;
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
            if (PatchProxy.isSupport(objArr6, aVar4, changeQuickRedirect6, false, "f053e2b85fabea0b1d2234cee589b7ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, aVar4, changeQuickRedirect6, i, "f053e2b85fabea0b1d2234cee589b7ba");
            } else {
                aVar4.e.a(a2, aVar4.k);
                aVar4.e.a(a2, aVar4.m);
            }
            com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar5 = this.d;
            Object[] objArr7 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
            if (PatchProxy.isSupport(objArr7, aVar5, changeQuickRedirect7, false, "25cfe30d8742bd876c50e90282d34249", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, aVar5, changeQuickRedirect7, i, "25cfe30d8742bd876c50e90282d34249");
            } else {
                aVar5.h.a();
            }
            this.i.setHeightChangedListener(new FilterBarFrameLayout.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.FilterBarFrameLayout.a
                public final void a(int i3) {
                    Object[] objArr8 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "24d09221747e79790a2d84ad112203c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "24d09221747e79790a2d84ad112203c2");
                    } else {
                        b.this.c.B.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i3));
                    }
                }
            });
            this.c.k.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Object[] objArr8 = {bool};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "4a4705aaca2305142def0581963d3e9f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "4a4705aaca2305142def0581963d3e9f");
                    } else {
                        b.a(b.this);
                    }
                }
            });
            this.c.bH.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr8 = {r11};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "27a53ab82d026efc307a5febe33defc6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "27a53ab82d026efc307a5febe33defc6");
                        return;
                    }
                    b.this.g = 0;
                    b.a(b.this);
                }
            });
            this.c.C.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final /* synthetic */ Object a() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "769da855747554529b19c5acd3248723", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.page.common.model.b) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "769da855747554529b19c5acd3248723") : b.this.d.m;
                }
            };
            this.c.E.a(new com.meituan.android.cube.pga.action.b<Long>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.11
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Long l) {
                    Long l2 = l;
                    Object[] objArr8 = {l2};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "11d04193523e02972d8248f727005d28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "11d04193523e02972d8248f727005d28");
                        return;
                    }
                    com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar6 = b.this.d;
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
                    if (PatchProxy.isSupport(objArr9, aVar6, changeQuickRedirect9, false, "fbd814130cbc1208b60351443f59543e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, aVar6, changeQuickRedirect9, false, "fbd814130cbc1208b60351443f59543e");
                    } else {
                        aVar6.h.b.c();
                        aVar6.h.b.a(true);
                        aVar6.h.b.e();
                    }
                    com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar7 = b.this.d;
                    long longValue = l2.longValue();
                    Object[] objArr10 = {new Long(longValue)};
                    ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
                    if (PatchProxy.isSupport(objArr10, aVar7, changeQuickRedirect10, false, "0b632c22f58a973a95bcaacf354744be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, aVar7, changeQuickRedirect10, false, "0b632c22f58a973a95bcaacf354744be");
                        return;
                    }
                    aVar7.m = aVar7.a(longValue);
                    aVar7.e.a(longValue, aVar7.m);
                    if (aVar7.e.a(longValue) == null) {
                        aVar7.l = com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(aVar7.f, a.b.a(aVar7.g), aVar7.a());
                        aVar7.e.a(longValue, aVar7.l);
                        aVar7.h.a(aVar7.l);
                    } else {
                        aVar7.l = aVar7.e.a(longValue);
                        aVar7.h.a(aVar7.e.a(longValue));
                    }
                    aVar7.h.a(aVar7.m.b, aVar7.m.g, (int) aVar7.m.h);
                    aVar7.h.a();
                }
            }).a(b());
            this.c.G.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.12
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r12) {
                    Object[] objArr8 = {r12};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3c619306f7956bc96bf4e43d2ca624e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3c619306f7956bc96bf4e43d2ca624e4");
                        return;
                    }
                    com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar6 = b.this.d;
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
                    if (PatchProxy.isSupport(objArr9, aVar6, changeQuickRedirect9, false, "1e622801ffa2f328cb5e4c52acca826e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, aVar6, changeQuickRedirect9, false, "1e622801ffa2f328cb5e4c52acca826e");
                        return;
                    }
                    aVar6.h.b.j();
                    aVar6.h.b.l();
                }
            }).a(b());
            this.k = new a();
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "13f42ca81be8d4eba880d3fe85701359", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "13f42ca81be8d4eba880d3fe85701359");
                    } else if (!(b.this.b instanceof Activity) || b.this.b.isFinishing()) {
                    } else {
                        try {
                            b.b(b.this);
                        } catch (Exception unused) {
                        }
                    }
                }
            }, 200L);
            this.d.a((boolean) i);
            i2 = i;
        }
        Object[] objArr8 = new Object[i2];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0e12f271d43dd2ba1a925acd4c5ab195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0e12f271d43dd2ba1a925acd4c5ab195");
        } else if (this.c != null) {
            this.c.bC.a(new com.meituan.android.cube.pga.action.b<RecyclerView>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(RecyclerView recyclerView) {
                    RecyclerView recyclerView2 = recyclerView;
                    Object[] objArr9 = {recyclerView2};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "2a4b0348aa80b95fa89b7e23d951675d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "2a4b0348aa80b95fa89b7e23d951675d");
                    } else if (recyclerView2 != null) {
                        recyclerView2.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.3.1
                            public static ChangeQuickRedirect a;

                            @Override // android.support.v7.widget.RecyclerView.k
                            public final void onScrolled(RecyclerView recyclerView3, int i3, int i4) {
                                Object[] objArr10 = {recyclerView3, Integer.valueOf(i3), Integer.valueOf(i4)};
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "8b298bbc09c08955371ebc6a08145871", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "8b298bbc09c08955371ebc6a08145871");
                                    return;
                                }
                                super.onScrolled(recyclerView3, i3, i4);
                                b.this.g += i4;
                                b bVar4 = b.this;
                                Object[] objArr11 = {Integer.valueOf(i4)};
                                ChangeQuickRedirect changeQuickRedirect11 = b.a;
                                if (PatchProxy.isSupport(objArr11, bVar4, changeQuickRedirect11, false, "b5d4af69d42415166e753d92034a4175", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr11, bVar4, changeQuickRedirect11, false, "b5d4af69d42415166e753d92034a4175");
                                } else {
                                    com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar6 = bVar4.d;
                                    Object[] objArr12 = {Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
                                    if (PatchProxy.isSupport(objArr12, aVar6, changeQuickRedirect12, false, "48b1c8b18a3c29a5307d6cc0b0adaef6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, aVar6, changeQuickRedirect12, false, "48b1c8b18a3c29a5307d6cc0b0adaef6");
                                    } else {
                                        aVar6.h.b.a(i4);
                                    }
                                }
                                b.a(b.this);
                            }
                        });
                    }
                }
            }).a(b());
            this.c.V.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Integer num2 = num;
                    Object[] objArr9 = {num2};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "87f907d56c444b22f2242de938346b0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "87f907d56c444b22f2242de938346b0d");
                    } else {
                        b.this.d.a(num2.intValue() <= 0);
                    }
                }
            }).a(b());
        }
    }

    long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27032cc69885611154d340d9177f6a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27032cc69885611154d340d9177f6a6")).longValue();
        }
        KingkongInfo kingkongInfo = this.c.w.a().b;
        if (kingkongInfo != null) {
            return kingkongInfo.g;
        }
        return 0L;
    }

    @Override // com.sankuai.waimai.business.page.home.interfacer.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4c8265b8acc814612f86cd8cbe7051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4c8265b8acc814612f86cd8cbe7051");
        } else if (i == 0) {
            this.k.b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends com.sankuai.waimai.rocks.expose.a {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18be23b2e01acefbb64cbc0dc890dac2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18be23b2e01acefbb64cbc0dc890dac2");
            }
        }

        @Override // com.sankuai.waimai.rocks.expose.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50042663787ab298ead0c676170fb520", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50042663787ab298ead0c676170fb520");
            } else {
                b.b(b.this);
            }
        }
    }

    public final void a(boolean z) {
        View findViewById;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d438786d99914b775dd76202a85da437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d438786d99914b775dd76202a85da437");
        } else if (this.d == null) {
        } else {
            com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar = this.d;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6cc568bbb3019aa4a69a371063aef8b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6cc568bbb3019aa4a69a371063aef8b1");
            } else if (aVar.j != null) {
                if (z) {
                    aVar.b(R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page_for_float);
                } else {
                    aVar.b(R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page);
                }
            }
            com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar2 = this.d;
            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "7bbda6eb457a4bcbf1889a7a3b78795d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "7bbda6eb457a4bcbf1889a7a3b78795d");
            } else if (aVar2.j != null && (findViewById = aVar2.j.findViewById(R.id.filter_container)) != null) {
                if (z) {
                    findViewById.setBackgroundColor(com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.c);
                } else {
                    findViewById.setBackgroundColor(com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.b);
                }
            }
            com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a aVar3 = this.d;
            Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.kingkong.view.poilist.filterbar.a.a;
            if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "9c26435f4822853296b0be52f932000f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "9c26435f4822853296b0be52f932000f");
            } else if (aVar3.n != null) {
                if (!z) {
                    aVar3.n.e = R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page;
                } else {
                    aVar3.n.e = R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page_for_float;
                }
            }
            if (!z) {
                this.d.a(Color.parseColor("#F5F5F5"));
            } else {
                this.d.a(Color.parseColor("#FFFFFF"));
            }
        }
    }

    private f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4554ee2991389ae86fe7c7fb75db4c93", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4554ee2991389ae86fe7c7fb75db4c93");
        }
        if (this.f == null) {
            this.f = new f();
        }
        return this.f;
    }
}
