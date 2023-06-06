package com.meituan.android.preload.config;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    @SerializedName("switch")
    public boolean b;
    @SerializedName("next_delay")
    public int c;
    @SerializedName("enable_warm_webview")
    public boolean d;
    @SerializedName("warm_webview_delay")
    public int e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e719058893a0a2770360685736fad8c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e719058893a0a2770360685736fad8c3");
        } else {
            this.e = 4000;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e49d5af72173d537e2af9b6dcc6325b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e49d5af72173d537e2af9b6dcc6325b");
        }
        return "GlobalConfig{enable=" + this.b + ", nextDelay=" + this.c + ", enableWarmWebView=" + this.d + ", warmWebViewDelay=" + this.e + '}';
    }
}
