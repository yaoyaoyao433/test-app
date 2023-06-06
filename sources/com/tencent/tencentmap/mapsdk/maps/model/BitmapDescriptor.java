package com.tencent.tencentmap.mapsdk.maps.model;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class BitmapDescriptor {
    private final BitmapFormator bitmapFormator;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface BitmapFormator {

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes6.dex */
        public @interface BitmapFormatType {
            public static final int FORMAT_ASSET = 2;
            public static final int FORMAT_BITMAP = 7;
            public static final int FORMAT_BITMAPS = 10;
            public static final int FORMAT_DEFAULT = 5;
            public static final int FORMAT_DEFAULT_F = 6;
            public static final int FORMAT_FILE = 3;
            public static final int FORMAT_FONT_TEXT = 9;
            public static final int FORMAT_NONE = -1;
            public static final int FORMAT_PATH = 4;
            public static final int FORMAT_RESOURCE = 1;
            public static final int FORMAT_URL = 8;
        }

        int activeSize();

        Bitmap getBitmap(Context context);

        String getBitmapId();

        int getFormateType();

        int getHeight();

        int getWidth();

        int nextActiveIndex();

        void recycle();

        void setScale(int i);
    }

    public BitmapDescriptor(BitmapFormator bitmapFormator) {
        this.bitmapFormator = bitmapFormator;
    }

    public final String getBDId() {
        return this.bitmapFormator.getBitmapId();
    }

    public final BitmapFormator getFormater() {
        return this.bitmapFormator;
    }

    public final Bitmap getBitmap(Context context) {
        if (this.bitmapFormator == null) {
            return null;
        }
        return this.bitmapFormator.getBitmap(context);
    }

    public final int getWidth() {
        if (this.bitmapFormator == null) {
            return 0;
        }
        return this.bitmapFormator.getWidth();
    }

    public final int getHeight() {
        if (this.bitmapFormator == null) {
            return 0;
        }
        return this.bitmapFormator.getHeight();
    }
}
