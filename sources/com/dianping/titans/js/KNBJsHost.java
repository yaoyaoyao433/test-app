package com.dianping.titans.js;

import android.view.ViewGroup;
import com.dianping.titans.widget.LineTitleLayout;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface KNBJsHost extends JsHost {
    @Deprecated
    LineTitleLayout getDynamicTitleBar();

    @Deprecated
    JSONObject getHostState();

    @Deprecated
    String getInnerURLKey();

    @Deprecated
    String getPrefixURL();

    @Deprecated
    void onMessageReceive(String str, JSONObject jSONObject);

    @Deprecated
    boolean setDynamicTitleBar(LineTitleLayout lineTitleLayout, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    void setWebViewCanPause(boolean z);

    @Deprecated
    void showMask(int i, String str, String str2);
}
