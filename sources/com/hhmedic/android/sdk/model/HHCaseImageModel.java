package com.hhmedic.android.sdk.model;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHCaseImageModel implements Serializable {
    private static final String LOCAL = "file://";
    public String content;
    public String imageurl;
    public String s3key;
    public String smallImage;
    public int type;
    public long ultimemin;

    private String getUrl(String str) {
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        return LOCAL + str;
    }

    public String getSmallUrl() {
        return getUrl(this.smallImage);
    }

    public boolean haveUpload() {
        return !TextUtils.isEmpty(this.s3key);
    }
}
