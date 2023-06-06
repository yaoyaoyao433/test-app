package com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.mach.b;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect f;
    private String d;
    private Map<String, Object> e;
    protected com.sankuai.waimai.bussiness.order.base.mach.b g;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_mach_container_layout;
    }

    public d(Context context, String str) {
        super(context);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f7f33977c1ec78f4b1183acd0a2a8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f7f33977c1ec78f4b1183acd0a2a8d");
        } else {
            this.d = str;
        }
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37cf953d896d917896febfee9c6a5ec5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37cf953d896d917896febfee9c6a5ec5");
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0613a6ff044efd34ee1c2af9b50c6b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0613a6ff044efd34ee1c2af9b50c6b83");
            return;
        }
        this.d = str;
        if (this.g != null) {
            this.g.a(str);
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public void b() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259023016f29ce552a66a0a71381f25e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259023016f29ce552a66a0a71381f25e");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.mach_container);
        Activity activity = (Activity) this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba6139ac297f4c6c4d1e0aa1b4f29d71", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba6139ac297f4c6c4d1e0aa1b4f29d71");
        } else if (this.c instanceof BaseActivity) {
            str = ((BaseActivity) this.c).w();
        } else {
            str = getClass().getSimpleName() + System.currentTimeMillis();
        }
        this.g = new com.sankuai.waimai.bussiness.order.base.mach.b(activity, str, "c_hgowsqb");
        Object[] objArr3 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect3 = f;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bbf3b4739eb74c5c2770b85c7ac05481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bbf3b4739eb74c5c2770b85c7ac05481");
            return;
        }
        this.g.a(viewGroup, this.d, "waimai");
        this.g.d = new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.base.mach.b.a
            public final void a(@NonNull String str2, @Nullable Map<String, Object> map) {
                Object[] objArr4 = {str2, map};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5b336c5d9cde20156aa28a3b6a79a3f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5b336c5d9cde20156aa28a3b6a79a3f5");
                } else {
                    d.this.a(str2, map);
                }
            }
        };
    }

    public final void a(int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object[] objArr = {0, 0, 0, 0};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40ef5b129ef1369a4e55bff7f3dc4c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40ef5b129ef1369a4e55bff7f3dc4c98");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(0, 0, 0, 0);
        this.b.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r14.equals("router_event") == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@android.support.annotation.NonNull java.lang.String r14, @android.support.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d.f
            java.lang.String r12 = "0c5686e1ad8811c36f0340051c9d84f7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            r1 = -1
            int r2 = r14.hashCode()
            r3 = -868944470(0xffffffffcc34f5aa, float:-4.743748E7)
            if (r2 == r3) goto L47
            r3 = -582264496(0xffffffffdd4b5950, float:-9.1580193E17)
            if (r2 == r3) goto L3d
            r3 = 51909156(0x3181224, float:4.468961E-37)
            if (r2 == r3) goto L33
            goto L52
        L33:
            java.lang.String r2 = "router_event"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L52
            goto L53
        L3d:
            java.lang.String r0 = "copy_event"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L52
            r0 = 0
            goto L53
        L47:
            java.lang.String r0 = "save_state_event"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = -1
        L53:
            switch(r0) {
                case 0: goto L9d;
                case 1: goto L71;
                case 2: goto L57;
                default: goto L56;
            }
        L56:
            goto Lc5
        L57:
            if (r15 != 0) goto L5a
            return
        L5a:
            java.lang.String r14 = "url"
            java.lang.Object r14 = r15.get(r14)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 != 0) goto Lc5
            android.content.Context r15 = r13.c
            com.sankuai.waimai.foundation.router.a.a(r15, r14)
            goto Lc5
        L71:
            if (r15 != 0) goto L74
            return
        L74:
            java.lang.String r14 = "stateKey"
            java.lang.Object r14 = r15.get(r14)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto Lc5
            java.lang.String r0 = "stateValue"
            java.lang.Object r15 = r15.get(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r13.e
            if (r0 != 0) goto L97
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13.e = r0
        L97:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r13.e
            r0.put(r14, r15)
            return
        L9d:
            if (r15 == 0) goto Lc5
            java.lang.String r14 = "content"
            java.lang.Object r14 = r15.get(r14)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r0 = "dj-b490da523971aa47"
            com.sankuai.waimai.bussiness.order.detailnew.util.b.a(r14, r0)
            java.lang.String r14 = "successDescription"
            java.lang.Object r14 = r15.get(r14)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 != 0) goto Lc4
            android.content.Context r15 = r13.c
            com.sankuai.waimai.foundation.utils.ae.a(r15, r14)
        Lc4:
            return
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d.a(java.lang.String, java.util.Map):void");
    }

    public final void a(e eVar) {
        boolean z = true;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f18fcc0dd53b3ac9c184e4df0a64c20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f18fcc0dd53b3ac9c184e4df0a64c20");
            return;
        }
        if (eVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "7b03e5c18696034e29d6c343ef52a032", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "7b03e5c18696034e29d6c343ef52a032")).booleanValue();
            } else if (TextUtils.isEmpty(eVar.c) || (TextUtils.isEmpty(eVar.f) && (eVar.h == null || eVar.h.isEmpty()))) {
                z = false;
            }
            if (z) {
                this.b.setVisibility(0);
                Map<String, Object> map = eVar.h;
                if (map == null || map.isEmpty()) {
                    map = com.sankuai.waimai.mach.utils.b.a(eVar.f);
                }
                map.put("machState", this.e);
                this.g.a(eVar.c, eVar.d, map, eVar.i);
                return;
            }
        }
        this.b.setVisibility(8);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3304147ad704c83e885c5ecf5ec3b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3304147ad704c83e885c5ecf5ec3b6");
        } else if (this.g != null) {
            this.g.e();
            this.g.a(true);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52ec1c087a1fca40283648aa19db580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52ec1c087a1fca40283648aa19db580");
        } else if (this.g != null) {
            this.g.onActivityDestroyed();
        }
    }
}
