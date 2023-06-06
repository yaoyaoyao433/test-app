package com.sankuai.waimai.store.drug.search.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.mach.swiper.a;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements a.InterfaceC1221a {
    public static ChangeQuickRedirect a;
    Context b;
    ViewGroup c;
    ViewGroup d;
    SearchShareData e;
    c f;
    com.sankuai.waimai.store.search.ui.result.b g;
    com.sankuai.waimai.store.drug.search.mach.eventHandler.a h;
    com.sankuai.waimai.store.drug.search.mach.eventHandler.b i;
    com.sankuai.waimai.store.drug.search.mach.eventHandler.c j;
    private d.b k;

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.mach.node.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "cb5eb7a2ee57905e556f72fd79505b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "cb5eb7a2ee57905e556f72fd79505b96");
        } else if (aVar.f != null) {
            com.sankuai.waimai.mach.node.a c = aVar.c();
            bVar.c(c);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7ff983622d1b0aabd98aabcad8886770", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7ff983622d1b0aabd98aabcad8886770");
            } else if (!com.sankuai.shangou.stone.util.a.b(bVar.k.d)) {
                int i2 = 0;
                while (i2 < bVar.k.d.size()) {
                    com.sankuai.waimai.mach.node.a aVar2 = bVar.k.d.get(i2);
                    if (aVar2 != null) {
                        if (i2 == 0) {
                            Object[] objArr3 = new Object[i];
                            objArr3[0] = aVar2;
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "83769c3188d7e435349519f77252852c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "83769c3188d7e435349519f77252852c");
                            } else {
                                if (com.sankuai.waimai.store.mach.a.a(aVar2)) {
                                    bVar.b(aVar2);
                                }
                                com.sankuai.waimai.mach.node.a aVar3 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar2.b(), 0);
                                if (aVar3 != null) {
                                    ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                                    com.sankuai.waimai.store.mach.a.a(aVar3, arrayList);
                                    if (!arrayList.isEmpty()) {
                                        for (com.sankuai.waimai.mach.node.a aVar4 : arrayList) {
                                            bVar.b(aVar4);
                                        }
                                    }
                                }
                            }
                        }
                        if ((aVar2.h instanceof com.sankuai.waimai.store.mach.swiper.a) && ((com.sankuai.waimai.store.mach.swiper.a) aVar2.h).d == null) {
                            ((com.sankuai.waimai.store.mach.swiper.a) aVar2.h).d = bVar;
                        }
                    }
                    i2++;
                    i = 1;
                }
            }
            if (!com.sankuai.shangou.stone.util.a.b(bVar.k.d)) {
                bVar.k.a();
                ArrayList arrayList2 = new ArrayList();
                com.sankuai.waimai.store.mach.a.b(c, arrayList2);
                bVar.a(arrayList2);
                return;
            }
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = aVar.f.searchNodeWithViewReport();
            if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar5 : searchNodeWithViewReport) {
                bVar.a(aVar5);
            }
        }
    }

    public b(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47cb26b9fd70abf4961cc058ace3a21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47cb26b9fd70abf4961cc058ace3a21");
            return;
        }
        this.k = new d.b();
        this.b = context;
        this.e = SearchShareData.a(this.b);
        this.g = bVar;
    }

    private void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7103d67e1ca76a7971fb9675793f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7103d67e1ca76a7971fb9675793f16");
        } else if (aVar != null) {
            c(aVar);
            if (!com.sankuai.shangou.stone.util.a.b(this.k.c)) {
                for (com.sankuai.waimai.mach.node.a aVar2 : this.k.c) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58a04c6e0d1a980f985b5e94d9951128", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58a04c6e0d1a980f985b5e94d9951128");
                    } else if (aVar2 != null && (aVar2.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
                        if (com.sankuai.waimai.store.mach.a.a(aVar2)) {
                            b(aVar2);
                        }
                        List<Integer> e = ((com.sankuai.waimai.mach.component.scroller.b) aVar2.h).e();
                        List<com.sankuai.waimai.mach.node.a> b = aVar2.b();
                        if (!com.sankuai.shangou.stone.util.a.b(e) && !com.sankuai.shangou.stone.util.a.b(b)) {
                            for (Integer num : e) {
                                com.sankuai.waimai.mach.node.a aVar3 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b, num.intValue());
                                if (aVar3 != null && aVar3.g() != null && !com.sankuai.waimai.store.mach.a.c(aVar3)) {
                                    ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                                    com.sankuai.waimai.store.mach.a.a(aVar3, arrayList);
                                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                        for (com.sankuai.waimai.mach.node.a aVar4 : arrayList) {
                                            b(aVar4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.k.a();
                ArrayList<com.sankuai.waimai.mach.node.a> arrayList2 = new ArrayList();
                com.sankuai.waimai.store.mach.a.b(aVar, arrayList2);
                if (com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                    return;
                }
                for (com.sankuai.waimai.mach.node.a aVar5 : arrayList2) {
                    if (aVar5 != null) {
                        b(aVar5);
                    }
                }
                return;
            }
            this.k.a();
            b(aVar);
        }
    }

    private void a(List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbcc56f47456106bf0b8acb688324074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbcc56f47456106bf0b8acb688324074");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (com.sankuai.waimai.mach.node.a aVar : list) {
                if (aVar != null) {
                    b(aVar);
                }
            }
        }
    }

    private void b(final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e00b00dc7a909fe490b182868cb709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e00b00dc7a909fe490b182868cb709");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            String str = null;
            if (aVar.h() != null && aVar.h().containsKey("expose-key")) {
                str = String.valueOf(aVar.h().get("expose-key"));
            }
            if (t.a(str)) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), str);
            aVar2.a(new c.a() { // from class: com.sankuai.waimai.store.drug.search.mach.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a54978a6806666526e49313f4d17c0b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a54978a6806666526e49313f4d17c0b8");
                    } else {
                        aVar.f.triggerViewReport(aVar);
                    }
                }
            });
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.b, aVar2);
        }
    }

    private void c(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f225d2dd31da9d914249dfb724e707f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f225d2dd31da9d914249dfb724e707f");
        } else if (aVar != null) {
            d(aVar);
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(b)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                if (aVar2 != null) {
                    d(aVar2);
                }
                c(aVar2);
            }
        }
    }

    private void d(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25985cbfd8c56ddd348fa11474cf81e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25985cbfd8c56ddd348fa11474cf81e2");
        } else if (com.sankuai.waimai.store.mach.a.b(aVar)) {
            this.k.b = aVar;
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            this.k.d.add(aVar);
        } else if (com.sankuai.waimai.store.mach.a.d(aVar)) {
            this.k.c.add(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.mach.swiper.a.InterfaceC1221a
    public final void d_(int i) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac1bde7685852623732088fa8776d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac1bde7685852623732088fa8776d87");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17abd4260c4dbc1f00d30b70c077c0d9", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17abd4260c4dbc1f00d30b70c077c0d9")).booleanValue();
        } else if (this.c != null && this.c.getVisibility() == 0) {
            z = true;
        }
        if (!z || this.f == null || this.f.l() == null) {
            return;
        }
        b(a(this.f.l().getRootNode(), 1), i);
    }

    private com.sankuai.waimai.mach.node.a a(com.sankuai.waimai.mach.node.a aVar, int i) {
        boolean c;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495bc39fe4a09ea14904d9467645fcc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495bc39fe4a09ea14904d9467645fcc7");
        }
        if (aVar != null) {
            Object[] objArr2 = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fbbe4431156fee90442b1f23b12e002", RobustBitConfig.DEFAULT_VALUE)) {
                c = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fbbe4431156fee90442b1f23b12e002")).booleanValue();
            } else {
                c = i != 1 ? false : com.sankuai.waimai.store.mach.a.c(aVar);
            }
            if (!c) {
                List<com.sankuai.waimai.mach.node.a> b = aVar.b();
                com.sankuai.waimai.mach.node.a aVar2 = null;
                if (com.sankuai.shangou.stone.util.a.b(b)) {
                    return null;
                }
                Iterator<com.sankuai.waimai.mach.node.a> it = b.iterator();
                while (it.hasNext() && (aVar2 = a(it.next(), i)) == null) {
                }
                return aVar2;
            }
        }
        return aVar;
    }

    private void b(com.sankuai.waimai.mach.node.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b15839f761f6e26be611dc9a55d64e16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b15839f761f6e26be611dc9a55d64e16");
        } else if (aVar != null && i >= 0) {
            if (com.sankuai.waimai.store.mach.a.a(aVar)) {
                b(aVar);
            }
            com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), i);
            if (aVar2 == null || aVar2.g() == null || com.sankuai.waimai.store.mach.a.d(aVar2)) {
                return;
            }
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                b(aVar3);
            }
        }
    }
}
