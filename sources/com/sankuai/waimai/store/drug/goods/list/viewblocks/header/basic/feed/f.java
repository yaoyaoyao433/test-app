package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect b;
    @NonNull
    private final ViewGroup a;
    @NonNull
    final e c;
    private final List<com.sankuai.waimai.store.base.b> d;
    private LinearLayout.LayoutParams e;
    private LinearLayout.LayoutParams f;
    private boolean g;
    private boolean h;
    private int i;
    private com.sankuai.waimai.mach.container.d j;

    public static /* synthetic */ void a(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "2b59b14d31eea0209b46ad972796bd8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "2b59b14d31eea0209b46ad972796bd8a");
            return;
        }
        fVar.i--;
        if (fVar.i == 0) {
            com.sankuai.waimai.store.drug.goods.list.utils.a.f(fVar.c.e());
        }
    }

    public static /* synthetic */ void a(f fVar, boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "765afc660f3ee724b772d2b15a3c4034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "765afc660f3ee724b772d2b15a3c4034");
        } else if (z) {
            Context context = fVar.a.getContext();
            Context context2 = fVar;
            if (context != null) {
                context2 = fVar.a.getContext();
            }
            com.sankuai.waimai.store.drug.goods.list.utils.a.a(context2.hashCode());
        } else {
            Context context3 = fVar.a.getContext();
            Context context4 = fVar;
            if (context3 != null) {
                context4 = fVar.a.getContext();
            }
            com.sankuai.waimai.store.drug.goods.list.utils.a.a("render_error", str, context4.hashCode());
        }
    }

    public f(@NonNull e eVar, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {eVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5728c27c6ead90214eabe5454f83875", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5728c27c6ead90214eabe5454f83875");
            return;
        }
        this.d = new ArrayList();
        this.g = false;
        this.h = false;
        this.i = -1;
        this.j = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7bb0a5c67b7f1d6915ee6e5948267bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7bb0a5c67b7f1d6915ee6e5948267bd");
                    return;
                }
                super.e();
                f.a(f.this);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "063de3f289b14acefde9f4a12ca9b099", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "063de3f289b14acefde9f4a12ca9b099");
                    return;
                }
                super.c();
                com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "723ee0dd317767a8744a1798b8c4ce85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "723ee0dd317767a8744a1798b8c4ce85");
                    return;
                }
                super.b();
                com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f99069d630a4ec1cd22d87b23f41cc4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f99069d630a4ec1cd22d87b23f41cc4e");
                    return;
                }
                super.a();
                com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
            }
        };
        this.a = viewGroup;
        this.c = eVar;
        a(this.c, this.a);
    }

    public f(@NonNull e eVar, @NonNull ViewGroup viewGroup, boolean z) {
        Object[] objArr = {eVar, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0e6d98dc4973400caaa1399d4e0924", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0e6d98dc4973400caaa1399d4e0924");
            return;
        }
        this.d = new ArrayList();
        this.g = false;
        this.h = false;
        this.i = -1;
        this.j = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7bb0a5c67b7f1d6915ee6e5948267bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7bb0a5c67b7f1d6915ee6e5948267bd");
                    return;
                }
                super.e();
                f.a(f.this);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "063de3f289b14acefde9f4a12ca9b099", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "063de3f289b14acefde9f4a12ca9b099");
                    return;
                }
                super.c();
                com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "723ee0dd317767a8744a1798b8c4ce85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "723ee0dd317767a8744a1798b8c4ce85");
                    return;
                }
                super.b();
                com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f99069d630a4ec1cd22d87b23f41cc4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f99069d630a4ec1cd22d87b23f41cc4e");
                    return;
                }
                super.a();
                com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
            }
        };
        this.a = viewGroup;
        this.c = eVar;
        a(this.c, this.a);
        this.g = z;
    }

    private void a(@NonNull e eVar, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {eVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e1baf2a190be69434f540ad0fe6b713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e1baf2a190be69434f540ad0fe6b713");
            return;
        }
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_1);
        int dimensionPixelSize2 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_20);
        int dimensionPixelSize3 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_15);
        this.e = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
        this.e.leftMargin = dimensionPixelSize2;
        this.e.rightMargin = dimensionPixelSize2;
        this.f = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
        this.f.leftMargin = dimensionPixelSize3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r2 != 5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List<com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc> r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.f.b
            java.lang.String r10 = "194216dba36a4f0156a1d38f9ec33435"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1b:
            com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.e r0 = r11.c
            com.sankuai.waimai.store.platform.domain.manager.poi.a r0 = r0.e()
            com.sankuai.waimai.store.drug.goods.list.utils.a.e(r0)
            android.view.ViewGroup r0 = r11.a
            r0.removeAllViews()
            r11.f()
            boolean r0 = com.sankuai.shangou.stone.util.a.b(r12)
            if (r0 == 0) goto L33
            return
        L33:
            int r0 = r12.size()
            r11.i = r0
            int r0 = r12.size()
        L3d:
            if (r8 >= r0) goto L77
            java.lang.Object r1 = r12.get(r8)
            com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc r1 = (com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc) r1
            if (r1 == 0) goto L74
            java.util.Map<java.lang.String, java.lang.Object> r2 = r1.jsonData
            if (r2 != 0) goto L4c
            goto L74
        L4c:
            int r2 = r11.a(r1)
            r3 = 0
            if (r2 == 0) goto L5f
            r4 = 3
            if (r2 == r4) goto L5a
            r4 = 5
            if (r2 == r4) goto L5f
            goto L63
        L5a:
            android.view.View r3 = r11.a(r1, r8)
            goto L63
        L5f:
            android.view.View r3 = r11.b(r1, r8)
        L63:
            if (r3 == 0) goto L74
            android.view.ViewGroup r2 = r11.a
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r5 = -1
            r6 = -2
            r4.<init>(r5, r6)
            r2.addView(r3, r4)
            r11.a(r12, r8, r1)
        L74:
            int r8 = r8 + 1
            goto L3d
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.f.a(java.util.List):void");
    }

    public void a(List<BaseModuleDesc> list, int i, @NonNull BaseModuleDesc baseModuleDesc) {
        boolean z = false;
        Object[] objArr = {list, Integer.valueOf(i), baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4b31a7bc737b6379524a6a789e8be5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4b31a7bc737b6379524a6a789e8be5c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a70d136ba45d4fb088d13ba9a3db223", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a70d136ba45d4fb088d13ba9a3db223")).booleanValue();
        } else if (this.c != null && this.c.e() != null && this.c.e().b != null) {
            z = w.e(this.c.e().b);
        }
        if (z) {
            if (i != com.sankuai.shangou.stone.util.a.a((List) list) - 1) {
                TextView textView = new TextView(this.a.getContext());
                textView.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.a.getContext(), R.color.wm_sg_color_EFEFEF));
                this.a.addView(textView, this.f);
            }
        } else if (i == com.sankuai.shangou.stone.util.a.a((List) list) - 1 || TextUtils.equals(baseModuleDesc.templateId, "supermarket-poi-header-info")) {
        } else {
            TextView textView2 = new TextView(this.a.getContext());
            textView2.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.a.getContext(), R.color.wm_sg_color_EFEFEF));
            this.a.addView(textView2, this.e);
        }
    }

    private View a(@NonNull BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f26560fc1ae9d604aa53202e0510d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f26560fc1ae9d604aa53202e0510d1");
        }
        g gVar = new g(this.c.f(), baseModuleDesc);
        if (d()) {
            this.h = true;
            gVar.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.f.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void e() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7a6a796abcf3454ce21b7d88da5d6f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7a6a796abcf3454ce21b7d88da5d6f0");
                        return;
                    }
                    super.e();
                    f.a(f.this);
                    f.a(f.this, true, "");
                }

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99680f9305662fa74ce8735a5f37354f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99680f9305662fa74ce8735a5f37354f");
                        return;
                    }
                    super.c();
                    com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
                    f.a(f.this, false, "onInputParamsError");
                }

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "639120bafec74da597b2abe4b189ec41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "639120bafec74da597b2abe4b189ec41");
                        return;
                    }
                    super.b();
                    com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
                    f.a(f.this, false, "onMachBundleLoadFailure");
                }

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1e66b712284d77bf43b2bb5ec4ae129", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1e66b712284d77bf43b2bb5ec4ae129");
                        return;
                    }
                    super.a();
                    com.sankuai.waimai.store.drug.goods.list.utils.a.g(f.this.c.e());
                    f.a(f.this, false, "onMachRenderFailure");
                }
            });
        } else {
            gVar.a(this.j);
        }
        this.d.add(gVar);
        View createView = gVar.createView(this.a);
        gVar.a(baseModuleDesc, i, this.g);
        return createView;
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c8e1c66a61a9a795dc3dd1a2df413f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c8e1c66a61a9a795dc3dd1a2df413f")).booleanValue() : !this.h && e();
    }

    private View b(@NonNull BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd9936942fabb1b80e7491ddc6bbcd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd9936942fabb1b80e7491ddc6bbcd0");
        }
        b bVar = new b(this.c.f(), baseModuleDesc);
        bVar.a(this.j);
        this.d.add(bVar);
        View createView = bVar.createView(this.a);
        bVar.a(baseModuleDesc, i, this.g);
        return createView;
    }

    private boolean e() {
        Intent intent;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37be4b7473a01dd4bc03f9c33964df79", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37be4b7473a01dd4bc03f9c33964df79")).booleanValue() : ((this.a.getContext() instanceof Activity) && (intent = ((Activity) this.a.getContext()).getIntent()) != null && com.sankuai.waimai.platform.utils.f.a(intent, "from_sg", false)) ? false : true;
    }

    private int a(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf20354f9a8f2229a89bd13642b8296", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf20354f9a8f2229a89bd13642b8296")).intValue();
        }
        if (baseModuleDesc == null) {
            return 4;
        }
        if ("native".equals(baseModuleDesc.nativeId)) {
            if ("food_discount".equals(baseModuleDesc.moduleId)) {
                baseModuleDesc.templateId = "supermarket-drug-poi-header-coupon";
                return 5;
            }
        } else if ("mach".equals(baseModuleDesc.nativeId)) {
            return "food_discount".equals(baseModuleDesc.moduleId) ? 5 : 3;
        }
        return 4;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41e9c85155f6f6ac9d932142140b58b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41e9c85155f6f6ac9d932142140b58b")).intValue() : this.a.getHeight();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "300b8321dd770ac6c15c9b33a1837fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "300b8321dd770ac6c15c9b33a1837fb7");
        } else {
            f();
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be064ab644ffbcb545394a765da10197", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be064ab644ffbcb545394a765da10197");
            return;
        }
        for (com.sankuai.waimai.store.base.b bVar : this.d) {
            if (bVar != null) {
                bVar.onDestroy();
            }
        }
        this.d.clear();
    }

    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3651ae4af7159479cda2ed9ef38077b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3651ae4af7159479cda2ed9ef38077b0");
        }
        if (com.sankuai.shangou.stone.util.a.b(this.d)) {
            return null;
        }
        for (com.sankuai.waimai.store.base.b bVar : this.d) {
            if (bVar instanceof b) {
                return bVar.getView();
            }
        }
        return null;
    }
}
