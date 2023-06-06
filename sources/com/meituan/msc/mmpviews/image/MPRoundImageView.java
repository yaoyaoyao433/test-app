package com.meituan.msc.mmpviews.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.mmpviews.image.b;
import com.meituan.msc.mmpviews.shell.e;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.views.image.c;
import com.meituan.msc.views.imagehelper.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawableImageViewTarget;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.model.c;
import com.squareup.picasso.model.d;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MPRoundImageView extends ImageView implements com.meituan.msc.mmpviews.shell.a {
    public static ChangeQuickRedirect a;
    private static volatile int c;
    private static String x;
    boolean b;
    private a d;
    private c e;
    private DiskCacheStrategy f;
    private int g;
    private com.squareup.picasso.model.a h;
    private String i;
    private Rect j;
    private int k;
    private Drawable l;
    private String m;
    private com.meituan.msc.mmpviews.image.b n;
    private boolean o;
    private int p;
    private int q;
    private Uri r;
    private boolean s;
    private IFileModule t;
    private boolean u;
    private com.meituan.msc.events.scroll.a v;
    private final e w;

    public static /* synthetic */ Uri a(MPRoundImageView mPRoundImageView, Uri uri) {
        mPRoundImageView.r = null;
        return null;
    }

    public static /* synthetic */ boolean a(MPRoundImageView mPRoundImageView, boolean z) {
        mPRoundImageView.s = true;
        return true;
    }

    @Override // com.meituan.msc.mmpviews.shell.a
    public e getDelegate() {
        return this.w;
    }

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479eb568bd91a4a92071eb790158bf01", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479eb568bd91a4a92071eb790158bf01");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffdc53b942f16c1643206f5763be8346", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffdc53b942f16c1643206f5763be8346") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ba4f179557538f93facb88c290c1a63", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ba4f179557538f93facb88c290c1a63") : (a[]) values().clone();
        }
    }

    public MPRoundImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62bd2571e620c93bed874cc037c8b6e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62bd2571e620c93bed874cc037c8b6e0");
            return;
        }
        this.d = a.UNDEFINE;
        this.k = 0;
        this.n = com.meituan.msc.mmpviews.image.b.scaleToFill;
        this.s = false;
        this.v = new com.meituan.msc.events.scroll.a() { // from class: com.meituan.msc.mmpviews.image.MPRoundImageView.1
        };
        this.w = new e(this);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.e = new c(context);
        this.f = DiskCacheStrategy.SOURCE;
        this.b = true;
    }

    public void setMode(com.meituan.msc.mmpviews.image.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a716aa52fd7b46c7575f72e52112f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a716aa52fd7b46c7575f72e52112f1");
        } else if (this.n == bVar) {
        } else {
            setDirtyState(a.DIRTY);
            if (bVar == null) {
                bVar = com.meituan.msc.mmpviews.image.b.scaleToFill;
            }
            this.n = bVar;
        }
    }

    public void setIsLazyLoad(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf421fc09b872485591df574b7d34600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf421fc09b872485591df574b7d34600");
            return;
        }
        this.u = z;
        if (z) {
            com.meituan.msc.events.scroll.b a2 = com.meituan.msc.events.scroll.b.a();
            com.meituan.msc.events.scroll.a aVar = this.v;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.events.scroll.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "f767ae2d71d29160354b2f6200994a8f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "f767ae2d71d29160354b2f6200994a8f");
                return;
            }
            synchronized (a2.b) {
                if (aVar != null) {
                    try {
                        if (!a2.b.contains(aVar)) {
                            a2.b.add(aVar);
                        }
                    } finally {
                    }
                }
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b4bba53a846f0c119bca6b48487d3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b4bba53a846f0c119bca6b48487d3b");
        } else if (this.u) {
            com.meituan.msc.events.scroll.b a2 = com.meituan.msc.events.scroll.b.a();
            com.meituan.msc.events.scroll.a aVar = this.v;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.events.scroll.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1933d50060d8198ee7cd57b5c1ede8a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1933d50060d8198ee7cd57b5c1ede8a5");
            } else if (aVar != null) {
                synchronized (a2.b) {
                    a2.b.remove(aVar);
                }
            }
            this.u = false;
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab30967f9d4fbe7c6e5dd4d2d4e50e3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab30967f9d4fbe7c6e5dd4d2d4e50e3d")).booleanValue();
        }
        if (this.u) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            return new Rect(-1, -1000, 2000, 5000).contains(new Rect(iArr[0], iArr[1], iArr[0] + getWidth(), iArr[1] + getHeight()));
        }
        return true;
    }

    public void setFileModule(IFileModule iFileModule) {
        Object[] objArr = {iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0d04cd7f1a75985d5c34d3d2305093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0d04cd7f1a75985d5c34d3d2305093");
            return;
        }
        this.t = iFileModule;
        this.e.l = this.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirtyState(a aVar) {
        this.d = aVar;
    }

    public void setSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5b8c40e1c9da8ee18cd8c9eb93692c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5b8c40e1c9da8ee18cd8c9eb93692c9");
            return;
        }
        String str2 = this.e.k;
        this.e.a(str);
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str, str2)) {
            return;
        }
        setDirtyState(a.DIRTY);
    }

    public void setCapInsets(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32dec1ab4e597bc211343cf491c91bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32dec1ab4e597bc211343cf491c91bf");
            return;
        }
        if (readableMap != null) {
            this.j = new Rect(readableMap.getInt("left"), readableMap.getInt("top"), readableMap.getInt("right"), readableMap.getInt("bottom"));
        } else {
            this.j = null;
        }
        setDirtyState(a.DIRTY);
    }

    public void setLoadingIndicatorSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240a42a1e8b1f0ff9e29f2b6d02b2cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240a42a1e8b1f0ff9e29f2b6d02b2cc6");
            return;
        }
        this.e.b(str);
        setDirtyState(a.DIRTY);
    }

    public void setHeaders(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8670b4ff54578e099582540d575d7d15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8670b4ff54578e099582540d575d7d15");
        } else if (this.h == null) {
            c.a aVar = new c.a();
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                aVar.a(next.getKey(), String.valueOf(next.getValue()));
            }
            this.h = aVar.a();
        }
    }

    public void setMethod(String str) {
        this.i = str;
    }

    private Uri a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c424fc77eb1025d683917ca47e42f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c424fc77eb1025d683917ca47e42f2");
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void setPlaceHolder(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495ea68da0f18e59a88027d5bf2b83bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495ea68da0f18e59a88027d5bf2b83bb");
            return;
        }
        Uri a2 = a(str);
        if (a2 != null && a2.getScheme() != null) {
            if (this.m == null || !TextUtils.equals(this.m, str)) {
                if (TextUtils.equals(a2.getScheme(), "mscfile")) {
                    String a3 = this.t != null ? this.t.a(str.toString()) : null;
                    if (!TextUtils.isEmpty(a3)) {
                        a2 = Uri.parse("file://" + a3);
                    }
                }
                com.meituan.msc.views.imagehelper.a.a(getContext().getApplicationContext()).a(a2, null, new a.InterfaceC0490a() { // from class: com.meituan.msc.mmpviews.image.MPRoundImageView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.views.imagehelper.a.InterfaceC0490a
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "334ea178f1eacfe8ba39e0569e54be94", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "334ea178f1eacfe8ba39e0569e54be94");
                            return;
                        }
                        MPRoundImageView.this.l = drawable;
                        MPRoundImageView.this.m = str;
                        boolean z = MPRoundImageView.this.d != a.DIRTY;
                        MPRoundImageView.this.setDirtyState(a.DIRTY);
                        if (z) {
                            if (UiThreadUtil.isOnUiThread()) {
                                MPRoundImageView.this.a();
                            } else {
                                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.mmpviews.image.MPRoundImageView.2.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "38e18627e9f1ba621a05f5f28c460e8b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "38e18627e9f1ba621a05f5f28c460e8b");
                                        } else {
                                            MPRoundImageView.this.a();
                                        }
                                    }
                                });
                            }
                        }
                    }

                    @Override // com.meituan.msc.views.imagehelper.a.InterfaceC0490a
                    public final void a(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fe33fe6fae82c65a53b4c41c0522b32", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fe33fe6fae82c65a53b4c41c0522b32");
                        } else {
                            ((ReactContext) MPRoundImageView.this.getContext()).getUIManagerModule().a().a(com.meituan.msc.mmpviews.image.a.a(MPRoundImageView.this.getId(), 1, (MPRoundImageView.this.e == null || MPRoundImageView.this.e.b == null) ? null : MPRoundImageView.this.e.b.toString(), 0, 0, 0L, exc.getMessage(), MPRoundImageView.this));
                        }
                    }
                });
            }
        } else if (this.e.f == 0 || this.e.d(str) != this.e.f) {
            this.e.b(str);
            setDirtyState(a.DIRTY);
        }
    }

    public void setError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "254e520c88876be1e3971483ed0844f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "254e520c88876be1e3971483ed0844f6");
            return;
        }
        this.e.c(str);
        setDirtyState(a.DIRTY);
    }

    public void setDiskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
        this.f = diskCacheStrategy;
    }

    public void setFadeDuration(int i) {
        this.g = i;
    }

    public void setBlurRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d58fb6f798bb5fee2980b274d3a98b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d58fb6f798bb5fee2980b274d3a98b5");
            return;
        }
        int i = (int) f;
        if (this.k != i) {
            this.k = i;
            setDirtyState(a.DIRTY);
        }
    }

    public final void a() {
        RequestCreator requestCreator;
        RequestCreator a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87a0c8a1fa76d87c1fa6336a918318c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87a0c8a1fa76d87c1fa6336a918318c0");
        } else if ((getWidth() > 0 || getHeight() > 0) && this.d == a.DIRTY) {
            if (!this.u || c()) {
                Uri uri = this.e.b;
                this.r = null;
                if (this.e.i && this.e.b != null) {
                    requestCreator = com.meituan.msc.views.imagehelper.a.a(getContext().getApplicationContext(), this.e.b);
                } else if (uri != null) {
                    Uri a3 = a(uri);
                    if (!uri.equals(a3)) {
                        g.b("MPRoundImageView", String.format("[MRN图片缩略] 转换前链接: %s, 转换后链接: %s", uri, a3));
                        this.r = a3;
                        uri = a3;
                    }
                    if (this.h == null) {
                        a2 = getPicasso().a(uri);
                    } else {
                        if (TextUtils.isEmpty(this.i)) {
                            this.i = "GET";
                        }
                        a2 = getPicasso().a(new d(uri.toString(), this.h));
                    }
                    g.d("MPRoundImageView", "[MRN图片缩略] 加载图片: ", uri);
                    requestCreator = a2;
                } else if (this.e.h && this.e.e > 0) {
                    requestCreator = getPicasso().a(this.e.e);
                } else if (this.e.j != null) {
                    requestCreator = getPicasso().a(this.e.j);
                } else {
                    g.d("MPRoundImageView", "sourceUri is null");
                    requestCreator = null;
                }
                if (requestCreator != null) {
                    if (this.e.f != 0) {
                        requestCreator.a(this.e.f);
                    } else if (this.l != null) {
                        requestCreator.a(this.l);
                    } else {
                        requestCreator.a();
                    }
                    if (this.e.g != 0) {
                        requestCreator.b(this.e.g);
                    }
                    if (this.e.c != 0.0d && this.e.d != 0.0d) {
                        requestCreator.b((int) (this.e.c + 0.5d), (int) (this.e.d + 0.5d));
                    }
                    if (this.g != 0) {
                        requestCreator.h();
                    }
                    if (this.k > 0) {
                        requestCreator.a(new com.meituan.msc.views.image.blur.a(getContext(), this.k, 1));
                    }
                    requestCreator.a(this.b);
                    requestCreator.a(this.f);
                    requestCreator.a(this, null, 0, new b(this, this.e));
                    setDirtyState(a.CLEAN);
                }
                b();
            }
        }
    }

    private Picasso getPicasso() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92ee53c786455df9dfb0f10f32ff2f7b", RobustBitConfig.DEFAULT_VALUE) ? (Picasso) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92ee53c786455df9dfb0f10f32ff2f7b") : Picasso.g(getContext().getApplicationContext());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (a(r10, getWidth()) != false) goto L31;
     */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setImageDrawable(android.graphics.drawable.Drawable r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.image.MPRoundImageView.setImageDrawable(android.graphics.drawable.Drawable):void");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb802f980dc5b9615e1af9267a672c94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb802f980dc5b9615e1af9267a672c94");
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.p || i6 != this.q) {
            setDirtyState(a.DIRTY);
        }
        this.p = i5;
        this.q = i6;
        a();
    }

    private boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e7ebc0a42a21ec9fc60872ef3e79c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e7ebc0a42a21ec9fc60872ef3e79c7")).booleanValue() : Math.abs(i - i2) < 5;
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        float[] fArr;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b9ba6afaa882ff328eb9aa38126f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b9ba6afaa882ff328eb9aa38126f00");
            return;
        }
        e delegate = getDelegate();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect2, false, "daec21aef27e01afc83b54981aaf0299", RobustBitConfig.DEFAULT_VALUE)) {
            fArr = (float[]) PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect2, false, "daec21aef27e01afc83b54981aaf0299");
        } else {
            fArr = delegate.i().h;
            if (fArr == null) {
                fArr = null;
            }
        }
        if (fArr != null) {
            Path path = new Path();
            path.addRoundRect(new RectF(getDelegate().a(), getDelegate().b(), getDelegate().a() + getDelegate().e(), getDelegate().b() + getDelegate().f()), fArr, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.INTERSECT);
        }
        this.w.a(canvas);
        if (getDrawable() != null) {
            b.a a2 = com.meituan.msc.mmpviews.image.b.a(this.n, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), getWidth(), getHeight());
            canvas.translate(a2.c, a2.d);
            canvas.scale(a2.a, a2.b);
        }
        super.onDraw(canvas);
        e eVar = this.w;
        Object[] objArr3 = {canvas};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "e65677ab72acace37d58582a9cfa04a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "e65677ab72acace37d58582a9cfa04a6");
        } else {
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b extends PicassoDrawableImageViewTarget {
        public static ChangeQuickRedirect a;
        private com.meituan.msc.views.image.c c;
        private MPRoundImageView d;
        private long e;

        public b(MPRoundImageView mPRoundImageView, com.meituan.msc.views.image.c cVar) {
            super(mPRoundImageView);
            Object[] objArr = {MPRoundImageView.this, mPRoundImageView, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e72a0d08ebb6a0d11d05834d5c802b5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e72a0d08ebb6a0d11d05834d5c802b5");
                return;
            }
            this.c = cVar;
            this.d = mPRoundImageView;
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadStarted(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba7f9817656ca9e300b4575965631b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba7f9817656ca9e300b4575965631b6");
                return;
            }
            super.onLoadStarted(drawable);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddb6a02967de5bd8d2a4e8df5b52b30f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddb6a02967de5bd8d2a4e8df5b52b30f");
            } else {
                this.e = System.currentTimeMillis();
            }
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadFailed(Exception exc, Drawable drawable) {
            Object[] objArr = {exc, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3348bb54edebb91731ef1e9dbfec5f62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3348bb54edebb91731ef1e9dbfec5f62");
                return;
            }
            super.onLoadFailed(exc, drawable);
            if (this.d != null && this.d.r != null) {
                MPRoundImageView.a(this.d, true);
                MPRoundImageView.a(this.d, (Uri) null);
                this.d.setDirtyState(a.DIRTY);
                this.d.a();
                Object[] objArr2 = new Object[1];
                Object[] objArr3 = new Object[2];
                objArr3[0] = this.c != null ? this.c.k : "Unknown";
                objArr3[1] = this.d.r;
                objArr2[0] = String.format("加载Venus图片失败, 转换前链接: %s, 转换后链接: %s", objArr3);
                g.d("MPRoundImageView", objArr2);
                return;
            }
            Object[] objArr4 = {exc};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect2, false, "1004fc964e60ba759e23a282fb65bae5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect2, false, "1004fc964e60ba759e23a282fb65bae5");
                return;
            }
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
                a(1, System.currentTimeMillis() - this.e, null, str, stringBuffer.toString());
                g.d("RCTRoundImageView@onLoadError", stringBuffer.toString(), exc);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
            if (r0.contains("@2x.") != false) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
        /* JADX WARN: Type inference failed for: r0v41, types: [android.graphics.drawable.NinePatchDrawable] */
        @Override // com.squareup.picasso.PicassoDrawableTarget
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onResourceReady(com.squareup.picasso.PicassoDrawable r21, com.squareup.picasso.Picasso.LoadedFrom r22) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.image.MPRoundImageView.b.onResourceReady(com.squareup.picasso.PicassoDrawable, com.squareup.picasso.Picasso$LoadedFrom):void");
        }

        private void a(int i, long j, Drawable drawable, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), new Long(j), drawable, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b1592b1ac598b3a08ac8349301074cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b1592b1ac598b3a08ac8349301074cc");
            } else if (this.d == null) {
            } else {
                ((ReactContext) this.d.getContext()).getUIManagerModule().a().a(com.meituan.msc.mmpviews.image.a.a(this.d.getId(), i, str == null ? a() : str, drawable != null ? drawable.getIntrinsicWidth() : 0, drawable != null ? drawable.getIntrinsicHeight() : 0, j, str2, this.d));
            }
        }

        private String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd5e6dfcfbcff822400786b3dfa8d06", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd5e6dfcfbcff822400786b3dfa8d06");
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f46c3c630725d1e5d4f6a2fbc8724474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f46c3c630725d1e5d4f6a2fbc8724474");
        } else {
            super.onDetachedFromWindow();
        }
    }

    private Uri a(Uri uri) {
        boolean z = true;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcaee133ca88c5b7461d5cd0c1b787b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcaee133ca88c5b7461d5cd0c1b787b");
        }
        if (this.s || this.j != null) {
            return uri;
        }
        if (uri.getPath() == null || !uri.getPath().contains("_1_")) {
            Uri a2 = com.meituan.msc.views.imagehelper.d.a().a(uri, this.p, this.q);
            if (a2 != null) {
                return a2;
            }
            return com.meituan.msc.views.imagehelper.e.a(uri, this.p, this.q, ((getContext() instanceof ThemedReactContext) && ((ThemedReactContext) getContext()).getRuntimeDelegate().shrinkGif()) ? false : false, this.o);
        }
        return uri;
    }

    public void setTransformToWebp(boolean z) {
        this.o = z;
    }

    public com.meituan.msc.views.image.c getImageSource() {
        return this.e;
    }

    public Uri getTransformedSource() {
        return this.r;
    }
}
