package com.facebook.react.modules.debug;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = SourceCodeModule.NAME)
/* loaded from: classes.dex */
public class SourceCodeModule extends ReactContextBaseJavaModule {
    public static final String NAME = "SourceCode";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    protected Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("scriptURL", (String) com.facebook.infer.annotation.a.a(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }
}
