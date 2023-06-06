package com.meituan.snare;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FilenameFilter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final f i = new f();
    volatile String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9624957c0349a49afbc78984886f43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9624957c0349a49afbc78984886f43");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static f a() {
        return i;
    }

    @AnyThread
    public final String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87329fd153c69f26419970929e3c64d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87329fd153c69f26419970929e3c64d3");
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    File file = new File(context.getFilesDir(), "tombstone");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (file.exists() && file.isDirectory()) {
                        this.b = file.getAbsolutePath();
                    }
                    return "";
                }
            }
        }
        return this.b;
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "298c1427817aa8b233382dc0b221deaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "298c1427817aa8b233382dc0b221deaa");
        }
        if (str == null) {
            str = this.e;
        }
        return b(str, ".pages");
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e93db74bcd3f9bd03e4c48694ec2067", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e93db74bcd3f9bd03e4c48694ec2067") : String.format(this.c, str);
    }

    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f223816cd12da80cf1d98d137a585abb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f223816cd12da80cf1d98d137a585abb") : String.format(this.d, str);
    }

    public final String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8b7eebbafb53fbdfc95c5b081ddbcc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8b7eebbafb53fbdfc95c5b081ddbcc") : TextUtils.equals(str, "native-Crash") ? this.g : this.f;
    }

    public final File[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ef0c0d72ccde5bd4a95882e938b3b6", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ef0c0d72ccde5bd4a95882e938b3b6") : f(".crash");
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f58a963d6bb38ec71225b1ae47f1995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f58a963d6bb38ec71225b1ae47f1995");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999c6034cae7bdf6cc18f764e6644c42", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999c6034cae7bdf6cc18f764e6644c42")).booleanValue();
        }
        try {
            if (str.contains("tombstone") && str2.contains("tombstone") && str.contains(CommonConstant.Symbol.DOT) && str2.contains(CommonConstant.Symbol.DOT) && str.contains(CommonConstant.Symbol.UNDERLINE) && str2.contains(CommonConstant.Symbol.UNDERLINE)) {
                String substring = str.substring(0, str.lastIndexOf(CommonConstant.Symbol.DOT));
                String substring2 = str2.substring(0, str2.lastIndexOf(CommonConstant.Symbol.DOT));
                return substring.substring(substring.lastIndexOf(CommonConstant.Symbol.UNDERLINE) + 1).equals(substring2.substring(substring2.lastIndexOf(CommonConstant.Symbol.UNDERLINE) + 1));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d3d66d3f6e30fa47d0e4c8e750f5a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d3d66d3f6e30fa47d0e4c8e750f5a2");
        }
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.h)) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        return String.format("%s/%s_%s_%s%s", this.b, "tombstone", this.h, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public File[] f(@Nullable final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9956c70a784672266227c81665e22eae", RobustBitConfig.DEFAULT_VALUE)) {
            return (File[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9956c70a784672266227c81665e22eae");
        }
        if (this.b == null) {
            return new File[0];
        }
        File file = new File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.exists() || !file.isDirectory()) {
            return new File[0];
        }
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.meituan.snare.f.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
                if (r13.contains(r0.e == null ? "" : r0.e) == false) goto L13;
             */
            @Override // java.io.FilenameFilter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean accept(java.io.File r12, java.lang.String r13) {
                /*
                    r11 = this;
                    r0 = 2
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    r8 = 0
                    r0[r8] = r12
                    r12 = 1
                    r0[r12] = r13
                    com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.snare.f.AnonymousClass1.a
                    java.lang.String r10 = "6c9b1e56ca29c543db312f3719c947e0"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r0
                    r2 = r11
                    r3 = r9
                    r5 = r10
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L25
                    java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    return r12
                L25:
                    java.lang.String r0 = "tombstone_"
                    boolean r0 = r13.startsWith(r0)
                    if (r0 == 0) goto L40
                    com.meituan.snare.f r0 = com.meituan.snare.f.this
                    java.lang.String r1 = r0.e
                    if (r1 != 0) goto L37
                    java.lang.String r0 = ""
                    goto L39
                L37:
                    java.lang.String r0 = r0.e
                L39:
                    boolean r0 = r13.contains(r0)
                    if (r0 != 0) goto L40
                    goto L41
                L40:
                    r12 = 0
                L41:
                    if (r12 == 0) goto L4d
                    java.lang.String r0 = r2
                    if (r0 == 0) goto L4d
                    java.lang.String r12 = r2
                    boolean r12 = r13.endsWith(r12)
                L4d:
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.f.AnonymousClass1.accept(java.io.File, java.lang.String):boolean");
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull File[] fileArr) {
        Object[] objArr = {fileArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07735254e9306edbb164041310fc522e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07735254e9306edbb164041310fc522e");
            return;
        }
        for (File file : fileArr) {
            if (file.getName().endsWith(".prepare")) {
                try {
                    file.renameTo(new File(file.getAbsolutePath().replace(".prepare", ".crash")));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(@NonNull File[] fileArr) {
        Object[] objArr = {fileArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62c6f8d79bb7ec3393cbb859251c70d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62c6f8d79bb7ec3393cbb859251c70d");
            return;
        }
        for (File file : fileArr) {
            if (file.getName().endsWith(".anr")) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(File[] fileArr) {
        Object[] objArr = {fileArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf250afcc5eb69ca8b35b6d8adc1d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf250afcc5eb69ca8b35b6d8adc1d72");
            return;
        }
        for (File file : fileArr) {
            String name = file.getName();
            if (!name.endsWith(".stderr") && !name.endsWith(".crash") && !name.endsWith(".anr") && !name.endsWith(".prepare") && !name.endsWith(".fd") && !name.endsWith(".hprof") && !name.endsWith(".memory") && !name.endsWith(".thread") && !name.endsWith(".pages") && !name.endsWith(".steps")) {
                e(file.getAbsolutePath());
            }
        }
    }
}
