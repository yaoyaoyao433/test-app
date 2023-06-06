package com.dianping.base.push.pushservice.dp.impl3v8;

import android.app.Service;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.PushWakeUpJob;
import com.dianping.base.push.pushservice.e;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.i;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    int b;
    private Service c;
    private final a d;

    public c(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd30bc26dd1647867e17322036a55c51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd30bc26dd1647867e17322036a55c51");
            return;
        }
        this.b = 0;
        this.d = new a("");
        this.c = service;
    }

    public final String a(int i) {
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64bb76e3f6a960ada7a8c215da99105e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64bb76e3f6a960ada7a8c215da99105e");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (i == 3) {
            try {
                jSONObject2.put("sdkversion", "4052001");
                jSONObject2.put("appname", f.b);
                jSONObject2.put("pushtoken", d());
                jSONObject2.put("network", com.dianping.base.push.pushservice.util.b.a(this.c));
                jSONObject2.put("phonetype", 1);
                if (!com.dianping.base.push.pushservice.util.d.a(this.c)) {
                    i2 = 2;
                }
                jSONObject2.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, i2);
                jSONObject2.put("os", Build.VERSION.RELEASE);
                jSONObject2.put("wakeversion", c());
                jSONObject.put("pushcmd", 3);
                jSONObject.put("params", jSONObject2);
            } catch (JSONException e) {
                com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
            }
        } else {
            switch (i) {
                case 5:
                    try {
                        jSONObject2.put("sdkversion", "4052001");
                        jSONObject2.put("appname", f.b);
                        jSONObject2.put("pushtoken", d());
                        jSONObject2.put("phonetype", 1);
                        jSONObject2.put("pushmsgid", this.d.c);
                        jSONObject2.put("status", this.d.b);
                        if (!com.dianping.base.push.pushservice.util.d.a(this.c)) {
                            i2 = 2;
                        }
                        jSONObject2.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, i2);
                        jSONObject2.put("groupid", this.d.d);
                        a aVar = this.d;
                        aVar.c = "";
                        aVar.b = 0;
                        aVar.d = "";
                        jSONObject.put("pushcmd", 5);
                        jSONObject.put("params", jSONObject2);
                        break;
                    } catch (JSONException e2) {
                        com.dianping.base.push.pushservice.c.d("PushProtocol", e2.toString());
                        break;
                    }
                case 6:
                    try {
                        jSONObject2.put("appname", f.b);
                        jSONObject2.put("pushtoken", d());
                        jSONObject2.put("phonetype", 1);
                        jSONObject.put("pushcmd", 6);
                        jSONObject.put("params", jSONObject2);
                        break;
                    } catch (JSONException e3) {
                        com.dianping.base.push.pushservice.c.d("PushProtocol", e3.toString());
                        break;
                    }
                default:
                    com.dianping.base.push.pushservice.c.d("PushProtocol", "error: getting push request string using wrong command");
                    break;
            }
        }
        return jSONObject.toString();
    }

    public final int a(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec65a4532e9fe8eb97ffe36a85bcb068", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec65a4532e9fe8eb97ffe36a85bcb068")).intValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("pushcmd");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            com.dianping.base.push.pushservice.c.a("PushProtocol", "data received, connect cmd = " + optInt + ", payload string = " + str);
            if (optInt != 4) {
                switch (optInt) {
                    case 7:
                    case 9:
                        break;
                    case 8:
                        int optInt2 = optJSONObject.optInt("pushtokenstate", 1);
                        Object[] objArr2 = {Integer.valueOf(optInt2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9957625a06650b8e512c13fccd8703bf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9957625a06650b8e512c13fccd8703bf");
                        } else if (optInt2 != 0) {
                            try {
                                e.a(this.c).b("pushToken", "");
                            } catch (Exception e) {
                                com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
                            }
                            n.b(this.c);
                        }
                        d(optJSONObject.optInt("heartbeat"));
                        i.a(this.c, optJSONObject.optLong("servertime"));
                        c(optJSONObject.optInt("timeout"));
                        b(optJSONObject.optInt("reconnect"));
                        int optInt3 = optJSONObject.optInt("timerspan");
                        Object[] objArr3 = {Integer.valueOf(optInt3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52ee74612accbf8cfef86b80f8ffb708", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52ee74612accbf8cfef86b80f8ffb708");
                        } else if (optInt3 > 0) {
                            try {
                                i = e.a(this.c).a("wakeUpInterval", 0);
                            } catch (Exception e2) {
                                com.dianping.base.push.pushservice.c.d("PushProtocol", e2.toString());
                                i = 0;
                            }
                            if (i != optInt3) {
                                try {
                                    e.a(this.c).b("wakeUpInterval", optInt3);
                                } catch (Exception e3) {
                                    com.dianping.base.push.pushservice.c.d("PushProtocol", e3.toString());
                                }
                                if (f.h && Build.VERSION.SDK_INT >= 21) {
                                    PushWakeUpJob.a(this.c);
                                }
                            }
                        }
                        int optInt4 = optJSONObject.optInt("crashflag");
                        Object[] objArr4 = {Integer.valueOf(optInt4)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "263b410a12b53fbea820400a12cdca26", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "263b410a12b53fbea820400a12cdca26");
                        } else {
                            try {
                                com.dianping.base.push.pushservice.d.a(this.c).a("enableFakeService", optInt4 == 1);
                            } catch (Exception e4) {
                                com.dianping.base.push.pushservice.c.d("PushProtocol", e4.toString());
                            }
                        }
                        int optInt5 = optJSONObject.optInt("wakeversion");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject(SocialConstants.PARAM_EXCLUDE);
                        JSONArray optJSONArray = optJSONObject.optJSONArray("wakeconfig");
                        Object[] objArr5 = {Integer.valueOf(optInt5), optJSONObject2, optJSONArray};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6542d55652d3a73ec938985ab3640914", RobustBitConfig.DEFAULT_VALUE)) {
                            if (optInt5 > 0 && optInt5 != c()) {
                                e(optInt5);
                                a(optJSONObject2);
                                a(optJSONArray);
                                com.dianping.base.push.pushservice.friends.b.b(this.c);
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6542d55652d3a73ec938985ab3640914");
                            break;
                        }
                        break;
                    default:
                        com.dianping.base.push.pushservice.c.d("PushProtocol", "error: wrong push command in push response");
                        break;
                }
            } else {
                String optString = optJSONObject.optString("pushmsgid", "");
                String optString2 = optJSONObject.optString("groupid", "");
                com.dianping.base.push.pushservice.c.a("msg received, connect id = " + optString);
                this.d.c = optString;
                this.d.d = optString2;
                long optLong = optJSONObject.optLong("expired", 0L);
                String optString3 = optJSONObject.optString("pushtoken", "");
                String optString4 = optJSONObject.optString("appname", "");
                if (optString3.equals(d()) && optString4.equals(f.b)) {
                    if (optLong != 0 && optLong <= i.a(this.c)) {
                        this.d.b = 3;
                    } else if (com.dianping.base.push.pushservice.i.a(this.c).a(optString)) {
                        this.d.b = 2;
                    } else {
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("extra");
                        int optInt6 = optJSONObject.optInt("passthrough", 0);
                        optJSONObject.put("pushchannel", 1);
                        if (optInt6 == 1) {
                            com.dianping.base.push.pushservice.util.d.a(this.c, optJSONObject);
                            com.dianping.base.push.pushservice.i.a(this.c).b(optString);
                        } else if (optJSONObject3 != null && optJSONObject3.optBoolean("recall", false)) {
                            com.dianping.base.push.pushservice.i.a(this.c).b(optJSONObject);
                        } else {
                            com.dianping.base.push.pushservice.i.a(this.c).a(optJSONObject);
                        }
                        this.d.b = 1;
                    }
                } else {
                    this.d.b = 4;
                }
            }
            return optInt;
        } catch (JSONException e5) {
            com.dianping.base.push.pushservice.c.d("PushProtocol", e5.toString());
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0423 A[Catch: all -> 0x04a0, TryCatch #0 {all -> 0x04a0, blocks: (B:124:0x0408, B:126:0x0423, B:128:0x0431, B:129:0x0451, B:130:0x0470), top: B:149:0x0408 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049f A[EDGE_INSN: B:176:0x049f->B:142:0x049f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.base.push.pushservice.dp.impl3v8.c.a():boolean");
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a958298d068a55da0078e96aa4724271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a958298d068a55da0078e96aa4724271");
        } else if (i <= 0) {
        } else {
            try {
                com.dianping.base.push.pushservice.d.a(this.c).b("reconnectInterval", i);
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
            }
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe4fd38ba96be0f9c885c1c43b4f801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe4fd38ba96be0f9c885c1c43b4f801");
        } else if (i <= 0) {
        } else {
            try {
                com.dianping.base.push.pushservice.d.a(this.c).b("serverTimeout", i);
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
            }
        }
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d369b1f2b9de566f8351e9bcb30c030a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d369b1f2b9de566f8351e9bcb30c030a");
            return;
        }
        if (i <= 0 || i > 150) {
            i = MapConstant.ANIMATION_DURATION_SHORT;
        }
        try {
            com.dianping.base.push.pushservice.d.a(this.c).b("keepAliveInterval", i);
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
        }
    }

    private void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7875d2a27e492b072f28dc11cac4195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7875d2a27e492b072f28dc11cac4195");
            return;
        }
        try {
            com.dianping.base.push.pushservice.d.a(this.c).b("friendsVersion", i);
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b230075f62fca50351f9e893a2e8975d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b230075f62fca50351f9e893a2e8975d");
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            com.dianping.base.push.pushservice.d.a(this.c).b("wakeExcludeBrand", jSONObject.optString("brand"));
            com.dianping.base.push.pushservice.d.a(this.c).b("wakeExcludeOS", jSONObject.optString("os"));
            com.dianping.base.push.pushservice.d.a(this.c).b("wakeExcludeModel", jSONObject.optString("model"));
            com.dianping.base.push.pushservice.d.a(this.c).b("wakeExcludeROM", jSONObject.optString("rom"));
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
        }
    }

    private void a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7020d1d68b0470cf60dcfca9ef46e14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7020d1d68b0470cf60dcfca9ef46e14");
        } else if (jSONArray == null) {
            try {
                com.dianping.base.push.pushservice.d.a(this.c).b("friendsConfig", "");
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
            }
        } else {
            String jSONArray2 = jSONArray.toString();
            if (jSONArray2 == null) {
                jSONArray2 = "";
            }
            try {
                com.dianping.base.push.pushservice.d.a(this.c).b("friendsConfig", jSONArray2);
            } catch (Exception e2) {
                com.dianping.base.push.pushservice.c.d("PushProtocol", e2.toString());
            }
        }
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e7a48b5436a06a5861cbc25ba66df8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e7a48b5436a06a5861cbc25ba66df8")).intValue();
        }
        try {
            return com.dianping.base.push.pushservice.d.a(this.c).a("friendsVersion", 0);
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
            return 0;
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0221b351579be0acb7d4283258ac75bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0221b351579be0acb7d4283258ac75bd");
        }
        try {
            return e.a(this.c).a("pushToken", "");
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
            return "";
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd1dfc16b1d248fd11f05676b01cd2d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd1dfc16b1d248fd11f05676b01cd2d1")).booleanValue();
        }
        try {
            return !TextUtils.isEmpty(e.a(this.c).a("pushToken", ""));
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("PushProtocol", e.toString());
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public String c;
        public String d;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa2afbc9957ef59168e705680d43d72", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa2afbc9957ef59168e705680d43d72");
                return;
            }
            this.c = str;
            this.b = 0;
            this.d = "";
        }
    }
}
