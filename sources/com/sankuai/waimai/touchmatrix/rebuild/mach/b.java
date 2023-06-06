package com.sankuai.waimai.touchmatrix.rebuild.mach;

import android.app.Activity;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew;
import com.sankuai.waimai.touchmatrix.rebuild.mach.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends g implements c.a {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.mach.container.e A;
    com.sankuai.waimai.touchmatrix.rebuild.factory.c b;
    com.sankuai.waimai.touchmatrix.data.a c;
    @NonNull
    DynamicDialogNew.e d;
    e e;
    private Rect x;
    private boolean y;
    private boolean z;

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.y = true;
        return true;
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1afdec3a6f38febc1ef1e9a5720873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1afdec3a6f38febc1ef1e9a5720873");
            return;
        }
        o();
        this.y = false;
    }

    public b(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618a1f0ccf09cfe37de7ea3917651433", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618a1f0ccf09cfe37de7ea3917651433");
            return;
        }
        this.x = new Rect();
        this.d = DynamicDialogNew.e.c;
        this.A = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.touchmatrix.rebuild.mach.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8caa25fb7a4b5ef5c8a00c214ab0b636", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8caa25fb7a4b5ef5c8a00c214ab0b636");
                } else if (b.this.e != null) {
                    b.this.e.a(b.this, 0, new com.sankuai.waimai.touchmatrix.dialog.a("mach render failed"));
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "085fc85a0855e65f97b511c4ba02555b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "085fc85a0855e65f97b511c4ba02555b");
                } else if (b.this.e != null) {
                    b.this.e.a(b.this, 1, new com.sankuai.waimai.touchmatrix.dialog.a("mach bundle load failed"));
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43c247e089295f9fb67aa6f46965b382", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43c247e089295f9fb67aa6f46965b382");
                } else if (b.this.e != null) {
                    b.this.e.a(b.this, 2, new com.sankuai.waimai.touchmatrix.dialog.a("mach input params error"));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void d() {
                /*
                    r11 = this;
                    r0 = 0
                    java.lang.Object[] r8 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.AnonymousClass1.a
                    java.lang.String r10 = "a58edf7db646734c161b3ccab9ffbe88"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r8
                    r2 = r11
                    r3 = r9
                    r5 = r10
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L18
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                    return
                L18:
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    com.sankuai.waimai.mach.node.a r0 = r0.f()
                    r1 = 1
                    if (r0 == 0) goto L3d
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    com.sankuai.waimai.mach.node.a r0 = r0.f()
                    java.util.Map r0 = r0.h()
                    java.lang.String r2 = "should-show"
                    java.lang.Object r0 = r0.get(r2)
                    if (r0 == 0) goto L3d
                    java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L3d
                    boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Exception -> L3d
                    goto L3e
                L3d:
                    r0 = 1
                L3e:
                    if (r0 == 0) goto L54
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    com.sankuai.waimai.touchmatrix.rebuild.mach.e r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.a(r0)
                    if (r0 == 0) goto L7b
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    com.sankuai.waimai.touchmatrix.rebuild.mach.e r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.a(r0)
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r2 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    r0.a(r2)
                    goto L7b
                L54:
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    android.view.ViewGroup r0 = r0.r()
                    r2 = 8
                    r0.setVisibility(r2)
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    com.sankuai.waimai.touchmatrix.rebuild.mach.e r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.a(r0)
                    if (r0 == 0) goto L7b
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    com.sankuai.waimai.touchmatrix.rebuild.mach.e r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.a(r0)
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r2 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    r3 = 3
                    com.sankuai.waimai.touchmatrix.dialog.a r4 = new com.sankuai.waimai.touchmatrix.dialog.a
                    java.lang.String r5 = "mach template business failed"
                    r4.<init>(r5)
                    r0.a(r2, r3, r4)
                L7b:
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b r0 = com.sankuai.waimai.touchmatrix.rebuild.mach.b.this
                    com.sankuai.waimai.touchmatrix.rebuild.mach.b.a(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.rebuild.mach.b.AnonymousClass1.d():void");
            }
        };
        a(this.A);
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.c.a
    public final void b() {
        boolean z;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2319510d13950f29be23bc3c5a5a3074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2319510d13950f29be23bc3c5a5a3074");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e340c8343b88ac5942951dbf555f3e2", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e340c8343b88ac5942951dbf555f3e2")).booleanValue();
        } else if (this.y && !this.z) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7786b4eb7c4c2560e5b73ad74fa583e8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7786b4eb7c4c2560e5b73ad74fa583e8")).booleanValue();
            } else {
                z = r().getLocalVisibleRect(this.x) && r().isShown();
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            e();
        }
    }

    public final void a(Map<String, Object> map) {
        char c = 1;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f007153af8611976897f165dafef5ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f007153af8611976897f165dafef5ff");
            return;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            Object[] objArr2 = new Object[2];
            objArr2[0] = str;
            objArr2[c] = obj;
            ChangeQuickRedirect changeQuickRedirect2 = g.f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83a08b29172a138b082f92080c09d276", RobustBitConfig.DEFAULT_VALUE)) {
                g gVar = (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83a08b29172a138b082f92080c09d276");
            } else if (!TextUtils.isEmpty(str) && obj != null) {
                this.u.put(str, obj);
            }
            c = 1;
        }
        this.k.synchronizeEnvironment();
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.g
    public final void c() {
        this.z = true;
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.g, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        a.C1348a b;
        a.c cVar;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6642f73ca89ab7f6895fd0ba49c63aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6642f73ca89ab7f6895fd0ba49c63aec");
        } else if (TextUtils.equals(str, "close")) {
            this.d.a();
            Activity c = com.sankuai.waimai.touchmatrix.rebuild.message.a.c(this.c);
            j.a().a(2, this.c.k.bizId, c != null ? c.getClass().getSimpleName() : "");
        } else if (TextUtils.equals(str, "jump_with_close")) {
            if (this.c.k.bizId != null && (b = com.sankuai.waimai.touchmatrix.a.a().b(this.c.k.bizId)) != null && (cVar = b.b) != null) {
                cVar.b(map.get("url").toString());
            } else {
                com.sankuai.waimai.router.a.a(new com.sankuai.waimai.router.core.j(this.j, map.get("url").toString()));
            }
            if (this.b != null) {
                this.b.d();
            }
            Activity c2 = com.sankuai.waimai.touchmatrix.rebuild.message.a.c(this.c);
            j.a().a(3, this.c.k.bizId, c2 != null ? c2.getClass().getSimpleName() : "");
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.rebuild.mach.g
    public final com.sankuai.waimai.mach.d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59bb4e33c2b1c145f2f037d7b0e565b6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59bb4e33c2b1c145f2f037d7b0e565b6") : new com.sankuai.waimai.touchmatrix.views.a(com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(this.b.a()), AppUtil.generatePageInfoKey(this.j), this.c.e(), this.c.f());
    }
}
