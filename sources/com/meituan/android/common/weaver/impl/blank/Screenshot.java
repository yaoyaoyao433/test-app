package com.meituan.android.common.weaver.impl.blank;

import android.graphics.Bitmap;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface Screenshot {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ScreenshotDoneListener {
        @AnyThread
        void onScreenshotDone(int i, @Nullable Bitmap bitmap);
    }

    void destroy();

    void screenShot(@NonNull Window window, @NonNull View view, @NonNull ScreenshotDoneListener screenshotDoneListener);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SubBitmap {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NonNull
        public Bitmap bitmap;
        public int x;
        public int y;

        public SubBitmap(int i, int i2, @NonNull Bitmap bitmap) {
            this.x = i;
            this.y = i2;
            this.bitmap = bitmap;
        }
    }
}
