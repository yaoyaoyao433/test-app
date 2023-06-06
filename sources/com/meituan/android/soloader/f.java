package com.meituan.android.soloader;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import com.meituan.android.soloader.SysUtil;
import com.meituan.android.soloader.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f extends o {
    public static ChangeQuickRedirect g;
    protected final File h;
    protected final String i;

    public f(Context context, String str, File file, String str2) {
        super(context, str);
        Object[] objArr = {context, str, file, str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b018afb14ac90e9bcdc07741a695f0d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b018afb14ac90e9bcdc07741a695f0d3");
            return;
        }
        this.h = file;
        this.i = str2;
    }

    @Override // com.meituan.android.soloader.o
    public o.e a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4bc0aabeea4975c7a2fa73c20d37ca8", RobustBitConfig.DEFAULT_VALUE) ? (o.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4bc0aabeea4975c7a2fa73c20d37ca8") : new b(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b extends o.e {
        public static ChangeQuickRedirect c;
        private final o a;
        @Nullable
        a[] d;
        final ZipFile e;

        public boolean a(ZipEntry zipEntry, String str) {
            return true;
        }

        public b(o oVar) throws IOException {
            Object[] objArr = {f.this, oVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476dded55a958629993c88094ef4b18e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476dded55a958629993c88094ef4b18e");
                return;
            }
            this.e = new ZipFile(f.this.h);
            this.a = oVar;
        }

        public final a[] a() {
            String[] supportedAbis;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d903dc7306c4bf61d68d66091be30d8", RobustBitConfig.DEFAULT_VALUE)) {
                return (a[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d903dc7306c4bf61d68d66091be30d8");
            }
            if (this.d == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern.compile(f.this.i);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = SysUtil.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8d712b05716d44acf70324d6e04e2609", RobustBitConfig.DEFAULT_VALUE)) {
                    supportedAbis = (String[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8d712b05716d44acf70324d6e04e2609");
                } else {
                    supportedAbis = Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : SysUtil.LollipopSysdeps.getSupportedAbis();
                }
                Enumeration<? extends ZipEntry> entries = this.e.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    String name = nextElement.getName();
                    if (name != null && name.startsWith("lib/") && name.endsWith(".so")) {
                        int indexOf = name.indexOf("/", 4);
                        int indexOf2 = name.indexOf(".so");
                        String substring = name.substring(4, indexOf);
                        String substring2 = name.substring(indexOf + 1, indexOf2);
                        int a2 = SysUtil.a(supportedAbis, substring);
                        if (a2 >= 0) {
                            linkedHashSet.add(substring);
                            a aVar = (a) hashMap.get(substring2);
                            if (aVar == null || a2 < aVar.c) {
                                hashMap.put(substring2, new a(substring2, nextElement, a2));
                            }
                        }
                    }
                }
                this.a.n = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    a aVar2 = aVarArr[i2];
                    if (a(aVar2.b, aVar2.d)) {
                        i++;
                    } else {
                        aVarArr[i2] = null;
                    }
                }
                a[] aVarArr2 = new a[i];
                int i3 = 0;
                for (a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        aVarArr2[i3] = aVar3;
                        i3++;
                    }
                }
                this.d = aVarArr2;
            }
            return this.d;
        }

        @Override // com.meituan.android.soloader.o.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "682548357c67afc2bc6b9646b51d6d9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "682548357c67afc2bc6b9646b51d6d9b");
            } else {
                this.e.close();
            }
        }

        @Override // com.meituan.android.soloader.o.e
        public final o.b b() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ce551b81f9a96b2e2086eb9f0e22f0", RobustBitConfig.DEFAULT_VALUE) ? (o.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ce551b81f9a96b2e2086eb9f0e22f0") : new o.b(a());
        }

        @Override // com.meituan.android.soloader.o.e
        public final o.d c() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434ebc25d071d3e06cb845a8d8675659", RobustBitConfig.DEFAULT_VALUE) ? (o.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434ebc25d071d3e06cb845a8d8675659") : new a();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public final class a extends o.d {
            public static ChangeQuickRedirect a;
            private int c;

            private a() {
                Object[] objArr = {b.this};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34aacd72b8c7b8594f4c981b85ce312d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34aacd72b8c7b8594f4c981b85ce312d");
                }
            }

            @Override // com.meituan.android.soloader.o.d
            public final boolean a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db44ef3c083a59e5579517be66d13bd7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db44ef3c083a59e5579517be66d13bd7")).booleanValue();
                }
                b.this.a();
                return this.c < b.this.d.length;
            }

            @Override // com.meituan.android.soloader.o.d
            public final o.c b() throws IOException {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b529bcc77c5ebead3b3c7fa8aee945a3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (o.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b529bcc77c5ebead3b3c7fa8aee945a3");
                }
                b.this.a();
                a[] aVarArr = b.this.d;
                int i = this.c;
                this.c = i + 1;
                a aVar = aVarArr[i];
                InputStream inputStream = b.this.e.getInputStream(aVar.b);
                try {
                    return new o.c(aVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a extends o.a implements Comparable {
        public static ChangeQuickRedirect a;
        public final ZipEntry b;
        public final int c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r17, java.util.zip.ZipEntry r18, int r19) {
            /*
                r16 = this;
                r7 = r16
                r0 = r17
                r8 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r5 = 0
                r2[r5] = r8
                com.meituan.robust.ChangeQuickRedirect r3 = com.meituan.android.soloader.f.a.a
                java.lang.String r4 = "9b526d6fb29dcb1d835a47c2a39a0eea"
                r10 = 0
                r12 = 1
                r14 = 4611686018427387904(0x4000000000000000, double:2.0)
                r9 = r2
                r11 = r3
                r13 = r4
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14)
                r9 = 3
                r10 = 2
                if (r6 == 0) goto L27
                r6 = 0
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r6, r3, r1, r4)
                java.lang.String r2 = (java.lang.String) r2
                goto L55
            L27:
                java.lang.String r2 = "pseudo-zip-hash-1-%s-%s-%s-%s"
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = r18.getName()
                r3[r5] = r4
                long r11 = r18.getSize()
                java.lang.Long r4 = java.lang.Long.valueOf(r11)
                r3[r1] = r4
                long r11 = r18.getCompressedSize()
                java.lang.Long r4 = java.lang.Long.valueOf(r11)
                r3[r10] = r4
                long r11 = r18.getCrc()
                java.lang.Long r4 = java.lang.Long.valueOf(r11)
                r3[r9] = r4
                java.lang.String r2 = java.lang.String.format(r2, r3)
            L55:
                r7.<init>(r0, r2)
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r9[r5] = r0
                r9[r1] = r8
                java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
                r9[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.soloader.f.a.a
                java.lang.String r11 = "ef6ec35eb6798993e28c198f38e3e256"
                r3 = 0
                r12 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r0 = r9
                r1 = r16
                r2 = r10
                r4 = r11
                r14 = 0
                r5 = r12
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
                if (r0 == 0) goto L7c
                com.meituan.robust.PatchProxy.accessDispatch(r9, r7, r10, r14, r11)
                return
            L7c:
                r7.b = r8
                r0 = r19
                r7.c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.soloader.f.a.<init>(java.lang.String, java.util.zip.ZipEntry, int):void");
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa95e3505dd101c2fab6bff5a4a28250", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa95e3505dd101c2fab6bff5a4a28250")).intValue() : this.d.compareTo(((a) obj).d);
        }
    }
}
