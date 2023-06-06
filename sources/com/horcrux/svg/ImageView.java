package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.imagehelper.a;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class ImageView extends RenderableView {
    private static final Pattern mPattern = Pattern.compile("data:image/[\\*a-z]+;base64,([a-zA-Z0-9\\+/=]+)");
    private WeakReference<Bitmap> bitmapWeakReference;
    private String mAlign;
    private SVGLength mH;
    private int mImageHeight;
    private int mImageWidth;
    private final AtomicBoolean mLoading;
    private int mMeetOrSlice;
    private SVGLength mW;
    private SVGLength mX;
    private SVGLength mY;
    private String uriString;

    public ImageView(ReactContext reactContext) {
        super(reactContext);
        this.mLoading = new AtomicBoolean(false);
    }

    @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = RaptorUploaderImpl.SRC)
    public void setSrc(@Nullable ReadableMap readableMap) {
        if (readableMap != null) {
            this.uriString = readableMap.getString(com.meituan.metrics.common.Constants.TRAFFIC_URI);
            if (this.uriString == null || this.uriString.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.mImageWidth = readableMap.getInt("width");
                this.mImageHeight = readableMap.getInt("height");
            } else {
                this.mImageWidth = 0;
                this.mImageHeight = 0;
            }
            if (Uri.parse(this.uriString).getScheme() == null) {
                a.a().c(this.mContext, this.uriString);
            }
        }
    }

    @ReactProp(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
    }

    @ReactProp(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        if (TextUtils.isEmpty(this.uriString) || this.mLoading.get()) {
            return;
        }
        if (this.bitmapWeakReference != null && this.bitmapWeakReference.get() != null) {
            doRender(canvas, paint, this.bitmapWeakReference.get(), f);
        } else {
            loadBitmap(canvas, paint, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        this.mPath = new Path();
        this.mPath.addRect(getRect(), Path.Direction.CW);
        return this.mPath;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadBitmap(final android.graphics.Canvas r6, final android.graphics.Paint r7, final float r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.ImageView.loadBitmap(android.graphics.Canvas, android.graphics.Paint, float):void");
    }

    private ImageSource getImageSource(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ImageSource imageSource = new ImageSource();
        Uri parse = Uri.parse(str);
        if (parse != null && parse.getScheme() != null) {
            if (TextUtils.equals(parse.getScheme(), "data")) {
                Matcher matcher = mPattern.matcher(str);
                if (matcher != null && matcher.find() && !TextUtils.isEmpty(matcher.group(1))) {
                    imageSource.mImageBytes = Base64.decode(matcher.group(1), 0);
                }
            } else if (TextUtils.equals(parse.getScheme(), "file")) {
                File file = new File(str.length() > 7 ? str.substring(7) : null);
                if (!file.exists()) {
                    String name = file.getName();
                    int lastIndexOf = name.lastIndexOf(CommonConstant.Symbol.DOT);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    imageSource.mIsResource = true;
                    imageSource.mResourceId = a.a().a(this.mContext, name);
                } else {
                    imageSource.mSourceUri = parse;
                }
            } else {
                imageSource.mSourceUri = parse;
            }
        } else {
            imageSource.mIsResource = true;
            imageSource.mResourceId = a.a().a(this.mContext, str);
        }
        return imageSource;
    }

    @Nonnull
    private RectF getRect() {
        double relativeOnWidth = relativeOnWidth(this.mX);
        double relativeOnHeight = relativeOnHeight(this.mY);
        double relativeOnWidth2 = relativeOnWidth(this.mW);
        double relativeOnHeight2 = relativeOnHeight(this.mH);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.mImageWidth * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.mImageHeight * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRender(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.mImageWidth == 0 || this.mImageHeight == 0) {
            this.mImageWidth = bitmap.getWidth();
            this.mImageHeight = bitmap.getHeight();
        }
        RectF rect = getRect();
        RectF rectF = new RectF(0.0f, 0.0f, this.mImageWidth, this.mImageHeight);
        ViewBox.getTransform(rectF, rect, this.mAlign, this.mMeetOrSlice).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class ImageSource {
        private byte[] mImageBytes;
        private boolean mIsResource;
        private int mResourceId;
        private Uri mSourceUri;

        private ImageSource() {
        }
    }
}
