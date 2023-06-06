package com.meituan.android.edfu.mvex.netservice.entity.imageretrieval;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ImageBody {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int[] bbox;
    private String content;
    private String url;
    private int[] vector;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public int[] getVector() {
        return this.vector;
    }

    public void setVector(int[] iArr) {
        this.vector = iArr;
    }

    public int[] getBbox() {
        return this.bbox;
    }

    public void setBbox(int[] iArr) {
        this.bbox = iArr;
    }
}
