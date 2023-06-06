package com.meituan.mmp.lib.embeddedwidget;

import android.support.annotation.NonNull;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static String a(Map map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca26fd8fbee8930c2f0a4e150b154ab3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca26fd8fbee8930c2f0a4e150b154ab3") : String.valueOf(map.get(str.toLowerCase()));
    }

    public static void a(@NonNull IApiCallback iApiCallback, String str) {
        Object[] objArr = {iApiCallback, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfc5f63c568feec702c33225fdd4d50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfc5f63c568feec702c33225fdd4d50a");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sameLayerCode", 1);
            jSONObject.put("errMsg", str);
        } catch (JSONException unused) {
        }
        iApiCallback.onSuccess(jSONObject);
    }

    public static JSONObject a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a9c2c10647cc8700bfbc13d41636f93", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a9c2c10647cc8700bfbc13d41636f93");
        }
        try {
            jSONObject.put("mpView_embed_render", false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
