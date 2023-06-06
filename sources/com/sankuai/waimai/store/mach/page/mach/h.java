package com.sankuai.waimai.store.mach.page.mach;

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
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.mach.swiper.a;
import com.sankuai.waimai.store.repository.model.BaseTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h implements a.InterfaceC1221a {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public View d;
    public com.sankuai.waimai.mach.recycler.c e;
    private Context f;
    private ViewGroup g;
    private ViewGroup h;
    private com.sankuai.waimai.mach.recycler.c i;
    private d.b j;

    public static /* synthetic */ void a(h hVar, com.sankuai.waimai.mach.node.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "a2d2d23a800c2f295b9ec24a46a0aadc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "a2d2d23a800c2f295b9ec24a46a0aadc");
        } else if (aVar.f != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = aVar.f.searchNodeWithViewReport();
            if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : searchNodeWithViewReport) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = aVar2;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "fa04837d9c698efb69c25a569c9547ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "fa04837d9c698efb69c25a569c9547ce");
                } else {
                    if (aVar2 != null) {
                        hVar.c(aVar2);
                        if (!com.sankuai.shangou.stone.util.a.b(hVar.j.c)) {
                            for (com.sankuai.waimai.mach.node.a aVar3 : hVar.j.c) {
                                Object[] objArr3 = new Object[i];
                                objArr3[0] = aVar3;
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "d0e4743a1ddaadfead7f7e8bd573b66b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "d0e4743a1ddaadfead7f7e8bd573b66b");
                                } else if (aVar3 != null && (aVar3.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
                                    if (com.sankuai.waimai.store.mach.a.a(aVar3)) {
                                        hVar.b(aVar3);
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
                                                        hVar.b(aVar5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = 1;
                            }
                            hVar.j.a();
                            ArrayList<com.sankuai.waimai.mach.node.a> arrayList2 = new ArrayList();
                            com.sankuai.waimai.store.mach.a.b(aVar2, arrayList2);
                            if (!com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                                for (com.sankuai.waimai.mach.node.a aVar6 : arrayList2) {
                                    if (aVar6 != null) {
                                        hVar.b(aVar6);
                                    }
                                }
                            }
                        } else if (!com.sankuai.shangou.stone.util.a.b(hVar.j.d)) {
                            for (com.sankuai.waimai.mach.node.a aVar7 : hVar.j.d) {
                                hVar.a(aVar7);
                                if ((aVar7.h instanceof com.sankuai.waimai.store.mach.swiper.a) && ((com.sankuai.waimai.store.mach.swiper.a) aVar7.h).d == null) {
                                    ((com.sankuai.waimai.store.mach.swiper.a) aVar7.h).d = hVar;
                                }
                            }
                            hVar.j.a();
                            ArrayList<com.sankuai.waimai.mach.node.a> arrayList3 = new ArrayList();
                            com.sankuai.waimai.store.mach.a.b(aVar2, arrayList3);
                            if (!com.sankuai.shangou.stone.util.a.b(arrayList3)) {
                                for (com.sankuai.waimai.mach.node.a aVar8 : arrayList3) {
                                    if (aVar8 != null) {
                                        hVar.b(aVar8);
                                    }
                                }
                            }
                        } else {
                            hVar.j.a();
                            hVar.b(aVar2);
                        }
                    }
                    i = 1;
                }
            }
        }
    }

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c54f31e11b8e3a4b6903703e723b3a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c54f31e11b8e3a4b6903703e723b3a8");
            return;
        }
        this.j = new d.b();
        this.f = context;
    }

    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3cc4f1a6d6c4a97ce939b3e27c13d2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3cc4f1a6d6c4a97ce939b3e27c13d2f");
        }
        View inflate = LayoutInflater.from(this.f).inflate(R.layout.wm_sc_nox_search_layout_common_mach_block, viewGroup, false);
        this.g = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
        this.h = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
        this.d = inflate;
        return inflate;
    }

    public final void a(int i, MachCommonData machCommonData, BaseTile.LayoutInfo layoutInfo) {
        Object[] objArr = {Integer.valueOf(i), machCommonData, layoutInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543838c8213296ace3e3c59920ffebcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543838c8213296ace3e3c59920ffebcf");
            return;
        }
        if (layoutInfo != null) {
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(this.f, layoutInfo.top);
                marginLayoutParams.bottomMargin = com.sankuai.shangou.stone.util.h.a(this.f, layoutInfo.bottom);
                this.g.setLayoutParams(layoutParams);
            }
        }
        com.sankuai.waimai.mach.recycler.b bVar = machCommonData.machRecycler;
        com.sankuai.waimai.store.mach.page.event.d dVar = machCommonData.mItem;
        this.e = dVar;
        if (dVar != null) {
            com.sankuai.waimai.store.mach.page.event.f.a().a(dVar);
            final com.sankuai.waimai.mach.node.a b = dVar.b();
            b.a("mach_extra_key_position", Integer.valueOf(i));
            bVar.a(dVar);
            bVar.a(this.g, dVar, bVar.a(dVar.a()));
            ViewGroup.LayoutParams layoutParams2 = this.g.getLayoutParams();
            layoutParams2.height = dVar.c();
            layoutParams2.width = dVar.d();
            dVar.l().registerJsEventCallback(new com.sankuai.waimai.store.mach.page.event.b(this.f, this.b, this.c, new Runnable() { // from class: com.sankuai.waimai.store.mach.page.mach.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b8a40927f1c9c38311aa97c182ad16e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b8a40927f1c9c38311aa97c182ad16e");
                    } else {
                        h.a(h.this, b);
                    }
                }
            }));
            this.i = dVar;
            this.g.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.mach.page.mach.h.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01502477759bda224818a3ae639cca73", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01502477759bda224818a3ae639cca73");
                    } else {
                        h.a(h.this, b);
                    }
                }
            }, 0L);
            return;
        }
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17aa9e5c7d348a31ae788dc09cfc5bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17aa9e5c7d348a31ae788dc09cfc5bc");
        } else if (this.g == null) {
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            marginLayoutParams.height = 0;
            this.g.setLayoutParams(marginLayoutParams);
        }
    }

    private void a(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2343fbe1722a50757507dc08b6741cef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2343fbe1722a50757507dc08b6741cef");
            return;
        }
        if (com.sankuai.waimai.store.mach.a.a(aVar)) {
            b(aVar);
        }
        com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b(), 0);
        if (aVar2 != null) {
            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
            com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                b(aVar3);
            }
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906142062c1de9f8b686730f65014a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906142062c1de9f8b686730f65014a41");
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

    private void b(final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb456c986232031b40173e41ed994e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb456c986232031b40173e41ed994e3");
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
            aVar2.a(new c.a() { // from class: com.sankuai.waimai.store.mach.page.mach.h.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccd452803a77be78e808be9402496b4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccd452803a77be78e808be9402496b4b");
                    } else {
                        aVar.f.triggerViewReport(aVar);
                    }
                }
            });
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.f, aVar2);
        }
    }

    private void c(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "405345480164119c6781ab08c1b9d67e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "405345480164119c6781ab08c1b9d67e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b8c2cf531376712acd41c5450e2fea", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b8c2cf531376712acd41c5450e2fea");
        }
        if (aVar != null) {
            Object[] objArr2 = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "239cd3578da2484d436b320c019f725d", RobustBitConfig.DEFAULT_VALUE)) {
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
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "239cd3578da2484d436b320c019f725d")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4461f22ebf1c15cb66b294e09f98d776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4461f22ebf1c15cb66b294e09f98d776");
        } else if (com.sankuai.waimai.store.mach.a.b(aVar)) {
            this.j.b = aVar;
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            this.j.d.add(aVar);
        } else if (com.sankuai.waimai.store.mach.a.d(aVar)) {
            this.j.c.add(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.mach.swiper.a.InterfaceC1221a
    public final void d_(int i) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4840061aeb4d8c60532254eef43bfb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4840061aeb4d8c60532254eef43bfb5");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "843130a732ff7640ff3025d5a20eeef6", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "843130a732ff7640ff3025d5a20eeef6")).booleanValue();
        } else if (this.g != null && this.g.getVisibility() == 0) {
            z = true;
        }
        if (!z || this.e == null || this.e.l() == null) {
            return;
        }
        a(b(this.e.l().getRootNode(), 1), i);
    }
}
