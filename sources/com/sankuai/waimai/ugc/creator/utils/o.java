package com.sankuai.waimai.ugc.creator.utils;

import android.content.Context;
import android.media.MediaExtractor;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o {
    public static ChangeQuickRedirect a;

    public static long a(String str, String str2) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7570a1d51db54de2658bca63e20af4b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7570a1d51db54de2658bca63e20af4b5")).longValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0L;
        }
        DioFile dioFile = new DioFile(str);
        if (!dioFile.c()) {
            return 0L;
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        try {
            inputStream = dioFile.b();
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    long length = file.length();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return length;
                } catch (Exception unused) {
                    fileOutputStream2 = fileOutputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return 0L;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a595581e6af00f5c2807cb9c5e689201", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a595581e6af00f5c2807cb9c5e689201")).booleanValue() : !com.sankuai.waimai.foundation.utils.f.a(context);
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79ea5f35e1d25bf6e9d6b62e478dc87c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79ea5f35e1d25bf6e9d6b62e478dc87c");
        }
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            return com.dianping.video.videofilter.transcoder.utils.b.a(mediaExtractor).c.getString(IMediaFormat.KEY_MIME, "");
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ce6c9173a0f41bb04873bd27802e91e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ce6c9173a0f41bb04873bd27802e91e")).booleanValue() : "video/dolby-vision".equals(str);
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "745a2eca13c871812950869fc9078220", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "745a2eca13c871812950869fc9078220");
        }
        File a2 = q.a(b.a, "mtplatform_mmp", "hera", u.e);
        File file = new File(a2, "app" + File.separator + "mmp_87dffc23944d" + File.separator + "temp");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str).getAbsolutePath();
    }
}
