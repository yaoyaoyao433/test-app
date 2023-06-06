package com.sankuai.waimai.business.search.ui.result.pouch;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.lifecycle.c;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.pouch.view.c {
    public static ChangeQuickRedirect a;
    public PouchDynamicAd b;
    private Context c;
    private ViewGroup d;

    @Override // com.sankuai.waimai.pouch.view.c
    public final void a() {
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9956dd3d657465b09c71d887cf1f70a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9956dd3d657465b09c71d887cf1f70a9");
        } else {
            this.c = context;
        }
    }

    public final void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e88d522c78dee32bf4880d62dcf280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e88d522c78dee32bf4880d62dcf280");
            return;
        }
        this.d = new FrameLayout(this.c);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        this.d.setMinimumHeight(1);
        viewGroup.addView(this.d, layoutParams);
    }

    public final void a(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acbc594d4dbc356a8ca21b2949c984ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acbc594d4dbc356a8ca21b2949c984ff");
        } else if (this.b == null || this.b != pouchDynamicAd) {
            this.b = pouchDynamicAd;
            com.sankuai.waimai.pouch.a pouchAds = this.b.getPouchAds();
            if (pouchAds != null) {
                if (pouchAds.b() != null && pouchAds.b().getCustomEnvParams() != null) {
                    pouchAds.b().getCustomEnvParams().put("index", "-1");
                    pouchAds.b().synchronizeEnvironment();
                }
                pouchAds.a(this.d, pouchDynamicAd);
                pouchAds.f = this;
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1206ab825e86230e1ffed45fbedf52b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1206ab825e86230e1ffed45fbedf52b8");
        } else if (this.d == null || this.b == null) {
        } else {
            this.d.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.pouch.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e63477ec77e2b3764a9971e0344036b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e63477ec77e2b3764a9971e0344036b8");
                    } else {
                        b.a(a.this.b);
                    }
                }
            }, 500L);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.c
    public final void b() {
        this.b = null;
    }

    @Override // com.sankuai.waimai.pouch.view.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093fa288bd35c83a7c827516ea07741c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093fa288bd35c83a7c827516ea07741c");
        } else {
            d();
        }
    }

    public final void a(boolean z, c.a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0dc470420de24053e6281d43ee5305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0dc470420de24053e6281d43ee5305");
        } else if (c.a.CONTAINER != aVar || this.d == null || this.b == null) {
        } else {
            this.d.postDelayed(new RunnableC0872a(this.b, z), 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.pouch.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class RunnableC0872a implements Runnable {
        public static ChangeQuickRedirect a;
        private WeakReference<PouchDynamicAd> b;
        private boolean c;

        public RunnableC0872a(PouchDynamicAd pouchDynamicAd, boolean z) {
            Object[] objArr = {pouchDynamicAd, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5aa8acc5c03be5c4d1d253487ca29c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5aa8acc5c03be5c4d1d253487ca29c");
                return;
            }
            this.b = new WeakReference<>(pouchDynamicAd);
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9432cb16705f26ca65c49d52e2fc54fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9432cb16705f26ca65c49d52e2fc54fc");
                return;
            }
            PouchDynamicAd pouchDynamicAd = this.b.get();
            if (pouchDynamicAd == null || pouchDynamicAd.getPouchAds() == null) {
                return;
            }
            if (this.c) {
                pouchDynamicAd.getPouchAds().d();
            } else {
                pouchDynamicAd.getPouchAds().e();
            }
        }
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545fb2b9acfa803387b9e2601f9ce378", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545fb2b9acfa803387b9e2601f9ce378")).intValue();
        }
        try {
            if (this.b == null || this.b.getPouchAds() == null || this.b.getPouchAds().b() == null || this.b.getPouchAds().b().getRootNode() == null) {
                return 0;
            }
            return this.b.getPouchAds().b().getRootNode().t();
        } catch (Exception unused) {
            return 0;
        }
    }
}
