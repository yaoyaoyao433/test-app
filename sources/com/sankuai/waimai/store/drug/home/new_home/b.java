package com.sankuai.waimai.store.drug.home.new_home;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.swiper.a;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.widgets.recycler.b<com.sankuai.waimai.store.widgets.recycler.e> {
    public static ChangeQuickRedirect a;
    List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> b;
    SCBaseActivity c;
    private com.sankuai.waimai.store.param.a d;
    private com.sankuai.waimai.store.drug.home.new_home.filter.d g;
    private a h;
    private j i;

    public static /* synthetic */ void a(b bVar, Mach mach, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {mach, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ac185a8992fec7d87492615c5318a904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ac185a8992fec7d87492615c5318a904");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            final String valueOf = (aVar.h() == null || !aVar.h().containsKey("expose-group")) ? null : String.valueOf(aVar.h().get("expose-group"));
            String valueOf2 = (aVar.h() == null || !aVar.h().containsKey("expose-key")) ? null : String.valueOf(aVar.h().get("expose-key"));
            if (t.a(valueOf2)) {
                valueOf2 = String.valueOf(System.identityHashCode(aVar.g()));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), valueOf2) { // from class: com.sankuai.waimai.store.drug.home.new_home.b.5
                @Override // com.sankuai.waimai.store.expose.v2.entity.b
                public final String a() {
                    return valueOf;
                }
            };
            Object[] objArr2 = {mach, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            aVar2.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "249810a0e703e2aa76e556de73a7f781", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "249810a0e703e2aa76e556de73a7f781") : new c(mach, aVar));
            com.sankuai.waimai.store.expose.v2.b.a().a(bVar.c, aVar2);
        }
    }

    public static /* synthetic */ void a(b bVar, final Mach mach, List list) {
        Object[] objArr = {mach, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "8dca494383172ec5f802405b368afae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "8dca494383172ec5f802405b368afae0");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.sankuai.waimai.mach.node.a aVar = (com.sankuai.waimai.mach.node.a) it.next();
            if (aVar != null) {
                com.sankuai.waimai.mach.component.swiper.b bVar2 = (com.sankuai.waimai.mach.component.swiper.b) aVar.h;
                if (bVar2 instanceof com.sankuai.waimai.store.mach.swiper.a) {
                    ((com.sankuai.waimai.store.mach.swiper.a) bVar2).d = new a.InterfaceC1221a() { // from class: com.sankuai.waimai.store.drug.home.new_home.b.4
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.mach.swiper.a.InterfaceC1221a
                        public final void d_(int i) {
                            Object[] objArr2 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "628a6f2920758f92521bb82e258a763a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "628a6f2920758f92521bb82e258a763a");
                                return;
                            }
                            com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), i);
                            if (aVar2 != null) {
                                ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                                com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
                                for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                                    if (aVar3 != null) {
                                        b.a(b.this, mach, aVar3);
                                    }
                                }
                            }
                        }
                    };
                }
            }
        }
    }

    public b(SCBaseActivity sCBaseActivity, j jVar, com.sankuai.waimai.store.drug.home.new_home.filter.d dVar, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {sCBaseActivity, jVar, dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91af8e6cbef993b75c4ccc026c53d98a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91af8e6cbef993b75c4ccc026c53d98a");
            return;
        }
        this.b = new ArrayList();
        this.c = sCBaseActivity;
        this.i = jVar;
        this.h = new a(sCBaseActivity);
        this.g = dVar;
        this.d = aVar;
    }

    public final void a(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4c1aaa7cd766f378646168b96443af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4c1aaa7cd766f378646168b96443af");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            this.b.clear();
            this.b.addAll(list);
            m();
        }
    }

    public final void b(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca56f02ddec05f34161ffacd1565587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca56f02ddec05f34161ffacd1565587");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            int size = list.size();
            this.b.addAll(0, list);
            c(0, size);
        }
    }

    public final void c(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d9d30c4d8ceaa6e0f8fc0ea4ccbc85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d9d30c4d8ceaa6e0f8fc0ea4ccbc85");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            int size = this.b.size();
            int size2 = list.size();
            this.b.addAll(list);
            c(size, size2);
        }
    }

    public final void a(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list, int i, boolean z) {
        Object[] objArr = {list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9744c6d3f1adc577faf96dd36d22e5c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9744c6d3f1adc577faf96dd36d22e5c5");
        } else if (!com.sankuai.shangou.stone.util.a.b(list) && i >= 0) {
            int i2 = 0;
            for (int i3 = i; !list.isEmpty() && i3 < this.b.size(); i3++) {
                this.b.remove(i3);
                this.b.add(i3, list.remove(0));
                i2++;
            }
            if (z) {
                i++;
            }
            b(i, i2);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c873899ed687d07ab176b3b872816d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c873899ed687d07ab176b3b872816d53");
            return;
        }
        int size = this.b.size();
        if (i <= 0 || i2 <= 0 || size <= i) {
            return;
        }
        while (this.b.size() > i) {
            this.b.remove(this.b.size() - 1);
        }
        d(i, i2);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98e815ee3aa30e99770ae742e3a0af7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98e815ee3aa30e99770ae742e3a0af7")).intValue() : this.b.size();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a057e2e258953a0a0df5732375b552", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a057e2e258953a0a0df5732375b552")).intValue();
        }
        com.sankuai.waimai.store.poilist.mach.f fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (fVar == null || fVar.a == 0 || !"quick_filter".equals(((BaseModuleDesc) fVar.a).nativeId)) {
            return (fVar == null || fVar.a == 0 || !"feed_empty_placeholder".equals(((BaseModuleDesc) fVar.a).nativeId)) ? 1 : 2;
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c944a70dd83547e193573e4a1a1422", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c944a70dd83547e193573e4a1a1422");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        if (i == 0) {
            frameLayout.setLayoutParams(marginLayoutParams);
            return new n(frameLayout, this.g, this.d);
        } else if (i == 2) {
            LinearLayout linearLayout = new LinearLayout(this.c);
            linearLayout.setGravity(1);
            linearLayout.setOrientation(1);
            frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(this.c);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            linearLayout.addView(imageView, layoutParams);
            TextView textView = new TextView(this.c);
            textView.setTextColor(-14539738);
            textView.setTextSize(2, 12.0f);
            textView.setText("抱歉，附近暂无可配送的商家");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            layoutParams2.topMargin = com.sankuai.shangou.stone.util.h.a(this.c, 6.0f);
            linearLayout.addView(textView, layoutParams2);
            com.sankuai.waimai.store.util.m.d("https://p0.meituan.net/travelcube/cc4ba3f7f7e6311295db093bd577088930687.png", com.sankuai.shangou.stone.util.h.a(this.c, 88.0f)).a(imageView);
            marginLayoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(this.c, 8.0f);
            frameLayout.setLayoutParams(marginLayoutParams);
            return new com.sankuai.waimai.store.drug.home.newp.poilist.viewholders.a(frameLayout) { // from class: com.sankuai.waimai.store.drug.home.new_home.b.1
            };
        } else {
            marginLayoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(this.c, 8.0f);
            frameLayout.setLayoutParams(marginLayoutParams);
            return new l(frameLayout, this.h, this.i, this.c);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(com.sankuai.waimai.store.widgets.recycler.e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242836fd05bdb51dac1dd0e075acee1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242836fd05bdb51dac1dd0e075acee1c");
            return;
        }
        final com.sankuai.waimai.store.poilist.mach.f fVar = (com.sankuai.waimai.store.poilist.mach.f) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (fVar == null) {
            return;
        }
        if (eVar instanceof n) {
            if (fVar.a == 0 || !"quick_filter".equals(((BaseModuleDesc) fVar.a).nativeId)) {
                return;
            }
            n nVar = (n) eVar;
            Object[] objArr2 = {fVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = n.a;
            if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "7ccd49517ba6f59804e79678b98f383d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "7ccd49517ba6f59804e79678b98f383d");
            } else if (!(fVar.c instanceof List) || fVar.a == 0 || ((BaseModuleDesc) fVar.a).categoryInfo == null) {
            } else {
                com.sankuai.waimai.store.drug.home.new_home.filter.c cVar = nVar.b;
                List list = (List) fVar.c;
                CategoryInfo categoryInfo = ((BaseModuleDesc) fVar.a).categoryInfo;
                Object[] objArr3 = {list, categoryInfo};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.home.new_home.filter.c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "785b97e21a384f9a0717d016a57e7304", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "785b97e21a384f9a0717d016a57e7304");
                    return;
                }
                if (cVar.c != categoryInfo) {
                    cVar.d = -1L;
                }
                cVar.c = categoryInfo;
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                    cVar.b.b_(list);
                    cVar.b.notifyDataSetChanged();
                    return;
                }
                cVar.getView().setVisibility(8);
            }
        } else if (eVar instanceof l) {
            com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(eVar.itemView, String.valueOf(System.identityHashCode(fVar))) { // from class: com.sankuai.waimai.store.drug.home.new_home.b.2
                @Override // com.sankuai.waimai.store.expose.v2.entity.b
                public final String a() {
                    return "recycle_feed_item_expose_check_group";
                }
            };
            aVar.a(new c.a() { // from class: com.sankuai.waimai.store.drug.home.new_home.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fb000f549549fc1a755717c794c5f96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fb000f549549fc1a755717c794c5f96");
                    } else if (fVar.b != null && fVar.b.l() != null && fVar.b.l().getRootNode() != null) {
                        com.sankuai.waimai.mach.node.a rootNode = fVar.b.l().getRootNode();
                        Mach l = fVar.b.l();
                        ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                        b.this.a(rootNode, arrayList);
                        for (com.sankuai.waimai.mach.node.a aVar2 : arrayList) {
                            if (aVar2 != null) {
                                b.a(b.this, l, aVar2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        b.this.b(rootNode, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            b.a(b.this, l, arrayList2);
                        }
                        com.sankuai.waimai.store.expose.v2.b.a().a(b.this.c, "recycle_feed_item_expose_check_group");
                    }
                }
            });
            com.sankuai.waimai.store.expose.v2.b.a().a(this.c, aVar);
            final l lVar = (l) eVar;
            Object[] objArr4 = {fVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = l.a;
            if (PatchProxy.isSupport(objArr4, lVar, changeQuickRedirect4, false, "269a3ad3bdc4f94130685eee656285f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, lVar, changeQuickRedirect4, false, "269a3ad3bdc4f94130685eee656285f6");
                return;
            }
            final BaseModuleDesc baseModuleDesc = (BaseModuleDesc) fVar.a;
            Object[] objArr5 = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect5 = l.a;
            if (PatchProxy.isSupport(objArr5, lVar, changeQuickRedirect5, false, "646aee77adca629a130fda3dd4402b49", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, lVar, changeQuickRedirect5, false, "646aee77adca629a130fda3dd4402b49");
            } else if (baseModuleDesc != null && baseModuleDesc.layoutInfo != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lVar.itemView.getLayoutParams();
                marginLayoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(lVar.itemView.getContext(), baseModuleDesc.layoutInfo.a);
                marginLayoutParams.bottomMargin = com.sankuai.shangou.stone.util.h.a(lVar.itemView.getContext(), baseModuleDesc.layoutInfo.b);
                lVar.itemView.setLayoutParams(marginLayoutParams);
                if (i == 0) {
                    ((PageEventHandler) q.a((FragmentActivity) lVar.e).a(PageEventHandler.class)).a(lVar.e, com.sankuai.waimai.store.drug.home.refactor.card.background.a.class, new android.arch.lifecycle.l<com.sankuai.waimai.store.drug.home.refactor.card.background.a>() { // from class: com.sankuai.waimai.store.drug.home.new_home.l.1
                        public static ChangeQuickRedirect a;

                        @Override // android.arch.lifecycle.l
                        public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.refactor.card.background.a aVar2) {
                            com.sankuai.waimai.store.drug.home.refactor.card.background.a aVar3 = aVar2;
                            Object[] objArr6 = {aVar3};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b45deb915918574ed6337e1d301e21ea", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b45deb915918574ed6337e1d301e21ea");
                            } else if (aVar3 == null || baseModuleDesc.index != 0) {
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) lVar.itemView.getLayoutParams();
                                marginLayoutParams2.topMargin = com.sankuai.shangou.stone.util.h.a(lVar.itemView.getContext(), 0.0f);
                                lVar.itemView.setLayoutParams(marginLayoutParams2);
                            }
                        }
                    });
                }
            }
            com.sankuai.waimai.mach.recycler.c cVar2 = fVar.b;
            if (cVar2 != null) {
                if (l.b) {
                    Object[] objArr6 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = l.a;
                    if (PatchProxy.isSupport(objArr6, lVar, changeQuickRedirect6, false, "beb027e406effd2283e657073fe56c92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, lVar, changeQuickRedirect6, false, "beb027e406effd2283e657073fe56c92");
                        return;
                    }
                    com.sankuai.waimai.mach.recycler.b b = lVar.c.b();
                    b.a(cVar2);
                    b.a((FrameLayout) lVar.itemView, cVar2, b.a(cVar2.a()));
                    lVar.d = cVar2;
                    lVar.a();
                    return;
                }
                Object[] objArr7 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect7 = l.a;
                if (PatchProxy.isSupport(objArr7, lVar, changeQuickRedirect7, false, "5a033c80b686743582cbcf7ea3fe9c12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, lVar, changeQuickRedirect7, false, "5a033c80b686743582cbcf7ea3fe9c12");
                    return;
                }
                com.sankuai.waimai.mach.recycler.b b2 = lVar.c.b();
                ((FrameLayout) lVar.itemView).removeAllViews();
                if (cVar2.l() != null) {
                    cVar2.l().cleanContainerView();
                }
                b2.a((FrameLayout) lVar.itemView, cVar2, (com.sankuai.waimai.mach.recycler.c) null);
                lVar.d = cVar2;
                lVar.a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(@NonNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c825cac7e72ce0914fc5257bf385844c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c825cac7e72ce0914fc5257bf385844c");
        } else if (eVar instanceof l) {
            l lVar = (l) eVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = l.a;
            if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "ce85feb7c8a8678f0c64becf5ea500c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "ce85feb7c8a8678f0c64becf5ea500c6");
            } else if (!l.b || lVar.c.b() == null) {
            } else {
                lVar.c.b().b(lVar.d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull com.sankuai.waimai.mach.node.a aVar, @NonNull List<com.sankuai.waimai.mach.node.a> list) {
        boolean z;
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907b21be103666d52d32bcb98b097ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907b21be103666d52d32bcb98b097ec8");
            return;
        }
        if (!com.sankuai.waimai.store.mach.a.b(aVar)) {
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b9fc843ad0d7a354463287e71cdb924", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b9fc843ad0d7a354463287e71cdb924")).booleanValue();
            } else {
                z = aVar.k() || aVar.l() || aVar.m() || aVar.n();
            }
            if (z) {
                list.add(aVar);
            }
        }
        List<com.sankuai.waimai.mach.node.a> b = aVar.b();
        if (com.sankuai.waimai.store.mach.a.b(aVar) || com.sankuai.shangou.stone.util.a.b(b)) {
            return;
        }
        for (int i = 0; i < b.size(); i++) {
            com.sankuai.waimai.mach.node.a aVar2 = b.get(i);
            if (aVar2 != null && !com.sankuai.waimai.store.mach.a.b(aVar2)) {
                a(aVar2, list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.sankuai.waimai.mach.node.a aVar, @NonNull List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd0e932ee54f8d4f07405a8eac1b870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd0e932ee54f8d4f07405a8eac1b870");
        } else if (aVar != null) {
            c(aVar, list);
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(b)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                if (aVar2 != null) {
                    c(aVar2, list);
                }
                b(aVar2, list);
            }
        }
    }

    private void c(@NonNull com.sankuai.waimai.mach.node.a aVar, @NonNull List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88ce25c2bc401d8960a295eb2c34cf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88ce25c2bc401d8960a295eb2c34cf6");
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            list.add(aVar);
        }
    }
}
