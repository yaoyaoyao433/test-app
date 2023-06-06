package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.titans.config.annotation.TitansConfig;
/* compiled from: ProGuard */
@TitansConfig(key = "switch")
/* loaded from: classes4.dex */
public class Switch {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("usingShark")
    @Expose
    public boolean usingShark = true;
    @SerializedName("usingOffline")
    @Expose
    public boolean usingOffline = true;
    @SerializedName("usingOfflineMainFrame")
    @Expose
    public boolean usingOfflineMainFrame = false;
    @SerializedName("usingPreload")
    @Expose
    public boolean usingPreload = false;
    @SerializedName("usingAsyncInit")
    @Expose
    public boolean usingAsyncInit = false;
    @SerializedName("usingSlowDraw")
    @Expose
    public boolean usingSlowDraw = false;
    @SerializedName("checkSSLError")
    @Expose
    public boolean checkSSLError = true;
    @SerializedName("checkHttpError")
    @Expose
    public boolean checkHttpError = true;
    @SerializedName("clearWebViewCache")
    @Expose
    public boolean clearWebViewCache = false;
    @SerializedName("allowGeolocation")
    @Expose
    public boolean allowGeolocation = false;
}
