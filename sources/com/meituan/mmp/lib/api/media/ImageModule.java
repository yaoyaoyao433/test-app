package com.meituan.mmp.lib.api.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.utils.af;
import com.meituan.mmp.lib.utils.f;
import com.meituan.mmp.lib.utils.k;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.utils.x;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.titans.widget.IMediaWidgetCallback;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.titans.widget.PlayerBuilder;
import com.sankuai.waimai.launcher.util.image.a;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ImageModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    private String i;
    private String j;

    public ImageModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527a7374406a34f0c507eeddc85f21b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527a7374406a34f0c507eeddc85f21b9");
            return;
        }
        this.j = f.c(getContext(), "Pictures").getAbsolutePath() + File.separator + AbsApiFactory.PASSPORT_ONLINE_URL;
    }

    public static /* synthetic */ void a(ImageModule imageModule, InputStream inputStream, String str, final IApiCallback iApiCallback) {
        boolean a;
        Object[] objArr = {inputStream, str, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, imageModule, changeQuickRedirect, false, "3c5d24f4ad1c1414858f7b821c028b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageModule, changeQuickRedirect, false, "3c5d24f4ad1c1414858f7b821c028b0a");
            return;
        }
        if (s.a() && inputStream != null) {
            String format = String.format("%s_%s%s", AbsApiFactory.PASSPORT_ONLINE_URL, Long.toHexString(new Date().getTime()), ".png");
            if (!new File(imageModule.j).exists()) {
                f.c(imageModule.getContext(), "Pictures").mkdirs();
            }
            File file = new File(new File(imageModule.j), format);
            if (file.exists()) {
                file.delete();
            }
            s.c(file);
            if (k.a()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                a.a(inputStream, (Rect) null, options);
                String str2 = options.outMimeType;
                InputStream b = s.b(imageModule.getContext(), str, imageModule.getAppConfig());
                if (b == null) {
                    c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageModule.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46d41d1f13ea8e1476fb48c621846d4e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46d41d1f13ea8e1476fb48c621846d4e");
                            } else {
                                iApiCallback.onFail(AbsApi.codeJson(-1, "Class:ImageModule Api:saveImageToPhotosAlbum getInputStream failed"));
                            }
                        }
                    });
                    return;
                }
                a = s.a(imageModule.getContext(), b, str2, new File(str).getName(), true, imageModule.i);
            } else {
                a = s.a(inputStream, file.getAbsolutePath());
            }
            if (a) {
                if (!k.a()) {
                    b.a(imageModule.getContext(), new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file)));
                }
                c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageModule.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "798f852c4413714998ff64206a2ddc7c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "798f852c4413714998ff64206a2ddc7c");
                        } else {
                            iApiCallback.onSuccess(null);
                        }
                    }
                });
                return;
            }
        }
        c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageModule.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbecda48b3d30c5d1cbe1bce96d60b5d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbecda48b3d30c5d1cbe1bce96d60b5d");
                } else {
                    iApiCallback.onFail(AbsApi.codeJson(-1, "Class:ImageModule Api:saveImageToPhotosAlbum failed"));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    public static /* synthetic */ void a(ImageModule imageModule, List list, JSONObject jSONObject, final IApiCallback iApiCallback, int i) {
        Iterator it;
        String c;
        String b;
        InputStream inputStream;
        int i2;
        int i3;
        Bitmap createBitmap;
        boolean z;
        char c2 = 0;
        int i4 = 1;
        Object[] objArr = {list, jSONObject, iApiCallback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, imageModule, changeQuickRedirect, false, "5f85846d8ec99586dde33d65f87703e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageModule, changeQuickRedirect, false, "5f85846d8ec99586dde33d65f87703e1");
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        try {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (TextUtils.isEmpty(str)) {
                    it = it2;
                } else {
                    if (str.startsWith("content://")) {
                        Uri parse = Uri.parse(str);
                        InputStream b2 = Privacy.createContentResolver(imageModule.getContext(), getToken(jSONObject)).b(parse);
                        c = Privacy.createContentResolver(imageModule.getContext(), getToken(jSONObject)).a(parse);
                        if (b2 == null) {
                            iApiCallback.onFail(codeJson(-1, "Get inputStream from privacy's contentResolver is null!"));
                            return;
                        }
                        if (c != null) {
                            c = CommonConstant.Symbol.DOT + c.replace("image/", "");
                        }
                        b = s.a(b2);
                        inputStream = Privacy.createContentResolver(imageModule.getContext(), getToken(jSONObject)).b(parse);
                    } else {
                        c = s.c(str);
                        b = s.b(new File(str));
                        inputStream = null;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    String str2 = "tmp_" + b + c;
                    File file = new File(imageModule.e(), str2);
                    if (inputStream != null ? s.a(inputStream, file.getAbsolutePath()) : s.a(str, file.getAbsolutePath())) {
                        if (i == 0) {
                            if (!".jpeg".equals(c) && !".jpg".equals(c)) {
                                it = it2;
                            }
                            String absolutePath = file.getAbsolutePath();
                            Object[] objArr2 = new Object[i4];
                            objArr2[c2] = absolutePath;
                            ChangeQuickRedirect changeQuickRedirect2 = af.a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "717f2a873af22f317aada2684f0bb950", RobustBitConfig.DEFAULT_VALUE)) {
                                it = it2;
                                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, i4, "717f2a873af22f317aada2684f0bb950");
                            } else {
                                it = it2;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = false;
                                try {
                                    Bitmap a = a.a(absolutePath, options);
                                    if ("image/jpeg".equals(options.outMimeType)) {
                                        af.a(a, absolutePath);
                                    } else if (a != null) {
                                        a.recycle();
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            it = it2;
                            Object[] objArr3 = new Object[i4];
                            objArr3[0] = file;
                            ChangeQuickRedirect changeQuickRedirect3 = af.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "35a91dda04b6da4a4f2eb38b97521f4e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, i4, "35a91dda04b6da4a4f2eb38b97521f4e");
                            } else {
                                float f = p.b().widthPixels;
                                float f2 = p.b().heightPixels;
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = i4;
                                a.a(file.getAbsolutePath(), options2);
                                if (!"image/gif".equals(options2.outMimeType)) {
                                    int i5 = options2.outHeight;
                                    float f3 = options2.outWidth;
                                    float f4 = i5;
                                    float f5 = f3 / f4;
                                    float f6 = f / f2;
                                    if (f4 > f2 || f3 > f) {
                                        if (f5 < f6) {
                                            i3 = (int) ((f2 / f4) * f3);
                                            i2 = (int) f2;
                                        } else if (f5 > f6) {
                                            i2 = (int) ((f / f3) * f4);
                                            i3 = (int) f;
                                        } else {
                                            i2 = (int) f2;
                                            i3 = (int) f;
                                        }
                                        options2.inSampleSize = af.a(options2, i3, i2);
                                        options2.inJustDecodeBounds = false;
                                        options2.inDither = false;
                                        options2.inPurgeable = i4;
                                        options2.inInputShareable = i4;
                                        options2.inTempStorage = new byte[32768];
                                        Bitmap a2 = a.a(file.getAbsolutePath(), options2);
                                        if ("image/jpeg".equals(options2.outMimeType)) {
                                            createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.RGB_565);
                                            z = true;
                                        } else if ("image/png".equals(options2.outMimeType)) {
                                            createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                                            z = false;
                                        }
                                        float f7 = i3;
                                        float f8 = f7 / options2.outWidth;
                                        float f9 = i2;
                                        float f10 = f9 / options2.outHeight;
                                        float f11 = f7 / 2.0f;
                                        float f12 = f9 / 2.0f;
                                        Matrix matrix = new Matrix();
                                        matrix.setScale(f8, f10, f11, f12);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.setMatrix(matrix);
                                        canvas.drawBitmap(a2, f11 - (a2.getWidth() / 2), f12 - (a2.getHeight() / 2), new Paint(2));
                                        try {
                                            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
                                            Matrix matrix2 = new Matrix();
                                            if (attributeInt == 6) {
                                                matrix2.postRotate(90.0f);
                                            } else if (attributeInt == 3) {
                                                matrix2.postRotate(180.0f);
                                            } else if (attributeInt == 8) {
                                                matrix2.postRotate(270.0f);
                                            }
                                            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, true);
                                            try {
                                                a2.recycle();
                                            } catch (Throwable unused2) {
                                            }
                                            if (createBitmap2 != null) {
                                                try {
                                                    file.delete();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath(), false);
                                                    createBitmap2.compress(z ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 85, fileOutputStream);
                                                    fileOutputStream.flush();
                                                    x.a(fileOutputStream);
                                                    createBitmap2.recycle();
                                                } catch (Exception unused3) {
                                                }
                                            }
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                            try {
                                                a2.recycle();
                                            } catch (Throwable unused4) {
                                            }
                                            if (createBitmap != null) {
                                                file.delete();
                                                FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsolutePath(), false);
                                                createBitmap.compress(z ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 85, fileOutputStream2);
                                                fileOutputStream2.flush();
                                                x.a(fileOutputStream2);
                                                createBitmap.recycle();
                                            }
                                        } catch (OutOfMemoryError unused5) {
                                            com.meituan.mmp.lib.trace.b.e("OutOfMemoryError " + file.getAbsolutePath());
                                            System.gc();
                                            try {
                                                a2.recycle();
                                            } catch (Throwable unused6) {
                                            }
                                            if (createBitmap != null) {
                                                file.delete();
                                                FileOutputStream fileOutputStream3 = new FileOutputStream(file.getAbsolutePath(), false);
                                                createBitmap.compress(z ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 85, fileOutputStream3);
                                                fileOutputStream3.flush();
                                                x.a(fileOutputStream3);
                                                createBitmap.recycle();
                                            }
                                        }
                                        File file2 = new File(file.getAbsolutePath());
                                        jSONArray.put("wdfile://" + str2);
                                        jSONObject3.put("path", "wdfile://" + str2);
                                        jSONObject3.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, file2.length());
                                    }
                                }
                            }
                        }
                        File file22 = new File(file.getAbsolutePath());
                        jSONArray.put("wdfile://" + str2);
                        jSONObject3.put("path", "wdfile://" + str2);
                        jSONObject3.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, file22.length());
                    } else {
                        it = it2;
                        jSONArray.put(MTURLUtil.FILE_BASE + str);
                        jSONObject3.put("path", MTURLUtil.FILE_BASE + str);
                        jSONObject3.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, s.d(str));
                    }
                    jSONArray2.put(jSONObject3);
                }
                it2 = it;
                c2 = 0;
                i4 = 1;
            }
            jSONObject2.put("tempFilePaths", jSONArray);
            jSONObject2.put("tempFiles", jSONArray2);
            com.meituan.mmp.lib.trace.b.b("InnerApi", "chooseImage: " + jSONArray2.length() + " result");
            c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "02ef07c6a15c532bcac32d6478073d11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "02ef07c6a15c532bcac32d6478073d11");
                    } else {
                        iApiCallback.onSuccess(jSONObject2);
                    }
                }
            });
        } catch (Exception unused7) {
            com.meituan.mmp.lib.trace.b.d("InnerApi", "chooseImage assemble result exception!");
            c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "87184c7edc39364b7ae99852aeeaca96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "87184c7edc39364b7ae99852aeeaca96");
                    } else {
                        iApiCallback.onFail();
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c4e6bf954315351d8c9a2a676f2f4b", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c4e6bf954315351d8c9a2a676f2f4b") : new String[]{"chooseImage", "previewImage", "saveImageToPhotosAlbum"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, final JSONObject jSONObject, final IApiCallback iApiCallback) {
        String[] strArr;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754bf8d0ad1a2ac68a9ab8109172fe9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754bf8d0ad1a2ac68a9ab8109172fe9a");
            return;
        }
        this.i = getToken(jSONObject);
        if (!"chooseImage".equals(str)) {
            if (!"previewImage".equals(str)) {
                if ("saveImageToPhotosAlbum".equals(str)) {
                    Object[] objArr2 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b10d84815812b28ad63ebd266939916a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b10d84815812b28ad63ebd266939916a");
                        return;
                    }
                    final String optString = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                    final InputStream b = s.b(getContext(), optString, getAppConfig());
                    if (b == null) {
                        iApiCallback.onFail();
                    } else if (!com.meituan.msi.privacy.permission.a.a(this.g, PermissionGuard.PERMISSION_STORAGE_WRITE, AbsApi.getToken(jSONObject))) {
                        iApiCallback.onFail();
                    } else {
                        int[] iArr = {0};
                        Object[] objArr3 = {100, new String[]{PermissionGuard.PERMISSION_STORAGE_WRITE}, iArr, b, optString, iApiCallback};
                        ChangeQuickRedirect changeQuickRedirect3 = h;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "41f687f0d4687d026eb899ab14b834e7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "41f687f0d4687d026eb899ab14b834e7");
                        } else if (iArr[0] == 0) {
                            com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageModule.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9e4cc7694d63b45c530d0391d9eae50f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9e4cc7694d63b45c530d0391d9eae50f");
                                    } else {
                                        ImageModule.a(ImageModule.this, b, optString, iApiCallback);
                                    }
                                }
                            });
                        } else {
                            iApiCallback.onFail();
                        }
                    }
                }
            } else {
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0b581af2b8b5be3bb29f1fcbb7d6a3a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0b581af2b8b5be3bb29f1fcbb7d6a3a0");
                    return;
                }
                String optString2 = jSONObject.optString("current", "");
                boolean optBoolean = jSONObject.optBoolean("showmenu", true);
                JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    com.meituan.mmp.lib.trace.b.c("InnerApi", "urls is null");
                    iApiCallback.onFail();
                    return;
                }
                int length = optJSONArray.length();
                ArrayList<String> arrayList = new ArrayList<>(length);
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    String optString3 = optJSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString3)) {
                        if (optString3.equals(optString2)) {
                            i = i2;
                        }
                        String a = s.a(getContext(), optString3, getAppConfig());
                        if (q.a(a, getAppConfig().e(getContext()))) {
                            arrayList.add(a);
                        }
                    }
                }
                PlayerBuilder firstAssetIndex = new PlayerBuilder().assets(arrayList).firstAssetIndex(i);
                firstAssetIndex.showIndicate(true);
                firstAssetIndex.showDownload(optBoolean);
                firstAssetIndex.accessToken(AbsApi.getToken(jSONObject));
                Activity activity = getActivity();
                if (activity == null || activity.isDestroyed()) {
                    iApiCallback.onFail(codeJson(-1, "previewImage api call failed, activity not exist when openMediaPlayer"));
                    return;
                }
                MediaWidget.getInstance().openMediaPlayer(activity, firstAssetIndex);
                iApiCallback.onSuccess(null);
            }
        } else {
            Object[] objArr5 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect5 = h;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c91846e1998db07bf216657006bc2bf4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c91846e1998db07bf216657006bc2bf4");
                return;
            }
            int optInt = jSONObject.optInt("count", 9);
            if (optInt <= 0) {
                optInt = 1;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sourceType");
            if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                strArr = new String[]{"album", WmChooseMediaModule.TYPE_CAMERA};
            } else {
                strArr = new String[optJSONArray2.length()];
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    strArr[i3] = optJSONArray2.optString(i3);
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("sizeType");
            String[] strArr2 = {"original", "compressed"};
            if (optJSONArray3 != null && optJSONArray3.length() == 1) {
                if ("original".equals(optJSONArray3.optString(0))) {
                    strArr2 = new String[]{"original"};
                } else if ("compressed".equals(optJSONArray3.optString(0))) {
                    strArr2 = new String[]{"compressed"};
                }
            }
            PickerBuilder pickerBuilder = new PickerBuilder();
            pickerBuilder.getBundle().putBoolean(PickerBuilder.EXTRA_SHOW_GIF, true);
            pickerBuilder.requestCode(97);
            pickerBuilder.mediaType("image").maxCount(optInt).source(strArr).mediaSize(strArr2);
            pickerBuilder.requestCode(97);
            pickerBuilder.accessToken(AbsApi.getToken(jSONObject));
            pickerBuilder.finishCallback(new IMediaWidgetCallback() { // from class: com.meituan.mmp.lib.api.media.ImageModule.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.titans.widget.IMediaWidgetCallback
                public final void onResult(final ArrayList<String> arrayList2, final int i4) {
                    Object[] objArr6 = {arrayList2, Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "acc21f47b5a5906945e9650618885fcc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "acc21f47b5a5906945e9650618885fcc");
                    } else if (arrayList2 != null && arrayList2.size() > 0) {
                        com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageModule.7.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ae1bc2ed3baea5949c0b37d30ed1fd8b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ae1bc2ed3baea5949c0b37d30ed1fd8b");
                                } else {
                                    ImageModule.a(ImageModule.this, arrayList2, jSONObject, iApiCallback, i4);
                                }
                            }
                        });
                    } else {
                        iApiCallback.onCancel();
                    }
                }
            });
            Activity activity2 = getActivity();
            if (activity2 == null || activity2.isDestroyed()) {
                iApiCallback.onFail(codeJson(-1, "chooseImage api call failed, activity not exist when openMediaPicker"));
            } else {
                MediaWidget.getInstance().openMediaPicker(activity2, pickerBuilder);
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba33b4dd7c0ae9f629b52ff3464b95b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba33b4dd7c0ae9f629b52ff3464b95b");
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1701611132) {
            if (hashCode == -1330493515 && str.equals("saveImageToPhotosAlbum")) {
                c = 1;
            }
        } else if (str.equals("chooseImage")) {
            c = 0;
        }
        switch (c) {
            case 0:
                JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
                int length = optJSONArray.length();
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    return new String[]{PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_STORAGE};
                }
                for (int i = 0; i < length; i++) {
                    if (TextUtils.equals(WmChooseMediaModule.TYPE_CAMERA, optJSONArray.optString(i))) {
                        return new String[]{PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_STORAGE};
                    }
                }
                return new String[]{PermissionGuard.PERMISSION_STORAGE_READ};
            case 1:
                return new String[]{PermissionGuard.PERMISSION_STORAGE_WRITE};
            default:
                return super.a(str, jSONObject);
        }
    }
}
