package com.facebook.react.modules.core;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
/* compiled from: ProGuard */
@ReactModule(name = HeadlessJsTaskSupportModule.NAME)
/* loaded from: classes.dex */
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void notifyTaskRetry(double d, Promise promise) {
        int i = (int) d;
        com.facebook.react.jstasks.b a = com.facebook.react.jstasks.b.a(getReactApplicationContext());
        if (a.c(i)) {
            promise.resolve(Boolean.valueOf(a.a(i)));
            return;
        }
        com.facebook.common.logging.a.a(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
        promise.resolve(Boolean.FALSE);
    }

    @ReactMethod
    public void notifyTaskFinished(double d) {
        int i = (int) d;
        com.facebook.react.jstasks.b a = com.facebook.react.jstasks.b.a(getReactApplicationContext());
        if (a.c(i)) {
            a.b(i);
        } else {
            com.facebook.common.logging.a.a(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }
}
