package com.taobao.gcanvas.adapters.img.impl.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.taobao.gcanvas.adapters.img.IGImageLoader;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GCanvasPicassoImageLoader implements IGImageLoader {
    @Override // com.taobao.gcanvas.adapters.img.IGImageLoader
    public void load(Context context, String str, IGImageLoader.ImageCallback imageCallback) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                imageCallback.onSuccess(Picasso.g(context).d(str).j());
                return;
            } catch (Exception unused) {
                imageCallback.onFail(null);
                return;
            }
        }
        Picasso.g(context).d(str).a(new ImageTarget(imageCallback));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class ImageTarget implements Target {
        private IGImageLoader.ImageCallback callback;

        @Override // com.squareup.picasso.Target
        public void onPrepareLoad(Drawable drawable) {
        }

        ImageTarget(IGImageLoader.ImageCallback imageCallback) {
            this.callback = imageCallback;
        }

        @Override // com.squareup.picasso.Target
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this.callback.onSuccess(bitmap);
        }

        @Override // com.squareup.picasso.Target
        public void onBitmapFailed(Drawable drawable) {
            this.callback.onFail(null);
        }
    }
}
