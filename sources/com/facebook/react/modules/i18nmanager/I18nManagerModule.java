package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = I18nManagerModule.NAME)
/* loaded from: classes.dex */
public class I18nManagerModule extends ContextBaseJavaModule {
    public static final String NAME = "I18nManager";
    private final a sharedI18nUtilInstance;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public I18nManagerModule(Context context) {
        super(context);
        this.sharedI18nUtilInstance = a.a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Context context = getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap hashMap = new HashMap();
        hashMap.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.a(context)));
        a aVar = this.sharedI18nUtilInstance;
        hashMap.put("doLeftAndRightSwapInRTL", Boolean.valueOf(a.a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)));
        hashMap.put("localeIdentifier", locale.toString());
        return hashMap;
    }

    @ReactMethod
    public void allowRTL(boolean z) {
        a aVar = this.sharedI18nUtilInstance;
        a.b(getContext(), "RCTI18nUtil_allowRTL", z);
    }

    @ReactMethod
    public void forceRTL(boolean z) {
        a aVar = this.sharedI18nUtilInstance;
        a.b(getContext(), "RCTI18nUtil_forceRTL", z);
    }

    @ReactMethod
    public void swapLeftAndRightInRTL(boolean z) {
        a aVar = this.sharedI18nUtilInstance;
        a.b(getContext(), "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}
