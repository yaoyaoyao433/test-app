package com.huawei.appgallery.serviceverifykit.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.appgallery.serviceverifykit.b.c;
import java.io.UnsupportedEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    Context a;
    String b;
    String c;
    String d;
    String e;
    String f;
    Map<String, String[]> g;
    Map<String, Integer> h;
    int i;
    String j;
    String k;
    Intent l;
    int m;
    private int n;
    private int o;
    private String p;

    private a() {
        this.g = new HashMap();
        this.h = new HashMap();
        this.n = 0;
        this.o = 0;
    }

    private static String a(@NonNull String str) {
        com.huawei.appgallery.serviceverifykit.b.d.b bVar;
        String str2;
        String str3;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (ClassNotFoundException unused) {
            bVar = com.huawei.appgallery.serviceverifykit.b.d.b.a;
            str2 = "ServiceVerifyKit";
            str3 = "getSystemProperties ClassNotFoundException";
            bVar.b(str2, str3);
            return "";
        } catch (Exception unused2) {
            bVar = com.huawei.appgallery.serviceverifykit.b.d.b.a;
            str2 = "ServiceVerifyKit";
            str3 = "getSystemProperties Exception while getting system property";
            bVar.b(str2, str3);
            return "";
        }
    }

    private boolean a(String str, String str2) {
        String[] strArr;
        if (this.g.containsKey(str) && (strArr = this.g.get(str)) != null) {
            for (String str3 : strArr) {
                if (str2.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String a() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.appgallery.serviceverifykit.api.a.a():java.lang.String");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.huawei.appgallery.serviceverifykit.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0168a {
        public Context a;
        public Intent b;
        public int c;
        private String d;
        private int k;
        private String n;
        private String e = "AppGallery Verification";
        private String f = "Huawei CBG Cloud Security Signer";
        private String g = "com.huawei.appgallery.fingerprint_signature";
        private String h = "com.huawei.appgallery.sign_certchain";
        private Map<String, String[]> i = new HashMap();
        private Map<String, Integer> j = new HashMap();
        private int l = 0;
        private String m = "verify_match_property";

        /* JADX WARN: $VALUES field not found */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* compiled from: ProGuard */
        /* renamed from: com.huawei.appgallery.serviceverifykit.api.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class EnumC0169a {
            public static final int a = 1;
            public static final int b = 2;
            public static final int c = 3;
            private static final /* synthetic */ int[] d = {a, b, c};
        }

        public final C0168a a(String str, String str2) {
            String[] strArr = this.i.get(str);
            if (strArr != null) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        String[] strArr2 = new String[length + 1];
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                        strArr2[length] = str2;
                        strArr = strArr2;
                        break;
                    } else if (TextUtils.equals(strArr[i], str2)) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                strArr = new String[]{str2};
            }
            this.i.put(str, strArr);
            this.j.put(str, Integer.valueOf(this.l));
            return this;
        }

        public final String a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.c = this.e;
            aVar.d = this.f;
            aVar.b = this.d;
            aVar.g.putAll(this.i);
            aVar.h.putAll(this.j);
            aVar.i = this.k;
            aVar.j = this.m;
            aVar.k = this.n;
            aVar.l = this.b;
            aVar.m = this.c;
            aVar.f = this.h;
            aVar.e = this.g;
            return aVar.a();
        }
    }

    private String a(List<com.huawei.appgallery.serviceverifykit.a.a> list) {
        String str = "";
        ArrayList arrayList = new ArrayList();
        for (com.huawei.appgallery.serviceverifykit.a.a aVar : list) {
            if (aVar.d >= 0) {
                arrayList.add(aVar);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        List<com.huawei.appgallery.serviceverifykit.a.a> b2 = b(list);
        if (b2.size() > 0) {
            int i = 0;
            for (com.huawei.appgallery.serviceverifykit.a.a aVar2 : b2) {
                if (aVar2.b >= i) {
                    i = aVar2.b;
                    str = aVar2.a;
                }
            }
        }
        return str;
    }

    private static List<com.huawei.appgallery.serviceverifykit.a.a> b(List<com.huawei.appgallery.serviceverifykit.a.a> list) {
        ArrayList arrayList = new ArrayList();
        for (com.huawei.appgallery.serviceverifykit.a.a aVar : list) {
            if (aVar.c == 0) {
                arrayList.add(aVar);
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private boolean a(String str, String str2, String str3) {
        ArrayList arrayList;
        com.huawei.appgallery.serviceverifykit.b.d.b bVar;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            com.huawei.appgallery.serviceverifykit.b.d.b.a.b("ServiceVerifyKit", "args is invalid");
            return false;
        }
        List<String> a = c.a(str3);
        byte[] bArr = null;
        if (a == null) {
            com.huawei.appgallery.serviceverifykit.b.d.b.a.a("X509CertUtil", "base64 CertChain is null.");
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList(a.size());
            for (String str6 : a) {
                X509Certificate a2 = TextUtils.isEmpty(str6) ? null : c.a(com.huawei.appgallery.serviceverifykit.b.a.a(str6));
                if (a2 == null) {
                    com.huawei.appgallery.serviceverifykit.b.d.b.a.b("X509CertUtil", "Failed to get cert from CertChain");
                } else {
                    arrayList2.add(a2);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.size() == 0) {
            bVar = com.huawei.appgallery.serviceverifykit.b.d.b.a;
            str4 = "ServiceVerifyKit";
            str5 = "certChain is empty";
        } else if (c.a(c.a(this.a), arrayList)) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(0);
            if (!c.a(x509Certificate, "CN", this.c)) {
                com.huawei.appgallery.serviceverifykit.b.d.b.a.b("ServiceVerifyKit", "CN is invalid");
                return false;
            } else if (!c.a(x509Certificate, "OU", this.d)) {
                com.huawei.appgallery.serviceverifykit.b.d.b.a.b("ServiceVerifyKit", "OU is invalid");
                return false;
            } else {
                try {
                    bArr = str.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    com.huawei.appgallery.serviceverifykit.b.d.b.a.a("ServiceVerifyKit", "checkCertChain UnsupportedEncodingException:", e);
                }
                if (c.a(x509Certificate, bArr, com.huawei.appgallery.serviceverifykit.b.a.a(str2))) {
                    return true;
                }
                com.huawei.appgallery.serviceverifykit.b.d.b bVar2 = com.huawei.appgallery.serviceverifykit.b.d.b.a;
                bVar2.b("ServiceVerifyKit", "signature is invalid: " + str);
                return false;
            }
        } else {
            bVar = com.huawei.appgallery.serviceverifykit.b.d.b.a;
            str4 = "ServiceVerifyKit";
            str5 = "failed to verify cert chain";
        }
        bVar.b(str4, str5);
        return false;
    }
}
