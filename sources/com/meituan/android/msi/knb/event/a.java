package com.meituan.android.msi.knb.event;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.google.gson.JsonObject;
import com.meituan.msi.event.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.PublishCenter;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private C0297a c;
    private volatile boolean d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62aa94c23c2ea3c5d3486af4957569e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62aa94c23c2ea3c5d3486af4957569e");
            return;
        }
        this.c = null;
        this.d = false;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b9feefc32f84cc114ee37e5fed349bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b9feefc32f84cc114ee37e5fed349bf");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29b138a5a9afda94134c52b2216faa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29b138a5a9afda94134c52b2216faa6");
        } else if (this.d) {
        } else {
            this.d = true;
            this.c = new C0297a();
            PublishCenter.getInstance().registerCallback(this.c);
            com.meituan.msi.event.a a2 = com.meituan.msi.event.a.a();
            C0297a c0297a = this.c;
            Object[] objArr2 = {c0297a};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.event.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "accabb3eeb0723b5c525d1499a4bac30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "accabb3eeb0723b5c525d1499a4bac30");
            } else if (a2.d.contains(c0297a)) {
            } else {
                a2.d.add(c0297a);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.msi.knb.event.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0297a implements b, PublishCenter.ReceivedActionCallback {
        public static ChangeQuickRedirect a;
        private String c;

        public C0297a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652b009dfcdf6fffb30476c7d9e99e87", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652b009dfcdf6fffb30476c7d9e99e87");
            } else {
                this.c = "";
            }
        }

        @Override // com.meituan.msi.event.b
        public final void a(String str, String str2, JsonObject jsonObject, String str3) {
            Object[] objArr = {str, str2, jsonObject, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8e512b542621f17aaacc2ed69fe57d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8e512b542621f17aaacc2ed69fe57d");
            } else if (!TextUtils.equals("knb", str2) || TextUtils.isEmpty(str) || TextUtils.equals("KNB", str3)) {
            } else {
                JSONObject jSONObject = null;
                if (jsonObject != null) {
                    String jsonObject2 = jsonObject.toString();
                    if (!TextUtils.isEmpty(jsonObject2)) {
                        try {
                            jSONObject = new JSONObject(jsonObject2);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            com.meituan.msi.log.a.a("Publish Event To KNB Error: " + e.getMessage());
                            return;
                        }
                    }
                }
                this.c = a(str, jSONObject);
                PublishCenter.getInstance().publish(str, jSONObject);
                com.meituan.msi.log.a.a("MSI.Publish to KNB " + str);
            }
        }

        @Override // com.sankuai.titans.protocol.utils.PublishCenter.ReceivedActionCallback
        public final void onReceivedAction(String str, JSONObject jSONObject) {
            Object[] objArr = {str, jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f99dd3a8cf655442f4d5168f0b1375b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f99dd3a8cf655442f4d5168f0b1375b");
            } else if (TextUtils.isEmpty(str) || TextUtils.equals(a(str, jSONObject), this.c)) {
            } else {
                JsonObject a2 = com.meituan.msi.event.a.a(jSONObject);
                com.meituan.msi.event.a a3 = com.meituan.msi.event.a.a();
                Object[] objArr2 = {str, "knb", a2, "KNB"};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.event.a.a;
                if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "ccba3fd795f71990df276f7f7b5be60b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "ccba3fd795f71990df276f7f7b5be60b");
                } else {
                    a3.a(str, "knb", a2, false, "KNB");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("eventName", str);
                hashMap.put("eventScope", "knb");
                hashMap.put("eventFrom", "knb");
                com.meituan.msi.log.a.a(hashMap, Constants.MULTI_PROCESS_PUBLISH_DATA, "default");
                com.meituan.msi.log.a.a("KNB.Publish From KNB " + str);
            }
        }

        private String a(@NonNull String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31a5bf1d23461756ccd4c7345d694ffc", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31a5bf1d23461756ccd4c7345d694ffc");
            }
            if (obj != null) {
                return str + CommonConstant.Symbol.UNDERLINE + obj.hashCode();
            }
            return str;
        }
    }
}
