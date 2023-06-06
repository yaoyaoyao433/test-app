package com.meituan.android.soloader;

import android.os.StrictMode;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends m {
    public static ChangeQuickRedirect d;
    protected final File e;
    protected final int f;

    public e(File file, int i) {
        Object[] objArr = {file, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be690ee907370aef2355498c383f7dc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be690ee907370aef2355498c383f7dc1");
            return;
        }
        this.e = file;
        this.f = i;
    }

    @Override // com.meituan.android.soloader.m
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        Object[] objArr = {str, Integer.valueOf(i), threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f63aaa03ae2f08337fc695b8e4ce5c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f63aaa03ae2f08337fc695b8e4ce5c")).intValue() : a(str, i, this.e, threadPolicy);
    }

    public final int a(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        Object[] objArr = {str, Integer.valueOf(i), file, threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e63e35ac51b70541a5bc9767dff3e05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e63e35ac51b70541a5bc9767dff3e05")).intValue();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found on ");
            sb.append(file.getCanonicalPath());
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" found on ");
        sb2.append(file.getCanonicalPath());
        if ((i & 1) != 0 && (this.f & 2) != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" loaded implicitly");
            return 2;
        }
        if ((this.f & 1) != 0) {
            a(file2, i, threadPolicy);
        } else {
            new StringBuilder("Not resolving dependencies for ").append(str);
        }
        try {
            k.d.a(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            if (e.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e;
        }
    }

    private void a(File file, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        Object[] objArr = {file, Integer.valueOf(i), threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0a0bfae1c3dd728998a3b9dfcda1c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0a0bfae1c3dd728998a3b9dfcda1c8");
            return;
        }
        String[] a = a(file);
        new StringBuilder("Loading lib dependencies: ").append(Arrays.toString(a));
        for (String str : a) {
            if (!str.startsWith("/")) {
                k.a(str, i | 1, threadPolicy);
            }
        }
    }

    public static String[] a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fa05d8fb621d63514220720fa52dd0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fa05d8fb621d63514220720fa52dd0c");
        }
        if (k.b) {
            a.a("SoLoader.getElfDependencies[" + file.getName() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
        try {
            return i.a(file);
        } finally {
            if (k.b) {
                a.a();
            }
        }
    }

    @Override // com.meituan.android.soloader.m
    @Nullable
    public final File a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5de548f07edeab1c1189079da80fb78", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5de548f07edeab1c1189079da80fb78");
        }
        File file = new File(this.e, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // com.meituan.android.soloader.m
    public String toString() {
        String name;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c388c7b360610181e2cbeabaad54632", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c388c7b360610181e2cbeabaad54632");
        }
        try {
            name = String.valueOf(this.e.getCanonicalPath());
        } catch (IOException unused) {
            name = this.e.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f + ']';
    }
}
