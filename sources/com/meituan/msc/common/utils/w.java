package com.meituan.msc.common.utils;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RequiresApi;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msc.extern.IApiCallback;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.AbsApi;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w {
    public static ChangeQuickRedirect a;
    public static Handler b = new Handler(Looper.getMainLooper());

    public static void a(final Activity activity, final String str, IApiCallback iApiCallback, final String str2) {
        Object[] objArr = {activity, str, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04aeeb5350b0f3bb18d8d0f012a7c835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04aeeb5350b0f3bb18d8d0f012a7c835");
        } else if (!com.meituan.msi.privacy.permission.a.a(MSCEnvHelper.getContext(), PermissionGuard.PERMISSION_STORAGE_WRITE, str2)) {
            Privacy.createPermissionGuard().a(activity, PermissionGuard.PERMISSION_STORAGE_WRITE, str2, new com.meituan.android.privacy.interfaces.d() { // from class: com.meituan.msc.common.utils.w.1
                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str3, int i) {
                }
            });
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            com.meituan.msc.common.executor.a.b.submit(new Runnable() { // from class: com.meituan.msc.common.utils.w.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51678dfc73d9468ab5e1d97faae9c89b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51678dfc73d9468ab5e1d97faae9c89b");
                    } else {
                        w.b(str, activity, r3, str2);
                    }
                }
            });
        } else {
            b(str, activity, null, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Activity activity, IApiCallback iApiCallback, String str2) {
        boolean a2;
        Object[] objArr = {str, activity, iApiCallback, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ff4245058b6d7258fc39e971882501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ff4245058b6d7258fc39e971882501");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            if (!r.a()) {
                a(iApiCallback, "Class:ImageModule Api:saveImageToPhotosAlbum failed");
                return;
            }
            if (i.a()) {
                a2 = a(activity, fileInputStream, str, iApiCallback, str2);
            } else {
                a2 = a(activity, fileInputStream);
            }
            if (a2) {
                a(iApiCallback);
            } else {
                a(iApiCallback, (String) null);
            }
        } catch (FileNotFoundException e) {
            a(iApiCallback, e.toString());
        }
    }

    @RequiresApi(api = 29)
    private static boolean a(Activity activity, InputStream inputStream, String str, IApiCallback iApiCallback, String str2) {
        Object[] objArr = {activity, inputStream, str, iApiCallback, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6597e4d8f6b2f4af50757cb56e76c353", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6597e4d8f6b2f4af50757cb56e76c353")).booleanValue();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options);
        String str3 = options.outMimeType;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (fileInputStream == null) {
            a(iApiCallback, "Class:ImageModule Api:saveImageToPhotosAlbum getInputStream failed");
            return false;
        }
        return r.a(activity, fileInputStream, str3, new File(str).getName(), true, str2);
    }

    private static boolean a(Activity activity, InputStream inputStream) {
        Object[] objArr = {activity, inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "815fbb88c15a480d5a51d4c45e9e6df3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "815fbb88c15a480d5a51d4c45e9e6df3")).booleanValue();
        }
        String format = String.format("%s_%s%s", AbsApiFactory.PASSPORT_ONLINE_URL, Long.toHexString(new Date().getTime()), ".png");
        File file = new File(new File(e.c(activity, "Pictures").getAbsolutePath() + File.separator + AbsApiFactory.PASSPORT_ONLINE_URL), format);
        if (file.exists()) {
            file.delete();
        }
        r.c(file);
        boolean a2 = r.a(inputStream, file.getAbsolutePath());
        activity.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file)));
        return a2;
    }

    private static void a(final IApiCallback iApiCallback, final String str) {
        Object[] objArr = {iApiCallback, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9772a6654d75d841f660da42cdfc9feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9772a6654d75d841f660da42cdfc9feb");
        } else if (iApiCallback == null) {
            aw.a("图片保存失败", new Object[0]);
        } else {
            b.post(new Runnable() { // from class: com.meituan.msc.common.utils.w.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18845a3efe7805d8d7f8581f18fd5e39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18845a3efe7805d8d7f8581f18fd5e39");
                    } else {
                        IApiCallback.this.onFail(AbsApi.codeJson(-1, str));
                    }
                }
            });
        }
    }

    private static void a(final IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7d570cfee3d361a0667f80f44e399f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7d570cfee3d361a0667f80f44e399f7");
        } else if (iApiCallback == null) {
            aw.a("图片已保存", new Object[0]);
        } else {
            b.post(new Runnable() { // from class: com.meituan.msc.common.utils.w.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e7ce92570d7c9611f8283846ac65724", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e7ce92570d7c9611f8283846ac65724");
                    } else {
                        IApiCallback.this.onSuccess(null);
                    }
                }
            });
        }
    }
}
