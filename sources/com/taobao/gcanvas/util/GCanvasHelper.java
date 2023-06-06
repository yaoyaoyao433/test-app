package com.taobao.gcanvas.util;

import com.meituan.robust.common.CommonConstant;
import com.taobao.gcanvas.GCanvas;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GCanvasHelper {
    public static JSONArray argsToJsonArray(String str, String str2) {
        JSONArray jSONArray;
        try {
            if (str2.equals("{}")) {
                jSONArray = new JSONArray();
            } else if (str2.startsWith(CommonConstant.Symbol.DOUBLE_QUOTES) && str2.endsWith(CommonConstant.Symbol.DOUBLE_QUOTES)) {
                jSONArray = new JSONArray();
                jSONArray.put(str2.substring(1, str2.length() - 1));
            } else if (str.equals("render") && str2.startsWith("[\"")) {
                jSONArray = new JSONArray();
                jSONArray.put(str2.substring(2, str2.length() - 2));
            } else {
                jSONArray = new JSONArray(str2);
            }
            return jSONArray;
        } catch (JSONException unused) {
            new StringBuilder("fail to parse params:").append(str2);
            return new JSONArray();
        }
    }

    public static GCanvas.ViewMode parseViewModeString(String str) {
        if (str == null) {
            return GCanvas.DEFAULT_VIEW_MODE;
        }
        if (str.equals("hybrid")) {
            return GCanvas.ViewMode.HYBRID_MODE;
        }
        if (str.equals("default")) {
            return GCanvas.DEFAULT_VIEW_MODE;
        }
        if (str.equals("canvas")) {
            return GCanvas.ViewMode.SINGLE_CANVAS_MODE;
        }
        if (str.equals("switch")) {
            return GCanvas.ViewMode.SWITCH_MODE;
        }
        if (str.equals("float")) {
            return GCanvas.ViewMode.FLOAT_HYBRID_MODE;
        }
        GLog.w(GLog.TAG, "cannot parse the view mode, mode:" + str);
        return GCanvas.DEFAULT_VIEW_MODE;
    }
}
