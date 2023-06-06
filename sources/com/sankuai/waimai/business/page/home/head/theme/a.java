package com.sankuai.waimai.business.page.home.head.theme;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.android.cube.pga.common.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.head.majorcategory.MajorCategoryBlock;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.dynamic.g;
import com.sankuai.waimai.platform.dynamic.h;
import com.sankuai.waimai.platform.dynamic.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final ImageView b;
    public int c;
    public boolean d;
    public final PageFragment e;
    public final HomeActionBarViewModel f;
    int g;
    Context h;
    int i;
    public int j;
    private final ImageView k;
    private int l;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.head.theme.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    interface InterfaceC0775a {
        void a(int i);
    }

    public static /* synthetic */ int a(a aVar) {
        int i = aVar.g - 1;
        aVar.g = i;
        return i;
    }

    public a(PageFragment pageFragment, ViewGroup viewGroup) {
        Object[] objArr = {pageFragment, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1dc0132d7b03e6659348d04ad4e71cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1dc0132d7b03e6659348d04ad4e71cb");
            return;
        }
        this.l = 0;
        this.e = pageFragment;
        this.h = this.e.getContext();
        this.b = (ImageView) viewGroup.findViewById(R.id.actionbar_bg_container);
        this.k = (ImageView) viewGroup.findViewById(R.id.home_blocks_white_bg);
        this.f = (HomeActionBarViewModel) q.a(pageFragment).a(HomeActionBarViewModel.class);
        ((HomePageViewModel) q.a(this.e).a(HomePageViewModel.class)).s.a(this.e, new l<List<com.meituan.android.cube.pga.block.a>>() { // from class: com.sankuai.waimai.business.page.home.head.theme.a.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r4v8, types: [com.meituan.android.cube.pga.viewmodel.a] */
            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable List<com.meituan.android.cube.pga.block.a> list) {
                int i;
                int i2;
                c j;
                int i3;
                int i4;
                c j2;
                List<com.meituan.android.cube.pga.block.a> list2 = list;
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c49387803d6a82717ed5af515f700fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c49387803d6a82717ed5af515f700fb");
                } else if (list2 != null && !d.a(list2)) {
                    final a aVar = a.this;
                    final InterfaceC0775a interfaceC0775a = new InterfaceC0775a() { // from class: com.sankuai.waimai.business.page.home.head.theme.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.home.head.theme.a.InterfaceC0775a
                        public final void a(int i5) {
                            Object[] objArr3 = {Integer.valueOf(i5)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7419e92eb7510e311823910d8b5cc69f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7419e92eb7510e311823910d8b5cc69f");
                                return;
                            }
                            a.this.j = i5;
                            a.this.a(i5);
                        }
                    };
                    Object[] objArr3 = {list2, interfaceC0775a};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "28a051ccc17a7aeeca4d68092c00bc7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "28a051ccc17a7aeeca4d68092c00bc7b");
                    } else if (list2 != null && !d.a(list2)) {
                        aVar.g = 0;
                        aVar.i = 0;
                        ArrayList<g> arrayList = new ArrayList();
                        ArrayList<com.sankuai.waimai.business.page.home.head.b> arrayList2 = new ArrayList();
                        for (int i5 = 0; i5 < list2.size(); i5++) {
                            com.meituan.android.cube.pga.block.a aVar2 = list2.get(i5);
                            if (aVar2 != null && aVar2.G() != 0) {
                                if (aVar2 instanceof g) {
                                    arrayList.add((g) aVar2);
                                } else if (aVar2 instanceof com.sankuai.waimai.business.page.home.head.b) {
                                    arrayList2.add((com.sankuai.waimai.business.page.home.head.b) aVar2);
                                }
                                if (aVar2 instanceof MajorCategoryBlock) {
                                    break;
                                }
                            }
                        }
                        aVar.g = arrayList.size() + arrayList2.size();
                        if (aVar.g == 0) {
                            interfaceC0775a.a(0);
                            return;
                        }
                        for (final g gVar : arrayList) {
                            if (gVar.G() == 0 || (j2 = ((j) gVar.G()).j()) == null) {
                                i3 = 0;
                                i4 = 0;
                            } else {
                                i4 = com.sankuai.waimai.foundation.utils.g.a(aVar.h, j2.a);
                                i3 = com.sankuai.waimai.foundation.utils.g.a(aVar.h, j2.b);
                            }
                            if (gVar.u >= 0) {
                                aVar.i += gVar.u + i4 + i3;
                                int i6 = aVar.g - 1;
                                aVar.g = i6;
                                if (i6 == 0) {
                                    interfaceC0775a.a(aVar.i);
                                    return;
                                }
                            } else {
                                gVar.a(new h() { // from class: com.sankuai.waimai.business.page.home.head.theme.a.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.platform.dynamic.h
                                    public final void a(int i7, int i8) {
                                        Object[] objArr4 = {Integer.valueOf(i7), Integer.valueOf(i8)};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a2f6269dc0bd89fdaf2709cedf00b75e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a2f6269dc0bd89fdaf2709cedf00b75e");
                                            return;
                                        }
                                        gVar.b((h) this);
                                        a.this.i += i8;
                                        if (a.a(a.this) == 0) {
                                            interfaceC0775a.a(a.this.i);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.platform.dynamic.h
                                    public final void a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "adb3a9f22c520315ec8dde5bea678376", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "adb3a9f22c520315ec8dde5bea678376");
                                            return;
                                        }
                                        gVar.b((h) this);
                                        if (a.a(a.this) == 0) {
                                            interfaceC0775a.a(a.this.i);
                                        }
                                    }
                                });
                            }
                        }
                        for (final com.sankuai.waimai.business.page.home.head.b bVar : arrayList2) {
                            com.sankuai.waimai.business.page.common.arch.a aVar3 = (com.sankuai.waimai.business.page.common.arch.a) bVar;
                            if (aVar3.G() == 0 || (j = aVar3.G().j()) == null) {
                                i = 0;
                                i2 = 0;
                            } else {
                                i2 = com.sankuai.waimai.foundation.utils.g.a(aVar.h, j.a);
                                i = com.sankuai.waimai.foundation.utils.g.a(aVar.h, j.b);
                            }
                            if (bVar.ar_()) {
                                int i7 = aVar.g - 1;
                                aVar.g = i7;
                                if (i7 == 0) {
                                    aVar.i += aVar3.M().getHeight() + i2 + i;
                                    interfaceC0775a.a(aVar.i);
                                    return;
                                }
                            } else {
                                bVar.a(new com.sankuai.waimai.business.page.home.head.c() { // from class: com.sankuai.waimai.business.page.home.head.theme.a.3
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.page.home.head.c
                                    public final void a(com.sankuai.waimai.platform.mach.a aVar4) {
                                        Object[] objArr4 = {aVar4};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2668d0225316d0e82325e98825e5ed96", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2668d0225316d0e82325e98825e5ed96");
                                            return;
                                        }
                                        bVar.b(this);
                                        a.this.i += aVar4.l().t();
                                        if (a.a(a.this) == 0) {
                                            interfaceC0775a.a(a.this.i);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.business.page.home.head.c
                                    public final void a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bd8292a16f11e263d2c2b90237a3ff80", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bd8292a16f11e263d2c2b90237a3ff80");
                                            return;
                                        }
                                        bVar.b(this);
                                        if (a.a(a.this) == 0) {
                                            interfaceC0775a.a(a.this.i);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
        });
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd04ad4f8785d9e5ea0905eef508c7cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd04ad4f8785d9e5ea0905eef508c7cf");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        layoutParams.height = Math.max(i + com.sankuai.waimai.foundation.utils.g.a(this.h, 115.0f), com.sankuai.waimai.foundation.utils.g.a(this.h, 115.0f));
        this.k.setLayoutParams(layoutParams);
    }

    public final void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67760576426a89e8e80e5360b1ae6e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67760576426a89e8e80e5360b1ae6e6");
            return;
        }
        if (i == -100) {
            if (Math.abs(this.l) <= 5) {
                this.l = 0;
            }
        } else {
            this.l = i;
        }
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != this.c + this.l) {
                marginLayoutParams.topMargin = this.c + this.l;
                this.k.setLayoutParams(layoutParams);
            }
        }
        if (this.d && this.b.getVisibility() == 0 && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams2.topMargin != this.l) {
                marginLayoutParams2.topMargin = this.l;
                this.b.setLayoutParams(layoutParams2);
            }
        }
    }
}
