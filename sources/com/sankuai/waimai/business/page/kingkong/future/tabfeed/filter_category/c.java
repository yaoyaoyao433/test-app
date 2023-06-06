package com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.Space;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.ChannelSubCategory;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.kingkong.future.bean.ScrollToOffsetBean;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.view.viewmodel.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"module_list_header"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class c extends com.meituan.android.cube.pga.block.a {
    public static ChangeQuickRedirect r;
    private View A;
    private View B;
    private boolean C;
    private boolean D;
    private f E;
    com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a s;
    private com.sankuai.waimai.business.page.kingkong.a t;
    private FrameLayout u;
    private Space v;
    private RecyclerView w;
    private a x;
    private b y;
    private View z;

    public c(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6e7424f172510620fade49d1296577", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6e7424f172510620fade49d1296577");
            return;
        }
        this.C = false;
        this.D = false;
        if (aVar instanceof com.sankuai.waimai.business.page.kingkong.a) {
            com.sankuai.waimai.business.page.kingkong.a aVar2 = (com.sankuai.waimai.business.page.kingkong.a) aVar;
            this.t = aVar2;
            this.z = aVar2.ac.a().b;
            this.A = this.z.findViewById(R.id.layout_float_filter_bar);
            this.B = this.z.findViewById(R.id.category_recycler_view_layout);
            this.y = aVar2.ad.a().b;
            this.x = aVar2.ae.a().b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98af73203fb920edd1ea37ee35055632", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98af73203fb920edd1ea37ee35055632");
            } else if (this.t != null) {
                this.t.y.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(Integer num) {
                        boolean z;
                        Integer num2 = num;
                        Object[] objArr3 = {num2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf6d374c6c5f0d4d4f4ee40fb99e2955", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf6d374c6c5f0d4d4f4ee40fb99e2955");
                            return;
                        }
                        if (num2 != null && num2.intValue() == 0) {
                            if (c.this.C && c.this.x != null) {
                                a aVar3 = c.this.x;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "2fb5898bf5a50e7e95c9765eda7018ba", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "2fb5898bf5a50e7e95c9765eda7018ba")).booleanValue();
                                } else {
                                    z = aVar3.e != null && aVar3.e.getTop() == (-a.d);
                                }
                                if (z) {
                                    return;
                                }
                            }
                            if (c.this.y != null) {
                                b bVar = c.this.y;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "6335ac5699b4de99787a87f301aa4c25", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "6335ac5699b4de99787a87f301aa4c25")).booleanValue() : bVar.d.i) {
                                    return;
                                }
                            }
                        }
                        c cVar = c.this;
                        int i = c.this.C ? -com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.e : 0;
                        Object[] objArr6 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect6 = c.r;
                        if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "1d6296089519c1de45271edec27b9c9f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "1d6296089519c1de45271edec27b9c9f");
                        } else {
                            cVar.s.b(0, i);
                        }
                        if (c.this.y != null) {
                            b bVar2 = c.this.y;
                            Object[] objArr7 = {(byte) 1};
                            ChangeQuickRedirect changeQuickRedirect7 = b.a;
                            if (PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "6bfd562d5de4ce1bf8ce49aa0132a280", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "6bfd562d5de4ce1bf8ce49aa0132a280");
                            } else {
                                bVar2.d.a(true);
                            }
                        }
                    }
                }).a(M());
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = r;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e630744a7c55283f5f1e7380aba1df0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e630744a7c55283f5f1e7380aba1df0");
            } else if (this.t != null) {
                this.t.bC.a(new com.meituan.android.cube.pga.action.b<RecyclerView>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.b
                    public final /* synthetic */ void a(RecyclerView recyclerView) {
                        RecyclerView recyclerView2 = recyclerView;
                        Object[] objArr4 = {recyclerView2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6a74943eb9ca5ce1fa0d53810a0a86d1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6a74943eb9ca5ce1fa0d53810a0a86d1");
                            return;
                        }
                        c.this.w = recyclerView2;
                        c.this.s = new com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a(c.this.w);
                        c.this.t.X.a(new com.meituan.android.cube.pga.action.b<ScrollToOffsetBean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.c.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.cube.pga.action.b
                            public final /* synthetic */ void a(ScrollToOffsetBean scrollToOffsetBean) {
                                ScrollToOffsetBean scrollToOffsetBean2 = scrollToOffsetBean;
                                Object[] objArr5 = {scrollToOffsetBean2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "aac20fcb34ccc048c9ca4e52ae432379", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "aac20fcb34ccc048c9ca4e52ae432379");
                                } else if (scrollToOffsetBean2 == null || com.sankuai.waimai.platform.privacy.a.a().b()) {
                                } else {
                                    c.this.s.b(scrollToOffsetBean2.position, scrollToOffsetBean2.offset);
                                }
                            }
                        }).a(c.this.M());
                        c.this.t.W.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a>) c.this.s);
                    }
                }).a(M());
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b664f6c05a124478c9273353f02f499c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b664f6c05a124478c9273353f02f499c");
        } else {
            super.a(bundle);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075c30a61bc3438fc2b326fc69539cfe", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075c30a61bc3438fc2b326fc69539cfe") : new com.meituan.android.cube.pga.view.a(m()) { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.c.3
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_fkk_header_list_placeholder;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78f6b357e6b1a811a881b690d633d55d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78f6b357e6b1a811a881b690d633d55d");
            return;
        }
        super.s();
        i().setMinimumHeight(1);
        this.v = (Space) i().findViewById(R.id.category_place_holder);
        this.u = (FrameLayout) i().findViewById(R.id.fl_filter_place_holer);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c43a162089e1fabcffeefae9bd03239", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c43a162089e1fabcffeefae9bd03239") : new e();
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.b
    public final void c(Object obj) {
        int i;
        int i2;
        char c = 1;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2030a6510216d7467ec151a6e12e11b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2030a6510216d7467ec151a6e12e11b4");
            return;
        }
        super.c(obj);
        this.C = false;
        this.D = false;
        if (obj instanceof RocksServerModel) {
            List<RocksServerModel> list = ((RocksServerModel) obj).moduleList;
            if (list != null && list.size() > 0) {
                ContextType F = F();
                if (!(F instanceof com.sankuai.waimai.business.page.kingkong.a) || this.z == null) {
                    return;
                }
                int i3 = 0;
                while (i3 < list.size()) {
                    RocksServerModel rocksServerModel = list.get(i3);
                    if (rocksServerModel != null) {
                        if (TextUtils.equals(rocksServerModel.templateId, "waimai_native_kingkong_category") && !TextUtils.isEmpty(rocksServerModel.stringData)) {
                            View view = this.z;
                            com.sankuai.waimai.business.page.kingkong.a aVar = (com.sankuai.waimai.business.page.kingkong.a) F;
                            String str = rocksServerModel.stringData;
                            Object[] objArr2 = new Object[3];
                            objArr2[0] = view;
                            objArr2[c] = aVar;
                            objArr2[2] = str;
                            ChangeQuickRedirect changeQuickRedirect2 = r;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd9fb30e9146b4bd6c36ba123a600146", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd9fb30e9146b4bd6c36ba123a600146");
                            } else {
                                try {
                                    com.sankuai.waimai.business.page.common.model.a aVar2 = (com.sankuai.waimai.business.page.common.model.a) new Gson().fromJson(str, new TypeToken<com.sankuai.waimai.business.page.common.model.a>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.c.4
                                    }.getType());
                                    if (aVar2 != null && !d.a(aVar2.a)) {
                                        this.C = true;
                                        this.t.H.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.c.5
                                            public static ChangeQuickRedirect a;

                                            @Override // com.meituan.android.cube.pga.action.d
                                            public final Object a() {
                                                Object[] objArr3 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8c6c7c3cfed66559b7fda6b70210b12", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8c6c7c3cfed66559b7fda6b70210b12") : Boolean.valueOf(c.this.C);
                                            }
                                        };
                                        KingkongInfo kingkongInfo = aVar.w.a().b;
                                        if (kingkongInfo != null && kingkongInfo.g == 0 && aVar2.a.get(0) != null) {
                                            kingkongInfo.g = aVar2.a.get(0).code;
                                        }
                                        final a aVar3 = this.x;
                                        ArrayList<ChannelSubCategory> arrayList = aVar2.a;
                                        Object[] objArr3 = {arrayList};
                                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                        if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "4efae56e9a0020eb18bfe039dfb369ae", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "4efae56e9a0020eb18bfe039dfb369ae");
                                        } else {
                                            Object[] objArr4 = {arrayList};
                                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                            if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "294f3cd27a5505c6a30425c901147395", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "294f3cd27a5505c6a30425c901147395");
                                            } else if (!d.a(arrayList)) {
                                                aVar3.f.a();
                                                aVar3.j.clear();
                                                aVar3.h = arrayList;
                                                aVar3.g.a(aVar3.h);
                                                int size = arrayList.size();
                                                aVar3.l = 0;
                                                int i4 = 0;
                                                while (true) {
                                                    if (i4 >= size) {
                                                        break;
                                                    } else if (arrayList.get(i4).code == aVar3.i) {
                                                        aVar3.l = i4;
                                                        break;
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                                int i5 = aVar3.l;
                                                Object[] objArr5 = {Integer.valueOf(i5)};
                                                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                                if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "e26f72393ab34b36a5123948f251e215", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "e26f72393ab34b36a5123948f251e215");
                                                } else if (aVar3.g != null) {
                                                    aVar3.g.a(i5);
                                                    aVar3.g.notifyDataSetChanged();
                                                }
                                                aVar3.e.setVisibility(0);
                                                aVar3.f.setVisibility(0);
                                                aVar3.f.scrollToPosition(aVar3.l);
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                                if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "6543fe4561b3330615c59c53da56983a", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "6543fe4561b3330615c59c53da56983a");
                                                } else if (aVar3.f != null) {
                                                    aVar3.f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a.5
                                                        public static ChangeQuickRedirect a;

                                                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                                        public final void onGlobalLayout() {
                                                            Object[] objArr7 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "604f3a7bc2aa96b8e7524bd683bb9286", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "604f3a7bc2aa96b8e7524bd683bb9286");
                                                            } else if (a.this.f.getLayoutManager() == null) {
                                                            } else {
                                                                a.a(a.this, false, a.this.f.getLayoutManager().findViewByPosition(a.this.l));
                                                                a.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                                            }
                                                        }
                                                    });
                                                }
                                            } else {
                                                if (aVar3.h != null) {
                                                    aVar3.h.clear();
                                                }
                                                aVar3.g.a((List) null);
                                                aVar3.g.notifyDataSetChanged();
                                                aVar3.e.setVisibility(8);
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        } else if (TextUtils.equals(rocksServerModel.templateId, "waimai_native_kingkong_filter")) {
                            Object[] objArr7 = {this.z, (com.sankuai.waimai.business.page.kingkong.a) F};
                            ChangeQuickRedirect changeQuickRedirect7 = r;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2ec71d7e15992d754eb89870dbe23529", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2ec71d7e15992d754eb89870dbe23529");
                            } else {
                                FragmentManager childFragmentManager = F().h().getChildFragmentManager();
                                Object[] objArr8 = {childFragmentManager};
                                ChangeQuickRedirect changeQuickRedirect8 = r;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3486279c9f6024e74b5feb4ad3fa757b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3486279c9f6024e74b5feb4ad3fa757b");
                                } else {
                                    Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("tag_kingkong_dynamic_filter_dialog");
                                    Fragment findFragmentByTag2 = childFragmentManager.findFragmentByTag("tag_kingkong_category_dialog");
                                    Fragment findFragmentByTag3 = childFragmentManager.findFragmentByTag("tag_kingkong_filter_dialog");
                                    Fragment findFragmentByTag4 = childFragmentManager.findFragmentByTag("tag_kingkong_sort_dialog");
                                    a(findFragmentByTag, childFragmentManager);
                                    a(findFragmentByTag2, childFragmentManager);
                                    a(findFragmentByTag3, childFragmentManager);
                                    a(findFragmentByTag4, childFragmentManager);
                                }
                            }
                            this.D = true;
                            i3++;
                            c = 1;
                        }
                    }
                    i3++;
                    c = 1;
                }
                if (!this.D) {
                    if (this.A != null) {
                        i2 = 8;
                        this.A.setVisibility(8);
                    } else {
                        i2 = 8;
                    }
                    this.u.setVisibility(i2);
                } else {
                    View view2 = ((com.sankuai.waimai.business.page.kingkong.a) bC_()).J.a().b;
                    if (view2 != null) {
                        ViewGroup viewGroup = (ViewGroup) view2.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeAllViews();
                        }
                        this.u.setVisibility(0);
                        this.u.addView(view2);
                        if (this.A != null) {
                            this.A.setVisibility(0);
                        }
                    }
                    i2 = 8;
                }
                if (this.C) {
                    this.v.setVisibility(0);
                } else {
                    this.v.setVisibility(i2);
                }
                if (this.C || this.D) {
                    ((com.sankuai.waimai.business.page.kingkong.a) F).bI.a((com.meituan.android.cube.pga.common.b<View>) this.z);
                    return;
                }
                return;
            }
            if (this.A != null) {
                i = 8;
                this.A.setVisibility(8);
            } else {
                i = 8;
            }
            if (this.v != null) {
                this.v.setVisibility(i);
            }
            if (this.u != null) {
                this.u.setVisibility(i);
            }
        }
    }

    private void a(Fragment fragment, FragmentManager fragmentManager) {
        Object[] objArr = {fragment, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170d671ef4639a828d2011f8173a7da3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170d671ef4639a828d2011f8173a7da3");
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        beginTransaction.remove(fragment);
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d242c66f1f378ac9eef5d3f7385c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d242c66f1f378ac9eef5d3f7385c49");
            return;
        }
        super.bE_();
        if (this.y != null) {
            b bVar = this.y;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6a9f49d05f7b53a8342fd270f1caf78e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6a9f49d05f7b53a8342fd270f1caf78e");
            } else if (bVar.f != null) {
                bVar.f.a();
            }
        }
        if (this.x != null) {
            a aVar = this.x;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3fc0e4c973fc142865f3e06385e6ed4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3fc0e4c973fc142865f3e06385e6ed4c");
            } else if (aVar.k != null) {
                aVar.k.a();
            }
        }
        if (this.E != null) {
            this.E.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1aaff4ac8ddcd103c18e6b56a6581cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1aaff4ac8ddcd103c18e6b56a6581cd");
        }
        if (this.E == null) {
            this.E = new f();
        }
        return this.E;
    }
}
