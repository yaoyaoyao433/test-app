package com.sankuai.waimai.store.drug.search.mach.component.nestscroller;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.mach.component.a<NestedScrollerContainer> implements com.sankuai.waimai.mach.component.b {
    public static ChangeQuickRedirect a;
    private d c;
    private NestedScrollerContainer d;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f216cf1bde7763d7a20ac0460086f9f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f216cf1bde7763d7a20ac0460086f9f5");
        } else {
            this.c = new d();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e121fb4db8cb6c56b35f5a8c8e629e74", RobustBitConfig.DEFAULT_VALUE)) {
            return (NestedScrollerContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e121fb4db8cb6c56b35f5a8c8e629e74");
        }
        this.d = new NestedScrollerContainer(context);
        return this.d;
    }

    @Override // com.sankuai.waimai.mach.component.a, com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f1ba21c198d0d79b24c7646cd26d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f1ba21c198d0d79b24c7646cd26d3f");
            return;
        }
        super.a();
        d dVar = this.c;
        dVar.c = "horizontal";
        dVar.e = false;
        dVar.g = 0;
        String a2 = TextUtils.isEmpty(a("direction")) ? "horizontal" : a("direction");
        String a3 = a("show-scrollbar");
        String a4 = a("always-bounce");
        String a5 = a("offset");
        String a6 = a(RemoteMessageConst.NOTIFICATION);
        String a7 = a("@scroll-start");
        String a8 = a("@scroll-end");
        String a9 = a("@display-cell");
        this.c.c = a2;
        this.c.e = g(a3);
        this.c.f = g(a4);
        this.c.g = (int) e(a5);
        this.c.d = a6;
        this.c.h = a7;
        d dVar2 = this.c;
        Object[] objArr2 = {a8};
        ChangeQuickRedirect changeQuickRedirect2 = d.b;
        if (PatchProxy.isSupport(objArr2, dVar2, changeQuickRedirect2, false, "f4c78f7cb10bd4616f9f0aa57622c2e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar2, changeQuickRedirect2, false, "f4c78f7cb10bd4616f9f0aa57622c2e5");
        } else if (!TextUtils.isEmpty(a8)) {
            int indexOf = a8.indexOf(CommonConstant.Symbol.BRACKET_LEFT);
            int lastIndexOf = a8.lastIndexOf(CommonConstant.Symbol.BRACKET_RIGHT);
            if (indexOf != -1 && lastIndexOf != -1) {
                String[] split = a8.substring(indexOf + 1, lastIndexOf).split(CommonConstant.Symbol.COMMA);
                if (split.length == 1 && TextUtils.isEmpty(split[0])) {
                    dVar2.i = a8.substring(0, indexOf);
                }
            } else {
                dVar2.i = a8;
            }
        }
        this.c.j = a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.mach.component.a
    public void a(final NestedScrollerContainer nestedScrollerContainer) {
        final int i;
        int i2;
        int i3;
        final int i4;
        Object[] objArr = {nestedScrollerContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d73826ef29f19bb1ba941a15401359a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d73826ef29f19bb1ba941a15401359a");
            return;
        }
        super.a((c) nestedScrollerContainer);
        this.c.a = this.m;
        d dVar = this.c;
        com.facebook.yoga.d ac_ = ac_();
        com.sankuai.waimai.mach.node.a<V> aVar = this.n;
        Object[] objArr2 = {dVar, ac_, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = NestedScrollerContainer.c;
        if (PatchProxy.isSupport(objArr2, nestedScrollerContainer, changeQuickRedirect2, false, "a4772718e289f8c8a973b3cb9e3da879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nestedScrollerContainer, changeQuickRedirect2, false, "a4772718e289f8c8a973b3cb9e3da879");
        } else if (!com.sankuai.waimai.mach.utils.e.a(aVar) || dVar == null) {
        } else {
            nestedScrollerContainer.b = aVar;
            nestedScrollerContainer.a = dVar;
            nestedScrollerContainer.g = dVar.h;
            nestedScrollerContainer.h = dVar.i;
            nestedScrollerContainer.i = dVar.j;
            nestedScrollerContainer.j = dVar.d;
            int i5 = dVar.g;
            String str = dVar.c;
            boolean z = dVar.e;
            final ArrayList arrayList = new ArrayList(aVar.b());
            com.facebook.yoga.d dVar2 = aVar.b().get(0).c;
            com.facebook.yoga.d dVar3 = aVar.b().size() > 1 ? aVar.b().get(1).c : null;
            if ("horizontal".equals(str)) {
                i2 = (int) (dVar3 != null ? dVar3.q() - (dVar2.q() + dVar2.s()) : 0.0f);
                i = 0;
                i4 = i5;
                i3 = 0;
            } else {
                float r = dVar3 != null ? dVar3.r() - (dVar2.r() + dVar2.t()) : 0.0f;
                i = i5;
                i2 = (int) r;
                i3 = 1;
                i4 = 0;
            }
            ScrollerLayoutManager.a aVar2 = new ScrollerLayoutManager.a(nestedScrollerContainer.getContext());
            aVar2.c = i3;
            nestedScrollerContainer.e = new ScrollerLayoutManager(aVar2);
            nestedScrollerContainer.e.setInitialPrefetchItemCount(10);
            nestedScrollerContainer.d.setNestedScrollingEnabled(true);
            if (arrayList.size() >= 18 && "horizontal".equals(str)) {
                nestedScrollerContainer.d.setItemViewCacheSize(0);
                nestedScrollerContainer.d.getRecycledViewPool().a(0, 0);
            } else {
                nestedScrollerContainer.d.setItemViewCacheSize(10);
            }
            nestedScrollerContainer.e.b = new ScrollerLayoutManager.b() { // from class: com.sankuai.waimai.store.drug.search.mach.component.nestscroller.NestedScrollerContainer.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void a(int i6) {
                    Object[] objArr3 = {Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85af544f846f2d4af9a1482fd5c50394", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85af544f846f2d4af9a1482fd5c50394");
                        return;
                    }
                    if (NestedScrollerContainer.this.l != i6 && NestedScrollerContainer.this.a != null && NestedScrollerContainer.this.a.a != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(i6 + 1));
                        NestedScrollerContainer.this.a.a.asyncCallJSMethod(NestedScrollerContainer.this.i, linkedList);
                    }
                    NestedScrollerContainer.this.l = i6;
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void b(int i6) {
                    Object[] objArr3 = {Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cabdeca34a1bda90879b55fcd57ad27a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cabdeca34a1bda90879b55fcd57ad27a");
                        return;
                    }
                    com.sankuai.shangou.stone.util.log.a.a("NestedScrollerContainer", "curr Scroll status = " + i6, new Object[0]);
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void c(int i6) {
                    Object[] objArr3 = {Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "acaa454b01791619e4e7da8949fb8a72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "acaa454b01791619e4e7da8949fb8a72");
                    } else if (NestedScrollerContainer.this.a == null || NestedScrollerContainer.this.a.a == null) {
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(i6));
                        NestedScrollerContainer.this.a.a.asyncCallJSMethod(NestedScrollerContainer.this.g, linkedList);
                    }
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void d(int i6) {
                    Object[] objArr3 = {Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6bd4b52eb1e57901c73e02577e0ae5e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6bd4b52eb1e57901c73e02577e0ae5e0");
                        return;
                    }
                    if (NestedScrollerContainer.this.m != null) {
                        NestedScrollerContainer.this.m.clear();
                        int findLastVisibleItemPosition = NestedScrollerContainer.this.e.findLastVisibleItemPosition();
                        for (int findFirstVisibleItemPosition = NestedScrollerContainer.this.e.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                            NestedScrollerContainer.this.m.add(Integer.valueOf(findFirstVisibleItemPosition));
                        }
                    }
                    if (NestedScrollerContainer.this.a == null || NestedScrollerContainer.this.a.a == null) {
                        return;
                    }
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(Integer.valueOf(i6));
                    NestedScrollerContainer.this.a.a.asyncCallJSMethod(NestedScrollerContainer.this.h, linkedList);
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void e(int i6) {
                    Object[] objArr3 = {Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6aa01e511d63a80a9dd64a5bc98d58fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6aa01e511d63a80a9dd64a5bc98d58fd");
                    } else if (NestedScrollerContainer.this.l == i6 || NestedScrollerContainer.this.a == null || TextUtils.isEmpty(((d) NestedScrollerContainer.this.a).d)) {
                    } else {
                        Intent intent = new Intent(((d) NestedScrollerContainer.this.a).d);
                        intent.putExtra(RemoteMessageConst.NOTIFICATION, (Serializable) arrayList.get(i6));
                        LocalBroadcastManager.getInstance(NestedScrollerContainer.this.getContext()).sendBroadcast(intent);
                    }
                }

                @Override // com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c1bc18ac5248416d4b3e0248e5dcc8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c1bc18ac5248416d4b3e0248e5dcc8d");
                    } else if (NestedScrollerContainer.this.m != null) {
                        NestedScrollerContainer.this.m.clear();
                        int findLastVisibleItemPosition = NestedScrollerContainer.this.e.findLastVisibleItemPosition();
                        for (int findFirstVisibleItemPosition = NestedScrollerContainer.this.e.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                            NestedScrollerContainer.this.m.add(Integer.valueOf(findFirstVisibleItemPosition));
                        }
                    }
                }
            };
            nestedScrollerContainer.f = new b(arrayList, aVar.f.getRenderEngine());
            b bVar = nestedScrollerContainer.f;
            Object[] objArr3 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "d0ffd279fc5c1c276301eec19882fe4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "d0ffd279fc5c1c276301eec19882fe4c");
            } else {
                bVar.b = arrayList;
                bVar.notifyDataSetChanged();
            }
            nestedScrollerContainer.d.setAdapter(nestedScrollerContainer.f);
            nestedScrollerContainer.d.setLayoutManager(nestedScrollerContainer.e);
            nestedScrollerContainer.d.setOverScrollMode(2);
            nestedScrollerContainer.d.a(z);
            nestedScrollerContainer.d.addItemDecoration(new com.sankuai.waimai.mach.component.scroller.recyclerview.b(ac_, i2));
            if (i4 != 0 || i != 0) {
                nestedScrollerContainer.d.measure(View.MeasureSpec.makeMeasureSpec(aVar.s(), 1073741824), View.MeasureSpec.makeMeasureSpec(aVar.t(), 1073741824));
                nestedScrollerContainer.d.layout(0, 0, aVar.s(), aVar.t());
                nestedScrollerContainer.d.scrollBy(i4, i);
                return;
            }
            nestedScrollerContainer.d.post(new Runnable() { // from class: com.sankuai.waimai.store.drug.search.mach.component.nestscroller.NestedScrollerContainer.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5ffdda872c1052c2a4e09e6a1c0e7c1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5ffdda872c1052c2a4e09e6a1c0e7c1b");
                    } else {
                        NestedScrollerContainer.this.d.scrollBy(i4, i);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea73ff0a6c35edb8ea8e9e14a8167186", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea73ff0a6c35edb8ea8e9e14a8167186")).intValue();
        }
        NestedScrollerContainer nestedScrollerContainer = (NestedScrollerContainer) this.o;
        if (nestedScrollerContainer == null) {
            return 0;
        }
        return nestedScrollerContainer.getItemCount();
    }
}
