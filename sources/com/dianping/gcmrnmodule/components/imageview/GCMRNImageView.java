package com.dianping.gcmrnmodule.components.imageview;

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
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.widget.ImageView;
import com.dianping.picasso.PicassoUtils;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.e;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.image.c;
import com.meituan.android.mrn.util.b;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoBitmapDrawable;
import com.squareup.picasso.PicassoDrawableImageViewTarget;
import com.squareup.picasso.Target;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GCMRNImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private boolean c;
    private c d;
    private boolean e;
    private DiskCacheStrategy f;
    private int g;
    private int h;
    private int i;
    private float[] j;
    private int k;
    private Bitmap l;
    private Drawable m;
    private final Paint n;
    private final Paint o;
    private final Path p;
    private Rect q;

    public static /* synthetic */ boolean a(GCMRNImageView gCMRNImageView, boolean z) {
        gCMRNImageView.c = true;
        return true;
    }

    public GCMRNImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa9c57c14b650e59e8f6d6fae44ecaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa9c57c14b650e59e8f6d6fae44ecaa");
            return;
        }
        this.h = -16777216;
        this.i = 0;
        this.j = new float[8];
        this.n = new Paint();
        this.o = new Paint();
        this.p = new Path();
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.d = new c(context);
        this.f = DiskCacheStrategy.SOURCE;
        this.e = true;
        this.h = 0;
        this.n.setAntiAlias(true);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setAntiAlias(true);
        this.o.setStrokeJoin(Paint.Join.ROUND);
    }

    public void setSource(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3310aaed83b60448701b50423f63e672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3310aaed83b60448701b50423f63e672");
            return;
        }
        String str = null;
        if (readableMap != null && readableMap.hasKey(Constants.TRAFFIC_URI)) {
            str = readableMap.getString(Constants.TRAFFIC_URI);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.a();
        this.d.a(str);
        if (readableMap.hasKey("width")) {
            this.d.b = readableMap.getDouble("width");
        }
        if (readableMap.hasKey("height")) {
            this.d.c = readableMap.getDouble("height");
        }
        this.c = true;
    }

    public void setDefaultSource(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d196cf39734306a3c2df0d12858b197", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d196cf39734306a3c2df0d12858b197");
        } else if (readableMap == null || !readableMap.hasKey(Constants.TRAFFIC_URI)) {
        } else {
            String string = readableMap.getString(Constants.TRAFFIC_URI);
            try {
                Uri parse = Uri.parse(string);
                if (b.a(parse)) {
                    this.m = Drawable.createFromStream(b.b(parse).b(), string);
                    this.c = true;
                    return;
                }
                Picasso.g(getContext()).a(parse).a(new Target() { // from class: com.dianping.gcmrnmodule.components.imageview.GCMRNImageView.1
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr2 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb1966af14b0c463450974c5740998e4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb1966af14b0c463450974c5740998e4");
                            return;
                        }
                        GCMRNImageView.this.m = new BitmapDrawable(GCMRNImageView.this.getResources(), bitmap);
                        GCMRNImageView.a(GCMRNImageView.this, true);
                        GCMRNImageView.this.a();
                    }
                });
            } catch (Exception unused) {
                throw new IllegalArgumentException("defaultSource: " + string + " is not a valid uri");
            }
        }
    }

    public void setNinePatchSource(ReadableArray readableArray) {
        Integer num;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7c41559ca7f1b86b7e1f9503768d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7c41559ca7f1b86b7e1f9503768d49");
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
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fead3beb75888e606927cb2cecad1ad", RobustBitConfig.DEFAULT_VALUE)) {
                num = (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fead3beb75888e606927cb2cecad1ad");
            } else if (str == null || "".equalsIgnoreCase(str)) {
                num = 0;
            } else {
                num = Integer.valueOf(getResources().getIdentifier(str.toLowerCase().replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE), PicassoUtils.DEF_TYPE, getContext().getPackageName()));
            }
            setBackgroundResource(num.intValue());
        }
    }

    public void setCapInsets(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f310f32f3b2069243c1f6feacda2da3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f310f32f3b2069243c1f6feacda2da3");
            return;
        }
        if (readableMap != null) {
            this.q = new Rect(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
        } else {
            this.q = null;
        }
        this.c = true;
    }

    public void setRoundAsCircle(boolean z) {
        if (z) {
            this.k = 1;
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab52f5c82faaddce912f04fa78fe2e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab52f5c82faaddce912f04fa78fe2e0c");
        } else if (e.a(f, 0.0f) && e.a(f2, 0.0f) && e.a(f3, 0.0f) && e.a(f4, 0.0f)) {
        } else {
            this.k = 2;
            if (this.j == null) {
                this.j = new float[8];
                Arrays.fill(this.j, 0.0f);
            }
            this.j[0] = f;
            this.j[1] = f;
            this.j[2] = f2;
            this.j[3] = f2;
            this.j[4] = f3;
            this.j[5] = f3;
            this.j[6] = f4;
            this.j[7] = f4;
        }
    }

    public void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838c082febd7bb62219877d1cbb5c415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838c082febd7bb62219877d1cbb5c415");
        } else if (e.a(f, 0.0f)) {
        } else {
            this.k = 2;
            Arrays.fill(this.j, f);
        }
    }

    public final void a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96dfc6d891504a982e938430eb9c8c11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96dfc6d891504a982e938430eb9c8c11");
        } else if (e.a(f, 0.0f)) {
        } else {
            this.k = 2;
            this.j[i] = f;
            this.j[i + 1] = f;
        }
    }

    public void setLoadingIndicatorSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e3b33b8db8ed4f95f74bfab37f79428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e3b33b8db8ed4f95f74bfab37f79428");
            return;
        }
        this.d.b(str);
        this.c = true;
    }

    public void setError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d165049bcd05aa1203457be0638f57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d165049bcd05aa1203457be0638f57");
            return;
        }
        this.d.c(str);
        this.c = true;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public void setDiskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
        this.f = diskCacheStrategy;
    }

    public void setBorderColor(int i) {
        this.h = i;
    }

    public void setBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3e18c85e0e56affc870a205ce37f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3e18c85e0e56affc870a205ce37f03");
        } else {
            this.i = (int) (w.a(f) + 0.5d);
        }
    }

    public void setFadeDuration(int i) {
        this.g = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.components.imageview.GCMRNImageView.a():void");
    }

    public void setIsDirty(boolean z) {
        this.c = z;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3c514aae0712c6409710192f70228d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3c514aae0712c6409710192f70228d");
        } else if (getDrawable() == drawable) {
        } else {
            super.setImageDrawable(drawable);
            this.l = a(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cbae8a82ab33649e0cd6e92f1a1fa83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cbae8a82ab33649e0cd6e92f1a1fa83");
            return;
        }
        super.setImageResource(i);
        this.l = a(getDrawable());
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        float width;
        float height;
        float f;
        Matrix matrix;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0884a572f00aedd75aa0d49bed18ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0884a572f00aedd75aa0d49bed18ee");
            return;
        }
        Rect rect = new Rect();
        getDrawingRect(rect);
        canvas.clipRect(rect);
        try {
            Bitmap bitmap = this.l;
            if (this.k == 0) {
                super.onDraw(canvas);
            } else {
                setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (bitmap != null) {
                    this.n.setAlpha(255);
                    this.n.setStyle(Paint.Style.FILL);
                    Paint paint = this.n;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    Shader shader = this.n.getShader();
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b903a4e4e3c36972fd124bb63b6dacd", RobustBitConfig.DEFAULT_VALUE)) {
                        matrix = (Matrix) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b903a4e4e3c36972fd124bb63b6dacd");
                    } else {
                        int width2 = bitmap.getWidth();
                        int height2 = bitmap.getHeight();
                        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                        rectF.inset(this.i, this.i);
                        Matrix matrix2 = new Matrix();
                        float f2 = width2;
                        float f3 = height2;
                        if (rectF.height() * f2 > rectF.width() * f3) {
                            width = rectF.height() / f3;
                            f = (rectF.width() - (f2 * width)) * 0.5f;
                            height = 0.0f;
                        } else {
                            width = rectF.width() / f2;
                            height = (rectF.height() - (f3 * width)) * 0.5f;
                            f = 0.0f;
                        }
                        matrix2.setScale(width, width);
                        matrix2.postTranslate(((int) (f + 0.5f)) + rectF.left, ((int) (height + 0.5f)) + rectF.top);
                        matrix = matrix2;
                    }
                    shader.setLocalMatrix(matrix);
                } else {
                    this.n.setAlpha(0);
                    this.n.setStrokeWidth(0.0f);
                    this.n.setStyle(Paint.Style.STROKE);
                    this.n.setShader(null);
                }
                RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.inset(this.i, this.i);
                if (this.k == 2) {
                    this.p.reset();
                    this.p.addRoundRect(rectF2, this.j, Path.Direction.CW);
                    canvas.drawPath(this.p, this.n);
                } else if (this.k == 1) {
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(rectF2.height() / 2.0f, rectF2.width() / 2.0f), this.n);
                }
            }
            if (this.i > 0) {
                RectF rectF3 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                this.o.setColor(this.h);
                this.o.setStrokeWidth(this.i);
                if (this.k == 0) {
                    canvas.drawRect(rectF3, this.o);
                } else if (this.k == 2) {
                    this.p.reset();
                    this.p.addRoundRect(rectF3, this.j, Path.Direction.CW);
                    canvas.drawPath(this.p, this.o);
                } else if (this.k == 1) {
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((rectF3.height() - this.i) / 2.0f, (rectF3.width() - this.i) / 2.0f), this.o);
                }
            }
        } catch (OutOfMemoryError unused) {
            b();
        } catch (RuntimeException unused2) {
            b();
        }
    }

    private Bitmap a(Drawable drawable) {
        Bitmap createBitmap;
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a4802897e972770af5ba52bcb89c034", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a4802897e972770af5ba52bcb89c034");
        }
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof PicassoBitmapDrawable) {
            return ((PicassoBitmapDrawable) drawable).b();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, b);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b);
            }
            Canvas canvas = new Canvas(createBitmap);
            Rect copyBounds = drawable.copyBounds();
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            drawable.setBounds(copyBounds);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00277a5eb6b5280ccb6aa4da872f47d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00277a5eb6b5280ccb6aa4da872f47d9");
            return;
        }
        if (this.l != null && !this.l.isRecycled()) {
            this.l.recycle();
            this.l = null;
        }
        this.n.setShader(null);
        b(getDrawable());
        super.setImageDrawable(null);
        b(getBackground());
        super.setBackground(null);
        Picasso.g(getContext()).c();
    }

    private void b(Drawable drawable) {
        Bitmap bitmap;
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb134a773da05e2e9f541e000b51b5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb134a773da05e2e9f541e000b51b5b");
        } else if (drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled()) {
        } else {
            bitmap.recycle();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends PicassoDrawableImageViewTarget {
        public static ChangeQuickRedirect a;
        private c b;
        private GCMRNImageView c;

        public a(GCMRNImageView gCMRNImageView, c cVar) {
            super(gCMRNImageView);
            Object[] objArr = {gCMRNImageView, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e1942fa30dcf33002492db78cd4df7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e1942fa30dcf33002492db78cd4df7");
                return;
            }
            this.b = cVar;
            this.c = gCMRNImageView;
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadStarted(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adcc5e3e14bddd1c24c3c01b98f280a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adcc5e3e14bddd1c24c3c01b98f280a3");
                return;
            }
            super.onLoadStarted(drawable);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e69d191e176f3d25529bdc8b3d715b87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e69d191e176f3d25529bdc8b3d715b87");
            } else {
                ((UIManagerModule) ((ReactContext) this.c.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new com.facebook.react.views.image.a(this.c.getId(), 4, a()));
            }
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadFailed(Exception exc, Drawable drawable) {
            Object[] objArr = {exc, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c53c3118defc2cbb90764922094521", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c53c3118defc2cbb90764922094521");
                return;
            }
            super.onLoadFailed(exc, drawable);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "629dda253bcf13878bb01b6ef06dd396", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "629dda253bcf13878bb01b6ef06dd396");
            } else {
                ((UIManagerModule) ((ReactContext) this.c.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new com.facebook.react.views.image.a(this.c.getId(), 1, a()));
            }
            a(null);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
        @Override // com.squareup.picasso.PicassoDrawableTarget
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onResourceReady(com.squareup.picasso.PicassoDrawable r12, com.squareup.picasso.Picasso.LoadedFrom r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.components.imageview.GCMRNImageView.a.onResourceReady(com.squareup.picasso.PicassoDrawable, com.squareup.picasso.Picasso$LoadedFrom):void");
        }

        private void a(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef094bd38b1d34438f2ce98bd5f2c57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef094bd38b1d34438f2ce98bd5f2c57");
            } else {
                ((UIManagerModule) ((ReactContext) this.c.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new com.facebook.react.views.image.a(this.c.getId(), 3, a(), drawable != null ? drawable.getIntrinsicWidth() : 0, drawable != null ? drawable.getIntrinsicHeight() : 0));
            }
        }

        private String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a18edd33ffcf9937c7c6b77700ab58", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a18edd33ffcf9937c7c6b77700ab58");
            }
            if (this.b == null || this.b.a == null) {
                return null;
            }
            return this.b.a.toString();
        }
    }
}
