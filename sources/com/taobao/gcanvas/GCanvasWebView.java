package com.taobao.gcanvas;

import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class GCanvasWebView {
    private View mView;

    public abstract String getOriginalUrl();

    public abstract String getUrl();

    public abstract String getUserAgentString();

    public abstract void setUserAgentString(String str);

    public GCanvasWebView(View view) {
        this.mView = view;
    }

    public View getWebView() {
        return this.mView;
    }

    public void setWebView(View view) {
        this.mView = view;
    }
}
