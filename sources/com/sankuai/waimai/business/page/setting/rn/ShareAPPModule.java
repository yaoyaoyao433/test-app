package com.sankuai.waimai.business.page.setting.rn;

import android.content.Intent;
import android.support.constraint.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShareAPPModule extends ReactContextBaseJavaModule {
    public static final String REACT_NATIVE_MODULE = "WaiMaiShareAPP";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_NATIVE_MODULE;
    }

    public ShareAPPModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98783c7a872517c65b66e2672faef11d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98783c7a872517c65b66e2672faef11d");
        }
    }

    @ReactMethod
    public void shareAPP() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb1ab23d1cb54540451e389af6666602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb1ab23d1cb54540451e389af6666602");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || reactApplicationContext.getCurrentActivity() == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", reactApplicationContext.getString(R.string.wm_page_setting_share_messages));
        reactApplicationContext.getCurrentActivity().startActivity(Intent.createChooser(intent, reactApplicationContext.getString(R.string.wm_page_setting_share_select)));
    }
}
