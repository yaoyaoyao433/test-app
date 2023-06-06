package com.sankuai.titans.base.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.JsonUtils;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class InjectJs {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static <T> String makeCustomEvent(@NonNull JsCustomEvent<T> jsCustomEvent) {
        T data;
        String str;
        Object[] objArr = {jsCustomEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d97697734e4c0eaf5bc30693b0edbc86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d97697734e4c0eaf5bc30693b0edbc86");
        }
        if (jsCustomEvent == null || TextUtils.isEmpty(jsCustomEvent.getAction())) {
            return "";
        }
        if (jsCustomEvent.getData() instanceof String) {
            str = CommonConstant.Symbol.SINGLE_QUOTES + ((String) data) + CommonConstant.Symbol.SINGLE_QUOTES;
        } else {
            str = CommonConstant.Symbol.SINGLE_QUOTES + JsonUtils.getExcludeGson().toJson(jsCustomEvent.getData()) + CommonConstant.Symbol.SINGLE_QUOTES;
        }
        return String.format("javascript:window.dispatchEvent(new CustomEvent('%s', {detail: %s}));", jsCustomEvent.getAction(), str);
    }

    public static String makeCustomEvent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "982fd05bd6229b35d98f2e9c5762f260", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "982fd05bd6229b35d98f2e9c5762f260") : String.format("javascript:window.dispatchEvent(new CustomEvent('%s', {detail: '%s'}));", str, str2);
    }

    public static String makeCustomEvent(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26ab8dc2846b38597442f458b71bb012", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26ab8dc2846b38597442f458b71bb012") : String.format("javascript:window.dispatchEvent(new CustomEvent('%s', {detail: %s}));", str, jSONObject.toString());
    }
}
