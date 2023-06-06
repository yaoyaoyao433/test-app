package com.sankuai.meituan.mtimageloader.config;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.CheckResult;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.meituan.mtimageloader.utils.CdnResizeUtil;
import java.io.File;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private Object A;
    private boolean B;
    private boolean C;
    private final View D;
    private boolean E;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public com.sankuai.meituan.mtimageloader.utils.d g;
    public ImageView h;
    public final int i;
    public final BitmapTransformation[] j;
    public final String[] k;
    public int l;
    public int m;
    public int n;
    public Animation o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public a t;
    public c u;
    public d v;
    public int w;
    public int x;
    public HashMap<String, String> y;
    public boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void a();

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void a();

        void a(int i, Exception exc);
    }

    public b(C0608b c0608b) {
        Object[] objArr = {c0608b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045944c25b5c50a370ae8f169e7e9c95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045944c25b5c50a370ae8f169e7e9c95");
            return;
        }
        this.w = 0;
        this.x = 0;
        this.A = c0608b.b;
        this.b = c0608b.o;
        this.c = c0608b.c;
        this.d = c0608b.p;
        this.e = c0608b.d;
        this.f = c0608b.q;
        this.i = c0608b.E;
        this.C = c0608b.l;
        this.B = c0608b.n;
        this.g = c0608b.r;
        this.h = c0608b.s;
        this.D = c0608b.t;
        this.r = c0608b.z;
        this.s = c0608b.A;
        this.n = c0608b.C;
        this.m = c0608b.k;
        this.o = c0608b.D;
        this.l = c0608b.B;
        this.p = c0608b.i;
        this.j = c0608b.F;
        this.k = c0608b.G;
        this.z = c0608b.w;
        this.t = c0608b.x;
        this.u = c0608b.h;
        this.v = c0608b.y;
        this.q = c0608b.j;
        this.w = c0608b.H;
        this.x = c0608b.I;
        this.y = c0608b.J;
        this.E = c0608b.m;
    }

    public final Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c758467364486e084a012a414cb3236e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c758467364486e084a012a414cb3236e");
        }
        if (this.A instanceof Context) {
            return (Context) this.A;
        }
        if (this.h != null && this.h.getContext() != null) {
            return this.h.getContext();
        }
        if (this.D != null && this.D.getContext() != null) {
            return this.D.getContext();
        }
        return com.sankuai.meituan.mtimageloader.config.a.a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mtimageloader.config.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0608b {
        private static Set<Integer> L = new HashSet();
        public static ChangeQuickRedirect a;
        private boolean A;
        private int B;
        private int C;
        private Animation D;
        private int E;
        private BitmapTransformation[] F;
        private String[] G;
        private int H;
        private int I;
        private HashMap<String, String> J;
        private boolean K;
        public Object b;
        public String c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public c h;
        public int i;
        public int j;
        public int k;
        public boolean l;
        public boolean m;
        private boolean n;
        private String o;
        private String p;
        private String q;
        private com.sankuai.meituan.mtimageloader.utils.d r;
        private ImageView s;
        private View t;
        private int u;
        private int v;
        private boolean w;
        private a x;
        private d y;
        private boolean z;

        public C0608b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab4435fc083604da6ae6599b11f9a4b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab4435fc083604da6ae6599b11f9a4b");
                return;
            }
            this.n = com.sankuai.meituan.mtimageloader.config.a.b();
            this.e = com.sankuai.meituan.mtimageloader.config.a.e();
            this.u = 0;
            this.v = 0;
            this.f = 100;
            this.g = com.sankuai.meituan.mtimageloader.config.a.d();
            this.z = true;
            this.A = true;
            this.k = 4;
            this.E = 0;
            this.H = 0;
            this.I = 0;
            this.m = com.sankuai.meituan.mtimageloader.config.a.j();
        }

        public static /* synthetic */ void a(C0608b c0608b, Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, c0608b, changeQuickRedirect, false, "26f669af898cdb78c363802d208e96cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, c0608b, changeQuickRedirect, false, "26f669af898cdb78c363802d208e96cd");
            } else if (!com.sankuai.meituan.mtimageloader.config.a.i() || c0608b.K) {
            } else {
                if (c0608b.e == 1) {
                    if (c0608b.t == null) {
                        com.sankuai.meituan.mtimageloader.utils.c.a(new IllegalArgumentException("使用AUTO_RESIZE却没有指定任何target，请使用autoResizeTarget(View)指定缩放参照对象", exc));
                    } else if (CdnResizeUtil.b(c0608b.t) == 0 && CdnResizeUtil.a(c0608b.t) == 0) {
                        com.sankuai.meituan.mtimageloader.utils.c.a(new IllegalArgumentException("使用AUTO_RESIZE但target大小为0，请\n1. 检查ImageView layout参数设置是否为固定dp值\n2. 如果必须使用动态计算的大小，使用async(true)来延迟加载时机\n3. 使用cdnResize[ByWidth|ByHeight]指定缩放尺寸", exc));
                    }
                }
                if (c0608b.x != null) {
                    if (c0608b.i > 0) {
                        com.sankuai.meituan.mtimageloader.utils.c.a(new IllegalArgumentException("使用asBitmap方法时设置的placeHolderResId无效，请在onFail回调中处理加载失败的情况，或者考虑使用loadListener", exc));
                    }
                    if (c0608b.j > 0) {
                        com.sankuai.meituan.mtimageloader.utils.c.a(new IllegalArgumentException("使用asBitmap方法时设置的errorResId无效，请在onFail回调中处理加载失败的情况，或者考虑使用loadListener", exc));
                    }
                }
                if (c0608b.c != null && !L.contains(Integer.valueOf(c0608b.c.hashCode())) && c0608b.c.matches("http(s)?://p\\d+.meituan.net/\\d+(\\.\\d+){1,2}(\\.[ao])?.*") && c0608b.e != 0) {
                    L.add(Integer.valueOf(c0608b.c.hashCode()));
                    com.sankuai.meituan.mtimageloader.utils.c.a(new IllegalArgumentException("图片原始URL中已经设置cdn参数，使用图片库自动缩放后会覆盖原有设置，请确认：\n1. 删除原始图片中的cdn参数（一般来自ImageQualityUtil.getPicUrlBy***），使用图片库设置cdn(Resize|Quality)参数（推荐☆）\n2. 需要保留原始cdn参数，使用dontApplyCdnResize()来防止图片库修改cdn参数", exc));
                }
                if (c0608b.s == null || c0608b.s.getLayoutParams() == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = c0608b.s.getLayoutParams();
                if ((layoutParams.height <= 0 || layoutParams.width <= 0) && c0608b.s.getWidth() <= 0 && c0608b.s.getHeight() <= 0 && c0608b.u <= 0 && c0608b.v <= 0 && c0608b.H <= 0 && c0608b.I <= 0) {
                    com.sankuai.meituan.mtimageloader.utils.c.a(new IllegalStateException("对于没有固定宽高和没有Layout完成的ImageView，图片库无法自动设置cdn参数，也无法自动下采样位图内容，请：\n1. 对于来自cdn的图片，使用cdnResize系列方法，设置cdn参数\n2. 对于非cdn或者本地图片，建议设置固定大小的ImageView尺寸，如果无法确定大小，考虑使用async()异步加载\n3. 对于非cdn或者本地图片，如果异步加载也无法得到ImageView尺寸，请使用override方法确保不会加载过大的图片", exc));
                }
            }
        }

        @CheckResult
        @NonNull
        public final C0608b a(Context context) {
            this.b = context;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b a(BitmapTransformation[] bitmapTransformationArr, String[] strArr) {
            Object[] objArr = {bitmapTransformationArr, strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "057f0cb21054ed000a980f77ea28a2a6", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "057f0cb21054ed000a980f77ea28a2a6");
            }
            int length = bitmapTransformationArr == null ? 0 : bitmapTransformationArr.length;
            int length2 = strArr == null ? 0 : strArr.length;
            if (length2 == length) {
                if (length2 == 0) {
                    throw new IllegalArgumentException("不得传入长度为0的数组");
                }
                this.F = bitmapTransformationArr;
                this.G = strArr;
                if (com.sankuai.meituan.mtimageloader.config.a.i()) {
                    for (BitmapTransformation bitmapTransformation : bitmapTransformationArr) {
                        if (bitmapTransformation != null) {
                            Class<?> cls = bitmapTransformation.getClass();
                            if (cls.getDeclaringClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                                throw new AssertionError(cls + " 是非静态内部类，有可能导致内存泄漏，请使用静态内部类或者顶层类实现BitmapTransformation");
                            }
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("transformations 和 transformationKeys 的数组长度需一致");
        }

        @CheckResult
        @NonNull
        public final C0608b a(BitmapTransformation... bitmapTransformationArr) {
            Object[] objArr = {bitmapTransformationArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f628d72d36a19edf46a7e0746021d5f9", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f628d72d36a19edf46a7e0746021d5f9");
            }
            this.F = bitmapTransformationArr;
            if (com.sankuai.meituan.mtimageloader.config.a.i()) {
                for (BitmapTransformation bitmapTransformation : bitmapTransformationArr) {
                    if (bitmapTransformation != null) {
                        Class<?> cls = bitmapTransformation.getClass();
                        if (cls.getDeclaringClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                            throw new AssertionError(cls + " 是非静态内部类，有可能导致内存泄漏，请使用静态内部类或者顶层类实现BitmapTransformation");
                        }
                    }
                }
            }
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b a(String str) {
            this.c = str;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b a() {
            this.e = 1;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b a(View view) {
            this.e = 1;
            this.t = view;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8ad8b79be127eb708aa789b313ae73", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8ad8b79be127eb708aa789b313ae73");
            }
            this.e = 4;
            if (i == 0 && i2 == 0) {
                return this;
            }
            if (i == 0) {
                return a(i2);
            }
            if (i2 == 0) {
                return b(i);
            }
            this.u = i;
            this.v = i2;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b a(int i) {
            this.e = 3;
            this.v = i;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b b(int i) {
            this.e = 2;
            this.u = i;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b c(@DrawableRes int i) {
            this.j = i;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0ea0b6e6583d226114eec013869ec1", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0608b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0ea0b6e6583d226114eec013869ec1");
            }
            if (str.startsWith(MTURLUtil.CONTENT_BASE)) {
                this.q = str;
                return this;
            } else if (new File(str).exists()) {
                this.p = str;
                return this;
            } else {
                return this;
            }
        }

        private void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c6fab0671c5d0d554f04b241cc306b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c6fab0671c5d0d554f04b241cc306b");
                return;
            }
            if (this.t == null) {
                this.t = this.s;
            }
            if (this.b == null && this.t != null) {
                this.b = this.t.getContext();
            }
            final Exception exc = null;
            if (com.sankuai.meituan.mtimageloader.config.a.i() && this.l) {
                exc = new Exception();
            }
            Runnable runnable = new Runnable() { // from class: com.sankuai.meituan.mtimageloader.config.b.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1edd0a3232f3195cd2dcab05948e70ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1edd0a3232f3195cd2dcab05948e70ec");
                        return;
                    }
                    C0608b.a(C0608b.this, exc);
                    C0608b.this.o = CdnResizeUtil.a(C0608b.this.c, C0608b.this.e, C0608b.this.u, C0608b.this.v, C0608b.this.f, C0608b.this.t, C0608b.this.g);
                    b bVar = new b(C0608b.this);
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "0044978fac421eb38beee3a8369004bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "0044978fac421eb38beee3a8369004bd");
                        return;
                    }
                    try {
                        com.sankuai.meituan.mtimageloader.config.a.k().a(bVar);
                    } catch (Exception e) {
                        if (com.sankuai.meituan.mtimageloader.config.a.i()) {
                            throw e;
                        }
                        e.printStackTrace();
                    }
                }
            };
            if (this.l) {
                if (this.s == null) {
                    com.sankuai.meituan.mtimageloader.utils.c.a(new IllegalArgumentException("异步加载只能使用into(ImageView)方式"));
                }
                com.sankuai.meituan.mtimageloader.utils.c.a(this.s, runnable, exc);
                return;
            }
            runnable.run();
        }

        public final void a(ImageView imageView) {
            Object[] objArr = {imageView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db54e3fc33e3878c4cb5f60795335d69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db54e3fc33e3878c4cb5f60795335d69");
                return;
            }
            this.s = imageView;
            if (imageView == null) {
                if (com.sankuai.meituan.mtimageloader.config.a.i()) {
                    throw new IllegalArgumentException("targetView不能为null，请检查View实例");
                }
                return;
            }
            c();
        }

        public final void a(com.sankuai.meituan.mtimageloader.utils.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d3d2c259de220613e5a4a650601551", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d3d2c259de220613e5a4a650601551");
                return;
            }
            this.r = dVar;
            c();
        }

        @CheckResult
        @NonNull
        public C0608b a(d dVar) {
            this.y = dVar;
            return this;
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045953ac058a775d436736b51d4eaffb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045953ac058a775d436736b51d4eaffb");
            } else {
                a((a) null);
            }
        }

        public final void a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05464911cb78508b39a444eb8d4c21b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05464911cb78508b39a444eb8d4c21b4");
                return;
            }
            this.x = aVar;
            this.w = true;
            c();
        }

        public final void a(a aVar, int i) {
            Object[] objArr = {aVar, 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4cb2a439685481970ffa05cbb81cb94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4cb2a439685481970ffa05cbb81cb94");
                return;
            }
            this.x = aVar;
            this.w = true;
            this.E = 1;
            c();
        }

        @CheckResult
        @NonNull
        public final C0608b d(int i) {
            this.i = i;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b e(@IntRange(from = 0, to = 100) int i) {
            this.f = i;
            return this;
        }

        @CheckResult
        @NonNull
        public final C0608b b(int i, int i2) {
            this.H = i;
            this.I = i2;
            return this;
        }
    }
}
