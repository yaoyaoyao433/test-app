package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SendBabelLogJsHandler extends BaseJsHandler {
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_TAGS = "tags";
    private static final String KEY_TYPE = "type";
    private static final String KEY_VALUE = "value";
    private static final String MESSAGE_MISSING_CATEGORY = "missing category param";
    private static final String MESSAGE_MISSING_TYPE = "missing type param";
    private static final String MESSAGE_TAGS_INVALID = "tags param not a map";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Map<String, Object> map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b63b8277d17d4129d8cf80778e86a9ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b63b8277d17d4129d8cf80778e86a9ee");
            return;
        }
        String optString = jsBean().argsJson.optString("category");
        if (TextUtils.isEmpty(optString)) {
            jsCallbackError(521, MESSAGE_MISSING_CATEGORY);
            return;
        }
        String optString2 = jsBean().argsJson.optString("type");
        if (TextUtils.isEmpty(optString2)) {
            jsCallbackError(521, MESSAGE_MISSING_TYPE);
            return;
        }
        long optLong = jsBean().argsJson.optLong("value");
        try {
            map = JsonUtil.jsonObjectToMap(new JSONObject(jsBean().argsJson.optString("tags")));
        } catch (JSONException unused) {
            map = null;
        }
        if (map == null) {
            jsCallbackError(521, MESSAGE_TAGS_INVALID);
            return;
        }
        Babel.logRT(new Log.Builder("").reportChannel(optString).ts(System.currentTimeMillis()).optional(map).tag(optString2).value(optLong).build());
        jsCallback();
    }
}
