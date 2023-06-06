package com.meituan.android.mrn.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static int b = -1;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bc4588f0b83c39bdaaba9e1767e6375", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bc4588f0b83c39bdaaba9e1767e6375");
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c0b35a1b441438a87ebdcb97c224625", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c0b35a1b441438a87ebdcb97c224625")).intValue();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static Bitmap a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec5ef860bfddf73854651e4e19204eb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec5ef860bfddf73854651e4e19204eb9");
        }
        if (activity == null || activity.getWindow() == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        }
        View decorView = activity.getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
        decorView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private static int b() {
        BufferedReader bufferedReader;
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11a5dd3c2bc6afbe3b0dc46dca973161", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11a5dd3c2bc6afbe3b0dc46dca973161")).intValue();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
        } catch (Exception unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                return 0;
            }
            if (readLine.split("\\s+").length < 2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                return 0;
            }
            int parseInt = (int) (Integer.parseInt(split[1]) / 1024);
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            return parseInt;
        } catch (Exception unused5) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused6) {
                }
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused7) {
                }
            }
            throw th;
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5748bc34f95177824b9b817e09a6995", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5748bc34f95177824b9b817e09a6995")).intValue();
        }
        if (b < 0) {
            b = Math.round(b() / 1000.0f);
        }
        return b;
    }
}
