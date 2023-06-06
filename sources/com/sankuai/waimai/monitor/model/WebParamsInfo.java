package com.sankuai.waimai.monitor.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WebParamsInfo extends CommonParamsInfo {
    public static String NAME = "WebParamsInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String ua;
    private String wParams;
    private String wType;

    public WebParamsInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0ba9e22e9a76fe0c9e496d99d7b1548", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0ba9e22e9a76fe0c9e496d99d7b1548");
        } else {
            setPageType("webview");
        }
    }

    public String getwType() {
        return this.wType;
    }

    public void setwType(String str) {
        this.wType = str;
    }

    public String getwParams() {
        return this.wParams;
    }

    public void setwParams(String str) {
        this.wParams = str;
    }

    public String getUa() {
        return this.ua;
    }

    public void setUa(String str) {
        this.ua = str;
    }
}
