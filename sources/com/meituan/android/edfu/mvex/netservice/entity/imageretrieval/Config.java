package com.meituan.android.edfu.mvex.netservice.entity.imageretrieval;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class Config {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String subTitleText;
    private String titleText;
    private String url;

    public String getSubTitleText() {
        return this.subTitleText;
    }

    public void setSubTitleText(String str) {
        this.subTitleText = str;
    }

    public String getTitleText() {
        return this.titleText;
    }

    public void setTitleText(String str) {
        this.titleText = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
