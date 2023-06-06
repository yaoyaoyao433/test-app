package com.meituan.android.legwork.mrn.bridge;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.legwork.utils.k;
import com.meituan.android.legwork.utils.w;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PhotoBridgeModule extends ReactContextBaseJavaModule {
    public static final int DEFAULT_MAX_SIZE = 100;
    public static final int DEFAULT_QUALITY = 50;
    public static final String ERROR_ACTIVITY = "1";
    public static final String ERROR_FAILED = "1";
    public static final String ERROR_INPUT_PARAMS = "3";
    public static final String ERROR_NO_PHOTO = "5";
    public static final String ERROR_PERMISSION = "2";
    public static final String ERROR_RESULT = "-1000";
    private static final int MAX_PHOTO_COUNT = 5;
    public static final String PARAM_INPUT_LOCAL_ID = "inputLocalId";
    public static final String PARAM_OUTPUT_FILE_PATH = "outputFilePath";
    public static final String PARAM_RESIZE_MAX_SIZE = "resizeMaxSize";
    public static final String PARAM_RESIZE_QUALITY = "resizeQuality";
    public static final String PARAM_TOKEN = "token";
    public static final int REQUEST_CODE_CROP_IMAGE = 10002;
    public static final int REQUEST_CODE_PICK_PHOTO = 10003;
    public static final int REQUEST_CODE_TAKE_PHOTO = 10001;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ScheduledExecutorService cameraResultExecutorService;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BMLWPhotoBridge";
    }

    public PhotoBridgeModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3920b73e09e92922438645fac6e5d412", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3920b73e09e92922438645fac6e5d412");
        }
    }

    @ReactMethod
    public void takePhoto(@Nonnull ReadableMap readableMap, final Promise promise) {
        boolean z = false;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38ccb5f8eba7f917fbf7e444ad540e2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38ccb5f8eba7f917fbf7e444ad540e2c");
        } else if (getCurrentActivity() == null) {
            promise.reject("1", "invalid activity");
        } else {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            String valueOf = String.valueOf(hashMap.get("token"));
            Object[] objArr2 = {valueOf};
            ChangeQuickRedirect changeQuickRedirect3 = w.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "cb7ca5a2f827654ad78a97ddafd08c66", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "cb7ca5a2f827654ad78a97ddafd08c66")).booleanValue();
            } else if (Privacy.createPermissionGuard().a(com.meituan.android.legwork.a.a(), PermissionGuard.PERMISSION_CAMERA, valueOf) > 0) {
                z = true;
            }
            if (!z) {
                promise.reject("2", "READ_EXTERNAL_STORAGE || CAMERA");
                return;
            }
            final Uri a2 = com.meituan.android.legwork.utils.k.a(String.valueOf(hashMap.get(PARAM_OUTPUT_FILE_PATH)), k.a.TAKE_PHOTO, valueOf);
            if (!com.meituan.android.legwork.utils.k.d(a2)) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("output", a2);
                intent.addFlags(1);
                try {
                    getReactApplicationContext().addActivityEventListener(new ActivityEventListener() { // from class: com.meituan.android.legwork.mrn.bridge.PhotoBridgeModule.1
                        public static ChangeQuickRedirect a;

                        @Override // com.facebook.react.bridge.ActivityEventListener
                        public final void onNewIntent(Intent intent2) {
                        }

                        @Override // com.facebook.react.bridge.ActivityEventListener
                        public final void onActivityResult(Activity activity, int i, int i2, Intent intent2) {
                            Object[] objArr3 = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f6c3e9adb1871a0e3cc3c8fcce26d887", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f6c3e9adb1871a0e3cc3c8fcce26d887");
                            } else if (i != 10001) {
                            } else {
                                PhotoBridgeModule.this.getReactApplicationContext().removeActivityEventListener(this);
                                if (i2 != -1) {
                                    promise.reject(PhotoBridgeModule.ERROR_RESULT, "User cancel");
                                } else if (!com.meituan.android.legwork.utils.k.a(a2)) {
                                    if (PhotoBridgeModule.this.cameraResultExecutorService == null) {
                                        PhotoBridgeModule.this.cameraResultExecutorService = com.sankuai.android.jarvis.c.c("legwork-camera-helper");
                                    }
                                    PhotoBridgeModule.this.cameraResultExecutorService.schedule(new a(a2, PhotoBridgeModule.this.cameraResultExecutorService, 0, promise), 1L, TimeUnit.SECONDS);
                                } else {
                                    promise.resolve(com.meituan.android.legwork.utils.k.c(a2));
                                }
                            }
                        }
                    });
                    getCurrentActivity().startActivityForResult(intent, 10001);
                    return;
                } catch (Exception unused) {
                    promise.reject("1", "open camera error");
                    return;
                }
            }
            promise.reject("3", "invalid uri");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        private String c;
        private Uri d;
        private int e;
        private Promise f;
        private ScheduledExecutorService g;

        public a(Uri uri, ScheduledExecutorService scheduledExecutorService, int i, Promise promise) {
            Object[] objArr = {PhotoBridgeModule.this, uri, scheduledExecutorService, 0, promise};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb403b49681079c1fd31e8b00d7c730", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb403b49681079c1fd31e8b00d7c730");
                return;
            }
            this.c = "CheckCameraRunnable";
            this.d = uri;
            this.e = 0;
            this.f = promise;
            this.g = scheduledExecutorService;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d38aa71536e52a1a510eb9fd149e8aeb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d38aa71536e52a1a510eb9fd149e8aeb");
            } else if (this.e >= 5) {
                x.c(this.c, "大于检测次数");
                this.f.reject("5", "no photo");
            } else if (com.meituan.android.legwork.utils.k.a(this.d)) {
                String str = this.c;
                x.c(str, "检测到" + this.e + "秒时生成文件");
                this.f.resolve(com.meituan.android.legwork.utils.k.c(this.d));
            } else if (this.g != null) {
                String str2 = this.c;
                x.c(str2, "触发下次检测" + this.e);
                this.e = this.e + 1;
                this.g.schedule(this, 1L, TimeUnit.SECONDS);
            }
        }
    }

    @ReactMethod
    public void pickPhoto(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77d66b4a776c3855206cde8f83dbd6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77d66b4a776c3855206cde8f83dbd6ed");
        } else if (getCurrentActivity() == null) {
            promise.reject("1", "invalid activity");
        } else {
            try {
                Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addFlags(1);
                getReactApplicationContext().addActivityEventListener(new ActivityEventListener() { // from class: com.meituan.android.legwork.mrn.bridge.PhotoBridgeModule.2
                    public static ChangeQuickRedirect a;

                    @Override // com.facebook.react.bridge.ActivityEventListener
                    public final void onNewIntent(Intent intent2) {
                    }

                    @Override // com.facebook.react.bridge.ActivityEventListener
                    public final void onActivityResult(Activity activity, int i, int i2, Intent intent2) {
                        Object[] objArr2 = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d87facef94fb83b1bdc59d17ebace1a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d87facef94fb83b1bdc59d17ebace1a");
                        } else if (i != 10003) {
                        } else {
                            PhotoBridgeModule.this.getReactApplicationContext().removeActivityEventListener(this);
                            if (i2 != -1) {
                                promise.reject(PhotoBridgeModule.ERROR_RESULT, "User cancel");
                            } else if (intent2 != null && intent2.getData() != null) {
                                promise.resolve(com.meituan.android.legwork.utils.k.c(intent2.getData()));
                            } else {
                                promise.reject("5", "");
                            }
                        }
                    }
                });
                getCurrentActivity().startActivityForResult(intent, 10003);
            } catch (Exception unused) {
                promise.reject("1", "open album error");
            }
        }
    }

    @ReactMethod
    public void cropPhoto(@Nonnull ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa9affdcbe7cc54639fada6adf33320a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa9affdcbe7cc54639fada6adf33320a");
        } else if (getCurrentActivity() == null) {
            promise.reject("1", "invalid activity");
        } else {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            String valueOf = String.valueOf(hashMap.get("token"));
            if (com.meituan.android.legwork.utils.k.a() && !w.b(valueOf)) {
                promise.reject("2", "READ_EXTERNAL_STORAGE");
                return;
            }
            Uri b = com.meituan.android.legwork.utils.k.b(String.valueOf(hashMap.get(PARAM_INPUT_LOCAL_ID)));
            final Uri a2 = com.meituan.android.legwork.utils.k.a(String.valueOf(hashMap.get(PARAM_OUTPUT_FILE_PATH)), k.a.CROP_PHOTO, valueOf);
            if (!com.meituan.android.legwork.utils.k.d(b) && !com.meituan.android.legwork.utils.k.d(a2)) {
                if (b.getScheme() == null && !TextUtils.isEmpty(b.getPath())) {
                    File file = new File(b.getPath());
                    if (file.exists()) {
                        b = Uri.fromFile(file);
                    }
                }
                Intent intent = new Intent("com.android.camera.action.CROP");
                intent.setDataAndType(b, "image/*");
                intent.putExtra("crop", "true");
                intent.putExtra("scale", true);
                intent.putExtra("scaleUpIfNeeded", true);
                intent.putExtra("return-data", false);
                intent.putExtra("output", a2);
                intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
                intent.addFlags(1);
                try {
                    getReactApplicationContext().addActivityEventListener(new ActivityEventListener() { // from class: com.meituan.android.legwork.mrn.bridge.PhotoBridgeModule.3
                        public static ChangeQuickRedirect a;

                        @Override // com.facebook.react.bridge.ActivityEventListener
                        public final void onNewIntent(Intent intent2) {
                        }

                        @Override // com.facebook.react.bridge.ActivityEventListener
                        public final void onActivityResult(Activity activity, int i, int i2, Intent intent2) {
                            Object[] objArr2 = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d172476b811bdd3678c5e64b51baf5d5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d172476b811bdd3678c5e64b51baf5d5");
                            } else if (i != 10002) {
                            } else {
                                PhotoBridgeModule.this.getReactApplicationContext().removeActivityEventListener(this);
                                if (i2 != -1) {
                                    promise.reject(PhotoBridgeModule.ERROR_RESULT, "User cancel");
                                } else {
                                    promise.resolve(com.meituan.android.legwork.utils.k.c(a2));
                                }
                            }
                        }
                    });
                    getCurrentActivity().startActivityForResult(intent, 10002);
                    return;
                } catch (Exception unused) {
                    promise.reject("1", "open crop error");
                    return;
                }
            }
            promise.reject("3", "invalid uri");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resizePhoto(@javax.annotation.Nonnull com.facebook.react.bridge.ReadableMap r13, com.facebook.react.bridge.Promise r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.legwork.mrn.bridge.PhotoBridgeModule.changeQuickRedirect
            java.lang.String r11 = "46b4a38f7d182dc70c318e411961a306"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            return
        L1e:
            java.util.HashMap r13 = r13.toHashMap()
            java.lang.String r0 = "token"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r1 = com.meituan.android.legwork.utils.k.a()
            if (r1 == 0) goto L41
            boolean r1 = com.meituan.android.legwork.utils.w.b(r0)
            if (r1 != 0) goto L41
            java.lang.String r13 = "2"
            java.lang.String r0 = "READ_EXTERNAL_STORAGE & WRITE_EXTERNAL_STORAGE"
            r14.reject(r13, r0)
            return
        L41:
            java.lang.String r1 = "inputLocalId"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.net.Uri r1 = com.meituan.android.legwork.utils.k.b(r1)
            java.lang.String r2 = "outputFilePath"
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r3 = com.meituan.android.legwork.utils.k.d(r1)
            if (r3 != 0) goto Ld9
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Ld9
            java.lang.String r3 = "resizeMaxSize"
            java.lang.Object r3 = r13.get(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "resizeQuality"
            java.lang.Object r13 = r13.get(r4)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r4 = 100
            r5 = 50
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L92
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L92
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Exception -> L94
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L94
            goto Lb6
        L92:
            r6 = 100
        L94:
            java.lang.String r4 = "PhotoBridgeModule.resizePhoto"
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "错误的压缩参数 size:"
            r9.<init>(r10)
            r9.append(r3)
            java.lang.String r3 = ", quality:"
            r9.append(r3)
            r9.append(r13)
            java.lang.String r13 = r9.toString()
            r7[r8] = r13
            com.meituan.android.legwork.utils.x.c(r4, r7)
            r4 = 50
        Lb6:
            android.graphics.Bitmap r13 = com.meituan.android.legwork.utils.k.a(r1, r6, r0)
            java.io.File r0 = com.meituan.android.legwork.utils.k.a(r2)
            boolean r13 = com.meituan.android.legwork.utils.k.a(r13, r4, r0)
            if (r13 == 0) goto Ld0
            java.lang.String r13 = r0.getAbsolutePath()
            java.lang.String r13 = com.meituan.android.legwork.utils.k.c(r13)
            r14.resolve(r13)
            goto Le1
        Ld0:
            java.lang.String r13 = "1"
            java.lang.String r0 = "压缩图片失败"
            r14.reject(r13, r0)
            return
        Ld9:
            java.lang.String r13 = "3"
            java.lang.String r0 = "invalid uri"
            r14.reject(r13, r0)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.mrn.bridge.PhotoBridgeModule.resizePhoto(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void deletePhoto(@Nonnull ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4964afb8e3e422717e601c3b7de6038f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4964afb8e3e422717e601c3b7de6038f");
            return;
        }
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        String valueOf = String.valueOf(hashMap.get(PARAM_INPUT_LOCAL_ID));
        String valueOf2 = String.valueOf(hashMap.get("token"));
        if (com.meituan.android.legwork.utils.k.a() && !w.b(valueOf2)) {
            promise.reject("2", "WRITE_EXTERNAL_STORAGE");
        } else if (com.meituan.android.legwork.utils.k.b(com.meituan.android.legwork.utils.k.b(valueOf))) {
            promise.resolve(null);
        } else {
            promise.reject("1", "file not found");
        }
    }
}
