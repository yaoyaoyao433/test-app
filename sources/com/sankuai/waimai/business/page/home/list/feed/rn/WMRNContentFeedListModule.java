package com.sankuai.waimai.business.page.home.list.feed.rn;

import android.content.DialogInterface;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.view.d;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.page.home.model.a;
import com.sankuai.waimai.business.page.homepage.bubble.b;
import com.sankuai.waimai.foundation.utils.aa;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class WMRNContentFeedListModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ContentFeedListModule";
    }

    public WMRNContentFeedListModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cfa3628f04117bad79bf8bc3602df1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cfa3628f04117bad79bf8bc3602df1b");
        }
    }

    @ReactMethod
    public void showTipsDialog(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c926f31964929741dce8c705b96d5d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c926f31964929741dce8c705b96d5d0a");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        String string = readableMap != null ? readableMap.getString("title") : "";
        String string2 = readableMap != null ? readableMap.getString("message") : "";
        String string3 = readableMap != null ? readableMap.getString("btnText") : "";
        if (aa.a(string)) {
            string = reactApplicationContext.getString(R.string.wm_page_home_ugc_authority_alert_title);
        }
        if (aa.a(string2)) {
            string2 = reactApplicationContext.getString(R.string.wm_page_home_ugc_authority_alert_text);
        }
        if (aa.a(string3)) {
            string3 = reactApplicationContext.getString(R.string.wm_page_home_ugc_authority_alert_btn_text);
        }
        RooAlertDialog a = new RooAlertDialog.a(new d(getCurrentActivity(), 2131558627)).a(string).b(string2).a(string3, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.feed.rn.WMRNContentFeedListModule.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2aa36637f78e2bc553fd21c2d6e83bbf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2aa36637f78e2bc553fd21c2d6e83bbf");
                } else {
                    dialogInterface.dismiss();
                }
            }
        }).a();
        a.setCanceledOnTouchOutside(false);
        a.setCancelable(false);
        a.show();
    }

    @ReactMethod
    public void getBubbleParam(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b13eec0b8dd5fb30913fd96730fc35b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b13eec0b8dd5fb30913fd96730fc35b");
        } else if (b.a().e) {
            WritableMap createMap = Arguments.createMap();
            a aVar = b.a().c;
            if (aVar != null) {
                createMap.putString("content_param", aVar.g);
            }
            promise.resolve(createMap);
        } else {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void getLatestTabsParam(ReadableMap readableMap, Promise promise) {
        String obj;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "310ded6d4cf5a50ad27297835ebb6e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "310ded6d4cf5a50ad27297835ebb6e81");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        b a = b.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "53a1329a8e6f6aaad1092f051c1aaf97", RobustBitConfig.DEFAULT_VALUE)) {
            obj = (String) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "53a1329a8e6f6aaad1092f051c1aaf97");
        } else {
            obj = a.d == null ? "" : a.d.toString();
        }
        if (obj != null) {
            createMap.putString("tabs_params", obj);
        }
        promise.resolve(createMap);
    }
}
