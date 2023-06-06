package com.sankuai.waimai.store.mach.machfeed;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends a<BaseModuleDesc, View> {
    public static ChangeQuickRedirect b;
    private final SCBaseActivity c;
    private final Map<BaseModuleDesc, d> d;
    private String e;
    private String f;

    public static /* synthetic */ void a(c cVar, BaseModuleDesc baseModuleDesc, String str) {
        Object[] objArr = {baseModuleDesc, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "b4de8f46406c794dea0230fe0ede9a42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "b4de8f46406c794dea0230fe0ede9a42");
            return;
        }
        SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(c.class.getSimpleName());
        sGCommonMachReportInfo.e = baseModuleDesc.templateId;
        sGCommonMachReportInfo.d = 4;
        if (!t.a(str)) {
            sGCommonMachReportInfo.i = str;
        }
        com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r2.equals("DrugHomeActivity") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.sankuai.waimai.store.base.SCBaseActivity r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r0 = 10
            r7.<init>(r0)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.store.mach.machfeed.c.b
            java.lang.String r13 = "a2c4f423c7d707d15f0ffc65cff6caa9"
            r3 = 0
            r5 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r0 = r10
            r1 = r19
            r2 = r12
            r4 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L25
            com.meituan.robust.PatchProxy.accessDispatch(r10, r7, r12, r11, r13)
            return
        L25:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.d = r0
            java.lang.String r0 = "supermarket"
            r7.e = r0
            r0 = 0
            r7.f = r0
            r7.c = r8
            java.lang.String r1 = r20.t()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lcb
            java.lang.String r1 = r20.t()
            r7.e = r1
            java.lang.String r1 = "drug"
            java.lang.String r2 = r7.e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lcb
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r11] = r8
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = com.sankuai.waimai.drug.e.a
            java.lang.String r4 = "f2bd528c9707092b27a5c3c70388964a"
            r13 = 0
            r15 = 1
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            r12 = r2
            r14 = r3
            r16 = r4
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L70
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r0, r3, r9, r4)
            java.lang.String r0 = (java.lang.String) r0
            goto Lc9
        L70:
            java.lang.Class r2 = r20.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -1172358019(0xffffffffba1f3c7d, float:-6.074382E-4)
            if (r4 == r5) goto Laf
            r1 = -65776402(0xfffffffffc1454ee, float:-3.08073E36)
            if (r4 == r1) goto La6
            r1 = 1627193210(0x60fcff7a, float:1.4584339E20)
            if (r4 == r1) goto L9c
            r1 = 1911507865(0x71ef4b99, float:2.3698659E30)
            if (r4 == r1) goto L92
            goto Lb9
        L92:
            java.lang.String r1 = "DrugPoiActivity"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lb9
            r9 = 0
            goto Lba
        L9c:
            java.lang.String r1 = "GlobalSearchActivity"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lb9
            r9 = 3
            goto Lba
        La6:
            java.lang.String r1 = "DrugHomeActivity"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lb9
            goto Lba
        Laf:
            java.lang.String r4 = "DrugGoodDetailActivity"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto Lb9
            r9 = 2
            goto Lba
        Lb9:
            r9 = -1
        Lba:
            switch(r9) {
                case 0: goto Lc7;
                case 1: goto Lc4;
                case 2: goto Lc1;
                case 3: goto Lbe;
                default: goto Lbd;
            }
        Lbd:
            goto Lc9
        Lbe:
            java.lang.String r0 = "MachDrugSearchResultPage"
            goto Lc9
        Lc1:
            java.lang.String r0 = "MachDrugSpuDetailPage"
            goto Lc9
        Lc4:
            java.lang.String r0 = "MachDrugHomePage"
            goto Lc9
        Lc7:
            java.lang.String r0 = "MachDrugPoiPage"
        Lc9:
            r7.f = r0
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mach.machfeed.c.<init>(com.sankuai.waimai.store.base.SCBaseActivity):void");
    }

    @NonNull
    public final View a(BaseModuleDesc baseModuleDesc, Map<String, Object> map, Map<String, com.sankuai.waimai.store.mach.event.b> map2, boolean z, com.sankuai.waimai.mach.container.d dVar) {
        Object[] objArr = {baseModuleDesc, map, map2, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c025b497869659217fee4aa65899a54", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c025b497869659217fee4aa65899a54");
        }
        if (baseModuleDesc == null) {
            return a((BaseModuleDesc.a) null);
        }
        View a = a((c) baseModuleDesc);
        if (a(a)) {
            if (z) {
                a = b(baseModuleDesc, map, map2, dVar);
            } else {
                a = a(baseModuleDesc, map, map2, dVar);
            }
            a(baseModuleDesc, a);
        } else {
            b(a);
        }
        return a;
    }

    private boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e678cb97b370004d36fe0fad5c125a11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e678cb97b370004d36fe0fad5c125a11")).booleanValue();
        }
        if (view == null) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent == null || (parent instanceof ViewGroup)) ? false : true;
    }

    private void b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f217e3e689155925719dd1ff8b575b6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f217e3e689155925719dd1ff8b575b6f");
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    private FrameLayout a(BaseModuleDesc.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "790d828cb5ab17857d007af6df8cf286", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "790d828cb5ab17857d007af6df8cf286");
        }
        FrameLayout frameLayout = new FrameLayout(this.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (aVar != null) {
            frameLayout.setPadding(0, h.a(this.c, aVar.a), 0, h.a(this.c, aVar.b));
        }
        return frameLayout;
    }

    private View a(@NonNull BaseModuleDesc baseModuleDesc, Map<String, Object> map, Map<String, com.sankuai.waimai.store.mach.event.b> map2, com.sankuai.waimai.mach.container.d dVar) {
        Object[] objArr = {baseModuleDesc, map, map2, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263c365ff0fb4156da91023fcea3c25c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263c365ff0fb4156da91023fcea3c25c");
        }
        FrameLayout a = a(baseModuleDesc.layoutInfo);
        final d dVar2 = new d(this.c, this.c.w()) { // from class: com.sankuai.waimai.store.mach.machfeed.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5247f71756b795fdbd4846532e8a24e0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5247f71756b795fdbd4846532e8a24e0") : new com.sankuai.waimai.store.mach.logger.a(a());
            }
        };
        if (dVar != null) {
            dVar2.a(dVar);
        }
        dVar2.a(new com.sankuai.waimai.store.mach.clickhandler.a());
        dVar2.a(a, a(baseModuleDesc), this.e);
        com.sankuai.waimai.store.mach.medhod.a aVar = new com.sankuai.waimai.store.mach.medhod.a();
        aVar.a(map2);
        dVar2.g = aVar;
        dVar2.a(new e() { // from class: com.sankuai.waimai.store.mach.machfeed.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c45159535d6f04fee7833a27fda16a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c45159535d6f04fee7833a27fda16a8");
                } else if (dVar2 == null || dVar2.r() == null) {
                } else {
                    dVar2.r().post(new Runnable() { // from class: com.sankuai.waimai.store.mach.machfeed.c.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d9430f54a9dc337f08f0081fcb32ae2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d9430f54a9dc337f08f0081fcb32ae2");
                            } else if (dVar2 != null) {
                                dVar2.g();
                            }
                        }
                    });
                }
            }
        });
        a(dVar2, baseModuleDesc, map);
        this.d.put(baseModuleDesc, dVar2);
        return a;
    }

    private View b(@NonNull final BaseModuleDesc baseModuleDesc, Map<String, Object> map, Map<String, com.sankuai.waimai.store.mach.event.b> map2, com.sankuai.waimai.mach.container.d dVar) {
        Object[] objArr = {baseModuleDesc, map, map2, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac6fe05857778e487cb638e4310309a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac6fe05857778e487cb638e4310309a");
        }
        final FrameLayout a = a(baseModuleDesc.layoutInfo);
        final d dVar2 = new d(this.c, this.c.w()) { // from class: com.sankuai.waimai.store.mach.machfeed.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc2440d067dd76970d3d89bd93e221e6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc2440d067dd76970d3d89bd93e221e6") : new com.sankuai.waimai.store.mach.logger.a(a());
            }
        };
        if (dVar != null) {
            dVar2.a(dVar);
        }
        HashMap hashMap = new HashMap(baseModuleDesc.jsonData);
        map.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
        hashMap.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, map);
        dVar2.a(new com.sankuai.waimai.store.mach.clickhandler.a());
        dVar2.a(this.c, a, baseModuleDesc.templateId, hashMap, a(baseModuleDesc), this.e, new d.c() { // from class: com.sankuai.waimai.store.mach.machfeed.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4d338593a71b66dc8b92126c16cc2a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4d338593a71b66dc8b92126c16cc2a4");
                    return;
                }
                Mach f = dVar2.f();
                if (f != null && f.getRootNode() != null) {
                    dVar2.r().setVisibility(0);
                    f.attachPreRenderNode(f.getRootNode(), null, a, null);
                    Iterator<com.sankuai.waimai.mach.component.interf.b> it = f.getViewTreeObservers().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    for (g gVar : f.getRenderListeners()) {
                        gVar.b();
                        gVar.a(0);
                    }
                    return;
                }
                dVar2.r().setVisibility(8);
                c.a(c.this, baseModuleDesc, "Sync Mach or MachRootNode Null");
            }

            @Override // com.sankuai.waimai.store.mach.d.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5173265a13cc20175ef0fa2d6af41e0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5173265a13cc20175ef0fa2d6af41e0c");
                    return;
                }
                dVar2.r().setVisibility(8);
                c.a(c.this, baseModuleDesc, "");
            }
        });
        com.sankuai.waimai.store.mach.medhod.a aVar = new com.sankuai.waimai.store.mach.medhod.a();
        aVar.a(map2);
        dVar2.g = aVar;
        dVar2.a(new e() { // from class: com.sankuai.waimai.store.mach.machfeed.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "babd6e0d19cfcfe7c5822476c29b0fcd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "babd6e0d19cfcfe7c5822476c29b0fcd");
                } else if (dVar2 == null || dVar2.r() == null) {
                } else {
                    dVar2.r().post(new Runnable() { // from class: com.sankuai.waimai.store.mach.machfeed.c.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a04f8bcc2b028281969a55646fbac9a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a04f8bcc2b028281969a55646fbac9a");
                            } else if (dVar2 != null) {
                                dVar2.g();
                            }
                        }
                    });
                }
            }
        });
        this.d.put(baseModuleDesc, dVar2);
        return a;
    }

    public final void a(@NonNull BaseModuleDesc baseModuleDesc, String str, Map<String, Object> map) {
        Object[] objArr = {baseModuleDesc, str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba20c76531072520bd033a5b0b26f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba20c76531072520bd033a5b0b26f2f");
            return;
        }
        d dVar = this.d.get(baseModuleDesc);
        if (dVar != null) {
            dVar.b(str, map);
        }
    }

    private void a(final d dVar, @NonNull final BaseModuleDesc baseModuleDesc, Map<String, Object> map) {
        Object[] objArr = {dVar, baseModuleDesc, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a171346f59447f23e176eaa381424e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a171346f59447f23e176eaa381424e7");
        } else if (baseModuleDesc.jsonData == null) {
        } else {
            final HashMap hashMap = new HashMap(baseModuleDesc.jsonData);
            map.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
            hashMap.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, map);
            dVar.a(b(baseModuleDesc), new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.mach.machfeed.c.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffe05286deb5a4c7a80f448a28545fa2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffe05286deb5a4c7a80f448a28545fa2");
                        return;
                    }
                    dVar.r().setVisibility(0);
                    dVar.a(eVar, hashMap);
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "170e3c7dc75511d3277aec416f3aef68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "170e3c7dc75511d3277aec416f3aef68");
                        return;
                    }
                    dVar.r().setVisibility(8);
                    SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(c.class.getSimpleName());
                    sGCommonMachReportInfo.e = baseModuleDesc.templateId;
                    sGCommonMachReportInfo.d = 4;
                    sGCommonMachReportInfo.i = bVar.a();
                    com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                }
            });
        }
    }

    private String a(@NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202f26137f9a6c9bd7156fb02594d8f5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202f26137f9a6c9bd7156fb02594d8f5") : TextUtils.isEmpty(this.f) ? String.format("sm_mach_feed_%s", baseModuleDesc.moduleId) : this.f;
    }

    @NonNull
    private com.sankuai.waimai.mach.manager.load.a b(@NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b56bc651b864e8440b185c402a261919", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.load.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b56bc651b864e8440b185c402a261919");
        }
        a.C1015a c1015a = new a.C1015a();
        c1015a.c = baseModuleDesc.templateId;
        c1015a.b = baseModuleDesc.templateId;
        c1015a.d = a(baseModuleDesc);
        c1015a.e = this.e;
        return c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
    }
}
