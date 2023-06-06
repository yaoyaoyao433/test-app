package com.sankuai.waimai.ugc.creator.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eeb2aaeb4461898c72eb914286604fcd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eeb2aaeb4461898c72eb914286604fcd") : new Uri.Builder().scheme("knb-media").authority("client").appendQueryParameter("url", str).build().toString();
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfe3aa56fcb4241736f9a1a945457634", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfe3aa56fcb4241736f9a1a945457634");
        }
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
            File a2 = l.a("wm_ugc_video_" + format + ".mp4", true);
            if (a2 != null) {
                return a2.getAbsolutePath();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24ff045eef8630f568917de9c738fe18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24ff045eef8630f568917de9c738fe18");
        }
        String[] strArr = new String[2];
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
            String str = "wm_ugc_video_" + format + ".mp4";
            File a2 = l.a(str, true);
            File a3 = l.a("wm_ugc_cover_" + format + ".png", true);
            strArr[0] = a2 != null ? a2.getAbsolutePath() : null;
            strArr[1] = a3 != null ? a3.getAbsolutePath() : null;
        } catch (Exception unused) {
        }
        return strArr;
    }

    @Nullable
    public static String a(String str, Bitmap bitmap, int i) {
        Object[] objArr = {str, bitmap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e70ecacee0895c42576a8a08051936f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e70ecacee0895c42576a8a08051936f9");
        }
        if (bitmap == null) {
            return null;
        }
        try {
            File a2 = l.a(str, true);
            if (a2 == null) {
                return null;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(a2));
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            if (str.toLowerCase().endsWith("png")) {
                compressFormat = Bitmap.CompressFormat.PNG;
            }
            bitmap.compress(compressFormat, i > 0 ? i : 100, bufferedOutputStream);
            bitmap.recycle();
            Object[] objArr2 = {bufferedOutputStream};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3167fead5237a2be5a6fe43462b7c8d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3167fead5237a2be5a6fe43462b7c8d4");
            } else {
                try {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                } catch (IOException unused) {
                }
            }
            return a2.getAbsolutePath();
        } catch (Exception unused2) {
            return null;
        }
    }
}
