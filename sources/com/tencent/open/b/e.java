package com.tencent.open.b;

import android.os.Build;
import android.os.SystemClock;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.k;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    protected static e a;

    protected e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (a == null) {
                a = new e();
            }
            eVar = a;
        }
        return eVar;
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        h.a().a(k.a(str, str3, str4, str5, str2, str6), str2, true);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        h.a().a(k.a(str, str4, str5, str3, str2, str6, "", str7, str8, "", "", ""), str2, false);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        h.a().a(k.a(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }

    public void a(int i, String str, String str2, String str3, String str4, Long l, int i2, int i3, String str5) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        if (l.longValue() == 0 || elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        StringBuffer stringBuffer = new StringBuffer("https://huatuocode.huatuo.qq.com");
        stringBuffer.append("?domain=mobile.opensdk.com&cgi=opensdk&type=");
        stringBuffer.append(i);
        stringBuffer.append("&code=");
        stringBuffer.append(i2);
        stringBuffer.append("&time=");
        stringBuffer.append(elapsedRealtime);
        stringBuffer.append("&rate=");
        stringBuffer.append(i3);
        stringBuffer.append("&uin=");
        stringBuffer.append(str2);
        try {
            String encode = URLEncoder.encode(HttpUtils.encodeUrl(a(String.valueOf(i), String.valueOf(i2), String.valueOf(elapsedRealtime), String.valueOf(i3), str, str2, str3, str4, str5)), "UTF-8");
            stringBuffer.append("&data=");
            stringBuffer.append(encode);
            h.a().a(stringBuffer.toString(), (Map<String, String>) null);
        } catch (UnsupportedEncodingException e) {
            SLog.e("openSDK_LOG.OpenSdkStatic", "reportHaboCgi exception.", e);
        }
    }

    public static Map<String, String> a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "1");
        hashMap.put("result", str);
        hashMap.put("code", str2);
        hashMap.put("tmcost", str3);
        hashMap.put("rate", str4);
        hashMap.put("cmd", str5);
        hashMap.put("uin", str6);
        hashMap.put("appid", str7);
        hashMap.put("share_type", str8);
        hashMap.put(GearsLocator.DETAIL, str9);
        hashMap.put("os_ver", Build.VERSION.RELEASE);
        hashMap.put("network", a.a(com.tencent.open.utils.f.a()));
        hashMap.put(Constants.Environment.KEY_APN, a.b(com.tencent.open.utils.f.a()));
        hashMap.put("model_name", Build.MODEL);
        hashMap.put("sdk_ver", com.tencent.connect.common.Constants.SDK_VERSION);
        hashMap.put("packagename", com.tencent.open.utils.f.b());
        hashMap.put(com.tencent.connect.common.Constants.PARAM_APP_VER, k.d(com.tencent.open.utils.f.a(), com.tencent.open.utils.f.b()));
        return hashMap;
    }
}
