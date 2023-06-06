package com.sankuai.waimai.store.order.prescription.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.js.DialogJSNativeMethod;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.k;
import com.sankuai.waimai.mach.p;
import com.sankuai.waimai.platform.mach.statistics.CatJsNativeMethod;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
import com.sankuai.waimai.store.mach.SGHttpJSNativeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.platform.mach.a {
    public static ChangeQuickRedirect a;
    private String b;
    private boolean c;
    private boolean d;
    private final CatJsNativeMethod e;
    private final com.sankuai.waimai.platform.mach.statistics.d f;
    private Dialog g;
    private final List<com.sankuai.waimai.store.order.prescription.b> x;

    @Override // com.sankuai.waimai.platform.mach.a
    public final boolean a() {
        return false;
    }

    public static /* synthetic */ void a(b bVar) {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "378dab80341a87257d088737b22a3b88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "378dab80341a87257d088737b22a3b88");
            return;
        }
        if (bVar.d && !bVar.c) {
            z = true;
        }
        if (z) {
            bVar.b();
        }
    }

    public static /* synthetic */ void a(b bVar, int i, String str, Map map) {
        com.sankuai.waimai.store.callback.a a2;
        Object[] objArr = {Integer.valueOf(i), str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3e1103e8be8c3231636a277ded9a8dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3e1103e8be8c3231636a277ded9a8dc7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String a3 = com.sankuai.waimai.store.manager.judas.b.a((Object) bVar.j);
            switch (i) {
                case 1:
                    a2 = com.sankuai.waimai.store.manager.judas.b.a(bVar.b, a3, str);
                    break;
                case 2:
                    a2 = com.sankuai.waimai.store.manager.judas.b.b(bVar.b, a3, str);
                    break;
                default:
                    a2 = null;
                    break;
            }
            if (a2 != null) {
                if (map != null) {
                    a2.b(map);
                }
                a2.a();
            }
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.d = true;
        return true;
    }

    public b(Activity activity, String str, String str2) {
        super(activity, str);
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb71120fca938ef20c3a3a3fd0aca6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb71120fca938ef20c3a3a3fd0aca6b");
            return;
        }
        this.c = false;
        this.d = false;
        this.x = new ArrayList();
        this.b = str2;
        a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.order.prescription.view.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "babb947d05af29e6bf497d32c7208cef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "babb947d05af29e6bf497d32c7208cef");
                    return;
                }
                b.this.l.post(new Runnable() { // from class: com.sankuai.waimai.store.order.prescription.view.b.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e5e74f4e2175a06e5e2820bff51f7e2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e5e74f4e2175a06e5e2820bff51f7e2");
                        } else {
                            b.a(b.this);
                        }
                    }
                });
                b.a(b.this, true);
            }
        });
        this.f = new com.sankuai.waimai.platform.mach.statistics.d(activity);
        this.e = new CatJsNativeMethod(activity, str);
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void c() {
        this.c = true;
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final com.sankuai.waimai.mach.d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b24de3db4d72093462666164783b7f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b24de3db4d72093462666164783b7f") : new com.sankuai.waimai.mach.d() { // from class: com.sankuai.waimai.store.order.prescription.view.b.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
                if (r10 != false) goto L20;
             */
            @Override // com.sankuai.waimai.mach.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.String r10, java.lang.String r11, int r12, java.util.Map<java.lang.String, java.lang.Object> r13, com.sankuai.waimai.mach.node.a r14) {
                /*
                    r9 = this;
                    r0 = 5
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    r8 = 0
                    r0[r8] = r10
                    r10 = 1
                    r0[r10] = r11
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                    r1 = 2
                    r0[r1] = r11
                    r11 = 3
                    r0[r11] = r13
                    r11 = 4
                    r0[r11] = r14
                    com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.store.order.prescription.view.b.AnonymousClass2.a
                    java.lang.String r14 = "0d4d6eb286efefb917402a49c1e3a819"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r0
                    r2 = r9
                    r3 = r11
                    r5 = r14
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L2b
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r11, r8, r14)
                    return
                L2b:
                    if (r13 == 0) goto L6a
                    java.lang.String r11 = ""
                    java.lang.String r14 = "bid"
                    java.lang.Object r14 = r13.get(r14)
                    boolean r0 = r14 instanceof java.lang.String
                    if (r0 == 0) goto L3c
                    r11 = r14
                    java.lang.String r11 = (java.lang.String) r11
                L3c:
                    r14 = 0
                    java.lang.String r0 = "lab"
                    java.lang.Object r13 = r13.get(r0)
                    boolean r0 = r13 instanceof java.util.Map
                    if (r0 == 0) goto L64
                    java.util.Map r13 = (java.util.Map) r13
                    java.util.Set r0 = r13.keySet()
                    java.util.Iterator r0 = r0.iterator()
                L52:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L61
                    java.lang.Object r1 = r0.next()
                    boolean r1 = r1 instanceof java.lang.String
                    if (r1 != 0) goto L52
                    r10 = 0
                L61:
                    if (r10 == 0) goto L64
                    goto L65
                L64:
                    r13 = r14
                L65:
                    com.sankuai.waimai.store.order.prescription.view.b r10 = com.sankuai.waimai.store.order.prescription.view.b.this
                    com.sankuai.waimai.store.order.prescription.view.b.a(r10, r12, r11, r13)
                L6a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.order.prescription.view.b.AnonymousClass2.a(java.lang.String, java.lang.String, int, java.util.Map, com.sankuai.waimai.mach.node.a):void");
            }
        };
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083ff26ee126699d7e8f24c0d60a4679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083ff26ee126699d7e8f24c0d60a4679");
            return;
        }
        super.a(aVar);
        aVar.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.store.order.prescription.view.b.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.c
            public final void a(c.a aVar2, k kVar) {
                Object[] objArr2 = {aVar2, kVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23d862ec8147e368a274220a7426bdbd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23d862ec8147e368a274220a7426bdbd");
                } else {
                    WmMachImageLoaderUtil.a(aVar2, kVar);
                }
            }
        };
        aVar.a(new com.sankuai.waimai.store.mach.swiper.b());
        aVar.m = new com.sankuai.waimai.mach.component.interf.a() { // from class: com.sankuai.waimai.store.order.prescription.view.b.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.interf.a
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50a85ba82833acdd442f0007452f0d5f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50a85ba82833acdd442f0007452f0d5f")).longValue() : com.meituan.android.time.c.b();
            }
        };
        aVar.a(this.f);
        aVar.a(this.e);
        aVar.a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.store.order.prescription.view.b.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str, Map<String, String> map, j<ap> jVar) {
                Object[] objArr2 = {str, map, jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae6efacb0ecf8d2b2fba81b27ac65b3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae6efacb0ecf8d2b2fba81b27ac65b3b");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, b.this.i);
                }
            }
        });
        com.sankuai.waimai.store.mach.b bVar = new com.sankuai.waimai.store.mach.b() { // from class: com.sankuai.waimai.store.order.prescription.view.b.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d14ce68e55427e77c77a98c66deed0f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d14ce68e55427e77c77a98c66deed0f3");
                } else {
                    b.this.j();
                }
            }

            @Override // com.sankuai.waimai.store.mach.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cf983d25861b5b19284c4b4b6fb230a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cf983d25861b5b19284c4b4b6fb230a");
                } else {
                    b.this.k();
                }
            }
        };
        SGHttpJSNativeMethod sGHttpJSNativeMethod = new SGHttpJSNativeMethod(this.i);
        sGHttpJSNativeMethod.b = bVar;
        aVar.a(sGHttpJSNativeMethod);
        aVar.a(new DialogJSNativeMethod() { // from class: com.sankuai.waimai.store.order.prescription.view.b.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void showProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea464e45e675843c44f8edecd69e93ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea464e45e675843c44f8edecd69e93ac");
                } else {
                    b.this.j();
                }
            }

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void dismissProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07be4ce9931780f86169a01ac825fb4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07be4ce9931780f86169a01ac825fb4d");
                } else {
                    b.this.k();
                }
            }
        });
        aVar.l = new p() { // from class: com.sankuai.waimai.store.order.prescription.view.b.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.b
            public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a208c628fc415518e31af5555389ada2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a208c628fc415518e31af5555389ada2")).booleanValue();
                }
                com.sankuai.waimai.store.router.d.b(b.this.j, str, new Bundle(), com.sankuai.waimai.store.order.prescription.a.a);
                return true;
            }
        };
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7461b2ac7518e16e55cab3d46abc842b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7461b2ac7518e16e55cab3d46abc842b");
            return;
        }
        super.a(str, map);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (com.sankuai.waimai.store.order.prescription.b bVar : this.x) {
            if (bVar != null && str.equals(bVar.a())) {
                bVar.a(this, map);
            }
        }
    }

    public final void d(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "714bc75dd4c2e76399e4d1f684d63b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "714bc75dd4c2e76399e4d1f684d63b29");
            return;
        }
        this.c = false;
        this.d = false;
        a(str, "", map, h.a((Context) this.j) - h.a(this.j, 24.0f), 0);
    }

    public final void a(List<com.sankuai.waimai.store.order.prescription.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca64b9e2ede6af480c3b3d06766deca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca64b9e2ede6af480c3b3d06766deca6");
        } else if (list == null) {
        } else {
            this.x.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a70be9663c0ca972136185de5a50c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a70be9663c0ca972136185de5a50c7")).booleanValue();
        }
        if (com.sankuai.waimai.store.util.b.a(this.j)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.g);
        this.g = com.sankuai.waimai.foundation.core.utils.d.a(this.j);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3077ce6b32412062961fa9cccec8e705", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3077ce6b32412062961fa9cccec8e705")).booleanValue();
        }
        if (com.sankuai.waimai.store.util.b.a(this.j)) {
            return false;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.g);
        this.g = null;
        return true;
    }

    public final Activity e() {
        return this.j;
    }
}
