package com.sankuai.waimai.popup;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.WMHomePageFragment;
import com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper;
import com.sankuai.waimai.business.page.home.model.HomePagePoiListResponse;
import com.sankuai.waimai.business.page.home.model.MarketingWindow;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
import com.sankuai.waimai.popup.c;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMSkyFallPopup extends WMBasePopup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ai<WMSkyFallPopup> mInstance = new ai<>();
    public static HomePagePoiListResponse skyFallCouponResponseCache;
    private c.b callback;
    private boolean hasLoadMultipersonPage;
    private c mActInfoController;
    private ai<MainActivity> mActivity;
    private SkyFallDynamicDialogHelper mDynamicDialogHelper;
    private WMHomePageFragment mFragment;
    private b.a mListener;

    public WMSkyFallPopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "418d800bf6083eb728e05f5ade285ed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "418d800bf6083eb728e05f5ade285ed3");
            return;
        }
        this.mActivity = new ai<>();
        this.callback = new c.b() { // from class: com.sankuai.waimai.popup.WMSkyFallPopup.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.popup.c.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55cb2cdd93da377872207a23ed936c8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55cb2cdd93da377872207a23ed936c8c");
                } else {
                    WMSkyFallPopup.this.onCompletePopup();
                }
            }

            @Override // com.sankuai.waimai.popup.c.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8613168775498f461a070b565d0db8cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8613168775498f461a070b565d0db8cf");
                } else {
                    WMSkyFallPopup.this.onCompletePopup();
                }
            }
        };
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldHandle(WMBasePopup.b bVar) {
        boolean z = false;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8714b960332d27d2b533245d078660df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8714b960332d27d2b533245d078660df")).booleanValue();
        }
        boolean booleanValue = (bVar.d == null || !bVar.d.containsKey("performance_skip_sky_fall")) ? false : ((Boolean) bVar.d.get("performance_skip_sky_fall")).booleanValue();
        boolean a = com.sankuai.waimai.popup.util.a.a();
        if (!booleanValue && !a) {
            z = true;
        }
        com.sankuai.waimai.platform.popup.d a2 = com.sankuai.waimai.platform.popup.d.a();
        a2.b("skyfall popup is forceUpdateShowing:trueis performance disable skyfall: " + booleanValue + ", isAccessibilityEnable:" + a);
        return z;
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldSendToNext(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d810fe361955e3abcb42ffcead0723c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d810fe361955e3abcb42ffcead0723c")).booleanValue();
        }
        if (this.hasLoadMultipersonPage || this.mActivity.a() == null) {
            return true;
        }
        this.hasLoadMultipersonPage = true;
        return !e.a((Activity) this.mActivity.a());
    }

    public static WMSkyFallPopup getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "046a72ab6fbbcbdf96e2aadee5af49cf", RobustBitConfig.DEFAULT_VALUE) ? (WMSkyFallPopup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "046a72ab6fbbcbdf96e2aadee5af49cf") : mInstance.a();
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void preparePopupData(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a1ef1d7dbebc5c0ccf20d4769db7d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a1ef1d7dbebc5c0ccf20d4769db7d91");
            return;
        }
        mInstance.a(this);
        if (skyFallCouponResponseCache == null) {
            interfaceC1075b.a(false, bVar);
            return;
        }
        WMBasePopup.b bVar2 = new WMBasePopup.b();
        Activity activity = getContext().a.get();
        if (activity instanceof MainActivity) {
            this.mActivity.a((MainActivity) activity);
        }
        if (this.mActivity.a() != null) {
            this.mFragment = (WMHomePageFragment) this.mActivity.a().a(0, WMHomePageFragment.class);
            if (this.mFragment != null) {
                if (this.mActInfoController == null) {
                    this.mActInfoController = new c(this.mActivity.a(), this.mFragment, "p_homepage", null, this.callback);
                    boolean a = e.a(this.mActivity.a().getIntent());
                    HashMap hashMap = new HashMap();
                    hashMap.put("skyIsCanRequest", Boolean.valueOf(a));
                    hashMap.put("performance_skip_sky_fall", Boolean.valueOf(com.sankuai.waimai.platform.utils.f.a(this.mActivity.a().getIntent(), "performance_skip_sky_fall", false)));
                    this.mActInfoController.b(a);
                    bVar2.d = hashMap;
                }
                interfaceC1075b.a(true, bVar2);
                return;
            }
            interfaceC1075b.a(false, bVar2);
            return;
        }
        interfaceC1075b.a(false, bVar2);
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eda814e25ef7c3cc490f6cd851e3d467", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eda814e25ef7c3cc490f6cd851e3d467");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, b.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f46caffc3b76987a1e0a9daec8951795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f46caffc3b76987a1e0a9daec8951795");
            return;
        }
        this.mListener = aVar;
        checkSkyFallCoupon(skyFallCouponResponseCache);
    }

    private void checkSkyFallCoupon(HomePagePoiListResponse homePagePoiListResponse) {
        Object[] objArr = {homePagePoiListResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6ae3346775b4c3edb6379519e80290d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6ae3346775b4c3edb6379519e80290d");
        } else if (this.mActInfoController == null) {
            onCompletePopup();
        } else if (homePagePoiListResponse == null) {
            onCompletePopup();
        } else {
            MarketingWindow data = MarketingWindow.getData(homePagePoiListResponse.marketingWindow, 2);
            if (data != null) {
                showHighPriorityDialog(data);
                com.sankuai.waimai.imbase.push.b.a(2);
                return;
            }
            this.mActInfoController.a(homePagePoiListResponse.hasActivity(), homePagePoiListResponse.needLogin(), homePagePoiListResponse.couponNologinBg);
            this.mActInfoController.b(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
        if (r13.getAsInt() != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void showHighPriorityDialog(com.sankuai.waimai.business.page.home.model.MarketingWindow r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.popup.WMSkyFallPopup.changeQuickRedirect
            java.lang.String r11 = "e3117f54b276bd6615ce8322afac937c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            r1 = 0
            com.google.gson.Gson r2 = com.sankuai.waimai.foundation.utils.k.a()     // Catch: java.lang.Exception -> L2c
            java.lang.String r13 = r13.content     // Catch: java.lang.Exception -> L2c
            java.lang.Class<com.sankuai.waimai.platform.mach.dialog.AlertInfo> r3 = com.sankuai.waimai.platform.mach.dialog.AlertInfo.class
            java.lang.Object r13 = r2.fromJson(r13, r3)     // Catch: java.lang.Exception -> L2c
            com.sankuai.waimai.platform.mach.dialog.AlertInfo r13 = (com.sankuai.waimai.platform.mach.dialog.AlertInfo) r13     // Catch: java.lang.Exception -> L2c
            r4 = r13
            goto L2d
        L2c:
            r4 = r1
        L2d:
            com.sankuai.waimai.platform.popup.WMBasePopup$a r13 = r12.getContext()
            java.lang.ref.WeakReference<android.app.Activity> r13 = r13.a
            java.lang.Object r13 = r13.get()
            r3 = r13
            android.app.Activity r3 = (android.app.Activity) r3
            if (r4 == 0) goto La6
            if (r3 == 0) goto La6
            com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper r13 = r12.mDynamicDialogHelper
            if (r13 == 0) goto L49
            com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper r13 = r12.mDynamicDialogHelper
            r13.a()
            r12.mDynamicDialogHelper = r1
        L49:
            com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper r13 = new com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper
            java.lang.String r2 = "c_m84bv26"
            r13.<init>(r0, r2)
            r12.mDynamicDialogHelper = r13
            java.util.List<com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module> r13 = r4.modules     // Catch: java.lang.Exception -> L8f
            if (r13 == 0) goto L8c
            java.util.List<com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module> r13 = r4.modules     // Catch: java.lang.Exception -> L8f
            boolean r13 = r13.isEmpty()     // Catch: java.lang.Exception -> L8f
            if (r13 != 0) goto L8c
            java.util.List<com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module> r13 = r4.modules     // Catch: java.lang.Exception -> L8f
            java.lang.Object r13 = r13.get(r9)     // Catch: java.lang.Exception -> L8f
            if (r13 == 0) goto L8c
            java.util.List<com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module> r13 = r4.modules     // Catch: java.lang.Exception -> L8f
            java.lang.Object r13 = r13.get(r9)     // Catch: java.lang.Exception -> L8f
            com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module r13 = (com.sankuai.waimai.platform.mach.dialog.AlertInfo.Module) r13     // Catch: java.lang.Exception -> L8f
            com.google.gson.JsonObject r13 = r13.jsonData     // Catch: java.lang.Exception -> L8f
            if (r13 == 0) goto L8c
            java.util.List<com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module> r13 = r4.modules     // Catch: java.lang.Exception -> L8f
            java.lang.Object r13 = r13.get(r9)     // Catch: java.lang.Exception -> L8f
            com.sankuai.waimai.platform.mach.dialog.AlertInfo$Module r13 = (com.sankuai.waimai.platform.mach.dialog.AlertInfo.Module) r13     // Catch: java.lang.Exception -> L8f
            com.google.gson.JsonObject r13 = r13.jsonData     // Catch: java.lang.Exception -> L8f
            java.lang.String r2 = "isShowClose"
            com.google.gson.JsonPrimitive r13 = r13.getAsJsonPrimitive(r2)     // Catch: java.lang.Exception -> L8f
            if (r13 == 0) goto L8c
            int r13 = r13.getAsInt()     // Catch: java.lang.Exception -> L8f
            if (r13 == 0) goto L8c
            goto L8d
        L8c:
            r0 = 0
        L8d:
            r5 = r0
            goto L90
        L8f:
            r5 = 0
        L90:
            com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper r13 = r12.mDynamicDialogHelper
            r13.c = r9
            com.sankuai.waimai.business.page.home.actinfo.SkyFallDynamicDialogHelper r2 = r12.mDynamicDialogHelper
            com.sankuai.waimai.popup.WMSkyFallPopup$2 r6 = new com.sankuai.waimai.popup.WMSkyFallPopup$2
            r6.<init>()
            com.sankuai.waimai.popup.WMSkyFallPopup$3 r7 = new com.sankuai.waimai.popup.WMSkyFallPopup$3
            r7.<init>()
            r2.a(r3, r4, r5, r6, r7)
            com.sankuai.waimai.popup.WMSkyFallPopup.skyFallCouponResponseCache = r1
            return
        La6:
            r12.onCompletePopup()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.popup.WMSkyFallPopup.showHighPriorityDialog(com.sankuai.waimai.business.page.home.model.MarketingWindow):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompletePopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2662b1008f8a4516edcc01a9f807529c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2662b1008f8a4516edcc01a9f807529c");
            return;
        }
        if (this.mListener != null) {
            this.mListener.a(true);
        }
        com.sankuai.waimai.imbase.push.b.a(2);
    }

    public void setDialogCanShow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3072be418dc82f7b871305d73e301657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3072be418dc82f7b871305d73e301657");
        } else if (this.mActInfoController != null) {
            this.mActInfoController.a(z);
        }
    }

    public void closeDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64dfc115c44c1b26621fb659c31bf69f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64dfc115c44c1b26621fb659c31bf69f");
            return;
        }
        skyFallCouponResponseCache = null;
        if (this.mActInfoController != null) {
            c cVar = this.mActInfoController;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "1989b54c70b6a768b28747c4c796032e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "1989b54c70b6a768b28747c4c796032e");
            } else {
                cVar.a(false);
                d dVar = cVar.c;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect4, false, "efc97516b2a59e9cae59594b5e29fa4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect4, false, "efc97516b2a59e9cae59594b5e29fa4d");
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(dVar.c);
                    com.sankuai.waimai.touchmatrix.views.b.a().b(dVar.c);
                    if (dVar.c != null && dVar.f != null) {
                        dVar.f.a();
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect5, false, "f5c66557e26073409f05314efd95cf46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect5, false, "f5c66557e26073409f05314efd95cf46");
                    } else {
                        if (dVar.i != null) {
                            dVar.i.b();
                            com.sankuai.waimai.touchmatrix.views.b.a().b(dVar.i.c());
                            if (!com.sankuai.waimai.business.page.homepage.bubble.d.a().b()) {
                                com.sankuai.waimai.business.page.homepage.bubble.d.a().a(dVar.j);
                            }
                            dVar.i = null;
                        }
                        if (dVar.h != null) {
                            dVar.h.a();
                            dVar.h = null;
                        }
                    }
                }
            }
        }
        if (this.mDynamicDialogHelper != null) {
            this.mDynamicDialogHelper.a();
            this.mDynamicDialogHelper = null;
        }
    }
}
