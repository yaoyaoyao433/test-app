package com.dianping.imagemanager;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.dianping.imagemanager.animated.a;
import com.dianping.imagemanager.image.drawable.g;
import com.dianping.imagemanager.image.loader.e;
import com.dianping.imagemanager.utils.h;
import com.dianping.imagemanager.utils.j;
import com.dianping.imagemanager.utils.k;
import com.dianping.imagemanager.utils.n;
import com.dianping.imagemanager.utils.p;
import com.dianping.imagemanager.utils.q;
import com.dianping.imagemanager.utils.r;
import com.meituan.android.common.statistics.Constants;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DPImageView extends ImageView implements View.OnClickListener {
    public static final int ANIMATED_IMAGE_LOOP_FOREVER = -1;
    public static final int ANIMATED_IMAGE_PLAY_FOR_ONCE = 1;
    public static final int ANIMATED_IMAGE_SHOW_AS_STATIC = 0;
    protected static final int COUNT_PLACEHOLDER = 5;
    private static final int DEFAULT_PLACEHOLDER_BACKGROUND_COLOR = -1315861;
    protected static final int LAYER_INDEX_ACTUAL_IMAGE = 3;
    protected static final int LAYER_INDEX_BACKGROUND = 0;
    protected static final int LAYER_INDEX_OVERLAY = 4;
    protected static final int LAYER_INDEX_PLACEHOLDER = 1;
    protected static final int LAYER_INDEX_THUMB_IMAGE = 2;
    protected static final int LAYER_NUM = 4;
    public static final int MATCH_PARENT = -1;
    private static final int MSG_IMAGE_ANIMATION_END = 0;
    private static final int MSG_IMAGE_ANIMATION_START = 1;
    private static final int MSG_UPDATE_ANIMATED_RESULT = 2;
    public static final int OVERLAY_GRAVITY_CENTER = 0;
    public static final int OVERLAY_GRAVITY_LEFTBOTTOM = 2;
    public static final int OVERLAY_GRAVITY_LEFTTOP = 1;
    public static final int OVERLAY_GRAVITY_RIGHTBOTTOM = 4;
    public static final int OVERLAY_GRAVITY_RIGHTTOP = 3;
    public static final int PLACEHOLDER_CLICK = 3;
    public static final int PLACEHOLDER_EMPTY = 0;
    public static final int PLACEHOLDER_ERROR = 2;
    public static final int PLACEHOLDER_LOADING = 1;
    public static final int PLACEHOLDER_RELOAD = 4;
    public static final int SIZE_ADAPTIVE = 0;
    private static final String TAG = "DPImageView";
    public static final int WRAP_CONTENT = -2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Paint debugHintBackgroundPaint;
    private static Paint debugHintTextPaint;
    private static Paint progressHintPaint;
    private static int screenHeight;
    private static int screenWidth;
    public volatile com.dianping.imagemanager.animated.a animatedImageDecodeTask;
    public com.dianping.imagemanager.animated.b animatedImageDecoder;
    protected com.dianping.imagemanager.utils.lifecycle.d animatedImageLifecycleListener;
    private Object animatedImageSyncLock;
    private boolean attached;
    private int borderStrokeColor;
    private float borderStrokeWidth;
    private com.dianping.imagemanager.image.cache.a cacheBucket;
    private a cacheType;
    private boolean canClickToRequire;
    private boolean clearViewBySetImage;
    public int contentDataType;
    private float cornerRadius;
    protected d currentLoadState;
    private String currentShowSource;
    private int customHeight;
    private int customWidth;
    protected com.dianping.imagemanager.utils.b dataRequireState;
    private String debugHint;
    protected com.dianping.imagemanager.utils.downloadphoto.d downloadContent;
    private int downloadErrorCode;
    protected boolean enableNetworkThumb;
    private boolean fadeInDisplayEnabled;
    private int fadeInDuration;
    private boolean forceDownload;
    private boolean hasDoneAttachedWork;
    private boolean hasDoneDetachedWork;
    private boolean ignoreLowResolutionMemCache;
    private String imageDebugInfo;
    private com.dianping.imagemanager.utils.downloadphoto.e imageDownloadListener;
    private int imageId;
    private Matrix imageMatrix;
    private h imageProcessor;
    private j imageUri;
    private c innerImageLoadListener;
    private boolean isAnimatedImageLifecycleListenerRegistered;
    private boolean isCircle;
    private boolean isCustomHeightWaitForLayout;
    private boolean isCustomSized;
    private boolean isCustomWidthWaitForLayout;
    protected boolean isPicasso;
    protected boolean isPlaceholder;
    @Deprecated
    protected boolean isProgressPrint;
    private boolean isRequireLifecycleListenerRegistered;
    private boolean[] isRounedCorner;
    private boolean isSaturationColorMatrixValid;
    private boolean isSizeAdaptive;
    private boolean isSquare;
    protected boolean isThumbFailed;
    protected boolean isThumbShowing;
    protected d lastLoadState;
    protected com.dianping.imagemanager.utils.downloadphoto.a lastRequest;
    public com.dianping.imagemanager.utils.lifecycle.a lifecycle;
    private com.dianping.imagemanager.utils.downloadphoto.e loadThumbListener;
    private int loopingTimes;
    protected b mDPScaleType;
    public final Handler mHandler;
    protected final Handler mInvalidateHandler;
    private String mModule;
    @Deprecated
    protected ImageView.ScaleType mScaleType;
    private final RectF mTempDst;
    private final RectF mTempSrc;
    private String mThumbModule;
    protected com.dianping.imagemanager.image.drawable.d mainDrawable;
    private boolean needReload;
    public com.dianping.imagemanager.animated.c onAnimatedImageStateChangeListener;
    private p onLoadChangeListener;
    private q onLoadingListener;
    private int overlayAbsoluteHeight;
    private int overlayAbsoluteWidth;
    private int overlayCanvasHeight;
    private int overlayCanvasWidth;
    private Drawable overlayDrawable;
    private int overlayDrawableHeight;
    private int overlayDrawableWidth;
    protected int overlayGravity;
    private Matrix overlayMatrix;
    protected int overlayPercent;
    private Rect overlayRect;
    protected int overlayResId;
    private boolean perfMonitorEnabled;
    private String picBusiness;
    private String picExtra;
    protected Animation[] placeholderAnima;
    private int placeholderBackgroundColor;
    protected g.b placeholderScaleType;
    protected g.b[] placeholderScaleTypes;
    protected com.dianping.imagemanager.image.drawable.f[] placeholders;
    private boolean playWhenReady;
    private long preRequireTimestamp;
    private String progressHint;
    protected com.dianping.imagemanager.utils.downloadphoto.a request;
    private int requestOption;
    private boolean requireBeforeAttach;
    protected com.dianping.imagemanager.utils.lifecycle.d requireLifecycleListener;
    private boolean requireWithContextLifecycle;
    private ColorMatrix reuseSaturationColorMatrix;
    private boolean savedClickable;
    private ColorFilter savedColorFilter;
    private View.OnClickListener savedOnClickListener;
    private View.OnLongClickListener savedOnLongClickListener;
    private long sendRequestTimestamp;
    private boolean shouldResumeAnimating;
    protected int showingPlaceholderType;
    private ViewTreeObserver.OnPreDrawListener sizeParser;
    protected int targetImageHeight;
    protected int targetImageWidth;
    private boolean thumbCheckCacheOnly;
    protected com.dianping.imagemanager.utils.downloadphoto.a thumbRequest;
    protected g.b thumbScaleType;
    private j thumbUri;
    private String thumbUrl;
    public Bitmap tmpBitmap;
    protected String token;
    private String url;
    private static final Random RANDOM = new Random();
    private static final ImageView.ScaleType[] sScaleTypeArray = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private static final g.b[] frescoScaleTypeArray = {g.b.i, g.b.b, g.b.c, g.b.d, g.b.e, g.b.f, g.b.h, g.b.g};

    public static boolean isSizeValid(int i) {
        return i > 0 || i == -2;
    }

    public DPImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "112cd951e2d3d5ca73063a35e46f34cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "112cd951e2d3d5ca73063a35e46f34cf");
        }
    }

    public DPImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8887b9fc60089736a31728fdcbfaff6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8887b9fc60089736a31728fdcbfaff6e");
        }
    }

    public DPImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49848372d8d2182edc78d7f31bed0541", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49848372d8d2182edc78d7f31bed0541");
            return;
        }
        this.token = "";
        this.cacheBucket = com.dianping.imagemanager.image.cache.a.DEFAULT;
        this.imageId = 0;
        this.isCircle = false;
        this.isSquare = false;
        this.isRounedCorner = new boolean[4];
        this.borderStrokeColor = 201326592;
        this.borderStrokeWidth = 0.0f;
        this.fadeInDuration = 500;
        this.fadeInDisplayEnabled = com.dianping.imagemanager.base.a.a().e;
        this.forceDownload = true;
        this.needReload = false;
        this.savedOnClickListener = null;
        this.savedOnLongClickListener = null;
        this.canClickToRequire = false;
        this.savedClickable = false;
        this.clearViewBySetImage = true;
        this.savedColorFilter = null;
        this.requestOption = -433;
        this.isCustomSized = false;
        this.isCustomWidthWaitForLayout = false;
        this.isCustomHeightWaitForLayout = false;
        this.customWidth = 0;
        this.customHeight = 0;
        this.isSizeAdaptive = false;
        this.targetImageWidth = 0;
        this.targetImageHeight = 0;
        this.playWhenReady = false;
        this.contentDataType = -1;
        this.isAnimatedImageLifecycleListenerRegistered = false;
        this.isRequireLifecycleListenerRegistered = false;
        this.requireWithContextLifecycle = false;
        this.imageMatrix = new Matrix();
        this.reuseSaturationColorMatrix = new ColorMatrix();
        this.loopingTimes = com.dianping.imagemanager.base.a.a().f ? -1 : 0;
        this.perfMonitorEnabled = false;
        this.ignoreLowResolutionMemCache = false;
        this.imageDebugInfo = null;
        this.debugHint = "";
        this.progressHint = "";
        this.downloadErrorCode = -1;
        this.hasDoneAttachedWork = false;
        this.hasDoneDetachedWork = false;
        this.placeholderAnima = new Animation[5];
        this.placeholderScaleType = g.b.g;
        this.dataRequireState = com.dianping.imagemanager.utils.b.NULL;
        this.lastLoadState = d.IDLE;
        this.overlayResId = 0;
        this.overlayPercent = 100;
        this.overlayDrawableWidth = 0;
        this.overlayDrawableHeight = 0;
        this.overlayCanvasWidth = 0;
        this.overlayCanvasHeight = 0;
        this.overlayAbsoluteWidth = 0;
        this.overlayAbsoluteHeight = 0;
        this.overlayRect = new Rect();
        this.mTempSrc = new RectF();
        this.mTempDst = new RectF();
        this.currentShowSource = "";
        this.innerImageLoadListener = new c(this);
        this.loadThumbListener = new e(this);
        this.sizeParser = new ViewTreeObserver.OnPreDrawListener() { // from class: com.dianping.imagemanager.DPImageView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2e393a921c8447eeb200b21bd48e7cad", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2e393a921c8447eeb200b21bd48e7cad")).booleanValue();
                }
                if (DPImageView.this.currentLoadState == d.WAIT_FOR_SIZE) {
                    if (!DPImageView.this.isTargetSizeValid()) {
                        if (!DPImageView.isSizeValid(DPImageView.this.targetImageWidth) && (!DPImageView.this.isCustomSized || DPImageView.this.isCustomWidthWaitForLayout)) {
                            DPImageView.this.targetImageWidth = DPImageView.screenWidth;
                        }
                        if (!DPImageView.isSizeValid(DPImageView.this.targetImageHeight) && (!DPImageView.this.isCustomSized || DPImageView.this.isCustomHeightWaitForLayout)) {
                            DPImageView.this.targetImageHeight = DPImageView.screenHeight;
                        }
                    }
                    DPImageView.this.onSizeReady();
                }
                DPImageView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        };
        this.mInvalidateHandler = new Handler(Looper.getMainLooper()) { // from class: com.dianping.imagemanager.DPImageView.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c9a2041f05dc6a28f5d35584201bf0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c9a2041f05dc6a28f5d35584201bf0e");
                    return;
                }
                DPImageView.this.invalidate();
                if (DPImageView.this.mainDrawable != null) {
                    DPImageView.this.mainDrawable.invalidateSelf();
                }
            }
        };
        this.mHandler = new Handler(Looper.getMainLooper()) { // from class: com.dianping.imagemanager.DPImageView.3
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "728a009e1b29140d3e5aeedd41d29a61", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "728a009e1b29140d3e5aeedd41d29a61");
                    return;
                }
                switch (message.what) {
                    case 0:
                        if (DPImageView.this.onAnimatedImageStateChangeListener != null) {
                            DPImageView.this.onAnimatedImageStateChangeListener.OnAnimationEnd();
                            return;
                        }
                        return;
                    case 1:
                        if (DPImageView.this.onAnimatedImageStateChangeListener != null) {
                            DPImageView.this.onAnimatedImageStateChangeListener.OnAnimationStart();
                            return;
                        }
                        return;
                    case 2:
                        if (DPImageView.this.tmpBitmap == null || DPImageView.this.tmpBitmap.isRecycled()) {
                            return;
                        }
                        DPImageView.this.updateAnimatedImageFrame(DPImageView.this.tmpBitmap);
                        return;
                    default:
                        return;
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.animatedImageLooping, R.attr.borderColor, R.attr.cornerRadius, R.attr.enableProgressPrint, R.attr.overlay, R.attr.overlayGravity, R.attr.overlayPercent, R.attr.placeholderBackgroundColor, R.attr.placeholderClick, R.attr.placeholderClickScaleType, R.attr.placeholderEmpty, R.attr.placeholderEmptyScaleType, R.attr.placeholderError, R.attr.placeholderErrorScaleType, R.attr.placeholderLoading, R.attr.placeholderLoadingAnima, R.attr.placeholderLoadingScaleType, R.attr.placeholderReload, R.attr.placeholderReloadScaleType, R.attr.placeholderScaleType, R.attr.overlayAbsoluteWidth, R.attr.overlayAbsoluteHeight, R.attr.requireBeforeAttach, R.attr.forceDownload, R.attr.enableCorner, R.attr.borderStrokeWidth, R.attr.isCircle, R.attr.isSquare, R.attr.needReload, R.attr.fadeInDisplayDuration, R.attr.fadeInDisplayEnabled, R.attr.requireWithContextLifecycle, R.attr.clearViewBySetImage});
        this.isProgressPrint = obtainStyledAttributes.getBoolean(3, false);
        setOverlay(obtainStyledAttributes.getResourceId(4, 0));
        setOverlayPercent(obtainStyledAttributes.getInteger(6, 100));
        this.overlayGravity = obtainStyledAttributes.getInt(5, 0);
        this.overlayAbsoluteHeight = obtainStyledAttributes.getDimensionPixelSize(21, -1);
        this.overlayAbsoluteWidth = obtainStyledAttributes.getDimensionPixelSize(20, -1);
        this.requireBeforeAttach = obtainStyledAttributes.getBoolean(22, false);
        setCornerRadiusFromAttr(obtainStyledAttributes.getDimension(2, 0.0f), obtainStyledAttributes.getInt(24, 15));
        this.borderStrokeWidth = obtainStyledAttributes.getDimension(25, 0.0f);
        this.borderStrokeColor = obtainStyledAttributes.getColor(1, 201326592);
        this.isCircle = obtainStyledAttributes.getBoolean(26, false);
        this.isSquare = obtainStyledAttributes.getBoolean(27, false);
        this.needReload = obtainStyledAttributes.getBoolean(28, false);
        this.forceDownload = obtainStyledAttributes.getBoolean(23, true);
        setPlaceholderAnimation(1, obtainStyledAttributes.getResourceId(15, 0));
        this.placeholderBackgroundColor = obtainStyledAttributes.getColor(7, DEFAULT_PLACEHOLDER_BACKGROUND_COLOR);
        int i2 = obtainStyledAttributes.getInt(19, 7);
        this.placeholderScaleType = frescoScaleTypeArray[i2];
        initPlaceholderAttr(0, i2, obtainStyledAttributes.getInt(11, -1));
        initPlaceholderAttr(1, i2, obtainStyledAttributes.getInt(16, -1));
        initPlaceholderAttr(2, i2, obtainStyledAttributes.getInt(13, -1));
        initPlaceholderAttr(3, i2, obtainStyledAttributes.getInt(9, -1));
        initPlaceholderAttr(4, i2, obtainStyledAttributes.getInt(18, -1));
        setPlaceholders(obtainStyledAttributes.getResourceId(10, 0), obtainStyledAttributes.getResourceId(14, 0), obtainStyledAttributes.getResourceId(12, 0), obtainStyledAttributes.getResourceId(8, R.drawable.placeholder_click), obtainStyledAttributes.getResourceId(17, R.drawable.placeholder_reload));
        this.fadeInDuration = obtainStyledAttributes.getInt(29, 500);
        this.fadeInDisplayEnabled = obtainStyledAttributes.getBoolean(30, com.dianping.imagemanager.base.a.a().e);
        this.loopingTimes = obtainStyledAttributes.getInt(0, com.dianping.imagemanager.base.a.a().f ? -1 : 0);
        this.requireWithContextLifecycle = obtainStyledAttributes.getBoolean(31, false);
        this.clearViewBySetImage = obtainStyledAttributes.getBoolean(32, true);
        obtainStyledAttributes.recycle();
        initView();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98c7cf4fb106ed3e6324b975bf00a441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98c7cf4fb106ed3e6324b975bf00a441");
            return;
        }
        com.dianping.imagemanager.base.a.a().a(getContext());
        super.setOnClickListener(this);
        ensureMainDrawable(false);
        if (this.currentLoadState != d.NOT_URL) {
            this.currentLoadState = d.IDLE;
        }
        this.perfMonitorEnabled = RANDOM.nextInt(10000) < 5;
        if (screenWidth == 0 || screenHeight == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            screenWidth = displayMetrics.widthPixels;
            screenHeight = displayMetrics.heightPixels;
        }
        checkRequireLifecycle();
        if (this.mDPScaleType == null) {
            this.mDPScaleType = b.FIT_CENTER;
        }
    }

    public void ensurePlaceholderParamsInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02b1c6780089110090e7a1d053a9740f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02b1c6780089110090e7a1d053a9740f");
            return;
        }
        if (this.placeholders == null) {
            this.placeholders = new com.dianping.imagemanager.image.drawable.f[5];
        }
        if (this.placeholderScaleTypes == null) {
            this.placeholderScaleTypes = new g.b[5];
            for (int i = 0; i < 5; i++) {
                this.placeholderScaleTypes[i] = g.b.g;
            }
        }
    }

    public void ensureMainDrawable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7422320a13c55c2486c649bf219788d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7422320a13c55c2486c649bf219788d7");
            return;
        }
        if (this.mainDrawable == null) {
            ensurePlaceholderParamsInit();
            this.mainDrawable = new com.dianping.imagemanager.image.drawable.d(new Drawable[4]);
        }
        if (z) {
            super.setImageDrawable(this.mainDrawable);
            setScaleTypeWithoutSave(ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a147b0e3718192b9b87189897eef0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a147b0e3718192b9b87189897eef0e5");
            return;
        }
        super.onMeasure(i, i2);
        if (this.isSquare) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, measuredWidth);
            return;
        }
        Drawable drawable = super.getDrawable();
        if (drawable != null && this.isCustomSized && this.isSizeAdaptive) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (this.customHeight == 0 && intrinsicWidth > 0) {
                int measuredWidth2 = this.customWidth == -1 ? getMeasuredWidth() : this.customWidth;
                int paddingLeft = (int) (((((measuredWidth2 - getPaddingLeft()) - getPaddingRight()) * intrinsicHeight) / intrinsicWidth) + 0.5f + getPaddingTop() + getPaddingBottom());
                getLayoutParams().height = paddingLeft;
                setMeasuredDimension(measuredWidth2, paddingLeft);
            } else if (this.customWidth != 0 || intrinsicHeight <= 0) {
            } else {
                int measuredHeight = this.customHeight == -1 ? getMeasuredHeight() : this.customHeight;
                int paddingTop = (int) (((((measuredHeight - getPaddingTop()) - getPaddingBottom()) * intrinsicWidth) / intrinsicHeight) + 0.5f + getPaddingLeft() + getPaddingRight());
                getLayoutParams().width = paddingTop;
                setMeasuredDimension(paddingTop, measuredHeight);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d08525c4d4aba7f4c29652f572be7aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d08525c4d4aba7f4c29652f572be7aac");
            return;
        }
        setLoadState(d.NOT_URL);
        discard();
        resetUrl();
        this.currentShowSource = "not_url";
        this.isPlaceholder = false;
        this.showingPlaceholderType = -1;
        this.isThumbShowing = false;
        this.enableNetworkThumb = false;
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac1ad9303eaaf361144e562765a6694d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac1ad9303eaaf361144e562765a6694d");
        } else {
            setImageBitmapInternal(bitmap, true, false);
        }
    }

    public void setImageBitmapInternal(Bitmap bitmap, boolean z, boolean z2) {
        Object[] objArr = {bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "631f877db1c3b0ee2d03871248c083f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "631f877db1c3b0ee2d03871248c083f9");
        } else {
            setImageDrawableInternal(new BitmapDrawable(getResources(), bitmap), z, z2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f72a8fc4bb2ad10461535aac5e2ba4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f72a8fc4bb2ad10461535aac5e2ba4e7");
        } else {
            setImageDrawableInternal(drawable, true, false);
        }
    }

    public void setToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47f4ecd831f0a374d5442c5087b0195f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47f4ecd831f0a374d5442c5087b0195f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.token = str;
        }
    }

    public void setImageDrawableInternal(Drawable drawable, boolean z, boolean z2) {
        boolean z3 = false;
        Object[] objArr = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf06f388e3f1b3f5e39d59f4ccb3f089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf06f388e3f1b3f5e39d59f4ccb3f089");
            return;
        }
        if (k.a()) {
            imageLog("setImageDrawableInternal fadein=" + z);
        }
        if (drawable == null) {
            setLoadState(d.NOT_URL);
            discard();
            resetUrl();
            this.currentShowSource = "not_url";
            this.isPlaceholder = false;
            this.showingPlaceholderType = -1;
            super.setImageDrawable(null);
            return;
        }
        ensureMainDrawable(false);
        if (!z2) {
            setLoadState(d.NOT_URL);
            discard();
            resetUrl();
            this.currentShowSource = "not_url";
        }
        if (this.isPlaceholder) {
            clearCustomAnimations();
            this.isPlaceholder = false;
            this.showingPlaceholderType = -1;
        }
        this.isThumbShowing = false;
        if (drawable != this.mainDrawable) {
            if (drawable == null) {
                this.mainDrawable.a(3, null);
            } else if (this.mainDrawable.b[3] instanceof g) {
                g gVar = (g) this.mainDrawable.b[3];
                gVar.a(drawable);
                if (this.isSaturationColorMatrixValid && this.reuseSaturationColorMatrix != null) {
                    gVar.setColorFilter(new ColorMatrixColorFilter(this.reuseSaturationColorMatrix));
                }
                gVar.a(this.imageMatrix);
                gVar.a(transScaleType(this.mDPScaleType));
            } else {
                g gVar2 = new g(drawable, transScaleType(this.mDPScaleType));
                gVar2.a(this.imageMatrix);
                if (this.isSaturationColorMatrixValid && this.reuseSaturationColorMatrix != null) {
                    gVar2.setColorFilter(new ColorMatrixColorFilter(this.reuseSaturationColorMatrix));
                }
                this.mainDrawable.a(3, gVar2);
                requestLayout();
            }
        }
        if (z && this.fadeInDisplayEnabled) {
            z3 = true;
        }
        displayOrInvalidateImage(3, z3);
    }

    public void loadPlaceHolder(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0a958c05903c75ff3caf92dbe82fb2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0a958c05903c75ff3caf92dbe82fb2c");
            return;
        }
        ensurePlaceholderParamsInit();
        com.dianping.imagemanager.image.drawable.f placeholder = getPlaceholder(i);
        if (placeholder == null || placeholder.a() == null) {
            if (i == 0) {
                clearCustomAnimations();
                super.setImageDrawable(null);
                return;
            }
            return;
        }
        clearCustomAnimations();
        this.isPlaceholder = true;
        this.showingPlaceholderType = i;
        if (this.mainDrawable.b[1] != placeholder) {
            this.mainDrawable.a(1, placeholder);
        }
        showLayer(1, false);
        if (this.placeholderAnima[i] != null) {
            startAnimation(this.placeholderAnima[i]);
        }
    }

    public void showLayer(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a03e5a90e9eca88a8e9f2d19957cce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a03e5a90e9eca88a8e9f2d19957cce0");
            return;
        }
        ensureMainDrawable(true);
        this.mainDrawable.a();
        int intrinsicWidth = this.mainDrawable.getIntrinsicWidth();
        int intrinsicHeight = this.mainDrawable.getIntrinsicHeight();
        com.dianping.imagemanager.image.drawable.d dVar = this.mainDrawable;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.imagemanager.image.drawable.d.c;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "04a1d81e5cc4c1fbc32dd338a4c33e7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "04a1d81e5cc4c1fbc32dd338a4c33e7d");
        } else {
            dVar.d = 0;
            Arrays.fill(dVar.l, false);
            dVar.invalidateSelf();
        }
        com.dianping.imagemanager.image.drawable.d dVar2 = this.mainDrawable;
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = com.dianping.imagemanager.image.drawable.d.c;
        if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect4, false, "e16773d05940c2d4ff0e84b8997513c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect4, false, "e16773d05940c2d4ff0e84b8997513c1");
        } else {
            dVar2.d = 0;
            dVar2.l[i] = true;
            dVar2.invalidateSelf();
        }
        if (z) {
            com.dianping.imagemanager.image.drawable.d dVar3 = this.mainDrawable;
            dVar3.e = this.fadeInDuration;
            if (dVar3.d == 1) {
                dVar3.d = 0;
            }
        } else {
            this.mainDrawable.c();
        }
        this.mainDrawable.b();
        if (this.mainDrawable.getIntrinsicWidth() == intrinsicWidth && this.mainDrawable.getIntrinsicHeight() == intrinsicHeight) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            setSelected(isSelected());
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dianping.imagemanager.DPImageView setImageWithAssetCache(java.lang.String r17, java.lang.String r18, com.dianping.imagemanager.DPImageView.a r19) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.DPImageView.setImageWithAssetCache(java.lang.String, java.lang.String, com.dianping.imagemanager.DPImageView$a):com.dianping.imagemanager.DPImageView");
    }

    public DPImageView setImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d39e1a1ab49245a69bf2951536d539e0", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d39e1a1ab49245a69bf2951536d539e0") : loadImage(str, null, false, a.HALF_MONTH, com.dianping.imagemanager.image.cache.a.DEFAULT, 0);
    }

    @Deprecated
    public DPImageView setImage(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d5cfab21dc9186fb1f4f1784da2f414", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d5cfab21dc9186fb1f4f1784da2f414") : loadImage(str, null, false, a.HALF_MONTH, com.dianping.imagemanager.image.cache.a.DEFAULT, 0);
    }

    @Deprecated
    public DPImageView setImage(String str, a aVar, int i) {
        Object[] objArr = {str, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da3ef2f5b25263ad2c0aa0a916ac872b", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da3ef2f5b25263ad2c0aa0a916ac872b") : loadImage(str, null, false, aVar, com.dianping.imagemanager.image.cache.a.DEFAULT, 0);
    }

    public DPImageView setImage(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e99654ea88f2f301aa9762b7b8f15103", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e99654ea88f2f301aa9762b7b8f15103") : loadImage(str, null, false, null, com.dianping.imagemanager.image.cache.a.DEFAULT, i);
    }

    public void setImage(String str, com.dianping.imagemanager.image.cache.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74110c6f208f5d76323a80f311e6c569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74110c6f208f5d76323a80f311e6c569");
        } else {
            loadImage(str, null, false, a.HALF_MONTH, aVar, 0);
        }
    }

    public void setImage(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057e833c6a44890d6fab7796b2a1185f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057e833c6a44890d6fab7796b2a1185f");
        } else {
            loadImage(str, str2, z, a.HALF_MONTH, com.dianping.imagemanager.image.cache.a.DEFAULT, 0);
        }
    }

    private DPImageView loadImage(String str, String str2, boolean z, a aVar, com.dianping.imagemanager.image.cache.a aVar2, int i) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "510b0deaaaed106beae9e48da0d7ccf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "510b0deaaaed106beae9e48da0d7ccf4");
        }
        if (k.a()) {
            imageLog("loadImage()");
        }
        if (TextUtils.isEmpty(str)) {
            discard();
            resetUrl();
            setLoadState(d.EMPTY);
            this.currentShowSource = "";
            return this;
        } else if (this.currentLoadState != d.NOT_URL && this.currentLoadState != d.FAILED && str.equals(this.currentShowSource)) {
            if (this.imageDownloadListener != null && this.dataRequireState == com.dianping.imagemanager.utils.b.SUCCEED) {
                this.imageDownloadListener.b(this.lastRequest, this.downloadContent);
            }
            return this;
        } else {
            discard();
            if (this.animatedImageDecoder != null) {
                this.animatedImageDecoder.i();
                this.animatedImageDecoder = null;
            }
            if (this.clearViewBySetImage && this.mainDrawable.b[3] != null) {
                this.mainDrawable.a(3, null);
            }
            setLoadState(d.IDLE);
            this.url = str;
            this.currentShowSource = str;
            this.cacheType = aVar;
            this.cacheBucket = aVar2;
            this.imageId = i;
            this.imageUri = new j(str);
            if (str2 != null && str2.equals(str)) {
                this.thumbUrl = null;
            } else {
                if (this.clearViewBySetImage && this.mainDrawable.b[2] != null) {
                    this.mainDrawable.a(2, null);
                }
                this.thumbUrl = str2;
            }
            this.thumbUri = new j(this.thumbUrl);
            this.thumbCheckCacheOnly = z;
            preRequire();
            return this;
        }
    }

    public void resetUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e99fade9fee79b26a663e7d45f0ea3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e99fade9fee79b26a663e7d45f0ea3a");
            return;
        }
        this.url = null;
        this.thumbUrl = null;
        this.imageUri = null;
        this.thumbUri = null;
    }

    public void preRequire() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da76a408f97a58c6776175d15426ab08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da76a408f97a58c6776175d15426ab08");
        } else if (this.currentLoadState == d.IDLE || this.currentLoadState == d.READY_FOR_REQUESTING || this.currentLoadState == d.DETACHED_FROM_WINDOW) {
            loadPlaceHolder(1);
            this.preRequireTimestamp = System.currentTimeMillis();
            if (isTargetSizeValid()) {
                onSizeReady();
                return;
            }
            setLoadState(d.WAIT_FOR_SIZE);
            registerSizeParserListener();
        }
    }

    public boolean isTargetSizeValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6be89811c68f79c59388014b7cf9044e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6be89811c68f79c59388014b7cf9044e")).booleanValue();
        }
        parseTargetSize();
        if (!this.isCustomSized || this.isCustomWidthWaitForLayout || this.isCustomHeightWaitForLayout) {
            return isSizeValid(this.targetImageWidth) && isSizeValid(this.targetImageHeight);
        }
        return true;
    }

    public void parseTargetSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baba4811b26bd83f06d62f8bbdbf5170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baba4811b26bd83f06d62f8bbdbf5170");
        } else if ((this.requestOption & 512) == 0) {
            this.targetImageWidth = Integer.MAX_VALUE;
            this.targetImageHeight = Integer.MAX_VALUE;
        } else if (this.isCustomSized) {
            this.targetImageWidth = this.isCustomWidthWaitForLayout ? getViewWidthOrParam() : this.customWidth;
            this.targetImageHeight = this.isCustomHeightWaitForLayout ? getViewHeightOrParam() : this.customHeight;
        } else {
            this.targetImageWidth = getViewWidthOrParam();
            this.targetImageHeight = getViewHeightOrParam();
        }
    }

    private int getViewHeightOrParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64c81be279378a9adabe64b4c6bfc200", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64c81be279378a9adabe64b4c6bfc200")).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int height = getHeight();
        if (layoutParams != null) {
            if (layoutParams.height == -2) {
                return screenHeight;
            }
            return getSizeForParam(getLayoutParams().height, height, true);
        } else if (isSizeValid(height)) {
            return height;
        } else {
            return 0;
        }
    }

    private int getViewWidthOrParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64ab317167f471fa03da78d147dbef6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64ab317167f471fa03da78d147dbef6c")).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int width = getWidth();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                return screenWidth;
            }
            return getSizeForParam(getLayoutParams().width, width, false);
        } else if (isSizeValid(width)) {
            return width;
        } else {
            return 0;
        }
    }

    private int getSizeForParam(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92a5d8fdf2cb93c6f1353c5e55d101b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92a5d8fdf2cb93c6f1353c5e55d101b5")).intValue();
        }
        if ((!this.requireBeforeAttach || i <= 0) && (this.requireBeforeAttach || i == -2)) {
            return z ? screenHeight : screenWidth;
        }
        return Math.max(i2, i);
    }

    private void registerSizeParserListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b172817fe4f1d3fc9db1a7a1f86b274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b172817fe4f1d3fc9db1a7a1f86b274");
        } else {
            getViewTreeObserver().addOnPreDrawListener(this.sizeParser);
        }
    }

    private void unregisterSizeParserListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91ad1e3095f3a090e614d71757443716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91ad1e3095f3a090e614d71757443716");
        } else {
            getViewTreeObserver().removeOnPreDrawListener(this.sizeParser);
        }
    }

    public void onSizeReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aba963af54dc1454c7f2fd95522f93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aba963af54dc1454c7f2fd95522f93e");
            return;
        }
        setLoadState(d.READY_FOR_REQUESTING);
        require(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0222, code lost:
        if (r1 != false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean require(boolean r19) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.DPImageView.require(boolean):boolean");
    }

    public boolean discard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16b73158ae39b90fd7b099d17a5e32c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16b73158ae39b90fd7b099d17a5e32c6")).booleanValue();
        }
        if (k.a()) {
            imageLog("discard()");
        }
        this.canClickToRequire = false;
        clearCustomAnimations();
        clearAnimatedImage();
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
        }
        if (this.url != null) {
            if (this.currentLoadState == d.LOADING || this.currentLoadState == d.REQUESTING) {
                e.a.a.b(this.request, getImageDownloadListener());
                return true;
            } else if (this.currentLoadState == d.WAIT_FOR_SIZE) {
                unregisterSizeParserListener();
                return true;
            } else if (this.requireWithContextLifecycle && this.currentLoadState == d.DETACHED_FROM_WINDOW) {
                if (this.lastLoadState == d.LOADING || this.lastLoadState == d.REQUESTING) {
                    e.a.a.b(this.request, getImageDownloadListener());
                } else if (this.lastLoadState == d.WAIT_FOR_SIZE) {
                    unregisterSizeParserListener();
                }
            }
        }
        return false;
    }

    public void forceRetry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5150779b2710da38844de592b44e2469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5150779b2710da38844de592b44e2469");
        } else {
            forceRequire(false);
        }
    }

    public void forceRequire(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dc30c3bacb12b863d0dc2728e3c1f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dc30c3bacb12b863d0dc2728e3c1f74");
            return;
        }
        discard();
        if (z) {
            parseTargetSize();
        }
        setLoadState(d.READY_FOR_REQUESTING);
        loadPlaceHolder(1);
        require(true);
    }

    private void clearCustomAnimations() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dd01d66f24f19d6fff20db0b2c7f799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dd01d66f24f19d6fff20db0b2c7f799");
        } else {
            clearAnimation();
        }
    }

    public void onAnimatedImageDecodeStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "820c57a9b3d99f6b4fb6db5f25c1ee85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "820c57a9b3d99f6b4fb6db5f25c1ee85");
        } else {
            this.mHandler.obtainMessage(1).sendToTarget();
        }
    }

    public void onAnimatedImageFrameReady(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "279a50cc61ffed201d59a55f42269c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "279a50cc61ffed201d59a55f42269c19");
            return;
        }
        this.tmpBitmap = bitmap;
        this.mHandler.obtainMessage(2).sendToTarget();
    }

    public void onAnimatedImageDecodeEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be4debd39cf1930887c6e4cd9eae0c62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be4debd39cf1930887c6e4cd9eae0c62");
            return;
        }
        synchronized (getLock()) {
            if (this.currentLoadState != d.DETACHED_FROM_WINDOW) {
                this.mHandler.obtainMessage(0).sendToTarget();
                if (this.currentLoadState == d.ANIMATING) {
                    setLoadState(d.STOP_ANIMATION);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c implements a.InterfaceC0075a, com.dianping.imagemanager.utils.downloadphoto.e {
        public static ChangeQuickRedirect a;
        public WeakReference<DPImageView> b;

        public c(DPImageView dPImageView) {
            Object[] objArr = {dPImageView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb0428dac26141ccbb9725e11172ae7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb0428dac26141ccbb9725e11172ae7");
            } else {
                this.b = new WeakReference<>(dPImageView);
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66aefe55db6dace1f01ad90e30723a38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66aefe55db6dace1f01ad90e30723a38");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onDownloadStarted(aVar);
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void b(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47f8a164e6ca3bda87b45bad558e134", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47f8a164e6ca3bda87b45bad558e134");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onDownloadCanceled(aVar);
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar, int i, int i2) {
            Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026304ab50c8ddab7098e3f924ffdc74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026304ab50c8ddab7098e3f924ffdc74");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onDownloadProgress(aVar, i, i2);
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
            Object[] objArr = {aVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ede35395fe3bf39a10590ea448a1d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ede35395fe3bf39a10590ea448a1d7");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onDownloadFailed(aVar, dVar);
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void b(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
            Object[] objArr = {aVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b3e567c0811a604007da383ddf0483c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b3e567c0811a604007da383ddf0483c");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onDownloadSucceed(aVar, dVar);
            }
        }

        @Override // com.dianping.imagemanager.animated.a.InterfaceC0075a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13000bf0123211274c528ef9d653f37a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13000bf0123211274c528ef9d653f37a");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onAnimatedImageDecodeStart();
            }
        }

        @Override // com.dianping.imagemanager.animated.a.InterfaceC0075a
        public final void a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b517a078b1918d20e3f7b3468be1a0c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b517a078b1918d20e3f7b3468be1a0c8");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onAnimatedImageFrameReady(bitmap);
            }
        }

        @Override // com.dianping.imagemanager.animated.a.InterfaceC0075a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e756b44e1846914f83f28ca8588d6808", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e756b44e1846914f83f28ca8588d6808");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onAnimatedImageDecodeEnd();
            }
        }

        @Override // com.dianping.imagemanager.animated.a.InterfaceC0075a
        public final boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20fdaeecc711df0554a9516732c77f7f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20fdaeecc711df0554a9516732c77f7f")).booleanValue();
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                return dPImageView.isImageAnimating();
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class e implements com.dianping.imagemanager.utils.downloadphoto.e {
        public static ChangeQuickRedirect a;
        public WeakReference<DPImageView> b;

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar, int i, int i2) {
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void b(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
        }

        public e(DPImageView dPImageView) {
            Object[] objArr = {dPImageView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "435b590d7e84fee66cdcac6caa0787d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "435b590d7e84fee66cdcac6caa0787d9");
            } else {
                this.b = new WeakReference<>(dPImageView);
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void a(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
            Object[] objArr = {aVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd34f1b7dca44d62c2713fb90738b0b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd34f1b7dca44d62c2713fb90738b0b");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onThumbDownloadFailed(aVar, dVar);
            }
        }

        @Override // com.dianping.imagemanager.utils.downloadphoto.e
        public final void b(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
            Object[] objArr = {aVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67192cff4ddd54e23a1b64121d683084", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67192cff4ddd54e23a1b64121d683084");
                return;
            }
            DPImageView dPImageView = this.b.get();
            if (dPImageView != null) {
                dPImageView.onThumbDownloadSucceed(aVar, dVar);
            }
        }
    }

    public void onThumbDownloadSucceed(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
        boolean z = false;
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07d1b0974b00e5bcf6942583ad88b32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07d1b0974b00e5bcf6942583ad88b32d");
        } else if (dVar == null) {
            onDownloadFailed(this.request, null);
        } else {
            this.isThumbFailed = false;
            if (this.request == this.thumbRequest && (this.currentLoadState == d.REQUESTING || this.currentLoadState == d.LOADING || this.currentLoadState == d.FAILED)) {
                if (dVar.b != 0 && dVar.b != -1) {
                    return;
                }
                unregisterAnimatedImageLifecycle();
                updateDebugHint("thumb加载完成");
                ensureMainDrawable(false);
                if (this.isPlaceholder) {
                    clearCustomAnimations();
                    this.isPlaceholder = false;
                    this.showingPlaceholderType = -1;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), dVar.l);
                g.b transScaleType = this.thumbScaleType == null ? transScaleType(this.mDPScaleType) : this.thumbScaleType;
                if (this.mainDrawable.b[2] instanceof g) {
                    g gVar = (g) this.mainDrawable.b[2];
                    gVar.a(bitmapDrawable);
                    if (this.isSaturationColorMatrixValid && this.reuseSaturationColorMatrix != null) {
                        gVar.setColorFilter(new ColorMatrixColorFilter(this.reuseSaturationColorMatrix));
                    }
                    gVar.a(this.imageMatrix);
                    gVar.a(transScaleType);
                } else {
                    g gVar2 = new g(bitmapDrawable, transScaleType);
                    gVar2.a(this.imageMatrix);
                    if (this.isSaturationColorMatrixValid && this.reuseSaturationColorMatrix != null) {
                        gVar2.setColorFilter(new ColorMatrixColorFilter(this.reuseSaturationColorMatrix));
                    }
                    this.mainDrawable.a(2, gVar2);
                    requestLayout();
                }
                if ((dVar.o != 0) && this.fadeInDisplayEnabled) {
                    z = true;
                }
                displayOrInvalidateImage(2, z);
                this.isThumbShowing = true;
            }
            onThumbDownloadSucceed(this.request, dVar);
        }
    }

    public void onThumbDownloadFailed(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e4f618b502c929e968e9bb449f94419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e4f618b502c929e968e9bb449f94419");
            return;
        }
        this.isThumbFailed = true;
        if (getDataRequireState() == com.dianping.imagemanager.utils.b.FAILED) {
            loadPlaceHolder(2);
        }
    }

    public com.dianping.imagemanager.utils.downloadphoto.e getImageDownloadListener() {
        return this.innerImageLoadListener;
    }

    public void onDownloadStarted(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee098df399e0a27cf61b052ccc909e41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee098df399e0a27cf61b052ccc909e41");
        } else if (this.currentLoadState == d.REQUESTING) {
            if (this.isProgressPrint) {
                this.progressHint = "";
            }
            setLoadState(d.LOADING);
            if (this.imageDownloadListener != null) {
                this.imageDownloadListener.a(aVar);
            }
        }
    }

    public void onDownloadCanceled(com.dianping.imagemanager.utils.downloadphoto.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34f72742aa9c2277d133c612106307e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34f72742aa9c2277d133c612106307e0");
        } else if (this.imageDownloadListener != null) {
            this.imageDownloadListener.b(aVar);
        }
    }

    public void onDownloadProgress(com.dianping.imagemanager.utils.downloadphoto.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ff9d70f907240ff3879e4bc7ecd8e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ff9d70f907240ff3879e4bc7ecd8e4");
            return;
        }
        if (this.isProgressPrint && i2 != 0) {
            this.progressHint = ((i * 100) / i2) + "%";
            invalidate();
        }
        if (k.a()) {
            updateDebugHint("网络下载:" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(i / 1024.0f)) + "KB/" + String.format(Locale.ENGLISH, "%.2f", Float.valueOf(i2 / 1024.0f)) + "KB");
        }
        if (this.imageDownloadListener != null) {
            this.imageDownloadListener.a(aVar, i, i2);
        }
    }

    public void onDownloadFailed(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8757a89a6d1e797db703081066449642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8757a89a6d1e797db703081066449642");
            return;
        }
        if (this.isProgressPrint) {
            this.progressHint = "";
        }
        if (aVar == this.request) {
            if (dVar == null) {
                updateDebugHint("返回结果为空");
            } else {
                this.downloadErrorCode = dVar.i;
                Class<?> cls = getClass();
                com.dianping.imagemanager.utils.a.a(cls, AlitaMonitorCenter.AlitaExceptionMonitorConst.LoadPredictor.TYPE_LOAD_PREDICTOR_DOWNLOAD_FAILED, "download failed, errorCode=" + this.downloadErrorCode + " url=" + this.url);
                if ((this.request instanceof com.dianping.imagemanager.utils.downloadphoto.h) && (dVar.f > 4096 || dVar.g > 4096)) {
                    n.a("picsizeover4096", this.downloadErrorCode, (int) dVar.j, 0, 0);
                }
            }
            setLoadState(d.FAILED);
            if (this.imageDownloadListener != null) {
                this.imageDownloadListener.a(aVar, dVar);
            }
            this.request = null;
            return;
        }
        updateDebugHint("请求不一致");
    }

    public void onDownloadSucceed(com.dianping.imagemanager.utils.downloadphoto.a aVar, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "761ab01d0f0bd4705c2524235dda5bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "761ab01d0f0bd4705c2524235dda5bd0");
        } else if (dVar == null) {
            onDownloadFailed(aVar, null);
        } else if (aVar == this.request) {
            if (this.thumbRequest != null) {
                e.a.a.b(this.thumbRequest, this.loadThumbListener);
                this.thumbRequest = null;
            }
            if (this.isProgressPrint) {
                this.progressHint = "";
            }
            this.downloadContent = dVar;
            this.contentDataType = dVar.b;
            if (this.contentDataType == 0 || this.contentDataType == -1) {
                unregisterAnimatedImageLifecycle();
                setLoadState(d.SUCCEED);
                if (k.a()) {
                    StringBuilder sb = new StringBuilder();
                    if (dVar.j > 0) {
                        sb.append(MTURLUtil.FILE_BASE);
                        sb.append(String.format(Locale.ENGLISH, "%.2f", Float.valueOf(((float) dVar.j) / 1024.0f)));
                        sb.append("KB\n");
                    }
                    sb.append("V:");
                    sb.append(getWidth());
                    sb.append(Constants.GestureMoveEvent.KEY_X);
                    sb.append(getHeight());
                    sb.append("\n");
                    if (dVar.f > 0) {
                        sb.append("S:");
                        sb.append(dVar.f);
                        sb.append(Constants.GestureMoveEvent.KEY_X);
                        sb.append(dVar.g);
                        sb.append("\n");
                    }
                    sb.append("D:");
                    sb.append(dVar.d);
                    sb.append(Constants.GestureMoveEvent.KEY_X);
                    sb.append(dVar.e);
                    this.imageDebugInfo = sb.toString();
                    updateDebugHint(this.imageDebugInfo);
                }
                setImageBitmapInternal(dVar.l, dVar.o != 0, true);
                if (this.perfMonitorEnabled) {
                    n.a(dVar.o == 0 ? "imagemonitor.set2display.memcachehit" : "imagemonitor.set2display.memcachemiss", 200, (int) dVar.j, 0, (int) (System.currentTimeMillis() - this.sendRequestTimestamp));
                }
                if ((dVar.f > 4096 || dVar.g > 4096) && dVar.o == 2) {
                    n.a("picsizeover4096", 200, (int) dVar.j, 0, 0);
                }
            } else if (this.contentDataType == 1 || this.contentDataType == 2) {
                setLoadState(d.SUCCEED);
                this.animatedImageDecoder = dVar.m;
                if (this.animatedImageDecoder != null) {
                    setImageBitmapInternal(dVar.l, true, true);
                    onAnimatedImagePrepared();
                } else {
                    setLoadState(d.FAILED);
                    Class<?> cls = getClass();
                    com.dianping.imagemanager.utils.a.b(cls, "decodeFailed", "动图解码失败, url=" + this.url);
                    updateDebugHint("动图解码失败");
                }
            }
            if (this.imageDownloadListener != null) {
                this.imageDownloadListener.b(aVar, dVar);
            }
            this.lastRequest = this.request;
            this.request = null;
        } else {
            updateDebugHint("请求不一致");
        }
    }

    public void setLoadState(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "158fda74898efb9e78df078eb827cadf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "158fda74898efb9e78df078eb827cadf");
        } else if (dVar == this.currentLoadState) {
        } else {
            if (k.a()) {
                imageLog("loadState changed:" + this.currentLoadState + " -> " + dVar);
            }
            this.lastLoadState = this.currentLoadState;
            this.currentLoadState = dVar;
            switch (this.currentLoadState) {
                case EMPTY:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.NULL;
                    updateDebugHint("url为空");
                    loadPlaceHolder(0);
                    return;
                case NOT_URL:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.SUCCEED;
                    updateDebugHint("非网络图片");
                    return;
                case WAIT_FOR_SIZE:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.PENDING;
                    updateDebugHint("待尺寸确定");
                    return;
                case READY_FOR_REQUESTING:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.PENDING;
                    updateDebugHint("待发起请求");
                    return;
                case REQUESTING:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.PENDING;
                    updateDebugHint("请求初始化");
                    return;
                case LOADING:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.PENDING;
                    updateDebugHint("排队中");
                    return;
                case FAILED:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.FAILED;
                    updateDebugHint("加载失败:" + this.downloadErrorCode);
                    if (this.request instanceof com.dianping.imagemanager.utils.downloadphoto.h) {
                        if (!((com.dianping.imagemanager.utils.downloadphoto.h) this.request).s()) {
                            loadPlaceHolder(3);
                            this.canClickToRequire = true;
                            this.savedClickable = isClickable();
                            setClickable(true);
                            return;
                        } else if (this.needReload) {
                            loadPlaceHolder(4);
                            this.canClickToRequire = true;
                            this.savedClickable = isClickable();
                            setClickable(true);
                            return;
                        } else if (!this.enableNetworkThumb || this.isThumbFailed) {
                            loadPlaceHolder(2);
                            return;
                        } else {
                            return;
                        }
                    }
                    loadPlaceHolder(2);
                    return;
                case SUCCEED:
                    this.dataRequireState = com.dianping.imagemanager.utils.b.SUCCEED;
                    updateDebugHint(TextUtils.isEmpty(this.imageDebugInfo) ? "加载完成" : this.imageDebugInfo);
                    return;
                default:
                    if (this.currentLoadState != null) {
                        updateDebugHint(this.currentLoadState.toString());
                        return;
                    }
                    return;
            }
        }
    }

    public com.dianping.imagemanager.image.drawable.f getPlaceholder(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c909fffdd7e7b8db55b103da3a27c6a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.imagemanager.image.drawable.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c909fffdd7e7b8db55b103da3a27c6a1");
        }
        if (i < 0 || i >= 5) {
            k.d(TAG, "placeholderType should be 0~4");
            return null;
        }
        return this.placeholders[i];
    }

    private void displayOrInvalidateImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c596994320a64bf35504e773cb2186e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c596994320a64bf35504e773cb2186e");
        } else if (this.isPlaceholder) {
        } else {
            displayOrInvalidateImage(3, false);
        }
    }

    private void displayOrInvalidateImage(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4fefa6630fdbc5453824ebc97995a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4fefa6630fdbc5453824ebc97995a70");
            return;
        }
        ensureMainDrawable(false);
        this.mainDrawable.a();
        if (this.mainDrawable.b[i] instanceof g) {
            g gVar = (g) this.mainDrawable.b[i];
            if (this.isCircle || this.cornerRadius > 0.0f || this.borderStrokeWidth > 0.0f) {
                if (gVar.getCurrent() instanceof r) {
                    setRoundedParams((r) gVar.getCurrent());
                } else {
                    Drawable a2 = r.a(gVar.getCurrent());
                    if (a2 instanceof r) {
                        setRoundedParams((r) a2);
                    } else if (a2 instanceof LayerDrawable) {
                        LayerDrawable layerDrawable = (LayerDrawable) a2;
                        int numberOfLayers = layerDrawable.getNumberOfLayers();
                        for (int i2 = 0; i2 < numberOfLayers; i2++) {
                            Drawable drawable = layerDrawable.getDrawable(i2);
                            if (drawable instanceof r) {
                                setRoundedParams((r) drawable);
                            }
                        }
                    }
                    gVar.a(a2);
                    if (this.isSaturationColorMatrixValid && this.reuseSaturationColorMatrix != null) {
                        gVar.setColorFilter(new ColorMatrixColorFilter(this.reuseSaturationColorMatrix));
                    }
                    gVar.a(g.b.b);
                }
            }
        }
        showLayer(i, z);
        this.mainDrawable.b();
    }

    public void setRoundedParams(r rVar) {
        int i;
        r rVar2;
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "724b0a6b8c7880677081cb74632445fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "724b0a6b8c7880677081cb74632445fb");
        } else if (rVar == null) {
        } else {
            rVar.f = this.isCircle;
            float f2 = this.cornerRadius;
            Object[] objArr2 = {Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect3 = r.a;
            if (PatchProxy.isSupport(objArr2, rVar, changeQuickRedirect3, false, "d85861add9c1dbc5f32d7de04e3b46e8", RobustBitConfig.DEFAULT_VALUE)) {
                r rVar3 = (r) PatchProxy.accessDispatch(objArr2, rVar, changeQuickRedirect3, false, "d85861add9c1dbc5f32d7de04e3b46e8");
                i = 4;
            } else {
                Object[] objArr3 = {Float.valueOf(f2), Float.valueOf(f2), Float.valueOf(f2), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect4 = r.a;
                i = 4;
                if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect4, false, "c9eae0f9a91b22f97f99242e8e83460d", RobustBitConfig.DEFAULT_VALUE)) {
                    r rVar4 = (r) PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect4, false, "c9eae0f9a91b22f97f99242e8e83460d");
                } else {
                    HashSet hashSet = new HashSet(4);
                    hashSet.add(Float.valueOf(f2));
                    hashSet.add(Float.valueOf(f2));
                    hashSet.add(Float.valueOf(f2));
                    hashSet.add(Float.valueOf(f2));
                    hashSet.remove(Float.valueOf(0.0f));
                    if (hashSet.size() > 1) {
                        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
                    }
                    if (!hashSet.isEmpty()) {
                        float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                            throw new IllegalArgumentException("Invalid radius value: " + floatValue);
                        }
                        rVar.d = floatValue;
                    } else {
                        rVar.d = 0.0f;
                    }
                    int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    rVar.e[r.i] = i2 > 0;
                    rVar.e[r.j] = i2 > 0;
                    rVar.e[r.l] = i2 > 0;
                    rVar.e[r.k] = i2 > 0;
                }
            }
            boolean z = this.isRounedCorner[0];
            boolean z2 = this.isRounedCorner[1];
            boolean z3 = this.isRounedCorner[2];
            boolean z4 = this.isRounedCorner[3];
            Object[] objArr4 = new Object[i];
            objArr4[0] = Byte.valueOf(z ? (byte) 1 : (byte) 0);
            objArr4[1] = Byte.valueOf(z2 ? (byte) 1 : (byte) 0);
            objArr4[2] = Byte.valueOf(z3 ? (byte) 1 : (byte) 0);
            objArr4[3] = Byte.valueOf(z4 ? (byte) 1 : (byte) 0);
            ChangeQuickRedirect changeQuickRedirect5 = r.a;
            if (PatchProxy.isSupport(objArr4, rVar, changeQuickRedirect5, false, "debe11c9a0bfc4be661e979d82a9f499", RobustBitConfig.DEFAULT_VALUE)) {
                r rVar5 = (r) PatchProxy.accessDispatch(objArr4, rVar, changeQuickRedirect5, false, "debe11c9a0bfc4be661e979d82a9f499");
            } else {
                rVar.e[r.i] = z;
                rVar.e[r.j] = z2;
                rVar.e[r.l] = z3;
                rVar.e[r.k] = z4;
            }
            int i3 = this.borderStrokeColor;
            Object[] objArr5 = {Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect6 = r.a;
            if (PatchProxy.isSupport(objArr5, rVar, changeQuickRedirect6, false, "a3584439756bcaad663638b051b3aebf", RobustBitConfig.DEFAULT_VALUE)) {
                rVar2 = (r) PatchProxy.accessDispatch(objArr5, rVar, changeQuickRedirect6, false, "a3584439756bcaad663638b051b3aebf");
            } else {
                ColorStateList valueOf = ColorStateList.valueOf(i3);
                Object[] objArr6 = {valueOf};
                ChangeQuickRedirect changeQuickRedirect7 = r.a;
                if (PatchProxy.isSupport(objArr6, rVar, changeQuickRedirect7, false, "8f7e1067ee298d0a21ba5a3fbbae3875", RobustBitConfig.DEFAULT_VALUE)) {
                    rVar2 = (r) PatchProxy.accessDispatch(objArr6, rVar, changeQuickRedirect7, false, "8f7e1067ee298d0a21ba5a3fbbae3875");
                } else {
                    if (valueOf == null) {
                        valueOf = ColorStateList.valueOf(0);
                    }
                    rVar.h = valueOf;
                    rVar.c.setColor(rVar.h.getColorForState(rVar.getState(), -16777216));
                    rVar2 = rVar;
                }
            }
            float f3 = this.borderStrokeWidth;
            Object[] objArr7 = {Float.valueOf(f3)};
            ChangeQuickRedirect changeQuickRedirect8 = r.a;
            if (PatchProxy.isSupport(objArr7, rVar2, changeQuickRedirect8, false, "87f94b3bd02c0d671ad2ca34e4b8bdb4", RobustBitConfig.DEFAULT_VALUE)) {
                r rVar6 = (r) PatchProxy.accessDispatch(objArr7, rVar2, changeQuickRedirect8, false, "87f94b3bd02c0d671ad2ca34e4b8bdb4");
            } else {
                rVar2.g = f3;
                rVar2.c.setStrokeWidth(rVar2.g);
                rVar2.a();
            }
            rVar.a(transScaleType(this.mDPScaleType));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3849c0957a15b1b52bfc19a5b0ec2690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3849c0957a15b1b52bfc19a5b0ec2690");
            return;
        }
        super.onDraw(canvas);
        drawOverlay(canvas);
    }

    public void drawOverlay(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28e624945aed64851643d517e1c9bbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28e624945aed64851643d517e1c9bbde");
            return;
        }
        if (this.currentLoadState == d.LOADING && this.isProgressPrint) {
            if (progressHintPaint == null) {
                Paint paint = new Paint();
                progressHintPaint = paint;
                paint.setColor(getContext().getResources().getColor(17170435));
                progressHintPaint.setTextAlign(Paint.Align.CENTER);
                progressHintPaint.setTextSize(getResources().getDimensionPixelSize(R.dimen.progress_text_size));
            }
            canvas.drawText(this.progressHint, getWidth() / 2.0f, (getHeight() / 2.0f) - progressHintPaint.ascent(), progressHintPaint);
        }
        if (this.overlayDrawable != null) {
            int intrinsicWidth = this.overlayDrawable.getIntrinsicWidth();
            int intrinsicHeight = this.overlayDrawable.getIntrinsicHeight();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if ((this.overlayDrawableWidth == intrinsicWidth && this.overlayDrawableHeight == intrinsicHeight && this.overlayCanvasWidth == width && this.overlayCanvasHeight == height) ? false : true) {
                this.overlayDrawableWidth = intrinsicWidth;
                this.overlayDrawableHeight = intrinsicHeight;
                this.overlayCanvasWidth = width;
                this.overlayCanvasHeight = height;
                refreshOverlayConfig();
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.clipRect(getPaddingLeft() + this.overlayRect.left, getPaddingTop() + this.overlayRect.top, getPaddingLeft() + this.overlayRect.right, getPaddingTop() + this.overlayRect.bottom);
            canvas.translate(getPaddingLeft() + this.overlayRect.left, getPaddingTop() + this.overlayRect.top);
            if (this.overlayMatrix != null) {
                canvas.concat(this.overlayMatrix);
            }
            this.overlayDrawable.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (!k.a() || this.debugHint.length() <= 0) {
            return;
        }
        if (debugHintTextPaint == null) {
            Paint paint2 = new Paint();
            debugHintTextPaint = paint2;
            paint2.setColor(getContext().getResources().getColor(17170435));
            debugHintTextPaint.setTextAlign(Paint.Align.CENTER);
            debugHintTextPaint.setTextSize(getResources().getDimensionPixelSize(R.dimen.debug_text_size));
            debugHintTextPaint.setAntiAlias(true);
        }
        if (debugHintBackgroundPaint == null) {
            Paint paint3 = new Paint();
            debugHintBackgroundPaint = paint3;
            paint3.setColor(getContext().getResources().getColor(17170447));
            debugHintBackgroundPaint.setAlpha(128);
        }
        String[] split = this.debugHint.split("\n");
        canvas.drawRect(0.0f, (int) (getHeight() + (split.length * (debugHintTextPaint.ascent() - debugHintTextPaint.descent()))), getWidth(), getHeight(), debugHintBackgroundPaint);
        for (int i = 0; i < split.length; i++) {
            canvas.drawText(split[i], getWidth() / 2.0f, (getHeight() + (((split.length - i) - 1) * (debugHintTextPaint.ascent() - debugHintTextPaint.descent()))) - debugHintTextPaint.descent(), debugHintTextPaint);
        }
    }

    @Override // android.widget.ImageView
    public void animateTransform(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f2582b3df8f3a1cec824a469d50290c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f2582b3df8f3a1cec824a469d50290c");
        } else {
            invalidate();
        }
    }

    public void refreshOverlayConfig() {
        float f2;
        float f3;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "129ea8baba7e326d87cde0d3aadfe1ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "129ea8baba7e326d87cde0d3aadfe1ad");
            return;
        }
        boolean z = true;
        boolean z2 = this.overlayDrawableWidth > 0 && this.overlayDrawableHeight > 0;
        if (this.overlayAbsoluteWidth > 0 && this.overlayAbsoluteHeight > 0) {
            f3 = Math.min(this.overlayCanvasHeight, this.overlayAbsoluteHeight);
            f2 = Math.min(this.overlayCanvasWidth, this.overlayAbsoluteWidth);
        } else if (z2) {
            f2 = (int) (((Math.min(this.overlayCanvasWidth, (this.overlayDrawableWidth * this.overlayCanvasHeight) / this.overlayDrawableHeight) * this.overlayPercent) / 100.0f) + 0.5f);
            f3 = (int) (((Math.min(this.overlayCanvasHeight, (this.overlayDrawableHeight * this.overlayCanvasWidth) / this.overlayDrawableWidth) * this.overlayPercent) / 100.0f) + 0.5f);
        } else {
            f2 = (int) (((this.overlayCanvasWidth * this.overlayPercent) / 100.0f) + 0.5f);
            f3 = (int) (((this.overlayCanvasHeight * this.overlayPercent) / 100.0f) + 0.5f);
        }
        if (z2) {
            this.overlayDrawable.setBounds(0, 0, this.overlayDrawableWidth, this.overlayDrawableHeight);
        } else {
            this.overlayDrawable.setBounds(0, 0, (int) f2, (int) f3);
        }
        if ((this.overlayDrawableWidth >= 0 && f2 != this.overlayDrawableWidth) || (this.overlayDrawableHeight >= 0 && f3 != this.overlayDrawableHeight)) {
            z = false;
        }
        if (!z) {
            this.mTempSrc.set(0.0f, 0.0f, this.overlayDrawableWidth, this.overlayDrawableHeight);
            this.mTempDst.set(0.0f, 0.0f, f2, f3);
            if (this.overlayMatrix == null) {
                this.overlayMatrix = new Matrix();
            }
            this.overlayMatrix.reset();
            this.overlayMatrix.setRectToRect(this.mTempSrc, this.mTempDst, Matrix.ScaleToFit.CENTER);
        } else {
            this.overlayMatrix = null;
        }
        switch (this.overlayGravity) {
            case 0:
                this.overlayRect.left = (int) ((this.overlayCanvasWidth - f2) / 2.0f);
                this.overlayRect.top = (int) ((this.overlayCanvasHeight - f3) / 2.0f);
                this.overlayRect.right = (int) ((this.overlayCanvasWidth + f2) / 2.0f);
                this.overlayRect.bottom = (int) ((this.overlayCanvasHeight + f3) / 2.0f);
                return;
            case 1:
                this.overlayRect.left = 0;
                this.overlayRect.top = 0;
                this.overlayRect.right = (int) f2;
                this.overlayRect.bottom = (int) f3;
                return;
            case 2:
                this.overlayRect.left = 0;
                this.overlayRect.top = (int) (this.overlayCanvasHeight - f3);
                this.overlayRect.right = (int) f2;
                this.overlayRect.bottom = this.overlayCanvasHeight;
                return;
            case 3:
                this.overlayRect.left = (int) (this.overlayCanvasWidth - f2);
                this.overlayRect.top = 0;
                this.overlayRect.right = this.overlayCanvasWidth;
                this.overlayRect.bottom = (int) f3;
                return;
            case 4:
                this.overlayRect.left = (int) (this.overlayCanvasWidth - f2);
                this.overlayRect.top = (int) (this.overlayCanvasHeight - f3);
                this.overlayRect.right = this.overlayCanvasWidth;
                this.overlayRect.bottom = this.overlayCanvasHeight;
                return;
            default:
                return;
        }
    }

    public void safeInvalidate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a7b39ac172e7d77f55ddd3a0cbf0dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a7b39ac172e7d77f55ddd3a0cbf0dee");
        } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            invalidate();
        } else {
            this.mInvalidateHandler.sendEmptyMessage(0);
        }
    }

    @Deprecated
    public DPImageView enableProgressPrint(boolean z) {
        this.isProgressPrint = z;
        return this;
    }

    public DPImageView setRequireBeforeAttach(boolean z) {
        this.requireBeforeAttach = z;
        return this;
    }

    public DPImageView setPlaceholders(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "229d3ef7548016e6396b507da28d66a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "229d3ef7548016e6396b507da28d66a5");
        }
        setPlaceholderInternal(0, resId2Drawable(i));
        setPlaceholderInternal(1, resId2Drawable(i2));
        setPlaceholderInternal(2, resId2Drawable(i3));
        return this;
    }

    public DPImageView setPlaceholders(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "878b7753936f06ca183d8dc30fb63c26", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "878b7753936f06ca183d8dc30fb63c26");
        }
        setPlaceholderInternal(0, resId2Drawable(i));
        setPlaceholderInternal(1, resId2Drawable(i2));
        setPlaceholderInternal(2, resId2Drawable(i3));
        setPlaceholderInternal(3, resId2Drawable(i4));
        setPlaceholderInternal(4, resId2Drawable(i5));
        return this;
    }

    public DPImageView setPlaceholder(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa8174d774228ab302931c2c94a34a11", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa8174d774228ab302931c2c94a34a11");
        }
        if (i < 0 || i >= 5) {
            k.d(TAG, "placeholderType should be 0~4");
        } else {
            setPlaceholderInternal(i, resId2Drawable(i2));
        }
        return this;
    }

    public DPImageView setPlaceholders(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        Object[] objArr = {drawable, drawable2, drawable3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dce92b281b255822a7d9f07ccfe9f788", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dce92b281b255822a7d9f07ccfe9f788");
        }
        setPlaceholderInternal(0, drawable);
        setPlaceholderInternal(1, drawable2);
        setPlaceholderInternal(2, drawable3);
        return this;
    }

    public DPImageView setPlaceholders(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5) {
        Object[] objArr = {drawable, drawable2, drawable3, drawable4, drawable5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40ac3c1c827bd2440de15ff77ffca118", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40ac3c1c827bd2440de15ff77ffca118");
        }
        setPlaceholderInternal(0, drawable);
        setPlaceholderInternal(1, drawable2);
        setPlaceholderInternal(2, drawable3);
        setPlaceholderInternal(3, drawable4);
        setPlaceholderInternal(4, drawable5);
        return this;
    }

    public DPImageView setPlaceholder(int i, Drawable drawable) {
        Object[] objArr = {Integer.valueOf(i), drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75f7c822f2eab5e29dcb73974fff211e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75f7c822f2eab5e29dcb73974fff211e");
        }
        setPlaceholderInternal(i, drawable);
        return this;
    }

    private void initPlaceholderAttr(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0437004c90355a279d1d076315a3b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0437004c90355a279d1d076315a3b81");
            return;
        }
        ensurePlaceholderParamsInit();
        if (i3 >= 0) {
            this.placeholderScaleTypes[i] = frescoScaleTypeArray[i3];
        } else if (i2 != 7) {
            this.placeholderScaleTypes[i] = frescoScaleTypeArray[i2];
        }
    }

    private void setPlaceholderInternal(int i, Drawable drawable) {
        Object[] objArr = {Integer.valueOf(i), drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a420cf0421051425f13b663c13879bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a420cf0421051425f13b663c13879bc1");
        } else if (i < 0 || i >= 5) {
            k.d(TAG, "placeholderType should be 0~4");
        } else {
            ensurePlaceholderParamsInit();
            if (drawable == null) {
                this.placeholders[i] = null;
                return;
            }
            com.dianping.imagemanager.image.drawable.f fVar = this.placeholders[i];
            if (fVar == null) {
                com.dianping.imagemanager.image.drawable.f fVar2 = new com.dianping.imagemanager.image.drawable.f(drawable, this.placeholderScaleTypes[i]);
                fVar2.a(this.placeholderBackgroundColor);
                fVar2.a(this.isCircle);
                fVar2.a(this.cornerRadius);
                fVar2.a(this.isRounedCorner[0], this.isRounedCorner[1], this.isRounedCorner[2], this.isRounedCorner[3]);
                this.placeholders[i] = fVar2;
            } else {
                Object[] objArr2 = {drawable};
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.imagemanager.image.drawable.e.a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "d13db603729831299a1b4dd1ac8a9582", RobustBitConfig.DEFAULT_VALUE)) {
                    Drawable drawable2 = (Drawable) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "d13db603729831299a1b4dd1ac8a9582");
                } else {
                    fVar.a(drawable);
                }
            }
            if (this.currentLoadState == d.EMPTY && i == 0) {
                loadPlaceHolder(0);
            } else if (this.currentLoadState != d.FAILED) {
                if (i == 1) {
                    if (this.currentLoadState == d.READY_FOR_REQUESTING || this.currentLoadState == d.REQUESTING || this.currentLoadState == d.LOADING) {
                        loadPlaceHolder(1);
                    }
                }
            } else if (!(this.request instanceof com.dianping.imagemanager.utils.downloadphoto.h)) {
                if (i == 2) {
                    loadPlaceHolder(2);
                }
            } else if (!((com.dianping.imagemanager.utils.downloadphoto.h) this.request).s() && i == 3) {
                loadPlaceHolder(3);
            } else if (this.needReload && i == 4) {
                loadPlaceHolder(4);
            } else if ((!this.enableNetworkThumb || this.isThumbFailed) && i == 2) {
                loadPlaceHolder(2);
            }
        }
    }

    public static b transDPScaleType(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9df0f5c449b4af298546232f3daa1019", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9df0f5c449b4af298546232f3daa1019");
        }
        if (scaleType == null) {
            return b.FIT_CENTER;
        }
        switch (AnonymousClass6.b[scaleType.ordinal()]) {
            case 1:
                return b.CENTER_INSIDE;
            case 2:
                return b.CENTER_CROP;
            case 3:
                return b.FIT_CENTER;
            case 4:
                return b.FIT_XY;
            case 5:
                return b.CENTER;
            case 6:
                return b.FIT_START;
            case 7:
                return b.FIT_END;
            case 8:
                return b.MATRIX;
            default:
                return b.FIT_CENTER;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.DPImageView$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] b = new int[ImageView.ScaleType.values().length];

        static {
            try {
                b[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[ImageView.ScaleType.FIT_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = new int[d.valuesCustom().length];
            try {
                a[d.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.NOT_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[d.WAIT_FOR_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[d.READY_FOR_REQUESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[d.REQUESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[d.LOADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[d.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[d.SUCCEED.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static g.b transScaleType(b bVar) {
        if (bVar == null) {
            return g.b.d;
        }
        return bVar.r;
    }

    private Drawable resId2Drawable(int i) {
        Drawable drawable;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c24959bbcf8992a2ae3139213405912e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c24959bbcf8992a2ae3139213405912e");
        }
        if (i == 0) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable = getResources().getDrawable(i, null);
            } else {
                drawable = getResources().getDrawable(i);
            }
            return drawable;
        } catch (Throwable unused) {
            com.dianping.imagemanager.utils.a.b(DPImageView.class, "resId2DrawableException", "Context = " + getContext().getClass().getSimpleName() + " resId =" + i);
            return null;
        }
    }

    public DPImageView setPlaceholderAnimation(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed42c3ab47c0bba280144edd884ef837", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed42c3ab47c0bba280144edd884ef837");
        }
        if (i < 0 || i >= 5) {
            k.d(TAG, "placeholderType should be 0~4");
        } else {
            this.placeholderAnima[i] = i2 == 0 ? null : AnimationUtils.loadAnimation(getContext(), i2);
        }
        return this;
    }

    public DPImageView setPlaceholderAnimation(int i, Animation animation) {
        Object[] objArr = {Integer.valueOf(i), animation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce9fcd57f3ee9c68aae3449002d5c51c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce9fcd57f3ee9c68aae3449002d5c51c");
        }
        if (i < 0 || i >= 5) {
            k.d(TAG, "placeholderType should be 0~4");
        } else {
            this.placeholderAnima[i] = animation;
        }
        return this;
    }

    public DPImageView setPlaceholderScaleType(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c812ca09d43ce2086b63716a9408010b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c812ca09d43ce2086b63716a9408010b");
        }
        this.placeholderScaleType = transScaleType(transDPScaleType(scaleType));
        setPlaceholderScaleType(0, scaleType);
        setPlaceholderScaleType(1, scaleType);
        setPlaceholderScaleType(2, scaleType);
        setPlaceholderScaleType(3, scaleType);
        setPlaceholderScaleType(4, scaleType);
        return this;
    }

    public DPImageView setPlaceholderScaleType(int i, ImageView.ScaleType scaleType) {
        Object[] objArr = {Integer.valueOf(i), scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "429a3fc01554d74d5d80c2d4108d5325", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "429a3fc01554d74d5d80c2d4108d5325");
        }
        if (i < 0 || i > 4) {
            return this;
        }
        setPlaceholderScaleTypeInternal(i, transScaleType(transDPScaleType(scaleType)));
        if (this.isPlaceholder && this.mainDrawable != null && i == this.showingPlaceholderType) {
            this.mainDrawable.invalidateSelf();
        }
        return this;
    }

    private void setPlaceholderScaleTypeInternal(int i, g.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "595d29a43e38645d3d638a02964e01ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "595d29a43e38645d3d638a02964e01ed");
            return;
        }
        ensurePlaceholderParamsInit();
        this.placeholderScaleTypes[i] = bVar;
        if (this.placeholders[i] != null) {
            this.placeholders[i].a(bVar);
        }
    }

    public DPImageView setPlaceholderBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4653bd26d4eeaeeb183164d033b38981", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4653bd26d4eeaeeb183164d033b38981");
        }
        this.placeholderBackgroundColor = i;
        for (int i2 = 0; i2 < 5; i2++) {
            if (this.placeholders[i2] != null) {
                this.placeholders[i2].a(this.placeholderBackgroundColor);
            }
        }
        if (this.isPlaceholder && this.mainDrawable != null) {
            this.mainDrawable.invalidateSelf();
        }
        return this;
    }

    public DPImageView setThumbScaleType(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bcb7019b8373728be9ff6daabc1903a", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bcb7019b8373728be9ff6daabc1903a");
        }
        this.thumbScaleType = transScaleType(transDPScaleType(scaleType));
        if (this.isThumbShowing && this.mainDrawable != null) {
            this.mainDrawable.invalidateSelf();
        }
        return this;
    }

    public void markPicasso() {
        this.isPicasso = true;
    }

    public DPImageView setImageModule(String str) {
        this.mModule = str;
        this.mThumbModule = str;
        return this;
    }

    public DPImageView setImageModule(String str, String str2) {
        this.mModule = str;
        this.mThumbModule = str2;
        return this;
    }

    public void setImageDownloadListener(com.dianping.imagemanager.utils.downloadphoto.e eVar) {
        this.imageDownloadListener = eVar;
    }

    @Deprecated
    public DPImageView setOnLoadingListener(q qVar) {
        this.onLoadingListener = qVar;
        return this;
    }

    @Deprecated
    public DPImageView setOnLoadChangeListener(p pVar) {
        this.onLoadChangeListener = pVar;
        return this;
    }

    public DPImageView setImageProcessor(h hVar) {
        this.imageProcessor = hVar;
        return this;
    }

    public DPImageView setNeedReload(boolean z) {
        this.needReload = z;
        return this;
    }

    @Deprecated
    public DPImageView setForceDownload(boolean z) {
        this.forceDownload = z;
        return this;
    }

    public DPImageView setIsCircle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0809d280225bdca29e1196c88023b61", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0809d280225bdca29e1196c88023b61");
        }
        this.isCircle = z;
        for (int i = 0; i < 5; i++) {
            if (this.placeholders[i] != null) {
                this.placeholders[i].a(z);
            }
        }
        if (this.isPlaceholder && this.mainDrawable != null) {
            this.mainDrawable.invalidateSelf();
        }
        displayOrInvalidateImage();
        return this;
    }

    private void setCornerRadiusFromAttr(float f2, int i) {
        Object[] objArr = {Float.valueOf(f2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3ce2e3c4ded7569d29ed6fb0ea73a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3ce2e3c4ded7569d29ed6fb0ea73a78");
            return;
        }
        this.cornerRadius = f2;
        this.isRounedCorner[0] = (i & 1) != 0;
        this.isRounedCorner[1] = (i & 2) != 0;
        this.isRounedCorner[2] = (i & 4) != 0;
        this.isRounedCorner[3] = (i & 8) != 0;
    }

    public DPImageView setCornerRadius(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "120f39bcb636f0cb424ea044c4fc8f63", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "120f39bcb636f0cb424ea044c4fc8f63") : setCornerRadius(f2, true, true, true, true);
    }

    public DPImageView setCornerRadius(int i, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd8212aecd58c4ed0a88fb9971334cf5", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd8212aecd58c4ed0a88fb9971334cf5") : setCornerRadius(transUnit(getContext(), i, f2), true, true, true, true);
    }

    public DPImageView setCornerRadius(float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc241bd0aafd4d9dc1d5936b3ed1d2ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc241bd0aafd4d9dc1d5936b3ed1d2ab");
        }
        this.cornerRadius = f2;
        this.isRounedCorner[0] = z;
        this.isRounedCorner[1] = z2;
        this.isRounedCorner[2] = z3;
        this.isRounedCorner[3] = z4;
        for (int i = 0; i < 5; i++) {
            if (this.placeholders[i] != null) {
                this.placeholders[i].a(this.cornerRadius);
                this.placeholders[i].a(this.isRounedCorner[0], this.isRounedCorner[1], this.isRounedCorner[2], this.isRounedCorner[3]);
            }
        }
        if (this.isPlaceholder && this.mainDrawable != null) {
            this.mainDrawable.invalidateSelf();
        }
        displayOrInvalidateImage();
        return this;
    }

    public DPImageView setCornerRadius(int i, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffbc1a5ab89e87f5c7047b412df6ebaa", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffbc1a5ab89e87f5c7047b412df6ebaa") : setCornerRadius(transUnit(getContext(), i, f2), z, z2, z3, z4);
    }

    public DPImageView setBorderStrokeWidth(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8727851686457e214f3ed3841a37386b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8727851686457e214f3ed3841a37386b");
        }
        this.borderStrokeWidth = f2;
        displayOrInvalidateImage();
        return this;
    }

    public DPImageView setBorderStrokeWidth(int i, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea09a0e3ea8c2400e4c54d7b719245b1", RobustBitConfig.DEFAULT_VALUE) ? (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea09a0e3ea8c2400e4c54d7b719245b1") : setBorderStrokeWidth(transUnit(getContext(), i, f2));
    }

    public DPImageView setBorderStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4b2f6992aa8af91264467f8ff1d45f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4b2f6992aa8af91264467f8ff1d45f7");
        }
        this.borderStrokeColor = i;
        displayOrInvalidateImage();
        return this;
    }

    public DPImageView setImageSize(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b7785e2d1f450ca9fad5bd0fa6d689b", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b7785e2d1f450ca9fad5bd0fa6d689b");
        }
        if (i2 > 0) {
            i2 = (int) transUnit(getContext(), i, i2);
        }
        if (i3 > 0) {
            i3 = (int) transUnit(getContext(), i, i3);
        }
        return setImageSize(i2, i3);
    }

    public static float transUnit(Context context, int i, float f2) {
        Object[] objArr = {context, Integer.valueOf(i), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc0e0e12844a785572ff165a96928250", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc0e0e12844a785572ff165a96928250")).floatValue() : TypedValue.applyDimension(i, f2, context.getResources().getDisplayMetrics());
    }

    public DPImageView setImageSize(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d59055c67e682043069ff619d351f55", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d59055c67e682043069ff619d351f55");
        }
        if (i < -2 || i2 < -2) {
            throw new IllegalArgumentException("invalid size! width=" + i + " height=" + i2);
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        if ((i == 0 || i == -2) && (i2 == 0 || i2 == -2)) {
            getLayoutParams().width = -2;
            getLayoutParams().height = -2;
            this.isSizeAdaptive = false;
            this.isCustomSized = false;
            this.isCustomWidthWaitForLayout = false;
        } else {
            this.customWidth = i;
            this.customHeight = i2;
            getLayoutParams().width = this.customWidth;
            getLayoutParams().height = this.customHeight;
            if (this.customWidth < 0 && this.customHeight < 0) {
                this.isSizeAdaptive = false;
                this.isCustomSized = false;
                this.isCustomWidthWaitForLayout = false;
            } else {
                this.isSizeAdaptive = this.customWidth == 0 || this.customHeight == 0;
                this.isCustomSized = true;
                this.isCustomWidthWaitForLayout = this.customWidth < 0;
                if (this.customHeight < 0) {
                    z = true;
                }
            }
        }
        this.isCustomHeightWaitForLayout = z;
        requestLayout();
        return this;
    }

    public DPImageView setRequestOption(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a222d36a692f067f601b6d2bba9f214f", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a222d36a692f067f601b6d2bba9f214f");
        }
        this.requestOption = fVar.a(this.requestOption);
        return this;
    }

    public void setScaleTypeWithoutSave(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bc3294fe6514e206811f99c80373946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bc3294fe6514e206811f99c80373946");
        } else {
            super.setScaleType(scaleType);
        }
    }

    public void setOverlay(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fde3c81ebe3da92ee83cbdf92fd0ce4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fde3c81ebe3da92ee83cbdf92fd0ce4a");
        } else if (i == this.overlayResId) {
        } else {
            this.overlayResId = i;
            this.overlayDrawable = resId2Drawable(this.overlayResId);
            this.overlayDrawableWidth = 0;
            this.overlayDrawableHeight = 0;
            this.overlayCanvasWidth = 0;
            this.overlayCanvasHeight = 0;
            safeInvalidate();
        }
    }

    public void setOverlay(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67a82bb075e0de098630b95acaae94fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67a82bb075e0de098630b95acaae94fc");
        } else if (drawable == this.overlayDrawable) {
        } else {
            this.overlayResId = 0;
            this.overlayDrawable = drawable;
            this.overlayDrawableWidth = 0;
            this.overlayDrawableHeight = 0;
            this.overlayCanvasWidth = 0;
            this.overlayCanvasHeight = 0;
            safeInvalidate();
        }
    }

    public void setOverlayPercent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd252960ea51d3fff2e4fbb4e2ca6bbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd252960ea51d3fff2e4fbb4e2ca6bbc");
            return;
        }
        this.overlayAbsoluteWidth = -1;
        this.overlayAbsoluteHeight = -1;
        i = (i <= 0 || i > 100) ? 100 : 100;
        if (i == this.overlayPercent) {
            return;
        }
        this.overlayPercent = i;
        safeInvalidate();
    }

    public void setOverlayGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42236fde72b15b53135a30442fe2e8c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42236fde72b15b53135a30442fe2e8c4");
        } else if (i == this.overlayGravity) {
        } else {
            this.overlayGravity = i;
            safeInvalidate();
        }
    }

    public void setOverlayAbsoluteDimension(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f58dbaaeec3afb3db2057d45a637d94c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f58dbaaeec3afb3db2057d45a637d94c");
            return;
        }
        if (i2 <= 0 || i <= 0) {
            i = -1;
            i2 = -1;
        }
        if (i2 == this.overlayAbsoluteHeight && i == this.overlayAbsoluteWidth) {
            return;
        }
        this.overlayAbsoluteHeight = i2;
        this.overlayAbsoluteWidth = i;
        this.overlayDrawableWidth = 0;
        this.overlayDrawableHeight = 0;
        this.overlayCanvasWidth = 0;
        this.overlayCanvasHeight = 0;
        safeInvalidate();
    }

    public void setImageSaturation(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbe32f0cb9a88a48e42c392d4fa35ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbe32f0cb9a88a48e42c392d4fa35ef1");
        } else if (Float.compare(f2, 1.0f) >= 0) {
            this.isSaturationColorMatrixValid = false;
            if (this.mainDrawable != null) {
                if (this.mainDrawable.b[2] != null) {
                    this.mainDrawable.b[2].setColorFilter(this.savedColorFilter);
                }
                if (this.mainDrawable.b[3] != null) {
                    this.mainDrawable.b[3].setColorFilter(this.savedColorFilter);
                }
            }
        } else {
            this.isSaturationColorMatrixValid = true;
            this.reuseSaturationColorMatrix.setSaturation(f2);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.reuseSaturationColorMatrix);
            if (this.mainDrawable != null) {
                if (this.mainDrawable.b[2] != null) {
                    this.mainDrawable.b[2].setColorFilter(colorMatrixColorFilter);
                }
                if (this.mainDrawable.b[3] != null) {
                    this.mainDrawable.b[3].setColorFilter(colorMatrixColorFilter);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eb4a14da2957d507e597fce2bfab3f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eb4a14da2957d507e597fce2bfab3f6");
            return;
        }
        this.savedColorFilter = colorFilter;
        super.setColorFilter(colorFilter);
        if (colorFilter != null || !this.isSaturationColorMatrixValid || this.reuseSaturationColorMatrix == null || this.mainDrawable == null) {
            return;
        }
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.reuseSaturationColorMatrix);
        if (this.mainDrawable.b[2] != null) {
            this.mainDrawable.b[2].setColorFilter(colorMatrixColorFilter);
        }
        if (this.mainDrawable.b[3] != null) {
            this.mainDrawable.b[3].setColorFilter(colorMatrixColorFilter);
        }
    }

    public DPImageView setFadeInDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2afd39018e5bcc5d756f8177e90e4ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (DPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2afd39018e5bcc5d756f8177e90e4ba");
        }
        if (i < 0) {
            return this;
        }
        this.fadeInDuration = i;
        this.fadeInDisplayEnabled = true;
        return this;
    }

    public DPImageView setFadeInDisplayEnabled(boolean z) {
        this.fadeInDisplayEnabled = z;
        return this;
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8674601e818f8995f47e7450be7a064d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8674601e818f8995f47e7450be7a064d");
            return;
        }
        this.imageMatrix = matrix;
        if (this.isPlaceholder || this.mainDrawable == null) {
            return;
        }
        if (this.isThumbShowing) {
            if (this.mainDrawable.b[2] instanceof g) {
                ((g) this.mainDrawable.b[2]).a(this.imageMatrix);
            }
        } else if (this.mainDrawable.b[3] instanceof g) {
            ((g) this.mainDrawable.b[3]).a(this.imageMatrix);
        }
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51ec5e5cb38be59a195d89ee45acc1ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51ec5e5cb38be59a195d89ee45acc1ef");
        }
        if (this.mainDrawable != null) {
            if (!this.isThumbShowing || !(this.mainDrawable.b[2] instanceof g)) {
                if (this.mainDrawable.b[3] instanceof g) {
                    Matrix matrix = ((g) this.mainDrawable.b[3]).n;
                    return matrix == null ? new Matrix() : matrix;
                }
            } else {
                Matrix matrix2 = ((g) this.mainDrawable.b[2]).n;
                return matrix2 == null ? new Matrix() : matrix2;
            }
        }
        return new Matrix();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90c1f235bcc33400f4c7f0129dd30add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90c1f235bcc33400f4c7f0129dd30add");
            return;
        }
        this.mDPScaleType = transDPScaleType(scaleType);
        if (this.isPlaceholder || this.mainDrawable == null) {
            return;
        }
        if (this.mainDrawable.b[3] instanceof g) {
            setImageLayerScaleType((g) this.mainDrawable.b[3], this.mDPScaleType);
        }
        if (this.mainDrawable.b[2] instanceof g) {
            setImageLayerScaleType((g) this.mainDrawable.b[2], this.mDPScaleType);
        }
    }

    public void setScaleType(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4da0d722aa031f54fd7f35504ac69f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4da0d722aa031f54fd7f35504ac69f0");
            return;
        }
        this.mDPScaleType = bVar;
        if (this.isPlaceholder || this.mainDrawable == null) {
            return;
        }
        if (this.mainDrawable.b[3] instanceof g) {
            setImageLayerScaleType((g) this.mainDrawable.b[3], bVar);
        }
        if (this.mainDrawable.b[2] instanceof g) {
            setImageLayerScaleType((g) this.mainDrawable.b[2], bVar);
        }
    }

    public void setImageLayerScaleType(g gVar, b bVar) {
        Object[] objArr = {gVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ffcb0440a9e8ae55ed2a124590504ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ffcb0440a9e8ae55ed2a124590504ed");
        } else if (gVar.getCurrent() instanceof r) {
            ((r) gVar.getCurrent()).a(transScaleType(bVar));
        } else {
            gVar.a(transScaleType(bVar));
        }
    }

    public String getURL() {
        return this.url;
    }

    public String getModule() {
        return this.mModule;
    }

    public com.dianping.imagemanager.utils.b getDataRequireState() {
        return this.dataRequireState;
    }

    public Bitmap getBitmap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e185adb1a61eff92a228304a22ff3905", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e185adb1a61eff92a228304a22ff3905");
        }
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof r) {
            return ((r) drawable).b;
        }
        return null;
    }

    @Override // android.widget.ImageView
    public Drawable getDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6badb7ece3e5bc80c49106e54911279f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6badb7ece3e5bc80c49106e54911279f");
        }
        if (this.mainDrawable != null) {
            Drawable drawable = this.mainDrawable.b[3];
            if (drawable instanceof g) {
                drawable = drawable.getCurrent();
            }
            if (drawable != null) {
                return drawable;
            }
            if (this.isThumbShowing) {
                Drawable drawable2 = this.mainDrawable.b[2];
                return drawable2 instanceof g ? drawable2.getCurrent() : drawable2;
            }
        }
        return super.getDrawable();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.savedOnClickListener = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        Object[] objArr = {onLongClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab03fcf6d7b3986251aae5a1220c83a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab03fcf6d7b3986251aae5a1220c83a2");
            return;
        }
        this.savedOnLongClickListener = onLongClickListener;
        super.setOnLongClickListener(onLongClickListener);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "188d925e7354ee8115759c14db13cf04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "188d925e7354ee8115759c14db13cf04")).booleanValue();
        }
        if (this.savedOnClickListener == null && this.savedOnLongClickListener == null && !this.canClickToRequire) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c45761ac36eb4d9417a1e2acfacd3488", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c45761ac36eb4d9417a1e2acfacd3488");
        } else if (this.canClickToRequire) {
            this.canClickToRequire = false;
            setClickable(this.savedClickable);
            forceRetry();
        } else if (this.savedOnClickListener != null) {
            this.savedOnClickListener.onClick(view);
        }
    }

    private void updateDebugHint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f018f1f72cfb5799c181047c88695f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f018f1f72cfb5799c181047c88695f2");
        } else if (k.a()) {
            this.debugHint = hashCode() + "\n" + str;
            if (this.mInvalidateHandler != null) {
                this.mInvalidateHandler.sendEmptyMessage(0);
            }
        }
    }

    private void imageLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ce160800eaf2f294c46a5181393fe5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ce160800eaf2f294c46a5181393fe5a");
            return;
        }
        k.a(TAG, "view[" + hashCode() + "] currentLoadState=" + this.currentLoadState + " lastLoadState=" + this.lastLoadState + " url=" + this.url + "\n" + str);
    }

    public void setPicMonitorInfo(String str, String str2) {
        this.picBusiness = str;
        this.picExtra = str2;
    }

    public boolean isIgnoreLowResolutionMemCache() {
        return this.ignoreLowResolutionMemCache;
    }

    public void setIgnoreLowResolutionMemCache(boolean z) {
        this.ignoreLowResolutionMemCache = z;
    }

    private void setAnimatedImageDecoder(com.dianping.imagemanager.animated.b bVar) {
        this.animatedImageDecoder = bVar;
    }

    private void setAnimatedImageData(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c6a8ddd069ac481560378a068893800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c6a8ddd069ac481560378a068893800");
            return;
        }
        if (i == 1) {
            this.animatedImageDecoder = new com.dianping.imagemanager.animated.gif.java.a();
        } else if (i == 2) {
            this.animatedImageDecoder = new com.dianping.imagemanager.animated.webp.a();
        } else {
            this.animatedImageDecoder = null;
            return;
        }
        try {
            this.animatedImageDecoder.a(bArr);
            if (this.animatedImageDecoder.c() == 2 || this.animatedImageDecoder.c() == 1) {
                this.animatedImageDecoder = null;
                k.d(TAG, "animatedImageDecoder status = STATUS_OPEN_ERROR");
            }
        } catch (OutOfMemoryError e2) {
            this.animatedImageDecoder = null;
            k.a(TAG, e2.getMessage(), e2);
        }
    }

    public boolean isImageAnimating() {
        return this.currentLoadState == d.ANIMATING;
    }

    public void startImageAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37ef180f5b64a230f57acf8680d4df33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37ef180f5b64a230f57acf8680d4df33");
        } else {
            startImageAnimation(true);
        }
    }

    public void startImageAnimation(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39f29a02f817b443bcf75dca246e2330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39f29a02f817b443bcf75dca246e2330");
            return;
        }
        if (k.a()) {
            imageLog("startImageAnimation, resetToFirstFrame=" + z);
        }
        synchronized (getLock()) {
            registerAnimatedImageLifecycle();
            if (isImageAnimating()) {
                if (z) {
                    this.animatedImageDecoder.g();
                }
                return;
            }
            if (this.animatedImageDecodeTask != null) {
                this.animatedImageDecodeTask.a();
                this.animatedImageDecodeTask = null;
            }
            if (canStart()) {
                if (z) {
                    this.animatedImageDecoder.g();
                }
                setLoadState(d.ANIMATING);
                this.animatedImageDecodeTask = new com.dianping.imagemanager.animated.a(this.animatedImageDecoder, this.loopingTimes, this.innerImageLoadListener);
                com.dianping.imagemanager.animated.a aVar = this.animatedImageDecodeTask;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.imagemanager.animated.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "66add6d5774c08d03b11fb96463cbdba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "66add6d5774c08d03b11fb96463cbdba");
                } else if (aVar.b() && aVar.d == null) {
                    aVar.c = 1;
                    aVar.d = com.sankuai.android.jarvis.c.a("dpimage-animate", aVar);
                    aVar.d.start();
                }
                this.playWhenReady = false;
            } else {
                this.playWhenReady = true;
            }
        }
    }

    public void stopImageAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10458041b99fd0a2fd83082ccfc9d60a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10458041b99fd0a2fd83082ccfc9d60a");
        } else {
            stopImageAnimationInternal(false, true);
        }
    }

    public void stopImageAnimation(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6613fc5bf70f3b88ac89c92137511dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6613fc5bf70f3b88ac89c92137511dd");
        } else {
            stopImageAnimationInternal(z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopImageAnimationInternal(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48387a0ad0a31fea813cb0c03d52cc28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48387a0ad0a31fea813cb0c03d52cc28");
            return;
        }
        if (k.a()) {
            imageLog("stopImageAnimationInternal, resetToFirstFrame=" + z + " byUser=" + z2);
        }
        this.playWhenReady = false;
        synchronized (getLock()) {
            if (this.animatedImageDecodeTask != null) {
                setLoadState(z2 ? d.STOP_ANIMATION : d.WAIT_FOR_ANIMATION);
                this.animatedImageDecodeTask.a();
                this.animatedImageDecodeTask = null;
            }
            if (z && this.animatedImageDecoder != null) {
                this.animatedImageDecoder.g();
                updateAnimatedImageFrame(this.animatedImageDecoder.p_());
            }
            if (z2) {
                unregisterAnimatedImageLifecycle();
            }
        }
    }

    private boolean canStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7dfc04e79b82e0f1214045a12dd22aa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7dfc04e79b82e0f1214045a12dd22aa")).booleanValue() : (this.currentLoadState == d.SUCCEED || this.currentLoadState == d.WAIT_FOR_ANIMATION || this.currentLoadState == d.STOP_ANIMATION) && this.animatedImageDecoder != null && this.animatedImageDecodeTask == null;
    }

    public void updateAnimatedImageFrame(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "990c6a684bb5bc178f9c7ec566ff6040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "990c6a684bb5bc178f9c7ec566ff6040");
        } else {
            setImageBitmapInternal(bitmap, false, true);
        }
    }

    private void clearAnimatedImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e1076ff19099bc35fc20740fe5240b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e1076ff19099bc35fc20740fe5240b0");
            return;
        }
        synchronized (getLock()) {
            if (this.animatedImageDecodeTask != null) {
                this.animatedImageDecodeTask.a();
                this.animatedImageDecodeTask = null;
            }
            if (this.animatedImageDecoder != null) {
                this.animatedImageDecoder.g();
            }
            this.tmpBitmap = null;
        }
        this.playWhenReady = false;
    }

    public Object getLock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b92c029a5b155b25da7bcea0f1b6d5e2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b92c029a5b155b25da7bcea0f1b6d5e2");
        }
        if (this.animatedImageSyncLock == null) {
            this.animatedImageSyncLock = new Object();
        }
        return this.animatedImageSyncLock;
    }

    private boolean isPlayImmediately() {
        return (this.animatedImageDecoder == null || this.loopingTimes == 0) ? false : true;
    }

    public void setAnimatedImageLooping(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d07f2522b6acb5310a99e9040478521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d07f2522b6acb5310a99e9040478521");
            return;
        }
        if (k.a()) {
            imageLog("setAnimatedImageLooping=" + i);
        }
        this.loopingTimes = i;
        if (this.animatedImageDecodeTask != null) {
            this.animatedImageDecodeTask.b = this.loopingTimes;
        }
    }

    public void startImageAnimationWithLooping(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30cdd2e5c1a59a7cc2e7152f9d35bb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30cdd2e5c1a59a7cc2e7152f9d35bb5e");
            return;
        }
        if (k.a()) {
            imageLog("setAnimatedImageLooping=" + i);
        }
        this.loopingTimes = i;
        if (this.animatedImageDecodeTask != null) {
            this.animatedImageDecodeTask.b = this.loopingTimes;
        }
        if (isPlayImmediately()) {
            setLoadState(d.WAIT_FOR_ANIMATION);
            startImageAnimation();
        }
    }

    private void onAnimatedImagePrepared() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aac0703fe0005b70dfba3d0edc1976ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aac0703fe0005b70dfba3d0edc1976ad");
        } else if (this.animatedImageDecoder != null) {
            if (isPlayImmediately()) {
                startImageAnimation();
            } else {
                setLoadState(d.WAIT_FOR_ANIMATION);
            }
            if (this.onAnimatedImageStateChangeListener != null) {
                this.onAnimatedImageStateChangeListener.OnPrepared(this.animatedImageDecoder.a(), this.animatedImageDecoder.b());
            }
        }
    }

    public void setOnAnimatedImageStateChangeListener(com.dianping.imagemanager.animated.c cVar) {
        this.onAnimatedImageStateChangeListener = cVar;
    }

    private void unregisterAnimatedImageLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09ab1a7bb79dc1218ae3d6cea11023cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09ab1a7bb79dc1218ae3d6cea11023cb");
        } else if (!this.isAnimatedImageLifecycleListenerRegistered || this.lifecycle == null || this.animatedImageLifecycleListener == null) {
        } else {
            this.lifecycle.b(this.animatedImageLifecycleListener);
            this.isAnimatedImageLifecycleListenerRegistered = false;
        }
    }

    private void registerAnimatedImageLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a13ce8816cb8c576da5418346f0494aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a13ce8816cb8c576da5418346f0494aa");
        } else if (this.isAnimatedImageLifecycleListenerRegistered) {
        } else {
            if (this.lifecycle == null) {
                this.lifecycle = com.dianping.imagemanager.utils.lifecycle.c.a(getContext());
            }
            if (this.lifecycle != null) {
                if (this.animatedImageLifecycleListener == null) {
                    initAnimatedImageLifecycleListener();
                }
                this.lifecycle.a(this.animatedImageLifecycleListener);
                this.isAnimatedImageLifecycleListenerRegistered = true;
            }
        }
    }

    private void initAnimatedImageLifecycleListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f4e3b8ba4d63daed3b7df021f5b01c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f4e3b8ba4d63daed3b7df021f5b01c");
        } else {
            this.animatedImageLifecycleListener = new com.dianping.imagemanager.utils.lifecycle.d() { // from class: com.dianping.imagemanager.DPImageView.4
                public static ChangeQuickRedirect a;

                @Override // com.dianping.imagemanager.utils.lifecycle.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0743b17e0f8c67bed07a6795ad917900", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0743b17e0f8c67bed07a6795ad917900");
                        return;
                    }
                    k.a("lifecycle", "animatedImageLifecycleListener onStart");
                    if ((DPImageView.this.contentDataType == 1 || DPImageView.this.contentDataType == 2) && DPImageView.this.currentLoadState == d.WAIT_FOR_ANIMATION) {
                        if (DPImageView.this.shouldResumeAnimating || DPImageView.this.lastLoadState == d.ANIMATING) {
                            DPImageView.this.startImageAnimation();
                        }
                    }
                }

                @Override // com.dianping.imagemanager.utils.lifecycle.d
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "963782570fbba0b1e112e8f943fbf74b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "963782570fbba0b1e112e8f943fbf74b");
                        return;
                    }
                    k.a("lifecycle", "animatedImageLifecycleListener onStop");
                    if ((DPImageView.this.contentDataType == 1 || DPImageView.this.contentDataType == 2) && DPImageView.this.currentLoadState == d.ANIMATING) {
                        DPImageView.this.shouldResumeAnimating = true;
                        DPImageView.this.stopImageAnimationInternal(false, false);
                        return;
                    }
                    DPImageView.this.shouldResumeAnimating = false;
                }

                @Override // com.dianping.imagemanager.utils.lifecycle.d
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "16f7e03aa4e8478357aa6b6ed8281970", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "16f7e03aa4e8478357aa6b6ed8281970");
                        return;
                    }
                    k.a("lifecycle", "animatedImageLifecycleListener onDestroy");
                    if (DPImageView.this.animatedImageDecoder != null) {
                        DPImageView.this.animatedImageDecoder.i();
                        DPImageView.this.animatedImageDecoder = null;
                    }
                    DPImageView.this.lifecycle.b(this);
                    DPImageView.this.mHandler.removeCallbacksAndMessages(null);
                }
            };
        }
    }

    public void setRequireWithContextLifecycle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c574a57ba24936cfbb16ed592b80d7ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c574a57ba24936cfbb16ed592b80d7ae");
            return;
        }
        this.requireWithContextLifecycle = z;
        checkRequireLifecycle();
    }

    private void checkRequireLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe3a6408c9fdaa4beab7d6247b6bb9d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe3a6408c9fdaa4beab7d6247b6bb9d9");
        } else if (this.requireWithContextLifecycle && !this.isRequireLifecycleListenerRegistered) {
            registerRequireLifecycle();
        } else if (this.requireWithContextLifecycle || !this.isRequireLifecycleListenerRegistered) {
        } else {
            unregisterRequireLifecycle();
        }
    }

    private void registerRequireLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "816ccde08ec84fb510729ea4b6c20f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "816ccde08ec84fb510729ea4b6c20f2a");
        } else if (this.isRequireLifecycleListenerRegistered) {
        } else {
            if (this.lifecycle == null) {
                this.lifecycle = com.dianping.imagemanager.utils.lifecycle.c.a(getContext());
            }
            if (this.lifecycle != null) {
                if (this.requireLifecycleListener == null) {
                    initRequireLifecycleListener();
                }
                this.lifecycle.a(this.requireLifecycleListener);
                this.isRequireLifecycleListenerRegistered = true;
            }
        }
    }

    private void unregisterRequireLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37af735b76cb4bbb1666de99b009d4c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37af735b76cb4bbb1666de99b009d4c0");
        } else if (!this.isRequireLifecycleListenerRegistered || this.lifecycle == null || this.requireLifecycleListener == null) {
        } else {
            this.lifecycle.b(this.requireLifecycleListener);
            this.isRequireLifecycleListenerRegistered = false;
        }
    }

    private void initRequireLifecycleListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b49768758f74ef3f4e3d0d3c36587cb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b49768758f74ef3f4e3d0d3c36587cb7");
        } else {
            this.requireLifecycleListener = new com.dianping.imagemanager.utils.lifecycle.d() { // from class: com.dianping.imagemanager.DPImageView.5
                public static ChangeQuickRedirect a;

                @Override // com.dianping.imagemanager.utils.lifecycle.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7c322b6656f67ac60830fc868d9c419", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7c322b6656f67ac60830fc868d9c419");
                    }
                }

                @Override // com.dianping.imagemanager.utils.lifecycle.d
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7596288b5740550c97a4aa5aec70891c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7596288b5740550c97a4aa5aec70891c");
                    }
                }

                @Override // com.dianping.imagemanager.utils.lifecycle.d
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "811b94ac4c2f986f5df5f1545d98aa34", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "811b94ac4c2f986f5df5f1545d98aa34");
                        return;
                    }
                    DPImageView.this.discard();
                    DPImageView.this.lifecycle.b(this);
                }
            };
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75ba15b28c7a13f1a06dda9c0eb2e247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75ba15b28c7a13f1a06dda9c0eb2e247");
            return;
        }
        if (k.a()) {
            imageLog("onDetachedFromWindow()");
        }
        detachedWork();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30129fcd5dd7d9540275e0ac0732e961", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30129fcd5dd7d9540275e0ac0732e961");
            return;
        }
        if (k.a()) {
            imageLog("onStartTemporaryDetach()");
        }
        detachedWork();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2fe16b7871c602a0a69cb1c4a617afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2fe16b7871c602a0a69cb1c4a617afc");
            return;
        }
        super.onFinishTemporaryDetach();
        if (k.a()) {
            imageLog("onFinishTemporaryDetach()");
        }
        attachedWork();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "179da81c5f7d1c307ac0bd8161d6b6ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "179da81c5f7d1c307ac0bd8161d6b6ba");
            return;
        }
        super.onAttachedToWindow();
        if (k.a()) {
            imageLog("onAttachedToWindow()");
        }
        attachedWork();
    }

    private void attachedWork() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1813dac93fbf52b5d81f8df748f57f60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1813dac93fbf52b5d81f8df748f57f60");
        } else if (this.hasDoneAttachedWork) {
        } else {
            this.attached = true;
            if (this.currentLoadState == d.DETACHED_FROM_WINDOW) {
                if (isPlayImmediately() && (this.lastLoadState == d.ANIMATING || this.playWhenReady)) {
                    setLoadState(d.WAIT_FOR_ANIMATION);
                    startImageAnimation();
                } else if (!this.requireWithContextLifecycle && this.lastLoadState != d.SUCCEED && this.lastLoadState != d.NOT_URL && this.lastLoadState != d.WAIT_FOR_ANIMATION && this.lastLoadState != d.STOP_ANIMATION) {
                    preRequire();
                } else {
                    setLoadState(this.lastLoadState);
                }
            } else if (!this.requireWithContextLifecycle) {
                preRequire();
            }
            this.hasDoneAttachedWork = true;
            this.hasDoneDetachedWork = false;
        }
    }

    private void detachedWork() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0f3474ac2c67dbb9f47eaa0fbd11109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0f3474ac2c67dbb9f47eaa0fbd11109");
        } else if (this.hasDoneDetachedWork) {
        } else {
            this.attached = false;
            try {
                animate().cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!this.requireWithContextLifecycle) {
                discard();
            }
            setLoadState(d.DETACHED_FROM_WINDOW);
            this.hasDoneAttachedWork = false;
            this.hasDoneDetachedWork = true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum f {
        DISABLE_MEMORY_CACHE(false, 1),
        ENABLE_MEMORY_CACHE(true, 1),
        DISABLE_DISK_CACHE(false, 2),
        ENABLE_DISK_CACHE(true, 2),
        DISABLE_CACHES(false, 3),
        ENABLE_CACHES(true, 3),
        DISABLE_NETWORK_REQUEST(false, 4),
        ENABLE_NETWORK_REQUEST(true, 4),
        FORCE_USING_DP_CHANNEL(true, 16),
        CANCEL_CHANNEL_SPECIFIED(false, 48),
        DECODE_WITH_RGB565(true, 64),
        DECODE_WITH_ARGB8888(false, 64),
        ENABLE_AUTORETRY(true, 128),
        DISABLE_AUTORETRY(false, 128),
        ALWAYS_BITMAP(true, 256),
        AUTO_RESIZE(true, 512),
        REQUIRE_ORIGINAL_SIZE(false, 512),
        SCALE_BY_LONG_EDGE(false, 1024),
        SCALE_BY_SHORT_EDGE(true, 1024);
        
        public static ChangeQuickRedirect a;
        private boolean u;
        private int v;

        public static f valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5548f25a41d233f204a4a1c305f61beb", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5548f25a41d233f204a4a1c305f61beb") : (f) Enum.valueOf(f.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static f[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "128c7658924b214cdd2497a9be261982", RobustBitConfig.DEFAULT_VALUE) ? (f[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "128c7658924b214cdd2497a9be261982") : (f[]) values().clone();
        }

        f(boolean z, int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "132931dd47afad6c8d2c4009be996840", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "132931dd47afad6c8d2c4009be996840");
                return;
            }
            this.u = z;
            this.v = i;
        }

        public final int a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e06bfc263120410414b61103714548", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e06bfc263120410414b61103714548")).intValue() : this.u ? i | this.v : i & (~this.v);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum d {
        IDLE,
        EMPTY,
        NOT_URL,
        WAIT_FOR_SIZE,
        READY_FOR_REQUESTING,
        WAIT_FOR_DOWNLOAD,
        REQUESTING,
        LOADING,
        SUCCEED,
        FAILED,
        WAIT_FOR_ANIMATION,
        ANIMATING,
        STOP_ANIMATION,
        DETACHED_FROM_WINDOW;
        
        public static ChangeQuickRedirect a;

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e01a9f2df6a94323d693190fb75c90", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e01a9f2df6a94323d693190fb75c90");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43056c1114ec2343a83d059eb10d8020", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43056c1114ec2343a83d059eb10d8020") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fad1d35bc72ff538407d71b8cc0c762e", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fad1d35bc72ff538407d71b8cc0c762e") : (d[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public enum a {
        DAILY(86400000),
        HALF_MONTH(1296000000),
        PERMANENT(31539600000L);
        
        public static ChangeQuickRedirect a;
        long e;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0948421a9f86596282d4d9ccc90d2965", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0948421a9f86596282d4d9ccc90d2965") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ce60d41ec54f79f1606044866a56770", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ce60d41ec54f79f1606044866a56770") : (a[]) values().clone();
        }

        a(long j) {
            Object[] objArr = {r10, Integer.valueOf(r11), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f04dcd75302506819955c4574d10d23", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f04dcd75302506819955c4574d10d23");
            } else {
                this.e = j;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        MATRIX(g.b.i, ImageView.ScaleType.MATRIX),
        FIT_XY(g.b.b, ImageView.ScaleType.FIT_XY),
        FIT_START(g.b.c, ImageView.ScaleType.FIT_START),
        FIT_CENTER(g.b.d, ImageView.ScaleType.FIT_CENTER),
        FIT_END(g.b.e, ImageView.ScaleType.FIT_END),
        CENTER(g.b.f, ImageView.ScaleType.CENTER),
        CENTER_CROP(g.b.h, ImageView.ScaleType.CENTER_CROP),
        CENTER_INSIDE(g.b.g, ImageView.ScaleType.CENTER_INSIDE),
        LEFTTOP_CROP(g.b.j, ImageView.ScaleType.FIT_XY),
        RIGHTTOP_CROP(g.b.k, ImageView.ScaleType.FIT_XY),
        LEFTBOTTOM_CROP(g.b.l, ImageView.ScaleType.FIT_XY),
        RIGHTBOTTOM_CROP(g.b.m, ImageView.ScaleType.FIT_XY),
        LEFTCENTER_CROP(g.b.n, ImageView.ScaleType.FIT_XY),
        RIGHTCENTER_CROP(g.b.o, ImageView.ScaleType.FIT_XY),
        TOPCENTER_CROP(g.b.p, ImageView.ScaleType.FIT_XY),
        BOTTOMCENTER_CROP(g.b.q, ImageView.ScaleType.FIT_XY);
        
        public static ChangeQuickRedirect a;
        public g.b r;
        public ImageView.ScaleType s;

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b54c242d0a7be9294c0def3a6f6a5775", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b54c242d0a7be9294c0def3a6f6a5775") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a688f7b13272d1054b96a2cd5cfe7c26", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a688f7b13272d1054b96a2cd5cfe7c26") : (b[]) values().clone();
        }

        b(g.b bVar, ImageView.ScaleType scaleType) {
            Object[] objArr = {r10, Integer.valueOf(r11), bVar, scaleType};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b5366e9e2483c5c6847a97973c69df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b5366e9e2483c5c6847a97973c69df");
                return;
            }
            this.r = bVar;
            this.s = scaleType;
        }
    }
}
