package com.meituan.android.mrn.module;

import com.facebook.common.logging.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.common.mrn.analytics.library.NativeStasticsProxy;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
@ReactModule(name = MRNStatistics.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNStatistics extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNStatistics";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final NativeStasticsProxy mStasticsProxy;
    private k mrnInstance;

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNStatistics(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08ce28ef45f5787566c6908c681722a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08ce28ef45f5787566c6908c681722a7");
        } else {
            this.mStasticsProxy = NativeStasticsProxy.getInstance();
        }
    }

    @ReactMethod
    public void trackMPT(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f500096ce96621aee3698293ceb7d656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f500096ce96621aee3698293ceb7d656");
        } else {
            this.mStasticsProxy.pageView(str2, str, str3, getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackMPTDisappear(String str, String str2, ReadableMap readableMap) {
        Object[] objArr = {str, str2, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a746de91702e16ea7a23725e71990c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a746de91702e16ea7a23725e71990c27");
        } else {
            this.mStasticsProxy.pageDisappear(str2, str, "", getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackPD(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60eb2f4f67651e8f08ef9acdd4905d46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60eb2f4f67651e8f08ef9acdd4905d46");
        } else {
            this.mStasticsProxy.pageDisappear(str2, str, str3, getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackMGEClickEvent(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b215d2d178e19e3e4e024681cb70b68a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b215d2d178e19e3e4e024681cb70b68a");
        } else {
            this.mStasticsProxy.moduleClick(null, str, str2, str3, getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackModuleClick(String str, String str2, String str3, String str4, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, str4, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02755faa6a5b49a2bc1964bbcf90c08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02755faa6a5b49a2bc1964bbcf90c08b");
            return;
        }
        getMapFromRN(readableMap);
        this.mStasticsProxy.moduleClick(str2, str, str3, str4, getMapFromRN(readableMap));
    }

    @ReactMethod
    public void trackMGEViewEvent(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65a6eadf3f65aa5421690d25e9d5a99a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65a6eadf3f65aa5421690d25e9d5a99a");
        } else {
            this.mStasticsProxy.moduleView(null, str, str2, str3, getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackModuleView(String str, String str2, String str3, String str4, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, str4, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaab6e39300fc6102c6f3eee77839989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaab6e39300fc6102c6f3eee77839989");
        } else {
            this.mStasticsProxy.moduleView(str2, str, str3, str4, getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackPayEvent(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bfde35e6a7f2888021f1c9b5637e373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bfde35e6a7f2888021f1c9b5637e373");
        } else {
            this.mStasticsProxy.pay(null, str, str2, str3, "", getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackBizPay(String str, String str2, String str3, String str4, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, str4, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b09b119cfcef5e0298886d05f617b2e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b09b119cfcef5e0298886d05f617b2e3");
        } else {
            this.mStasticsProxy.pay(str2, str, str3, str4, "", getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackOrderEvent(String str, String str2, String str3, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b02c009a238885b081e5323bd4c21bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b02c009a238885b081e5323bd4c21bc0");
        } else {
            this.mStasticsProxy.order(null, str, str2, str3, "", getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackBizOrder(String str, String str2, String str3, String str4, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, str4, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d92d60632f828ae18d7a6313275b0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d92d60632f828ae18d7a6313275b0bb");
        } else {
            this.mStasticsProxy.order(str2, str, str3, str4, "", getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackModuleEdit(String str, String str2, String str3, String str4, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, str4, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cc5c2e71617f7652fff2fd9da75c686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cc5c2e71617f7652fff2fd9da75c686");
        } else {
            this.mStasticsProxy.moduleEdit(str2, str, str3, str4, getMapFromRN(readableMap));
        }
    }

    @ReactMethod
    public void trackSystemCheck(String str, String str2, String str3, String str4, ReadableMap readableMap) {
        Object[] objArr = {str, str2, str3, str4, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caaf169b5627c3b7dadad1a33824aa0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caaf169b5627c3b7dadad1a33824aa0d");
        } else {
            this.mStasticsProxy.systemCheck(str2, str, str3, str4, getMapFromRN(readableMap));
        }
    }

    private HashMap<String, Object> getMapFromRN(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9916d6f47300c10a6cf853f950f0cc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9916d6f47300c10a6cf853f950f0cc7");
        }
        if (readableMap == null) {
            hashMap = new HashMap<>();
        } else {
            hashMap = readableMap.toHashMap();
        }
        return addMRNSign(hashMap);
    }

    @ReactMethod
    public void setTag(ReadableMap readableMap, String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30785cc88af663ec1cd7932b95d08762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30785cc88af663ec1cd7932b95d08762");
        } else {
            this.mStasticsProxy.setTag(str, readableMap);
        }
    }

    private HashMap addMRNSign(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96f22eb8f48ae0d3c163d9db3af71bce", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96f22eb8f48ae0d3c163d9db3af71bce");
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable th) {
                a.a("LXMRN", "statistics_add_custom_error", th);
            }
        }
        HashMap hashMap2 = null;
        if (hashMap.containsKey("custom")) {
            Object obj = hashMap.get("custom");
            if (obj instanceof HashMap) {
                hashMap2 = (HashMap) obj;
            }
        } else {
            hashMap2 = new HashMap();
            hashMap.put("custom", hashMap2);
        }
        if (hashMap2 != null) {
            hashMap2.put("from_mrn", "1");
            ensureMRNInstance();
            if (this.mrnInstance != null && this.mrnInstance.i != null) {
                hashMap2.put("mrn_bundle_name", this.mrnInstance.i.c);
                hashMap2.put("mrn_bundle_version", this.mrnInstance.i.f);
            }
        } else {
            a.a("LXMRN", "statistics_add_custom_error", new Throwable("customMap is null"));
        }
        return hashMap;
    }

    private void ensureMRNInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b4b2cd6b45046f5d4ac70fa80ec8fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b4b2cd6b45046f5d4ac70fa80ec8fc3");
        } else if (this.mrnInstance == null) {
            this.mrnInstance = r.a(getReactApplicationContext());
        }
    }
}
