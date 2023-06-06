package com.reactnativecommunity.webview;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/reactnativecommunity/webview/RNCWebViewPackage;", "Lcom/facebook/react/ReactPackage;", "()V", "createNativeModules", "", "Lcom/reactnativecommunity/webview/RNCWebViewModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/reactnativecommunity/webview/RNCWebViewManager;", "android_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a implements i {
    @Override // com.facebook.react.i
    @NotNull
    public final List<RNCWebViewModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) {
        h.b(reactApplicationContext, "reactContext");
        return kotlin.collections.h.a(new RNCWebViewModule(reactApplicationContext));
    }

    @Override // com.facebook.react.i
    @NotNull
    public final List<RNCWebViewManager> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        h.b(reactApplicationContext, "reactContext");
        return kotlin.collections.h.a(new RNCWebViewManager());
    }
}
