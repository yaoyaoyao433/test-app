package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.mach.swiper.a;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b implements a.InterfaceC1221a {
    public static ChangeQuickRedirect a;
    private ViewGroup b;
    private ViewGroup c;
    private d d;
    private com.sankuai.waimai.mach.recycler.c e;
    private d.b f;
    private int g;
    private int h;
    private View i;
    private com.sankuai.waimai.mach.recycler.c j;

    public static /* synthetic */ void a(e eVar, com.sankuai.waimai.mach.node.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "546f679c10a6046372e8087732b16278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "546f679c10a6046372e8087732b16278");
        } else if (aVar.f != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = aVar.f.searchNodeWithViewReport();
            if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : searchNodeWithViewReport) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = aVar2;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "cf853cf84601a6a0f2bc8cec1d96c6b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "cf853cf84601a6a0f2bc8cec1d96c6b8");
                } else {
                    if (aVar2 != null) {
                        eVar.c(aVar2);
                        if (!com.sankuai.shangou.stone.util.a.b(eVar.f.c)) {
                            for (com.sankuai.waimai.mach.node.a aVar3 : eVar.f.c) {
                                Object[] objArr3 = new Object[i];
                                objArr3[0] = aVar3;
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "04ce9ade2e25599686ae20ad99faad1e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "04ce9ade2e25599686ae20ad99faad1e");
                                } else if (aVar3 != null && (aVar3.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
                                    if (com.sankuai.waimai.store.mach.a.a(aVar3)) {
                                        eVar.a(aVar3);
                                    }
                                    List<Integer> e = ((com.sankuai.waimai.mach.component.scroller.b) aVar3.h).e();
                                    List<com.sankuai.waimai.mach.node.a> b = aVar3.b();
                                    if (!com.sankuai.shangou.stone.util.a.b(e) && !com.sankuai.shangou.stone.util.a.b(b)) {
                                        for (Integer num : e) {
                                            com.sankuai.waimai.mach.node.a aVar4 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b, num.intValue());
                                            if (aVar4 != null && aVar4.g() != null && !com.sankuai.waimai.store.mach.a.c(aVar4)) {
                                                ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                                                com.sankuai.waimai.store.mach.a.a(aVar4, arrayList);
                                                if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                                    for (com.sankuai.waimai.mach.node.a aVar5 : arrayList) {
                                                        eVar.a(aVar5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = 1;
                            }
                            eVar.f.a();
                            ArrayList<com.sankuai.waimai.mach.node.a> arrayList2 = new ArrayList();
                            com.sankuai.waimai.store.mach.a.b(aVar2, arrayList2);
                            if (!com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                                for (com.sankuai.waimai.mach.node.a aVar6 : arrayList2) {
                                    if (aVar6 != null) {
                                        eVar.a(aVar6);
                                    }
                                }
                            }
                        } else if (!com.sankuai.shangou.stone.util.a.b(eVar.f.d)) {
                            for (com.sankuai.waimai.mach.node.a aVar7 : eVar.f.d) {
                                eVar.b(aVar7);
                                if ((aVar7.h instanceof com.sankuai.waimai.store.mach.swiper.a) && ((com.sankuai.waimai.store.mach.swiper.a) aVar7.h).d == null) {
                                    ((com.sankuai.waimai.store.mach.swiper.a) aVar7.h).d = eVar;
                                }
                            }
                            eVar.f.a();
                            ArrayList<com.sankuai.waimai.mach.node.a> arrayList3 = new ArrayList();
                            com.sankuai.waimai.store.mach.a.b(aVar2, arrayList3);
                            if (!com.sankuai.shangou.stone.util.a.b(arrayList3)) {
                                for (com.sankuai.waimai.mach.node.a aVar8 : arrayList3) {
                                    if (aVar8 != null) {
                                        eVar.a(aVar8);
                                    }
                                }
                            }
                        } else {
                            eVar.f.a();
                            eVar.a(aVar2);
                        }
                    }
                    i = 1;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View getView() {
        return this.i;
    }

    public e(@NonNull Context context, d dVar) {
        super(context);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f5e476de4545a77ceff38002a8397a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f5e476de4545a77ceff38002a8397a4");
            return;
        }
        this.f = new d.b();
        this.g = 0;
        this.h = 0;
        this.d = dVar;
        this.g = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
        this.h = h.a(getContext());
    }

    public final void a(PoiCommonMachListItem poiCommonMachListItem, int i) {
        Object[] objArr = {poiCommonMachListItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78989b2ef784d0f7c57a245a9d5b1ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78989b2ef784d0f7c57a245a9d5b1ef");
        } else if (poiCommonMachListItem == null || poiCommonMachListItem.mBaseModuleDesc == null || poiCommonMachListItem.recycleMachDataWrapper == null) {
        } else {
            BaseModuleDesc.a aVar = poiCommonMachListItem.mBaseModuleDesc.layoutInfo;
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (aVar != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = h.a(this.mContext, aVar.a);
                    marginLayoutParams.bottomMargin = h.a(this.mContext, aVar.b);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams2.topMargin = 0;
                    marginLayoutParams2.bottomMargin = 0;
                }
                this.c.setLayoutParams(layoutParams);
            }
            this.j = poiCommonMachListItem.recycleMachDataWrapper.b;
            if (this.j != null && this.d != null) {
                final com.sankuai.waimai.mach.node.a b = this.j.b();
                b.a("mach_extra_key_position", Integer.valueOf(i));
                com.sankuai.waimai.mach.recycler.b b2 = this.d.b();
                b2.a(this.j);
                b2.a(this.b, this.j, b2.a(this.j.a()));
                this.e = this.j;
                this.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.e.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36917ad4dca3248617b78704a4b19134", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36917ad4dca3248617b78704a4b19134");
                        } else {
                            e.a(e.this, b);
                        }
                    }
                }, 0L);
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18760f0867467945b180fb671333623d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18760f0867467945b180fb671333623d");
            } else if (this.b != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
                marginLayoutParams3.height = 0;
                this.b.setLayoutParams(marginLayoutParams3);
            }
        }
    }

    private void a(final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b69a88b63727e880871ecbb70c3e181d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b69a88b63727e880871ecbb70c3e181d");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            String str = null;
            if (aVar.h() != null && aVar.h().containsKey("expose-unique-key")) {
                str = String.valueOf(aVar.h().get("expose-unique-key"));
            }
            if (t.a(str)) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), str);
            aVar2.a(new c.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.strollaround.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b15cb440f40e666b263452a1b0daff15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b15cb440f40e666b263452a1b0daff15");
                    } else {
                        aVar.f.triggerViewReport(aVar);
                    }
                }
            });
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.mContext, aVar2);
        }
    }

    private void b(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f5dd8f1a13284f12e49536a98a2f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f5dd8f1a13284f12e49536a98a2f79");
            return;
        }
        if (com.sankuai.waimai.store.mach.a.a(aVar)) {
            a(aVar);
        }
        com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), 0);
        if (aVar2 != null) {
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                a(aVar3);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32452c68d87a8645c433bffead759675", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32452c68d87a8645c433bffead759675");
        }
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_nox_search_layout_store_mach_block, viewGroup, false);
        this.b = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
        this.c = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
        this.i = inflate;
        return inflate;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e48ca8c2b814143586ba75ca2dfa48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e48ca8c2b814143586ba75ca2dfa48");
        } else if (this.d == null || this.d.b() == null) {
        } else {
            this.d.b().b(this.e);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39731b822adfaedec0030b9aa146243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39731b822adfaedec0030b9aa146243");
        } else if (this.e == null || this.e.l() == null) {
        } else {
            this.e.l().sendJsEvent(str, map);
        }
    }

    @Override // com.sankuai.waimai.store.mach.swiper.a.InterfaceC1221a
    public final void d_(int i) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c0f06e46b3d98163fe69420cab8c7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c0f06e46b3d98163fe69420cab8c7d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "900beca1c3af36ff1b5c3222d1456a97", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "900beca1c3af36ff1b5c3222d1456a97")).booleanValue();
        } else if (this.b != null && this.b.getVisibility() == 0) {
            z = true;
        }
        if (!z || this.j == null || this.j.l() == null) {
            return;
        }
        a(b(this.j.l().getRootNode(), 1), i);
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbb0b7559ed76167e04175503925e29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbb0b7559ed76167e04175503925e29");
        } else if (aVar != null && i >= 0) {
            if (com.sankuai.waimai.store.mach.a.a(aVar)) {
                a(aVar);
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
                a(aVar3);
            }
        }
    }

    private void c(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47ecdd9e10b6eaff22f5f08c3e468c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47ecdd9e10b6eaff22f5f08c3e468c4");
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

    private com.sankuai.waimai.mach.node.a b(com.sankuai.waimai.mach.node.a aVar, int i) {
        boolean b;
        boolean z;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "029aa8857c5c3c1660076b0f8e39a131", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "029aa8857c5c3c1660076b0f8e39a131");
        }
        if (aVar != null) {
            Object[] objArr2 = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7049545dc628a1e9ef4a511f5098550", RobustBitConfig.DEFAULT_VALUE)) {
                switch (i) {
                    case 0:
                        b = com.sankuai.waimai.store.mach.a.b(aVar);
                        z = b;
                        break;
                    case 1:
                        b = com.sankuai.waimai.store.mach.a.c(aVar);
                        z = b;
                        break;
                    case 2:
                        b = com.sankuai.waimai.store.mach.a.d(aVar);
                        z = b;
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7049545dc628a1e9ef4a511f5098550")).booleanValue();
            }
            if (!z) {
                List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
                com.sankuai.waimai.mach.node.a aVar2 = null;
                if (com.sankuai.shangou.stone.util.a.b(b2)) {
                    return null;
                }
                Iterator<com.sankuai.waimai.mach.node.a> it = b2.iterator();
                while (it.hasNext() && (aVar2 = b(it.next(), i)) == null) {
                }
                return aVar2;
            }
        }
        return aVar;
    }

    private void d(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4143c85203fc0cc1c58ad54c60ac3056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4143c85203fc0cc1c58ad54c60ac3056");
        } else if (com.sankuai.waimai.store.mach.a.b(aVar)) {
            this.f.b = aVar;
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            this.f.d.add(aVar);
        } else if (com.sankuai.waimai.store.mach.a.d(aVar)) {
            this.f.c.add(aVar);
        }
    }
}
