package com.sankuai.waimai.store.mrn.preload;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        String a(String str, String str2);
    }

    public static void a(JSONObject jSONObject, final Uri uri) throws Throwable {
        Iterator<String> keys;
        Object[] objArr = {jSONObject, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23b0d0da6f12badef31d25c2914894ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23b0d0da6f12badef31d25c2914894ae");
        } else if (jSONObject == null || uri == null || (keys = jSONObject.keys()) == null) {
        } else {
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt != null) {
                    if (opt instanceof JSONObject) {
                        a((JSONObject) opt, uri);
                    } else if (opt instanceof String) {
                        String str = (String) opt;
                        if (Pattern.matches("^\\$\\{\\s*(uri|global)\\s*:\\s*.+\\s*\\}$", str)) {
                            a(jSONObject, keys, next, str, new a() { // from class: com.sankuai.waimai.store.mrn.preload.f.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.mrn.preload.f.a
                                public final String a(String str2, String str3) {
                                    Object[] objArr2 = {str2, str3};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b0b11c2eea439275865871c147efa82", RobustBitConfig.DEFAULT_VALUE)) {
                                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b0b11c2eea439275865871c147efa82");
                                    }
                                    if (Constants.TRAFFIC_URI.equals(str2)) {
                                        return uri.getQueryParameter(str3);
                                    }
                                    if ("global".equals(str2)) {
                                        return d.a(str3);
                                    }
                                    return null;
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    private static String a(String[] strArr) throws Throwable {
        String str;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bd6ebd285dbabb76afa72b3be0dd44c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bd6ebd285dbabb76afa72b3be0dd44c");
        }
        if (strArr == null || strArr.length == 0 || (str = strArr[strArr.length - 1]) == null || "".equals(str) || !str.contains("=")) {
            return null;
        }
        String[] split = str.split("=");
        if (split.length == 0) {
            return null;
        }
        strArr[strArr.length - 1] = split[0];
        return split.length == 1 ? "" : split[split.length - 1];
    }

    private static void a(JSONObject jSONObject, Iterator<String> it, String str, String str2, @NonNull a aVar) throws Throwable {
        Object[] objArr = {jSONObject, it, str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e56420f88e5ff29b1d8e84e4dcc099f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e56420f88e5ff29b1d8e84e4dcc099f3");
            return;
        }
        String replace = str2.replace(StringUtil.SPACE, "");
        String[] split = replace.substring(2, replace.length() - 1).split(CommonConstant.Symbol.COLON);
        if (split.length < 2 || split[1] == null || "".equals(split[1])) {
            return;
        }
        String[] split2 = split[1].split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
        if (split2.length == 0) {
            return;
        }
        String a2 = a(split2);
        String str3 = null;
        for (String str4 : split2) {
            str3 = aVar.a(split[0], str4);
            if (str3 != null) {
                break;
            }
        }
        if (str3 != null) {
            jSONObject.put(str, str3);
        } else if (a2 != null) {
            jSONObject.put(str, a2);
        } else if (jSONObject.has(str)) {
            it.remove();
        }
    }
}
