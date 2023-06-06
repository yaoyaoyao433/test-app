package com.meituan.msi.event;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a f;
    public Map<String, Set<b>> c;
    public Set<b> d;
    ExecutorService e;
    private MsiEventBroadcastReceiver h;
    private static final Gson g = new GsonBuilder().serializeNulls().create();
    public static String b = "com.meituan.msi.Event";

    public static /* synthetic */ void a(a aVar, String str, String str2, JsonObject jsonObject, boolean z, String str3) {
        Object[] objArr = {str, str2, jsonObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "15642fd9af7e5978a361ea0c3b13c67e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "15642fd9af7e5978a361ea0c3b13c67e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            aVar.a(str, str2, jsonObject, str3);
            if (z) {
                Object[] objArr2 = {str, str2, jsonObject, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f0f2bb35d25ef3d4544876bf5044f984", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f0f2bb35d25ef3d4544876bf5044f984");
                    return;
                }
                Intent intent = new Intent();
                intent.setAction(b);
                intent.putExtra("eventName", str);
                intent.putExtra("from", ProcessUtils.getCurrentProcessName(com.meituan.msi.a.f()));
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra("eventScope", str2);
                }
                if (jsonObject != null) {
                    String jsonObject2 = jsonObject.toString();
                    if (!TextUtils.isEmpty(jsonObject2)) {
                        intent.putExtra("eventData", jsonObject2);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    intent.putExtra("fromModule", str3);
                }
                Context f2 = com.meituan.msi.a.f();
                if (f2 != null) {
                    com.meituan.msi.log.a.a("MsiEvent sendBroadcast " + str);
                    com.sankuai.meituan.takeoutnew.util.aop.b.a(f2, intent);
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3, String str4) {
        JsonObject jsonObject;
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2048716c3cf2b4f80b77a193e93bf9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2048716c3cf2b4f80b77a193e93bf9c6");
            return;
        }
        com.meituan.msi.log.a.a("MsiEvent OnBroadcastReceiver " + str + " Data:" + str3 + " From:" + str4);
        try {
            jsonObject = (JsonObject) g.fromJson(str3, (Class<Object>) JsonObject.class);
        } catch (Exception unused) {
            jsonObject = null;
        }
        aVar.a(str, str2, jsonObject, str4);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9177576ada01eed30aabad5c1b87d70f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9177576ada01eed30aabad5c1b87d70f");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.d = new CopyOnWriteArraySet();
        this.e = null;
        this.h = null;
        this.e = c.a("msi-event-dispatcher", 1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Context f2 = com.meituan.msi.a.f();
        if (f2 != null) {
            com.meituan.msi.log.a.a("MsiEvent MsiEventBroadcastReceiver registerReceiver");
            this.h = new MsiEventBroadcastReceiver();
            f2.registerReceiver(this.h, new IntentFilter(b));
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1957f28ac01f351c220cc0fe236e37a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1957f28ac01f351c220cc0fe236e37a3");
        }
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new a();
                }
            }
        }
        return f;
    }

    public final void a(final String str, final String str2, final JsonObject jsonObject, final boolean z, final String str3) {
        Object[] objArr = {str, str2, jsonObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b051b69ad310e0b4f5d119021a210c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b051b69ad310e0b4f5d119021a210c");
        } else {
            this.e.submit(new Runnable() { // from class: com.meituan.msi.event.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b18d15c67d1230c9f3bf5f8c1abd5f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b18d15c67d1230c9f3bf5f8c1abd5f5");
                    } else {
                        a.a(a.this, str, str2, jsonObject, z, str3);
                    }
                }
            });
        }
    }

    private void a(String str, String str2, JsonObject jsonObject, String str3) {
        Object[] objArr = {str, str2, jsonObject, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9bdb424fbf8f83c2970a382f4c3c23f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9bdb424fbf8f83c2970a382f4c3c23f");
            return;
        }
        String a2 = a(str, str2);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        Set<b> set = this.c.containsKey(a2) ? this.c.get(a2) : null;
        if (set != null && set.size() > 0) {
            for (b bVar : set) {
                if (bVar != null) {
                    bVar.a(str, str2, jsonObject, str3);
                }
            }
        }
        if (this.d == null || this.d.size() <= 0) {
            return;
        }
        for (b bVar2 : this.d) {
            if (bVar2 != null) {
                bVar2.a(str, str2, jsonObject, str3);
            }
        }
    }

    public final void a(String str, String str2, b bVar) {
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e45b964c385aa9c9ca9866ea5d11964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e45b964c385aa9c9ca9866ea5d11964");
        } else if (bVar != null) {
            String a2 = a(str, str2);
            if (!TextUtils.isEmpty(a2)) {
                Set<b> set = this.c.containsKey(a2) ? this.c.get(a2) : null;
                if (set == null || !set.contains(bVar)) {
                    return;
                }
                set.remove(bVar);
            } else if (this.c.size() > 0) {
                for (String str3 : this.c.keySet()) {
                    Set<b> set2 = this.c.get(str3);
                    if (set2 != null && set2.contains(bVar)) {
                        set2.remove(bVar);
                    }
                }
            }
        }
    }

    public String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8176c12c4adcc12a95bf3c2ba3eab9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8176c12c4adcc12a95bf3c2ba3eab9");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            return "default_" + str;
        }
        return str2 + CommonConstant.Symbol.UNDERLINE + str;
    }

    public static JsonObject a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "439050c0312f15528b9eb5b6101859ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "439050c0312f15528b9eb5b6101859ff");
        }
        if (jSONObject == null) {
            return null;
        }
        String jSONObject2 = jSONObject.toString();
        if (!TextUtils.isEmpty(jSONObject2)) {
            try {
                return (JsonObject) g.fromJson(jSONObject2, (Class<Object>) JsonObject.class);
            } catch (Exception unused) {
                com.meituan.msi.log.a.a("MsiEvent to JsonObject failed " + jSONObject2);
            }
        }
        return null;
    }
}
