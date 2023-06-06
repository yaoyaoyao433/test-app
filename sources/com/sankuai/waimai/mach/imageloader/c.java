package com.sankuai.waimai.mach.imageloader;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.LruCache;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.i;
import com.sankuai.waimai.mach.k;
import com.squareup.picasso.PicassoBitmapDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final LruCache<c.a.C1000a, Drawable.ConstantState> b = new LruCache<>(50);

    static {
        Mach.getContext().registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.sankuai.waimai.mach.imageloader.c.1
            public static ChangeQuickRedirect a;

            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
                Object[] objArr = {configuration};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6105d86b94898f89056ec4c7797210", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6105d86b94898f89056ec4c7797210");
                } else {
                    c.b.evictAll();
                }
            }

            @Override // android.content.ComponentCallbacks2
            public final void onTrimMemory(int i) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644cb41c52d4c9dfb4847ce4331be737", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644cb41c52d4c9dfb4847ce4331be737");
                } else if (i == 80) {
                    c.b.evictAll();
                }
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdad9738475fd8cb3763cbd71fc6de42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdad9738475fd8cb3763cbd71fc6de42");
                } else {
                    c.b.evictAll();
                }
            }
        });
    }

    public static void a(final i iVar, final c.a aVar, final k kVar) {
        Object[] objArr = {iVar, aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b1892110f0e09f60aafb482b91f0aa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b1892110f0e09f60aafb482b91f0aa5");
        } else if (aVar == null) {
        } else {
            Object b2 = kVar.b();
            if (b2 instanceof ImageLoadState) {
                ImageLoadState imageLoadState = (ImageLoadState) b2;
                if (Objects.equals(imageLoadState.c, aVar.b) && imageLoadState.b == 1) {
                    return;
                }
            }
            b(iVar, aVar.a, aVar.c, aVar.e, kVar, true, new a() { // from class: com.sankuai.waimai.mach.imageloader.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.imageloader.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f562c65fefde38f0b52f939f5adf3a7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f562c65fefde38f0b52f939f5adf3a7c");
                    } else {
                        b();
                    }
                }

                @Override // com.sankuai.waimai.mach.imageloader.c.a
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b6f6b2ebd5be1fd6bf47bef7f8c1f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b6f6b2ebd5be1fd6bf47bef7f8c1f2");
                    } else {
                        b();
                    }
                }

                private void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c71891e1f04d19055cdca5d61a7aea0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c71891e1f04d19055cdca5d61a7aea0");
                    } else {
                        c.b(i.this, aVar.a, aVar.b, aVar.e, kVar, false, new a() { // from class: com.sankuai.waimai.mach.imageloader.c.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.mach.imageloader.c.a
                            public final void a() {
                            }

                            @Override // com.sankuai.waimai.mach.imageloader.c.a
                            public final void a(int i, Exception exc) {
                                Object[] objArr3 = {Integer.valueOf(i), exc};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4416be61f31952be6b012350bc0dcc42", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4416be61f31952be6b012350bc0dcc42");
                                } else {
                                    c.b(i.this, aVar.a, aVar.d, aVar.e, kVar, false, null);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(i iVar, com.sankuai.waimai.mach.node.a<?> aVar, final c.a.C1000a c1000a, @Nullable b bVar, k kVar, boolean z, final a aVar2) {
        Object[] objArr = {iVar, aVar, c1000a, bVar, kVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eee9a5f25c28039a7b6fe6de2e4a0727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eee9a5f25c28039a7b6fe6de2e4a0727");
        } else if (kVar == null) {
        } else {
            final k a2 = a(kVar, c1000a, bVar);
            a2.a(z);
            if (z) {
                a2.a((Drawable) null);
            }
            if (iVar == null || !c.a.C1000a.a(c1000a)) {
                if (iVar != null) {
                    a2.a("");
                }
                if (aVar2 != null) {
                    aVar2.a(0, new Exception("MachImageLoaderUtil load image failed with illegal params"));
                    return;
                }
                return;
            }
            final ImageLoadState imageLoadState = new ImageLoadState(c1000a);
            imageLoadState.b = 0;
            a2.a(imageLoadState);
            Drawable a3 = a(a2.c(), c1000a);
            if (a3 != null) {
                b(a2, a3, imageLoadState, aVar2);
            } else {
                iVar.a(aVar, c1000a, a2, z, new i.a() { // from class: com.sankuai.waimai.mach.imageloader.c.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.i.a
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a7106811098741fc86c47bfac725e3b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a7106811098741fc86c47bfac725e3b");
                            return;
                        }
                        c.b.put(c.a.C1000a.this, drawable.getConstantState());
                        c.b(a2, drawable, imageLoadState, aVar2);
                    }

                    @Override // com.sankuai.waimai.mach.i.a
                    public final void a(int i, @Nullable Exception exc) {
                        Object[] objArr2 = {Integer.valueOf(i), exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "688fd902dfe70d0231b3ab7178ca4d98", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "688fd902dfe70d0231b3ab7178ca4d98");
                        } else if (c.b(imageLoadState, a2)) {
                            imageLoadState.b = -2;
                            a aVar3 = aVar2;
                            Object[] objArr3 = {aVar3, Integer.valueOf(i), exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a.e;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d09abc438ca0d422d622c930e3bd3681", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d09abc438ca0d422d622c930e3bd3681");
                            } else if (aVar3 != null) {
                                aVar3.a(i, exc);
                            }
                        } else {
                            imageLoadState.b = -1;
                            a.b(aVar2);
                        }
                    }
                });
            }
        }
    }

    private static k a(k kVar, c.a.C1000a c1000a, @Nullable b bVar) {
        Object[] objArr = {kVar, c1000a, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae234f11366a6ca5b57d5fe7eebcc2b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae234f11366a6ca5b57d5fe7eebcc2b0");
        }
        if (c1000a != null && !TextUtils.isEmpty(c1000a.c) && bVar != null) {
            if (c1000a.c.contains("@3x.")) {
                return new C1010c(kVar, bVar, 3);
            }
            if (c1000a.c.contains("@2x.")) {
                return new C1010c(kVar, bVar, 2);
            }
        }
        return kVar;
    }

    private static Drawable a(Context context, c.a.C1000a c1000a) {
        Object[] objArr = {context, c1000a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed57ccb65ad56a421f667633cb63e537", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed57ccb65ad56a421f667633cb63e537");
        }
        Drawable.ConstantState constantState = b.get(c1000a);
        if (constantState != null) {
            return constantState.newDrawable(context.getResources());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(k kVar, Drawable drawable, ImageLoadState imageLoadState, a aVar) {
        Object[] objArr = {kVar, drawable, imageLoadState, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1ddb50598af8118c9859c4af9050305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1ddb50598af8118c9859c4af9050305");
        } else if (b(imageLoadState, kVar)) {
            kVar.a(drawable);
            imageLoadState.b = 1;
            a.a(aVar);
        } else {
            imageLoadState.b = -1;
            a.b(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(ImageLoadState imageLoadState, @NonNull k kVar) {
        Object[] objArr = {imageLoadState, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7801bfeca499a98f94b12ade114b85b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7801bfeca499a98f94b12ade114b85b5")).booleanValue();
        }
        Object b2 = kVar.b();
        if (b2 instanceof ImageLoadState) {
            return Objects.equals(imageLoadState.c, ((ImageLoadState) b2).c);
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect e;

        static void b(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee4de30186a71be61fccc64f605a6cfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee4de30186a71be61fccc64f605a6cfc");
            }
        }

        public abstract void a();

        public abstract void a(int i, Exception exc);

        static void a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc4fe648a017c9307898ca2caeb3f683", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc4fe648a017c9307898ca2caeb3f683");
            } else if (aVar != null) {
                aVar.a();
            }
        }
    }

    public static NinePatchDrawable a(Resources resources, Bitmap bitmap, int i, int i2, int i3, int i4, String str) {
        ByteBuffer order;
        Object[] objArr = {resources, bitmap, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f35a63bf39a874b2439c399d568b8b01", RobustBitConfig.DEFAULT_VALUE)) {
            return (NinePatchDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f35a63bf39a874b2439c399d568b8b01");
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1c78bbae8df173244e77b8896a964817", RobustBitConfig.DEFAULT_VALUE)) {
            order = (ByteBuffer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1c78bbae8df173244e77b8896a964817");
        } else {
            order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
            order.put((byte) 1);
            order.put((byte) 2);
            order.put((byte) 2);
            order.put((byte) 9);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(i2);
            order.putInt(i4);
            order.putInt(i);
            order.putInt(i3);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
        }
        return new NinePatchDrawable(resources, bitmap, order.array(), new Rect(), null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.imageloader.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1010c implements k {
        public static ChangeQuickRedirect a;
        @NonNull
        private k b;
        @NonNull
        private b c;
        private int d;

        public C1010c(@NonNull k kVar, @NonNull b bVar, int i) {
            Object[] objArr = {kVar, bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7672b552055d4b2530b160f84a83ea1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7672b552055d4b2530b160f84a83ea1");
                return;
            }
            this.b = kVar;
            this.c = bVar;
            this.d = Math.max(1, i);
        }

        @Override // com.sankuai.waimai.mach.k
        public final void a(Drawable drawable) {
            Drawable drawable2;
            Bitmap b;
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b09a03e18ae3643748fe16a0dcd5bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b09a03e18ae3643748fe16a0dcd5bd");
                return;
            }
            if (drawable != null) {
                Object[] objArr2 = {drawable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "105e40f532207cf3fd01788841ad6e02", RobustBitConfig.DEFAULT_VALUE)) {
                    drawable2 = (Drawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "105e40f532207cf3fd01788841ad6e02");
                } else {
                    boolean z = drawable instanceof BitmapDrawable;
                    if (z || (drawable instanceof PicassoBitmapDrawable)) {
                        if (z) {
                            b = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            b = ((PicassoBitmapDrawable) drawable).b();
                        }
                        Bitmap bitmap = b;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            int i = this.c.b * this.d;
                            int height = bitmap.getHeight() - (this.c.d * this.d);
                            int i2 = this.c.c * this.d;
                            int width = bitmap.getWidth() - (this.c.e * this.d);
                            if (i2 >= width) {
                                width = i2 + 1;
                            }
                            int i3 = width;
                            if (i >= height) {
                                height = i + 1;
                            }
                            bitmap.setDensity(this.d * 160);
                            drawable2 = c.a(c().getResources(), bitmap, i, i2, height, i3, (String) null);
                        }
                    }
                }
                this.b.a(drawable2);
            }
            drawable2 = drawable;
            this.b.a(drawable2);
        }

        @Override // com.sankuai.waimai.mach.k
        public final ImageView a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5ef433a6c7fe27a3e99917aae67957", RobustBitConfig.DEFAULT_VALUE)) {
                return (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5ef433a6c7fe27a3e99917aae67957");
            }
            if (this.b != null) {
                return this.b.a();
            }
            return null;
        }

        @Override // com.sankuai.waimai.mach.k
        public final void a(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7878c6fd71e28dbef802bfbf8ab2b7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7878c6fd71e28dbef802bfbf8ab2b7f");
            } else {
                this.b.a(obj);
            }
        }

        @Override // com.sankuai.waimai.mach.k
        public final Object b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5fc78356d268a51810f9c14c69d1f17", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5fc78356d268a51810f9c14c69d1f17") : this.b.b();
        }

        @Override // com.sankuai.waimai.mach.k
        public final Context c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13ed919c1326bc5050b7f2ea4539964", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13ed919c1326bc5050b7f2ea4539964") : this.b.c();
        }

        @Override // com.sankuai.waimai.mach.k
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b53be5955b2c7000209c931f27fae0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b53be5955b2c7000209c931f27fae0e");
            } else {
                this.b.a(z);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        int d;
        int e;

        public b(@NonNull String[] strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e47f645dd12ff3cc95dbc7e8c10a81", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e47f645dd12ff3cc95dbc7e8c10a81");
            } else if (strArr.length >= 4) {
                int a2 = a(strArr[0]);
                int a3 = a(strArr[1]);
                int a4 = a(strArr[2]);
                int a5 = a(strArr[3]);
                if (a2 < 0 || a3 < 0 || a4 < 0 || a5 < 0) {
                    throw new IllegalArgumentException("cap insets 的值不合法！");
                }
                this.b = a2;
                this.c = a3;
                this.d = a4;
                this.e = a5;
            } else {
                throw new IllegalArgumentException("cap insets 需要上左下右四个值！");
            }
        }

        private static int a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7ef1aace36f70d576614fec0b836d15", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7ef1aace36f70d576614fec0b836d15")).intValue();
            }
            if (TextUtils.isEmpty(str) || !(str.endsWith("dp") || b(str))) {
                return -1;
            }
            int lastIndexOf = str.lastIndexOf("dp");
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            try {
                return Float.valueOf(str).intValue();
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private static boolean b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "960a2e8b226e3baca09844e6eb2c95c7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "960a2e8b226e3baca09844e6eb2c95c7")).booleanValue();
            }
            try {
                return Float.parseFloat(str) == 0.0f;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
    }
}
