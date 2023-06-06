package com.meituan.mmp.lib.api.auth;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.api.auth.AuthDialog;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static HashMap<String, List<i>> b = new LinkedHashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r12.equals("scope.userLocation") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String c(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.auth.c.c(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean d(String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72cd69c1e53bd08afce16b8165aa7fa8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72cd69c1e53bd08afce16b8165aa7fa8")).booleanValue();
        }
        switch (str.hashCode()) {
            case -653473286:
                if (str.equals("scope.userLocation")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -267985274:
                if (str.equals("scope.contact")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -21617665:
                if (str.equals("scope.camera")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 411225387:
                if (str.equals("scope.record")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 421939912:
                if (str.equals("scope.userLocationBackground")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 583039347:
                if (str.equals("scope.userInfo")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 740687251:
                if (str.equals("scope.invoice")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 986629481:
                if (str.equals("scope.writePhotosAlbum")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1264823523:
                if (str.equals("scope.werun")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1555675269:
                if (str.equals("scope.invoiceTitle")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1927763546:
                if (str.equals("scope.address")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r12.equals("getLocation") != false) goto L14;
     */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.auth.c.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r12.equals("scope.userLocation") != false) goto L11;
     */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.auth.c.b(java.lang.String):java.lang.String");
    }

    public static Map<String, Boolean> a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efeb0b937d4aae3121868597c51775e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efeb0b937d4aae3121868597c51775e7");
        }
        Map<String, ?> all = MMPEnvHelper.getSharedPreferences(context, "mmp_auth_" + str).getAll();
        HashMap hashMap = new HashMap();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!"scope.PhoneNumber".equals(entry.getKey()) && (entry.getValue() instanceof Integer)) {
                    hashMap.put(entry.getKey(), Boolean.valueOf(((Integer) entry.getValue()).intValue() == 1));
                }
            }
        }
        return hashMap;
    }

    public static void a(Context context, String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a883cfd56162d03b4c6467cb2808fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a883cfd56162d03b4c6467cb2808fc8");
            return;
        }
        MMPEnvHelper.getSharedPreferences(context, "mmp_auth_" + str).edit().putInt(str2, z ? 1 : -1).apply();
    }

    public static void a(Activity activity, com.meituan.mmp.lib.config.a aVar, String str, i iVar) {
        Object[] objArr = {activity, aVar, str, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72ca82312dfbaac46dc7a51b1d5c852f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72ca82312dfbaac46dc7a51b1d5c852f");
        } else {
            a(activity, aVar, str, null, iVar);
        }
    }

    public static boolean a(com.meituan.mmp.lib.config.a aVar, String str) {
        boolean z;
        JSONArray optJSONArray;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83fb9f456d28be03a3f38d6a249a307c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83fb9f456d28be03a3f38d6a249a307c")).booleanValue();
        }
        if (TextUtils.equals("scope.userLocation", str) && TextUtils.isEmpty(aVar.b(str))) {
            return false;
        }
        if (TextUtils.equals("scope.userLocationBackground", str)) {
            if (!TextUtils.isEmpty(aVar.b(str))) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.config.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1bcd34eb5c10f5558cb1a92a07a9d6f9", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1bcd34eb5c10f5558cb1a92a07a9d6f9")).booleanValue();
                } else {
                    if (aVar.e != null && (optJSONArray = aVar.e.optJSONArray("requiredBackgroundModes")) != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            if (TextUtils.equals("location", optJSONArray.optString(i))) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static void a(final Activity activity, final com.meituan.mmp.lib.config.a aVar, final String str, String str2, i iVar) {
        Object[] objArr = {activity, aVar, str, str2, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be20efa1d281136b1363a1a1f65c6cf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be20efa1d281136b1363a1a1f65c6cf7");
        } else if (!d(str)) {
            iVar.a(-1);
        } else if (aVar.a()) {
            iVar.a(1);
        } else {
            SharedPreferences sharedPreferences = MMPEnvHelper.getSharedPreferences(activity, "mmp_auth_" + aVar.c());
            if ("scope.userInfo".equals(str) && !"button".equals(str2) && sharedPreferences.getInt(str, 0) != 1) {
                iVar.a(-1);
                return;
            }
            synchronized (c.class) {
                List<i> list = b.get(str);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    b.put(str, arrayList);
                    arrayList.add(iVar);
                    final i iVar2 = new i() { // from class: com.meituan.mmp.lib.api.auth.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.api.auth.i
                        public final void a(int i) {
                            Object[] objArr2 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1b70597cb17670e35ab623f93ca8239", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1b70597cb17670e35ab623f93ca8239");
                                return;
                            }
                            if (i != 0) {
                                Activity activity2 = activity;
                                SharedPreferences.Editor edit = MMPEnvHelper.getSharedPreferences(activity2, "mmp_auth_" + aVar.c()).edit();
                                edit.putInt(str, i);
                                if (TextUtils.equals(str, "scope.userLocation") && i == -1) {
                                    edit.putInt("scope.userLocationBackground", i);
                                }
                                if (TextUtils.equals(str, "scope.userLocationBackground") && i == 1) {
                                    edit.putInt("scope.userLocation", i);
                                }
                                edit.apply();
                            }
                            synchronized (c.class) {
                                List<i> list2 = (List) c.b.get(str);
                                if (list2 != null) {
                                    for (i iVar3 : list2) {
                                        iVar3.a(i);
                                    }
                                }
                                c.b.remove(str);
                            }
                        }
                    };
                    int i = sharedPreferences.getInt(str, 0);
                    if ("button".equals(str2) && i == -1) {
                        i = 0;
                    }
                    switch (i) {
                        case -1:
                            iVar2.a(-1);
                            return;
                        case 0:
                            activity.runOnUiThread(new Runnable() { // from class: com.meituan.mmp.lib.api.auth.c.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86b8cf6a956094e8318f13b7899c54a8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86b8cf6a956094e8318f13b7899c54a8");
                                        return;
                                    }
                                    AuthDialog authDialog = new AuthDialog(activity, iVar2);
                                    com.meituan.mmp.lib.config.a aVar2 = aVar;
                                    String str3 = str;
                                    String c = c.c(str);
                                    Object[] objArr3 = {aVar2, str3, c};
                                    ChangeQuickRedirect changeQuickRedirect3 = AuthDialog.a;
                                    if (PatchProxy.isSupport(objArr3, authDialog, changeQuickRedirect3, false, "33727489c4c7088152a60f1d0b2e374b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, authDialog, changeQuickRedirect3, false, "33727489c4c7088152a60f1d0b2e374b");
                                    } else {
                                        b bVar = new b(authDialog.c);
                                        AuthDialog.a aVar3 = authDialog.b;
                                        Object[] objArr4 = {aVar2, str3, c, aVar3};
                                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                                        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "fca242fc86d3863d4dfb12ad0e6fb3d0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "fca242fc86d3863d4dfb12ad0e6fb3d0");
                                        } else {
                                            bVar.k = aVar2;
                                            RequestCreator c2 = s.c(bVar.getContext(), aVar2.f(), aVar2);
                                            if (c2 != null) {
                                                c2.a(com.meituan.mmp.lib.widget.e.b()).a(bVar.b);
                                            }
                                            bVar.c.setText(aVar2.d());
                                            bVar.l = aVar3;
                                            if ("scope.PhoneNumber".equals(str3)) {
                                                bVar.i = "scope.PhoneNumber";
                                                bVar.d.setText("获取你的手机号码");
                                                bVar.e.setVisibility(8);
                                                bVar.f.setVisibility(8);
                                                TextView textView = bVar.g;
                                                textView.setText(com.meituan.mmp.lib.utils.c.a(bVar.getContext()) + "绑定手机号");
                                                bVar.h = "手机号码";
                                            } else {
                                                bVar.i = str3;
                                                bVar.d.setText(c);
                                                String b2 = aVar2.b(str3);
                                                new c();
                                                bVar.h = c.b(str3);
                                                if (TextUtils.isEmpty(b2)) {
                                                    bVar.e.setVisibility(8);
                                                } else {
                                                    bVar.e.setText(b2);
                                                }
                                                ((View) bVar.f.getParent()).setVisibility(8);
                                            }
                                        }
                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                                        layoutParams.addRule(12);
                                        authDialog.d.addView(bVar, layoutParams);
                                        authDialog.show();
                                    }
                                    MMPEnvHelper.getLogger().mgeView(aVar.c(), "c_group_fv80awch", "b_group_y4e7xybd_mv", new Logger.a().a("title", aVar.d()).a("type", c.b(str)).b);
                                }
                            });
                            return;
                        case 1:
                            iVar2.a(1);
                            return;
                        default:
                            return;
                    }
                }
                list.add(iVar);
            }
        }
    }

    public static void a(Activity activity, com.meituan.mmp.lib.config.a aVar, Event event, i iVar) {
        Object[] objArr = {activity, aVar, event, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ede11543dcd9fc337b2e47cca087476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ede11543dcd9fc337b2e47cca087476");
            return;
        }
        String a2 = a(event.b);
        if (a2 == null) {
            iVar.a(1);
        } else {
            a(activity, aVar, a2, event.a().optString("from"), iVar);
        }
    }
}
