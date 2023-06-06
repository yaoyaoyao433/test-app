package com.sankuai.waimai.bussiness.order.confirm.rn;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.screenshot.observer.a;
import com.sankuai.waimai.foundation.core.service.screenshot.observer.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.reactnative.WmRNActivity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GlobalScreenShotModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "WMGlobalScreenShotModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private a mGlobalScreenShotObserver;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public GlobalScreenShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e93792801aaafe94b046629718c62aae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e93792801aaafe94b046629718c62aae");
        }
    }

    @ReactMethod
    public void registerGlobalScreenShotObserver(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da254ea8c790c303838aa3a4c10cfa1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da254ea8c790c303838aa3a4c10cfa1e");
            return;
        }
        this.mGlobalScreenShotObserver = new b() { // from class: com.sankuai.waimai.bussiness.order.confirm.rn.GlobalScreenShotModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.b, com.sankuai.waimai.foundation.core.service.screenshot.observer.a
            public final void a(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35e9137b97c6967531c98fe4be8ef6de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35e9137b97c6967531c98fe4be8ef6de");
                } else if (TextUtils.equals(str2, WmRNActivity.class.getName())) {
                    JudasManualManager.a a2 = JudasManualManager.a("b_gunivrf1").a("c_bkyg7zij").a("poi_id", str);
                    a2.b = GlobalScreenShotModule.REACT_CLASS;
                    a2.a();
                }
            }
        };
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(this.mGlobalScreenShotObserver);
    }

    @ReactMethod
    public void unRegisterGlobalScreenShotObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7f538a9bd4031f6dd4efde0bcc6c9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7f538a9bd4031f6dd4efde0bcc6c9b0");
        } else if (this.mGlobalScreenShotObserver != null) {
            com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(this.mGlobalScreenShotObserver);
        }
    }
}
