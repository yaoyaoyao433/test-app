package com.meituan.android.common.babel;

import android.content.Context;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MQC {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "adadbf282622417aa118359f9de1679e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "adadbf282622417aa118359f9de1679e");
        } else {
            Babel.init(context);
        }
    }

    public static void init(Context context, BabelConfig babelConfig) {
        Object[] objArr = {context, babelConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0448055011cf0d36556e0d82b571212", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0448055011cf0d36556e0d82b571212");
        } else {
            Babel.init(context, babelConfig);
        }
    }

    public static void attach(String str, Observer observer) {
        Object[] objArr = {str, observer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f07a17b699d5ec49e2f2c2158e5a34a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f07a17b699d5ec49e2f2c2158e5a34a1");
        } else {
            Babel.attach(str, observer);
        }
    }

    public static void report(String str, String str2, String str3, Double d, Map<String, Object> map, String str4, Map<String, Object> map2) {
        Object[] objArr = {str, str2, str3, d, map, str4, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "205d924cf25d9b355a1809636ec4f02e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "205d924cf25d9b355a1809636ec4f02e");
        } else {
            report(str, str2, str3, d, map, str4, map2, null);
        }
    }

    private static String convertMap2str(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae2544629e2b15ab266e05b068aaa328", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae2544629e2b15ab266e05b068aaa328");
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return jSONObject.toString();
    }

    public static void quickReport(String str, String str2, String str3, Double d, Map<String, Object> map, String str4, Map<String, Object> map2) {
        Object[] objArr = {str, str2, str3, d, map, str4, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11c316085cc8315a5a270eb229452c60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11c316085cc8315a5a270eb229452c60");
        } else {
            quickReport(str, str2, str3, d, map, str4, map2, null);
        }
    }

    @Deprecated
    public static void report(String str, String str2, String str3, Double d, Map<String, Object> map, String str4, Map<String, Object> map2, Map<String, Object> map3) {
        Object[] objArr = {str, str2, str3, d, map, str4, map2, map3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05e2634ca5b364bd9162234eecdb7f10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05e2634ca5b364bd9162234eecdb7f10");
        } else {
            Babel.log(new Log.Builder("").tag(str3).value(d.doubleValue()).reportChannel(str).token(str2).details(convertMap2str(map)).raw(str4).optional(map2).env(null).build());
        }
    }

    @Deprecated
    public static void quickReport(String str, String str2, String str3, Double d, Map<String, Object> map, String str4, Map<String, Object> map2, Map<String, Object> map3) {
        Object[] objArr = {str, str2, str3, d, map, str4, map2, map3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb7f2725bf9e5cddbffe6e28d8a48fbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb7f2725bf9e5cddbffe6e28d8a48fbf");
        } else {
            Babel.logRT(new Log.Builder("").tag(str3).value(d.doubleValue()).reportChannel(str).token(str2).details(convertMap2str(map)).raw(str4).optional(map2).env(null).build());
        }
    }
}
