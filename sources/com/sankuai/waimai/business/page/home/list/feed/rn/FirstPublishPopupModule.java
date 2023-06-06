package com.sankuai.waimai.business.page.home.list.feed.rn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
import com.sankuai.waimai.business.page.home.list.feed.guide.FirstPublishDialog;
import com.sankuai.waimai.foundation.utils.f;
import com.tencent.open.SocialConstants;
import com.unionpay.tsmservice.data.Constant;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FirstPublishPopupModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "WMFirstPublishPopup";
    }

    public FirstPublishPopupModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5746f606875830bed454f43dabb99614", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5746f606875830bed454f43dabb99614");
        }
    }

    @ReactMethod
    public void show(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec4334294939a86314e29333697a2085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec4334294939a86314e29333697a2085");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null) {
            final Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (f.a(currentActivity)) {
                return;
            }
            final String string = readableMap.getString("title");
            final String string2 = readableMap.getString("subtitle");
            final String string3 = readableMap.getString(SocialConstants.PARAM_IMG_URL);
            final String string4 = readableMap.getString("mediaIcon");
            currentActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.feed.rn.FirstPublishPopupModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    FirstPublishDialog firstPublishDialog;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49fb7af2870af7cdddbb6b28de51636c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49fb7af2870af7cdddbb6b28de51636c");
                        return;
                    }
                    FirstPublishDialog.a aVar = new FirstPublishDialog.a();
                    aVar.b = string;
                    aVar.c = string2;
                    aVar.d = string3;
                    aVar.e = string4;
                    aVar.f = new FirstPublishDialog.b() { // from class: com.sankuai.waimai.business.page.home.list.feed.rn.FirstPublishPopupModule.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.a
                        public final void a(boolean z) {
                        }

                        @Override // com.sankuai.waimai.business.page.home.list.feed.guide.FirstPublishDialog.b
                        public final void b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9d0fe0b1691305a18252d6ec8ba25d08", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9d0fe0b1691305a18252d6ec8ba25d08");
                            } else {
                                promise.resolve(FirstPublishPopupModule.this.getResultParams(1));
                            }
                        }

                        @Override // com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7d6b37ef01f534a494b89d7c0a5453ce", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7d6b37ef01f534a494b89d7c0a5453ce");
                            } else {
                                promise.resolve(FirstPublishPopupModule.this.getResultParams(1));
                            }
                        }
                    };
                    Activity activity = currentActivity;
                    Object[] objArr3 = {activity};
                    ChangeQuickRedirect changeQuickRedirect4 = FirstPublishDialog.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "440574de8234c496d1dc480905b7c61d", RobustBitConfig.DEFAULT_VALUE)) {
                        firstPublishDialog = (FirstPublishDialog) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "440574de8234c496d1dc480905b7c61d");
                    } else {
                        FirstPublishDialog firstPublishDialog2 = new FirstPublishDialog(activity);
                        firstPublishDialog2.setCanceledOnTouchOutside(true);
                        firstPublishDialog2.b = false;
                        firstPublishDialog2.setCancelable(false);
                        firstPublishDialog2.e = aVar.b;
                        firstPublishDialog2.f = aVar.c;
                        firstPublishDialog2.g = aVar.d;
                        firstPublishDialog2.h = aVar.e;
                        FirstPublishDialog.b bVar = aVar.f;
                        Object[] objArr4 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect5 = FirstPublishDialog.d;
                        if (PatchProxy.isSupport(objArr4, firstPublishDialog2, changeQuickRedirect5, false, "920308a0923eccffc64a92401a702002", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, firstPublishDialog2, changeQuickRedirect5, false, "920308a0923eccffc64a92401a702002");
                        } else {
                            firstPublishDialog2.i = bVar;
                            firstPublishDialog2.c = firstPublishDialog2.i;
                        }
                        firstPublishDialog = firstPublishDialog2;
                    }
                    firstPublishDialog.show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getResultParams(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "336e0bbf17e52c0606aa2380e6d3e3bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "336e0bbf17e52c0606aa2380e6d3e3bb");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Constant.KEY_RESULT_CODE, i);
        return createMap;
    }
}
