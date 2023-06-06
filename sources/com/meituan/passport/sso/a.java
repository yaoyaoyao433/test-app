package com.meituan.passport.sso;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.singleton.b;
import com.meituan.passport.k;
import com.meituan.passport.plugins.c;
import com.meituan.passport.pojo.ExchangeableUser;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.aa;
import com.meituan.passport.utils.f;
import com.meituan.passport.utils.l;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        q qVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9418ba5849c12166ceafb9cbd9e9bc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9418ba5849c12166ceafb9cbd9e9bc3");
        }
        if (context != null) {
            qVar = q.a(context, "homepage_PASSPORT_USER");
            aa.a(context, "homepage_PASSPORT_USER", "PASSPORT_USER");
        }
        n.a("SSOSharePrefrenceHelper.getUerCIPStorageCenter", "cipStorageCenter is null: ", String.valueOf(qVar == null));
        return qVar;
    }

    public static void a(Context context, String str, long j) {
        Object[] objArr = {context, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb384cb8d7eb77c48e0f728ccac00a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb384cb8d7eb77c48e0f728ccac00a79");
            return;
        }
        c cVar = new c();
        q a2 = a(context);
        if (a2 != null) {
            boolean a3 = a2.a("KEY_PASSPORT_USER_TOKEN", cVar.a(str));
            n.a("SSOSharePrefrenceHelper.writeToPersistence", "setToken, token: " + cVar.a(str), String.valueOf(a3));
            boolean a4 = a2.a("KEY_PASSPORT_USER_ID", j);
            n.a("SSOSharePrefrenceHelper.writeToPersistence", "setUserId, userId: " + j, String.valueOf(a4));
            boolean a5 = a2.a("KEY_PASSPORT_USER_APPNAME", f(context));
            n.a("SSOSharePrefrenceHelper.writeToPersistence", "setAppName, appNme: " + f(context), String.valueOf(a5));
            boolean a6 = a2.a("KEY_PASSPORT_LAST_UPDATE_TIME", System.currentTimeMillis());
            n.a("SSOSharePrefrenceHelper.writeToPersistence", "setTokenUpdateTime, time: " + System.currentTimeMillis(), String.valueOf(a6));
        }
    }

    public static long b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4e1da75883ba9e226f6608bfb5897f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4e1da75883ba9e226f6608bfb5897f1")).longValue();
        }
        q a2 = a(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (a2 != null) {
            long b = a2.b("KEY_PASSPORT_LAST_UPDATE_TIME", 0L);
            n.a("SSOSharePrefrenceHelper.getLastUpdateTime", "getLastUpdateTime, lastUpdateTime: ", String.valueOf(b));
            return b;
        }
        return currentTimeMillis;
    }

    public static q c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        q qVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "452183cdf428f9a8691cfbf71e4c965b", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "452183cdf428f9a8691cfbf71e4c965b");
        }
        if (context != null) {
            qVar = q.a(context, "homepage_passport", 2);
            aa.a(context, "homepage_passport", "passport");
        }
        n.a("SSOSharePrefrenceHelper.getPassportCIPStorage", "cipStorageCenter is null: ", String.valueOf(qVar == null));
        return qVar;
    }

    public static void a(Context context, User user) {
        Object[] objArr = {context, user};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5f184312879c8eee4e7f86cd0717c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5f184312879c8eee4e7f86cd0717c2c");
            return;
        }
        c cVar = new c();
        q c = c(context);
        if (c != null) {
            String a2 = cVar.a(k.a().b().toJson(user));
            boolean a3 = c.a("user", a2);
            n.a("SSOSharePrefrenceHelper.updatePassportUser", "setUser, user: " + a2, String.valueOf(a3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<com.meituan.passport.pojo.User, java.lang.Integer> d(android.content.Context r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.passport.sso.a.a
            java.lang.String r10 = "ffb0fdfbbef73d3fa65742b210bec46a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            android.util.Pair r11 = (android.util.Pair) r11
            return r11
        L1e:
            com.meituan.passport.plugins.c r0 = new com.meituan.passport.plugins.c
            r0.<init>()
            com.meituan.android.cipstorage.q r11 = c(r11)
            if (r11 == 0) goto L31
            java.lang.String r1 = "user"
            java.lang.String r1 = r11.b(r1, r2)
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r0.c(r1)
            if (r3 == 0) goto L3d
            java.lang.String r1 = r0.b(r1)
            goto L49
        L3d:
            if (r11 == 0) goto L49
            java.lang.String r3 = "user"
            java.lang.String r0 = r0.a(r1)
            r11.a(r3, r0)
        L49:
            java.lang.String r0 = "SSOSharePrefrenceHelper.getUserFromPersistence"
            java.lang.String r3 = "decoded user: "
            com.meituan.passport.utils.n.a(r0, r3, r1)
            if (r11 == 0) goto Lbb
            java.lang.String r0 = "user"
            boolean r0 = r11.a(r0)
            if (r0 == 0) goto Lbb
            com.meituan.passport.k r0 = com.meituan.passport.k.a()     // Catch: java.lang.Exception -> L86
            com.google.gson.Gson r0 = r0.b()     // Catch: java.lang.Exception -> L86
            java.lang.Class<com.meituan.passport.pojo.User> r3 = com.meituan.passport.pojo.User.class
            java.lang.Object r0 = r0.fromJson(r1, r3)     // Catch: java.lang.Exception -> L86
            com.meituan.passport.pojo.User r0 = (com.meituan.passport.pojo.User) r0     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = "SSOSharePrefrenceHelper.getUserFromPersistence"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = "convert user: from "
            r4.<init>(r5)     // Catch: java.lang.Exception -> L84
            r4.append(r1)     // Catch: java.lang.Exception -> L84
            java.lang.String r1 = " to User"
            r4.append(r1)     // Catch: java.lang.Exception -> L84
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L84
            com.meituan.passport.utils.n.a(r3, r1, r2)     // Catch: java.lang.Exception -> L84
            goto L94
        L84:
            r1 = move-exception
            goto L88
        L86:
            r1 = move-exception
            r0 = r2
        L88:
            java.lang.String r3 = "SSOSharePrefrenceHelper.getUserFromPersistence"
            java.lang.String r4 = "targetUser's conversion occurs exception: "
            java.lang.String r1 = r1.toString()
            com.meituan.passport.utils.n.a(r3, r4, r1)
        L94:
            if (r0 != 0) goto L9f
            java.lang.String r11 = "SSOSharePrefrenceHelper.getUserFromPersistence"
            java.lang.String r0 = "targetUser is null"
            com.meituan.passport.utils.n.a(r11, r0, r2)
            return r2
        L9f:
            java.lang.String r1 = "SSOSharePrefrenceHelper.getUserFromPersistence"
            java.lang.String r2 = "targetUser is: "
            java.lang.String r3 = r0.mobile
            com.meituan.passport.utils.n.a(r1, r2, r3)
            android.util.Pair r1 = new android.util.Pair
            java.lang.String r2 = "loginType"
            r3 = -1
            int r11 = r11.b(r2, r3)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1.<init>(r0, r11)
            return r1
        Lbb:
            java.lang.String r11 = "SSOSharePrefrenceHelper.getUserFromPersistence"
            java.lang.String r0 = "getUser, user: "
            com.meituan.passport.utils.n.a(r11, r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.sso.a.d(android.content.Context):android.util.Pair");
    }

    public static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c70b436068290a7a06b0bcd2bd320d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c70b436068290a7a06b0bcd2bd320d96");
            return;
        }
        q c = c(context);
        if (c != null) {
            boolean a2 = c.a(str, str2);
            n.a("SSOSharePrefrenceHelper.updateUserAvatarUrl", "setAvatarUrl, avatarUrl: " + str2, String.valueOf(a2));
        }
    }

    public static void a(Context context, ArrayList<String> arrayList) {
        q c;
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "170e575fc5027937b7a2db79fcc21fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "170e575fc5027937b7a2db79fcc21fce");
        } else if (context != null && arrayList != null && (c = c(context)) != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append(arrayList.get(i));
                sb.append(CommonConstant.Symbol.COMMA);
            }
            String sb2 = sb.toString();
            boolean a2 = c.a("KEY_DYNAMIC_OAUTH", sb2);
            n.a("SSOSharePrefrenceHelper.setDynamicOauthItems", "result: " + sb2, String.valueOf(a2));
        }
    }

    public static ArrayList<String> e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        ArrayList<String> arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fd3535e1c5e6c33e2d20424cabf48d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fd3535e1c5e6c33e2d20424cabf48d3");
        }
        if (context == null) {
            return null;
        }
        q c = c(context);
        if (c != null) {
            String b = c.b("KEY_DYNAMIC_OAUTH", "no items");
            n.a("SSOSharePrefrenceHelper.getDynamicOauthItems", "dynamic oauth items: ", b);
            if (b != null && !TextUtils.equals(b, "no items")) {
                arrayList = new ArrayList<>(Arrays.asList(b.split(CommonConstant.Symbol.COMMA)));
            }
        }
        if (arrayList != null) {
            n.a("SSOSharePrefrenceHelper.getDynamicOauthItems", "dynamic oauth list: ", arrayList.toString());
        } else {
            n.a("SSOSharePrefrenceHelper.getDynamicOauthItems", "dynamic oauth list: ", StringUtil.NULL);
        }
        return arrayList;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e52b7f3488e8636faee27f98f0642c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e52b7f3488e8636faee27f98f0642c5");
        }
        c cVar = new c();
        return (TextUtils.isEmpty(str) || !cVar.c(str)) ? str : cVar.b(str);
    }

    public static l<ExchangeableUser> a(int i) {
        Object[] objArr = {3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d26826740d48a1eb86ac99c3c85190a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d26826740d48a1eb86ac99c3c85190a3");
        }
        q c = c(b.a());
        l<ExchangeableUser> lVar = new l<>(3);
        if (c != null) {
            String b = c.b("changeUserList", "");
            c cVar = new c();
            if (!TextUtils.isEmpty(b) && cVar.c(b)) {
                String b2 = cVar.b(b);
                if (TextUtils.isEmpty(b2)) {
                    return lVar;
                }
                try {
                    JSONArray jSONArray = new JSONArray(b2);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        if (jSONObject != null) {
                            lVar.add((ExchangeableUser) new Gson().fromJson(jSONObject.toString(), (Class<Object>) ExchangeableUser.class));
                        }
                    }
                } catch (JSONException e) {
                    f.a(e);
                }
            }
        }
        return lVar;
    }

    private static String f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f60734c22b89981d0371e4df8614f3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f60734c22b89981d0371e4df8614f3b");
        }
        try {
            return context.getString(context.getApplicationInfo().labelRes);
        } catch (Exception unused) {
            return context.getString(R.string.passport_basemodule_meituan_app);
        }
    }
}
