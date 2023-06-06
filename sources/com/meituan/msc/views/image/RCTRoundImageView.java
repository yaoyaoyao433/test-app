package com.meituan.msc.views.image;

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
import com.meituan.dio.easy.DioFile;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.q;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.views.imagehelper.a;
import com.meituan.msc.views.imagehelper.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
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
/* loaded from: classes3.dex */
public class RCTRoundImageView extends ImageView {
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int FREQUENT_SIZE_CHANGE_INTERVAL = 1000;
    private static final String TAG = "RCTRoundImageView";
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
    private a mDirtyState;
    private DiskCacheStrategy mDiskCacheStrategy;
    private boolean mEnableShrink;
    private int mFadeDuration;
    private boolean mFailedToLoadTransformedSource;
    private IFileModule mFileModule;
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
    /* loaded from: classes3.dex */
    public enum a {
        UNDEFINE,
        DIRTY,
        CLEAN;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92d0969efd951fbe1ca4f96e1359fe5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92d0969efd951fbe1ca4f96e1359fe5d");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcdfa960b8bfd1acd78f5deb8b1f4633", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcdfa960b8bfd1acd78f5deb8b1f4633") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "845286490a0bd363e25e1bd1c95d6f12", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "845286490a0bd363e25e1bd1c95d6f12") : (a[]) values().clone();
        }
    }

    public RCTRoundImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "702430bde6aa160db61f3103fd335499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "702430bde6aa160db61f3103fd335499");
            return;
        }
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

    public void setFileModule(IFileModule iFileModule) {
        Object[] objArr = {iFileModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54cb69680602a315da2a5d88f1fa3387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54cb69680602a315da2a5d88f1fa3387");
            return;
        }
        this.mFileModule = iFileModule;
        this.mImageSource.l = this.mFileModule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirtyState(a aVar) {
        this.mDirtyState = aVar;
    }

    public void setSource(ReadableArray readableArray) {
        boolean z;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "838907e72ee721d67121800ee2e43af6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "838907e72ee721d67121800ee2e43af6");
        } else if (readableArray == null || readableArray.size() <= 0) {
        } else {
            ReadableMap map = readableArray.getMap(0);
            String string = (map == null || !map.hasKey(Constants.TRAFFIC_URI)) ? null : map.getString(Constants.TRAFFIC_URI);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (this.mImageSource.b == null || !string.equals(this.mImageSource.b.toString())) {
                c cVar = this.mImageSource;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "f0b6d57c56ad531bafd0309e0f3dfdb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "f0b6d57c56ad531bafd0309e0f3dfdb9");
                } else {
                    cVar.b = null;
                    cVar.c = 0.0d;
                    cVar.d = 0.0d;
                    cVar.e = 0;
                    cVar.h = false;
                    cVar.j = null;
                    cVar.k = null;
                }
                this.mImageSource.a(string);
                z = true;
            } else {
                z = false;
            }
            if (map.hasKey("width") && map.getDouble("width") != this.mImageSource.c) {
                c cVar2 = this.mImageSource;
                double d = map.getDouble("width");
                Object[] objArr3 = {Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect4, false, "9a85b66525c8c6a36c273c66ea857e78", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect4, false, "9a85b66525c8c6a36c273c66ea857e78");
                } else {
                    cVar2.c = d;
                }
                z = true;
            }
            if (map.hasKey("height") && map.getDouble("height") != this.mImageSource.d) {
                c cVar3 = this.mImageSource;
                double d2 = map.getDouble("height");
                Object[] objArr4 = {Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect5 = c.a;
                if (PatchProxy.isSupport(objArr4, cVar3, changeQuickRedirect5, false, "6d68e88456dbcb46b145d70733bf8fdb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, cVar3, changeQuickRedirect5, false, "6d68e88456dbcb46b145d70733bf8fdb");
                } else {
                    cVar3.d = d2;
                }
                z = true;
            }
            if (z) {
                setDirtyState(a.DIRTY);
                this.mTransformedSource = null;
                this.mFailedToLoadTransformedSource = false;
            }
        }
    }

    public void setNinePatchSource(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6de80682d5a9b549107a1e848148695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6de80682d5a9b549107a1e848148695");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "416e4f8a95b6ed4a657205071aeb1260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "416e4f8a95b6ed4a657205071aeb1260");
            return;
        }
        if (readableMap != null) {
            this.mCapInsets = new Rect(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
        } else {
            this.mCapInsets = null;
        }
        setDirtyState(a.DIRTY);
    }

    @NonNull
    private Integer getResourceDrawableId(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02f6fead8296c79ae04b2e56b7c98205", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02f6fead8296c79ae04b2e56b7c98205");
        }
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
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0856e3e878139d1f5686551abbd16089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0856e3e878139d1f5686551abbd16089");
        } else if (q.a(f, 0.0f) && q.a(f2, 0.0f) && q.a(f3, 0.0f) && q.a(f4, 0.0f)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46047242d856fcd471d15626b0067293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46047242d856fcd471d15626b0067293");
            return;
        }
        this.mImageSource.b(str);
        setDirtyState(a.DIRTY);
    }

    public void setHeaders(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c50f9df3f852ecf8ea0150a3d1a5bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c50f9df3f852ecf8ea0150a3d1a5bf0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ffe71fa061acbf6f46b013c7dade11a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ffe71fa061acbf6f46b013c7dade11a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02e278dd9881fa77d8f20177be256bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02e278dd9881fa77d8f20177be256bd9");
            return;
        }
        Uri computeUri = computeUri(str);
        if (computeUri == null || computeUri.getScheme() == null) {
            this.mImageSource.b(str);
            setDirtyState(a.DIRTY);
            return;
        }
        com.meituan.msc.views.imagehelper.a.a(getContext().getApplicationContext()).a(computeUri, str2, new a.InterfaceC0490a() { // from class: com.meituan.msc.views.image.RCTRoundImageView.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.imagehelper.a.InterfaceC0490a
            public final void a(Drawable drawable) {
                Object[] objArr2 = {drawable};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d6c1afe82a3c426cfd80a4b2b2e157b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d6c1afe82a3c426cfd80a4b2b2e157b");
                    return;
                }
                RCTRoundImageView.this.mPlaceHolder = drawable;
                boolean z = RCTRoundImageView.this.mDirtyState != a.DIRTY;
                RCTRoundImageView.this.setDirtyState(a.DIRTY);
                if (z) {
                    if (UiThreadUtil.isOnUiThread()) {
                        RCTRoundImageView.this.maybeUpdateView();
                    } else {
                        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.views.image.RCTRoundImageView.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "25c6496ae96b06dce6dbe45968abd1da", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "25c6496ae96b06dce6dbe45968abd1da");
                                } else {
                                    RCTRoundImageView.this.maybeUpdateView();
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.meituan.msc.views.imagehelper.a.InterfaceC0490a
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab9cc2bd600f8b4f807bb1c222e83072", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab9cc2bd600f8b4f807bb1c222e83072");
                } else {
                    ((ReactContext) RCTRoundImageView.this.getContext()).getUIManagerModule().a().a(com.meituan.msc.views.image.a.a(RCTRoundImageView.this.getId(), 1, (RCTRoundImageView.this.mImageSource == null || RCTRoundImageView.this.mImageSource.b == null) ? null : RCTRoundImageView.this.mImageSource.b.toString(), 0, 0, exc.getMessage()));
                }
            }
        });
    }

    public void setError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b3ad1b4edd7893849063bea4c888ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b3ad1b4edd7893849063bea4c888ef9");
            return;
        }
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
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d0a5dab5823bee5a5389f6abee7bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d0a5dab5823bee5a5389f6abee7bb6");
        } else {
            this.mBorderWidth = (int) (s.a(f) + 0.5d);
        }
    }

    public void setFadeDuration(int i) {
        this.mFadeDuration = i;
    }

    public void setBlurRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e29dc25237a560f65b876aa069dc7ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e29dc25237a560f65b876aa069dc7ca");
            return;
        }
        int a2 = (int) s.a(f);
        if (this.mBlurRadius != a2) {
            this.mBlurRadius = a2;
            setDirtyState(a.DIRTY);
        }
    }

    public void maybeUpdateView() {
        RequestCreator requestCreator;
        RequestCreator a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7b5033b381fc597b115038538890ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7b5033b381fc597b115038538890ebb");
        } else if (this.mDirtyState != a.DIRTY) {
        } else {
            Uri uri = this.mImageSource.b;
            this.mTransformedSource = null;
            if (this.mImageSource.i) {
                requestCreator = com.meituan.msc.views.imagehelper.a.a(getContext().getApplicationContext(), this.mImageSource.b);
            } else if (uri != null) {
                Uri handleRemoteImage = handleRemoteImage(uri);
                if (!uri.equals(handleRemoteImage)) {
                    g.b(TAG, String.format("[MRN图片缩略] 转换前链接: %s, 转换后链接: %s", uri, handleRemoteImage));
                    this.mTransformedSource = handleRemoteImage;
                    uri = handleRemoteImage;
                }
                if (this.mHeaders == null) {
                    a2 = getPicasso().a(uri);
                } else {
                    if (TextUtils.isEmpty(this.mMethod)) {
                        this.mMethod = "GET";
                    }
                    a2 = getPicasso().a(new com.squareup.picasso.model.d(uri.toString(), this.mHeaders));
                }
                g.d(TAG, String.format("[MRN图片缩略] 加载图片: %s", uri));
                requestCreator = a2;
            } else if (this.mImageSource.h && this.mImageSource.e > 0) {
                requestCreator = getPicasso().a(this.mImageSource.e);
            } else if (this.mImageSource.j != null) {
                requestCreator = getPicasso().a(this.mImageSource.j);
            } else {
                g.d(TAG, "sourceUri is null");
                requestCreator = null;
            }
            if (requestCreator != null) {
                if (this.mImageSource.f != 0) {
                    requestCreator.a(this.mImageSource.f);
                } else if (this.mPlaceHolder != null) {
                    requestCreator.a(this.mPlaceHolder);
                } else {
                    requestCreator.a();
                }
                if (this.mImageSource.g != 0) {
                    requestCreator.b(this.mImageSource.g);
                }
                if (this.mImageSource.c != 0.0d && this.mImageSource.d != 0.0d) {
                    requestCreator.b((int) (this.mImageSource.c + 0.5d), (int) (this.mImageSource.d + 0.5d));
                }
                if (this.mFadeDuration != 0) {
                    requestCreator.h();
                }
                if (this.mBlurRadius > 0) {
                    requestCreator.a(new com.meituan.msc.views.image.blur.a(getContext(), this.mBlurRadius, 1));
                }
                requestCreator.a(this.mSkipMemoryCache);
                requestCreator.a(this.mDiskCacheStrategy);
                requestCreator.a(this, null, 0, new b(this, this.mImageSource));
            }
            setDirtyState(a.CLEAN);
        }
    }

    private Picasso getPicasso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2c34ad7e0acb9b5d17fd50ea46edfe5", RobustBitConfig.DEFAULT_VALUE) ? (Picasso) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2c34ad7e0acb9b5d17fd50ea46edfe5") : Picasso.g(getContext().getApplicationContext());
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c0b7a8d8737ce91814ed5e10128de02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c0b7a8d8737ce91814ed5e10128de02");
        } else if (getDrawable() == drawable) {
        } else {
            super.setImageDrawable(drawable);
            this.mBitmap = com.meituan.msc.views.imagehelper.a.a(drawable, true);
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f812afb5d79208b120fc797d0e8f89e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f812afb5d79208b120fc797d0e8f89e0");
            return;
        }
        super.setImageResource(i);
        this.mBitmap = com.meituan.msc.views.imagehelper.a.a(getDrawable(), true);
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "585c387dc76a5b67a887693ec82c2649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "585c387dc76a5b67a887693ec82c2649");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d94f9a08eaedcb0e38ccf814f90d57fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d94f9a08eaedcb0e38ccf814f90d57fe");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193b5e588f28737cc4e2dd0512950f21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193b5e588f28737cc4e2dd0512950f21");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4b01918517e4a626d727f5c0aacc58a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4b01918517e4a626d727f5c0aacc58a");
        } else if (drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled()) {
        } else {
            bitmap.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b extends PicassoDrawableImageViewTarget {
        public static ChangeQuickRedirect a;
        private c c;
        private RCTRoundImageView d;

        public b(RCTRoundImageView rCTRoundImageView, c cVar) {
            super(rCTRoundImageView);
            Object[] objArr = {RCTRoundImageView.this, rCTRoundImageView, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f163ec6566860e2525095596925b6ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f163ec6566860e2525095596925b6ab");
                return;
            }
            this.c = cVar;
            this.d = rCTRoundImageView;
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadStarted(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8630079117b29388253fecac744cd248", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8630079117b29388253fecac744cd248");
                return;
            }
            super.onLoadStarted(drawable);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c28bc674ef76b93ca4edb4995d23b77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c28bc674ef76b93ca4edb4995d23b77");
            } else {
                a(4, null, null, "");
            }
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadFailed(Exception exc, Drawable drawable) {
            Object[] objArr = {exc, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdddbf07c0470a37f64965ae310fd409", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdddbf07c0470a37f64965ae310fd409");
                return;
            }
            super.onLoadFailed(exc, drawable);
            if (this.d != null && this.d.mTransformedSource != null) {
                this.d.mFailedToLoadTransformedSource = true;
                this.d.mTransformedSource = null;
                this.d.setDirtyState(a.DIRTY);
                this.d.maybeUpdateView();
                Object[] objArr2 = new Object[1];
                Object[] objArr3 = new Object[2];
                objArr3[0] = this.c != null ? this.c.k : "Unknown";
                objArr3[1] = this.d.mTransformedSource;
                objArr2[0] = String.format("加载Venus图片失败, 转换前链接: %s, 转换后链接: %s", objArr3);
                g.d(RCTRoundImageView.TAG, objArr2);
                return;
            }
            Object[] objArr4 = {exc};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "ed0e6eadda110fe568e99dba8a6824cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "ed0e6eadda110fe568e99dba8a6824cd");
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                if (this.c != null) {
                    String str = this.c.k;
                    stringBuffer.append("\r\nsourceUri: ");
                    stringBuffer.append(str);
                    stringBuffer.append("\r\nisResource: ");
                    stringBuffer.append(this.c.h);
                    if (this.c.h) {
                        stringBuffer.append("\r\ngetResourceId: ");
                        stringBuffer.append(this.c.e);
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
                    g.d("RCTRoundImageView@onLoadError", stringBuffer.toString(), exc);
                    RCTRoundImageView.reportFileNotFound(exc, this.c);
                }
            }
            a(null);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
        @Override // com.squareup.picasso.PicassoDrawableTarget
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onResourceReady(com.squareup.picasso.PicassoDrawable r13, com.squareup.picasso.Picasso.LoadedFrom r14) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.views.image.RCTRoundImageView.b.onResourceReady(com.squareup.picasso.PicassoDrawable, com.squareup.picasso.Picasso$LoadedFrom):void");
        }

        private void a(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9712ca0b5d8be44d6a8a6a9f7188d4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9712ca0b5d8be44d6a8a6a9f7188d4b");
            } else {
                a(3, drawable, null, "");
            }
        }

        private void a(int i, Drawable drawable, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), drawable, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0322580b6c8ce2a032b4f69666577cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0322580b6c8ce2a032b4f69666577cb");
            } else if (this.d != null) {
                int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
                int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
                com.meituan.msc.uimanager.events.b a2 = ((ReactContext) this.d.getContext()).getUIManagerModule().a();
                int id = this.d.getId();
                if (str == null) {
                    str = a();
                }
                a2.a(com.meituan.msc.views.image.a.a(id, i, str, intrinsicWidth, intrinsicHeight, str2));
            }
        }

        private String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b570c7fab64e0399636f77d0087f28e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b570c7fab64e0399636f77d0087f28e");
            }
            if (this.c == null || this.c.b == null) {
                return null;
            }
            return this.c.b.toString();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a7ff47339bc218785556eba4b938941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a7ff47339bc218785556eba4b938941");
        } else {
            super.onDetachedFromWindow();
        }
    }

    private Uri handleRemoteImage(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01339e2935337ee77cd58c40c0d03391", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01339e2935337ee77cd58c40c0d03391");
        }
        if (!this.mEnableShrink || this.mFailedToLoadTransformedSource || this.mCapInsets != null || this.mWidth <= 0.0f || this.mHeight <= 0.0f) {
            return uri;
        }
        if (uri.getPath() == null || !uri.getPath().contains("_1_")) {
            Uri a2 = com.meituan.msc.views.imagehelper.d.a().a(uri, this.mWidth, this.mHeight);
            return a2 != null ? a2 : e.a(uri, (int) Math.ceil(this.mWidth * this.mShrinkRatio), (int) Math.ceil(this.mHeight * this.mShrinkRatio), this.mShrinkGif, this.mTransformToWebp);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ece59867321175aa58ce43a6c9a477cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ece59867321175aa58ce43a6c9a477cd");
            return;
        }
        if (f != this.mWidth) {
            this.mTransformedSource = null;
            setDirtyState(a.DIRTY);
        }
        this.mWidth = f;
    }

    public void setHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53b29c6ad4acceeef8de4e5d35de8e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53b29c6ad4acceeef8de4e5d35de8e0");
            return;
        }
        if (f != this.mHeight) {
            this.mTransformedSource = null;
            setDirtyState(a.DIRTY);
        }
        this.mHeight = f;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78e0271c7a2e083994444099c8765b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78e0271c7a2e083994444099c8765b5c");
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

    public c getImageSource() {
        return this.mImageSource;
    }

    public Uri getTransformedSource() {
        return this.mTransformedSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportFileNotFound(Exception exc, c cVar) {
        DioFile[] m;
        Object[] objArr = {exc, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71a5ce08939f751f7a049634761c3926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71a5ce08939f751f7a049634761c3926");
            return;
        }
        try {
            if (exc instanceof FileNotFoundException) {
                Uri uri = cVar.b;
                StringBuilder sb = new StringBuilder();
                DioFile f = com.meituan.msc.utils.a.b(uri).f();
                if (TextUtils.isEmpty(imgFilePath) || !imgFilePath.equals(f.h())) {
                    imgFilePath = f.h();
                    if (f.c() && f.j() && (m = f.m()) != null) {
                        sb.append("当前bundle图片数量:");
                        sb.append(m.length);
                    }
                    g.b("RCTRoundImageView@reportFileNotFound", exc, sb.toString());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
