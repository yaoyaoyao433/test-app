package com.meituan.msc.modules.api.web;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.CookieManager;
import com.dianping.titans.js.jshandler.image.KNBBase64Parser;
import com.meituan.msc.common.utils.ai;
import com.meituan.msc.common.utils.al;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.common.utils.v;
import com.meituan.msc.common.utils.w;
import com.meituan.msc.extern.IApiCallback;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.api.selectedDialog.SelectedDialog;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static String b;

    public static /* synthetic */ void a(Activity activity, String str, IFileModule iFileModule, String str2) {
        Bitmap.CompressFormat compressFormat;
        Object[] objArr = {activity, str, iFileModule, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec1d323020a08bf81dfb3fd310297875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec1d323020a08bf81dfb3fd310297875");
            return;
        }
        int indexOf = str2.indexOf("base64,") + 7;
        String substring = str2.substring(str2.indexOf("image/") + 6, indexOf - 8);
        if (TextUtils.equals(substring, "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else if (TextUtils.equals(substring, CommonConstant.File.JPG) || TextUtils.equals(substring, CommonConstant.File.JPEG)) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else if (TextUtils.equals(substring, "webp")) {
            compressFormat = Bitmap.CompressFormat.WEBP;
        } else {
            aw.a("图片保存失败", new Object[0]);
            g.d("WebLongTapSaveImage", "Parse image failed, the image type needs to be one of png, jpg, jpeg, webp");
            return;
        }
        String substring2 = str2.substring(indexOf);
        File file = new File(iFileModule.c(), Long.toHexString(new Date().getTime()));
        try {
            try {
                byte[] decode = Base64.decode(substring2, 0);
                if (decode == null) {
                    g.d("WebLongTapSaveImage", "Parse image failed, decode base64 and return null, base64:", substring2);
                    v.a(null);
                    return;
                }
                Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsoluteFile());
                try {
                    a2.compress(compressFormat, 100, fileOutputStream2);
                    v.a(fileOutputStream2);
                    w.a(activity, file.getAbsolutePath(), (IApiCallback) null, str);
                } catch (IOException | OutOfMemoryError unused) {
                    fileOutputStream = fileOutputStream2;
                    aw.a("图片保存失败", new Object[0]);
                    v.a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    v.a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | OutOfMemoryError unused2) {
        }
    }

    public static /* synthetic */ void b(final Activity activity, final String str, IFileModule iFileModule, final String str2) {
        Object[] objArr = {activity, str, iFileModule, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e82ba420f5ed6cb4dc6718b07d73cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e82ba420f5ed6cb4dc6718b07d73cb0");
        } else if (TextUtils.isEmpty(str2) || !str2.startsWith("http")) {
            g.d("WebLongTapSaveImage", "Download image failed, imageUrl is null or imageUrl isn't start with http!");
        } else {
            final String c = iFileModule.c();
            Request.Builder url = new Request.Builder().url(str2);
            String cookie = CookieManager.getInstance().getCookie(str2);
            if (!TextUtils.isEmpty(cookie)) {
                url.addHeader("Cookie", cookie);
            }
            al.a().c().newCall(url.build()).enqueue(new Callback() { // from class: com.meituan.msc.modules.api.web.a.2
                public static ChangeQuickRedirect a;

                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    Object[] objArr2 = {call, iOException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "914f6b1ea5ababe7ae37927cee8277c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "914f6b1ea5ababe7ae37927cee8277c7");
                    } else {
                        g.d("WebLongTapSaveImage", "Download image failed", iOException.getMessage());
                    }
                }

                @Override // okhttp3.Callback
                public final void onResponse(Call call, Response response) throws IOException {
                    File file;
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00501b69716884268d1abe309c328aad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00501b69716884268d1abe309c328aad");
                        return;
                    }
                    String b2 = r.b(response.request().url().encodedPath());
                    if (TextUtils.isEmpty(b2)) {
                        b2 = CommonConstant.Symbol.DOT + ai.b(response.header("Content-Type", ""));
                    }
                    File a2 = r.a(c, r.c(str2), b2);
                    if (!v.a(response.body().byteStream(), a2)) {
                        if (a2 == null || !a2.exists()) {
                            return;
                        }
                        a2.delete();
                        return;
                    }
                    if (a2 == null || !a2.exists()) {
                        file = null;
                    } else {
                        file = new File(c, "tmp_" + r.b(a2) + b2);
                        if (!file.exists()) {
                            a2.renameTo(file);
                        } else {
                            a2.delete();
                        }
                    }
                    if (file != null) {
                        w.a(activity, file.getAbsolutePath(), (IApiCallback) null, str);
                    }
                }
            });
        }
    }

    public static boolean a(final Activity activity, final h hVar, int i, final String str) {
        Object[] objArr = {activity, hVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9750c51504f37c0f180dde5caf6cb4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9750c51504f37c0f180dde5caf6cb4a")).booleanValue();
        }
        if (i == 5 || i == 8) {
            Object[] objArr2 = {activity, hVar, str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "faf679e77ef9a64f73512527b5297389", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "faf679e77ef9a64f73512527b5297389")).booleanValue();
            }
            if (str == null || hVar == null) {
                g.d("WebLongTapSaveImage", "Save image failed, imageUrl or runtime is null!");
                return false;
            }
            final String str2 = hVar.s.e;
            if (TextUtils.isEmpty(str2)) {
                g.d("WebLongTapSaveImage", "Save image failed, webLongTapSaveImageToken is null!");
                return false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.meituan.msc.modules.api.selectedDialog.a(new View.OnClickListener() { // from class: com.meituan.msc.modules.api.web.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4618083325016b2b73aebe9a77a4ea9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4618083325016b2b73aebe9a77a4ea9");
                    } else {
                        com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.modules.api.web.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9e9431240b03119a239b89b48ca88d71", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9e9431240b03119a239b89b48ca88d71");
                                    return;
                                }
                                IFileModule d = h.this.d();
                                if (Pattern.compile(KNBBase64Parser.BASE64_REG).matcher(str).matches()) {
                                    a.a(activity, str2, d, str);
                                } else {
                                    a.b(activity, str2, d, str);
                                }
                            }
                        });
                    }
                }
            }, "保存图片"));
            new SelectedDialog(activity, arrayList).show();
            return true;
        }
        return false;
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1da9fdbbc5315937d58f5b20c92fefd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1da9fdbbc5315937d58f5b20c92fefd");
        }
        if (b != null) {
            return b;
        }
        if (context != null) {
            try {
                b = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
            } catch (Exception unused) {
            }
        }
        if (b == null) {
            b = "";
        }
        return b;
    }
}
