package com.meituan.passport.jsbridge;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.constraint.R;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UIConfigJSHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "heqWMQ2v+za4lB25jG8a9E5PMZDT4R7chj5PpLby3egyd8Hs54mveo832aEwUqd4ukBQVDSC4pT7/91jHbvW5A==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6452198a5310baffe2cfa5914ab83849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6452198a5310baffe2cfa5914ab83849");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
        } else {
            Resources.Theme newTheme = jsHost().getActivity().getResources().newTheme();
            newTheme.applyStyle(R.style.PassportTheme, true);
            TypedArray obtainStyledAttributes = newTheme.obtainStyledAttributes(new int[]{R.attr.passportButtonDisableStartColor, R.attr.passportButtonDisableEndColor, R.attr.passportButtonNormalStartColor, R.attr.passportButtonNormalEndColor, R.attr.passportButtonPressStartColor, R.attr.passportButtonPressEndColor, R.attr.passportButtonTextDisableColor, R.attr.passportButtonTextNormalColor, R.attr.passportButtonTextPressColor, R.attr.passportThemeColor});
            if (obtainStyledAttributes != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    int color = obtainStyledAttributes.getColor(0, 0);
                    int color2 = obtainStyledAttributes.getColor(1, 0);
                    if (color != 0 && color2 != 0) {
                        jSONArray2.put(parseColorString(color));
                        jSONArray2.put(parseColorString(color2));
                        jSONArray.put(jSONArray2);
                    }
                    JSONArray jSONArray3 = new JSONArray();
                    int color3 = obtainStyledAttributes.getColor(2, 0);
                    int color4 = obtainStyledAttributes.getColor(3, 0);
                    if (color3 != 0 && color4 != 0) {
                        jSONArray3.put(parseColorString(color3));
                        jSONArray3.put(parseColorString(color4));
                        jSONArray.put(jSONArray3);
                    }
                    JSONArray jSONArray4 = new JSONArray();
                    int color5 = obtainStyledAttributes.getColor(4, 0);
                    int color6 = obtainStyledAttributes.getColor(5, 0);
                    if (color5 != 0 && color6 != 0) {
                        jSONArray4.put(parseColorString(color5));
                        jSONArray4.put(parseColorString(color6));
                        jSONArray.put(jSONArray4);
                    }
                    jSONObject.put("xButtonGradientProperties", jSONArray);
                    jSONObject.put("disabledButtonTextColor", parseColorString(obtainStyledAttributes.getColor(6, 0)));
                    jSONObject.put("normalButtonTextColor", parseColorString(obtainStyledAttributes.getColor(7, 0)));
                    jSONObject.put("highlightedButtonTextColor", parseColorString(obtainStyledAttributes.getColor(8, 0)));
                    jSONObject.put("themeColor", parseColorString(obtainStyledAttributes.getColor(9, 0)));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", jSONObject);
                    jsCallback(jSONObject2);
                } catch (JSONException unused) {
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
    }

    private static String parseColorString(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bae1215e75e130cfe81dda207b596a1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bae1215e75e130cfe81dda207b596a1a");
        }
        int alpha = Color.alpha(i);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (alpha > 16) {
            str = Integer.toHexString(alpha);
        } else {
            str = "0" + Integer.toHexString(alpha);
        }
        if (red >= 16) {
            str2 = Integer.toHexString(red);
        } else {
            str2 = "0" + Integer.toHexString(red);
        }
        if (green >= 16) {
            str3 = Integer.toHexString(green);
        } else {
            str3 = "0" + Integer.toHexString(green);
        }
        if (blue >= 16) {
            str4 = Integer.toHexString(blue);
        } else {
            str4 = "0" + Integer.toHexString(blue);
        }
        return "#" + str + str2 + str3 + str4;
    }
}
