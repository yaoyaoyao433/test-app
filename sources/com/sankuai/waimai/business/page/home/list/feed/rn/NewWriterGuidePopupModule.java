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
import com.sankuai.waimai.business.page.home.list.feed.guide.NewWriterGuideDialog;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.tencent.open.SocialConstants;
import com.unionpay.tsmservice.data.Constant;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NewWriterGuidePopupModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "WMNewWriterGuidePopup";
    }

    public NewWriterGuidePopupModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f269b7f9e12e2506f1aab0a5754b5f42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f269b7f9e12e2506f1aab0a5754b5f42");
        }
    }

    @ReactMethod
    public void show(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0070ea9ed9bf6e024c135e6e6dcaffab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0070ea9ed9bf6e024c135e6e6dcaffab");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null) {
            final Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (f.a(currentActivity)) {
                return;
            }
            ReadableMap map = readableMap.getMap("anchor");
            double d = map.getDouble("pageX");
            double d2 = map.getDouble("pageY");
            double d3 = map.getDouble("height");
            final int a = g.a(currentActivity, (float) (d + (map.getDouble("width") / 2.0d)));
            final int a2 = g.a(currentActivity, (float) (d2 + (d3 / 2.0d)));
            final int a3 = g.a(currentActivity, 20.0f);
            final String string = readableMap.getString("title");
            final String string2 = readableMap.getString("subtitle");
            final String string3 = readableMap.getString(SocialConstants.PARAM_IMG_URL);
            currentActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.feed.rn.NewWriterGuidePopupModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    NewWriterGuideDialog newWriterGuideDialog;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9810ef207588e2690a974accda54dfa4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9810ef207588e2690a974accda54dfa4");
                        return;
                    }
                    NewWriterGuideDialog.a aVar = new NewWriterGuideDialog.a();
                    aVar.g = string;
                    aVar.h = string2;
                    aVar.i = string3;
                    int i = a;
                    int i2 = a2;
                    int i3 = a3;
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 0, 0};
                    ChangeQuickRedirect changeQuickRedirect4 = NewWriterGuideDialog.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "949511afa86f1dd19653a340426df346", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (NewWriterGuideDialog.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "949511afa86f1dd19653a340426df346");
                    } else {
                        aVar.b = i;
                        aVar.c = i2;
                        aVar.d = i3;
                        aVar.e = 0;
                        aVar.f = 0;
                    }
                    aVar.j = new NewWriterGuideDialog.b() { // from class: com.sankuai.waimai.business.page.home.list.feed.rn.NewWriterGuidePopupModule.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.home.list.feed.guide.NewWriterGuideDialog.b
                        public final void b() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "81a2727a269e3d015d4f16248e9044f4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "81a2727a269e3d015d4f16248e9044f4");
                            } else {
                                promise.resolve(NewWriterGuidePopupModule.this.getResultParams(1));
                            }
                        }

                        @Override // com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.a
                        public final void a(boolean z) {
                            Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "f2e1eefb175394cb966d106d8ce76386", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "f2e1eefb175394cb966d106d8ce76386");
                            } else {
                                promise.resolve(NewWriterGuidePopupModule.this.getResultParams(3));
                            }
                        }

                        @Override // com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "51d09810bb16410ebe88626154cec078", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "51d09810bb16410ebe88626154cec078");
                            } else {
                                promise.resolve(NewWriterGuidePopupModule.this.getResultParams(2));
                            }
                        }
                    };
                    Activity activity = currentActivity;
                    Object[] objArr4 = {activity};
                    ChangeQuickRedirect changeQuickRedirect5 = NewWriterGuideDialog.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect5, false, "7da15735a7894fd0d7fce0a99412ba33", RobustBitConfig.DEFAULT_VALUE)) {
                        newWriterGuideDialog = (NewWriterGuideDialog) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect5, false, "7da15735a7894fd0d7fce0a99412ba33");
                    } else {
                        NewWriterGuideDialog newWriterGuideDialog2 = new NewWriterGuideDialog(activity);
                        newWriterGuideDialog2.setCanceledOnTouchOutside(true);
                        newWriterGuideDialog2.b = false;
                        newWriterGuideDialog2.setCancelable(false);
                        newWriterGuideDialog2.e = aVar.g;
                        newWriterGuideDialog2.f = aVar.h;
                        newWriterGuideDialog2.g = aVar.i;
                        newWriterGuideDialog2.h = new int[]{aVar.b, aVar.c, aVar.d, aVar.e, aVar.f};
                        NewWriterGuideDialog.b bVar = aVar.j;
                        Object[] objArr5 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect6 = NewWriterGuideDialog.d;
                        if (PatchProxy.isSupport(objArr5, newWriterGuideDialog2, changeQuickRedirect6, false, "3cc4a0aded0d50b1d2ad70e58468fe1c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, newWriterGuideDialog2, changeQuickRedirect6, false, "3cc4a0aded0d50b1d2ad70e58468fe1c");
                        } else {
                            newWriterGuideDialog2.i = bVar;
                            newWriterGuideDialog2.c = newWriterGuideDialog2.i;
                        }
                        newWriterGuideDialog = newWriterGuideDialog2;
                    }
                    newWriterGuideDialog.show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getResultParams(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0af508e8274a884e04847da9b53fff7", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0af508e8274a884e04847da9b53fff7");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Constant.KEY_RESULT_CODE, i);
        return createMap;
    }
}
