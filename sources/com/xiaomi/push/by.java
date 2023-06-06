package com.xiaomi.push;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class by {
    protected static Context c;
    private static by l;
    private static a m;
    private static String n;
    private static String o;
    protected final Map<String, bv> a;
    protected b d;
    String e;
    private bx g;
    private String h;
    private long i;
    private final long j;
    private long k;
    protected static final Map<String, bu> b = new HashMap();
    protected static boolean f = false;

    /* loaded from: classes6.dex */
    public interface a {
        by a(Context context, bx bxVar, b bVar, String str);
    }

    /* loaded from: classes6.dex */
    public interface b {
        String a(String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public by(Context context, bx bxVar, b bVar, String str) {
        this(context, bxVar, bVar, str, null, null);
    }

    private by(Context context, bx bxVar, b bVar, String str, String str2, String str3) {
        this.a = new HashMap();
        this.h = "0";
        this.i = 0L;
        this.j = 15L;
        this.k = 0L;
        this.e = "isp_prov_city_country_ip";
        this.d = bVar;
        this.g = bxVar == null ? new bz(this) : bxVar;
        this.h = str;
        n = str2 == null ? context.getPackageName() : str2;
        o = str3 == null ? k() : str3;
    }

    public static synchronized by a() {
        by byVar;
        synchronized (by.class) {
            if (l == null) {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
            byVar = l;
        }
        return byVar;
    }

    public static synchronized void a(Context context, bx bxVar, b bVar, String str, String str2, String str3) {
        synchronized (by.class) {
            Context applicationContext = context.getApplicationContext();
            c = applicationContext;
            if (applicationContext == null) {
                c = context;
            }
            if (l == null) {
                if (m == null) {
                    l = new by(context, null, bVar, str, str2, str3);
                    return;
                }
                l = m.a(context, null, bVar, str);
            }
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (by.class) {
            m = aVar;
            l = null;
        }
    }

    private void a(String str, bu buVar) {
        if (TextUtils.isEmpty(str) || buVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + buVar);
        }
        synchronized (this.a) {
            i();
            if (this.a.containsKey(str)) {
                this.a.get(str).a(buVar);
            } else {
                bv bvVar = new bv(str);
                bvVar.a(buVar);
                this.a.put(str, bvVar);
            }
        }
    }

    public static void a(String str, String str2) {
        bu buVar = b.get(str);
        synchronized (b) {
            try {
                if (buVar == null) {
                    bu buVar2 = new bu(str);
                    buVar2.a(604800000L);
                    buVar2.b(str2);
                    b.put(str, buVar2);
                } else {
                    buVar.b(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        NetworkInfo activeNetworkInfo;
        if (c == null) {
            return "unknown";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI-UNKNOWN";
            }
            return activeNetworkInfo.getTypeName() + CommonConstant.Symbol.MINUS + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static bu c(String str) {
        bu buVar;
        synchronized (b) {
            buVar = b.get(str);
        }
        return buVar;
    }

    private bu d(String str) {
        bv bvVar;
        bu a2;
        synchronized (this.a) {
            i();
            bvVar = this.a.get(str);
        }
        if (bvVar == null || (a2 = bvVar.a()) == null) {
            return null;
        }
        return a2;
    }

    private bu e(String str) {
        if (System.currentTimeMillis() - this.k > this.i * 60 * 1000) {
            this.k = System.currentTimeMillis();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            bu buVar = a(arrayList).get(0);
            if (buVar != null) {
                this.i = 0L;
                return buVar;
            } else if (this.i < 15) {
                this.i++;
                return null;
            } else {
                return null;
            }
        }
        return null;
    }

    private static String f(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b2 = bytes[i];
                int i2 = b2 & 240;
                if (i2 != 240) {
                    bytes[i] = (byte) (((b2 & 15) ^ ((byte) (((b2 >> 4) + length) & 15))) | i2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private static String g() {
        String a2 = com.xiaomi.push.service.b.a(c).a();
        return (TextUtils.isEmpty(a2) || com.xiaomi.push.service.module.a.China.name().equals(a2)) ? "resolver.msg.xiaomi.net" : "resolver.msg.global.xiaomi.net";
    }

    private String h() {
        BufferedReader bufferedReader;
        File file;
        try {
            file = new File(c.getFilesDir(), j());
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        if (!file.isFile()) {
            com.xiaomi.push.b.a((Closeable) null);
            return null;
        }
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                com.xiaomi.channel.commonutils.logger.c.a("load host exception " + th.getMessage());
                return null;
            } finally {
                com.xiaomi.push.b.a(bufferedReader);
            }
        }
    }

    private static String j() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) c.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == Process.myPid()) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "com.xiaomi";
        }
        return "com.xiaomi";
    }

    private static String k() {
        try {
            PackageInfo packageInfo = c.getPackageManager().getPackageInfo(c.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    private JSONObject l() {
        JSONObject jSONObject;
        synchronized (this.a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            for (bv bvVar : this.a.values()) {
                jSONArray.put(bvVar.b());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (bu buVar : b.values()) {
                jSONArray2.put(buVar.d());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    public final bu a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty");
        }
        return a(new URL(str).getHost(), true);
    }

    public final bu a(String str, boolean z) {
        bu e;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        bu d = d(str);
        return (d == null || !d.a()) ? (z && al.a(c) && (e = e(str)) != null) ? e : new ca(this, str, d) : d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<ak> arrayList3 = new ArrayList();
        arrayList3.add(new ai("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new ai("conpt", f(al.i(c))));
        }
        if (z) {
            arrayList3.add(new ai("reserved", "1"));
        }
        arrayList3.add(new ai("uuid", str2));
        arrayList3.add(new ai(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, ar.a(arrayList, CommonConstant.Symbol.COMMA)));
        arrayList3.add(new ai("countrycode", com.xiaomi.push.service.b.a(c).b()));
        String g = g();
        bu d = d(g);
        String format = String.format(Locale.US, "https://%1$s/gslb/?ver=4.0", g);
        if (d == null) {
            arrayList2.add(format);
            synchronized (b) {
                bu buVar = b.get(g);
                if (buVar != null) {
                    Iterator<String> it = buVar.a(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=4.0", it.next()));
                    }
                }
            }
        } else {
            arrayList2 = d.a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            for (ak akVar : arrayList3) {
                buildUpon.appendQueryParameter(akVar.a(), akVar.b());
            }
            try {
                return this.d == null ? al.a(c, new URL(buildUpon.toString())) : this.d.a(buildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.c.a("network exception: " + e.getMessage());
        throw e;
    }

    public final bu b(String str) {
        return a(str, true);
    }

    public final void c() {
        synchronized (this.a) {
            this.a.clear();
        }
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.a) {
            for (Map.Entry<String, bv> entry : this.a.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":\n");
                sb.append(entry.getValue().toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final void e() {
        ArrayList<String> arrayList;
        synchronized (this.a) {
            i();
            arrayList = new ArrayList<>(this.a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bv bvVar = this.a.get(arrayList.get(size));
                if (bvVar != null && bvVar.a() != null) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<bu> a2 = a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a2.get(i) != null) {
                a(arrayList.get(i), a2.get(i));
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(c.openFileOutput(j(), 0)));
                String jSONObject = l().toString();
                if (!TextUtils.isEmpty(jSONObject)) {
                    bufferedWriter.write(jSONObject);
                }
                bufferedWriter.close();
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a("persist bucket failure: " + e.getMessage());
            }
        }
    }

    private ArrayList<bu> a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String next;
        synchronized (this.a) {
            for (bv bvVar : this.a.values()) {
                bvVar.a(true);
            }
            loop1: while (true) {
                for (boolean z = false; !z; z = true) {
                    Iterator<String> it = this.a.keySet().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (this.a.get(next).b.isEmpty()) {
                            break;
                        }
                    }
                }
                this.a.remove(next);
            }
        }
        synchronized (this.a) {
            i();
            for (String str : this.a.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        synchronized (b) {
            for (Object obj : b.values().toArray()) {
                bu buVar = (bu) obj;
                if (!buVar.a()) {
                    b.remove(buVar.c);
                }
            }
        }
        if (!arrayList.contains(g())) {
            arrayList.add(g());
        }
        ArrayList<bu> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = al.d(c) ? "wifi" : "wap";
            String a2 = a(arrayList, str2, this.h, true);
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject3 = new JSONObject(a2);
                com.xiaomi.channel.commonutils.logger.c.b(a2);
                if ("OK".equalsIgnoreCase(jSONObject3.getString("S"))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    String string5 = jSONObject4.getString(GearsLocator.COUNTRY);
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.c.c("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str3 = arrayList.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str3);
                        if (optJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.c.a("no bucket found for " + str3);
                            jSONObject = jSONObject5;
                        } else {
                            bu buVar2 = new bu(str3);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                } else {
                                    jSONObject2 = jSONObject5;
                                    buVar2.a(new cd(string6, optJSONArray.length() - i3));
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList2.set(i2, buVar2);
                            buVar2.h = string5;
                            buVar2.d = string;
                            buVar2.f = string3;
                            buVar2.g = string4;
                            buVar2.e = string2;
                            if (jSONObject4.has("stat-percent")) {
                                buVar2.j = jSONObject4.getDouble("stat-percent");
                            }
                            if (jSONObject4.has("stat-domain")) {
                                buVar2.k = jSONObject4.getString("stat-domain");
                            }
                            if (jSONObject4.has(RemoteMessageConst.TTL)) {
                                buVar2.a(jSONObject4.getInt(RemoteMessageConst.TTL) * 1000);
                            }
                            this.e = buVar2.c();
                        }
                        i2++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = jSONObject4.has("reserved-ttl") ? 1000 * jSONObject4.getInt("reserved-ttl") : 604800000L;
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next2 = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next2);
                            if (optJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.c.a("no bucket found for " + next2);
                            } else {
                                bu buVar3 = new bu(next2);
                                buVar3.a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        buVar3.a(new cd(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                synchronized (b) {
                                    b.put(next2, buVar3);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            bu buVar4 = arrayList2.get(i5);
            if (buVar4 != null) {
                a(arrayList.get(i5), buVar4);
            }
        }
        f();
        return arrayList2;
    }

    private boolean i() {
        synchronized (this.a) {
            if (f) {
                return true;
            }
            f = true;
            this.a.clear();
            String h = h();
            if (TextUtils.isEmpty(h)) {
                return false;
            }
            synchronized (this.a) {
                this.a.clear();
                JSONObject jSONObject = new JSONObject(h);
                if (jSONObject.optInt("ver") != 2) {
                    throw new JSONException("Bad version");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        bv a2 = new bv().a(optJSONArray.getJSONObject(i));
                        this.a.put(a2.a, a2);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject2.optString("host");
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                bu a3 = new bu(optString).a(jSONObject2);
                                b.put(a3.c, a3);
                                com.xiaomi.channel.commonutils.logger.c.a("load local reserved host for " + a3.c);
                            } catch (JSONException unused) {
                                com.xiaomi.channel.commonutils.logger.c.a("parse reserved host fail.");
                            }
                        }
                    }
                }
            }
            com.xiaomi.channel.commonutils.logger.c.b("loading the new hosts succeed");
            return true;
        }
    }
}
