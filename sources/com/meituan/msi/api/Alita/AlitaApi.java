package com.meituan.msi.api.Alita;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.log.a;
import com.meituan.msi.util.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AlitaApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @MsiApiMethod(name = AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, request = AlitaParam.class)
    public void alita(AlitaParam alitaParam, MsiContext msiContext) {
        JSONObject optJSONObject;
        char c = 2;
        char c2 = 0;
        ?? r12 = 1;
        Object[] objArr = {alitaParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "583c97bb71889337987ffd35d65a5d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "583c97bb71889337987ffd35d65a5d35");
            return;
        }
        try {
            JSONArray jSONArray = alitaParam.messageList;
            if (jSONArray != null) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    JSONObject optJSONObject2 = jSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        String optString = optJSONObject2.optString("eventName");
                        if (!TextUtils.isEmpty(optString)) {
                            String optString2 = optJSONObject2.optString("bid");
                            if (TextUtils.isEmpty(optString2)) {
                                optString2 = "custom_bid";
                            }
                            String optString3 = optJSONObject2.optString("cid");
                            if (TextUtils.isEmpty(optString3)) {
                                optString2 = "custom_cid";
                            }
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("valLab");
                            Object hashMap = new HashMap();
                            if (optJSONObject3 != null) {
                                hashMap = JsonUtil.jsonObjectToMap(optJSONObject3);
                            }
                            String optString4 = optJSONObject2.optString("category");
                            if (TextUtils.isEmpty(optString4) && (optJSONObject = optJSONObject2.optJSONObject("config")) != null) {
                                optString4 = optJSONObject.optString("category");
                            }
                            if (TextUtils.isEmpty(optString4)) {
                                optString4 = "custom_category";
                            }
                            Object[] objArr2 = new Object[7];
                            objArr2[c2] = optString;
                            objArr2[r12] = "";
                            objArr2[c] = optString2;
                            objArr2[3] = hashMap;
                            objArr2[4] = optString3;
                            objArr2[5] = optString4;
                            objArr2[6] = Byte.valueOf((byte) r12);
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5f29c6be452896b7adaefafed9a55840", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, r12, "5f29c6be452896b7adaefafed9a55840");
                                c2 = 0;
                                i++;
                                c = 2;
                                r12 = 1;
                            } else {
                                try {
                                    Class<?> cls = Class.forName("com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter");
                                    c2 = 0;
                                    try {
                                        Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
                                        Method declaredMethod2 = cls.getDeclaredMethod("writeLXCustomEvent", String.class, String.class, String.class, Map.class, String.class, String.class, Boolean.TYPE);
                                        c2 = 0;
                                        Object invoke = declaredMethod.invoke(null, new Object[0]);
                                        Object[] objArr3 = new Object[7];
                                        objArr3[0] = optString;
                                        try {
                                            objArr3[1] = "";
                                        } catch (Exception e) {
                                            e = e;
                                            a.a(ae.a(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, e));
                                            i++;
                                            c = 2;
                                            r12 = 1;
                                        }
                                        try {
                                            objArr3[2] = optString2;
                                            objArr3[3] = hashMap;
                                            objArr3[4] = optString3;
                                            objArr3[5] = optString4;
                                            objArr3[6] = Boolean.TRUE;
                                            declaredMethod2.invoke(invoke, objArr3);
                                        } catch (Exception e2) {
                                            e = e2;
                                            a.a(ae.a(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, e));
                                            i++;
                                            c = 2;
                                            r12 = 1;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    c2 = 0;
                                }
                                i++;
                                c = 2;
                                r12 = 1;
                            }
                        }
                    }
                    i++;
                    c = 2;
                    r12 = 1;
                }
            }
            msiContext.onSuccess(null);
        } catch (Throwable th) {
            msiContext.onError(500, th.getMessage());
            a.a(ae.a(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, th));
        }
    }
}
