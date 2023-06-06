package com.dianping.titans.js.jshandler;

import android.util.Log;
import com.dianping.networklog.c;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ClosePageWithKeysJsHandler extends BaseJsHandler {
    public static final String RESULT_KEY = "closed";
    public static final String TAG = "closePageWithKeys";
    public static final String URL_KEY = "closekey";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8e3dbf29303973213d9ae1cc8dd2ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8e3dbf29303973213d9ae1cc8dd2ffa");
            return;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray optJSONArray = jsBean().argsJson.optJSONArray("keys");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(optJSONArray.getString(i));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (hashSet.size() == 0) {
            jsCallbackError(521, "params keys miss or invalid");
            return;
        }
        List<String> closePageWithKeys = JsHandlerFactory.closePageWithKeys(hashSet);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str : closePageWithKeys) {
                jSONArray.put(str);
            }
            jSONObject.put(RESULT_KEY, jSONArray);
        } catch (Throwable th2) {
            c.a("jserror: " + Log.getStackTraceString(th2), 35, new String[]{TAG});
        }
        jsCallback(jSONObject);
    }
}
