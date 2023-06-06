package com.facebook.react.bridge;

import android.content.res.AssetManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface JSBundleLoaderDelegate {
    String evaluateJavaScript(String str, String str2);

    List<String> getLoadedJSList();

    void loadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    void loadScriptFromDioFile(String str, String str2, String str3, String str4, LoadJSCodeCacheCallback loadJSCodeCacheCallback, boolean z);

    void loadScriptFromDioFile(String str, String str2, String str3, boolean z);

    void loadScriptFromFile(String str, String str2, boolean z);

    void loadScriptFromString(String str, String str2, boolean z);

    void setGlobalVariableSync(String str, String str2);

    void setSourceURLs(String str, String str2);
}
