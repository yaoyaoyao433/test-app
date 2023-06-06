package com.sankuai.waimai.rocks.page.block;

import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.block.e;
import com.sankuai.waimai.rocks.page.tablist.rocklist.a;
import com.sankuai.waimai.rocks.page.tablist.rocklist.b;
import com.sankuai.waimai.rocks.page.tablist.tab.RocksPagerAdapter;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.viewmodel.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a<FrameLayout>, com.sankuai.waimai.rocks.page.block.c, com.sankuai.waimai.rocks.page.a> {
    public static ChangeQuickRedirect r;
    public NestedRecyclerView s;
    public com.sankuai.waimai.rocks.view.a t;
    private com.sankuai.waimai.rocks.page.tablist.rocklist.b u;
    private com.sankuai.waimai.rocks.page.tablist.rocklist.b v;
    private int w;
    private com.sankuai.waimai.rocks.page.block.d x;
    private final com.sankuai.waimai.rocks.page.block.a y;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db6c4d8766b9bbd053c1c217420d0d6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.page.block.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db6c4d8766b9bbd053c1c217420d0d6") : new com.sankuai.waimai.rocks.page.block.c();
    }

    public b(com.sankuai.waimai.rocks.page.a aVar, com.sankuai.waimai.rocks.page.block.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d676210143c1149c9c507f507196522f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d676210143c1149c9c507f507196522f");
            return;
        }
        this.y = aVar2;
        a((b) aVar);
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a<FrameLayout> z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803adce0121953762b4a634d80c46212", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803adce0121953762b4a634d80c46212") : new com.meituan.android.cube.pga.view.a(m()) { // from class: com.sankuai.waimai.rocks.page.block.b.1
            public static ChangeQuickRedirect d;

            @Override // com.meituan.android.cube.pga.view.a
            @Nullable
            public final /* synthetic */ View c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90ced8e8a9cc1bc8b014859da2e4424d", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90ced8e8a9cc1bc8b014859da2e4424d") : new FrameLayout(b.this.m());
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        com.sankuai.waimai.rocks.view.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4796965c759965ab94f08d0c90407e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4796965c759965ab94f08d0c90407e");
            return;
        }
        super.s();
        this.s = new NestedRecyclerView(m());
        this.s.setClipToPadding(false);
        r().a().addView(this.s, new FrameLayout.LayoutParams(-1, -1));
        ((com.sankuai.waimai.rocks.page.a) F()).bH.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.rocks.page.block.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e11e0248e88fc8bfea8d31ac3d0fdc5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e11e0248e88fc8bfea8d31ac3d0fdc5");
                } else if (b.this.s != null) {
                    b.this.s.smoothScrollToPosition(0);
                }
            }
        });
        ((com.sankuai.waimai.rocks.page.a) F()).bz.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.rocks.page.block.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r12) {
                Object[] objArr2 = {r12};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea5fbd7c0e1f0f98e5efed05276aeadd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea5fbd7c0e1f0f98e5efed05276aeadd");
                    return;
                }
                if (b.this.u != null) {
                    b.this.u.a(true);
                }
                b.this.b(2);
            }
        });
        if (this.y.a() != null) {
            this.u = this.y.a().a(m(), a.EnumC1131a.GLOBAL);
            this.v = this.y.a().a(m(), a.EnumC1131a.AREA);
        }
        ((com.sankuai.waimai.rocks.page.a) F()).bs.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.rocks.page.block.a>() { // from class: com.sankuai.waimai.rocks.page.block.b.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.rocks.page.block.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b20707527373f6e26812cc9540b1390c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.page.block.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b20707527373f6e26812cc9540b1390c") : b.this.y;
            }
        };
        com.sankuai.waimai.rocks.page.block.a aVar = this.y;
        NestedRecyclerView nestedRecyclerView = this.s;
        Object[] objArr2 = {nestedRecyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.rocks.page.block.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1f09bb7029fb8195f7091a835304659d", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1f09bb7029fb8195f7091a835304659d");
        } else {
            Object[] objArr3 = {nestedRecyclerView, null};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.rocks.page.block.a.a;
            a2 = PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "21e9fbeddc7201da5aaea3fbeeb26ba3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "21e9fbeddc7201da5aaea3fbeeb26ba3") : aVar.a(nestedRecyclerView, null, null, null, null);
        }
        this.t = a2;
        NestedRecyclerView nestedRecyclerView2 = this.s;
        NestedRecyclerView.d dVar = new NestedRecyclerView.d() { // from class: com.sankuai.waimai.rocks.page.block.b.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.d
            public final void a(boolean z) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b40e22a99393457d3e298fae51c06227", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b40e22a99393457d3e298fae51c06227");
                } else {
                    ((com.sankuai.waimai.rocks.page.a) b.this.F()).bA.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
                }
            }
        };
        Object[] objArr4 = {dVar};
        ChangeQuickRedirect changeQuickRedirect4 = NestedRecyclerView.a;
        if (PatchProxy.isSupport(objArr4, nestedRecyclerView2, changeQuickRedirect4, false, "3a0fe8f738c85a68a898103b3e17af43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, nestedRecyclerView2, changeQuickRedirect4, false, "3a0fe8f738c85a68a898103b3e17af43");
        } else {
            nestedRecyclerView2.b.add(dVar);
        }
        this.s.setChildRecyclerViewHelper(new NestedRecyclerView.a() { // from class: com.sankuai.waimai.rocks.page.block.b.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.a
            public final RecyclerView a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "00357b12e051cd3a1025ea59ca9bedb1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (RecyclerView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "00357b12e051cd3a1025ea59ca9bedb1");
                }
                PagerAdapter pagerAdapter = ((com.sankuai.waimai.rocks.page.a) b.this.F()).bE.a().b;
                if (pagerAdapter instanceof RocksPagerAdapter) {
                    RocksPagerAdapter rocksPagerAdapter = (RocksPagerAdapter) pagerAdapter;
                    if (rocksPagerAdapter.c != null) {
                        return rocksPagerAdapter.c.N();
                    }
                    return null;
                }
                return null;
            }
        });
        this.w = 0;
        this.s.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.rocks.page.block.b.7
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr5 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e4ea4f88787ebdd1a514e9458fe75f7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e4ea4f88787ebdd1a514e9458fe75f7e");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                b.this.t.d.b(i);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr5 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0aec2bc0b9bfb8be8c366f7a45cc3ae9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0aec2bc0b9bfb8be8c366f7a45cc3ae9");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                b.this.w += i2;
                ((com.sankuai.waimai.rocks.page.a) b.this.F()).br.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(b.this.w));
            }
        });
        if (this.s.getAdapter() instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
            this.x = new com.sankuai.waimai.rocks.page.block.d(F());
            com.sankuai.waimai.rocks.page.block.d dVar2 = this.x;
            com.sankuai.waimai.rocks.page.tablist.rocklist.b bVar = this.v;
            Object[] objArr5 = {bVar};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.rocks.page.block.d.r;
            if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "b72534acab45630e09af5741b822d574", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "b72534acab45630e09af5741b822d574");
            } else if (bVar != null) {
                dVar2.u().addView(bVar.b());
            }
        }
        if (!(i() instanceof ViewGroup) || this.u == null) {
            return;
        }
        ((ViewGroup) i()).addView(this.u.b());
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ec3c69bda0ffb0c6d2eda0aafd48ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ec3c69bda0ffb0c6d2eda0aafd48ba");
        } else {
            a(i, (c) null);
        }
    }

    public final void a(int i, c cVar) {
        Object[] objArr = {Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7471896bdbe0e942cd5edb016f308fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7471896bdbe0e942cd5edb016f308fc3");
            return;
        }
        for (RocksServerModel rocksServerModel : new com.sankuai.waimai.rocks.page.utils.a(m()).a(this.y.b()).data.moduleList) {
            if (Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST.equalsIgnoreCase(rocksServerModel.layoutType)) {
                switch (i) {
                    case 0:
                        if (this.u != null) {
                            this.u.a(false);
                        }
                        a(true);
                        break;
                    case 1:
                        a(true);
                        break;
                    case 2:
                        if (this.u != null) {
                            this.u.a(true);
                            break;
                        }
                        break;
                }
                a(rocksServerModel, new C1130b(i, cVar));
            } else if ("tab_list".equalsIgnoreCase(rocksServerModel.layoutType)) {
                a(rocksServerModel, new a(rocksServerModel, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.meituan.android.cube.pga.type.a] */
    public void a(RocksServerModel rocksServerModel, e.a aVar) {
        e b;
        Object[] objArr = {rocksServerModel, aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c35f25a441121c796483f46576302b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c35f25a441121c796483f46576302b");
        } else if (rocksServerModel == null || (b = com.sankuai.waimai.rocks.utils.a.b(F(), rocksServerModel.moduleId)) == null) {
        } else {
            b.a(rocksServerModel.url, rocksServerModel.params, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de833309f906ba0872277d260d999d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de833309f906ba0872277d260d999d3");
        } else if (z) {
            if (this.v != null) {
                this.v.a(false);
            }
            this.t.d.a((com.meituan.android.cube.pga.block.a) this.x);
            this.t.d.c(1);
        } else {
            if (this.v != null) {
                this.v.a();
            }
            this.t.d.c(2);
            this.t.d.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.rocks.page.block.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1130b extends d {
        public static ChangeQuickRedirect a;
        c b;

        public C1130b(int i, c cVar) {
            super(i);
            Object[] objArr = {b.this, Integer.valueOf(i), cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46e18cf9ad85de0f415c772109b522ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46e18cf9ad85de0f415c772109b522ac");
            } else {
                this.b = cVar;
            }
        }

        @Override // com.sankuai.waimai.rocks.page.block.b.d, com.sankuai.waimai.rocks.page.block.e.a
        public final void a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee6d35e5a96160ee4615f03348bd9eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee6d35e5a96160ee4615f03348bd9eb");
                return;
            }
            if (this.b != null) {
                this.b.a();
            }
            if (this.e != 0 || b.this.u == null) {
                return;
            }
            b.this.u.a(str, str2, new b.a() { // from class: com.sankuai.waimai.rocks.page.block.b.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d78676482194f253e9f38a2f8cf7ecd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d78676482194f253e9f38a2f8cf7ecd");
                    } else {
                        b.this.b(0);
                    }
                }
            });
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.meituan.android.cube.pga.type.a] */
        @Override // com.sankuai.waimai.rocks.page.block.b.d, com.sankuai.waimai.rocks.page.block.e.a
        public final void a(RocksServerModel rocksServerModel) {
            com.meituan.android.cube.pga.block.a a2;
            Object[] objArr = {rocksServerModel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a8aae31c9fa9bc6676ed844e9fc65d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a8aae31c9fa9bc6676ed844e9fc65d");
                return;
            }
            if (rocksServerModel.moduleHeader != null && !TextUtils.isEmpty(rocksServerModel.moduleHeader.templateId) && (a2 = com.sankuai.waimai.rocks.utils.a.a((com.meituan.android.cube.pga.type.a) b.this.F(), rocksServerModel.moduleHeader.templateId)) != null) {
                b.this.b((b) a2);
                a2.c(rocksServerModel.moduleHeader);
                RecyclerView.a adapter = b.this.s.getAdapter();
                if (adapter instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
                    ((com.sankuai.waimai.rocks.view.recyclerview.a) adapter).f = a2;
                }
            }
            com.sankuai.waimai.rocks.view.a aVar = b.this.t;
            a.c cVar = new a.c() { // from class: com.sankuai.waimai.rocks.page.block.b.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.a.c
                public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
                }

                @Override // com.sankuai.waimai.rocks.view.a.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44590de00b8c6280bf2dbf72ae5edab8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44590de00b8c6280bf2dbf72ae5edab8");
                        return;
                    }
                    if (b.this.u != null) {
                        b.this.u.a();
                    }
                    if (C1130b.this.b != null) {
                        C1130b.this.b.a();
                    }
                }

                @Override // com.sankuai.waimai.rocks.view.a.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "175065658b249bde6a34495d0ac2e939", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "175065658b249bde6a34495d0ac2e939");
                    } else if (C1130b.this.b != null) {
                        C1130b.this.b.a();
                    }
                }
            };
            Object[] objArr2 = {rocksServerModel, (byte) 1, (byte) 0, (byte) 0, cVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.rocks.view.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3adc8f557e91cbd4313a025cdf7d3bf5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3adc8f557e91cbd4313a025cdf7d3bf5");
            } else {
                aVar.a(rocksServerModel, true, false, false, false, 0, cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends d {
        public static ChangeQuickRedirect a;
        final RocksServerModel b;

        public a(RocksServerModel rocksServerModel, int i) {
            super(i);
            Object[] objArr = {b.this, rocksServerModel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6854edd42d1aa4bd6f83dde997a2fa6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6854edd42d1aa4bd6f83dde997a2fa6");
            } else {
                this.b = rocksServerModel;
            }
        }

        @Override // com.sankuai.waimai.rocks.page.block.b.d, com.sankuai.waimai.rocks.page.block.e.a
        public final void a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b950d58620f5c906272c981dc24415a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b950d58620f5c906272c981dc24415a");
            } else if ((this.e == 0 || this.e == 1) && b.this.v != null) {
                b.this.t.d.h.a();
                b.this.v.a(str, str2, new b.a() { // from class: com.sankuai.waimai.rocks.page.block.b.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.b.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7da3bb37126e13c179d3901651e90c0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7da3bb37126e13c179d3901651e90c0");
                            return;
                        }
                        b.this.v.a(false);
                        b.this.a(a.this.b, a.this);
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.rocks.page.block.b.d, com.sankuai.waimai.rocks.page.block.e.a
        public final void a(RocksServerModel rocksServerModel) {
            Object[] objArr = {rocksServerModel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2619640f0df1f9ba54c8b1a7befd6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2619640f0df1f9ba54c8b1a7befd6f");
                return;
            }
            com.sankuai.waimai.rocks.view.viewmodel.d dVar = new com.sankuai.waimai.rocks.view.viewmodel.d();
            rocksServerModel.moduleId = "more_tab_list";
            rocksServerModel.templateId = "more_tab_list";
            rocksServerModel.dataId = "more_tab_list";
            com.sankuai.waimai.rocks.view.viewmodel.c cVar = new com.sankuai.waimai.rocks.view.viewmodel.c();
            cVar.u = rocksServerModel.templateId.hashCode();
            cVar.s = new com.sankuai.waimai.rocks.page.model.a(rocksServerModel);
            cVar.q = new com.meituan.android.cube.pga.viewmodel.a(rocksServerModel);
            dVar.o.add(cVar);
            com.sankuai.waimai.rocks.view.b bVar = new com.sankuai.waimai.rocks.view.b(b.this.m(), g.a(b.this.m()), 0, false);
            dVar.p = bVar.a();
            dVar.q = bVar.b();
            dVar.u = d.a.SECOND;
            b.this.t.d.a(dVar);
            b.this.a(false);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d implements e.a {
        public static ChangeQuickRedirect d;
        public int e;

        @Override // com.sankuai.waimai.rocks.page.block.e.a
        public void a(RocksServerModel rocksServerModel) {
        }

        @Override // com.sankuai.waimai.rocks.page.block.e.a
        public void a(String str, String str2) {
        }

        public d(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f3213a931e905357c562d23589dc72", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f3213a931e905357c562d23589dc72");
            } else {
                this.e = i;
            }
        }
    }
}
