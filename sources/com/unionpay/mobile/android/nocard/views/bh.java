package com.unionpay.mobile.android.nocard.views;

import android.content.Context;
import android.location.Location;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Build;
import android.widget.LinearLayout;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.unionpay.mobile.android.utils.PreferenceUtils;
import com.unionpay.tsmservice.data.Constant;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class bh {
    public static LinearLayout a(Context context, JSONArray jSONArray, int i, int i2) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setOrientation(1);
        new LinearLayout.LayoutParams(-1, -2).topMargin = com.unionpay.mobile.android.global.a.d;
        JSONObject jSONObject = null;
        while (i < i2 && i < jSONArray.length()) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            linearLayout.addView(new com.unionpay.mobile.android.widgets.ad(context, com.unionpay.mobile.android.global.a.I, jSONObject, ""));
            i++;
        }
        return linearLayout;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, String str5) {
        NfcAdapter defaultAdapter;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.Environment.KEY_TN, str);
            jSONObject.put("user", com.unionpay.mobile.android.utils.f.d(context));
            jSONObject.put("locale", a(com.unionpay.mobile.android.utils.f.a()));
            jSONObject.put("terminal_version", com.unionpay.mobile.android.utils.f.a(context));
            jSONObject.put("terminal_resolution", com.unionpay.mobile.android.utils.f.d());
            jSONObject.put("os_name", str2);
            jSONObject.put("os_version", Build.VERSION.RELEASE.trim());
            jSONObject.put("device_model", a(com.unionpay.mobile.android.utils.f.c()));
            jSONObject.put("terminal_type", str3);
            jSONObject.put("appId", str4);
            jSONObject.put("uid", PreferenceUtils.a(context));
            jSONObject.put("mac", a(com.unionpay.mobile.android.utils.f.c(context)));
            try {
                jSONObject.put("time_zone", a(com.unionpay.mobile.android.utils.f.f()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                jSONObject.put("network_mode", com.unionpay.mobile.android.utils.f.f(context));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                jSONObject.put(Constants.Environment.KEY_IMSI, a(com.unionpay.mobile.android.utils.f.e(context)));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            try {
                jSONObject.put("baseband_version", a(com.unionpay.mobile.android.utils.f.e()));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            try {
                StringBuffer stringBuffer = new StringBuffer(Constant.DEFAULT_CVN2);
                if (!Constant.DEFAULT_CVN2.equals(str5)) {
                    stringBuffer.setCharAt(2, '1');
                }
                if (Build.VERSION.SDK_INT >= 10 && (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) != null) {
                    if (defaultAdapter.isEnabled()) {
                        stringBuffer.setCharAt(0, '1');
                    } else {
                        stringBuffer.setCharAt(0, '2');
                    }
                    if (Build.VERSION.SDK_INT >= 19 && context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce")) {
                        stringBuffer.setCharAt(1, '1');
                    }
                }
                jSONObject.put("support_map", stringBuffer.toString());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                jSONObject.put("se_map", str5);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            jSONObject.put("root", com.unionpay.mobile.android.utils.f.b());
            jSONObject.put(GearsLocator.COUNTRY, a(Locale.getDefault().getCountry()));
            jSONObject.put("package", a(com.unionpay.mobile.android.utils.f.b(context)));
            Location g = com.unionpay.mobile.android.utils.f.g(context);
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, a(g != null ? Double.valueOf(g.getLatitude()).toString() : ""));
            Location g2 = com.unionpay.mobile.android.utils.f.g(context);
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, a(g2 != null ? Double.valueOf(g2.getLongitude()).toString() : ""));
            jSONObject.put("tel", a(com.unionpay.mobile.android.utils.f.h(context)));
            jSONObject.put("packageId", com.unionpay.mobile.android.utils.c.b(context));
        } catch (PatternSyntaxException e7) {
            e7.printStackTrace();
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        String substring = jSONObject2.substring(1, jSONObject2.length() - 1);
        com.unionpay.mobile.android.utils.k.a("uppay", "init: ".concat(String.valueOf(substring)));
        return substring;
    }

    private static String a(String str) throws PatternSyntaxException {
        return str != null ? Pattern.compile("[\":,\\[\\]{}]").matcher(str).replaceAll("").trim() : "";
    }

    public static String a(String str, String str2, String str3, String str4) {
        return String.format("\"first_pay_flag\":\"%s\",\"card\":\"%s\",\"pay_type\":\"%s\",\"pay_mode\":\"%s\"", str, str2, str3, str4);
    }

    public static String a(JSONObject jSONObject) {
        com.unionpay.mobile.android.utils.k.a("uppay", "action:" + com.unionpay.mobile.android.utils.j.a(jSONObject, "action"));
        return com.unionpay.mobile.android.utils.j.a(jSONObject, "action");
    }

    public static String b(Context context, String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("amount", str);
            jSONObject.put("aid", str5);
            jSONObject.put("user", com.unionpay.mobile.android.utils.f.d(context));
            jSONObject.put("locale", a(com.unionpay.mobile.android.utils.f.a()));
            jSONObject.put("terminal_version", com.unionpay.mobile.android.utils.f.a(context));
            jSONObject.put("terminal_resolution", com.unionpay.mobile.android.utils.f.d());
            jSONObject.put("os_name", str2);
            jSONObject.put("os_version", Build.VERSION.RELEASE.trim());
            jSONObject.put("device_model", a(com.unionpay.mobile.android.utils.f.c()));
            jSONObject.put("terminal_type", str3);
            jSONObject.put("appId", str4);
            jSONObject.put("uid", PreferenceUtils.a(context));
            jSONObject.put("mac", a(com.unionpay.mobile.android.utils.f.c(context)));
            try {
                jSONObject.put("time_zone", a(com.unionpay.mobile.android.utils.f.f()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                jSONObject.put("network_mode", com.unionpay.mobile.android.utils.f.f(context));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                jSONObject.put(Constants.Environment.KEY_IMSI, a(com.unionpay.mobile.android.utils.f.e(context)));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            try {
                jSONObject.put("baseband_version", a(com.unionpay.mobile.android.utils.f.e()));
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            jSONObject.put("root", com.unionpay.mobile.android.utils.f.b());
            jSONObject.put(GearsLocator.COUNTRY, a(Locale.getDefault().getCountry()));
            jSONObject.put("package", a(com.unionpay.mobile.android.utils.f.b(context)));
        } catch (PatternSyntaxException e5) {
            e5.printStackTrace();
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        String substring = jSONObject2.substring(1, jSONObject2.length() - 1);
        com.unionpay.mobile.android.utils.k.c("uppay", "init: ".concat(String.valueOf(substring)));
        return substring;
    }

    public static String b(String str, String str2, String str3, String str4) {
        return String.format("\"first_pay_flag\":\"%s\",%s,\"pay_type\":\"%s\",\"pay_mode\":\"%s\"", str, str2, str3, str4);
    }

    public static String c(String str, String str2, String str3, String str4) {
        return (str3 == null || str3.length() <= 0) ? String.format("\"pay_type\":\"%s\",\"pay_mode\":\"%s\",%s", str, str2, str4) : String.format("\"pay_type\":\"%s\",\"pay_mode\":\"%s\",%s,%s", str, str2, str3, str4);
    }
}
