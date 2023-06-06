package com.meituan.android.legwork.mrn;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.Gson;
import com.meituan.android.legwork.bean.RouteMapping;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.common.util.i;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.mrn.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final Set<String> c = new HashSet<String>() { // from class: com.meituan.android.legwork.mrn.b.1
        {
            add("legwork");
            add("legwork-order-detail");
            add("legwork-goods-list");
            add("legwork-buy-preview");
            add("legwork-buy-home");
            add("legwork-send");
            add("legwork-dp-goods-list");
            add("legwork-send-preview");
            add("legwork-address");
        }
    };
    private static b f;
    public List<String> b;
    public Map<String, HashMap<String, Object>> d;
    @Nullable
    private RouteMapping[] e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "739f83c50d190eceb809dda08c7efa7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "739f83c50d190eceb809dda08c7efa7e");
        } else {
            this.b = new ArrayList();
        }
    }

    public static synchronized b a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "639156a474156541a77965b32e062553", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "639156a474156541a77965b32e062553");
            }
            if (f == null) {
                f = new b();
            }
            return f;
        }
    }

    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb0c6259367c0ea1d6d083d69446e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb0c6259367c0ea1d6d083d69446e6a");
        } else if (TextUtils.isEmpty(str)) {
            this.e = new RouteMapping[0];
        } else {
            try {
                this.e = (RouteMapping[]) new Gson().fromJson(str, (Type) RouteMapping[].class);
            } catch (Exception e) {
                x.e("MRNUtils.setDegradeMapping()", "setDegradeMapping error, exception msg:", e);
                x.a(e);
            }
        }
    }

    @Deprecated
    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e2561dd8d820075e6b3d459d70b89d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e2561dd8d820075e6b3d459d70b89d")).booleanValue();
        }
        if (this.d == null || this.d.get(str) == null || this.d.get(str).get("mrn_switch") == null || !(this.d.get(str).get("mrn_switch") instanceof Boolean) || ((Boolean) this.d.get(str).get("mrn_switch")).booleanValue()) {
            x.b("MRNUtils.isPageSwitchOpen()", str + " MRN开关打开");
            return true;
        }
        x.b("MRNUtils.isPageSwitchOpen()", str + " MRN开关关闭");
        return false;
    }

    public final String a(String str, String str2, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a2a8392a59b0e4a0571216b53f1e9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a2a8392a59b0e4a0571216b53f1e9d");
        }
        String str3 = null;
        switch (PmUtil.a()) {
            case 0:
                x.e("MRNUtils.getMrnShellUri()", "unknown host platform. id = " + PmUtil.a());
                q.a("legwork_platform_error");
                break;
            case 1:
                str3 = "imeituan://www.meituan.com/legwork/mrn";
                break;
            case 2:
                str3 = "legwork_rn://waimai.meituan.com/legwork/mrn";
                break;
            case 3:
                str3 = "dianping://waimai.dianping.com/legwork/mrn";
                break;
        }
        return a(str3, str, str2, map);
    }

    public final String b(String str, String str2, @Nullable Map<String, Object> map) {
        String str3;
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0facfcef8b7fa77a8a334810b00d7677", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0facfcef8b7fa77a8a334810b00d7677");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        String str4 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dd0e31b48dd0f76819d0249ba8562a57", RobustBitConfig.DEFAULT_VALUE)) {
            str3 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dd0e31b48dd0f76819d0249ba8562a57");
        } else {
            switch (PmUtil.a()) {
                case 0:
                    q.a("legwork_platform_error");
                    break;
                case 1:
                    str4 = "imeituan://www.meituan.com/mrn";
                    break;
                case 2:
                    str4 = Build.VERSION.SDK_INT >= 29 ? "wm_meituanwaimai://waimai.meituan.com/mrn" : "meituanwaimai://waimai.meituan.com/mrn";
                    break;
                case 3:
                    str4 = "dianping://mrn";
                    break;
            }
            str3 = str4;
        }
        return a(str3, str, str2, map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r13.equals("legwork-order-detail") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.legwork.mrn.b.a
            java.lang.String r11 = "24a1c9a506deec111c88000b74b44329"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L1e:
            r1 = -1
            int r2 = r13.hashCode()
            switch(r2) {
                case -2064139658: goto L7f;
                case -574182543: goto L74;
                case -570318266: goto L68;
                case -555097821: goto L5d;
                case -311918668: goto L52;
                case 56472095: goto L47;
                case 529394899: goto L3c;
                case 1171992936: goto L31;
                case 1737352350: goto L27;
                default: goto L26;
            }
        L26:
            goto L8a
        L27:
            java.lang.String r2 = "legwork-order-detail"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L8a
            goto L8b
        L31:
            java.lang.String r0 = "legwork-dp-goods-list"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 5
            goto L8b
        L3c:
            java.lang.String r0 = "legwork-buy-preview"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 6
            goto L8b
        L47:
            java.lang.String r0 = "legwork"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 0
            goto L8b
        L52:
            java.lang.String r0 = "legwork-buy-home"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 3
            goto L8b
        L5d:
            java.lang.String r0 = "legwork-goods-list"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 2
            goto L8b
        L68:
            java.lang.String r0 = "legwork-address"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 8
            goto L8b
        L74:
            java.lang.String r0 = "legwork-send-preview"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 7
            goto L8b
        L7f:
            java.lang.String r0 = "legwork-send"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L8a
            r0 = 4
            goto L8b
        L8a:
            r0 = -1
        L8b:
            switch(r0) {
                case 0: goto La9;
                case 1: goto La6;
                case 2: goto La3;
                case 3: goto La0;
                case 4: goto L9d;
                case 5: goto L9a;
                case 6: goto L97;
                case 7: goto L94;
                case 8: goto L91;
                default: goto L8e;
            }
        L8e:
            java.lang.String r13 = "30802.1.0"
            goto Lab
        L91:
            java.lang.String r13 = "30804.1.0"
            goto Lab
        L94:
            java.lang.String r13 = "30804.1.0"
            goto Lab
        L97:
            java.lang.String r13 = "30804.1.0"
            goto Lab
        L9a:
            java.lang.String r13 = "30802.1.0"
            goto Lab
        L9d:
            java.lang.String r13 = "30806.1.0"
            goto Lab
        La0:
            java.lang.String r13 = "30804.1.0"
            goto Lab
        La3:
            java.lang.String r13 = "30802.1.0"
            goto Lab
        La6:
            java.lang.String r13 = "30804.1.0"
            goto Lab
        La9:
            java.lang.String r13 = "30806.1.0"
        Lab:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.mrn.b.c(java.lang.String):java.lang.String");
    }

    private String a(String str, String str2, String str3, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8ece69e55fb408e1d16cb9fa0488f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8ece69e55fb408e1d16cb9fa0488f3");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String a2 = a(map, str2);
        return str + "?mrn_biz=banma&mrn_entry=" + str2 + "&mrn_component=" + str3 + "&mrn_min_version=" + a2;
    }

    private Pair<Boolean, String> a(@Nonnull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5efa2f7a8a297fdaad28f3c251e9b0b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5efa2f7a8a297fdaad28f3c251e9b0b4");
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return a(hashMap);
    }

    public final Pair<Boolean, String> a(@Nonnull Map<String, String> map) {
        RouteMapping[] routeMappingArr;
        boolean z;
        boolean z2 = true;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5fb7e893593aefd8be3e74608b855d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5fb7e893593aefd8be3e74608b855d4");
        }
        String str = "";
        if (this.e != null && this.e.length != 0) {
            for (RouteMapping routeMapping : this.e) {
                Map<String, String> map2 = routeMapping.matchingParam;
                if (!map2.isEmpty()) {
                    Iterator<Map.Entry<String, String>> it = map2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        Map.Entry<String, String> next = it.next();
                        if (!TextUtils.equals(map.get(next.getKey()), next.getValue())) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        str = routeMapping.errorText;
                        break;
                    }
                }
            }
        }
        z2 = false;
        return new Pair<>(Boolean.valueOf(z2), str);
    }

    public final boolean a(Activity activity, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {activity, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d774de3eb8e09bda52d7e0685ddbcd4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d774de3eb8e09bda52d7e0685ddbcd4c")).booleanValue();
        }
        if (activity == null || activity.isFinishing()) {
            x.e("MRNUtils.startActivityAddParams()", "activity is finish");
            return false;
        }
        return a(activity, c(activity, str, str2, map), -1);
    }

    public boolean a(Activity activity, Intent intent, int i) {
        Uri data;
        Object[] objArr = {activity, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67e8b15a1364f07b0f9a8bdd26ee441", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67e8b15a1364f07b0f9a8bdd26ee441")).booleanValue();
        }
        if (intent == null || activity == null || activity.isFinishing() || (data = intent.getData()) == null) {
            return false;
        }
        i.a(activity, data.toString(), i);
        return true;
    }

    @Nonnull
    public final Intent b(Activity activity, @Nonnull String str, @Nonnull String str2, @Nullable Map<String, Object> map) {
        Object[] objArr = {activity, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c508b88722e252f382181492e53dd3c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c508b88722e252f382181492e53dd3c0");
        }
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        if (!com.meituan.android.legwork.common.util.a.a().a(str2)) {
            return a(activity, a().a(str, str2, map), map);
        }
        return c(activity, str, str2, map);
    }

    @Nonnull
    public final Intent c(Activity activity, @Nonnull String str, @Nonnull String str2, @Nullable Map<String, Object> map) {
        Object[] objArr = {activity, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8767b9af7f4a1cd296a4cecb588ff8b", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8767b9af7f4a1cd296a4cecb588ff8b") : a(activity, a().b(str, str2, map), map);
    }

    @Nonnull
    public final Intent a(Activity activity, String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {activity, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afee3b49d67563bfcd89d0f5e2c3d951", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afee3b49d67563bfcd89d0f5e2c3d951");
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String valueOf = entry.getValue() == null ? null : String.valueOf(entry.getValue());
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(valueOf)) {
                        buildUpon.appendQueryParameter(key, valueOf);
                    }
                }
            }
        }
        Pair<Boolean, String> a2 = a(buildUpon.build());
        if (((Boolean) a2.first).booleanValue()) {
            return a(activity, (String) a2.second);
        }
        return new Intent("android.intent.action.VIEW").setData(buildUpon.build()).setPackage(activity.getPackageName());
    }

    private Intent a(Activity activity, String str) {
        String str2;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d5a8169d398f58c93773d218ecc9bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d5a8169d398f58c93773d218ecc9bf");
        }
        switch (PmUtil.a()) {
            case 1:
                str2 = "imeituan://www.meituan.com";
                break;
            case 2:
                str2 = "meituanwaimai://waimai.meituan.com";
                break;
            case 3:
                str2 = "dianping://waimai.dianping.com";
                break;
            default:
                x.e("MRNUtils.buildDegradePageIntent()", "unknown host platform. id = " + PmUtil.a());
                str2 = "meituanwaimai://waimai.meituan.com";
                q.a("legwork_platform_error");
                break;
        }
        return new Intent("android.intent.action.VIEW").setData(Uri.parse(str2 + activity.getResources().getString(R.string.legwork_scheme_path_mrn_degrade)).buildUpon().appendQueryParameter("pt_error_text", str).build()).setPackage(activity.getPackageName());
    }

    private String a(Map<String, Object> map, String str) {
        Object obj;
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489b3c5251dd0ea0cb8dbc99dd72bec1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489b3c5251dd0ea0cb8dbc99dd72bec1");
        }
        String c2 = c(str);
        if (map != null && (obj = map.get("mrn_min_version")) != null) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2) && a(str2, str)) {
                return str2;
            }
        }
        return c2;
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0534bf815738f70c9d3a8b4827a6a6c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0534bf815738f70c9d3a8b4827a6a6c5")).booleanValue() : TextUtils.isEmpty(str2) || e.a(str, c(str2)) >= 0;
    }
}
