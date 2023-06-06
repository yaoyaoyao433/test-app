package com.vivo.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.waimai.platform.utils.f;
import com.vivo.push.b.x;
import com.vivo.push.c.d;
import com.vivo.push.e;
import com.vivo.push.q;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.p;
import com.vivo.push.util.t;
import com.vivo.push.util.u;
import com.vivo.push.util.z;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends q {
    private static a c;
    private static final List<Integer> e = Arrays.asList(3);
    private String d;
    private String f = "";

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    public final void b() {
        this.d = null;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final void a(Intent intent) {
        if (intent == null || this.a == null) {
            p.d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.a);
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        a(obtain);
    }

    @Override // com.vivo.push.q
    public final void b(Message message) {
        Intent intent = (Intent) message.obj;
        if (intent == null || this.a == null) {
            p.d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.a);
            return;
        }
        String packageName = this.a.getPackageName();
        int d = d(intent);
        if (d > 0) {
            x xVar = new x(d);
            HashMap<String, String> hashMap = new HashMap<>();
            if (intent != null) {
                Bundle extras = intent.getExtras();
                hashMap.put("messageID", String.valueOf(extras != null ? extras.getLong("notify_id", 404000044642424832L) : 404000044642424832L));
            }
            String b = z.b(this.a, packageName);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("remoteAppId", b);
            }
            xVar.a(hashMap);
            e.a().a(xVar);
            return;
        }
        try {
            Class<?> cls = Class.forName(this.d);
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            Method method = cls.getMethod("onReceive", Context.class, Intent.class);
            intent.setClassName(packageName, this.d);
            method.invoke(newInstance, ContextDelegate.getContext(this.a).getApplicationContext(), intent);
        } catch (Exception e2) {
            p.b("CommandWorker", "reflect e: ", e2);
        }
    }

    private static String a(Context context, String str, String str2) {
        List<ResolveInfo> queryBroadcastReceivers;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) == null || queryBroadcastReceivers.size() <= 0) {
                return null;
            }
            return queryBroadcastReceivers.get(0).activityInfo.name;
        } catch (Exception e2) {
            p.a("CommandWorker", "error  " + e2.getMessage());
            return null;
        }
    }

    private boolean b(Intent intent) {
        String a = f.a(intent, "security_avoid_pull");
        if (!TextUtils.isEmpty(a)) {
            try {
                String b = com.vivo.push.util.a.a(this.a).b(a);
                if ("com.vivo.pushservice".equals(b)) {
                    return true;
                }
                p.a("CommandWorker", "!decrypt.equals, so decrypt == ".concat(String.valueOf(b)));
                return false;
            } catch (Exception e2) {
                p.a("CommandWorker", "checkIntentIsSecurity Exception: " + e2.getMessage());
                return false;
            }
        }
        p.a("CommandWorker", "checkIntentIsSecurityTextUtils.isEmpty");
        return true;
    }

    private boolean c(Intent intent) {
        if (Build.VERSION.SDK_INT < 18) {
            return true;
        }
        String c2 = z.c(this.a, "com.vivo.pushservice");
        p.d("CommandWorker", " 配置的验签参数 = ".concat(String.valueOf(c2)));
        if (TextUtils.equals(c2, "1")) {
            String a = f.a(intent, "security_avoid_pull_rsa");
            String a2 = f.a(intent, "security_avoid_rsa_public_key");
            if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
                p.a("CommandWorker", "!decrypt.equals, so securityContent == " + a + " or publickKey isempty ");
                return false;
            }
            try {
                if (d.a(this.a).a().a("com.vivo.pushservice".getBytes("UTF-8"), u.a(a2), Base64.decode(a, 2))) {
                    p.d("CommandWorker", " RSA验签通过  ");
                    return true;
                }
            } catch (Exception e2) {
                p.a("CommandWorker", "checkIntentIsSecurity Exception: " + e2.getMessage());
            }
            p.d("CommandWorker", " RSA验签 不通过  ");
            return false;
        }
        return true;
    }

    private int d(Intent intent) {
        String a;
        if (!TextUtils.isEmpty(this.f) && this.f.contains("CommandService")) {
            if (!(intent != null && b(intent) && c(intent))) {
                p.a("CommandWorker", " !checkIntentIsSecurity(intent)");
                return 2151;
            }
        }
        String packageName = this.a.getPackageName();
        try {
            a = f.a(intent, "command_type");
        } catch (Exception e2) {
            p.a("CommandWorker", e2);
        }
        if (!TextUtils.isEmpty(a) && a.equals("reflect_receiver")) {
            int a2 = f.a(intent, ProtoConstant.COMMAND, -1);
            if (a2 < 0) {
                a2 = f.a(intent, "method", -1);
            }
            if (e.contains(Integer.valueOf(a2)) && t.c(this.a, packageName) && !t.c(this.a)) {
                p.a("CommandWorker", "METHOD_ON_MESSAGE is not support");
                return 2153;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(this.d)) {
                this.d = a(this.a, packageName, action);
                if (TextUtils.isEmpty(this.d)) {
                    p.d("CommandWorker", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                    intent.setPackage(packageName);
                    b.a(this.a, intent);
                    return 2152;
                }
            }
            return 0;
        }
        p.a("CommandWorker", "commandTypeStr is not satisfy == ".concat(String.valueOf(a)));
        return 2151;
    }
}
