package com.meituan.android.cipstorage;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class al {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, a> b = new HashMap<>();

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9359f82e413e970e5507909b69cca99", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9359f82e413e970e5507909b69cca99");
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return b(context, str).a();
    }

    public static boolean a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aad681e4a7f231666e140259252f286d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aad681e4a7f231666e140259252f286d")).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        a b2 = b(context, str);
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        return PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "07bb85409aac47fcb7543f1cbb6d3ab0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "07bb85409aac47fcb7543f1cbb6d3ab0")).booleanValue() : b2.a(str2, false);
    }

    private static synchronized a b(Context context, String str) {
        synchronized (al.class) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd884404d00d1085b54c709a033c08ab", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd884404d00d1085b54c709a033c08ab");
            }
            if (!b.containsKey(str)) {
                b.put(str, new a(context, str));
            }
            return b.get(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private final Context b;
        private final String c;
        private volatile boolean d;
        private volatile String e;

        private a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5254656063b0a8d63852dec66c15566", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5254656063b0a8d63852dec66c15566");
                return;
            }
            this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            this.c = str;
        }

        String a() {
            InputStream inputStream;
            InputStreamReader inputStreamReader;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dee983b8b9f97b8474517c050848cd04", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dee983b8b9f97b8474517c050848cd04");
            }
            InputStreamReader inputStreamReader2 = null;
            if (this.b == null || TextUtils.isEmpty(this.c)) {
                return null;
            }
            synchronized (this) {
                if (!this.d && this.e == null) {
                    try {
                        File file = new File(this.c);
                        if (!file.exists()) {
                            a(null);
                            a(null);
                            return null;
                        }
                        com.meituan.android.cipstorage.a aVar = new com.meituan.android.cipstorage.a(file);
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.cipstorage.a.a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ac1eed4f7e01e6048828ae8efdc71327", RobustBitConfig.DEFAULT_VALUE)) {
                            inputStream = (FileInputStream) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ac1eed4f7e01e6048828ae8efdc71327");
                        } else {
                            if (aVar.c.exists()) {
                                aVar.b.delete();
                                aVar.c.renameTo(aVar.b);
                            }
                            inputStream = new FileInputStream(aVar.b);
                        }
                        try {
                            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                            try {
                                StringBuilder sb = new StringBuilder();
                                char[] cArr = new char[16384];
                                while (true) {
                                    int read = inputStreamReader.read(cArr);
                                    if (read == -1) {
                                        String sb2 = sb.toString();
                                        a(inputStreamReader);
                                        a(inputStream);
                                        return sb2;
                                    }
                                    sb.append(cArr, 0, read);
                                }
                            } catch (IOException unused) {
                                a(inputStreamReader);
                                a(inputStream);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                inputStreamReader2 = inputStreamReader;
                                a(inputStreamReader2);
                                a(inputStream);
                                throw th;
                            }
                        } catch (IOException unused2) {
                            inputStreamReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException unused3) {
                        inputStream = null;
                        inputStreamReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                }
                return this.e;
            }
        }

        boolean a(String str, boolean z) {
            boolean z2;
            com.meituan.android.cipstorage.a aVar;
            OutputStreamWriter outputStreamWriter;
            File file;
            boolean exists;
            Object[] objArr = {str, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61e5ae0aae693a2e2cd4c04aa62f33d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61e5ae0aae693a2e2cd4c04aa62f33d")).booleanValue();
            }
            if (this.b == null || TextUtils.isEmpty(this.c)) {
                return false;
            }
            synchronized (this) {
                if (str == null) {
                    try {
                        if (!this.d) {
                            this.d = true;
                            z2 = true;
                            this.e = str;
                        }
                    } finally {
                    }
                }
                if (this.e != str) {
                    this.d = false;
                    z2 = true;
                    this.e = str;
                } else {
                    z2 = false;
                    this.e = str;
                }
            }
            if (!z2) {
                return true;
            }
            synchronized (this) {
                FileOutputStream fileOutputStream = null;
                if (this.e == null && str == null && this.d) {
                    this.d = false;
                } else if (this.e != str) {
                    return true;
                } else {
                    this.e = null;
                }
                try {
                    try {
                        file = new File(this.c);
                        exists = file.exists();
                        if (!exists) {
                            if (str == null) {
                                a(null);
                                a(null);
                                return true;
                            }
                            exists = (file.getParentFile().exists() || file.getParentFile().mkdirs()) && file.createNewFile();
                        }
                    } catch (Throwable th) {
                        th = th;
                        outputStreamWriter = null;
                    }
                } catch (IOException unused) {
                    aVar = null;
                    outputStreamWriter = null;
                }
                if (!exists) {
                    a(null);
                    a(fileOutputStream);
                    return false;
                }
                aVar = new com.meituan.android.cipstorage.a(file);
                try {
                    if (str == null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.cipstorage.a.a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b5e5f847179056e5749571ceca6c8476", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b5e5f847179056e5749571ceca6c8476");
                        } else {
                            aVar.b.delete();
                            aVar.c.delete();
                        }
                        a(null);
                        a(null);
                        return true;
                    }
                    FileOutputStream a2 = aVar.a();
                    try {
                        outputStreamWriter = new OutputStreamWriter(a2, "UTF-8");
                        try {
                            try {
                                outputStreamWriter.write(str);
                                outputStreamWriter.flush();
                                Object[] objArr3 = {a2};
                                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cipstorage.a.a;
                                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cdcfd1fdf7d7fbc3414a2717e8e7580e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cdcfd1fdf7d7fbc3414a2717e8e7580e");
                                } else if (a2 != null) {
                                    com.meituan.android.cipstorage.a.a(a2);
                                    try {
                                        a2.close();
                                        aVar.c.delete();
                                    } catch (IOException unused2) {
                                    }
                                }
                                a(outputStreamWriter);
                                a(a2);
                                return true;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = a2;
                                a(outputStreamWriter);
                                a(fileOutputStream);
                                throw th;
                            }
                        } catch (IOException unused3) {
                            fileOutputStream = a2;
                            if (aVar != null) {
                                try {
                                    Object[] objArr4 = {fileOutputStream};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.cipstorage.a.a;
                                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "ed900fae3da5aee25682931da1f4754f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "ed900fae3da5aee25682931da1f4754f");
                                    } else if (fileOutputStream != null) {
                                        com.meituan.android.cipstorage.a.a(fileOutputStream);
                                        try {
                                            fileOutputStream.close();
                                            aVar.b.delete();
                                            aVar.c.renameTo(aVar.b);
                                        } catch (IOException unused4) {
                                            a(outputStreamWriter);
                                            a(fileOutputStream);
                                            return false;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    a(outputStreamWriter);
                                    a(fileOutputStream);
                                    throw th;
                                }
                            }
                            a(outputStreamWriter);
                            a(fileOutputStream);
                            return false;
                        }
                    } catch (IOException unused5) {
                        outputStreamWriter = null;
                    } catch (Throwable th4) {
                        th = th4;
                        outputStreamWriter = null;
                    }
                } catch (IOException unused6) {
                    outputStreamWriter = null;
                }
            }
        }

        private static void a(Closeable closeable) {
            Object[] objArr = {closeable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a53a1729c38aadbd73dd2fd91329b862", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a53a1729c38aadbd73dd2fd91329b862");
            } else if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
