package com.sankuai.waimai.store.fsp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a c;
    public final Map<String, Integer> b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e16d23855bec659d61f4a3aea495d7fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e16d23855bec659d61f4a3aea495d7fc");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5591c16d678f4c009d2256757e711b75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5591c16d678f4c009d2256757e711b75");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(@Nullable Activity activity, @NonNull String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdfe4163b57910a8da7123297404b1ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdfe4163b57910a8da7123297404b1ac");
        } else if (activity == null || TextUtils.isEmpty(str)) {
        } else {
            String a2 = a(activity);
            if (!str.startsWith("sg_perf_")) {
                str = "sg_perf_" + str;
            }
            Weaver.getExtension().addCustomTags(a2, activity, str, str2);
        }
    }

    public final void a(@Nullable Activity activity, @NonNull Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4db8c152d12b32c6e5dc3f336971781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4db8c152d12b32c6e5dc3f336971781");
        } else if (activity != null) {
            String a2 = a(activity);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && value != null) {
                    if (!key.startsWith("sg_perf_")) {
                        key = "sg_perf_" + key;
                    }
                    if (value instanceof Map) {
                        HashMap hashMap2 = new HashMap();
                        for (Map.Entry entry2 : ((Map) value).entrySet()) {
                            Object key2 = entry2.getKey();
                            Object value2 = entry2.getValue();
                            if ((value2 instanceof Number) || (value2 instanceof String) || (value2 instanceof Boolean)) {
                                hashMap2.put(key2, value2);
                            }
                        }
                        hashMap.put(key, hashMap2);
                    } else if ((value instanceof Number) || (value instanceof String) || (value instanceof Boolean)) {
                        hashMap.put(key, value);
                    }
                }
            }
            Weaver.getExtension().addCustomTags(a2, activity, hashMap);
        }
    }

    public final void a(@Nullable Activity activity, @NonNull String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a72ce8f3b20b74af76721da72955b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a72ce8f3b20b74af76721da72955b0");
        } else {
            b(activity, str, null);
        }
    }

    public final void b(@Nullable Activity activity, @NonNull String str, String str2) {
        String jSONObject;
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b5e390cd3b89d58dd369865d61e96f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b5e390cd3b89d58dd369865d61e96f");
        } else if (activity == null || TextUtils.isEmpty(str)) {
        } else {
            String a2 = a(activity);
            if (!str.startsWith("sg_perf_")) {
                str = "sg_perf_" + str;
            }
            if (str2 == null) {
                jSONObject = String.valueOf(System.currentTimeMillis());
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("currentTime", String.valueOf(System.currentTimeMillis()));
                hashMap.put("customValue", str2);
                jSONObject = new JSONObject(hashMap).toString();
            }
            Weaver.getExtension().addCustomTags(a2, activity, str, jSONObject);
        }
    }

    public String a(Activity activity) {
        Uri data;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08bc46ff5786000dfaa579a16382edf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08bc46ff5786000dfaa579a16382edf3");
        }
        if (activity == null) {
            return "";
        }
        String name = activity.getClass().getName();
        Intent intent = activity.getIntent();
        if (intent == null || (data = intent.getData()) == null) {
            return name;
        }
        return data.getScheme() + "://" + data.getAuthority() + data.getPath();
    }

    public final void a(@Nullable Activity activity, int i) {
        String str;
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e07931d338184680b77a91644b2f968b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e07931d338184680b77a91644b2f968b");
            return;
        }
        Object[] objArr2 = {activity, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "910009722ab83dd2d58467ca301be81c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "910009722ab83dd2d58467ca301be81c");
            return;
        }
        if (i == 100) {
            str = "sg_perf_setup_end";
        } else if (i == 200) {
            str = "sg_perf_api_start";
        } else if (i != 300) {
            return;
        } else {
            str = "sg_perf_api_end";
        }
        b(activity, str, null);
    }

    public static String b() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8aa40ec6bdf470f4834c54cd7b8459b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8aa40ec6bdf470f4834c54cd7b8459b3");
        }
        List<Activity> a2 = com.sankuai.waimai.store.util.a.b.a();
        return (a2 == null || a2.size() < 2 || (activity = a2.get(1)) == null || activity.getComponentName() == null) ? "" : activity.getComponentName().getShortClassName();
    }
}
