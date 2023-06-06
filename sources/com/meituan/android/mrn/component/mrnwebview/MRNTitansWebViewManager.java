package com.meituan.android.mrn.component.mrnwebview;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.scroll.i;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.mrn.component.mrnwebview.b;
import com.meituan.android.recce.props.gens.OverScrollMode;
import com.meituan.android.recce.props.gens.ShowsHorizontalScrollIndicator;
import com.meituan.android.recce.props.gens.ShowsVerticalScrollIndicator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNTitansWebViewManager extends SimpleViewManager<a> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "MRNWebView";
    public static final String KEY_CIPS = "MRNWebViewManager";
    protected static final String REACT_CLASS = "MRNWebView";
    public static String activeUrl;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static e sOnAppendAnalyzeParamsListener;
    @Nullable
    protected String mUserAgent;
    @Nullable
    protected String mUserAgentWithApplicationName;
    private ReactApplicationContext reactApplicationContext;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return MRNWebViewModule.MODULE_NAME;
    }

    public MRNTitansWebViewManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05abb256881d62b4deeb3b4de977e1e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05abb256881d62b4deeb3b4de977e1e1");
            return;
        }
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public LayoutShadowNode createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5881a0c4f7c81314312bf522120bd894", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5881a0c4f7c81314312bf522120bd894");
        }
        if (this.reactApplicationContext == null) {
            this.reactApplicationContext = reactApplicationContext;
        }
        return (LayoutShadowNode) super.createShadowNodeInstance(reactApplicationContext);
    }

    public static KNBWebCompat createKNBWebCompat(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1628c0e455d2dd0394ceb88f06323844", RobustBitConfig.DEFAULT_VALUE)) {
            return (KNBWebCompat) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1628c0e455d2dd0394ceb88f06323844");
        }
        KNBWebCompat kNBCompact = KNBWebCompactFactory.getKNBCompact(1, null);
        kNBCompact.onCreate(aoVar.getBaseContext(), (Bundle) null);
        kNBCompact.getWebSettings().invisibleTitleBar();
        return kNBCompact;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73d5dd743e1c27206387ec5832f9fb60", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73d5dd743e1c27206387ec5832f9fb60");
        }
        if (!com.meituan.android.mrn.horn.a.a().c()) {
            com.facebook.common.logging.a.b("MRNTitansWebViewManager@createViewInstance", "MRNTitansWebViewWrapper");
            a aVar = new a(aoVar);
            aVar.setShouldUseDeprecatedMRNWebView(false);
            com.meituan.android.mrn.event.listeners.e.a(aoVar, aVar);
            return aVar;
        }
        com.facebook.common.logging.a.b("MRNTitansWebViewManager@createViewInstance", "MRNWebViewWrapper");
        b.c a = b.a(aoVar);
        a.setShouldUseDeprecatedMRNWebView(true);
        return a;
    }

    public static void setOnAnalyzeParamsListener(e eVar) {
        sOnAppendAnalyzeParamsListener = eVar;
    }

    public static e getsOnAppendAnalyzeParamsListener() {
        return sOnAppendAnalyzeParamsListener;
    }

    @ReactProp(name = "appendCommonParams")
    public void setAppendCommonParams(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f96b7f076beced637b608b5697b04ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f96b7f076beced637b608b5697b04ba");
        } else if (aVar instanceof b.c) {
            com.facebook.common.logging.a.d("MRNTitansWebViewManager@setAppendCommonParams", "老框架，这个属性被使用");
            b.setAppendCommonParams((b.c) aVar, z);
        } else {
            com.facebook.common.logging.a.d("MRNTitansWebViewManager@setAppendCommonParams", "新框架，这个属性被使用");
            aVar.setAppendCommonParams(z);
        }
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0fbc4ae087a7ecceef2c6d42a044ceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0fbc4ae087a7ecceef2c6d42a044ceb");
        } else if (aVar instanceof b.c) {
            b.setJavaScriptEnabled((b.c) aVar, z);
        }
    }

    @ReactProp(name = ShowsHorizontalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsHorizontalScrollIndicator(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc2f22f2ab6e51777e644bd1a38b9b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc2f22f2ab6e51777e644bd1a38b9b07");
        } else if (aVar instanceof b.c) {
            b.setShowsHorizontalScrollIndicator((b.c) aVar, z);
        }
    }

    @ReactProp(name = ShowsVerticalScrollIndicator.LOWER_CASE_NAME)
    public void setShowsVerticalScrollIndicator(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0961f58d5ddde48ae5a13f1e48b2e3eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0961f58d5ddde48ae5a13f1e48b2e3eb");
        } else if (aVar instanceof b.c) {
            b.setShowsVerticalScrollIndicator((b.c) aVar, z);
        }
    }

    @ReactProp(name = "cacheEnabled")
    public void setCacheEnabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af3bf06f52e44d5a8083973f263ee00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af3bf06f52e44d5a8083973f263ee00c");
        } else if (aVar instanceof b.c) {
            b.setCacheEnabled((b.c) aVar, z);
        }
    }

    @ReactProp(name = "cacheMode")
    public void setCacheMode(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "931886849d88f90971bb4b1d2f650814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "931886849d88f90971bb4b1d2f650814");
        } else if (aVar instanceof b.c) {
            b.setCacheMode((b.c) aVar, str);
        }
    }

    @ReactProp(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a9cbf055ee112186a95f93c582f0021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a9cbf055ee112186a95f93c582f0021");
        } else if (aVar instanceof b.c) {
            b.setHardwareAccelerationDisabled((b.c) aVar, z);
        }
    }

    @ReactProp(name = OverScrollMode.LOWER_CASE_NAME)
    public void setOverScrollMode(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4dd0b23622ad5f25dece320c46d9261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4dd0b23622ad5f25dece320c46d9261");
        } else if (aVar instanceof b.c) {
            b.setOverScrollMode((b.c) aVar, str);
        }
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "891c779485025637691e36ce05f0952b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "891c779485025637691e36ce05f0952b");
        } else if (aVar instanceof b.c) {
            b.setThirdPartyCookiesEnabled((b.c) aVar, z);
        }
    }

    @ReactProp(name = "textZoom")
    public void setTextZoom(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b450c146e3381c7ff6219f94d258412b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b450c146e3381c7ff6219f94d258412b");
        } else if (aVar instanceof b.c) {
            b.setTextZoom((b.c) aVar, i);
        }
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a81868fefc9cbf5cba1c02fc073efaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a81868fefc9cbf5cba1c02fc073efaf");
        } else if (aVar instanceof b.c) {
            b.setScalesPageToFit((b.c) aVar, z);
        }
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f142a330c02e1e0ee93629991dcfd7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f142a330c02e1e0ee93629991dcfd7e");
        } else if (aVar instanceof b.c) {
            b.setDomStorageEnabled((b.c) aVar, z);
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00aa6b59d9896f07b4bb709e04268895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00aa6b59d9896f07b4bb709e04268895");
        } else if (aVar instanceof b.c) {
            b.setUserAgent((b.c) aVar, str);
        }
    }

    @ReactProp(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4dd5bd822dc4926560137e95bc99149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4dd5bd822dc4926560137e95bc99149");
        } else if (aVar instanceof b.c) {
            b.setApplicationNameForUserAgent((b.c) aVar, str);
        }
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aa048e73a81b58aa074d26eadc288d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aa048e73a81b58aa074d26eadc288d0");
        } else if (aVar instanceof b.c) {
            b.setMediaPlaybackRequiresUserAction((b.c) aVar, z);
        }
    }

    @ReactProp(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c9d2873055797bfc43a3c802569a0b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c9d2873055797bfc43a3c802569a0b8");
        } else if (aVar instanceof b.c) {
            b.setAllowFileAccessFromFileURLs((b.c) aVar, z);
        }
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public static void setAllowUniversalAccessFromFileURLs(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6fafbf274b14bf08f8d4a7ec4a427fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6fafbf274b14bf08f8d4a7ec4a427fb3");
        } else if (aVar instanceof b.c) {
            b.setAllowUniversalAccessFromFileURLs((b.c) aVar, z);
        }
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef166fe8b0c60ac4487179d247dd166d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef166fe8b0c60ac4487179d247dd166d");
        } else if (aVar instanceof b.c) {
            b.setSaveFormDataDisabled((b.c) aVar, z);
        }
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "886a0466ef7e86060182aa4c183dca3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "886a0466ef7e86060182aa4c183dca3b");
        } else {
            aVar.setInjectedJavaScript(str);
        }
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d7b80476b9ac91065d44707bdeed6f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d7b80476b9ac91065d44707bdeed6f9");
        } else {
            aVar.setMessagingEnabled(z);
        }
    }

    @ReactProp(name = "incognito")
    public void setIncognito(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad2ec1809b043c794d7593385d76bc42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad2ec1809b043c794d7593385d76bc42");
        } else if (aVar instanceof b.c) {
            b.setIncognito((b.c) aVar, z);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7245b697719e9aab77c26224249490db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7245b697719e9aab77c26224249490db");
            return;
        }
        super.onAfterUpdateTransaction((MRNTitansWebViewManager) aVar);
        if (aVar.a()) {
            if (aVar instanceof b.c) {
                com.facebook.common.logging.a.b("MRNTitansWebViewManager@onAfterUpdateTransaction", "MRNWebViewWrapper");
                b.a((b.c) aVar);
                return;
            }
            com.facebook.common.logging.a.b("MRNTitansWebViewManager@onAfterUpdateTransaction", "MRNTitansWebViewWrapper");
            aVar.d();
        }
    }

    public static void handleFileSchemePermission(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb450949e1ed2b63671a14ecd2b46f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb450949e1ed2b63671a14ecd2b46f7f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                String path = Uri.parse(str).getPath();
                if (path == null) {
                    return;
                }
                String canonicalPath = new File(path).getParentFile().getCanonicalPath();
                if (canonicalPath.startsWith(q.a(context, "mrn_default", (String) null, u.e).getParentFile().getCanonicalPath())) {
                    List<String> stringListConfig = KNBConfig.getStringListConfig(KNBConfig.CONFIG_FILE_PROTOCOL_WHITE_LIST, Collections.EMPTY_LIST);
                    if (stringListConfig.contains(canonicalPath)) {
                        return;
                    }
                    stringListConfig.add(canonicalPath);
                    KNBConfig.setConfig(KNBConfig.CONFIG_FILE_PROTOCOL_WHITE_LIST, stringListConfig);
                }
            } catch (IOException unused) {
            }
        }
    }

    @ReactProp(name = "source")
    public void setSource(a aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c93c5847e988606db6a8982cdd7619c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c93c5847e988606db6a8982cdd7619c");
            return;
        }
        com.facebook.common.logging.a.b("MRNTitansWebViewManager@setSource ", readableMap.toString());
        aVar.setPendingSource(readableMap);
    }

    @ReactProp(name = "onContentSizeChange")
    public void setOnContentSizeChange(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da2db50044fc1361c776af079673f957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da2db50044fc1361c776af079673f957");
        } else if (aVar instanceof b.c) {
            com.facebook.common.logging.a.d("MRNTitansWebViewManager@setOnContentSizeChange", "老框架，这个属性被使用");
            b.setOnContentSizeChange((b.c) aVar, z);
        }
    }

    @ReactProp(name = "mixedContentMode")
    public static void setMixedContentMode(a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4f660cf0abbf8326ef6b4d5e8ff1b2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4f660cf0abbf8326ef6b4d5e8ff1b2c");
        } else if (aVar instanceof b.c) {
            b.setMixedContentMode((b.c) aVar, str);
        }
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(a aVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e787f3238bbc30faaa458bafae535415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e787f3238bbc30faaa458bafae535415");
        } else if (aVar instanceof b.c) {
            b.setUrlPrefixesForDefaultIntent((b.c) aVar, readableArray);
        }
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97bf286638146269a0d898a8aeec0a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97bf286638146269a0d898a8aeec0a4b");
        } else if (aVar instanceof b.c) {
            b.setAllowFileAccess((b.c) aVar, bool);
        }
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aea96371e2a7cc158c89ba8df377d378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aea96371e2a7cc158c89ba8df377d378");
        } else if (aVar instanceof b.c) {
            b.setGeolocationEnabled((b.c) aVar, bool);
        }
    }

    @ReactProp(name = "onScroll")
    public void setOnScroll(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e2890d49bfd4b731cae712174868eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e2890d49bfd4b731cae712174868eff");
        } else if (aVar instanceof b.c) {
            com.facebook.common.logging.a.d("MRNTitansWebViewManager@setOnScroll", "老框架，这个属性被使用");
            b.setOnScroll((b.c) aVar, z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ao aoVar, a aVar) {
        Object[] objArr = {aoVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06bcb9bb137fa5ba48535696fed85e37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06bcb9bb137fa5ba48535696fed85e37");
        } else if (aVar instanceof b.c) {
            com.facebook.common.logging.a.b("MRNTitansWebViewManager@addEventEmitters", "MRNWebViewWrapper");
            b.b((b.c) aVar);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09b0255f5d6c13167964902fca33861a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09b0255f5d6c13167964902fca33861a");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = com.facebook.react.common.c.a();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", com.facebook.react.common.c.a("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", com.facebook.react.common.c.a("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(i.a(i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", com.facebook.react.common.c.a("registrationName", "onHttpError"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f1398aab5aaef0be2c5987f2e00111a", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f1398aab5aaef0be2c5987f2e00111a") : com.facebook.react.common.c.b().a("goBack", 1).a("goForward", 2).a("reload", 3).a("stopLoading", 4).a("postMessage", 5).a("injectJavaScript", 6).a("loadUrl", 7).a("requestFocus", 8).a("clearFormData", 1000).a("clearCache", 1001).a("clearHistory", 1002).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a aVar, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "967aab4a3bc722b2cf97fe2ba0aec4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "967aab4a3bc722b2cf97fe2ba0aec4e7");
        } else if (aVar instanceof b.c) {
            com.facebook.common.logging.a.b("MRNTitansWebViewManager@receiveCommand MRNWebViewWrapper", "commandId " + i);
            if (i != 5 || i != 6 || i != 8) {
                com.facebook.common.logging.a.d("MRNTitansWebViewManager@receiveCommand ", "MRNWebViewWrapper receive MRNTitansWebViewWrapper unsupported command " + i);
            }
            b.a((b.c) aVar, i, readableArray);
        } else {
            com.facebook.common.logging.a.a("MRNTitansWebViewManager@receiveCommand", "MRNTitansWebViewWrapper", "commandId " + i);
            switch (i) {
                case 5:
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", readableArray.getString(0));
                        aVar.a("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                        return;
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                case 6:
                    aVar.a(readableArray.getString(0));
                    return;
                case 7:
                default:
                    com.facebook.common.logging.a.d("MRNTitansWebViewManager@receiveCommand ", "MRNTitansWebViewWrapper receive unsupported command " + i);
                    return;
                case 8:
                    aVar.requestFocus();
                    return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22d99bd065df87e021cf0b400cccee97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22d99bd065df87e021cf0b400cccee97");
            return;
        }
        super.onDropViewInstance((MRNTitansWebViewManager) aVar);
        if (aVar instanceof b.c) {
            com.facebook.common.logging.a.b("MRNTitansWebViewManager@onDropViewInstance", "MRNWebViewWrapper");
            b.c((b.c) aVar);
        }
    }
}
