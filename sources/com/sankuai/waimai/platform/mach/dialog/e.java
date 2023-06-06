package com.sankuai.waimai.platform.mach.dialog;

import android.app.Activity;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.dialog.DialogModuleView;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends com.sankuai.waimai.platform.mach.a implements DialogModuleView.a {
    public static ChangeQuickRedirect d;
    private Rect a;
    private boolean b;
    private boolean c;
    @NonNull
    public DynamicDialog.d e;
    i f;
    private final com.sankuai.waimai.mach.container.e g;

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.b = true;
        return true;
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView.a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0da3d87645d69de4443a458cd462900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0da3d87645d69de4443a458cd462900");
            return;
        }
        o();
        this.b = false;
    }

    public e(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f4dc15d69daa3841bf26e2417735bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f4dc15d69daa3841bf26e2417735bf");
            return;
        }
        this.a = new Rect();
        this.e = DynamicDialog.d.d;
        this.g = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.platform.mach.dialog.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "068f69d2d1d514d07f55e4fd08c6cbce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "068f69d2d1d514d07f55e4fd08c6cbce");
                } else if (e.this.f != null) {
                    e.this.f.a(0, new f("mach render failed"));
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c2e8a37b2719ae22ece44292d576e4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c2e8a37b2719ae22ece44292d576e4d");
                } else if (e.this.f != null) {
                    e.this.f.a(1, new f("mach bundle load failed"));
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "052c5c486579a4921a51ff4933805602", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "052c5c486579a4921a51ff4933805602");
                } else if (e.this.f != null) {
                    e.this.f.a(2, new f("mach input params error"));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
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
                    com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.platform.mach.dialog.e.AnonymousClass1.a
                    java.lang.String r10 = "e2b82ca59c9bc908d52cb191f36b4a60"
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
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.mach.node.a r0 = r0.l()
                    r1 = 1
                    if (r0 == 0) goto L3d
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.mach.node.a r0 = r0.l()
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
                    if (r0 == 0) goto L58
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = com.sankuai.waimai.platform.mach.dialog.e.a(r0)
                    if (r0 == 0) goto L7d
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = com.sankuai.waimai.platform.mach.dialog.e.a(r0)
                    com.sankuai.waimai.platform.mach.dialog.e r2 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.mach.node.a r2 = r2.l()
                    r0.a(r2)
                    goto L7d
                L58:
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    android.view.ViewGroup r0 = r0.r()
                    r2 = 8
                    r0.setVisibility(r2)
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = com.sankuai.waimai.platform.mach.dialog.e.a(r0)
                    if (r0 == 0) goto L7d
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.platform.mach.dialog.i r0 = com.sankuai.waimai.platform.mach.dialog.e.a(r0)
                    r2 = 3
                    com.sankuai.waimai.platform.mach.dialog.f r3 = new com.sankuai.waimai.platform.mach.dialog.f
                    java.lang.String r4 = "mach template business failed"
                    r3.<init>(r4)
                    r0.a(r2, r3)
                L7d:
                    com.sankuai.waimai.platform.mach.dialog.e r0 = com.sankuai.waimai.platform.mach.dialog.e.this
                    com.sankuai.waimai.platform.mach.dialog.e.a(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.dialog.e.AnonymousClass1.d():void");
            }
        };
        a(this.g);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ad6d79fefb13d43e5b1d522dc6e750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ad6d79fefb13d43e5b1d522dc6e750");
            return;
        }
        f();
        this.c = false;
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.DialogModuleView.a
    public final void k() {
        boolean z;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f0c1a54dd9f1f6f19dc589ae3daa1a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f0c1a54dd9f1f6f19dc589ae3daa1a3");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e6043accb3aaecb4b47e67de2d1f945", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e6043accb3aaecb4b47e67de2d1f945")).booleanValue();
        } else if (this.b && !this.c) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b7825ad92ce007da8991e55809d0652", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b7825ad92ce007da8991e55809d0652")).booleanValue();
            } else {
                z = r().getLocalVisibleRect(this.a) && r().isShown();
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            b();
        }
    }

    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047b4317abf7dea563a4b4811bc7a8a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047b4317abf7dea563a4b4811bc7a8a6");
            return;
        }
        for (String str : map.keySet()) {
            a(str, map.get(str));
        }
        this.k.synchronizeEnvironment();
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void c() {
        this.c = true;
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1684181fcac558c3e811499c7551d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1684181fcac558c3e811499c7551d2");
            return;
        }
        if (TextUtils.equals(str, "close")) {
            this.e.a();
        } else if (TextUtils.equals(str, "close_with_type_event")) {
            this.e.b();
        } else if (this.e.c() != null) {
            this.e.c().a(str, map);
        }
        super.a(str, map);
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public com.sankuai.waimai.mach.d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1fd02ae00c2db479165e1cbf9283288", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1fd02ae00c2db479165e1cbf9283288");
        }
        if (this.e.f() != null) {
            return this.e.f();
        }
        return new com.sankuai.waimai.platform.dynamic.b(this.e.g(), AppUtil.generatePageInfoKey(this.e.h()));
    }
}
