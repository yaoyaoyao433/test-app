package com.facebook.soloader;

import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.soloader.l;
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
/* loaded from: classes2.dex */
public class e extends l {
    protected final File e;
    protected final String f;

    public e(Context context, String str, File file, String str2) {
        super(context, str);
        this.e = file;
        this.f = str2;
    }

    @Override // com.facebook.soloader.l
    protected l.e a() throws IOException {
        return new b(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b extends l.e {
        private final l a;
        @Nullable
        a[] b;
        final ZipFile c;

        protected boolean a(ZipEntry zipEntry, String str) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(l lVar) throws IOException {
            this.c = new ZipFile(e.this.e);
            this.a = lVar;
        }

        final a[] c() {
            if (this.b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern.compile(e.this.f);
                String[] a2 = j.a();
                Enumeration<? extends ZipEntry> entries = this.c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    String name = nextElement.getName();
                    if (name != null && name.startsWith("lib/") && name.endsWith(".so")) {
                        int indexOf = name.indexOf("/", 4);
                        int indexOf2 = name.indexOf(".so");
                        String substring = name.substring(4, indexOf);
                        String substring2 = name.substring(indexOf + 1, indexOf2);
                        int a3 = j.a(a2, substring);
                        if (a3 >= 0) {
                            linkedHashSet.add(substring);
                            a aVar = (a) hashMap.get(substring2);
                            if (aVar == null || a3 < aVar.b) {
                                hashMap.put(substring2, new a(substring2, nextElement, a3));
                            }
                        }
                    }
                }
                this.a.i = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                a[] aVarArr = (a[]) hashMap.values().toArray(new a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    a aVar2 = aVarArr[i2];
                    if (a(aVar2.a, aVar2.c)) {
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
                this.b = aVarArr2;
            }
            return this.b;
        }

        @Override // com.facebook.soloader.l.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.c.close();
        }

        @Override // com.facebook.soloader.l.e
        protected final l.b a() throws IOException {
            return new l.b(c());
        }

        @Override // com.facebook.soloader.l.e
        protected final l.d b() throws IOException {
            return new a();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        final class a extends l.d {
            private int b;

            private a() {
            }

            @Override // com.facebook.soloader.l.d
            public final boolean a() {
                b.this.c();
                return this.b < b.this.b.length;
            }

            @Override // com.facebook.soloader.l.d
            public final l.c b() throws IOException {
                b.this.c();
                a[] aVarArr = b.this.b;
                int i = this.b;
                this.b = i + 1;
                a aVar = aVarArr[i];
                InputStream inputStream = b.this.c.getInputStream(aVar.a);
                try {
                    return new l.c(aVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a extends l.a implements Comparable {
        final ZipEntry a;
        final int b;

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.c.compareTo(((a) obj).c);
        }

        a(String str, ZipEntry zipEntry, int i) {
            super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())));
            this.a = zipEntry;
            this.b = i;
        }
    }
}
