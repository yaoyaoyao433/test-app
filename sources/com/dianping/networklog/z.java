package com.dianping.networklog;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z {
    public static ChangeQuickRedirect a;
    private w b;
    private String c;

    /* loaded from: classes.dex */
    public static class a {
        public static final z a = new z();
    }

    /* loaded from: classes.dex */
    public static class b {
        public static ChangeQuickRedirect a = null;
        public static int e = 403;
        public boolean b;
        public int c;
        public String d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3379721b14ffa480dbf08da95bc863e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3379721b14ffa480dbf08da95bc863e3");
            } else {
                this.c = -1;
            }
        }

        public static int a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "848b75ed0643550afbd63eef00b8aa1d", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "848b75ed0643550afbd63eef00b8aa1d")).intValue();
            }
            if (bVar == null) {
                return -1;
            }
            if (bVar.b) {
                return 0;
            }
            return bVar.c;
        }

        public static b a(byte[] bArr) {
            int i = 0;
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c2041954c73347e281ee0293b92d072", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c2041954c73347e281ee0293b92d072");
            }
            b bVar = new b();
            if (bArr == null) {
                return bVar;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                bVar.b = jSONObject.optBoolean("success");
                if (!bVar.b) {
                    i = -1;
                }
                bVar.c = jSONObject.optInt("code", i);
                String optString = jSONObject.optString("data");
                if (!TextUtils.isEmpty(optString)) {
                    bVar.d = new JSONObject(optString).optString("taskid", null);
                }
            } catch (JSONException unused) {
            }
            return bVar;
        }
    }

    public z() {
        this(w.a());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f71f4a0e1774aeb427ff84c38a4c6d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f71f4a0e1774aeb427ff84c38a4c6d9");
        }
    }

    private z(w wVar) {
        Object[] objArr = {wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393b95d2b8371930f14d29bb2a074407", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393b95d2b8371930f14d29bb2a074407");
            return;
        }
        this.b = wVar;
        this.c = String.valueOf(aj.a(c.a()));
    }

    private void a(af afVar, Map<String, String> map) {
        Object[] objArr = {afVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f1108d2ac14cc1081b2bbac83dae8cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f1108d2ac14cc1081b2bbac83dae8cf");
        } else if (afVar == null || map == null || afVar.m != 2 || TextUtils.isEmpty(afVar.u)) {
        } else {
            map.put("bizTaskId", afVar.c);
        }
    }

    private byte[] b(af afVar, Map<String, String> map) {
        Object[] objArr = {afVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176783c9bb88ab405517d94f2b5caed4", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176783c9bb88ab405517d94f2b5caed4");
        }
        try {
            byte[] a2 = this.b.a(afVar.o ? "logger/upload2.file" : "logger/upload.file", new FileInputStream(afVar.y), map);
            if (c.e) {
                new StringBuilder("[Auto Test]").append(a2 == null ? StringUtil.NULL : new String(a2));
            }
            return a2;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    private Map<String, String> e(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c677caaf93fd82877233bfb3d6c2eb4f", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c677caaf93fd82877233bfb3d6c2eb4f");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "binary/octet-stream");
        hashMap.put("appId", String.valueOf(c.d));
        hashMap.put("unionId", afVar.l);
        hashMap.put("fileDate", afVar.k);
        hashMap.put("client", "android");
        hashMap.put("md5", afVar.x);
        hashMap.put("version", af.c());
        hashMap.put("key", afVar.r);
        hashMap.put(QuickReportConstants.CONFIG_FILE_NAME, afVar.i);
        hashMap.put("rv", afVar.o ? "2" : "1");
        hashMap.put("appVersion", this.c);
        hashMap.put("filesInfo", afVar.f);
        hashMap.put("buildID", c.e());
        hashMap.put("uploadType", String.valueOf(afVar.m));
        if (!TextUtils.isEmpty(afVar.v)) {
            hashMap.put("bizId", afVar.v);
        }
        hashMap.put(ResponseWithInnerData.INSTANCE_ID, afVar.d);
        hashMap.put("processName", TextUtils.isEmpty(afVar.B) ? "main" : afVar.B);
        if (afVar.o) {
            hashMap.put("seqNum", String.valueOf(afVar.z));
            hashMap.put("maxSeqNum", String.valueOf(afVar.A));
        }
        return hashMap;
    }

    public final boolean a(af afVar) {
        boolean z = true;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073e0583ece8f904061a351a2a329a48", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073e0583ece8f904061a351a2a329a48")).booleanValue();
        }
        if (afVar.m == 2) {
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", String.valueOf(c.d));
        hashMap.put("unionId", afVar.l);
        if (!TextUtils.isEmpty(afVar.v)) {
            hashMap.put("bizId", afVar.v);
        }
        hashMap.put("fileDate", afVar.k);
        byte[] a2 = this.b.a("logger/upload.query", null, hashMap);
        if (a2 != null) {
            try {
                int optInt = new JSONObject(new String(a2)).optInt("code");
                if (optInt != 200) {
                    z = false;
                }
                com.dianping.networklog.a.d.a().a(z ? optInt : optInt + 1000);
                if (!z && c.e) {
                    new StringBuilder("Upload not permitted, code: ").append(optInt);
                }
            } catch (JSONException unused) {
            }
        } else {
            com.dianping.networklog.a.d.a().a(-500);
        }
        return z;
    }

    public final boolean a(@NonNull af afVar, boolean z) {
        Object[] objArr = {afVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4b0fd5da97655d70935be70265ed8f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4b0fd5da97655d70935be70265ed8f")).booleanValue();
        }
        double b2 = aj.b(afVar.e);
        StringBuilder sb = new StringBuilder("");
        boolean z2 = afVar.e == 0;
        sb.append("taskId=");
        sb.append(afVar.c);
        sb.append("&fileSize=");
        sb.append(b2);
        sb.append("&upload=");
        sb.append(afVar.h);
        sb.append("&isWifi=");
        sb.append(afVar.g);
        sb.append("&client=android");
        sb.append("&kickCode=");
        sb.append(afVar.b);
        if (z2) {
            sb.append("&filesInfo=");
            sb.append(afVar.f);
            sb.append("&buildID=");
            sb.append(c.e());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes());
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
        a(afVar, hashMap);
        byte[] a2 = this.b.a("logger/kick.json", byteArrayInputStream, hashMap);
        if (a2 != null) {
            try {
                String str = new String(a2);
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return new JSONObject(str).optBoolean("success", false);
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }

    public final byte[] b(@NonNull af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9290743772a661ee7272c256cddea0", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9290743772a661ee7272c256cddea0") : b(afVar, d(afVar));
    }

    public final byte[] c(@NonNull af afVar) {
        Map<String, String> e;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d5de48dec3e731a6f0c10cbd79bcaa", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d5de48dec3e731a6f0c10cbd79bcaa");
        }
        Object[] objArr2 = {afVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3284e22c0809cec93f0368d6bc3d5cf5", 6917529027641081856L)) {
            e = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3284e22c0809cec93f0368d6bc3d5cf5");
        } else {
            e = e(afVar);
            e.put(ResponseWithInnerData.TASK_ID, afVar.c);
            a(afVar, e);
        }
        return b(afVar, e);
    }

    private Map<String, String> d(af afVar) {
        Map map;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed2b295fd753c8e587c593012e143c0", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed2b295fd753c8e587c593012e143c0");
        }
        Map<String, String> e = e(afVar);
        d dVar = afVar.w;
        if (dVar != null) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "4144d4fb663a7007280b86f9bd25363c", 6917529027641081856L)) {
                    map = (Map) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "4144d4fb663a7007280b86f9bd25363c");
                } else {
                    HashMap hashMap = new HashMap(dVar.b);
                    String a2 = dVar.a();
                    if (!TextUtils.isEmpty(a2)) {
                        hashMap.put("tag", a2);
                    }
                    map = hashMap;
                }
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e.put("environment", jSONObject.toString());
                }
            } catch (Exception unused) {
            }
        }
        return e;
    }
}
