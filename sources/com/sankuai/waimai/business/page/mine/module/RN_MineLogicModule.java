package com.sankuai.waimai.business.page.mine.module;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.Gson;
import com.meituan.android.mrn.engine.k;
import com.meituan.passport.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.business.page.mine.model.FunctionCategory;
import com.sankuai.waimai.business.page.mine.model.FunctionItem;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.manager.home.TabLoadManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RN_MineLogicModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long createTime;
    private com.sankuai.waimai.business.page.mine.model.b mData;
    private final a mFactory;
    private final ReactContext mReactContext;
    private boolean showMsgCenter;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMMineLogicModule";
    }

    public RN_MineLogicModule(ReactApplicationContext reactApplicationContext, long j) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b38f3654c68f6e6d8df3e7b3cfcb1975", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b38f3654c68f6e6d8df3e7b3cfcb1975");
            return;
        }
        this.mFactory = new a();
        this.showMsgCenter = true;
        this.mReactContext = reactApplicationContext;
        this.createTime = j;
        this.mData = this.mFactory.c();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62caa04e9790449727aa87a916e854b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62caa04e9790449727aa87a916e854b8");
        }
        HashMap hashMap = new HashMap();
        if (this.mData == null) {
            this.mData = new com.sankuai.waimai.business.page.mine.model.b();
        }
        if (CollectionUtils.isEmpty(this.mData.f)) {
            this.mData.f = d.a();
        }
        try {
            hashMap.put("cacheMineData", new Gson().toJson(this.mData));
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null && !currentActivity.isFinishing()) {
                this.showMsgCenter = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) currentActivity, "message_center_switch", true);
            }
            hashMap.put("isMessageCenterVisible", Boolean.valueOf(this.showMsgCenter));
            hashMap.put("createPageTime", Long.valueOf(this.createTime));
        } catch (Exception unused) {
            hashMap.put("cacheMineData", null);
        }
        return hashMap;
    }

    @ReactMethod
    public void syncMineData(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc3502f7531f37ccdbc95fa61d718791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc3502f7531f37ccdbc95fa61d718791");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                com.sankuai.waimai.business.page.mine.model.a bubble;
                com.sankuai.waimai.business.page.mine.model.a bubble2;
                boolean a2;
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa12a3a75f9e617f7af2215779f05e7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa12a3a75f9e617f7af2215779f05e7d");
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    promise.reject("0", "invalid input");
                }
                try {
                    RN_MineLogicModule.this.mData = (com.sankuai.waimai.business.page.mine.model.b) new Gson().fromJson(str, (Class<Object>) com.sankuai.waimai.business.page.mine.model.b.class);
                    if (RN_MineLogicModule.this.mData != null) {
                        TabLoadManager.a().a(4, true);
                        ArrayList<FunctionCategory> arrayList = RN_MineLogicModule.this.mData.f;
                        if (!CollectionUtils.isEmpty(arrayList)) {
                            WritableNativeMap writableNativeMap = new WritableNativeMap();
                            Iterator<FunctionCategory> it = arrayList.iterator();
                            while (it.hasNext()) {
                                FunctionCategory next = it.next();
                                if (next != null) {
                                    ArrayList<FunctionItem> functionItems = next.getFunctionItems();
                                    if (!CollectionUtils.isEmpty(functionItems)) {
                                        Iterator<FunctionItem> it2 = functionItems.iterator();
                                        while (it2.hasNext()) {
                                            FunctionItem next2 = it2.next();
                                            if (next2 != null && (a2 = d.a(currentActivity, next2))) {
                                                writableNativeMap.putBoolean(String.valueOf(next2.getCode()), a2);
                                            }
                                        }
                                    }
                                }
                            }
                            promise.resolve(writableNativeMap);
                        } else {
                            promise.reject("0", "invalid input");
                        }
                        Iterator<FunctionCategory> it3 = RN_MineLogicModule.this.mData.f.iterator();
                        boolean z2 = false;
                        boolean z3 = false;
                        while (it3.hasNext()) {
                            FunctionCategory next3 = it3.next();
                            if (next3 != null) {
                                Iterator<FunctionItem> it4 = next3.getFunctionItems().iterator();
                                while (it4.hasNext()) {
                                    FunctionItem next4 = it4.next();
                                    if (next4 != null && next4.getCode() == 30 && (bubble2 = next4.getBubble()) != null && bubble2.a != 0 && !com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) RN_MineLogicModule.this.getCurrentActivity(), d.a(next4.getCode(), bubble2.c), false)) {
                                        z2 = true;
                                    }
                                    if (next4 != null && next4.getCode() == 48 && (bubble = next4.getBubble()) != null && bubble.a != 0 && !com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) RN_MineLogicModule.this.getCurrentActivity(), d.a(next4.getCode(), bubble.c), false)) {
                                        z3 = true;
                                    }
                                }
                            }
                        }
                        com.sankuai.waimai.platform.domain.manager.bubble.a.a().g = z2 && com.sankuai.waimai.platform.domain.manager.user.a.i().a();
                        com.sankuai.waimai.platform.domain.manager.bubble.a a3 = com.sankuai.waimai.platform.domain.manager.bubble.a.a();
                        if (z3 && com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                            z = true;
                        }
                        a3.h = z;
                        if (currentActivity instanceof MainActivity) {
                            ((MainActivity) currentActivity).a(4);
                        }
                        d.a(RN_MineLogicModule.this.mReactContext, (k) null, RN_MineLogicModule.this.getCurrentActivity(), RN_MineLogicModule.this.showMsgCenter, RN_MineLogicModule.this.mData.d);
                        RN_MineLogicModule.this.mFactory.a(RN_MineLogicModule.this.mData, null);
                        return;
                    }
                    promise.reject("0", "invalid input");
                } catch (Exception e) {
                    promise.reject("0", e.getMessage());
                }
            }
        });
    }

    @ReactMethod
    public void navigateTo(final String str, final boolean z, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c205c1eb8fdf89d5bcccc759c2e643f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c205c1eb8fdf89d5bcccc759c2e643f");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d97a20fc792ce1dd9ea4aeef2c761e03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d97a20fc792ce1dd9ea4aeef2c761e03");
                } else if (TextUtils.isEmpty(str)) {
                    ae.a(currentActivity, (int) R.string.wm_page_mine_error_unknown_url);
                } else {
                    int i = (readableMap == null || !readableMap.hasKey("code")) ? -10086 : readableMap.getInt("code");
                    if (i == -10086) {
                        if (z) {
                            com.sankuai.waimai.platform.domain.manager.user.a.a(currentActivity, new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule.2.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bdc47ae54caf6a33cef7d2f6c8386302", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bdc47ae54caf6a33cef7d2f6c8386302");
                                    } else {
                                        com.sankuai.waimai.foundation.router.a.a(currentActivity, str);
                                    }
                                }
                            });
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(currentActivity, str);
                        }
                    } else if (i == 991) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isHideTitleBar", true);
                        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                        buildUpon.appendQueryParameter("no_back_button", "0");
                        StringBuilder sb = new StringBuilder();
                        sb.append(g.e(com.meituan.android.singleton.b.a));
                        buildUpon.appendQueryParameter("statusbar_height", sb.toString());
                        com.sankuai.waimai.foundation.router.a.a(currentActivity, buildUpon.build().toString(), bundle);
                    } else if (i == 992) {
                        Bundle bundle2 = new Bundle();
                        if (readableMap.hasKey("extra_settings_url")) {
                            bundle2.putString("extra_settings_url", readableMap.getString("extra_settings_url"));
                        }
                        bundle2.putBoolean("extra_settings_show_clear_cache", readableMap.getBoolean("extra_settings_show_clear_cache"));
                        bundle2.putBoolean("extra_settings_show_auto_update", readableMap.getBoolean("extra_settings_show_auto_download"));
                        bundle2.putString("extra_mt_protocol_and_illustrate", readableMap.getString("extra_settings_mt_protocol_and_illustrate"));
                        Activity activity = currentActivity;
                        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.b.c + "/mrn?mrn_biz=waimai&mrn_entry=setting-page&mrn_component=setting-page", bundle2);
                    } else if (i == 993) {
                        if (com.sankuai.waimai.foundation.core.a.b()) {
                            com.sankuai.waimai.foundation.router.a.a(currentActivity, com.sankuai.waimai.foundation.router.interfaces.c.ae);
                        }
                    } else if (i == 994) {
                        if (d.b()) {
                            com.sankuai.waimai.foundation.router.a.a(currentActivity, "wm_router://page/myaccount");
                        } else {
                            com.sankuai.waimai.platform.domain.manager.user.a.a((Context) currentActivity);
                        }
                    } else if (i == 995) {
                        com.sankuai.waimai.business.im.api.msgcenter.a.a().clickMsgCenter(currentActivity);
                    } else if (!z) {
                        RN_MineLogicModule.this.functionItemClick(currentActivity, str, readableMap, promise);
                    } else {
                        com.sankuai.waimai.platform.domain.manager.user.a.a(currentActivity, new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "76fa686c4c86933c486eb361a13c055b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "76fa686c4c86933c486eb361a13c055b");
                                } else {
                                    RN_MineLogicModule.this.functionItemClick(currentActivity, str, readableMap, promise);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    private void runUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91201c73d4ab6c05179afff6137ed832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91201c73d4ab6c05179afff6137ed832");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }

    @ReactMethod
    public void endLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "695cb9b4d3adf51db6346baea50948fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "695cb9b4d3adf51db6346baea50948fe");
        } else {
            runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1c24eab8250d16ceabd22a831b455dbd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1c24eab8250d16ceabd22a831b455dbd");
                        return;
                    }
                    c a2 = c.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "c4fbb5f06d734c02e53f7a68c11ff580", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "c4fbb5f06d734c02e53f7a68c11ff580");
                    } else if (a2.b != null && a2.b.size() > 0) {
                        for (b bVar : new ArrayList(a2.b)) {
                            if (bVar != null) {
                                bVar.p();
                            }
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void functionItemClick(android.app.Activity r20, java.lang.String r21, com.facebook.react.bridge.ReadableMap r22, com.facebook.react.bridge.Promise r23) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule.functionItemClick(android.app.Activity, java.lang.String, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aef4f82941ec3cd4327a1d58d2653f80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aef4f82941ec3cd4327a1d58d2653f80");
        } else {
            super.onCatalystInstanceDestroy();
        }
    }

    @ReactMethod
    public void update() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53f95ecc17466d8938754c123bef913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53f95ecc17466d8938754c123bef913");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.RN_MineLogicModule.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74098f0ef9e1176c939cf9035444460b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74098f0ef9e1176c939cf9035444460b");
                    return;
                }
                try {
                    aq.a(com.meituan.android.singleton.b.a).a(currentActivity);
                } catch (Exception unused) {
                }
            }
        });
    }
}
