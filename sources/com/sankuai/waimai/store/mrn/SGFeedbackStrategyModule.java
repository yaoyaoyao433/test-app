package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.store.feedback.logic.FeedbackLogic;
import com.sankuai.waimai.store.feedback.view.UserFeedbackView;
import com.sankuai.waimai.store.repository.model.FeedbackInfo;
import com.sankuai.waimai.store.util.i;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGFeedbackStrategyModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "SMFeedbackStrategyModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public SGFeedbackStrategyModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "849621c79d707f7cda4ae9ae263b7807", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "849621c79d707f7cda4ae9ae263b7807");
        }
    }

    @ReactMethod
    public void isNativeStrategyShow(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1c0a0e4b6e4d313730db0a3bc20d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1c0a0e4b6e4d313730db0a3bc20d60");
            return;
        }
        boolean a = FeedbackLogic.a(getReactApplicationContext());
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        createMap.putString("message", "success");
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putBoolean("dynamic_feedback_entry_strategy", a);
        createMap.putMap("data", createMap2);
        promise.resolve(createMap);
    }

    @ReactMethod
    public void initFeedbackEntry(final ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41f6c107b5a8136c73b915f2f4bb4e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41f6c107b5a8136c73b915f2f4bb4e8e");
            return;
        }
        try {
            final Activity currentActivity = getCurrentActivity();
            if (currentActivity != null && !com.sankuai.waimai.store.util.b.a(currentActivity)) {
                ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGFeedbackStrategyModule.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "73bbd458a32994f2fc9d306bc5a29247", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "73bbd458a32994f2fc9d306bc5a29247");
                            return;
                        }
                        UserFeedbackView userFeedbackView = (UserFeedbackView) currentActivity.findViewById(R.id.user_feedback_right_bottom_entry);
                        FeedbackInfo feedbackInfo = (FeedbackInfo) SGFeedbackStrategyModule.this.getObjectFromMap(readableMap, "question", FeedbackInfo.class);
                        if (readableMap == null || feedbackInfo == null) {
                            if (userFeedbackView != null) {
                                userFeedbackView.a((FeedbackInfo) null);
                                return;
                            }
                            return;
                        }
                        if (userFeedbackView == null) {
                            View inflate = LayoutInflater.from(currentActivity).inflate(R.layout.wm_sc_user_feedback_entry_layout, (ViewGroup) null);
                            ((FrameLayout) currentActivity.findViewById(16908290)).addView(inflate, new ViewGroup.LayoutParams(-1, -1));
                            userFeedbackView = (UserFeedbackView) inflate.findViewById(R.id.user_feedback_right_bottom_entry);
                        }
                        userFeedbackView.a(feedbackInfo);
                        ReadableMap map = readableMap.getMap("judas_param");
                        if (map != null) {
                            userFeedbackView.a(map.getString("poi_id"), (String) null);
                        }
                    }
                });
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T getObjectFromMap(ReadableMap readableMap, @NonNull String str, @NonNull Class cls) {
        ReadableMap map;
        Object[] objArr = {readableMap, str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "409db5cdd4ea2da273cf6d18e4340766", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "409db5cdd4ea2da273cf6d18e4340766");
        }
        if (readableMap == null || (map = readableMap.getMap(str)) == null) {
            return null;
        }
        return (T) i.a(new JSONObject(map.toHashMap()).toString(), cls);
    }
}
