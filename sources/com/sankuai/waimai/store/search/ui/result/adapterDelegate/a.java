package com.sankuai.waimai.store.search.ui.result.adapterDelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.ui.result.mach.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<Serializable, C1322a> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.search.ui.result.b b;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        return false;
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1322a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        View inflate;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422ccf800bfc127bc75c2f02557269de", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1322a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422ccf800bfc127bc75c2f02557269de");
        }
        g gVar = new g(this.k, this.b);
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "633dac17408b6d8665d3ff9ece9ed6b2", RobustBitConfig.DEFAULT_VALUE)) {
            inflate = (View) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "633dac17408b6d8665d3ff9ece9ed6b2");
        } else {
            inflate = LayoutInflater.from(gVar.b).inflate(R.layout.wm_sc_nox_search_layout_common_mach_block, viewGroup, false);
            gVar.c = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
            gVar.d = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
        }
        return new C1322a(inflate, gVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull C1322a c1322a) {
        C1322a c1322a2 = c1322a;
        Object[] objArr = {c1322a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd54c6351333758123ad880d2827703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd54c6351333758123ad880d2827703");
            return;
        }
        super.a((a) c1322a2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = C1322a.a;
        if (PatchProxy.isSupport(objArr2, c1322a2, changeQuickRedirect2, false, "d561a5082239b6406c4f08f26ca6bd1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1322a2, changeQuickRedirect2, false, "d561a5082239b6406c4f08f26ca6bd1a");
            return;
        }
        g gVar = c1322a2.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "92b112661d96a54212105565431a0d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "92b112661d96a54212105565431a0d30");
        } else if (gVar.e.t != null) {
            gVar.e.t.b(gVar.f);
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull Serializable serializable, @NonNull C1322a c1322a, int i) {
        int i2;
        int i3;
        Serializable serializable2 = serializable;
        C1322a c1322a2 = c1322a;
        Object[] objArr = {serializable2, c1322a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505f6873d7a7615c9cb100d8bf55e1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505f6873d7a7615c9cb100d8bf55e1e1");
            return;
        }
        final g gVar = c1322a2.b;
        CommonMachData commonMachData = (CommonMachData) serializable2;
        Object[] objArr2 = {Integer.valueOf(i), commonMachData, c1322a2.itemView};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "8a6813bfaa3548d9be81d2c7cc56b1d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "8a6813bfaa3548d9be81d2c7cc56b1d8");
            return;
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(gVar.b, 12.0f);
        if (commonMachData.mNeedAdjustPadding == 1) {
            Object[] objArr3 = {commonMachData};
            ChangeQuickRedirect changeQuickRedirect3 = g.a;
            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "d7009e614e7e39f0a6490565860a9f03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "d7009e614e7e39f0a6490565860a9f03");
            } else {
                int a3 = com.sankuai.waimai.foundation.utils.g.a(gVar.b, 4.0f) * 2;
                if (commonMachData.getStaggerIndexLookup().a()) {
                    i3 = a3;
                    i2 = 0;
                } else {
                    i2 = a3;
                    i3 = 0;
                }
                gVar.d.setPadding(i3, a3, i2, 0);
            }
        } else if (commonMachData.mNeedAdjustPadding == 2) {
            gVar.d.setPadding(a2, a2, a2, 0);
        } else if (commonMachData.mNeedAdjustPadding == 3) {
            gVar.d.setPadding(a2, 0, a2, a2 / 2);
        } else {
            gVar.d.setPadding(0, 0, 0, 0);
        }
        if (commonMachData.bottomMargin != 0) {
            ViewGroup.LayoutParams layoutParams = gVar.d.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = commonMachData.bottomMargin;
                gVar.d.setLayoutParams(layoutParams);
            }
        }
        c cVar = commonMachData.mItem;
        if (cVar != null) {
            com.sankuai.waimai.mach.recycler.b bVar = gVar.e.t;
            final com.sankuai.waimai.mach.node.a b = cVar.b();
            b.a("mach_extra_key_position", Integer.valueOf(i));
            bVar.a(cVar);
            bVar.a(gVar.c, cVar, bVar.a(cVar.a()));
            ViewGroup.LayoutParams layoutParams2 = gVar.c.getLayoutParams();
            layoutParams2.height = commonMachData.state == CommonMachData.a.SHOWING ? cVar.c() : 0;
            layoutParams2.width = cVar.d();
            gVar.f = cVar;
            gVar.c.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.mach.g.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v12 */
                /* JADX WARN: Type inference failed for: r8v14 */
                /* JADX WARN: Type inference failed for: r8v4 */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "33f6bf5d663f946a9691de8e42400265", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "33f6bf5d663f946a9691de8e42400265");
                        return;
                    }
                    int i4 = 1;
                    if (g.this.e.bf == 1) {
                        b.f.onExpose(b);
                        return;
                    }
                    g gVar2 = g.this;
                    com.sankuai.waimai.mach.node.a aVar = b;
                    Object[] objArr5 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect5 = g.a;
                    if (PatchProxy.isSupport(objArr5, gVar2, changeQuickRedirect5, false, "01e87f868424484a4d8c158dc1b92898", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, gVar2, changeQuickRedirect5, false, "01e87f868424484a4d8c158dc1b92898");
                    } else if (aVar.f != null) {
                        List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = aVar.f.searchNodeWithViewReport();
                        if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                            return;
                        }
                        for (com.sankuai.waimai.mach.node.a aVar2 : searchNodeWithViewReport) {
                            Object[] objArr6 = new Object[i4];
                            objArr6[z ? 1 : 0] = aVar2;
                            ChangeQuickRedirect changeQuickRedirect6 = g.a;
                            if (PatchProxy.isSupport(objArr6, gVar2, changeQuickRedirect6, false, "964379a555147ced6889071bd1723872", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, gVar2, changeQuickRedirect6, z, "964379a555147ced6889071bd1723872");
                            } else {
                                if (aVar2 != null) {
                                    gVar2.b(aVar2);
                                    if (!com.sankuai.shangou.stone.util.a.b(gVar2.g.c)) {
                                        ?? r8 = z;
                                        for (com.sankuai.waimai.mach.node.a aVar3 : gVar2.g.c) {
                                            Object[] objArr7 = new Object[i4];
                                            objArr7[r8] = aVar3;
                                            ChangeQuickRedirect changeQuickRedirect7 = g.a;
                                            if (PatchProxy.isSupport(objArr7, gVar2, changeQuickRedirect7, false, "ac4be93975da0f95fa0234d17fb93ff5", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, gVar2, changeQuickRedirect7, false, "ac4be93975da0f95fa0234d17fb93ff5");
                                            } else if (aVar3 != null && (aVar3.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
                                                if (com.sankuai.waimai.store.mach.a.a(aVar3)) {
                                                    gVar2.a(aVar3);
                                                }
                                                List<Integer> e = ((com.sankuai.waimai.mach.component.scroller.b) aVar3.h).e();
                                                List<com.sankuai.waimai.mach.node.a> b2 = aVar3.b();
                                                if (!com.sankuai.shangou.stone.util.a.b(e) && !com.sankuai.shangou.stone.util.a.b(b2)) {
                                                    for (Integer num : e) {
                                                        com.sankuai.waimai.mach.node.a aVar4 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b2, num.intValue());
                                                        if (aVar4 != null && aVar4.g() != null && !com.sankuai.waimai.store.mach.a.c(aVar4)) {
                                                            ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                                                            com.sankuai.waimai.store.mach.a.a(aVar4, arrayList);
                                                            if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                                                for (com.sankuai.waimai.mach.node.a aVar5 : arrayList) {
                                                                    gVar2.a(aVar5);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i4 = 1;
                                            r8 = 0;
                                        }
                                        gVar2.g.a();
                                        ArrayList<com.sankuai.waimai.mach.node.a> arrayList2 = new ArrayList();
                                        com.sankuai.waimai.store.mach.a.b(aVar2, arrayList2);
                                        if (!com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                                            for (com.sankuai.waimai.mach.node.a aVar6 : arrayList2) {
                                                if (aVar6 != null) {
                                                    gVar2.a(aVar6);
                                                }
                                            }
                                        }
                                    } else {
                                        gVar2.g.a();
                                        gVar2.a(aVar2);
                                    }
                                }
                                i4 = 1;
                                z = false;
                            }
                        }
                    }
                }
            }, 500L);
            return;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = g.a;
        if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "5451d64fffc2cbadec4166c8f9e70424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "5451d64fffc2cbadec4166c8f9e70424");
        } else if (gVar.c != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.c.getLayoutParams();
            marginLayoutParams.height = 0;
            gVar.c.setLayoutParams(marginLayoutParams);
        }
    }

    public a(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a65c1c5e49c5c6d800216a75c30e733", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a65c1c5e49c5c6d800216a75c30e733");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(Serializable serializable) {
        return (serializable instanceof CommonMachData) && ((CommonMachData) serializable).mItem != null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.ui.result.adapterDelegate.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1322a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public g b;

        public C1322a(View view, g gVar) {
            super(view);
            Object[] objArr = {view, gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a826ae186d041bb5602fbfa8452565df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a826ae186d041bb5602fbfa8452565df");
            } else {
                this.b = gVar;
            }
        }
    }
}
