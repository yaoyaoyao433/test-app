package com.dianping.jscore.model;

import android.support.annotation.Keep;
import com.dianping.jscore.JavaScriptInterface;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public interface Encoding {
    @Keep
    JSONObject encode();

    @Keep
    String[] getFunctionNames();

    @Keep
    JavaScriptInterface[] getFunctions();
}
