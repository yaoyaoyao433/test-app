package com.sankuai.waimai.guidepop.hign;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.guidepop.hign.GuidePopHighBean;
import com.sankuai.waimai.guidepop.hign.b;
import com.sankuai.waimai.guidepop.utils.e;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMGuidePopHighPopup extends WMBasePopup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ai<WMGuidePopHighPopup> mInstance = new ai<>();
    public static String sMarketingContent;
    private final String LOG_TAG;
    private final ai<Activity> mActivity;
    private b.a mListener;

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldHandle(WMBasePopup.b bVar) {
        return true;
    }

    public WMGuidePopHighPopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c1b90b867e1e34f2c27209095322864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c1b90b867e1e34f2c27209095322864");
            return;
        }
        this.LOG_TAG = "guide_pop_high_WMGuidePopHighPopup";
        this.mActivity = new ai<>();
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void preparePopupData(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79bcf8d3811acc80ad75a5fbc01bd6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79bcf8d3811acc80ad75a5fbc01bd6de");
            return;
        }
        mInstance.a(this);
        if (TextUtils.isEmpty(sMarketingContent) || !isOpenWithAB() || isAccessibilityEnable()) {
            e.a("guide_pop_high_WMGuidePopHighPopup", "[preparePopupData]  sMarketingContent == null || isOpenWithAB() = false || isAccessibilityEnable()=false");
            interfaceC1075b.a(false, bVar);
            return;
        }
        this.mActivity.a(getContext().a.get());
        if (this.mActivity.a() == null) {
            e.a("guide_pop_high_WMGuidePopHighPopup", "[preparePopupData]  ctivity == null");
            interfaceC1075b.a(false, bVar);
            return;
        }
        interfaceC1075b.a(true, bVar);
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "962d5a511cc4658a511929e0bc6c18ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "962d5a511cc4658a511929e0bc6c18ab");
        } else {
            super.prepareToShow(bVar, interfaceC1075b);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, b.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "795acbb81479b49bafa83761d2f989dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "795acbb81479b49bafa83761d2f989dd");
            return;
        }
        this.mListener = aVar;
        showGuidePopHighDialog();
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldSendToNext(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ceb621a8b49f8ea06a92e59eba6b23a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ceb621a8b49f8ea06a92e59eba6b23a0")).booleanValue() : super.shouldSendToNext(bVar);
    }

    public static WMGuidePopHighPopup getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64c66594483e9c3ecaa40314c2b1bd48", RobustBitConfig.DEFAULT_VALUE) ? (WMGuidePopHighPopup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64c66594483e9c3ecaa40314c2b1bd48") : mInstance.a();
    }

    public static void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09f325795697e580ed1342290c252d90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09f325795697e580ed1342290c252d90");
        } else if (com.sankuai.waimai.platform.popup.e.a().h && getInstance() != null) {
            getInstance().setState(5);
        }
    }

    private boolean isOpenWithAB() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e49fdaaf07593adc87b95a34328bf7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e49fdaaf07593adc87b95a34328bf7e")).booleanValue();
        }
        IABTestService iABTestService = (IABTestService) com.sankuai.waimai.router.a.a(IABTestService.class, IABTestService.KEY);
        if (iABTestService == null) {
            e.a("guide_pop_high_WMGuidePopHighPopup", "获取AB Service 失败 不开启高优引导弹窗");
            return false;
        }
        ABStrategy strategy = iABTestService.getStrategy("waimai_home_guide_pop_hign", null);
        if (strategy == null) {
            e.a("guide_pop_high_WMGuidePopHighPopup", "获取AB strategy == null ,不开启高优引导弹窗");
            return false;
        }
        boolean equals = TextUtils.equals(strategy.expName, MarketingModel.TYPE_ENTER_DIALOG);
        e.a("guide_pop_high_WMGuidePopHighPopup", "获取AB 高优引导弹窗AB开关(open/close): " + equals);
        return equals;
    }

    private void showGuidePopHighDialog() {
        GuidePopHighBean guidePopHighBean;
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a873b89e283a13985e4c537c4df33c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a873b89e283a13985e4c537c4df33c2c");
        } else if (TextUtils.isEmpty(sMarketingContent)) {
            onCompletePopup();
        } else {
            Activity a = this.mActivity.a();
            if (a == null) {
                e.a("guide_pop_high_WMGuidePopHighPopup", "[showGuidePopHighDialog]  MainActivity == null ");
                onCompletePopup();
                return;
            }
            try {
                guidePopHighBean = (GuidePopHighBean) k.a().fromJson(sMarketingContent, (Class<Object>) GuidePopHighBean.class);
            } catch (Exception e) {
                e.b("guide_pop_high_WMGuidePopHighPopup", "[showGuidePopHighDialog]  e:" + e);
                guidePopHighBean = null;
            }
            if (guidePopHighBean == null || guidePopHighBean.a == null) {
                onCompletePopup();
                e.a("guide_pop_high_WMGuidePopHighPopup", "[showGuidePopHighDialog] guidePopHighBean.positions check fail.");
                return;
            }
            GuidePopHighBean.a aVar = guidePopHighBean.a.size() > 0 ? guidePopHighBean.a.get(0) : null;
            if (aVar == null || aVar.a == null || aVar.a.size() == 0) {
                onCompletePopup();
                e.a("guide_pop_high_WMGuidePopHighPopup", "[showGuidePopHighDialog] position.resources check fail.");
                return;
            }
            b bVar = new b(a, aVar.a, guidePopHighBean.b, new b.a() { // from class: com.sankuai.waimai.guidepop.hign.WMGuidePopHighPopup.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.guidepop.hign.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b62fc0ec961dc522132f3d9620188bb6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b62fc0ec961dc522132f3d9620188bb6");
                        return;
                    }
                    e.a("guide_pop_high_WMGuidePopHighPopup", "[showGuidePopHighDialog] [onTaskFinish]");
                    WMGuidePopHighPopup.this.onCompletePopup();
                }
            });
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "571fb00b8701349f68bcf1360b1e0415", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "571fb00b8701349f68bcf1360b1e0415");
            } else {
                bVar.f = 0;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "9f5bd1b5083efe81ee00daae1481385b", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "9f5bd1b5083efe81ee00daae1481385b")).booleanValue();
                } else {
                    if (bVar.d == null || TextUtils.isEmpty(bVar.d.frequencyKey) || bVar.d.count <= 0 || bVar.d.time <= 0) {
                        e.b("guide_pop_high_WMGuidePopHighTask", "[isWithinFrequency] frequency:" + bVar.d);
                    } else {
                        String str = bVar.d.frequencyKey;
                        String str2 = str + "_timeout";
                        String str3 = str + "_cache_time";
                        String str4 = str + "_can_show_count";
                        long b = bVar.b.b(str2, 0L);
                        long b2 = bVar.b.b(str3, 0L);
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        e.b("guide_pop_high_WMGuidePopHighTask", "[isWithinFrequency] lastCacheTimeout:" + b + ",lastCacheTime:" + b2 + ",currentTime:" + currentTimeMillis);
                        if (b == 0 || b2 == 0 || b2 + b < currentTimeMillis) {
                            bVar.b.a(str2, bVar.d.time);
                            bVar.b.a(str4, bVar.d.count);
                            bVar.b.a(str + "_use_count", 0);
                            bVar.b.a(str3, currentTimeMillis);
                            e.b("guide_pop_high_WMGuidePopHighTask", "[isWithinFrequency] 存储API time:" + bVar.d.time + ", frequency.count:" + bVar.d.count);
                        } else {
                            int b3 = bVar.b.b(str + "_use_count", 0);
                            int b4 = bVar.b.b(str4, 0);
                            e.b("guide_pop_high_WMGuidePopHighTask", "[isWithinFrequency] 取缓存，count:" + b4 + ",useCount:" + b3);
                            if (b4 <= b3) {
                                z = false;
                            }
                        }
                    }
                    z = true;
                }
                if (!z) {
                    if (bVar.e != null) {
                        bVar.e.a();
                    }
                    e.b("guide_pop_high_WMGuidePopHighTask", "[showPopDialog] 无频次了");
                    e.a("GuidePopOverFrequency", Float.valueOf(1.0f), bVar.b());
                } else if (bVar.c != null && !bVar.c.isEmpty()) {
                    AlertInfo c = bVar.c();
                    if (c == null) {
                        bVar.a();
                    } else {
                        bVar.a(c);
                    }
                }
            }
            sMarketingContent = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompletePopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf7025737e968dc3980e05216aaba032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf7025737e968dc3980e05216aaba032");
        } else if (this.mListener != null) {
            this.mListener.a(true);
        }
    }

    public static boolean isAccessibilityEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "554d18ce25e40a633b9b8acf19338b4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "554d18ce25e40a633b9b8acf19338b4c")).booleanValue();
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) com.meituan.android.singleton.b.a.getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                return false;
            }
            return accessibilityManager.isTouchExplorationEnabled();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return false;
        }
    }
}
