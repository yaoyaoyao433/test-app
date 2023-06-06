package com.meituan.android.cashier.oneclick.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPayRoundQuery implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1459041930530794449L;
    @SerializedName("default_text")
    private String defaultText;
    private int duration;
    private int frequency;
    @SerializedName("query_url")
    private String queryUrl;

    public String getQueryUrl() {
        return this.queryUrl;
    }

    public String getDefaultText() {
        return this.defaultText;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void setQueryUrl(String str) {
        this.queryUrl = str;
    }

    public void setDefaultText(String str) {
        this.defaultText = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }
}
