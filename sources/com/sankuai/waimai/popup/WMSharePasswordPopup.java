package com.sankuai.waimai.popup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.password.a;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.kit.utils.d;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
import com.sankuai.waimai.platform.utils.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMSharePasswordPopup extends WMBasePopup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ai<WMSharePasswordPopup> mInstance = new ai<>();
    private final ai<MainActivity> mActivity;
    public a.InterfaceC0544a mCarpetWindowFinishListener;
    private b.a mDisplayListener;
    private boolean mIsJump;
    private boolean mIsMeituanScheme;
    private boolean mIsShowing;

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldHandle(WMBasePopup.b bVar) {
        return true;
    }

    public WMSharePasswordPopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11760617d6fd2bb6c8b97553b3aedb2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11760617d6fd2bb6c8b97553b3aedb2f");
            return;
        }
        this.mActivity = new ai<>();
        this.mCarpetWindowFinishListener = new a.InterfaceC0544a() { // from class: com.sankuai.waimai.popup.WMSharePasswordPopup.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.android.share.password.a.InterfaceC0544a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f27ad195ab19964d5dce2bf37fdd405b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f27ad195ab19964d5dce2bf37fdd405b");
                    return;
                }
                WMSharePasswordPopup.loganLog("showPasswordDialog: onFinish");
                com.sankuai.waimai.guidepop.utils.e.a("WMPasswordAlertJump", Float.valueOf(WMSharePasswordPopup.this.mIsJump ? 1.0f : 0.0f));
                com.sankuai.waimai.guidepop.utils.e.a("WMPasswordAlertShow", Float.valueOf(1.0f), "error", WMSharePasswordPopup.this.mIsMeituanScheme ? "2" : "0");
                WMSharePasswordPopup.this.onCompletePopup();
            }
        };
    }

    @Nullable
    public static WMSharePasswordPopup getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b04784599a22b587cb135eca3bbde89", RobustBitConfig.DEFAULT_VALUE) ? (WMSharePasswordPopup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b04784599a22b587cb135eca3bbde89") : mInstance.a();
    }

    public static void reset() {
        WMSharePasswordPopup wMSharePasswordPopup;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99b6771d5afde58054fdea42bb2d5322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99b6771d5afde58054fdea42bb2d5322");
        } else if (com.sankuai.waimai.platform.popup.e.a().h && (wMSharePasswordPopup = getInstance()) != null) {
            loganLog("WMSharePasswordPopup-->reset");
            wMSharePasswordPopup.setState(5);
        }
    }

    public boolean interceptStartActivity(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "557ee62fe348cfebf7b580f90689aa6a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "557ee62fe348cfebf7b580f90689aa6a")).booleanValue();
        }
        if (!this.mIsShowing) {
            logDebug("[interceptStartActivity] not showing");
            return false;
        }
        this.mIsJump = true;
        this.mIsMeituanScheme = false;
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            loganLog("[interceptStartActivity] uri :" + dataString);
            if (dataString.startsWith("http") || dataString.startsWith("https")) {
                com.sankuai.waimai.foundation.router.a.a(context, dataString);
                return true;
            } else if (dataString.startsWith("imeituan")) {
                this.mIsMeituanScheme = true;
                if (!isInstallApk(context, "com.sankuai.meituan")) {
                    MainActivity a = this.mActivity.a();
                    if (a != null) {
                        loganLog("[interceptStartActivity] not install MeiTuan app.");
                        m.a(a, "未安装美团APP");
                        this.mIsJump = false;
                    }
                    return true;
                }
                intent.setPackage("com.sankuai.meituan");
            }
        }
        return false;
    }

    private boolean isInstallApk(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d56b71190a4c0d04f1a7e60a5a103263", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d56b71190a4c0d04f1a7e60a5a103263")).booleanValue();
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void preparePopupData(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9fcfc7782b3da018d3c08059cac2205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9fcfc7782b3da018d3c08059cac2205");
            return;
        }
        mInstance.a(this);
        if (!isOpenSharePasswordWithAB()) {
            interfaceC1075b.a(false, bVar);
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee55f2e0bddc41aa81668f610fa8fb17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee55f2e0bddc41aa81668f610fa8fb17");
        } else {
            super.prepareToShow(bVar, interfaceC1075b);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, b.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c214e987f53f39e31bb5002192c08f32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c214e987f53f39e31bb5002192c08f32");
            return;
        }
        this.mDisplayListener = aVar;
        this.mIsShowing = false;
        Activity activity = getContext().a.get();
        if (activity instanceof MainActivity) {
            this.mActivity.a((MainActivity) activity);
        }
        if (this.mActivity.a() != null) {
            try {
                showPasswordDialog();
                return;
            } catch (Exception e) {
                loganLog(e.getMessage());
                onCompletePopup();
                return;
            }
        }
        loganLog("[show] mainActivity == null");
        onCompletePopup();
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldSendToNext(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff0134fc451d20344617785b184bf508", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff0134fc451d20344617785b184bf508")).booleanValue() : super.shouldSendToNext(bVar);
    }

    private boolean isOpenSharePasswordWithAB() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0c7d75a6be1e9380d02af77db7b5fb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0c7d75a6be1e9380d02af77db7b5fb9")).booleanValue();
        }
        IABTestService iABTestService = (IABTestService) com.sankuai.waimai.router.a.a(IABTestService.class, IABTestService.KEY);
        if (iABTestService == null) {
            loganLog("获取AB Service 失败 不开启口令识别");
            return false;
        }
        ABStrategy strategy = iABTestService.getStrategy("waimai_share_password_enable", null);
        if (strategy == null) {
            loganLog("获取AB strategy == null ,不开启口令识别开关");
            return false;
        }
        boolean equals = TextUtils.equals(strategy.expName, "enable");
        loganLog("获取AB 口令识别AB开关(enable/disable): " + equals);
        return equals;
    }

    public void showPasswordDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ab77c2ae5d1bf020c6e7d912becce1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ab77c2ae5d1bf020c6e7d912becce1e");
        } else {
            com.sankuai.waimai.kit.utils.d.a(new d.a() { // from class: com.sankuai.waimai.popup.WMSharePasswordPopup.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.kit.utils.d.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "48501a290ab512a5a8056aaf8c2072e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "48501a290ab512a5a8056aaf8c2072e6");
                        return;
                    }
                    MainActivity mainActivity = (MainActivity) WMSharePasswordPopup.this.mActivity.a();
                    if (mainActivity == null || mainActivity.isFinishing() || mainActivity.isDestroyed() || !mainActivity.l) {
                        WMSharePasswordPopup.this.onCompletePopup();
                        return;
                    }
                    final com.sankuai.android.share.password.a aVar = new com.sankuai.android.share.password.a(mainActivity);
                    boolean a2 = aVar.a();
                    WMSharePasswordPopup.logDebug("showPasswordDialog---needShow:" + a2);
                    if (!a2) {
                        WMSharePasswordPopup.this.onCompletePopup();
                        return;
                    }
                    WMSharePasswordPopup.loganLog("[showPasswordDialog] showDialog");
                    com.sankuai.waimai.kit.utils.d.a(new Runnable() { // from class: com.sankuai.waimai.popup.WMSharePasswordPopup.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a684c9d219bc05be47441583cdac948d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a684c9d219bc05be47441583cdac948d");
                                return;
                            }
                            WMSharePasswordPopup.this.mIsShowing = true;
                            aVar.a(WMSharePasswordPopup.this.mCarpetWindowFinishListener);
                            aVar.c();
                        }
                    }, "show_password_dialog");
                }
            }, "showPasswordDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompletePopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59b3ab608a163c0ebdeb10946c8e122a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59b3ab608a163c0ebdeb10946c8e122a");
            return;
        }
        this.mIsShowing = false;
        this.mIsJump = false;
        this.mIsMeituanScheme = false;
        if (this.mDisplayListener != null) {
            com.sankuai.waimai.kit.utils.d.a(new Runnable() { // from class: com.sankuai.waimai.popup.WMSharePasswordPopup.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "01585ec1c18b1bb0798c934bfce4e312", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "01585ec1c18b1bb0798c934bfce4e312");
                    } else {
                        WMSharePasswordPopup.this.mDisplayListener.a(true);
                    }
                }
            }, "show_password_dialog_complete");
        }
    }

    public static void loganLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39b79d6fd609f316d997de2e2a9c470c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39b79d6fd609f316d997de2e2a9c470c");
        } else {
            com.sankuai.waimai.guidepop.utils.e.a("SharePassword", str);
        }
    }

    public static void logDebug(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12189e41702d107235cdeabc0d4d8e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12189e41702d107235cdeabc0d4d8e87");
        } else {
            com.sankuai.waimai.guidepop.utils.e.b("SharePassword", str);
        }
    }
}
