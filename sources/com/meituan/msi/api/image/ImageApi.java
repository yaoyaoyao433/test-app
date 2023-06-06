package com.meituan.msi.api.image;

import android.arch.lifecycle.d;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.dio.easy.DioFile;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.privacy.permission.a;
import com.meituan.msi.provider.b;
import com.meituan.msi.util.ae;
import com.meituan.msi.util.file.d;
import com.meituan.msi.util.file.e;
import com.meituan.msi.util.i;
import com.meituan.msi.util.m;
import com.meituan.msi.view.ActionSheetDialog;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.titans.widget.IMediaWidgetCallback;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.titans.widget.PlayerBuilder;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ImageApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private static final ExecutorService c = c.b("msi-compressImage");
    public final Handler b;
    private final String d;
    private final long e;
    private final Context f;

    public ImageApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d1ba8e2caea4cb408ed7e852d2c1c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d1ba8e2caea4cb408ed7e852d2c1c8");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.d = "ImageCompressModule";
        this.e = 10000L;
        this.f = com.meituan.msi.a.f();
    }

    public static /* synthetic */ int a(ImageApi imageApi, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageApi, changeQuickRedirect, false, "bb843887c41ecca6de4536f7e98bf716", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, imageApi, changeQuickRedirect, false, "bb843887c41ecca6de4536f7e98bf716")).intValue();
        }
        if (i < 0) {
            return 0;
        }
        if (i > 100) {
            return 100;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r12.equals(com.meituan.robust.common.CommonConstant.File.JPEG) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ android.graphics.Bitmap.CompressFormat a(com.meituan.msi.api.image.ImageApi r12, android.graphics.BitmapFactory.Options r13) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msi.api.image.ImageApi.a
            java.lang.String r11 = "2111562a7fdccec2e1a5a0a2a18c45b4"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            android.graphics.Bitmap$CompressFormat r12 = (android.graphics.Bitmap.CompressFormat) r12
            return r12
        L1e:
            java.lang.String r1 = r13.outMimeType
            if (r1 == 0) goto La1
            java.lang.String r13 = r13.outMimeType
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msi.api.image.ImageApi.a
            java.lang.String r11 = "020b973bac42435da0cac5220e015337"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L40
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            android.graphics.Bitmap$CompressFormat r12 = (android.graphics.Bitmap.CompressFormat) r12
            return r12
        L40:
            java.lang.String r12 = r13.toLowerCase()
            r13 = -1
            int r1 = r12.hashCode()
            switch(r1) {
                case -1487394660: goto L8e;
                case -879258763: goto L83;
                case 105441: goto L78;
                case 111145: goto L6d;
                case 3268712: goto L63;
                case 1140778788: goto L58;
                case 1146349984: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L99
        L4d:
            java.lang.String r0 = "image/x-png"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L99
            r0 = 6
            goto L9a
        L58:
            java.lang.String r0 = "image/pjpeg"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L99
            r0 = 3
            goto L9a
        L63:
            java.lang.String r1 = "jpeg"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L99
            goto L9a
        L6d:
            java.lang.String r0 = "png"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L99
            r0 = 4
            goto L9a
        L78:
            java.lang.String r0 = "jpg"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L99
            r0 = 0
            goto L9a
        L83:
            java.lang.String r0 = "image/png"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L99
            r0 = 5
            goto L9a
        L8e:
            java.lang.String r0 = "image/jpeg"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L99
            r0 = 2
            goto L9a
        L99:
            r0 = -1
        L9a:
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L9e;
                case 2: goto L9e;
                case 3: goto L9e;
                case 4: goto L9e;
                case 5: goto L9e;
                case 6: goto L9e;
                default: goto L9d;
            }
        L9d:
            goto La1
        L9e:
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG
            return r12
        La1:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.image.ImageApi.a(com.meituan.msi.api.image.ImageApi, android.graphics.BitmapFactory$Options):android.graphics.Bitmap$CompressFormat");
    }

    public static /* synthetic */ Runnable a(ImageApi imageApi, final CompressImageParam compressImageParam, final MsiContext msiContext) {
        Object[] objArr = {compressImageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, imageApi, changeQuickRedirect, false, "3835e033cfc4594573a552870f89ca5f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, imageApi, changeQuickRedirect, false, "3835e033cfc4594573a552870f89ca5f") : new Runnable() { // from class: com.meituan.msi.api.image.ImageApi.10
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                FileInputStream fileInputStream;
                File file;
                FileOutputStream fileOutputStream;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1322b31daa9fe9bea0e50ca2dfa13563", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1322b31daa9fe9bea0e50ca2dfa13563");
                } else if (TextUtils.equals(StringUtil.NULL, compressImageParam.src)) {
                    msiContext.onError("parameter error: parameter.src should be String instead of Null");
                } else {
                    com.meituan.msi.provider.a fileProvider = msiContext.getFileProvider();
                    String a2 = fileProvider.a(compressImageParam.src);
                    int a3 = ImageApi.a(ImageApi.this, compressImageParam.quality);
                    FileOutputStream fileOutputStream2 = null;
                    try {
                        fileInputStream = new FileInputStream(a2);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        fileInputStream = null;
                    }
                    if (fileInputStream == null) {
                        msiContext.onError(400, "file does't exist " + compressImageParam.src);
                        return;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = false;
                    try {
                        Bitmap a4 = com.sankuai.waimai.launcher.util.image.a.a(fileInputStream, (Rect) null, options);
                        Bitmap.CompressFormat a5 = ImageApi.a(ImageApi.this, options);
                        if (a5 == null) {
                            msiContext.onError("unsupported format");
                        } else if (a4 != null) {
                            String a6 = ImageApi.this.a(ImageApi.a(ImageApi.this, a5));
                            if (fileProvider instanceof b) {
                                file = new File(fileProvider.b(), "tmp_" + msiContext.getContainerInfo().name + CommonConstant.Symbol.UNDERLINE + a6);
                            } else {
                                file = new File(fileProvider.b(), a6);
                                e.c(com.meituan.msi.a.f());
                            }
                            d.a(file);
                            String absolutePath = file.getAbsolutePath();
                            try {
                                try {
                                    try {
                                        fileOutputStream = new FileOutputStream(new File(absolutePath));
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException | OutOfMemoryError e2) {
                                    e = e2;
                                }
                                try {
                                    if (a4.compress(a5, a3, fileOutputStream)) {
                                        CompressImageResponse compressImageResponse = new CompressImageResponse();
                                        if (fileProvider instanceof b) {
                                            compressImageResponse.tempFilePath = "msifile://tmp_" + msiContext.getContainerInfo().name + CommonConstant.Symbol.UNDERLINE + a6;
                                        } else {
                                            compressImageResponse.tempFilePath = fileProvider.b(a6);
                                        }
                                        compressImageResponse.size = d.d(absolutePath);
                                        if (Thread.interrupted()) {
                                            d.e(absolutePath);
                                            msiContext.onError("compress failed:task timeout");
                                        } else {
                                            msiContext.onSuccess(compressImageResponse);
                                        }
                                    } else {
                                        msiContext.onError("compress failed");
                                    }
                                    a4.recycle();
                                    fileInputStream.close();
                                    fileOutputStream.close();
                                } catch (FileNotFoundException | OutOfMemoryError e3) {
                                    e = e3;
                                    fileOutputStream2 = fileOutputStream;
                                    msiContext.onError("compress out of memory");
                                    d.e(absolutePath);
                                    e.printStackTrace();
                                    a4.recycle();
                                    fileInputStream.close();
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        a4.recycle();
                                        fileInputStream.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (IOException unused) {
                                        msiContext.onError("close file ioSteam failed");
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                msiContext.onError("close file ioSteam failed");
                            }
                        } else {
                            msiContext.onError("decode bitmap is null");
                        }
                    } catch (OutOfMemoryError unused3) {
                        msiContext.onError("decode bitmap out of Memory");
                    }
                }
            }
        };
    }

    public static /* synthetic */ String a(ImageApi imageApi, Bitmap.CompressFormat compressFormat) {
        Object[] objArr = {compressFormat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageApi, changeQuickRedirect, false, "55d114e4ea128cfc1140d8d0a8cd11f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, imageApi, changeQuickRedirect, false, "55d114e4ea128cfc1140d8d0a8cd11f9");
        }
        switch (AnonymousClass2.a[compressFormat.ordinal()]) {
            case 1:
                return CommonConstant.File.JPG;
            case 2:
                return "png";
            case 3:
                return "webp";
            default:
                return null;
        }
    }

    public static /* synthetic */ void a(ImageApi imageApi, ApiRequest apiRequest, List list, final MsiContext msiContext, int i) {
        String b;
        String c2;
        InputStream inputStream;
        File file;
        boolean a2;
        a aVar;
        int i2;
        int i3;
        Map map;
        a a3;
        String b2;
        int i4 = 2;
        Object[] objArr = {apiRequest, list, msiContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageApi, changeQuickRedirect, false, "7ba69d9f267b8d7dbe719049fb4771c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, imageApi, changeQuickRedirect, false, "7ba69d9f267b8d7dbe719049fb4771c8");
            return;
        }
        final ChooseImageResponse chooseImageResponse = new ChooseImageResponse();
        chooseImageResponse.tempFiles = new ArrayList();
        chooseImageResponse.tempFilePaths = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    String a4 = ae.a(msiContext.getArgs());
                    if (str.startsWith("content://")) {
                        Uri parse = Uri.parse(str);
                        t createContentResolver = Privacy.createContentResolver(imageApi.f.getApplicationContext(), a4);
                        if (createContentResolver == null) {
                            msiContext.onError("");
                            return;
                        }
                        InputStream b3 = createContentResolver.b(parse);
                        b = createContentResolver.a(parse);
                        if (b3 == null) {
                            msiContext.onError("");
                            return;
                        }
                        if (b != null) {
                            b = CommonConstant.Symbol.DOT + b.replace("image/", "");
                        }
                        c2 = d.a(b3);
                        inputStream = createContentResolver.b(parse);
                    } else {
                        b = d.b(str);
                        c2 = d.c(new File(str));
                        inputStream = null;
                    }
                    TempImageFile tempImageFile = new TempImageFile();
                    String str2 = "tmp_" + c2 + b;
                    com.meituan.msi.provider.a fileProvider = msiContext.getFileProvider();
                    if (fileProvider instanceof b) {
                        file = new File(fileProvider.b(), "tmp_" + msiContext.getContainerInfo().name + CommonConstant.Symbol.UNDERLINE + str2);
                    } else {
                        file = new File(fileProvider.b(), str2);
                    }
                    if (inputStream != null) {
                        a2 = d.a(inputStream, file.getAbsolutePath());
                    } else {
                        a2 = d.a(str, file.getAbsolutePath(), ae.a(msiContext.getArgs()));
                    }
                    if (a2) {
                        if (i == 0) {
                            if (!".jpeg".equals(b) && !".jpg".equals(b)) {
                                a3 = null;
                            }
                            a3 = i.a(file.getAbsolutePath());
                        } else {
                            a3 = i.a(file, imageApi.f, a4);
                        }
                        if (fileProvider instanceof b) {
                            b2 = "msifile://tmp_" + msiContext.getContainerInfo().name + CommonConstant.Symbol.UNDERLINE + str2;
                        } else {
                            b2 = fileProvider.b(str2);
                        }
                        chooseImageResponse.tempFilePaths.add(b2);
                        tempImageFile.path = b2;
                        tempImageFile.size = file.length();
                        aVar = a3;
                    } else {
                        chooseImageResponse.tempFilePaths.add(MTURLUtil.FILE_BASE + str);
                        tempImageFile.path = MTURLUtil.FILE_BASE + str;
                        tempImageFile.size = d.d(str);
                        aVar = null;
                    }
                    if (aVar != null) {
                        aVar.d = str;
                    }
                    Object[] objArr2 = new Object[i4];
                    objArr2[0] = aVar;
                    objArr2[1] = str;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, imageApi, changeQuickRedirect2, false, "c7ff5ebeeb8af98f1a185ebe6e398a82", RobustBitConfig.DEFAULT_VALUE)) {
                        map = (Map) PatchProxy.accessDispatch(objArr2, imageApi, changeQuickRedirect2, false, "c7ff5ebeeb8af98f1a185ebe6e398a82");
                    } else {
                        if (aVar == null) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            com.sankuai.waimai.launcher.util.image.a.a(str, options);
                            int i5 = options.outWidth;
                            i2 = options.outHeight;
                            i3 = i5;
                        } else {
                            i3 = aVar.c;
                            i2 = aVar.b;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("width", Integer.valueOf(i3));
                        hashMap.put("height", Integer.valueOf(i2));
                        hashMap.put("ratio", Float.valueOf(i2 == 0 ? 0.0f : Float.parseFloat(String.format("%.2f", Float.valueOf(i3 / i2)))));
                        map = hashMap;
                    }
                    com.meituan.msi.log.a.a(map, msiContext.request, "msi.api.chooseImage", 1, 1.0f);
                    chooseImageResponse.tempFiles.add(tempImageFile);
                }
                i4 = 2;
            }
            imageApi.b.post(new Runnable() { // from class: com.meituan.msi.api.image.ImageApi.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "408a425ac45cb10c1baf48cb382de9e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "408a425ac45cb10c1baf48cb382de9e3");
                    } else {
                        msiContext.onSuccess(chooseImageResponse);
                    }
                }
            });
        } catch (Exception e) {
            imageApi.b.post(new Runnable() { // from class: com.meituan.msi.api.image.ImageApi.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6dcc1adbfd08dc60a73e631ccf8d448", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6dcc1adbfd08dc60a73e631ccf8d448");
                    } else {
                        msiContext.onError(e.getMessage());
                    }
                }
            });
        }
    }

    @MsiApiMethod(isForeground = true, name = "saveImageToPhotosAlbum", request = saveImageApiParam.class)
    @MsiApiPermission(apiPermissions = {PermissionGuard.PERMISSION_STORAGE_WRITE})
    public void saveImageToPhotosAlbum(saveImageApiParam saveimageapiparam, MsiContext msiContext) throws ApiException {
        Object[] objArr = {saveimageapiparam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5e33b7b9980e5224b7be279df01d84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5e33b7b9980e5224b7be279df01d84a");
        } else if (TextUtils.isEmpty(saveimageapiparam.filePath)) {
            throw new ApiException(400, "filePath is empty");
        } else {
            com.meituan.msi.provider.a fileProvider = msiContext.getFileProvider();
            if (!com.meituan.msi.privacy.permission.a.a(com.meituan.msi.a.f(), PermissionGuard.PERMISSION_STORAGE_WRITE, saveimageapiparam._mt == null ? "" : saveimageapiparam._mt.sceneToken)) {
                msiContext.onError("no permission");
            }
            i.a(msiContext.getActivity(), fileProvider.a(saveimageapiparam.filePath), msiContext);
        }
    }

    @MsiApiMethod(name = "getImageInfo", request = ImageInfoApiParam.class, response = ImageInfoApiResponse.class)
    public void getImageInfo(ImageInfoApiParam imageInfoApiParam, final MsiContext msiContext) {
        Object[] objArr = {imageInfoApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7785f736845c21c4583d71f428bc5f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7785f736845c21c4583d71f428bc5f3");
        } else if (!URLUtil.isNetworkUrl(imageInfoApiParam.src)) {
            String str = imageInfoApiParam.src;
            imageInfoApiParam.src = msiContext.getFileProvider().a(imageInfoApiParam.src);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.sankuai.waimai.launcher.util.image.a.a(imageInfoApiParam.src, options);
            ImageInfoApiResponse imageInfoApiResponse = new ImageInfoApiResponse();
            imageInfoApiResponse.width = options.outWidth;
            imageInfoApiResponse.height = options.outHeight;
            if (options.outMimeType != null) {
                imageInfoApiResponse.type = options.outMimeType.replace("image/", "");
            }
            imageInfoApiResponse.orientation = i.a(new File(imageInfoApiParam.src));
            imageInfoApiResponse.path = str;
            imageInfoApiResponse.size = d.d(imageInfoApiParam.src);
            msiContext.onSuccess(imageInfoApiResponse);
        } else {
            ApiRequest apiRequest = msiContext.request;
            String str2 = imageInfoApiParam.src;
            Object[] objArr2 = {apiRequest, str2, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4009fe61d24bc1399b0ee6fa235cc73", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4009fe61d24bc1399b0ee6fa235cc73");
                return;
            }
            final com.meituan.msi.provider.a fileProvider = msiContext.getFileProvider();
            com.meituan.msi.util.network.a.a().d().newCall(new Request.Builder().url(str2).build()).enqueue(new Callback() { // from class: com.meituan.msi.api.image.ImageApi.1
                public static ChangeQuickRedirect a;

                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    Object[] objArr3 = {call, iOException};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e56e042f009548a062b2fcc03849a5ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e56e042f009548a062b2fcc03849a5ff");
                    } else {
                        msiContext.onError(iOException.getMessage());
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
                @Override // okhttp3.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onResponse(okhttp3.Call r14, okhttp3.Response r15) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 345
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.image.ImageApi.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.Response):void");
                }
            });
        }
    }

    @MsiApiMethod(isForeground = true, name = "chooseImage", request = ChooseImageParam.class, response = ChooseImageResponse.class)
    public void chooseImage(final ChooseImageParam chooseImageParam, final MsiContext msiContext) {
        Object[] objArr = {chooseImageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301a8f629bc4f4c1fbc670e41f08215b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301a8f629bc4f4c1fbc670e41f08215b");
            return;
        }
        String[] strArr = chooseImageParam.sourceType;
        if (strArr == null || strArr.length == 0) {
            strArr = new String[]{"album", WmChooseMediaModule.TYPE_CAMERA};
        }
        if (strArr.length == 2 && !TextUtils.equals(strArr[0], strArr[1])) {
            m.a(new Runnable() { // from class: com.meituan.msi.api.image.ImageApi.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65425075ead65abd59de82b7d37d1495", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65425075ead65abd59de82b7d37d1495");
                    } else if (d.a.ON_PAUSE.equals(msiContext.getLifecycleState()) || msiContext.getActivity() == null) {
                        msiContext.onError("Activity is null or on pause");
                    } else {
                        ActionSheetDialog actionSheetDialog = new ActionSheetDialog(msiContext.getActivity());
                        actionSheetDialog.setCanceledOnTouchOutside(true);
                        actionSheetDialog.a(Arrays.asList("相册", "相机"), com.meituan.msi.util.d.a(DiagnoseLog.COLOR_ERROR));
                        actionSheetDialog.b = new ActionSheetDialog.a() { // from class: com.meituan.msi.api.image.ImageApi.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msi.view.ActionSheetDialog.a
                            public final void a(int i, View view) {
                                Object[] objArr3 = {Integer.valueOf(i), view};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e483c85eb42797e49a77ba0defa1a3c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e483c85eb42797e49a77ba0defa1a3c");
                                } else if (i == 0) {
                                    ImageApi.this.a(msiContext, "album", chooseImageParam);
                                } else if (i == 1) {
                                    ImageApi.this.a(msiContext, WmChooseMediaModule.TYPE_CAMERA, chooseImageParam);
                                } else {
                                    msiContext.onError(101, "user cancel");
                                }
                            }
                        };
                        actionSheetDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.msi.api.image.ImageApi.3.2
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                Object[] objArr3 = {dialogInterface};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "12d86ad56df91c4e5e9f3504bfd7d523", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "12d86ad56df91c4e5e9f3504bfd7d523");
                                } else {
                                    msiContext.onError(101, "cancel");
                                }
                            }
                        });
                        actionSheetDialog.show();
                    }
                }
            });
        } else if (strArr.length == 1 || strArr.length == 2) {
            a(msiContext, strArr[0], chooseImageParam);
        } else {
            msiContext.onError("sourceTypes is invalid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MsiContext msiContext, final String str, final ChooseImageParam chooseImageParam) {
        Object[] objArr = {msiContext, str, chooseImageParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c91fe543e802897989ad4b2ae5a561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c91fe543e802897989ad4b2ae5a561");
            return;
        }
        String[] strArr = new String[0];
        if (TextUtils.equals("album", str)) {
            strArr = new String[]{PermissionGuard.PERMISSION_STORAGE_READ};
        } else if (TextUtils.equals(WmChooseMediaModule.TYPE_CAMERA, str)) {
            strArr = new String[]{PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_STORAGE};
        }
        String a2 = ae.a(msiContext.getArgs());
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (!com.meituan.msi.privacy.permission.a.a(com.meituan.msi.a.f(), str2, a2)) {
                arrayList.add(str2);
            }
        }
        if (arrayList.size() == 0) {
            a(msiContext, chooseImageParam, a2, str);
        } else {
            msiContext.requestPermissions((String[]) arrayList.toArray(new String[0]), a2, new a.InterfaceC0498a() { // from class: com.meituan.msi.api.image.ImageApi.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                public final void onResult(String str3, String[] strArr2, int[] iArr, String str4) {
                    Object[] objArr2 = {str3, strArr2, iArr, str4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75a1e9d0adce5070f4698ca6fe0699b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75a1e9d0adce5070f4698ca6fe0699b8");
                    } else if (com.meituan.msi.privacy.permission.a.a(iArr)) {
                        ImageApi.this.a(msiContext, chooseImageParam, str3, str);
                    } else {
                        msiContext.onError(com.meituan.msi.privacy.permission.b.b(iArr), com.meituan.msi.privacy.permission.b.a(iArr));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MsiContext msiContext, ChooseImageParam chooseImageParam, String str, String str2) {
        Object[] objArr = {msiContext, chooseImageParam, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ef2f6d0e0ac51fbf09a2b544755437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ef2f6d0e0ac51fbf09a2b544755437");
            return;
        }
        String[] strArr = {"original", "compressed"};
        if (chooseImageParam.sizeType != null && chooseImageParam.sizeType.size() == 1) {
            String str3 = chooseImageParam.sizeType.get(0);
            if ("original".equals(str3)) {
                strArr = new String[]{"original"};
            } else if ("compressed".equals(str3)) {
                strArr = new String[]{"compressed"};
            }
        }
        int i = chooseImageParam.count <= 0 ? 1 : chooseImageParam.count;
        final PickerBuilder pickerBuilder = new PickerBuilder();
        pickerBuilder.getBundle().putBoolean(PickerBuilder.EXTRA_SHOW_GIF, true);
        pickerBuilder.mediaType("image").maxCount(i).source(str2).mediaSize(strArr);
        pickerBuilder.requestCode(97);
        pickerBuilder.accessToken(str);
        pickerBuilder.finishCallback(new IMediaWidgetCallback() { // from class: com.meituan.msi.api.image.ImageApi.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.titans.widget.IMediaWidgetCallback
            public final void onResult(final ArrayList<String> arrayList, final int i2) {
                Object[] objArr2 = {arrayList, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "474f280ffcd015976f659705706178df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "474f280ffcd015976f659705706178df");
                } else if (arrayList != null && arrayList.size() > 0) {
                    m.a.a(new Runnable() { // from class: com.meituan.msi.api.image.ImageApi.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a64913f7f4ba2b866c8bd870ac5e72e4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a64913f7f4ba2b866c8bd870ac5e72e4");
                            } else {
                                ImageApi.a(ImageApi.this, msiContext.request, arrayList, msiContext, i2);
                            }
                        }
                    });
                } else {
                    msiContext.onError(101, "cancel chooseImage");
                }
            }
        });
        if (msiContext.getActivity() != null && msiContext.getLifecycleState() != null && !msiContext.getLifecycleState().equals(d.a.ON_DESTROY)) {
            this.b.post(new Runnable() { // from class: com.meituan.msi.api.image.ImageApi.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea379c3fafbc4a089b565bc06ca62740", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea379c3fafbc4a089b565bc06ca62740");
                    } else {
                        MediaWidget.getInstance().openMediaPicker(msiContext.getActivity(), pickerBuilder);
                    }
                }
            });
        } else {
            msiContext.onError("chooseImage api call failed, activity not exist when openMediaPicker");
        }
    }

    @MsiApiMethod(isForeground = true, name = "previewImage", request = PreviewImageParam.class)
    public void previewImage(PreviewImageParam previewImageParam, MsiContext msiContext) {
        int i = 0;
        Object[] objArr = {previewImageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c91f702950bd51633bb85235db0af1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c91f702950bd51633bb85235db0af1c");
        } else if (previewImageParam.urls == null || previewImageParam.urls.size() == 0) {
            msiContext.onError(400, "urls is null");
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            int i2 = 0;
            while (true) {
                File file = null;
                if (i2 >= previewImageParam.urls.size()) {
                    break;
                }
                String str = previewImageParam.urls.get(i2);
                if (str.startsWith("http")) {
                    arrayList.add(str);
                } else {
                    String a2 = msiContext.getFileProvider().a(str);
                    if (a2 == null) {
                        arrayList.add("");
                        com.meituan.msi.log.a.a("previewImage url is empty!");
                    } else {
                        DioFile dioFile = new DioFile(a2);
                        if (dioFile.o()) {
                            file = new File(msiContext.getFileProvider().b(), str);
                            if (!file.exists()) {
                                try {
                                    dioFile.a(file);
                                } catch (IOException e) {
                                    com.meituan.msi.log.a.a(ae.a("previewImage", e));
                                }
                            }
                        }
                        if (file != null && file.exists()) {
                            a2 = file.getPath();
                        }
                        arrayList.add(a2);
                    }
                }
                i2++;
            }
            if (!TextUtils.isEmpty(previewImageParam.current) && previewImageParam.urls.contains(previewImageParam.current)) {
                i = previewImageParam.urls.indexOf(previewImageParam.current);
            }
            PlayerBuilder firstAssetIndex = new PlayerBuilder().assets(arrayList).firstAssetIndex(i);
            firstAssetIndex.showIndicate(true);
            firstAssetIndex.showDownload(previewImageParam.showmenu);
            firstAssetIndex.accessToken(previewImageParam._mt != null ? previewImageParam._mt.sceneToken : null);
            if (msiContext.getActivity() == null) {
                msiContext.onError("previewImage api call failed, activity not exist when openMediaPlayer");
                return;
            }
            MediaWidget.getInstance().openMediaPlayer(msiContext.getActivity(), firstAssetIndex);
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "compressImage", request = CompressImageParam.class, response = CompressImageResponse.class)
    public void compressImage(final CompressImageParam compressImageParam, final MsiContext msiContext) {
        Object[] objArr = {compressImageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2efbbe9839d29a405a8dec590197ed92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2efbbe9839d29a405a8dec590197ed92");
        } else {
            m.b(new Runnable() { // from class: com.meituan.msi.api.image.ImageApi.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33a19441af3db09c288ad0299d273d60", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33a19441af3db09c288ad0299d273d60");
                        return;
                    }
                    Future<?> submit = ImageApi.c.submit(ImageApi.a(ImageApi.this, compressImageParam, msiContext));
                    try {
                        submit.get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException e) {
                        msiContext.onError(e.getMessage());
                    } catch (TimeoutException e2) {
                        submit.cancel(true);
                        msiContext.onError(e2.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fcf706f4e6b3d063380da5e8a6ab6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fcf706f4e6b3d063380da5e8a6ab6b");
        }
        return "tmp_" + UUID.randomUUID().toString() + CommonConstant.Symbol.DOT + str;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msi.api.image.ImageApi$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[Bitmap.CompressFormat.values().length];

        static {
            try {
                a[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
