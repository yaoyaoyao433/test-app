package com.sankuai.waimai.lottie;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private final File c;
    private HashMap<String, a> d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83c15f4c89548a066e49fdd9944f186", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83c15f4c89548a066e49fdd9944f186");
            return;
        }
        this.d = new HashMap<>();
        this.c = q.a(com.meituan.android.singleton.b.a, "wm_platform", "lottie", u.e);
        if (this.c.exists()) {
            return;
        }
        this.c.getParentFile().mkdirs();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48d839024fba5e578fd9144fe18d99df", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48d839024fba5e578fd9144fe18d99df");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad68ee797d8cd3fb4e8438923f71600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad68ee797d8cd3fb4e8438923f71600");
        } else if (list != null && list.size() != 0) {
            for (String str : list) {
                a(str).a();
            }
        }
    }

    @NonNull
    public final a a(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00eaec1090d9bcf96d5f903a8fd4cbb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00eaec1090d9bcf96d5f903a8fd4cbb3");
        }
        String b2 = b(str);
        synchronized (this.d) {
            if (this.d.containsKey(b2)) {
                aVar = this.d.get(b2);
            } else {
                a aVar2 = new a(this.c, str, b2);
                this.d.put(b2, aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50df04bb4e2347d2f0b3deb35bd0d9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50df04bb4e2347d2f0b3deb35bd0d9b");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return okio.f.a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).f();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "560d24c76333fd4a2d03c4678768caa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "560d24c76333fd4a2d03c4678768caa2");
        } else if (file != null && file.exists()) {
            com.sankuai.waimai.foundation.utils.log.a.b("Lottie", "删除缓存文件：" + file.getName(), new Object[0]);
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (file2.isDirectory()) {
                    b(file2);
                }
            }
            file.delete();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        final File c;

        public a(File file, String str, String str2) {
            Object[] objArr = {file, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403546df7ca4c8cfffe16cddf7d96a5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403546df7ca4c8cfffe16cddf7d96a5f");
            } else {
                this.c = new File(file, str2);
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47551003abae5448fa063f80ce52d3d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47551003abae5448fa063f80ce52d3d6");
            } else {
                b.b(this.c);
            }
        }

        private File a(String str, String str2) {
            File[] listFiles;
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef3b7f3016bfddb209132fe1b4cc35c", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef3b7f3016bfddb209132fe1b4cc35c");
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return null;
            }
            File file = new File(str);
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                return null;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    File a2 = a(file2.getAbsolutePath(), str2);
                    if (a2 != null) {
                        return a2;
                    }
                } else if (file2.isFile() && str2.equals(file2.getName())) {
                    return file2;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String a(String str) throws IOException {
            File a2;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "092198f97f81b8a15dad145679d6ee92", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "092198f97f81b8a15dad145679d6ee92");
            }
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (TextUtils.isEmpty(str)) {
                        a2 = new File(this.c, "data.json");
                    } else {
                        a2 = a(this.c.getAbsolutePath(), str);
                    }
                    if (a2 != null && a2.exists()) {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(a2));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader2.readLine();
                                if (readLine != null) {
                                    sb.append(readLine);
                                } else {
                                    String sb2 = sb.toString();
                                    try {
                                        bufferedReader2.close();
                                        return sb2;
                                    } catch (IOException e) {
                                        throw e;
                                    }
                                }
                            }
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e3) {
                                    throw e3;
                                }
                            }
                            throw th;
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                throw e4;
            }
        }

        public final boolean a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3442c4f18bc16cdd3cf551c9501031a7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3442c4f18bc16cdd3cf551c9501031a7")).booleanValue();
            }
            if (!q.a(com.meituan.android.singleton.b.a, str3, 1).a(str2)) {
                a();
                return false;
            } else if (TextUtils.isEmpty(str)) {
                return new File(this.c, "data.json").exists();
            } else {
                File a2 = a(this.c.getAbsolutePath(), str);
                return a2 != null && a2.exists();
            }
        }
    }
}
