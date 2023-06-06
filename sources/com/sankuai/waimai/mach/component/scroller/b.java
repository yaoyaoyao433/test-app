package com.sankuai.waimai.mach.component.scroller;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.scroller.ScrollerContainer;
import com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager;
import com.sankuai.waimai.mach.parser.d;
import com.sankuai.waimai.mach.utils.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends com.sankuai.waimai.mach.component.a<ScrollerContainer> implements com.sankuai.waimai.mach.component.b {
    public static ChangeQuickRedirect a;
    private c c;
    private ScrollerContainer d;
    private int e;
    private ScrollerContainer.a f;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c58daccfc3d86bcbfe6349d8dbdda5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c58daccfc3d86bcbfe6349d8dbdda5");
            return;
        }
        this.c = new c();
        this.f = new ScrollerContainer.a() { // from class: com.sankuai.waimai.mach.component.scroller.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.scroller.ScrollerContainer.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0663b59d64da3cbd16fe65caef38783b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0663b59d64da3cbd16fe65caef38783b");
                } else {
                    b.this.e = i;
                }
            }
        };
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    /* renamed from: a */
    public ScrollerContainer b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc4ac5772a098a28120090ff6a89d4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScrollerContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc4ac5772a098a28120090ff6a89d4c");
        }
        this.d = new ScrollerContainer(context);
        this.d.setScrollCallback(this.f);
        return this.d;
    }

    @Override // com.sankuai.waimai.mach.component.a, com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3beed931ff850ae48e1ca2830058284e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3beed931ff850ae48e1ca2830058284e");
            return;
        }
        super.a();
        c cVar = this.c;
        cVar.c = "horizontal";
        cVar.e = false;
        cVar.g = 0;
        String a2 = TextUtils.isEmpty(a("direction")) ? "horizontal" : a("direction");
        String a3 = a("show-scrollbar");
        String a4 = a("always-bounce");
        String a5 = a("offset");
        String a6 = a(RemoteMessageConst.NOTIFICATION);
        d dVar = null;
        d dVar2 = (k() == null || !(k().get("@scroll-start") instanceof d)) ? null : (d) k().get("@scroll-start");
        d dVar3 = (k() == null || !(k().get("@scroll-end") instanceof d)) ? null : (d) k().get("@scroll-end");
        if (k() != null && (k().get("@display-cell") instanceof d)) {
            dVar = (d) k().get("@display-cell");
        }
        this.c.c = a2;
        this.c.e = g(a3);
        this.c.f = g(a4);
        this.c.g = (int) e(a5);
        this.c.d = a6;
        this.c.h = dVar2;
        this.c.i = dVar3;
        this.c.j = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.mach.component.a
    public void a(final ScrollerContainer scrollerContainer) {
        int r;
        final int i;
        int i2;
        final int i3;
        Object[] objArr = {scrollerContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b09b42c2a81ce3f398e64306fc456e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b09b42c2a81ce3f398e64306fc456e18");
            return;
        }
        super.a((b) scrollerContainer);
        this.c.a = this.m;
        this.d.setScrollCallback(this.f);
        if (g(a("keep-offset"))) {
            this.c.g = this.e;
        }
        c cVar = this.c;
        com.facebook.yoga.d ac_ = ac_();
        com.sankuai.waimai.mach.node.a aVar = this.n;
        Object[] objArr2 = {cVar, ac_, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = ScrollerContainer.c;
        if (PatchProxy.isSupport(objArr2, scrollerContainer, changeQuickRedirect2, false, "593e8f67575f5b599f34c3136e2f1652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, scrollerContainer, changeQuickRedirect2, false, "593e8f67575f5b599f34c3136e2f1652");
        } else if (!e.a(aVar) || cVar == null) {
        } else {
            scrollerContainer.b = aVar;
            scrollerContainer.a = cVar;
            scrollerContainer.g = ((c) scrollerContainer.a).h;
            scrollerContainer.h = ((c) scrollerContainer.a).i;
            scrollerContainer.i = ((c) scrollerContainer.a).j;
            scrollerContainer.j = ((c) scrollerContainer.a).d;
            int i4 = ((c) scrollerContainer.a).g;
            String str = ((c) scrollerContainer.a).c;
            boolean z = ((c) scrollerContainer.a).e;
            final ArrayList arrayList = new ArrayList(aVar.b());
            com.facebook.yoga.d dVar = aVar.b().get(0).c;
            com.facebook.yoga.d dVar2 = aVar.b().size() > 1 ? aVar.b().get(1).c : null;
            if ("horizontal".equals(str)) {
                r = (int) (dVar2 != null ? dVar2.q() - (dVar.q() + dVar.s()) : 0.0f);
                i3 = i4;
                i2 = 0;
                i = 0;
            } else {
                r = (int) (dVar2 != null ? dVar2.r() - (dVar.r() + dVar.t()) : 0.0f);
                i = i4;
                i2 = 1;
                i3 = 0;
            }
            ScrollerLayoutManager.a aVar2 = new ScrollerLayoutManager.a(scrollerContainer.getContext());
            aVar2.c = i2;
            scrollerContainer.e = new ScrollerLayoutManager(aVar2);
            scrollerContainer.e.setInitialPrefetchItemCount(10);
            scrollerContainer.d.setNestedScrollingEnabled(false);
            scrollerContainer.d.setParentHasSwiper(scrollerContainer.a(aVar));
            if (arrayList.size() >= 18 && "horizontal".equals(str)) {
                scrollerContainer.d.setItemViewCacheSize(0);
                scrollerContainer.d.getRecycledViewPool().a(0, 0);
            } else {
                scrollerContainer.d.setItemViewCacheSize(10);
            }
            scrollerContainer.e.b = new ScrollerLayoutManager.b() { // from class: com.sankuai.waimai.mach.component.scroller.ScrollerContainer.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void a(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e75342c37b3b38c1bf3afdf6305f674", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e75342c37b3b38c1bf3afdf6305f674");
                        return;
                    }
                    if (ScrollerContainer.this.l != i5 && ScrollerContainer.this.i != null && ScrollerContainer.this.a != null && ScrollerContainer.this.a.a != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(i5 + 1));
                        ScrollerContainer.this.a.a.asyncCallJSMethod(ScrollerContainer.this.i.b, linkedList);
                    }
                    ScrollerContainer.this.l = i5;
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void b(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cab2159ca88a7130f44440170fee5583", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cab2159ca88a7130f44440170fee5583");
                        return;
                    }
                    com.sankuai.waimai.mach.log.b.b("ScrollerContainer", "curr Scroll status = " + i5, new Object[0]);
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void c(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c800c9a248ffb049b1802284069bafc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c800c9a248ffb049b1802284069bafc");
                    } else if (ScrollerContainer.this.g == null || ScrollerContainer.this.a == null || ScrollerContainer.this.a.a == null) {
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(i5));
                        ScrollerContainer.this.a.a.asyncCallJSMethod(ScrollerContainer.this.g.b, linkedList);
                    }
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void d(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d1d0bebddc8ba3720aab8474b63d995c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d1d0bebddc8ba3720aab8474b63d995c");
                        return;
                    }
                    if (ScrollerContainer.this.n != null) {
                        ScrollerContainer.this.n.clear();
                        int findLastVisibleItemPosition = ScrollerContainer.this.e.findLastVisibleItemPosition();
                        for (int findFirstVisibleItemPosition = ScrollerContainer.this.e.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                            ScrollerContainer.this.n.add(Integer.valueOf(findFirstVisibleItemPosition));
                        }
                    }
                    if (ScrollerContainer.this.h != null && ScrollerContainer.this.a != null && ScrollerContainer.this.a.a != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(i5));
                        ScrollerContainer.this.a.a.asyncCallJSMethod(ScrollerContainer.this.h.b, linkedList);
                    }
                    if (ScrollerContainer.this.m != null) {
                        ScrollerContainer.this.m.a(i5);
                    }
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void e(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c6b218ee72872699d136b719a00ceed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c6b218ee72872699d136b719a00ceed");
                    } else if (ScrollerContainer.this.l == i5 || ScrollerContainer.this.a == null || TextUtils.isEmpty(((c) ScrollerContainer.this.a).d)) {
                    } else {
                        Intent intent = new Intent(((c) ScrollerContainer.this.a).d);
                        intent.putExtra(RemoteMessageConst.NOTIFICATION, (Serializable) arrayList.get(i5));
                        LocalBroadcastManager.getInstance(ScrollerContainer.this.getContext()).sendBroadcast(intent);
                    }
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fe985be8991b1dd099af1cc7440d0821", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fe985be8991b1dd099af1cc7440d0821");
                    } else if (ScrollerContainer.this.n != null) {
                        ScrollerContainer.this.n.clear();
                        int findLastVisibleItemPosition = ScrollerContainer.this.e.findLastVisibleItemPosition();
                        for (int findFirstVisibleItemPosition = ScrollerContainer.this.e.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                            ScrollerContainer.this.n.add(Integer.valueOf(findFirstVisibleItemPosition));
                        }
                    }
                }
            };
            if (scrollerContainer.f == null) {
                scrollerContainer.f = new com.sankuai.waimai.mach.component.scroller.recyclerview.a(arrayList, aVar.f.getRenderEngine());
                scrollerContainer.d.setAdapter(scrollerContainer.f);
            } else {
                com.sankuai.waimai.mach.component.scroller.recyclerview.a aVar3 = scrollerContainer.f;
                Object[] objArr3 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.component.scroller.recyclerview.a.a;
                if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "f45ba15d30a607173ee42bb5368613af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "f45ba15d30a607173ee42bb5368613af");
                } else {
                    aVar3.b = arrayList;
                    aVar3.notifyDataSetChanged();
                }
            }
            scrollerContainer.d.setLayoutManager(scrollerContainer.e);
            scrollerContainer.d.setOverScrollMode(2);
            scrollerContainer.d.a(z);
            scrollerContainer.d.addItemDecoration(new com.sankuai.waimai.mach.component.scroller.recyclerview.b(ac_, r));
            if (i3 != 0 || i != 0) {
                scrollerContainer.d.measure(View.MeasureSpec.makeMeasureSpec(aVar.s(), 1073741824), View.MeasureSpec.makeMeasureSpec(aVar.t(), 1073741824));
                scrollerContainer.d.layout(0, 0, aVar.s(), aVar.t());
                scrollerContainer.d.scrollBy(i3, i);
                return;
            }
            scrollerContainer.d.post(new Runnable() { // from class: com.sankuai.waimai.mach.component.scroller.ScrollerContainer.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ccf937468e47c309688ae16cff762cd5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ccf937468e47c309688ae16cff762cd5");
                    } else {
                        ScrollerContainer.this.d.scrollBy(i3, i);
                    }
                }
            });
        }
    }

    public final List<Integer> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538ab3386641de61d08ca756c08ac22a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538ab3386641de61d08ca756c08ac22a");
        }
        if (this.d != null) {
            return this.d.getDisplayList();
        }
        return null;
    }

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3ea7ef75616a917d03dd124ac879fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3ea7ef75616a917d03dd124ac879fe")).intValue();
        }
        ScrollerContainer scrollerContainer = (ScrollerContainer) this.o;
        if (scrollerContainer == null) {
            return 0;
        }
        return scrollerContainer.getItemCount();
    }
}
