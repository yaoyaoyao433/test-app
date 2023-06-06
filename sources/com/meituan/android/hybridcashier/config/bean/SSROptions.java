package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class SSROptions implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enable_ssr")
    private boolean ssrEnabled;
    @SerializedName("ssr_request_path")
    private String ssrRequestPath;
    @SerializedName("ssr_show_on_visible")
    private String ssrShowOnVisible;

    public boolean isSsrEnabled() {
        return this.ssrEnabled;
    }

    public String getSsrRequestPath() {
        return this.ssrRequestPath;
    }

    public String getSsrShowOnVisible() {
        return this.ssrShowOnVisible;
    }
}
