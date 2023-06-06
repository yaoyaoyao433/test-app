package com.dianping.nvnetwork;

import com.dianping.nvnetwork.x;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, a> b = new HashMap<>(64);

    public static synchronized a a(String str) {
        synchronized (c.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7f6e7abd697f995603f7a3d86ff0bb7", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7f6e7abd697f995603f7a3d86ff0bb7");
            }
            if (str == null) {
                str = "";
            }
            a aVar = b.get(str);
            if (aVar == null) {
                aVar = new a(str);
                b.put(str, aVar);
            }
            return aVar;
        }
    }

    public static synchronized void b(String str) {
        synchronized (c.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4290d6ff3c477e8b8f5fa3d3a12847c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4290d6ff3c477e8b8f5fa3d3a12847c6");
                return;
            }
            if (str == null) {
                str = "";
            }
            b.remove(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        StringBuffer b;
        int c;
        public volatile long d;
        public volatile long e;
        public volatile long f;
        public volatile long g;
        public volatile long h;
        public volatile long i;
        public volatile long j;
        public volatile long k;
        public volatile long l;
        public volatile long m;
        volatile long n;
        public volatile long o;
        public volatile long p;
        public volatile int q;
        volatile long r;
        public volatile int s;
        private final String t;
        private long u;
        private long v;
        private long w;
        private volatile long x;
        private volatile long y;
        private volatile int z;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1bc0d2e31a3af485102b064dfdd6261", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1bc0d2e31a3af485102b064dfdd6261");
                return;
            }
            this.b = new StringBuffer();
            this.t = str;
        }

        private void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e297010a590a0fcc6b6f99a7d2eacc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e297010a590a0fcc6b6f99a7d2eacc");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            String valueOf = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75563917227a6a2e9d7084d24832828e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75563917227a6a2e9d7084d24832828e") : String.valueOf(System.currentTimeMillis());
            try {
                StringBuffer stringBuffer = this.b;
                stringBuffer.append(str);
                stringBuffer.append(valueOf);
                stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (Throwable unused) {
            }
        }

        private void a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7189c0b4874e9afa91686c86c072027d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7189c0b4874e9afa91686c86c072027d");
                return;
            }
            try {
                StringBuffer stringBuffer = this.b;
                stringBuffer.append(str);
                stringBuffer.append(i);
                stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (Throwable unused) {
            }
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc41893a28e53473a2af345792a131f1", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc41893a28e53473a2af345792a131f1");
            }
            this.u = System.currentTimeMillis();
            this.d = System.nanoTime();
            b("cs");
            return this;
        }

        public final a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01b4c26bdd7968b73abf8cb08b251e9", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01b4c26bdd7968b73abf8cb08b251e9");
            }
            this.v = System.currentTimeMillis();
            b("tw");
            return this;
        }

        public final a c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0504e523a6cf8bca6a2d3fd9ca7cd10f", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0504e523a6cf8bca6a2d3fd9ca7cd10f");
            }
            this.w = System.nanoTime();
            this.r = this.w - this.d;
            b("if");
            return this;
        }

        public final a d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4996bd1b8a2107a854ba8e2ce30dae56", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4996bd1b8a2107a854ba8e2ce30dae56");
            }
            b("ts");
            this.f = System.nanoTime();
            this.g = this.f - this.d;
            return this;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217bcc7e654795d02b2d5fd9ab0a4215", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217bcc7e654795d02b2d5fd9ab0a4215");
            }
            StringBuffer stringBuffer = this.b;
            stringBuffer.append("cn");
            stringBuffer.append(str);
            stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            return this;
        }

        public final a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e458d7ed27530d20f918a609212ed89c", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e458d7ed27530d20f918a609212ed89c");
            }
            b(z ? TimeDisplaySetting.TIME_DISPLAY : "tu");
            return this;
        }

        public final a e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ccaac3c44ca45d32a4051925da4284", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ccaac3c44ca45d32a4051925da4284");
            }
            b("tf");
            return this;
        }

        public final a f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c06155f505723f5f3ed621fe5c35cf7", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c06155f505723f5f3ed621fe5c35cf7");
            }
            b("hs");
            return this;
        }

        public final a g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc89377beadcfec17910c5bd4311035", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc89377beadcfec17910c5bd4311035");
            }
            b("hf");
            return this;
        }

        public final a a(int i) {
            Object[] objArr = {-172};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9caa1fe1cc9203b18c611c98c32a84e", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9caa1fe1cc9203b18c611c98c32a84e");
            }
            a("ec", -172);
            return this;
        }

        public final a b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96dfe39bd1fe6a6eba8739d717536324", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96dfe39bd1fe6a6eba8739d717536324");
            }
            a(Constants.Environment.KEY_SC, i);
            return this;
        }

        public final a c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0810db7eeba73e0a741d1b015f084e75", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0810db7eeba73e0a741d1b015f084e75");
            }
            if (i != 1) {
                a("ac", i);
            }
            return this;
        }

        public final a a(List<com.dianping.nvnetwork.tunnel2.h> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "930decfdb3e271ebba8db3fc362f2aa4", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "930decfdb3e271ebba8db3fc362f2aa4");
            }
            try {
                this.b.append("iv");
                synchronized (list) {
                    for (com.dianping.nvnetwork.tunnel2.h hVar : list) {
                        StringBuffer stringBuffer = this.b;
                        stringBuffer.append("*");
                        stringBuffer.append(hVar.m());
                        stringBuffer.append(CommonConstant.Symbol.UNDERLINE);
                        stringBuffer.append(hVar.h);
                    }
                }
                this.b.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (Throwable unused) {
            }
            return this;
        }

        public final a b(List<x.a> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6583c10adf86b4d2ca00c4d6cabe22ab", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6583c10adf86b4d2ca00c4d6cabe22ab");
            }
            try {
                this.b.append("iv");
                for (x.a aVar : list) {
                    StringBuffer stringBuffer = this.b;
                    stringBuffer.append("*");
                    stringBuffer.append(aVar.a);
                    stringBuffer.append(CommonConstant.Symbol.UNDERLINE);
                    stringBuffer.append(aVar.b);
                }
                this.b.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (Throwable unused) {
            }
            return this;
        }

        public final a d(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095d6916a005bf66d7249c9190134f8c", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095d6916a005bf66d7249c9190134f8c");
            }
            this.c = i;
            a("st", i);
            return this;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd2297f2fdbaab17b80c0f825f3009e", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd2297f2fdbaab17b80c0f825f3009e");
            }
            this.x = j;
            return this;
        }

        public final a b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded3d9347108ad3068a797edc82f2c85", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded3d9347108ad3068a797edc82f2c85");
            }
            this.y = j;
            this.n = j - this.x;
            return this;
        }

        public final a a(Map<String, String> map) {
            String str;
            int i;
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e685900b0e6c4a980e71c98f7e414df", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e685900b0e6c4a980e71c98f7e414df");
            }
            this.z = 0;
            if (map == null || (str = map.get("M-SHARK-DURATION")) == null) {
                return this;
            }
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = 0;
            }
            this.z = i;
            return this;
        }

        public final long h() {
            return this.m / 1000;
        }

        public final long i() {
            return this.k / 1000;
        }

        public final long j() {
            return this.l / 1000;
        }

        public final long k() {
            return this.g / 1000;
        }

        public final long l() {
            return this.h / 1000;
        }

        public final long m() {
            return this.i / 1000;
        }

        public final int n() {
            return this.z * 1000;
        }
    }
}
