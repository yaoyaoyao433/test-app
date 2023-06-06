package com.facebook.react.views.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.dianping.picasso.PicassoUtils;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.m;
import com.facebook.react.o;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.e;
import com.facebook.react.uimanager.w;
import com.meituan.dio.easy.DioFile;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.config.WaimaiLauncherSP;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawableImageViewTarget;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.model.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class RCTRoundImageView extends ImageView {
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int FREQUENT_SIZE_CHANGE_INTERVAL = 1000;
    private static final String TAG = "RCTRoundImageView";
    private static final int TYPE_CIRCLE = 1;
    private static final int TYPE_NORMAL = 0;
    private static final int TYPE_ROUND = 2;
    private static String imgFilePath;
    private Bitmap mBitmap;
    private final Paint mBitmapPaint;
    private int mBlurRadius;
    private int mBorderColor;
    private final Paint mBorderPaint;
    private int mBorderWidth;
    private Rect mCapInsets;
    private a mDirtyState;
    private DiskCacheStrategy mDiskCacheStrategy;
    private boolean mEnableShrink;
    private int mFadeDuration;
    private boolean mFailedToLoadTransformedSource;
    private com.squareup.picasso.model.a mHeaders;
    private float mHeight;
    private c mImageSource;
    private long mLastChangeSizeTIme;
    private int mLastHeight;
    private int mLastWidth;
    private String mMethod;
    private final Path mPath;
    private Drawable mPlaceHolder;
    private float[] mRoundedCornerRadius;
    private boolean mShrinkGif;
    private float mShrinkRatio;
    private boolean mSkipMemoryCache;
    private boolean mTransformToWebp;
    private Uri mTransformedSource;
    private int mType;
    private float mWidth;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        UNDEFINE,
        DIRTY,
        CLEAN
    }

    public RCTRoundImageView(Context context) {
        super(context);
        this.mDirtyState = a.UNDEFINE;
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mPath = new Path();
        this.mBlurRadius = 0;
        this.mFailedToLoadTransformedSource = false;
        this.mLastWidth = -1;
        this.mLastHeight = -1;
        this.mLastChangeSizeTIme = -1L;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mImageSource = new c(context);
        this.mDiskCacheStrategy = DiskCacheStrategy.SOURCE;
        this.mSkipMemoryCache = true;
        this.mBorderColor = 0;
        this.mBitmapPaint.setAntiAlias(true);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setStrokeJoin(Paint.Join.ROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirtyState(a aVar) {
        this.mDirtyState = aVar;
    }

    public void setSource(ReadableArray readableArray) {
        boolean z;
        if (readableArray == null || readableArray.size() <= 0) {
            return;
        }
        ReadableMap map = readableArray.getMap(0);
        String string = (map == null || !map.hasKey(Constants.TRAFFIC_URI)) ? null : map.getString(Constants.TRAFFIC_URI);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (map != null && map.hasKey("sceneToken") && !TextUtils.equals(map.getString("sceneToken"), this.mImageSource.k)) {
            this.mImageSource.k = map.getString("sceneToken");
        }
        if (this.mImageSource.a == null || !string.equals(this.mImageSource.a.toString())) {
            this.mImageSource.a();
            this.mImageSource.a(string);
            z = true;
        } else {
            z = false;
        }
        if (map.hasKey("width") && map.getDouble("width") != this.mImageSource.b) {
            this.mImageSource.b = map.getDouble("width");
            z = true;
        }
        if (map.hasKey("height") && map.getDouble("height") != this.mImageSource.c) {
            this.mImageSource.c = map.getDouble("height");
            z = true;
        }
        if (z) {
            setDirtyState(a.DIRTY);
            this.mTransformedSource = null;
            this.mFailedToLoadTransformedSource = false;
        }
    }

    public void setNinePatchSource(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() <= 0) {
            return;
        }
        ReadableMap map = readableArray.getMap(0);
        String str = null;
        if (map != null && map.hasKey(Constants.TRAFFIC_URI)) {
            str = map.getString(Constants.TRAFFIC_URI);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setBackgroundResource(getResourceDrawableId(str).intValue());
    }

    public void setCapInsets(ReadableMap readableMap) {
        if (readableMap != null) {
            this.mCapInsets = new Rect(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
        } else {
            this.mCapInsets = null;
        }
        setDirtyState(a.DIRTY);
    }

    @NonNull
    private Integer getResourceDrawableId(@NonNull String str) {
        if (str == null || "".equalsIgnoreCase(str)) {
            return 0;
        }
        return Integer.valueOf(getResources().getIdentifier(str.toLowerCase().replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE), PicassoUtils.DEF_TYPE, getContext().getApplicationContext().getPackageName()));
    }

    public void setRoundAsCircle(boolean z) {
        if (z) {
            this.mType = 1;
        }
    }

    public void setRoundedCornerRadius(float f, float f2, float f3, float f4) {
        if (e.a(f, 0.0f) && e.a(f2, 0.0f) && e.a(f3, 0.0f) && e.a(f4, 0.0f)) {
            return;
        }
        this.mType = 2;
        if (this.mRoundedCornerRadius == null) {
            this.mRoundedCornerRadius = new float[8];
            Arrays.fill(this.mRoundedCornerRadius, 0.0f);
        }
        this.mRoundedCornerRadius[0] = f;
        this.mRoundedCornerRadius[1] = f;
        this.mRoundedCornerRadius[2] = f2;
        this.mRoundedCornerRadius[3] = f2;
        this.mRoundedCornerRadius[4] = f3;
        this.mRoundedCornerRadius[5] = f3;
        this.mRoundedCornerRadius[6] = f4;
        this.mRoundedCornerRadius[7] = f4;
    }

    public void setLoadingIndicatorSource(String str) {
        this.mImageSource.b(str);
        setDirtyState(a.DIRTY);
    }

    public void setHeaders(ReadableMap readableMap) {
        if (this.mHeaders == null) {
            c.a aVar = new c.a();
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                aVar.a(next.getKey(), String.valueOf(next.getValue()));
            }
            this.mHeaders = aVar.a();
        }
    }

    public void setMethod(String str) {
        this.mMethod = str;
    }

    private Uri computeUri(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void setPlaceHolder(String str, String str2) {
        Uri computeUri = computeUri(str);
        if (computeUri == null || computeUri.getScheme() == null) {
            this.mImageSource.b(str);
            setDirtyState(a.DIRTY);
            return;
        }
        com.facebook.react.a.a(getContext().getApplicationContext()).a(computeUri, str2, new a.InterfaceC0141a() { // from class: com.facebook.react.views.image.RCTRoundImageView.1
            @Override // com.facebook.react.a.InterfaceC0141a
            public final void onSuccess(Drawable drawable) {
                RCTRoundImageView.this.mPlaceHolder = drawable;
                boolean z = RCTRoundImageView.this.mDirtyState != a.DIRTY;
                RCTRoundImageView.this.setDirtyState(a.DIRTY);
                if (z) {
                    if (UiThreadUtil.isOnUiThread()) {
                        RCTRoundImageView.this.maybeUpdateView();
                    } else {
                        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.image.RCTRoundImageView.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                RCTRoundImageView.this.maybeUpdateView();
                            }
                        });
                    }
                }
            }

            @Override // com.facebook.react.a.InterfaceC0141a
            public final void onFailure(Exception exc) {
                ((UIManagerModule) ((ReactContext) RCTRoundImageView.this.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(com.facebook.react.views.image.a.a(RCTRoundImageView.this.getId(), 1, (RCTRoundImageView.this.mImageSource == null || RCTRoundImageView.this.mImageSource.a == null) ? null : RCTRoundImageView.this.mImageSource.a.toString(), 0, 0, exc.getMessage()));
            }
        });
    }

    public void setError(String str) {
        this.mImageSource.c(str);
        setDirtyState(a.DIRTY);
    }

    public void skipMemoryCache(boolean z) {
        this.mSkipMemoryCache = z;
    }

    public void setDiskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
        this.mDiskCacheStrategy = diskCacheStrategy;
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
    }

    public void setBorderWidth(float f) {
        this.mBorderWidth = (int) (w.a(f) + 0.5d);
    }

    public void setFadeDuration(int i) {
        this.mFadeDuration = i;
    }

    public void setBlurRadius(float f) {
        int a2 = (int) w.a(f);
        if (this.mBlurRadius != a2) {
            this.mBlurRadius = a2;
            setDirtyState(a.DIRTY);
        }
    }

    private Picasso getPicasso() {
        return Picasso.g(getContext().getApplicationContext());
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() == drawable) {
            return;
        }
        super.setImageDrawable(drawable);
        this.mBitmap = com.facebook.react.a.a(drawable, true);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        super.setImageResource(i);
        this.mBitmap = com.facebook.react.a.a(getDrawable(), true);
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        Rect rect = new Rect();
        getDrawingRect(rect);
        canvas.clipRect(rect);
        try {
            Bitmap bitmap = this.mBitmap;
            if (this.mType == 0) {
                super.onDraw(canvas);
            } else {
                setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (bitmap != null) {
                    this.mBitmapPaint.setAlpha(255);
                    this.mBitmapPaint.setStyle(Paint.Style.FILL);
                    Paint paint = this.mBitmapPaint;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    this.mBitmapPaint.getShader().setLocalMatrix(getShaderMatrix(bitmap));
                } else {
                    this.mBitmapPaint.setAlpha(0);
                    this.mBitmapPaint.setStrokeWidth(0.0f);
                    this.mBitmapPaint.setStyle(Paint.Style.STROKE);
                    this.mBitmapPaint.setShader(null);
                }
                RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                rectF.inset(this.mBorderWidth, this.mBorderWidth);
                if (this.mType == 2) {
                    this.mPath.reset();
                    this.mPath.addRoundRect(rectF, this.mRoundedCornerRadius, Path.Direction.CW);
                    canvas.drawPath(this.mPath, this.mBitmapPaint);
                } else if (this.mType == 1) {
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), this.mBitmapPaint);
                }
            }
            if (this.mBorderWidth > 0) {
                RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                this.mBorderPaint.setColor(this.mBorderColor);
                this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
                if (this.mType == 0) {
                    canvas.drawRect(rectF2, this.mBorderPaint);
                } else if (this.mType == 2) {
                    this.mPath.reset();
                    this.mPath.addRoundRect(rectF2, this.mRoundedCornerRadius, Path.Direction.CW);
                    canvas.drawPath(this.mPath, this.mBorderPaint);
                } else if (this.mType == 1) {
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((rectF2.height() - this.mBorderWidth) / 2.0f, (rectF2.width() - this.mBorderWidth) / 2.0f), this.mBorderPaint);
                }
            }
        } catch (OutOfMemoryError unused) {
            recycleBitmapForOOM();
        } catch (RuntimeException unused2) {
            recycleBitmapForOOM();
        }
    }

    private Matrix getShaderMatrix(Bitmap bitmap) {
        float width;
        float f;
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = 0.0f;
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        rectF.inset(this.mBorderWidth, this.mBorderWidth);
        Matrix matrix = new Matrix();
        float f3 = width2;
        float f4 = height;
        if (rectF.height() * f3 > rectF.width() * f4) {
            width = rectF.height() / f4;
            f = (rectF.width() - (f3 * width)) * 0.5f;
        } else {
            width = rectF.width() / f3;
            f2 = (rectF.height() - (f4 * width)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate(((int) (f + 0.5f)) + rectF.left, ((int) (f2 + 0.5f)) + rectF.top);
        return matrix;
    }

    private void recycleBitmapForOOM() {
        if (this.mBitmap != null && !this.mBitmap.isRecycled()) {
            this.mBitmap.recycle();
            this.mBitmap = null;
        }
        this.mBitmapPaint.setShader(null);
        recycleDrawable(getDrawable());
        super.setImageDrawable(null);
        recycleDrawable(getBackground());
        super.setBackground(null);
        getPicasso().c();
    }

    private void recycleDrawable(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends PicassoDrawableImageViewTarget {
        private c b;
        private RCTRoundImageView c;

        public b(RCTRoundImageView rCTRoundImageView, c cVar) {
            super(rCTRoundImageView);
            this.b = cVar;
            this.c = rCTRoundImageView;
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadStarted(Drawable drawable) {
            super.onLoadStarted(drawable);
            a(4, null, null, "");
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadFailed(Exception exc, Drawable drawable) {
            super.onLoadFailed(exc, drawable);
            if (this.c != null && this.c.mTransformedSource != null) {
                this.c.mFailedToLoadTransformedSource = true;
                this.c.mTransformedSource = null;
                this.c.setDirtyState(a.DIRTY);
                this.c.maybeUpdateView();
                Object[] objArr = new Object[2];
                objArr[0] = this.b != null ? this.b.j : "Unknown";
                objArr[1] = this.c.mTransformedSource;
                com.facebook.common.logging.a.b(RCTRoundImageView.TAG, String.format("加载Venus图片失败, 转换前链接: %s, 转换后链接: %s", objArr));
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            if (this.b != null) {
                String str = this.b.j;
                stringBuffer.append("\r\nsourceUri: ");
                stringBuffer.append(str);
                stringBuffer.append("\r\nisResource: ");
                stringBuffer.append(this.b.g);
                if (this.b.g) {
                    stringBuffer.append("\r\ngetResourceId: ");
                    stringBuffer.append(this.b.d);
                    try {
                        File file = new File(Uri.parse(str).getPath());
                        stringBuffer.append("\r\nexist(");
                        stringBuffer.append(file.getAbsolutePath());
                        stringBuffer.append("):");
                        stringBuffer.append(file.exists());
                    } catch (Throwable th) {
                        stringBuffer.append("\r\nthrowable:");
                        stringBuffer.append(Log.getStackTraceString(th));
                    }
                }
                stringBuffer.append(StringUtil.CRLF_STRING);
                stringBuffer.append(Log.getStackTraceString(exc));
                a(1, null, str, stringBuffer.toString());
                com.facebook.common.logging.a.b("RCTRoundImageView@onLoadError", stringBuffer.toString(), exc);
                RCTRoundImageView.reportFileNotFound(exc, this.b);
            }
            a(null);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        @Override // com.squareup.picasso.PicassoDrawableTarget
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onResourceReady(com.squareup.picasso.PicassoDrawable r10, com.squareup.picasso.Picasso.LoadedFrom r11) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.RCTRoundImageView.b.onResourceReady(com.squareup.picasso.PicassoDrawable, com.squareup.picasso.Picasso$LoadedFrom):void");
        }

        private void a(Drawable drawable) {
            a(3, drawable, null, "");
        }

        private void a(int i, Drawable drawable, String str, String str2) {
            if (this.c != null) {
                int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
                int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
                com.facebook.react.uimanager.events.c eventDispatcher = ((UIManagerModule) ((ReactContext) this.c.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
                int id = this.c.getId();
                if (str == null) {
                    str = a();
                }
                eventDispatcher.a(com.facebook.react.views.image.a.a(id, i, str, intrinsicWidth, intrinsicHeight, str2));
            }
        }

        private String a() {
            if (this.b == null || this.b.a == null) {
                return null;
            }
            return this.b.a.toString();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private Uri handleRemoteImage(Uri uri) {
        if (!this.mEnableShrink || this.mFailedToLoadTransformedSource || this.mCapInsets != null || this.mWidth <= 0.0f || this.mHeight <= 0.0f) {
            return uri;
        }
        if (uri.getPath() == null || !uri.getPath().contains("_1_")) {
            Uri a2 = m.a().a(uri, this.mWidth, this.mHeight);
            return a2 != null ? a2 : o.a(uri, (int) Math.ceil(this.mWidth * this.mShrinkRatio), (int) Math.ceil(this.mHeight * this.mShrinkRatio), this.mShrinkGif, this.mTransformToWebp);
        }
        return uri;
    }

    public void setShrinkRatio(float f) {
        this.mShrinkRatio = f;
    }

    public void setTransformToWebp(boolean z) {
        this.mTransformToWebp = z;
    }

    public void setShrinkGif(boolean z) {
        this.mShrinkGif = z;
    }

    public void setEnableShrink(boolean z) {
        this.mEnableShrink = z;
    }

    public void setWidth(float f) {
        if (f != this.mWidth) {
            this.mTransformedSource = null;
            setDirtyState(a.DIRTY);
        }
        this.mWidth = f;
    }

    public void setHeight(float f) {
        if (f != this.mHeight) {
            this.mTransformedSource = null;
            setDirtyState(a.DIRTY);
        }
        this.mHeight = f;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.mLastHeight != i6 || this.mLastWidth != i5) {
            if (System.currentTimeMillis() - this.mLastChangeSizeTIme < 1000) {
                this.mFailedToLoadTransformedSource = true;
            }
            this.mLastWidth = i5;
            this.mLastHeight = i6;
            this.mLastChangeSizeTIme = System.currentTimeMillis();
        }
        Object[] objArr = {this};
        ChangeQuickRedirect changeQuickRedirect = com.sankuai.waimai.launcher.util.aop.a.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29b70fb929d06e79bdfb08a3c2133dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29b70fb929d06e79bdfb08a3c2133dee");
        } else if (WaimaiLauncherSP.l()) {
        } else {
            com.sankuai.waimai.launcher.util.aop.a.a(this);
            maybeUpdateView();
        }
    }

    public boolean isFailedToLoadTransformedSource() {
        return this.mFailedToLoadTransformedSource;
    }

    public c getImageSource() {
        return this.mImageSource;
    }

    public Uri getTransformedSource() {
        return this.mTransformedSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportFileNotFound(Exception exc, c cVar) {
        DioFile[] m;
        try {
            if (exc instanceof FileNotFoundException) {
                Uri uri = cVar.a;
                StringBuilder sb = new StringBuilder();
                DioFile f = com.meituan.android.mrn.util.b.b(uri).f();
                if (TextUtils.isEmpty(imgFilePath) || !imgFilePath.equals(f.h())) {
                    imgFilePath = f.h();
                    if (f.c() && f.j() && (m = f.m()) != null) {
                        sb.append("当前bundle图片数量:");
                        sb.append(m.length);
                    }
                    com.facebook.common.logging.a.d("RCTRoundImageView@reportFileNotFound", sb.toString(), exc);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void maybeUpdateView() {
        com.sankuai.waimai.manipulator.runtime.a a2;
        RequestCreator requestCreator;
        RequestCreator a3;
        Object[] objArr = {this};
        ChangeQuickRedirect changeQuickRedirect = com.sankuai.waimai.launcher.util.aop.a.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59121b8b830d4e74a92335070007005d", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.waimai.manipulator.runtime.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59121b8b830d4e74a92335070007005d");
        } else if (WaimaiLauncherSP.l()) {
            a2 = com.sankuai.waimai.manipulator.runtime.a.a();
        } else if (getWidth() <= 0 && com.sankuai.waimai.launcher.util.aop.a.a(getImageSource())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.manipulator.runtime.a.a;
            a2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b8614a8db8a63896ac96d258401e1c93", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.manipulator.runtime.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b8614a8db8a63896ac96d258401e1c93") : com.sankuai.waimai.manipulator.runtime.a.a(null);
        } else {
            com.sankuai.waimai.launcher.util.aop.a.a(this);
            a2 = com.sankuai.waimai.manipulator.runtime.a.a();
        }
        if (a2.b && this.mDirtyState == a.DIRTY) {
            Uri uri = this.mImageSource.a;
            this.mTransformedSource = null;
            if (this.mImageSource.h) {
                requestCreator = com.facebook.react.a.a(getContext().getApplicationContext(), this.mImageSource.a);
            } else if (uri != null) {
                Uri handleRemoteImage = handleRemoteImage(uri);
                if (!uri.equals(handleRemoteImage)) {
                    com.facebook.common.logging.a.a(TAG, String.format("[MRN图片缩略] 转换前链接: %s, 转换后链接: %s", uri, handleRemoteImage));
                    this.mTransformedSource = handleRemoteImage;
                    uri = handleRemoteImage;
                }
                if (this.mHeaders == null) {
                    a3 = getPicasso().a(uri);
                } else {
                    if (TextUtils.isEmpty(this.mMethod)) {
                        this.mMethod = "GET";
                    }
                    a3 = getPicasso().a(new com.squareup.picasso.model.d(uri.toString(), this.mHeaders));
                }
                com.facebook.common.logging.a.b(TAG, String.format("[MRN图片缩略] 加载图片: %s", uri));
                requestCreator = a3;
            } else if (this.mImageSource.g && this.mImageSource.d > 0) {
                requestCreator = getPicasso().a(this.mImageSource.d);
            } else if (this.mImageSource.i != null) {
                requestCreator = getPicasso().a(this.mImageSource.i);
            } else {
                com.facebook.common.logging.a.b(TAG, "sourceUri is null");
                requestCreator = null;
            }
            if (requestCreator != null) {
                if (this.mImageSource.e == 0) {
                    if (this.mPlaceHolder != null) {
                        requestCreator.i = this.mPlaceHolder;
                    } else {
                        requestCreator.e = false;
                    }
                } else {
                    requestCreator.f = this.mImageSource.e;
                }
                if (this.mImageSource.f != 0) {
                    requestCreator.g = this.mImageSource.f;
                }
                if (this.mImageSource.b != 0.0d && this.mImageSource.c != 0.0d) {
                    requestCreator.b((int) (this.mImageSource.b + 0.5d), (int) (this.mImageSource.c + 0.5d));
                }
                if (this.mFadeDuration != 0) {
                    requestCreator.h();
                }
                if (this.mBlurRadius > 0) {
                    requestCreator.a(new com.facebook.react.views.image.blur.a(getContext(), this.mBlurRadius, 1));
                }
                requestCreator.a(this.mSkipMemoryCache);
                requestCreator.k = this.mDiskCacheStrategy;
                requestCreator.a(this, null, 0, new b(this, this.mImageSource));
            }
            setDirtyState(a.CLEAN);
        }
    }
}
