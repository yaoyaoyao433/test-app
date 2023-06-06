package com.sankuai.meituan.so.loader;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        File file;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipFile zipFile = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cdc19c00ee247408d419cbaf89bf4b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cdc19c00ee247408d419cbaf89bf4b9")).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                file = new File(str);
            } catch (Exception e) {
                e = e;
            }
            if (!file.exists()) {
                e.a("so-loader", str + " is not exist.", new Object[0]);
                return false;
            }
            ZipFile zipFile2 = new ZipFile(file);
            try {
            } catch (Exception e2) {
                zipFile = zipFile2;
                e = e2;
                e.a("so-loader", e.getMessage(), new Object[0]);
                if (zipFile != null) {
                    zipFile.close();
                }
                return false;
            } catch (Throwable th) {
                zipFile = zipFile2;
                th = th;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            if (zipFile2.getEntry("42b60d44456a45468a60a45015e28254.properties") != null) {
                try {
                    zipFile2.close();
                } catch (Exception unused2) {
                }
                return true;
            }
            zipFile2.close();
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.sankuai.meituan.so.loader.b] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static b b(String str) {
        Throwable th;
        JarFile jarFile;
        Exception e;
        b bVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        JarFile jarFile2 = null;
        ArrayList arrayList = null;
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1bc98a103e60e16fa7e35242bb4db764", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bc98a103e60e16fa7e35242bb4db764");
        }
        try {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    File file = new File(str);
                    if (!file.exists()) {
                        e.a("so-loader", str + " is not exist.", new Object[0]);
                        return null;
                    }
                    jarFile = new JarFile(file);
                    try {
                        try {
                            Enumeration<JarEntry> entries = jarFile.entries();
                            if (entries != null) {
                                bVar = new b();
                                ArrayList arrayList2 = null;
                                boolean z = false;
                                while (entries.hasMoreElements()) {
                                    try {
                                        JarEntry nextElement = entries.nextElement();
                                        if (nextElement != null) {
                                            String name = nextElement.getName();
                                            if (!TextUtils.isEmpty(name)) {
                                                e.b("so-loader", name, new Object[0]);
                                                if (!nextElement.isDirectory()) {
                                                    if (name.endsWith(".properties") && "42b60d44456a45468a60a45015e28254.properties".equals(name)) {
                                                        z = true;
                                                    }
                                                    File file2 = new File(name);
                                                    if (file2.getParentFile() != null) {
                                                        if (file2.getParent().contains(APKStructure.Assets_Type)) {
                                                            if (arrayList == null) {
                                                                arrayList = new ArrayList();
                                                            }
                                                            String substring = name.substring(name.indexOf(APKStructure.Assets_Type) + 7);
                                                            if (!arrayList.contains(substring)) {
                                                                arrayList.add(substring);
                                                            }
                                                        }
                                                        if (name.endsWith(".so") && !TextUtils.isEmpty(file2.getParentFile().getName())) {
                                                            if (arrayList2 == null) {
                                                                arrayList2 = new ArrayList();
                                                            }
                                                            if (!arrayList2.contains(file2.getParentFile().getName())) {
                                                                arrayList2.add(file2.getParentFile().getName());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        jarFile2 = jarFile;
                                        changeQuickRedirect2 = bVar;
                                        e.a("so-loader", e.getMessage(), new Object[0]);
                                        if (jarFile2 != null) {
                                            jarFile2.close();
                                        }
                                        return changeQuickRedirect2;
                                    }
                                }
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    bVar.c = true;
                                    bVar.e = arrayList;
                                }
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    bVar.b = true;
                                    bVar.d = arrayList2;
                                }
                                if (bVar.b || bVar.c) {
                                    bVar.a = z;
                                }
                                jarFile.close();
                            }
                            try {
                                jarFile.close();
                            } catch (Exception unused) {
                            }
                            return null;
                        } catch (Exception e3) {
                            e = e3;
                            bVar = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (jarFile != null) {
                            try {
                                jarFile.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    changeQuickRedirect2 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                jarFile = null;
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
        if (r0 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r12, java.io.File r13, java.lang.String r14) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.so.loader.f.a
            java.lang.String r11 = "9ebff11f5efb8d527fe7882096097756"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L24:
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lc2
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lba java.lang.Exception -> Lc2
            java.util.Enumeration r12 = r0.entries()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r12 == 0) goto Lb4
            r1 = r2
        L30:
            boolean r3 = r12.hasMoreElements()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r12.nextElement()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.util.jar.JarEntry r3 = (java.util.jar.JarEntry) r3     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            r4.<init>(r13, r5)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r5 == 0) goto L30
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.lang.String r6 = "../"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r5 != 0) goto L30
            boolean r5 = r3.isDirectory()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r5 != 0) goto L30
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            boolean r5 = android.text.TextUtils.equals(r5, r14)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r5 != 0) goto L77
            java.lang.String r5 = r4.getParent()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.lang.String r6 = "assets"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r5 == 0) goto L30
        L77:
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r5 != 0) goto L88
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            r5.mkdirs()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
        L88:
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r5 == 0) goto L91
            r4.delete()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
        L91:
            java.io.InputStream r3 = r0.getInputStream(r3)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            boolean r8 = a(r3, r4)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r8 == 0) goto Lae
            java.io.File r3 = r4.getParentFile()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            boolean r3 = android.text.TextUtils.equals(r3, r14)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            if (r3 == 0) goto L30
            java.lang.String r1 = r4.getParent()     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lc3
            goto L30
        Lae:
            if (r8 == 0) goto Lb4
            r0.close()     // Catch: java.lang.Exception -> Lb3
        Lb3:
            return r1
        Lb4:
            r0.close()     // Catch: java.lang.Exception -> Lc6
            goto Lc6
        Lb8:
            r12 = move-exception
            goto Lbc
        Lba:
            r12 = move-exception
            r0 = r2
        Lbc:
            if (r0 == 0) goto Lc1
            r0.close()     // Catch: java.lang.Exception -> Lc1
        Lc1:
            throw r12
        Lc2:
            r0 = r2
        Lc3:
            if (r0 == 0) goto Lc6
            goto Lb4
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.so.loader.f.a(java.io.File, java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.io.File r12, java.io.File r13, java.lang.String r14) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.so.loader.f.a
            java.lang.String r11 = "504f00ae49f5efefecc648c6df0a32c9"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L24:
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb5
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb5
            java.util.Enumeration r12 = r0.entries()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r12 == 0) goto La0
            r1 = r2
        L30:
            boolean r3 = r12.hasMoreElements()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r3 == 0) goto La1
            java.lang.Object r3 = r12.nextElement()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            java.util.jar.JarEntry r3 = (java.util.jar.JarEntry) r3     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            r4.<init>(r13, r5)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r5 == 0) goto L30
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            java.lang.String r6 = "../"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r5 != 0) goto L30
            boolean r5 = r3.isDirectory()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r5 != 0) goto L30
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            java.lang.String r6 = ".so"
            boolean r5 = r5.endsWith(r6)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r5 == 0) goto L30
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            boolean r5 = android.text.TextUtils.equals(r5, r14)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r5 == 0) goto L30
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r5 != 0) goto L88
            java.io.File r5 = r4.getParentFile()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            r5.mkdirs()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
        L88:
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r5 == 0) goto L91
            r4.delete()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
        L91:
            java.io.InputStream r3 = r0.getInputStream(r3)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            boolean r8 = a(r3, r4)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            if (r8 == 0) goto La1
            java.lang.String r1 = r4.getParent()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lb6
            goto L30
        La0:
            r1 = r2
        La1:
            if (r8 == 0) goto La7
            r0.close()     // Catch: java.lang.Exception -> La6
        La6:
            return r1
        La7:
            r0.close()     // Catch: java.lang.Exception -> Lb9
            goto Lb9
        Lab:
            r12 = move-exception
            goto Laf
        Lad:
            r12 = move-exception
            r0 = r2
        Laf:
            if (r0 == 0) goto Lb4
            r0.close()     // Catch: java.lang.Exception -> Lb4
        Lb4:
            throw r12
        Lb5:
            r0 = r2
        Lb6:
            if (r0 == 0) goto Lb9
            goto La7
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.so.loader.f.b(java.io.File, java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if (r0 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.File r12, java.io.File r13) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.so.loader.f.a
            java.lang.String r11 = "84ef2ae3a9bf6bfee5052f436c7813d2"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L25:
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La1
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La1
            java.util.Enumeration r12 = r0.entries()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r12 == 0) goto L93
            r1 = 0
        L31:
            boolean r2 = r12.hasMoreElements()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r12.nextElement()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            java.util.jar.JarEntry r2 = (java.util.jar.JarEntry) r2     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            r3.<init>(r13, r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r4 == 0) goto L31
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            java.lang.String r5 = "../"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r4 != 0) goto L31
            boolean r4 = r2.isDirectory()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r4 != 0) goto L31
            java.lang.String r4 = r3.getParent()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            java.lang.String r5 = "assets"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r4 == 0) goto L31
            java.io.File r1 = r3.getParentFile()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r1 != 0) goto L7b
            java.io.File r1 = r3.getParentFile()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            r1.mkdirs()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
        L7b:
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r1 == 0) goto L84
            r3.delete()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
        L84:
            java.io.InputStream r1 = r0.getInputStream(r2)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            boolean r1 = a(r1, r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> La2
            if (r1 == 0) goto L8f
            goto L31
        L8f:
            r0.close()     // Catch: java.lang.Exception -> L92
        L92:
            return r1
        L93:
            r0.close()     // Catch: java.lang.Exception -> La5
            goto La5
        L97:
            r12 = move-exception
            goto L9b
        L99:
            r12 = move-exception
            r0 = r2
        L9b:
            if (r0 == 0) goto La0
            r0.close()     // Catch: java.lang.Exception -> La0
        La0:
            throw r12
        La1:
            r0 = r2
        La2:
            if (r0 == 0) goto La5
            goto L93
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.so.loader.f.a(java.io.File, java.io.File):boolean");
    }

    private static boolean a(InputStream inputStream, File file) {
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {inputStream, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedOutputStream bufferedOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae891bda8ad7336f5f3d97e90d4f7971", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae891bda8ad7336f5f3d97e90d4f7971")).booleanValue();
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                bufferedOutputStream.close();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                return true;
            } catch (Exception unused3) {
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused6) {
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused7) {
                    }
                }
                throw th;
            }
        } catch (Exception unused8) {
            bufferedOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean c(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc2afc00eb87fae30be6b573c5c6ae8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc2afc00eb87fae30be6b573c5c6ae8d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && (listFiles = file.listFiles(new FileFilter() { // from class: com.sankuai.meituan.so.loader.f.1
            public static ChangeQuickRedirect a;

            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                Object[] objArr2 = {file2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6ed70b70fba36ad85d3538111461afa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6ed70b70fba36ad85d3538111461afa")).booleanValue() : file2 != null && file2.exists() && file2.getName().endsWith(".so");
            }
        })) != null && listFiles.length > 0;
    }

    public static void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7ee23987c2b7cfd32b133aae5e83a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7ee23987c2b7cfd32b133aae5e83a21");
        } else if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles == null) {
                            return;
                        }
                        for (File file2 : listFiles) {
                            a(file2);
                        }
                    }
                    file.delete();
                }
            } catch (Exception unused) {
            }
        }
    }
}
