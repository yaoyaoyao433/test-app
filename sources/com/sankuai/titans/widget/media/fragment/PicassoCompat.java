package com.sankuai.titans.widget.media.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.util.Log;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.utils.ImageCaptureManager;
import com.sankuai.titans.widget.media.utils.MediaStoreHelper;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import com.squareup.picasso.model.c;
import com.squareup.picasso.model.d;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PicassoCompat {
    public static final String TAG = "PicassoCompat";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int sMaxTextureSize = -1;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IPicassoCompatHeaderHunter {
        HashMap<String, String> getHeaders(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface LoadCallback {
        void onFail();

        void onLoad();

        void onSuccess();
    }

    public static void load(final Picasso picasso, final Uri uri, final ImageView imageView, final LoadCallback loadCallback, final HashMap<String, String> hashMap) {
        Object[] objArr = {picasso, uri, imageView, loadCallback, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8266513ee59885cec20873f38a91cac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8266513ee59885cec20873f38a91cac6");
        } else {
            makeRequestCreator(picasso, uri, hashMap).a(new PicassoDrawableTarget() { // from class: com.sankuai.titans.widget.media.fragment.PicassoCompat.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.squareup.picasso.PicassoDrawableTarget
                public final void onLoadFailed(Exception exc, Drawable drawable) {
                    Object[] objArr2 = {exc, drawable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30e4a5befd33356c7d1698b533bddf6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30e4a5befd33356c7d1698b533bddf6b");
                        return;
                    }
                    super.onLoadFailed(exc, drawable);
                    LoadCallback.this.onFail();
                }

                @Override // com.squareup.picasso.PicassoDrawableTarget
                public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {picassoDrawable, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e2bfd86b522ff394921f72cd67342eda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e2bfd86b522ff394921f72cd67342eda");
                        return;
                    }
                    super.onResourceReady(picassoDrawable, loadedFrom);
                    int maxTextureSize = PicassoCompat.getMaxTextureSize();
                    if (!picassoDrawable.a() && (maxTextureSize < picassoDrawable.getIntrinsicWidth() || maxTextureSize < picassoDrawable.getIntrinsicHeight())) {
                        Target target = new Target() { // from class: com.sankuai.titans.widget.media.fragment.PicassoCompat.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.squareup.picasso.Target
                            public void onPrepareLoad(Drawable drawable) {
                            }

                            @Override // com.squareup.picasso.Target
                            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom2) {
                                Object[] objArr3 = {bitmap, loadedFrom2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4c1a66766b4ebbcc4d7e4b62cfa2b4f7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4c1a66766b4ebbcc4d7e4b62cfa2b4f7");
                                    return;
                                }
                                imageView.setImageBitmap(bitmap);
                                LoadCallback.this.onSuccess();
                            }

                            @Override // com.squareup.picasso.Target
                            public void onBitmapFailed(Drawable drawable) {
                                Object[] objArr3 = {drawable};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4e7882981bf6d2d83f49917050d9ce96", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4e7882981bf6d2d83f49917050d9ce96");
                                } else {
                                    LoadCallback.this.onFail();
                                }
                            }
                        };
                        RequestCreator makeRequestCreator = PicassoCompat.makeRequestCreator(picasso, uri, hashMap);
                        makeRequestCreator.b.p = true;
                        makeRequestCreator.a(target, maxTextureSize, maxTextureSize);
                        return;
                    }
                    imageView.setImageDrawable(picassoDrawable);
                    picassoDrawable.start();
                    LoadCallback.this.onSuccess();
                }

                @Override // com.squareup.picasso.PicassoDrawableTarget
                public final void onLoadStarted(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5ef58e4a6c8cf2f38a24d4d5a8d91a52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5ef58e4a6c8cf2f38a24d4d5a8d91a52");
                        return;
                    }
                    super.onLoadStarted(drawable);
                    LoadCallback.this.onLoad();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RequestCreator makeRequestCreator(@NonNull Picasso picasso, @NonNull Uri uri, HashMap<String, String> hashMap) {
        Object[] objArr = {picasso, uri, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        d dVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83ea532e8736b4a688498717ac0514bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83ea532e8736b4a688498717ac0514bc");
        }
        String uri2 = uri.toString();
        if (URLUtil.isNetworkUrl(uri2)) {
            if (hashMap != null && !hashMap.isEmpty()) {
                c.a aVar = new c.a();
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
                dVar = new d(uri.toString(), aVar.a());
            }
            if (dVar == null) {
                dVar = new d(uri2);
            }
            return picasso.a(dVar);
        }
        return picasso.a(uri);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PicassoCompatBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Context context;

        public PicassoCompatBuilder globalHeadsForUrl(HashMap<String, HashMap<String, String>> hashMap) {
            return this;
        }

        public PicassoCompatBuilder registerHeaderHunter(IPicassoCompatHeaderHunter iPicassoCompatHeaderHunter) {
            return this;
        }

        public PicassoCompatBuilder(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0176378acc5d90f3c829e206a05e5079", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0176378acc5d90f3c829e206a05e5079");
            } else {
                this.context = context.getApplicationContext();
            }
        }

        public Picasso build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8688a0eaccbc6af3d155b0755fc18613", RobustBitConfig.DEFAULT_VALUE) ? (Picasso) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8688a0eaccbc6af3d155b0755fc18613") : Picasso.g(this.context);
        }
    }

    public static void downloadImage(Picasso picasso, String str, HashMap<String, String> hashMap, MediaStoreHelper.SaveImageCallback saveImageCallback) {
        Object[] objArr = {picasso, str, hashMap, saveImageCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "739900cd1f3ba9b5a3f796116ddc1f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "739900cd1f3ba9b5a3f796116ddc1f4e");
        } else {
            downloadImage(picasso, str, hashMap, "", saveImageCallback);
        }
    }

    public static void downloadImage(final Picasso picasso, final String str, final HashMap<String, String> hashMap, final String str2, final MediaStoreHelper.SaveImageCallback saveImageCallback) {
        Object[] objArr = {picasso, str, hashMap, str2, saveImageCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9e13acaddd2b3880fddf38829ff680b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9e13acaddd2b3880fddf38829ff680b");
        } else {
            MediaStoreHelper.saveNetworkImage(new Runnable() { // from class: com.sankuai.titans.widget.media.fragment.PicassoCompat.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ad79fd11553cfc9948cb37ff2399cda6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ad79fd11553cfc9948cb37ff2399cda6");
                        return;
                    }
                    try {
                        File file = PicassoCompat.makeRequestCreator(Picasso.this, Uri.parse(str), hashMap).c(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                        if (file != null && file.exists()) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    File createFile = ImageCaptureManager.createFile(Environment.DIRECTORY_PICTURES);
                                    MediaStoreHelper.saveBitmapToPublicDirectory(saveImageCallback.getContext(), createFile, createFile.getName(), "image/*", fileInputStream, str2);
                                    saveImageCallback.onSuccess(str, Uri.fromFile(createFile));
                                    fileInputStream.close();
                                    return;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        if (th != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th3) {
                                                th.addSuppressed(th3);
                                            }
                                        } else {
                                            fileInputStream.close();
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (Exception unused) {
                                MediaStoreHelper.saveNetworkImage(str, hashMap, str2, saveImageCallback);
                                return;
                            }
                        }
                        MediaStoreHelper.saveNetworkImage(str, hashMap, str2, saveImageCallback);
                    } catch (Throwable unused2) {
                        MediaStoreHelper.saveNetworkImage(str, hashMap, str2, saveImageCallback);
                    }
                }
            });
        }
    }

    public static int getMaxTextureSize() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e2b230f2142e223040c69f2f919ce47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e2b230f2142e223040c69f2f919ce47")).intValue();
        }
        if (sMaxTextureSize != -1) {
            return sMaxTextureSize;
        }
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
            int[] iArr2 = new int[1];
            i = 0;
            for (int i2 = 0; i2 < iArr[0]; i2++) {
                try {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12332, iArr2);
                    if (i < iArr2[0]) {
                        i = iArr2[0];
                    }
                } catch (Throwable unused) {
                    Log.e(TAG, "get max texture size error");
                    int max = Math.max(i, 2048);
                    sMaxTextureSize = max;
                    return max;
                }
            }
            egl10.eglTerminate(eglGetDisplay);
        } catch (Throwable unused2) {
            i = 0;
        }
        int max2 = Math.max(i, 2048);
        sMaxTextureSize = max2;
        return max2;
    }
}
