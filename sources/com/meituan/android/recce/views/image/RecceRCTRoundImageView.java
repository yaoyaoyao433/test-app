package com.meituan.android.recce.views.image;

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
import com.facebook.react.views.image.b;
import com.meituan.dio.easy.DioFile;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawableImageViewTarget;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.model.a;
import com.squareup.picasso.model.c;
import com.squareup.picasso.model.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class RecceRCTRoundImageView extends ImageView {
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int FREQUENT_SIZE_CHANGE_INTERVAL = 1000;
    private static final String TAG = "RecceRCTRoundImageView";
    private static final int TYPE_CIRCLE = 1;
    private static final int TYPE_NORMAL = 0;
    private static final int TYPE_ROUND = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String imgFilePath;
    private Bitmap mBitmap;
    private final Paint mBitmapPaint;
    private int mBlurRadius;
    private int mBorderColor;
    private final Paint mBorderPaint;
    private int mBorderWidth;
    private Rect mCapInsets;
    private DirtyState mDirtyState;
    private DiskCacheStrategy mDiskCacheStrategy;
    private boolean mEnableShrink;
    private int mFadeDuration;
    private boolean mFailedToLoadTransformedSource;
    private a mHeaders;
    private float mHeight;
    private RecceImageSource mImageSource;
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

    public RecceRCTRoundImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4323613a96c1e22a4cab3b091715e91a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4323613a96c1e22a4cab3b091715e91a");
            return;
        }
        this.mDirtyState = DirtyState.UNDEFINE;
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
        setScaleType(b.a());
        this.mImageSource = new RecceImageSource(context);
        this.mDiskCacheStrategy = DiskCacheStrategy.SOURCE;
        this.mSkipMemoryCache = true;
        this.mBorderColor = 0;
        this.mBitmapPaint.setAntiAlias(true);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setStrokeJoin(Paint.Join.ROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirtyState(DirtyState dirtyState) {
        this.mDirtyState = dirtyState;
    }

    public void setSource(ReadableArray readableArray) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc1f63142ae5b98373a8028d2d9953c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc1f63142ae5b98373a8028d2d9953c4");
        } else if (readableArray == null || readableArray.size() <= 0) {
        } else {
            ReadableMap map = readableArray.getMap(0);
            String string = (map == null || !map.hasKey(Constants.TRAFFIC_URI)) ? null : map.getString(Constants.TRAFFIC_URI);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (this.mImageSource.getSourceUri() == null || !string.equals(this.mImageSource.getSourceUri().toString())) {
                this.mImageSource.reset();
                this.mImageSource.setSource(string);
                z = true;
            } else {
                z = false;
            }
            if (map.hasKey("width") && map.getDouble("width") != this.mImageSource.getWidth()) {
                this.mImageSource.setWidth(map.getDouble("width"));
                z = true;
            }
            if (!map.hasKey("height") || map.getDouble("height") == this.mImageSource.getHeight()) {
                z2 = z;
            } else {
                this.mImageSource.setHeight(map.getDouble("height"));
            }
            if (z2) {
                setDirtyState(DirtyState.DIRTY);
                this.mTransformedSource = null;
                this.mFailedToLoadTransformedSource = false;
            }
        }
    }

    public void setNinePatchSource(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd6e710321f17a9d3ea081ecd0deb4f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd6e710321f17a9d3ea081ecd0deb4f8");
        } else if (readableArray == null || readableArray.size() <= 0) {
        } else {
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
    }

    public void setCapInsets(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7857f706e8921ca029c0fc556b3007b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7857f706e8921ca029c0fc556b3007b");
            return;
        }
        if (readableMap != null) {
            this.mCapInsets = new Rect(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
        } else {
            this.mCapInsets = null;
        }
        setDirtyState(DirtyState.DIRTY);
    }

    @NonNull
    private Integer getResourceDrawableId(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ace61f79bd6db288a37f581bfca14bff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ace61f79bd6db288a37f581bfca14bff");
        }
        if (str != null && !"".equalsIgnoreCase(str)) {
            return Integer.valueOf(getResources().getIdentifier(str.toLowerCase().replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE), PicassoUtils.DEF_TYPE, getContext().getApplicationContext().getPackageName()));
        }
        return 0;
    }

    public void setRoundAsCircle(boolean z) {
        if (z) {
            this.mType = 1;
        }
    }

    public void setRoundedCornerRadius(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b394ce8cf1fe7769414ab262a8bef54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b394ce8cf1fe7769414ab262a8bef54");
        } else if (e.a(f, 0.0f) && e.a(f2, 0.0f) && e.a(f3, 0.0f) && e.a(f4, 0.0f)) {
        } else {
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
    }

    public void setLoadingIndicatorSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e7e94b6dcc198be34aabc54e119839a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e7e94b6dcc198be34aabc54e119839a");
            return;
        }
        this.mImageSource.setPlaceHolderResource(str);
        setDirtyState(DirtyState.DIRTY);
    }

    public void setHeaders(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cf18913f6479526db0a617cce62df2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cf18913f6479526db0a617cce62df2e");
        } else if (this.mHeaders == null) {
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
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b295da8260ad424e8717c5401fdb647a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b295da8260ad424e8717c5401fdb647a");
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void setPlaceHolder(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfcc6cf42d9a6096cf76e725a18167bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfcc6cf42d9a6096cf76e725a18167bf");
            return;
        }
        Uri computeUri = computeUri(str);
        if (computeUri != null && computeUri.getScheme() != null) {
            com.facebook.react.a.a(getContext().getApplicationContext()).a(computeUri, str2, new a.InterfaceC0141a() { // from class: com.meituan.android.recce.views.image.RecceRCTRoundImageView.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.facebook.react.a.InterfaceC0141a
                public void onSuccess(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5adcaa4ad3890b7af2905ea7928ecbef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5adcaa4ad3890b7af2905ea7928ecbef");
                        return;
                    }
                    RecceRCTRoundImageView.this.mPlaceHolder = drawable;
                    boolean z = RecceRCTRoundImageView.this.mDirtyState != DirtyState.DIRTY;
                    RecceRCTRoundImageView.this.setDirtyState(DirtyState.DIRTY);
                    if (z) {
                        if (UiThreadUtil.isOnUiThread()) {
                            RecceRCTRoundImageView.this.maybeUpdateView();
                        } else {
                            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.recce.views.image.RecceRCTRoundImageView.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "38b22fa0ea4d1551439617ff2f277858", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "38b22fa0ea4d1551439617ff2f277858");
                                    } else {
                                        RecceRCTRoundImageView.this.maybeUpdateView();
                                    }
                                }
                            });
                        }
                    }
                }

                @Override // com.facebook.react.a.InterfaceC0141a
                public void onFailure(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c6b09f98790b96d05af847645a6a9ba2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c6b09f98790b96d05af847645a6a9ba2");
                    } else {
                        ((UIManagerModule) ((ReactContext) RecceRCTRoundImageView.this.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(com.facebook.react.views.image.a.a(RecceRCTRoundImageView.this.getId(), 1, (RecceRCTRoundImageView.this.mImageSource == null || RecceRCTRoundImageView.this.mImageSource.getSourceUri() == null) ? null : RecceRCTRoundImageView.this.mImageSource.getSourceUri().toString(), 0, 0, exc.getMessage()));
                    }
                }
            });
            return;
        }
        this.mImageSource.setPlaceHolderResource(str);
        setDirtyState(DirtyState.DIRTY);
    }

    public void setError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53faaee5d44a195ce5d4e8e901b538bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53faaee5d44a195ce5d4e8e901b538bc");
            return;
        }
        this.mImageSource.setErrorResource(str);
        setDirtyState(DirtyState.DIRTY);
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
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce94e44e1280f032fe81caea1ea21142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce94e44e1280f032fe81caea1ea21142");
        } else {
            this.mBorderWidth = (int) (w.a(f) + 0.5d);
        }
    }

    public void setFadeDuration(int i) {
        this.mFadeDuration = i;
    }

    public void setBlurRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c3dab80d874a77209116bacd9f680dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c3dab80d874a77209116bacd9f680dc");
            return;
        }
        int a = (int) w.a(f);
        if (this.mBlurRadius != a) {
            this.mBlurRadius = a;
            setDirtyState(DirtyState.DIRTY);
        }
    }

    public void maybeUpdateView() {
        RequestCreator requestCreator;
        RequestCreator a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a976bffb579cf8bcfa053f6f2c246ccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a976bffb579cf8bcfa053f6f2c246ccd");
        } else if (this.mDirtyState == DirtyState.DIRTY) {
            Uri sourceUri = this.mImageSource.getSourceUri();
            this.mTransformedSource = null;
            if (this.mImageSource.isDioImage()) {
                requestCreator = com.facebook.react.a.a(getContext().getApplicationContext(), this.mImageSource.getSourceUri());
            } else if (sourceUri != null) {
                Uri handleRemoteImage = handleRemoteImage(sourceUri);
                if (!sourceUri.equals(handleRemoteImage)) {
                    com.facebook.common.logging.a.a(TAG, String.format("[MRN图片缩略] 转换前链接: %s, 转换后链接: %s", sourceUri, handleRemoteImage));
                    this.mTransformedSource = handleRemoteImage;
                    sourceUri = handleRemoteImage;
                }
                if (this.mHeaders == null) {
                    a = getPicasso().a(sourceUri);
                } else {
                    if (TextUtils.isEmpty(this.mMethod)) {
                        this.mMethod = "GET";
                    }
                    a = getPicasso().a(new d(sourceUri.toString(), this.mHeaders));
                }
                com.facebook.common.logging.a.b(TAG, String.format("[MRN图片缩略] 加载图片: %s", sourceUri));
                requestCreator = a;
            } else if (this.mImageSource.isResource() && this.mImageSource.getResourceId() > 0) {
                requestCreator = getPicasso().a(this.mImageSource.getResourceId());
            } else if (this.mImageSource.getImageBytes() != null) {
                requestCreator = getPicasso().a(this.mImageSource.getImageBytes());
            } else {
                com.facebook.common.logging.a.b(TAG, "sourceUri is null");
                requestCreator = null;
            }
            if (requestCreator != null) {
                if (this.mImageSource.getPlaceHolderDrawableId() != 0) {
                    requestCreator.a(this.mImageSource.getPlaceHolderDrawableId());
                } else if (this.mPlaceHolder != null) {
                    requestCreator.a(this.mPlaceHolder);
                } else {
                    requestCreator.a();
                }
                if (this.mImageSource.getErrorDrawableId() != 0) {
                    requestCreator.b(this.mImageSource.getErrorDrawableId());
                }
                if (this.mImageSource.getWidth() != 0.0d && this.mImageSource.getHeight() != 0.0d) {
                    requestCreator.b((int) (this.mImageSource.getWidth() + 0.5d), (int) (this.mImageSource.getHeight() + 0.5d));
                }
                if (this.mFadeDuration != 0) {
                    requestCreator.h();
                }
                if (this.mBlurRadius > 0) {
                    requestCreator.a(new com.facebook.react.views.image.blur.a(getContext(), this.mBlurRadius, 1));
                }
                requestCreator.a(this.mSkipMemoryCache);
                requestCreator.a(this.mDiskCacheStrategy);
                requestCreator.a(this, null, 0, new ReactDrawableTarget(this, this.mImageSource));
            }
            setDirtyState(DirtyState.CLEAN);
        }
    }

    private Picasso getPicasso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d74e5ba6aada221dbe0e6205a82d33f", RobustBitConfig.DEFAULT_VALUE) ? (Picasso) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d74e5ba6aada221dbe0e6205a82d33f") : Picasso.g(getContext().getApplicationContext());
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d5e772bb5ee3e1ebb3d9bf681c605a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d5e772bb5ee3e1ebb3d9bf681c605a");
        } else if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            this.mBitmap = com.facebook.react.a.a(drawable, true);
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "863f072a5bd87abc5999a3daab03a0fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "863f072a5bd87abc5999a3daab03a0fd");
            return;
        }
        super.setImageResource(i);
        this.mBitmap = com.facebook.react.a.a(getDrawable(), true);
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c7a05e69c4f3afdbdcc1459445aaefc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c7a05e69c4f3afdbdcc1459445aaefc");
            return;
        }
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
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a5f464cce51e9e3047fd66ea40ca5e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a5f464cce51e9e3047fd66ea40ca5e0");
        }
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da841368ab3152027c708c40fc102cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da841368ab3152027c708c40fc102cd1");
            return;
        }
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
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1656bf45b17faa8478ad4d6299071303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1656bf45b17faa8478ad4d6299071303");
        } else if (drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled()) {
        } else {
            bitmap.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15007cfdfea4b1e5dce7ee7bee8edac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15007cfdfea4b1e5dce7ee7bee8edac2");
        } else {
            super.onDetachedFromWindow();
        }
    }

    private Uri handleRemoteImage(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828bf6a964ab5cb7f05c2bfd4dbff45b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828bf6a964ab5cb7f05c2bfd4dbff45b");
        }
        if (!this.mEnableShrink || this.mFailedToLoadTransformedSource || this.mCapInsets != null || this.mWidth <= 0.0f || this.mHeight <= 0.0f) {
            return uri;
        }
        if (uri.getPath() == null || !uri.getPath().contains("_1_")) {
            Uri a = m.a().a(uri, this.mWidth, this.mHeight);
            return a != null ? a : o.a(uri, (int) Math.ceil(this.mWidth * this.mShrinkRatio), (int) Math.ceil(this.mHeight * this.mShrinkRatio), this.mShrinkGif, this.mTransformToWebp);
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
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0619e55cf4b90e41ac1b8b383ce20d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0619e55cf4b90e41ac1b8b383ce20d1");
            return;
        }
        if (f != this.mWidth) {
            this.mTransformedSource = null;
            setDirtyState(DirtyState.DIRTY);
        }
        this.mWidth = f;
    }

    public void setHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bfd511d63fd2caa36941d7aa77def78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bfd511d63fd2caa36941d7aa77def78");
            return;
        }
        if (f != this.mHeight) {
            this.mTransformedSource = null;
            setDirtyState(DirtyState.DIRTY);
        }
        this.mHeight = f;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5292551f2346c6cfd6bbfe1124f6824e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5292551f2346c6cfd6bbfe1124f6824e");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.mLastHeight == i6 && this.mLastWidth == i5) {
            return;
        }
        if (System.currentTimeMillis() - this.mLastChangeSizeTIme < 1000) {
            this.mFailedToLoadTransformedSource = true;
        }
        this.mLastWidth = i5;
        this.mLastHeight = i6;
        this.mLastChangeSizeTIme = System.currentTimeMillis();
    }

    public boolean isFailedToLoadTransformedSource() {
        return this.mFailedToLoadTransformedSource;
    }

    public RecceImageSource getImageSource() {
        return this.mImageSource;
    }

    public Uri getTransformedSource() {
        return this.mTransformedSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportFileNotFound(Exception exc, RecceImageSource recceImageSource) {
        DioFile[] m;
        Object[] objArr = {exc, recceImageSource};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf38ae9324cd5ef9f211b956b408fb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf38ae9324cd5ef9f211b956b408fb96");
            return;
        }
        try {
            if (exc instanceof FileNotFoundException) {
                Uri sourceUri = recceImageSource.getSourceUri();
                StringBuilder sb = new StringBuilder();
                DioFile f = com.meituan.android.mrn.util.b.b(sourceUri).f();
                if (TextUtils.isEmpty(imgFilePath) || !imgFilePath.equals(f.h())) {
                    imgFilePath = f.h();
                    if (f.c() && f.j() && (m = f.m()) != null) {
                        sb.append("当前bundle图片数量:");
                        sb.append(m.length);
                    }
                    com.facebook.common.logging.a.d("RecceRCTRoundImageView@reportFileNotFound", sb.toString(), exc);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class ReactDrawableTarget extends PicassoDrawableImageViewTarget {
        private static final float SQUARE_RATIO_MARGIN = 0.05f;
        public static ChangeQuickRedirect changeQuickRedirect;
        private RecceImageSource imageSource;
        private RecceRCTRoundImageView imageView;

        public ReactDrawableTarget(RecceRCTRoundImageView recceRCTRoundImageView, RecceImageSource recceImageSource) {
            super(recceRCTRoundImageView);
            Object[] objArr = {RecceRCTRoundImageView.this, recceRCTRoundImageView, recceImageSource};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e3d07810f1c83234effabd3ccc28a33", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e3d07810f1c83234effabd3ccc28a33");
                return;
            }
            this.imageSource = recceImageSource;
            this.imageView = recceRCTRoundImageView;
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public void onLoadStarted(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1300c4eead1e0f0f0995ad126b4e9994", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1300c4eead1e0f0f0995ad126b4e9994");
                return;
            }
            super.onLoadStarted(drawable);
            onLoadBegin();
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public void onLoadFailed(Exception exc, Drawable drawable) {
            Object[] objArr = {exc, drawable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3d09e33135ab116fb78b1fb43bc21a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3d09e33135ab116fb78b1fb43bc21a1");
                return;
            }
            super.onLoadFailed(exc, drawable);
            if (this.imageView != null && this.imageView.mTransformedSource != null) {
                this.imageView.mFailedToLoadTransformedSource = true;
                this.imageView.mTransformedSource = null;
                this.imageView.setDirtyState(DirtyState.DIRTY);
                this.imageView.maybeUpdateView();
                Object[] objArr2 = new Object[2];
                objArr2[0] = this.imageSource != null ? this.imageSource.getOriginalSource() : "Unknown";
                objArr2[1] = this.imageView.mTransformedSource;
                com.facebook.common.logging.a.b(RecceRCTRoundImageView.TAG, String.format("加载Venus图片失败, 转换前链接: %s, 转换后链接: %s", objArr2));
                return;
            }
            onLoadError(exc);
            onLoadEnd(null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
            if (r13.contains("@2x.") != false) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
        @Override // com.squareup.picasso.PicassoDrawableTarget
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResourceReady(com.squareup.picasso.PicassoDrawable r13, com.squareup.picasso.Picasso.LoadedFrom r14) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.recce.views.image.RecceRCTRoundImageView.ReactDrawableTarget.onResourceReady(com.squareup.picasso.PicassoDrawable, com.squareup.picasso.Picasso$LoadedFrom):void");
        }

        private void onLoadBegin() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61bf0c4f6dcaa1ecdd980f5d079a5329", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61bf0c4f6dcaa1ecdd980f5d079a5329");
            } else {
                dispatchEvent(4, null, null, "");
            }
        }

        private void onLoadError(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad16a9625e6236e1b08061820bd0a52e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad16a9625e6236e1b08061820bd0a52e");
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            if (this.imageSource != null) {
                String originalSource = this.imageSource.getOriginalSource();
                stringBuffer.append("\r\nsourceUri: ");
                stringBuffer.append(originalSource);
                stringBuffer.append("\r\nisResource: ");
                stringBuffer.append(this.imageSource.isResource());
                if (this.imageSource.isResource()) {
                    stringBuffer.append("\r\ngetResourceId: ");
                    stringBuffer.append(this.imageSource.getResourceId());
                    try {
                        File file = new File(Uri.parse(originalSource).getPath());
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
                dispatchEvent(1, null, originalSource, stringBuffer.toString());
                com.facebook.common.logging.a.b("RecceRCTRoundImageView@onLoadError", stringBuffer.toString(), exc);
                RecceRCTRoundImageView.reportFileNotFound(exc, this.imageSource);
            }
        }

        private void onLoadEnd(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3a2b0b976391af72f2927d3ad199b58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3a2b0b976391af72f2927d3ad199b58");
            } else {
                dispatchEvent(3, drawable, null, "");
            }
        }

        private void onLoad(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91aad17296aa600e7365fd2f6d4f7d1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91aad17296aa600e7365fd2f6d4f7d1b");
                return;
            }
            if (this.imageView != null && this.imageView.mImageSource != null) {
                if (this.imageView.mTransformedSource != null) {
                    m.a().a(this.imageView.mImageSource.getSourceUri(), this.imageView.mWidth, this.imageView.mHeight, this.imageView.mTransformedSource);
                } else {
                    m.a().a(this.imageView.mImageSource.getSourceUri());
                }
            }
            dispatchEvent(2, drawable, null, "");
        }

        private void dispatchEvent(int i, Drawable drawable, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), drawable, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3afde60d8f27949d9c045d1d72c424c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3afde60d8f27949d9c045d1d72c424c4");
            } else if (this.imageView != null) {
                int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
                int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
                com.facebook.react.uimanager.events.c eventDispatcher = ((UIManagerModule) ((ReactContext) this.imageView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
                int id = this.imageView.getId();
                if (str == null) {
                    str = getImageUrl();
                }
                eventDispatcher.a(com.facebook.react.views.image.a.a(id, i, str, intrinsicWidth, intrinsicHeight, str2));
            }
        }

        private String getImageUrl() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26edc92229349fa26d0577db080947d9", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26edc92229349fa26d0577db080947d9");
            }
            if (this.imageSource == null || this.imageSource.getSourceUri() == null) {
                return null;
            }
            return this.imageSource.getSourceUri().toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum DirtyState {
        UNDEFINE,
        DIRTY,
        CLEAN;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static DirtyState valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4687aba76de08364a99a4998f6be2cbb", RobustBitConfig.DEFAULT_VALUE) ? (DirtyState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4687aba76de08364a99a4998f6be2cbb") : (DirtyState) Enum.valueOf(DirtyState.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DirtyState[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "858f33f01943ce3a6d30e245cd4e9830", RobustBitConfig.DEFAULT_VALUE) ? (DirtyState[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "858f33f01943ce3a6d30e245cd4e9830") : (DirtyState[]) values().clone();
        }

        DirtyState() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "854f0e5828bfa182e5fc87bfcc4889bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "854f0e5828bfa182e5fc87bfcc4889bd");
            }
        }
    }
}
