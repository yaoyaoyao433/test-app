package com.xiaomi.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.common.CommonConstant;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class bu {
    public String a;
    long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    protected String i;
    private String n;
    private ArrayList<cd> m = new ArrayList<>();
    double j = 0.1d;
    String k = "s.mi1.cc";
    long l = 86400000;

    public bu(String str) {
        this.a = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.b = System.currentTimeMillis();
        this.m.add(new cd(str, -1));
        this.a = by.b();
        this.c = str;
    }

    private void a(String str, int i, long j, long j2, Exception exc) {
        a(str, new bt(i, j, j2, exc));
    }

    private synchronized void c(String str) {
        Iterator<cd> it = this.m.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().a, str)) {
                it.remove();
            }
        }
    }

    public final synchronized bu a(JSONObject jSONObject) {
        this.a = jSONObject.optString("net");
        this.l = jSONObject.getLong(RemoteMessageConst.TTL);
        this.j = jSONObject.getDouble("pct");
        this.b = jSONObject.getLong("ts");
        this.e = jSONObject.optString("city");
        this.d = jSONObject.optString("prv");
        this.h = jSONObject.optString("cty");
        this.f = jSONObject.optString("isp");
        this.g = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        this.c = jSONObject.optString("host");
        this.i = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new cd().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        String substring;
        cd[] cdVarArr = new cd[this.m.size()];
        this.m.toArray(cdVarArr);
        Arrays.sort(cdVarArr);
        arrayList = new ArrayList<>();
        for (cd cdVar : cdVarArr) {
            if (z) {
                substring = cdVar.a;
            } else {
                int indexOf = cdVar.a.indexOf(CommonConstant.Symbol.COLON);
                substring = indexOf != -1 ? cdVar.a.substring(0, indexOf) : cdVar.a;
            }
            arrayList.add(substring);
        }
        return arrayList;
    }

    public final void a(long j) {
        if (j > 0) {
            this.l = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(cd cdVar) {
        c(cdVar.a);
        this.m.add(cdVar);
    }

    public final void a(String str, long j, long j2) {
        a(str, 0, j, j2, null);
    }

    public final void a(String str, long j, long j2, Exception exc) {
        try {
            b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public synchronized void a(String str, bt btVar) {
        Iterator<cd> it = this.m.iterator();
        while (it.hasNext()) {
            cd next = it.next();
            if (TextUtils.equals(str, next.a)) {
                next.a(btVar);
                return;
            }
        }
    }

    public final synchronized void a(String[] strArr) {
        int i;
        int size = this.m.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (true) {
                if (i < length) {
                    if (TextUtils.equals(this.m.get(size).a, strArr[i])) {
                        this.m.remove(size);
                        break;
                    }
                    i++;
                }
            }
            size--;
        }
        Iterator<cd> it = this.m.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            cd next = it.next();
            if (next.b > i2) {
                i2 = next.b;
            }
        }
        while (i < strArr.length) {
            a(new cd(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    public boolean a() {
        return System.currentTimeMillis() - this.b < this.l;
    }

    public final synchronized ArrayList<String> b() {
        return a(false);
    }

    public final synchronized void b(String str) {
        a(new cd(str));
    }

    public final void b(String str, long j, long j2, Exception exc) {
        a(str, -1, j, j2, exc);
    }

    public final synchronized JSONObject d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.a);
        jSONObject.put(RemoteMessageConst.TTL, this.l);
        jSONObject.put("pct", this.j);
        jSONObject.put("ts", this.b);
        jSONObject.put("city", this.e);
        jSONObject.put("prv", this.d);
        jSONObject.put("cty", this.h);
        jSONObject.put("isp", this.f);
        jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.g);
        jSONObject.put("host", this.c);
        jSONObject.put("xf", this.i);
        JSONArray jSONArray = new JSONArray();
        Iterator<cd> it = this.m.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n");
        sb.append(c());
        Iterator<cd> it = this.m.iterator();
        while (it.hasNext()) {
            sb.append("\n");
            sb.append(it.next().toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    public final ArrayList<String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (TextUtils.equals(url.getHost(), this.c)) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = a(true).iterator();
            while (it.hasNext()) {
                bw a = bw.a(it.next(), url.getPort());
                arrayList.add(new URL(url.getProtocol(), a.a, a.b, url.getFile()).toString());
            }
            return arrayList;
        }
        throw new IllegalArgumentException("the url is not supported by the fallback");
    }

    public final synchronized String c() {
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        } else if (TextUtils.isEmpty(this.f)) {
            return "hardcode_isp";
        } else {
            String[] strArr = {this.f, this.d, this.e, this.h, this.g};
            StringBuffer stringBuffer = new StringBuffer(((strArr[0] == null ? 16 : strArr[0].toString().length()) + CommonConstant.Symbol.UNDERLINE.length()) * 5);
            for (int i = 0; i < 5; i++) {
                if (i > 0) {
                    stringBuffer.append(CommonConstant.Symbol.UNDERLINE);
                }
                if (strArr[i] != null) {
                    stringBuffer.append((Object) strArr[i]);
                }
            }
            this.n = stringBuffer.toString();
            return this.n;
        }
    }
}
