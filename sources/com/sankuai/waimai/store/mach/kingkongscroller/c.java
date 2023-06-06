package com.sankuai.waimai.store.mach.kingkongscroller;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.mach.component.a<KingKongScrollerContainer> implements com.sankuai.waimai.mach.component.b {
    public static ChangeQuickRedirect a;
    private d c;
    private KingKongScrollerContainer d;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb26a2a5d33eb2093fc740109510b56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb26a2a5d33eb2093fc740109510b56");
        } else {
            this.c = new d();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36accc12b1a5cb8c01940151e52227b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (KingKongScrollerContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36accc12b1a5cb8c01940151e52227b1");
        }
        this.d = new KingKongScrollerContainer(context);
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
    @Override // com.sankuai.waimai.mach.component.a, com.sankuai.waimai.mach.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mach.kingkongscroller.c.a():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.mach.component.a
    public void a(final KingKongScrollerContainer kingKongScrollerContainer) {
        final int i;
        int r;
        int i2;
        final int i3;
        Object[] objArr = {kingKongScrollerContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28abf47d1939ffa29f53f59e26781925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28abf47d1939ffa29f53f59e26781925");
            return;
        }
        super.a((c) kingKongScrollerContainer);
        this.c.a = this.m;
        d dVar = this.c;
        com.facebook.yoga.d ac_ = ac_();
        com.sankuai.waimai.mach.node.a aVar = this.n;
        Object[] objArr2 = {dVar, ac_, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = KingKongScrollerContainer.a;
        if (PatchProxy.isSupport(objArr2, kingKongScrollerContainer, changeQuickRedirect2, false, "7c6065f055d0932d3eabecbd27c94b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, kingKongScrollerContainer, changeQuickRedirect2, false, "7c6065f055d0932d3eabecbd27c94b76");
        } else if (com.sankuai.waimai.mach.utils.e.a(aVar) && dVar != null) {
            kingKongScrollerContainer.j = aVar;
            kingKongScrollerContainer.i = dVar;
            d dVar2 = (d) kingKongScrollerContainer.i;
            kingKongScrollerContainer.e = dVar2.p;
            kingKongScrollerContainer.f = dVar2.q;
            kingKongScrollerContainer.g = dVar2.r;
            kingKongScrollerContainer.h = dVar2.d;
            int i4 = dVar2.g;
            String str = dVar2.c;
            boolean z = dVar2.e;
            final ArrayList arrayList = new ArrayList(aVar.b());
            com.facebook.yoga.d dVar3 = aVar.b().get(0).c;
            com.facebook.yoga.d dVar4 = aVar.b().size() > 1 ? aVar.b().get(1).c : null;
            if ("horizontal".equals(str)) {
                r = (int) (dVar4 != null ? dVar4.q() - (dVar3.q() + dVar3.s()) : 0.0f);
                i = 0;
                i3 = i4;
                i2 = 0;
            } else {
                i = i4;
                r = (int) (dVar4 != null ? dVar4.r() - (dVar3.r() + dVar3.t()) : 0.0f);
                i2 = 1;
                i3 = 0;
            }
            KingKongScrollerLayoutManager.a aVar2 = new KingKongScrollerLayoutManager.a(kingKongScrollerContainer.getContext());
            aVar2.c = i2;
            kingKongScrollerContainer.c = new KingKongScrollerLayoutManager(aVar2);
            kingKongScrollerContainer.c.setInitialPrefetchItemCount(10);
            kingKongScrollerContainer.b.setNestedScrollingEnabled(false);
            kingKongScrollerContainer.b.setParentHasSwiper(kingKongScrollerContainer.a(aVar));
            if (arrayList.size() >= 18 && "horizontal".equals(str)) {
                kingKongScrollerContainer.b.setItemViewCacheSize(0);
                kingKongScrollerContainer.b.getRecycledViewPool().a(0, 0);
            } else {
                kingKongScrollerContainer.b.setItemViewCacheSize(10);
            }
            kingKongScrollerContainer.c.b = new KingKongScrollerLayoutManager.b() { // from class: com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerContainer.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerLayoutManager.b
                public final void a(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d5da1960e61896a44067b46d06dfeb8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d5da1960e61896a44067b46d06dfeb8");
                        return;
                    }
                    if (KingKongScrollerContainer.this.m != i5 && KingKongScrollerContainer.this.g != null && KingKongScrollerContainer.this.i != null && KingKongScrollerContainer.this.i.a != null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(i5 + 1));
                        KingKongScrollerContainer.this.i.a.asyncCallJSMethod(KingKongScrollerContainer.this.g.b, linkedList);
                    }
                    KingKongScrollerContainer.this.m = i5;
                }

                @Override // com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerLayoutManager.b
                public final void b(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b5914eb8fa10bc23c3dd41aa3598817", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b5914eb8fa10bc23c3dd41aa3598817");
                        return;
                    }
                    com.sankuai.waimai.mach.log.b.b("ScrollerContainer", "curr Scroll status = " + i5, new Object[0]);
                }

                @Override // com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerLayoutManager.b
                public final void c(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6573be42550ba98b0c5593f26684c4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6573be42550ba98b0c5593f26684c4a");
                    } else if (KingKongScrollerContainer.this.e == null || KingKongScrollerContainer.this.i == null || KingKongScrollerContainer.this.i.a == null) {
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(Integer.valueOf(i5));
                        KingKongScrollerContainer.this.i.a.asyncCallJSMethod(KingKongScrollerContainer.this.e.b, linkedList);
                    }
                }

                @Override // com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerLayoutManager.b
                public final void d(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b0e98217df085f908f8d10725d262cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b0e98217df085f908f8d10725d262cf");
                        return;
                    }
                    if (KingKongScrollerContainer.this.n != null) {
                        KingKongScrollerContainer.this.n.clear();
                        int findLastVisibleItemPosition = KingKongScrollerContainer.this.c.findLastVisibleItemPosition();
                        for (int findFirstVisibleItemPosition = KingKongScrollerContainer.this.c.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                            KingKongScrollerContainer.this.n.add(Integer.valueOf(findFirstVisibleItemPosition));
                        }
                    }
                    if (KingKongScrollerContainer.this.f == null || KingKongScrollerContainer.this.i == null || KingKongScrollerContainer.this.i.a == null) {
                        return;
                    }
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(Integer.valueOf(i5));
                    KingKongScrollerContainer.this.i.a.asyncCallJSMethod(KingKongScrollerContainer.this.f.b, linkedList);
                }

                @Override // com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerLayoutManager.b
                public final void e(int i5) {
                    Object[] objArr3 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a4ae20942e63ae14ffdca7c8f229d91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a4ae20942e63ae14ffdca7c8f229d91");
                    } else if (KingKongScrollerContainer.this.m == i5 || KingKongScrollerContainer.this.i == null || TextUtils.isEmpty(((d) KingKongScrollerContainer.this.i).d)) {
                    } else {
                        Intent intent = new Intent(((d) KingKongScrollerContainer.this.i).d);
                        intent.putExtra(RemoteMessageConst.NOTIFICATION, (Serializable) arrayList.get(i5));
                        LocalBroadcastManager.getInstance(KingKongScrollerContainer.this.getContext()).sendBroadcast(intent);
                    }
                }

                @Override // com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerLayoutManager.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b997adecd7ab734b93aa90919717f97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b997adecd7ab734b93aa90919717f97");
                    } else if (KingKongScrollerContainer.this.n != null) {
                        KingKongScrollerContainer.this.n.clear();
                        int findLastVisibleItemPosition = KingKongScrollerContainer.this.c.findLastVisibleItemPosition();
                        for (int findFirstVisibleItemPosition = KingKongScrollerContainer.this.c.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                            KingKongScrollerContainer.this.n.add(Integer.valueOf(findFirstVisibleItemPosition));
                        }
                    }
                }
            };
            if (kingKongScrollerContainer.d == null) {
                kingKongScrollerContainer.d = new b(arrayList, aVar.f.getRenderEngine());
                kingKongScrollerContainer.b.setAdapter(kingKongScrollerContainer.d);
            } else {
                b bVar = kingKongScrollerContainer.d;
                Object[] objArr3 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "2353b0f36be719ed39008a66a4a61e37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "2353b0f36be719ed39008a66a4a61e37");
                } else {
                    bVar.b = arrayList;
                    bVar.notifyDataSetChanged();
                }
            }
            kingKongScrollerContainer.b.setLayoutManager(kingKongScrollerContainer.c);
            kingKongScrollerContainer.b.setOverScrollMode(2);
            kingKongScrollerContainer.b.a(z);
            kingKongScrollerContainer.b.addItemDecoration(new e(ac_, r));
            if (i3 != 0 || i != 0) {
                kingKongScrollerContainer.b.measure(View.MeasureSpec.makeMeasureSpec(aVar.s(), 1073741824), View.MeasureSpec.makeMeasureSpec(aVar.t(), 1073741824));
                kingKongScrollerContainer.b.layout(0, 0, aVar.s(), aVar.t());
                kingKongScrollerContainer.b.scrollBy(i3, i);
            } else {
                kingKongScrollerContainer.b.post(new Runnable() { // from class: com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerContainer.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b32a58a811094e71d881dd719c5fb14f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b32a58a811094e71d881dd719c5fb14f");
                        } else {
                            KingKongScrollerContainer.this.b.scrollBy(i3, i);
                        }
                    }
                });
            }
        }
        kingKongScrollerContainer.setKingKongScrollBar(this.c);
    }

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c8bf00a3e467f71f182709ed53ea2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c8bf00a3e467f71f182709ed53ea2a")).intValue();
        }
        KingKongScrollerContainer kingKongScrollerContainer = (KingKongScrollerContainer) this.o;
        if (kingKongScrollerContainer == null) {
            return 0;
        }
        return kingKongScrollerContainer.getItemCount();
    }
}
