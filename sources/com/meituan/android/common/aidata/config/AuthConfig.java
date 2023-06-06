package com.meituan.android.common.aidata.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.utils.CollectionUtils;
import com.meituan.android.common.aidata.utils.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuthConfig {
    private static final String KEY_AUTH_LIST = "auth_list";
    private static final String KEY_ENABLE_MMP_DB_AUTH = "enable_mmp_db_auth";
    private static final String KEY_ENABLE_MMP_REALTIME_AUTH = "enable_mmp_realtime_auth";
    private static final String KEY_FORCE_REALTIME_AUTH = "force_realtime_auth";
    private static final String KEY_IGNORE_REALTIME_AUTH = "ignore_realtime_auth";
    private static final String KEY_MMP_AUTH_LIST = "mmp_auth_list";
    private static final String KEY_SUBTABLE_AUTH_LIST = "subtable_auth_list";
    private static final String TAG = "AuthConfig";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile AuthConfig sInstance;
    @NonNull
    private final Map<String, List<String>> mAuthListMap;
    private boolean mForceRealtimeAuth;
    private boolean mIgnoreRealtimeAuth;
    @Nullable
    private List<String> mMmpAuthList;
    private boolean mMmpDBAuthEnabled;
    private boolean mMmpRealtimeAuthEnabled;
    public List<String> mTokenWhileList;

    public AuthConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9fd707929b4759460720ba1d1e07570", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9fd707929b4759460720ba1d1e07570");
            return;
        }
        this.mIgnoreRealtimeAuth = true;
        this.mForceRealtimeAuth = false;
        this.mAuthListMap = new HashMap();
        this.mTokenWhileList = new ArrayList();
        this.mMmpRealtimeAuthEnabled = false;
        this.mMmpDBAuthEnabled = false;
    }

    public static AuthConfig getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06ca41cfb838dc028167206c5d28a548", RobustBitConfig.DEFAULT_VALUE)) {
            return (AuthConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06ca41cfb838dc028167206c5d28a548");
        }
        if (sInstance == null) {
            synchronized (AuthConfig.class) {
                if (sInstance == null) {
                    sInstance = new AuthConfig();
                }
            }
        }
        return sInstance;
    }

    public void updateConfig(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1feb774ba5ac1d255ee03a744fc58b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1feb774ba5ac1d255ee03a744fc58b5");
            return;
        }
        this.mAuthListMap.clear();
        this.mIgnoreRealtimeAuth = jSONObject.optBoolean(KEY_IGNORE_REALTIME_AUTH, true);
        this.mForceRealtimeAuth = jSONObject.optBoolean(KEY_FORCE_REALTIME_AUTH, false);
        JSONObject optJSONObject = jSONObject.optJSONObject(KEY_AUTH_LIST);
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = optJSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.optString(i));
                        }
                    }
                    this.mAuthListMap.put(next, arrayList);
                }
            }
        }
        updateMmpAuthConfig(jSONObject);
        DBAuthConfig.configDbAuth(jSONObject, optJSONObject, this.mAuthListMap, JSONUtils.convertJSONObjectToMap(jSONObject.optJSONObject(KEY_SUBTABLE_AUTH_LIST)));
    }

    public boolean isRealTimeDataAllowed(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fde462bd07cf30c2441b509ddcab8b15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fde462bd07cf30c2441b509ddcab8b15")).booleanValue();
        }
        if (this.mIgnoreRealtimeAuth) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return !this.mForceRealtimeAuth;
        }
        return isCategoryDataAuthorized(str, str2);
    }

    private boolean isCategoryDataAuthorized(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "301859b6ae4b7aec9d3df303e38c727d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "301859b6ae4b7aec9d3df303e38c727d")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        List<String> list = this.mAuthListMap.get(str);
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        if (!list.contains(str2)) {
            StringBuilder sb = new StringBuilder("category ");
            sb.append(str2);
            sb.append(" is not in authorized category list, category data not authorized");
            return false;
        }
        StringBuilder sb2 = new StringBuilder("category ");
        sb2.append(str2);
        sb2.append(" is in authorized category list, category data authorized");
        return true;
    }

    private void updateMmpAuthConfig(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a62c9b86f6bfd3fdb282820aea3b15e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a62c9b86f6bfd3fdb282820aea3b15e8");
            return;
        }
        this.mMmpRealtimeAuthEnabled = jSONObject.optBoolean(KEY_ENABLE_MMP_REALTIME_AUTH, false);
        this.mMmpDBAuthEnabled = jSONObject.optBoolean(KEY_ENABLE_MMP_DB_AUTH, false);
        if (this.mMmpAuthList != null) {
            this.mMmpAuthList.clear();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_MMP_AUTH_LIST);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        if (this.mMmpAuthList == null) {
            this.mMmpAuthList = new ArrayList();
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                this.mMmpAuthList.add(optString);
            }
        }
    }

    public boolean isMmpRealtimeAuthEnabled() {
        return this.mMmpRealtimeAuthEnabled;
    }

    public boolean isMmpDBAuthEnabled() {
        return this.mMmpDBAuthEnabled;
    }

    public boolean isMmpRealTimeDataAllowed(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f649c80be538090dfa7631aec0f537e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f649c80be538090dfa7631aec0f537e3")).booleanValue();
        }
        if (this.mMmpRealtimeAuthEnabled) {
            return isMmpDataAuthorized(str);
        }
        return true;
    }

    public boolean isMmpDBDataAllowed(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddfc881319db44243ccf0267b01c0483", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddfc881319db44243ccf0267b01c0483")).booleanValue();
        }
        if (this.mMmpDBAuthEnabled) {
            return isMmpDataAuthorized(str);
        }
        return true;
    }

    private boolean isMmpDataAuthorized(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b9be5839f1977362fea43fc314d8383", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b9be5839f1977362fea43fc314d8383")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(this.mMmpAuthList)) {
            return false;
        }
        if (!this.mMmpAuthList.contains(str)) {
            StringBuilder sb = new StringBuilder("token ");
            sb.append(str);
            sb.append(" is not in mmp auth list, mmp data not authorized");
            return false;
        }
        StringBuilder sb2 = new StringBuilder("token ");
        sb2.append(str);
        sb2.append(" is in mmp auth list, mmp data authorized");
        return true;
    }
}
