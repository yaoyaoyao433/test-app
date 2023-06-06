package com.sankuai.waimai.business.im.common.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.model.e;
import com.sankuai.waimai.business.im.common.plugin.smartreply.c;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderStatusBannerView extends RelativeLayout {
    public static ChangeQuickRedirect a = null;
    private static final String k = "com.sankuai.waimai.business.im.common.view.OrderStatusBannerView";
    public c b;
    private TextView c;
    private TextView d;
    private TextView e;
    private Handler f;
    private long g;
    private long h;
    private boolean i;
    private Activity j;
    private boolean l;
    private a m;
    private e n;
    private boolean o;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface OrderStatusScene {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ void a(OrderStatusBannerView orderStatusBannerView, final e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderStatusBannerView, changeQuickRedirect, false, "716990f33691c52b62fe2a9e1a7b712f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderStatusBannerView, changeQuickRedirect, false, "716990f33691c52b62fe2a9e1a7b712f");
            return;
        }
        orderStatusBannerView.n = eVar;
        if (eVar.b() || eVar.a()) {
            orderStatusBannerView.setVisibility(8);
            return;
        }
        orderStatusBannerView.setVisibility(0);
        orderStatusBannerView.c.setText(eVar.b);
        orderStatusBannerView.d.setText(eVar.c);
        orderStatusBannerView.e.setText(eVar.d);
        orderStatusBannerView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce348598e3620d68b6b331ef2dbab305", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce348598e3620d68b6b331ef2dbab305");
                    return;
                }
                d.a aVar = new d.a();
                aVar.a("receive_user_type", Long.valueOf(OrderStatusBannerView.this.h));
                if (OrderStatusBannerView.this.b != null) {
                    OrderStatusBannerView.this.b.a(aVar);
                }
                JudasManualManager.a(d.r).a(aVar.a()).a(d.a).a();
                if (!OrderStatusBannerView.this.o || com.sankuai.waimai.foundation.core.a.f()) {
                    com.sankuai.waimai.foundation.router.a.a(OrderStatusBannerView.this.j, eVar.f);
                    return;
                }
                String str = com.sankuai.waimai.foundation.core.a.d() ? "meituanwaimai://waimai.meituan.com" : "";
                if (com.sankuai.waimai.foundation.core.a.e()) {
                    str = "imeituan://www.meituan.com";
                }
                com.sankuai.waimai.foundation.router.a.a(OrderStatusBannerView.this.j, str + "/mmp?appId=a8720b841a3d4b1d&targetPath=%2Fpackages%2Forder%2Forder-info-bargain%2Forder-info%3Fview_id%3D" + OrderStatusBannerView.this.g);
            }
        });
    }

    public static /* synthetic */ boolean b(OrderStatusBannerView orderStatusBannerView, boolean z) {
        orderStatusBannerView.i = false;
        return false;
    }

    public static /* synthetic */ void d(OrderStatusBannerView orderStatusBannerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderStatusBannerView, changeQuickRedirect, false, "a539280c0be52356e91139895b835f23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderStatusBannerView, changeQuickRedirect, false, "a539280c0be52356e91139895b835f23");
        } else if (orderStatusBannerView.m != null) {
            orderStatusBannerView.m.a();
            orderStatusBannerView.m = null;
        }
    }

    public OrderStatusBannerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc954fde38c509e69c2f06d7dfcd5344", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc954fde38c509e69c2f06d7dfcd5344");
            return;
        }
        this.f = new Handler();
        this.l = true;
        this.o = false;
    }

    public OrderStatusBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4244211d6ca84a1b3041c3e1ccb457ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4244211d6ca84a1b3041c3e1ccb457ef");
            return;
        }
        this.f = new Handler();
        this.l = true;
        this.o = false;
    }

    public OrderStatusBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a6eb01660a1ae18d595e60e37a22bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a6eb01660a1ae18d595e60e37a22bb");
            return;
        }
        this.f = new Handler();
        this.l = true;
        this.o = false;
    }

    public final void a(Activity activity, long j, long j2) {
        Object[] objArr = {activity, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6359f4c8a52bad6e0f7a7babc15ccfc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6359f4c8a52bad6e0f7a7babc15ccfc7");
            return;
        }
        this.j = activity;
        this.h = j;
        this.g = j2;
        this.l = true;
        this.i = true;
        setVisibility(8);
    }

    public void setRequestCallback(a aVar) {
        this.m = aVar;
    }

    public void setIsPhf(boolean z) {
        this.o = z;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae0a8dc85db6ba39c6a8b9a63ebbca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae0a8dc85db6ba39c6a8b9a63ebbca1");
        } else if (this.l) {
            a(0L);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801408a0cc5fdba9ddf22ca45465ce20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801408a0cc5fdba9ddf22ca45465ce20");
            return;
        }
        b.a(k);
        this.f.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f77be2fbe2a5ba4ced9c794e5501f3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f77be2fbe2a5ba4ced9c794e5501f3c4");
        } else {
            this.f.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[Catch: NumberFormatException -> 0x0091, TryCatch #0 {NumberFormatException -> 0x0091, blocks: (B:27:0x006c, B:29:0x0072, B:31:0x007c, B:32:0x0084, B:34:0x0088), top: B:41:0x006c }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r27 = this;
                        r7 = r27
                        r8 = 0
                        java.lang.Object[] r9 = new java.lang.Object[r8]
                        com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.AnonymousClass1.a
                        java.lang.String r11 = "7fd45094f32e9ca8ca6f15bba0987f51"
                        r3 = 0
                        r5 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r0 = r9
                        r1 = r27
                        r2 = r10
                        r4 = r11
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
                        if (r0 == 0) goto L1b
                        com.meituan.robust.PatchProxy.accessDispatch(r9, r7, r10, r8, r11)
                        return
                    L1b:
                        java.util.List r0 = com.sankuai.waimai.foundation.location.v2.h.u()
                        java.util.List r1 = com.sankuai.waimai.foundation.location.v2.h.s()
                        r2 = 3
                        r3 = 2
                        r4 = 0
                        if (r0 == 0) goto L5d
                        boolean r6 = r0.isEmpty()     // Catch: java.lang.NumberFormatException -> L59
                        if (r6 != 0) goto L5d
                        java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.NumberFormatException -> L59
                        r8 = r4
                        r10 = r8
                    L35:
                        boolean r6 = r0.hasNext()     // Catch: java.lang.NumberFormatException -> L90
                        if (r6 == 0) goto L5f
                        java.lang.Object r6 = r0.next()     // Catch: java.lang.NumberFormatException -> L90
                        com.sankuai.waimai.foundation.location.model.MtBackCityInfo r6 = (com.sankuai.waimai.foundation.location.model.MtBackCityInfo) r6     // Catch: java.lang.NumberFormatException -> L90
                        int r12 = r6.level     // Catch: java.lang.NumberFormatException -> L90
                        if (r12 != r3) goto L4d
                        java.lang.String r6 = r6.id     // Catch: java.lang.NumberFormatException -> L90
                        long r12 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L90
                        r8 = r12
                        goto L35
                    L4d:
                        int r12 = r6.level     // Catch: java.lang.NumberFormatException -> L90
                        if (r12 != r2) goto L35
                        java.lang.String r6 = r6.id     // Catch: java.lang.NumberFormatException -> L90
                        long r12 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L90
                        r10 = r12
                        goto L35
                    L59:
                        r8 = r4
                        r10 = r8
                        r12 = r10
                        goto L91
                    L5d:
                        r8 = r4
                        r10 = r8
                    L5f:
                        if (r1 == 0) goto L90
                        boolean r0 = r1.isEmpty()     // Catch: java.lang.NumberFormatException -> L90
                        if (r0 != 0) goto L90
                        java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.NumberFormatException -> L90
                        r12 = r4
                    L6c:
                        boolean r1 = r0.hasNext()     // Catch: java.lang.NumberFormatException -> L91
                        if (r1 == 0) goto L91
                        java.lang.Object r1 = r0.next()     // Catch: java.lang.NumberFormatException -> L91
                        com.sankuai.waimai.foundation.location.model.MtBackCityInfo r1 = (com.sankuai.waimai.foundation.location.model.MtBackCityInfo) r1     // Catch: java.lang.NumberFormatException -> L91
                        int r6 = r1.level     // Catch: java.lang.NumberFormatException -> L91
                        if (r6 != r3) goto L84
                        java.lang.String r1 = r1.id     // Catch: java.lang.NumberFormatException -> L91
                        long r14 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L91
                        r4 = r14
                        goto L6c
                    L84:
                        int r6 = r1.level     // Catch: java.lang.NumberFormatException -> L91
                        if (r6 != r2) goto L6c
                        java.lang.String r1 = r1.id     // Catch: java.lang.NumberFormatException -> L91
                        long r14 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L91
                        r12 = r14
                        goto L6c
                    L90:
                        r12 = r4
                    L91:
                        r23 = r4
                        r19 = r8
                        r21 = r10
                        r25 = r12
                        java.lang.Class<com.sankuai.waimai.business.im.common.api.WmImCommonService> r0 = com.sankuai.waimai.business.im.common.api.WmImCommonService.class
                        java.lang.Object r0 = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(r0)
                        r14 = r0
                        com.sankuai.waimai.business.im.common.api.WmImCommonService r14 = (com.sankuai.waimai.business.im.common.api.WmImCommonService) r14
                        com.sankuai.waimai.business.im.common.view.OrderStatusBannerView r0 = com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.this
                        long r15 = com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.a(r0)
                        com.sankuai.waimai.business.im.common.view.OrderStatusBannerView r0 = com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.this
                        long r17 = com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.b(r0)
                        rx.d r0 = r14.getOrderStatus(r15, r17, r19, r21, r23, r25)
                        com.sankuai.waimai.business.im.common.view.OrderStatusBannerView$1$1 r1 = new com.sankuai.waimai.business.im.common.view.OrderStatusBannerView$1$1
                        r1.<init>()
                        java.lang.String r2 = com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.d()
                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(r0, r1, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.common.view.OrderStatusBannerView.AnonymousClass1.run():void");
                }
            }, j);
        }
    }

    public final boolean c() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f885b642a8736b8902c9ad1ad0c555", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f885b642a8736b8902c9ad1ad0c555")).booleanValue();
        }
        if (this.n != null) {
            e eVar = this.n;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "7b83716988fd12d80c5526dd8d41af7e", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "7b83716988fd12d80c5526dd8d41af7e")).booleanValue();
            } else {
                z = (eVar.e == 7 || eVar.e == 8 || eVar.e == 9 || eVar.e == 10 || eVar.e == 16) ? false : true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int getOrderStatus() {
        if (this.n == null) {
            return 0;
        }
        return this.n.e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4587546b1a66f93802c2f540febf90e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4587546b1a66f93802c2f540febf90e2");
            return;
        }
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.wm_im_order_status_main_content);
        this.d = (TextView) findViewById(R.id.wm_im_order_status_sub_content);
        this.e = (TextView) findViewById(R.id.wm_im_order_status_deputy_content);
    }
}
