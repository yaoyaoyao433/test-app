package com.dianping.titans.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JavaScriptComposer {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final String makeCustomeEvent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12773c5d621df3efe9e8db4dac1e0f0b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12773c5d621df3efe9e8db4dac1e0f0b") : String.format("javascript:window.dispatchEvent(new CustomEvent('%s', {detail: '%s'}));", str, str2);
    }

    public static final String makeCustomeEvent(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef8c719e1ab7123d2825167b44f702b2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef8c719e1ab7123d2825167b44f702b2") : String.format("javascript:window.dispatchEvent(new CustomEvent('%s', {detail: %s}));", str, jSONObject.toString());
    }
}
