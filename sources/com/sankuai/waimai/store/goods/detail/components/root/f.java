package com.sankuai.waimai.store.goods.detail.components.root;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.detail.components.root.a;
import com.sankuai.waimai.store.goods.detail.components.root.c;
import com.sankuai.waimai.store.goods.detail.components.subroot.mach.d;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.goods.detail.components.root.a {
    public static ChangeQuickRedirect g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public f() {
    }

    public f(Context context, boolean z, Float f, com.sankuai.waimai.mach.recycler.b bVar) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), f, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0ec96fd94cf53676be352d649b9002", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0ec96fd94cf53676be352d649b9002");
        } else {
            a(context, z, f, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.a
    public final void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull GoodsDetailResponse goodsDetailResponse, GoodsSku goodsSku, @NonNull a.InterfaceC1173a interfaceC1173a, @NonNull com.sankuai.waimai.store.expose.v2.a aVar2, String str) {
        c a2;
        c a3;
        com.sankuai.waimai.store.platform.domain.manager.poi.a aVar3 = aVar;
        char c = 0;
        Object[] objArr = {aVar3, goodsDetailResponse, goodsSku, interfaceC1173a, aVar2, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        int i = 5;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187963b525463927a5d0910f4c1bb30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187963b525463927a5d0910f4c1bb30f");
            return;
        }
        this.d = aVar3;
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsDetailResponse.bannerBlock)) {
            Iterator<BaseTile<BaseModuleDesc, HashMap<String, Object>>> it = goodsDetailResponse.bannerBlock.iterator();
            while (it.hasNext()) {
                BaseTile<BaseModuleDesc, HashMap<String, Object>> next = it.next();
                if (next != null) {
                    Object[] objArr2 = new Object[i];
                    objArr2[c] = arrayList;
                    objArr2[1] = next;
                    objArr2[2] = goodsDetailResponse;
                    objArr2[3] = goodsSku;
                    objArr2[4] = aVar3;
                    ChangeQuickRedirect changeQuickRedirect2 = g;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09434abbf0e3915485b7511bcd3d3339", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09434abbf0e3915485b7511bcd3d3339");
                    } else {
                        String str2 = next.sType;
                        if ("3".equals(next.applyType)) {
                            if ((!"sm_type_goods_detail_poi_entrance".equals(str2) || this.e) && (a3 = a(aVar, str2, goodsDetailResponse, next, goodsSku, this.f)) != null) {
                                arrayList.add(a3);
                            }
                        } else if ("2".equals(next.applyType)) {
                            Object[] objArr3 = {str2, arrayList, goodsDetailResponse, goodsSku, aVar3, next};
                            ChangeQuickRedirect changeQuickRedirect3 = g;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e524eb4b7e3776b913b685417d4678df", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e524eb4b7e3776b913b685417d4678df");
                            } else {
                                char c2 = 65535;
                                if (str2.hashCode() == -1256421160 && str2.equals("sm_type_goods_detail_head_photo")) {
                                    c2 = 0;
                                }
                                if (c2 == 0 && (a2 = a(goodsDetailResponse, str2, goodsSku, next)) != null) {
                                    arrayList.add(a2);
                                }
                            }
                            aVar3 = aVar;
                        }
                        aVar3 = aVar;
                    }
                    c = 0;
                    i = 5;
                } else {
                    aVar3 = aVar;
                }
            }
        }
        al.a(new AnonymousClass1(new b(null), aVar2, str, arrayList.iterator(), arrayList, interfaceC1173a), str);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.detail.components.root.f$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 extends al.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ b b;
        public final /* synthetic */ com.sankuai.waimai.store.expose.v2.a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Iterator e;
        public final /* synthetic */ List f;
        public final /* synthetic */ a.InterfaceC1173a g;

        public AnonymousClass1(b bVar, com.sankuai.waimai.store.expose.v2.a aVar, String str, Iterator it, List list, a.InterfaceC1173a interfaceC1173a) {
            this.b = bVar;
            this.c = aVar;
            this.d = str;
            this.e = it;
            this.f = list;
            this.g = interfaceC1173a;
        }

        @Override // com.sankuai.waimai.store.util.al.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b2847f3fd5ef7627a098373e144fb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b2847f3fd5ef7627a098373e144fb6");
            } else {
                this.b.a(this.c, this.d, this.e, new a() { // from class: com.sankuai.waimai.store.goods.detail.components.root.f.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.goods.detail.components.root.f.a
                    public final void a() {
                        boolean z;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57b2e9eb191644c2828c1537b1ae10ca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57b2e9eb191644c2828c1537b1ae10ca");
                            return;
                        }
                        f fVar = f.this;
                        List list = AnonymousClass1.this.f;
                        Object[] objArr3 = {list};
                        ChangeQuickRedirect changeQuickRedirect3 = f.g;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "8014b647e0237f3d75538a270c001147", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "8014b647e0237f3d75538a270c001147");
                        } else {
                            for (int size = list.size() - 1; size >= 0; size--) {
                                c cVar = (c) com.sankuai.shangou.stone.util.a.a((List<Object>) list, size);
                                if (cVar instanceof c.a) {
                                    c.a aVar = (c.a) cVar;
                                    if (aVar.g != null) {
                                        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar = aVar.g;
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.a;
                                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "a163fedd89df81852cff10ce26a8a69e", RobustBitConfig.DEFAULT_VALUE)) {
                                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "a163fedd89df81852cff10ce26a8a69e")).booleanValue();
                                        } else {
                                            z = dVar.a() != null;
                                        }
                                        if (z) {
                                        }
                                    }
                                    list.remove(size);
                                }
                            }
                        }
                        al.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.detail.components.root.f.1.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4363ae0e53469d63374c44b4849092f9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4363ae0e53469d63374c44b4849092f9");
                                } else {
                                    AnonymousClass1.this.g.a(AnonymousClass1.this.f);
                                }
                            }
                        }, AnonymousClass1.this.d);
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b {
        public static ChangeQuickRedirect a;

        public b() {
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        public final void a(final com.sankuai.waimai.store.expose.v2.a aVar, final String str, @NonNull final Iterator<c> it, @NonNull final a aVar2) {
            while (true) {
                Object[] objArr = {aVar, str, it, aVar2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b6eeeee0f3ff321ecf5955426d81d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b6eeeee0f3ff321ecf5955426d81d2");
                    return;
                } else if (!it.hasNext()) {
                    aVar2.a();
                    return;
                } else {
                    c next = it.next();
                    if (next instanceof c.a) {
                        c.a aVar3 = (c.a) next;
                        if (aVar3.g != null) {
                            try {
                                aVar3.g.a(aVar, str, new d.a() { // from class: com.sankuai.waimai.store.goods.detail.components.root.f.b.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.a
                                    public final void a() {
                                        Object[] objArr2 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2521af65e9ca8f7362ae91baeaac67fc", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2521af65e9ca8f7362ae91baeaac67fc");
                                        } else {
                                            b.this.a(aVar, str, it, aVar2);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.a
                                    public final void b() {
                                        Object[] objArr2 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49b97b7a8b5c5ae8619b205f892ff7e9", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49b97b7a8b5c5ae8619b205f892ff7e9");
                                        } else {
                                            b.this.a(aVar, str, it, aVar2);
                                        }
                                    }
                                });
                                return;
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
