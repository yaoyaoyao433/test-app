package com.dianping.base.push.pushservice;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class l {
    public static ChangeQuickRedirect a = null;
    private static final String b = "l";

    public static synchronized String a(Context context, int i, JSONObject jSONObject) {
        synchronized (l.class) {
            Object[] objArr = {context, Integer.valueOf(i), jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdc54643cfc23e5b868d23034dbbf7ba", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdc54643cfc23e5b868d23034dbbf7ba");
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("state", i);
                jSONObject2.put("time", com.dianping.base.push.pushservice.util.i.a(context));
                jSONObject2.put("params", jSONObject);
                return jSONObject2.toString();
            } catch (Exception e) {
                c.d(b, e.toString());
                return "";
            }
        }
    }

    public static synchronized String a(Context context, int i, JSONObject jSONObject, String str) {
        synchronized (l.class) {
            Object[] objArr = {context, Integer.valueOf((int) TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM), jSONObject, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bc86fc82d761fecb76655786db47a4a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bc86fc82d761fecb76655786db47a4a");
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("state", TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
                jSONObject2.put("time", com.dianping.base.push.pushservice.util.i.a(context));
                jSONObject2.put("params", jSONObject);
                jSONObject2.put("uriString", str);
                return jSONObject2.toString();
            } catch (Exception e) {
                c.d(b, e.toString());
                return "";
            }
        }
    }
}
