package com.meituan.mmp.lib.api.media;

import android.graphics.Bitmap;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.executor.a;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ImageCompressModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private final String h;
    private final long i;
    private final ExecutorService j;

    public static /* synthetic */ int a(ImageCompressModule imageCompressModule, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageCompressModule, changeQuickRedirect, false, "af620ef5cb9118bd20ddde4f5684dd3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, imageCompressModule, changeQuickRedirect, false, "af620ef5cb9118bd20ddde4f5684dd3b")).intValue();
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
    public static /* synthetic */ android.graphics.Bitmap.CompressFormat a(com.meituan.mmp.lib.api.media.ImageCompressModule r12, android.graphics.BitmapFactory.Options r13) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.api.media.ImageCompressModule.a
            java.lang.String r11 = "f7af8c6c331ead1ecc4aba5b6809d7c2"
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.api.media.ImageCompressModule.a
            java.lang.String r11 = "444970f3c6dd84ac88b13b50e06ca9cc"
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
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.media.ImageCompressModule.a(com.meituan.mmp.lib.api.media.ImageCompressModule, android.graphics.BitmapFactory$Options):android.graphics.Bitmap$CompressFormat");
    }

    public static /* synthetic */ Runnable a(ImageCompressModule imageCompressModule, final JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, imageCompressModule, changeQuickRedirect, false, "6a2e1048a3ef217c980ba7c32649bfd0", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, imageCompressModule, changeQuickRedirect, false, "6a2e1048a3ef217c980ba7c32649bfd0") : new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageCompressModule.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0186 A[Catch: IOException -> 0x018a, TRY_LEAVE, TryCatch #0 {IOException -> 0x018a, blocks: (B:60:0x017e, B:62:0x0186), top: B:70:0x017e }] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.io.FileOutputStream] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 442
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.media.ImageCompressModule.AnonymousClass2.run():void");
            }
        };
    }

    public static /* synthetic */ String a(ImageCompressModule imageCompressModule, Bitmap.CompressFormat compressFormat) {
        Object[] objArr = {compressFormat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, imageCompressModule, changeQuickRedirect, false, "d11ddd33619aa54539de0a089a86b274", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, imageCompressModule, changeQuickRedirect, false, "d11ddd33619aa54539de0a089a86b274");
        }
        switch (AnonymousClass3.a[compressFormat.ordinal()]) {
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

    public ImageCompressModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "affc03a73ce4adca31384c3e26d5f4c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "affc03a73ce4adca31384c3e26d5f4c4");
            return;
        }
        this.h = "ImageCompressModule";
        this.i = 10000L;
        this.j = c.b("MMP-compressImage");
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cf8b789c779b96afd1e31414465db3", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cf8b789c779b96afd1e31414465db3") : new String[]{"compressImage"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, final JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a5ea00bd75a235c0c454d458e2b7e11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a5ea00bd75a235c0c454d458e2b7e11");
            return;
        }
        char c = 65535;
        if (str.hashCode() == 1717934873 && str.equals("compressImage")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        Object[] objArr2 = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdfe19d2031e8495c43c5ec1837731ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdfe19d2031e8495c43c5ec1837731ad");
        } else {
            a.a(new Runnable() { // from class: com.meituan.mmp.lib.api.media.ImageCompressModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19384c4fe8d8512f9e5b03f1ae16a68b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19384c4fe8d8512f9e5b03f1ae16a68b");
                        return;
                    }
                    Future<?> submit = ImageCompressModule.this.j.submit(ImageCompressModule.a(ImageCompressModule.this, jSONObject, iApiCallback));
                    try {
                        submit.get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException unused) {
                        iApiCallback.onFail(AbsApi.codeJson(-1, "Runtime error!"));
                    } catch (TimeoutException unused2) {
                        submit.cancel(true);
                        iApiCallback.onFail(AbsApi.codeJson(-1, "Time limit exceed!"));
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90c78d74992004459ff1b23c22b79ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90c78d74992004459ff1b23c22b79ad");
            return;
        }
        super.i();
        this.j.shutdownNow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7706649d0d3d0c7347eac91881a6045c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7706649d0d3d0c7347eac91881a6045c");
        }
        return "tmp_" + UUID.randomUUID().toString() + CommonConstant.Symbol.DOT + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2e48148217eb1b87059929147a17c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2e48148217eb1b87059929147a17c9");
        }
        return getAppConfig().c(getContext()) + str;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.api.media.ImageCompressModule$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
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

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301f3cadbfc8ead27502021d2896485b", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301f3cadbfc8ead27502021d2896485b");
        }
        InputStream b = s.b(getContext(), str, getAppConfig());
        if (b == null) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
            return b;
        }
        return b;
    }
}
