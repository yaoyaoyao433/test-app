package com.meituan.msi.api.capturescreen;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.provider.b;
import com.meituan.msi.util.f;
import com.meituan.msi.util.h;
import com.meituan.msi.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CaptureScreenApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "capture", request = CaptureScreenParam.class, response = CaptureScreenResponse.class)
    public void captureScreen(CaptureScreenParam captureScreenParam, MsiContext msiContext) {
        boolean z = false;
        Object[] objArr = {captureScreenParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffe88fe9b98048f1d86b2118935a179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffe88fe9b98048f1d86b2118935a179");
            return;
        }
        Activity activity = msiContext.getActivity();
        if (!d.b.RESUMED.equals(msiContext.getLifecycleState()) || activity == null) {
            msiContext.onError("应用程序在后台或者activity不存在，无法截屏");
            return;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6eb04695400ff1ac55cacbef65d6ceff", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6eb04695400ff1ac55cacbef65d6ceff")).booleanValue();
        } else if (activity == null || activity.isFinishing() || (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed())) {
            z = true;
        }
        if (z) {
            msiContext.onError("无法获取页面");
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        Bitmap drawingCache = decorView.getDrawingCache();
        if (TextUtils.equals("part", captureScreenParam.mode) && captureScreenParam.area != null) {
            double d = a.f().getResources().getDisplayMetrics().density;
            try {
                a(msiContext, Bitmap.createBitmap(drawingCache, (int) (captureScreenParam.area.left * d), (int) ((captureScreenParam.area.top * d) + f.b(a.f())), (int) Math.round((captureScreenParam.area.right - captureScreenParam.area.left) * d), (int) Math.round((captureScreenParam.area.bottom - captureScreenParam.area.top) * d)));
                return;
            } catch (Exception unused) {
                com.meituan.msi.log.a.a("createBitmap fail");
            }
        }
        a(msiContext, drawingCache);
    }

    private void a(final MsiContext msiContext, final Bitmap bitmap) {
        Object[] objArr = {msiContext, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21c39fb962154ed13b3495365abe4f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21c39fb962154ed13b3495365abe4f9");
        } else if (bitmap == null) {
            msiContext.onError("截图失败");
        } else {
            m.b(new Runnable() { // from class: com.meituan.msi.api.capturescreen.CaptureScreenApi.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    FileOutputStream fileOutputStream;
                    Throwable th;
                    Exception e;
                    Closeable[] closeableArr;
                    String b;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "076e625845750733d823927a0b30dbeb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "076e625845750733d823927a0b30dbeb");
                        return;
                    }
                    try {
                        com.meituan.msi.provider.a fileProvider = msiContext.getFileProvider();
                        String a2 = fileProvider.a(UUID.randomUUID().toString() + ".png", 0);
                        fileOutputStream = new FileOutputStream(new File(fileProvider.b(), a2));
                        try {
                            try {
                                bitmap.compress(Bitmap.CompressFormat.PNG, 95, fileOutputStream);
                                CaptureScreenResponse captureScreenResponse = new CaptureScreenResponse();
                                if (fileProvider instanceof b) {
                                    b = "msifile://" + a2;
                                } else {
                                    b = fileProvider.b(a2);
                                }
                                captureScreenResponse.tempFilePath = b;
                                msiContext.onSuccess(captureScreenResponse);
                                msiContext.dispatchEvent("onUserCaptureScreen", "");
                                closeableArr = new Closeable[]{fileOutputStream};
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                                com.meituan.msi.log.a.a("保存图片失败");
                                msiContext.onError("保存图片失败");
                                closeableArr = new Closeable[]{fileOutputStream};
                                h.a(closeableArr);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            h.a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        fileOutputStream = null;
                        e = e3;
                    } catch (Throwable th3) {
                        fileOutputStream = null;
                        th = th3;
                        h.a(fileOutputStream);
                        throw th;
                    }
                    h.a(closeableArr);
                }
            });
        }
    }
}
