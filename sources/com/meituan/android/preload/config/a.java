package com.meituan.android.preload.config;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.core.config.PreLoadConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    @SerializedName("enable_preload")
    public boolean b;
    @SerializedName(PreLoadConfig.PRELOAD_URL)
    public String c;
    @SerializedName("preload_prefix")
    public String d;
    @SerializedName("delay")
    public int e;
    @SerializedName("enable_offline")
    public boolean f;
    public int g;
    public String h;
    public String i;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f61b893c09c41f320755ea48490cb6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f61b893c09c41f320755ea48490cb6d");
        }
        return "BizConfig{enablePreload=" + this.b + ", preloadUrl='" + this.c + "', preloadPrefix='" + this.d + "', delay=" + this.e + ", enableOffline=" + this.f + ", offlineMode=" + this.g + ", offlineCategory='" + this.h + "', bizName='" + this.i + "'}";
    }
}
