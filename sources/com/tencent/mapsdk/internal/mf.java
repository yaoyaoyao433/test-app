package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mf {
    private static final String a = "tencentmap";
    private static final String b = "/mapsdk_vector/";
    private static String c = null;
    private static String d = null;
    private static String e = "resourceVersion.dat";

    private static InputStream a(Context context, String str, String str2) {
        return b(context, str + str2);
    }

    public static final InputStream b(Context context, String str) {
        AssetManager assets;
        if (context == null || (assets = context.getAssets()) == null) {
            return null;
        }
        try {
            return assets.open(str);
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (kj.a != null) {
                kj.a.d("asset", message, e2);
            } else {
                kj.b("asset", message, e2);
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: IOException -> 0x0075, all -> 0x00fa, TRY_ENTER, TryCatch #4 {IOException -> 0x0075, blocks: (B:6:0x0025, B:8:0x0029, B:10:0x002f, B:12:0x0037, B:37:0x00ad, B:39:0x00b3, B:41:0x00bb, B:13:0x004d, B:15:0x0051, B:17:0x0057, B:19:0x005f), top: B:69:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r6, com.tencent.mapsdk.internal.me r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.mf.a(android.content.Context, com.tencent.mapsdk.internal.me, java.lang.String, java.lang.String):void");
    }

    public static void a(me meVar, String str) {
        String str2;
        String str3;
        if (b(meVar, str)) {
            File file = new File(str, eh.b);
            String a2 = meVar.a("indoormap_style_md5");
            if (!TextUtils.isEmpty(a2)) {
                kj.b(ki.f, "校验文件:indoor_style.dat");
                try {
                    str3 = ks.a(file);
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                    str3 = null;
                }
                if (!TextUtils.equals(str3, a2)) {
                    kj.b(ki.f, "文件md5校验失败:" + str3 + CommonConstant.Symbol.COMMA + str3);
                    file.delete();
                    meVar.a(new String[]{"indoormap_style_version", "indoormap_style_md5"});
                }
            }
            File file2 = new File(str, eh.c);
            String a3 = meVar.a("indoormap_style_night_md5");
            if (!TextUtils.isEmpty(a3)) {
                kj.b(ki.f, "校验文件:indoor_style_night.dat");
                try {
                    str2 = ks.a(file2);
                } catch (FileNotFoundException e3) {
                    e3.printStackTrace();
                    str2 = null;
                }
                if (!TextUtils.equals(str2, a3)) {
                    kj.b(ki.f, "文件md5校验失败:" + str2 + CommonConstant.Symbol.COMMA + a3);
                    file2.delete();
                    meVar.a(new String[]{"indoormap_style_night_version", "indoormap_style_night_md5"});
                }
            }
            File file3 = new File(str, eh.e);
            String a4 = meVar.a(ej.y);
            if (TextUtils.isEmpty(a4)) {
                return;
            }
            try {
                if (TextUtils.equals(ks.a(file3), a4)) {
                    return;
                }
                file3.delete();
                meVar.a(new String[]{ej.s, ej.y});
            } catch (FileNotFoundException e4) {
                kj.b("config error: ", e4);
                meVar.a(new String[]{ej.s, ej.y});
            }
        }
    }

    private static boolean b(me meVar, String str) {
        File file = new File(str, eh.a);
        String a2 = meVar.a(ej.t);
        if (file.exists() || !TextUtils.isEmpty(a2)) {
            try {
                if (TextUtils.equals(ks.a(file), a2)) {
                    return true;
                }
                file.delete();
                meVar.a();
                return false;
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                meVar.a();
                return false;
            }
        }
        return true;
    }

    private static void c(me meVar, String str) {
        String str2;
        String str3;
        File file = new File(str, eh.b);
        String a2 = meVar.a("indoormap_style_md5");
        if (!TextUtils.isEmpty(a2)) {
            kj.b(ki.f, "校验文件:indoor_style.dat");
            try {
                str3 = ks.a(file);
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                str3 = null;
            }
            if (!TextUtils.equals(str3, a2)) {
                kj.b(ki.f, "文件md5校验失败:" + str3 + CommonConstant.Symbol.COMMA + str3);
                file.delete();
                meVar.a(new String[]{"indoormap_style_version", "indoormap_style_md5"});
            }
        }
        File file2 = new File(str, eh.c);
        String a3 = meVar.a("indoormap_style_night_md5");
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        kj.b(ki.f, "校验文件:indoor_style_night.dat");
        try {
            str2 = ks.a(file2);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            str2 = null;
        }
        if (TextUtils.equals(str2, a3)) {
            return;
        }
        kj.b(ki.f, "文件md5校验失败:" + str2 + CommonConstant.Symbol.COMMA + a3);
        file2.delete();
        meVar.a(new String[]{"indoormap_style_night_version", "indoormap_style_night_md5"});
    }

    private static void d(me meVar, String str) {
        File file = new File(str, eh.e);
        String a2 = meVar.a(ej.y);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            if (TextUtils.equals(ks.a(file), a2)) {
                return;
            }
            file.delete();
            meVar.a(new String[]{ej.s, ej.y});
        } catch (FileNotFoundException e2) {
            kj.b("config error: ", e2);
            meVar.a(new String[]{ej.s, ej.y});
        }
    }

    private static boolean a(Context context, me meVar, String str, String str2, boolean z) {
        String str3;
        String str4;
        if (meVar == null || (meVar instanceof mg)) {
            return false;
        }
        InputStream inputStream = null;
        if (str2.startsWith(eh.i)) {
            str3 = eh.i;
            str4 = ej.a;
        } else if (str2.startsWith(eh.j)) {
            str3 = eh.j;
            str4 = ej.d;
        } else if (str2.startsWith("poi_icon")) {
            str3 = "poi_icon";
            str4 = ej.c;
        } else {
            str3 = null;
            str4 = null;
        }
        if (str3 == null) {
            return false;
        }
        int b2 = meVar.b(str4);
        String str5 = str + e;
        try {
            try {
                inputStream = z ? b(context, str5) : kd.b(str5);
                if (inputStream == null) {
                    kd.a((Closeable) inputStream);
                    return false;
                }
                byte[] b3 = kd.b(inputStream);
                if (b3 == null) {
                    kd.a((Closeable) inputStream);
                    return false;
                }
                int optInt = new JSONObject(new String(b3)).optInt(str3, -1);
                if (optInt == -1) {
                    kd.a((Closeable) inputStream);
                    return false;
                } else if (optInt <= b2) {
                    kd.a((Closeable) inputStream);
                    return false;
                } else {
                    meVar.a(new String[]{str4});
                    kd.a((Closeable) inputStream);
                    return true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                kd.a((Closeable) inputStream);
                return false;
            }
        } catch (Throwable th) {
            kd.a((Closeable) inputStream);
            throw th;
        }
    }

    private static void a(String str) {
        if (str == null || str.trim().length() == 0) {
            return;
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        c = str;
    }

    private static void b(String str) {
        if (str == null || str.trim().length() == 0) {
            return;
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        d = str;
    }

    public static String a() {
        return c;
    }

    public static String b() {
        return d;
    }

    public static void a(TencentMapOptions tencentMapOptions) {
        String customLocalPath;
        if (tencentMapOptions != null) {
            if (tencentMapOptions.getCustomAssetsPath() != null) {
                String customAssetsPath = tencentMapOptions.getCustomAssetsPath();
                if (customAssetsPath == null || customAssetsPath.trim().length() == 0) {
                    return;
                }
                if (!customAssetsPath.endsWith(File.separator)) {
                    customAssetsPath = customAssetsPath + File.separator;
                }
                c = customAssetsPath;
            } else if (tencentMapOptions.getCustomLocalPath() == null || (customLocalPath = tencentMapOptions.getCustomLocalPath()) == null || customLocalPath.trim().length() == 0) {
            } else {
                if (!customLocalPath.endsWith(File.separator)) {
                    customLocalPath = customLocalPath + File.separator;
                }
                d = customLocalPath;
            }
        }
    }

    public static final InputStream a(Context context, String str) {
        return b(context, gy.d + str);
    }
}
