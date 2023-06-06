package com.meituan.msc.modules.engine.requestPrefetch;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.msc.lib.interfaces.requestprefetch.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PrefetchConfig extends com.meituan.msc.lib.interfaces.requestprefetch.a {
    public static final String PREFETCH_METHOD_GET = "GET";
    public static final String PREFETCH_METHOD_POST = "POST";
    public static final String PREFETCH_POST_CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    public static final String PREFETCH_POST_CONTENT_TYPE_JSON = "application/json";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("contentType")
    public String contentType;
    @SerializedName("enableSecuritySign")
    public boolean enableSecuritySign;
    @SerializedName("enableSecuritySiua")
    public boolean enableSecuritySiua;
    @SerializedName("enableShark")
    public boolean enableShark;
    @SerializedName("keyMap")
    public Map<String, String> keyMap;
    @SerializedName("location")
    public LocationConfig locationConfig;
    @SerializedName("method")
    public String method;
    @SerializedName("pagePath")
    public String pagePath;
    @SerializedName("timeout")
    public long timeout;
    @SerializedName("url")
    public String url;

    public PrefetchConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "203b68c02a085d2ea5504fc40d9d7758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "203b68c02a085d2ea5504fc40d9d7758");
            return;
        }
        this.method = "GET";
        this.contentType = PREFETCH_POST_CONTENT_TYPE_JSON;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class LocationConfig extends a.AbstractC0446a {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("enable")
        public boolean enable;
        @SerializedName("sceneToken")
        public String sceneToken;
        @SerializedName("type")
        public String type;

        @Override // com.meituan.msc.lib.interfaces.requestprefetch.a.AbstractC0446a
        public boolean isEnable() {
            return this.enable;
        }

        @Override // com.meituan.msc.lib.interfaces.requestprefetch.a.AbstractC0446a
        public String getType() {
            return this.type;
        }

        @Override // com.meituan.msc.lib.interfaces.requestprefetch.a.AbstractC0446a
        public String getSceneToken() {
            return this.sceneToken;
        }
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public String getPagePath() {
        return this.pagePath;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public String getMethod() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d1eba99f37162bc9a75996bd9711f1f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d1eba99f37162bc9a75996bd9711f1f") : this.method.toUpperCase();
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public String getUrl() {
        return this.url;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public Map<String, String> getKeyMap() {
        return this.keyMap;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public boolean isEnableShark() {
        return this.enableShark;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public long getTimeout() {
        return this.timeout;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public a.AbstractC0446a getLocation() {
        return this.locationConfig;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public boolean isEnableSecuritySign() {
        return this.enableSecuritySign;
    }

    @Override // com.meituan.msc.lib.interfaces.requestprefetch.a
    public boolean isEnableSecuritySiua() {
        return this.enableSecuritySiua;
    }

    public static PrefetchConfig parse(Map<String, Object> map) throws IllegalArgumentException, ClassCastException {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3cf916ecbba99c7c41c2d0c8d39df3fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrefetchConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3cf916ecbba99c7c41c2d0c8d39df3fc");
        }
        PrefetchConfig prefetchConfig = new PrefetchConfig();
        prefetchConfig.pagePath = getAsString(map.get("pagePath"));
        prefetchConfig.url = getAsString(map.get("url"));
        prefetchConfig.enableShark = getAsBoolean(map.get("enableShark"));
        prefetchConfig.timeout = getAsLong(map.get("timeout"));
        String asString = getAsString(map.get("method"));
        if (asString != null) {
            prefetchConfig.method = asString;
        }
        String asString2 = getAsString(map.get("contentType"));
        if (asString2 != null) {
            prefetchConfig.contentType = asString2;
        }
        prefetchConfig.enableSecuritySign = getAsBoolean(map.get("enableSecuritySign"));
        prefetchConfig.enableSecuritySiua = getAsBoolean(map.get("enableSecuritySiua"));
        LocationConfig locationConfig = new LocationConfig();
        prefetchConfig.locationConfig = locationConfig;
        Map map2 = (Map) map.get("location");
        if (map2 != null) {
            locationConfig.enable = getAsBoolean(map2.get("enable"));
            locationConfig.type = getAsString(map2.get("type"));
            locationConfig.sceneToken = getAsString(map2.get("sceneToken"));
        }
        prefetchConfig.keyMap = (Map) map.get("keyMap");
        return prefetchConfig;
    }

    private static String getAsString(Object obj) throws IllegalArgumentException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f44032366ee00f38459f324ab604a6a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f44032366ee00f38459f324ab604a6a4");
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            return String.valueOf(obj);
        }
        throw new IllegalArgumentException("only support String, Number, Boolean or Character");
    }

    private static long getAsLong(Object obj) throws IllegalArgumentException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffc29eaceec3d09477db82b1cada7d0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffc29eaceec3d09477db82b1cada7d0a")).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        if (obj instanceof Character) {
            return Long.parseLong(String.valueOf(obj));
        }
        throw new IllegalArgumentException("only support String or Number");
    }

    private static boolean getAsBoolean(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2610cec3aa3cc7f5b390a5b601405bf6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2610cec3aa3cc7f5b390a5b601405bf6")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        return false;
    }
}
