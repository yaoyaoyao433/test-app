package com.sankuai.meituan.android.knb;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.config.BridgeConfig;
import com.tencent.connect.common.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBConfigEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("access")
    @Expose
    public Access access;
    @SerializedName("bridge")
    @Expose
    public BridgeConfig bridge;
    @SerializedName("cache")
    @Expose
    public Cache cache;
    @SerializedName("deploy")
    @Expose
    public Deploy deploy;
    @SerializedName("design")
    @Expose
    public Design design;
    @SerializedName("inject")
    @Expose
    public Inject inject;
    @SerializedName("report")
    @Expose
    public Report report;
    @SerializedName(NetLogConstants.Details.SCHEME)
    @Expose
    public Scheme scheme;
    @SerializedName("switch")
    @Expose
    public Switch switcher;
    @SerializedName("update")
    @Expose
    public Update update;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Access {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("black")
        @TiledConfig(name = KNBConfig.CONFIG_ACCESS_BLACK)
        @Expose
        public List<String> black;
        @SerializedName("certificate")
        @TiledConfig(name = KNBConfig.CONFIG_ACCESS_CERTIFICATE)
        @Expose
        public JSONArray certificate;
        @SerializedName("internalWhite")
        @TiledConfig(name = KNBConfig.CONFIG_COMPANY_INTERNAL_WHITE)
        @Expose
        public List<String> internalWhite;
        @SerializedName(TrafficRecord.Detail.TUNNEL_SHARK)
        @TiledConfig(name = KNBConfig.CONFIG_ACCESS_SHARK)
        @Expose
        public List<String> shark;
        @SerializedName(alternate = {"web-action-black"}, value = "webActionBlack")
        @TiledConfig(name = KNBConfig.CONFIG_WEB_ACTION_BLACK)
        @Expose
        public List<String> webActionBlack;
        @SerializedName("white")
        @TiledConfig(name = KNBConfig.CONFIG_ACCESS_WHITE)
        @Expose
        public List<String> white;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Cache {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(KNBConfig.CONFIG_CLEAR_CACHE)
        @TiledConfig(name = KNBConfig.CONFIG_CLEAR_CACHE)
        @Expose
        public List<String> clear;
        @SerializedName(KNBConfig.CONFIG_CLEAR_FILE_LIST)
        @TiledConfig(name = KNBConfig.CONFIG_CLEAR_FILE_LIST)
        @Expose
        public List<String> clearFileList;
        @SerializedName("customKey")
        @TiledConfig(name = KNBConfig.CONFIG_CLEAR_CUSTOM_KEY)
        @Expose
        public String customKey;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class DebugJsInject {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("label")
        @Expose
        public String label;
        @SerializedName("labelId")
        @Expose
        public String labelId;
        @SerializedName("script")
        @Expose
        public String script;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Deploy {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("white")
        @TiledConfig(name = KNBConfig.CONFIG_DEPLOY_WHITE)
        @Expose
        public List<String> white;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Design {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("titlebar")
        @TiledConfig(name = KNBConfig.CONFIG_DESIGN_TITLE_BAR)
        @Expose
        public JSONObject titlebar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class Inject {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(alternate = {"debug-selector"}, value = "debugSelector")
        @TiledConfig(name = KNBConfig.CONFIG_INJECT_DEBUG_JS)
        @Expose
        public JSONArray debugJsInjectList;
        @SerializedName("patch")
        @TiledConfig(name = KNBConfig.CONFIG_INJECT_PATCH_JS)
        @Expose
        public JSONArray patches;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class Report {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("devices")
        @TiledConfig(name = KNBConfig.CONFIG_REPORT_DEVICES)
        @Expose
        public List<String> devices;
        @SerializedName(alternate = {KNBConfig.CONFIG_REPORT_DNS}, value = "reportDns")
        @TiledConfig(name = KNBConfig.CONFIG_REPORT_DNS)
        @Expose
        public List<String> dns;
        @SerializedName("offline")
        @TiledConfig(name = KNBConfig.CONFIG_REPORT_OFFLINE)
        @Expose
        public JSONArray offline;
        @SerializedName(SearchIntents.EXTRA_QUERY)
        @TiledConfig(name = KNBConfig.CONFIG_REPORT_QUERY)
        @Expose
        public List<String> query;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Scheme {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("ehwebview")
        @TiledConfig(name = KNBConfig.CONFIG_SCHEME_EHWEBVIEW)
        @Expose
        public List<String> ehwebview;
        @SerializedName("white")
        @TiledConfig(name = KNBConfig.CONFIG_SCHEME_WHITE)
        @Expose
        public List<String> white;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Switch {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(alternate = {"using-shark"}, value = "usingShark")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_USING_SHARK)
        @Expose
        public boolean usingShark = true;
        @SerializedName(alternate = {"using-offline"}, value = "usingOffline")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_USING_OFFLINE)
        @Expose
        public boolean usingOffline = true;
        @SerializedName(alternate = {"using-offline-main-frame"}, value = "usingOfflineMainFrame")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_OFFLINE_USING_MAIN_FRAME)
        @Expose
        public boolean usingOfflineMainFrame = false;
        @SerializedName(alternate = {"using-slowdraw"}, value = "usingSlowdraw")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_USING_SLOW_DRAW)
        @Expose
        public boolean usingSlowDraw = false;
        @SerializedName(alternate = {"using-check-ssl-error"}, value = "usingCheckSslError")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_USING_CHECK_SSL_ERROR)
        @Expose
        public boolean checkSSLError = true;
        @SerializedName("usingCheckHttpError")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_USING_CHECK_HTTP_ERROR)
        @Expose
        public boolean checkHttpError = true;
        @SerializedName(alternate = {"using-clear-webview-cache"}, value = "usingClearWebviewCache")
        @Expose
        public boolean clearWebViewCache = false;
        @SerializedName(alternate = {"using-encode"}, value = "usingEncode")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_USING_ENCODE)
        @Expose
        public boolean usingEncode = false;
        @SerializedName("revertFileChooserLogic")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_REVERT_FILE_CHOOSER_LOGIC)
        @Expose
        public boolean revertFileChooserLogic = false;
        @SerializedName("allowGeolocation")
        @TiledConfig(name = KNBConfig.CONFIG_SWITCH_ALLOW_GEOLOCATION)
        @Expose
        public boolean allowGeolocation = false;
    }

    /* compiled from: ProGuard */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes4.dex */
    public @interface TiledConfig {
        String name() default "";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class Update {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("offline")
        @Expose
        public List<Offline> offline;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Offline {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("hash")
        @Expose
        public List<String> list;
        @SerializedName(Constants.PARAM_SCOPE)
        @Expose
        public String scope;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a99351e7d74e9fd8a409cd9d9e6c20ad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a99351e7d74e9fd8a409cd9d9e6c20ad") : KNBConfig.gson().toJson(this);
        }
    }
}
