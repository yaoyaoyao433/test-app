package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.e.c;
import com.heytap.mcssdk.f.e;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.mode.MessageStat;
import com.meituan.mmp.lib.update.PackageManageUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    private static final int[] h = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    private static final int[] i = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    private static int j = 0;
    private static String k;
    private static boolean l;
    public Context a;
    List<c> b;
    public List<d> c;
    public String d;
    public String e;
    public String f;
    public ICallBackResultService g;
    private final Object m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        private static final b a = new b();
    }

    private b() {
        this.m = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = null;
        synchronized (b.class) {
            if (j > 0) {
                throw new RuntimeException("PushService can't create again!");
            }
            j++;
        }
        a(new com.heytap.mcssdk.d.b());
        a(new com.heytap.mcssdk.d.a());
        a(new com.heytap.mcssdk.e.b());
        a(new com.heytap.mcssdk.e.a());
    }

    public static b a() {
        return a.a;
    }

    private static String a(Context context) {
        boolean z;
        boolean z2;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.mcs.action.RECEIVE_SDK_MESSAGE"), 8192);
        if (Build.VERSION.SDK_INT >= 24) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.packageName;
                try {
                    z = (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 1;
                    z2 = context.getPackageManager().getPackageUid(str, 0) == context.getPackageManager().getPackageUid("android", 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (z || z2) {
                    return str;
                }
            }
            return null;
        }
        return null;
    }

    public static void a(Context context, List<MessageStat> list) {
        com.heytap.mcssdk.f.c.a(context, list);
    }

    private synchronized void a(d dVar) {
        this.c.add(dVar);
    }

    private synchronized void a(c cVar) {
        this.b.add(cVar);
    }

    public static String g() {
        return "2.1.0";
    }

    public void a(int i2, String str, JSONObject jSONObject) {
        synchronized (this.m) {
            this.a.startService(b(i2, str, jSONObject));
        }
    }

    public void a(int i2, JSONObject jSONObject) {
        a(i2, "", jSONObject);
    }

    public final String b() {
        boolean z;
        if (k == null) {
            String a2 = a(this.a);
            if (a2 == null) {
                k = e.a(h);
                z = false;
            } else {
                k = a2;
                z = true;
            }
            l = z;
        }
        return k;
    }

    public final void b(JSONObject jSONObject) {
        if (f()) {
            a(12308, jSONObject);
        } else {
            com.heytap.mcssdk.f.b.a("mcssdk---", "please call the register first!");
        }
    }

    public final String c() {
        if (k == null) {
            a(this.a);
        }
        return l ? "com.mcs.action.RECEIVE_SDK_MESSAGE" : e.a(i);
    }

    public final boolean d() {
        String b = b();
        return e.a(this.a, b) && e.b(this.a, b) >= 1019 && e.a(this.a, b, "supportOpenPush");
    }

    public boolean e() {
        return this.a != null;
    }

    public static void a(Context context, MessageStat messageStat) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(messageStat);
        com.heytap.mcssdk.f.c.a(context, linkedList);
    }

    public boolean f() {
        if (e()) {
            if (this.f != null) {
                return true;
            }
        }
        return false;
    }

    public Intent b(int i2, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(c());
        intent.setPackage(b());
        intent.putExtra("type", i2);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("versionName", e.c(this.a, this.a.getPackageName()));
            jSONObject2.putOpt("versionCode", Integer.valueOf(e.b(this.a, this.a.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra("params", str);
        intent.putExtra(PackageManageUtil.c, this.a.getPackageName());
        intent.putExtra("appKey", this.d);
        intent.putExtra("appSecret", this.e);
        intent.putExtra("registerID", this.f);
        intent.putExtra("sdkVersion", "2.1.0");
        return intent;
    }

    public final void a(JSONObject jSONObject) {
        if (e()) {
            a(12290, jSONObject);
        } else if (this.g != null) {
            this.g.onUnRegister(-2);
        }
    }
}
