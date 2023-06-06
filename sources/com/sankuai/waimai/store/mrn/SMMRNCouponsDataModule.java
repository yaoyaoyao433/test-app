package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.util.al;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SMMRNCouponsDataModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mRequestTag;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SMMRNCouponsDataBridge";
    }

    public SMMRNCouponsDataModule(@NonNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaa8652350cd485a23f421dbc285fb79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaa8652350cd485a23f421dbc285fb79");
        } else {
            initTag(reactApplicationContext.getCurrentActivity());
        }
    }

    private void initTag(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f16b6fd4be1359dce43c5182e762af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f16b6fd4be1359dce43c5182e762af3");
            return;
        }
        if (activity instanceof SCBaseActivity) {
            this.mRequestTag = ((SCBaseActivity) activity).w();
        }
        if (TextUtils.isEmpty(this.mRequestTag)) {
            this.mRequestTag = SMMRNCouponsDataModule.class.getSimpleName();
        }
    }

    @ReactMethod
    public void loadPoiInfo(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "862ff2269c1c8dd6f66ea2632d38f729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "862ff2269c1c8dd6f66ea2632d38f729");
            return;
        }
        final a a = b.a(str);
        if (a == null) {
            d.a(promise, null);
        } else {
            al.a(new al.b<WritableMap>() { // from class: com.sankuai.waimai.store.mrn.SMMRNCouponsDataModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(WritableMap writableMap) {
                    WritableMap writableMap2 = writableMap;
                    Object[] objArr2 = {writableMap2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "110029121dd8d20fbf5e31ef41de6186", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "110029121dd8d20fbf5e31ef41de6186");
                    } else if (promise != null) {
                        if (writableMap2 != null) {
                            promise.resolve(writableMap2);
                        } else {
                            d.a(promise, new RuntimeException("coupon parse error!"));
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                public WritableMap a() {
                    Map<String, String> a2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d3602d9016ea5f6c0e186f5de4db7546", RobustBitConfig.DEFAULT_VALUE)) {
                        return (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d3602d9016ea5f6c0e186f5de4db7546");
                    }
                    WritableMap createMap = Arguments.createMap();
                    try {
                        a2 = com.sankuai.waimai.store.coupons.a.a().a(SMMRNCouponsDataModule.this.getCurrentActivity(), a.a());
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                    if (a2 != null && !a2.isEmpty()) {
                        String str2 = a2.get("data");
                        if (!t.a(str2)) {
                            createMap.putMap("data", g.a(new JSONObject(str2)));
                        }
                        return createMap;
                    }
                    return createMap;
                }
            }, this.mRequestTag);
        }
    }
}
