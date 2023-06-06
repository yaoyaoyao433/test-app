package com.sankuai.waimai.platform.machpro;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.machpro.adapter.a;
import com.sankuai.waimai.platform.machpro.bitmap.MPBitmapTransform;
import com.squareup.picasso.PicassoBitmapDrawable;
import com.squareup.picasso.PicassoGifDrawable;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.machpro.adapter.a {
    public static ChangeQuickRedirect a;
    final Context b;

    public static /* synthetic */ Drawable a(c cVar, String str, a.c cVar2, Drawable drawable) {
        int i;
        Bitmap b;
        ByteBuffer byteBuffer;
        Object[] objArr = {str, cVar2, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f70f874b8e0cf21088aa77cfb269d0fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f70f874b8e0cf21088aa77cfb269d0fa");
        }
        if (TextUtils.isEmpty(str) || cVar2 == null || drawable == null) {
            return drawable;
        }
        if (str.contains("@3x.")) {
            i = 3;
        } else if (!str.contains("@2x.")) {
            return drawable;
        } else {
            i = 2;
        }
        boolean z = drawable instanceof BitmapDrawable;
        if (z || (drawable instanceof PicassoBitmapDrawable)) {
            if (z) {
                b = ((BitmapDrawable) drawable).getBitmap();
            } else {
                b = ((PicassoBitmapDrawable) drawable).b();
            }
            Bitmap bitmap = b;
            if (bitmap == null || bitmap.isRecycled()) {
                return drawable;
            }
            int i2 = cVar2.a * i;
            int height = bitmap.getHeight() - (cVar2.c * i);
            int i3 = cVar2.b * i;
            int width = bitmap.getWidth() - (cVar2.d * i);
            if (i3 >= width) {
                width = i3 + 1;
            }
            if (i2 >= height) {
                height = i2 + 1;
            }
            bitmap.setDensity(i * 160);
            Resources resources = cVar.b.getResources();
            Object[] objArr2 = {resources, bitmap, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(height), Integer.valueOf(width), null};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d064e86323684abad021762fdb95ab4b", RobustBitConfig.DEFAULT_VALUE)) {
                return (NinePatchDrawable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d064e86323684abad021762fdb95ab4b");
            }
            Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(height), Integer.valueOf(width)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b4d01052eb3d0dc16e86432ec0c42de4", RobustBitConfig.DEFAULT_VALUE)) {
                byteBuffer = (ByteBuffer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b4d01052eb3d0dc16e86432ec0c42de4");
            } else {
                ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
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
                order.putInt(i3);
                order.putInt(width);
                order.putInt(i2);
                order.putInt(height);
                order.putInt(1);
                order.putInt(1);
                order.putInt(1);
                order.putInt(1);
                order.putInt(1);
                order.putInt(1);
                order.putInt(1);
                order.putInt(1);
                order.putInt(1);
                byteBuffer = order;
            }
            return new NinePatchDrawable(resources, bitmap, byteBuffer.array(), new Rect(), null);
        }
        return drawable;
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65155d30770e8f95d51f20d50a60f655", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65155d30770e8f95d51f20d50a60f655");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.machpro.adapter.a
    public final void a(final a.b bVar, final a.InterfaceC1022a interfaceC1022a) {
        b.C0608b b;
        Object[] objArr = {bVar, interfaceC1022a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0712c61792e2162950509a0da02407da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0712c61792e2162950509a0da02407da");
            return;
        }
        Object[] objArr2 = {bVar, interfaceC1022a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3f9ef3d60fe116ff0f87beaaad3adac", RobustBitConfig.DEFAULT_VALUE)) {
            b = (b.C0608b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3f9ef3d60fe116ff0f87beaaad3adac");
        } else {
            Context context = this.b;
            if (bVar != null && bVar.b != null && bVar.b.getContext() != null) {
                context = bVar.b.getContext();
            }
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = context;
            switch (bVar.d) {
                case 1:
                    c.c = bVar.c;
                    break;
                case 2:
                    c = c.b(bVar.c);
                    break;
            }
            if (bVar.e != null && bVar.e.length == 2) {
                b = c.a(bVar.e[0], bVar.e[1]).b(bVar.k, bVar.l);
            } else {
                c.e = 0;
                b = c.b(-1, -1);
            }
            if (bVar.f != -1) {
                b.f = bVar.f;
            }
            if (bVar.c.contains("meituan.net/")) {
                b.g = true;
            }
            if (!a(bVar.c, bVar.m)) {
                MPBitmapTransform mPBitmapTransform = new MPBitmapTransform(bVar.j, bVar.k, bVar.l, new WeakReference(interfaceC1022a));
                mPBitmapTransform.setRoundRadii(bVar.i);
                mPBitmapTransform.setHasBlurRadius(bVar.o);
                mPBitmapTransform.setHasClipRect(bVar.n);
                mPBitmapTransform.setUrl(bVar.c);
                b = b.a(new BitmapTransformation[]{mPBitmapTransform}, new String[]{bVar.a()});
            }
        }
        b.C0608b c0608b = b;
        if (!TextUtils.isEmpty(bVar.g)) {
            Object[] objArr3 = {bVar, interfaceC1022a};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ec5434c811d3a5f8a022b6c3bb2fd69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ec5434c811d3a5f8a022b6c3bb2fd69");
            } else {
                Context context2 = this.b;
                if (bVar != null && bVar.b != null && bVar.b.getContext() != null) {
                    context2 = bVar.b.getContext();
                }
                b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c2.b = context2;
                if (!a(bVar.g, bVar.m)) {
                    MPBitmapTransform mPBitmapTransform2 = new MPBitmapTransform(bVar.j, bVar.k, bVar.l, new WeakReference(interfaceC1022a));
                    mPBitmapTransform2.setRoundRadii(bVar.i);
                    mPBitmapTransform2.setHasBlurRadius(bVar.o);
                    mPBitmapTransform2.setHasClipRect(bVar.n);
                    mPBitmapTransform2.setUrl(bVar.c);
                    c2 = c2.a(new BitmapTransformation[]{mPBitmapTransform2}, new String[]{bVar.a()});
                }
                c2.b(bVar.g).a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.platform.machpro.c.2
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr4 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "eac22133d347e2366bd83e6acd60a32e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "eac22133d347e2366bd83e6acd60a32e");
                            return;
                        }
                        super.a(drawable);
                        if (interfaceC1022a != null) {
                            if (bVar.m != null) {
                                drawable = c.a(c.this, bVar.g, bVar.m, drawable);
                            }
                            interfaceC1022a.b(new a(drawable));
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "932e86785be91bf39722236ff7d29df5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "932e86785be91bf39722236ff7d29df5");
                            return;
                        }
                        super.a();
                        if (interfaceC1022a != null) {
                            interfaceC1022a.b((com.sankuai.waimai.machpro.component.image.a) null);
                        }
                    }
                });
            }
        }
        c0608b.a(new com.sankuai.waimai.platform.machpro.a(bVar.c) { // from class: com.sankuai.waimai.platform.machpro.c.1
            public static ChangeQuickRedirect c;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
            public final void a(Drawable drawable) {
                Object[] objArr4 = {drawable};
                ChangeQuickRedirect changeQuickRedirect4 = c;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8729f1a3543bd1f5c7cee74a8f0c914e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8729f1a3543bd1f5c7cee74a8f0c914e");
                    return;
                }
                super.a(drawable);
                if (interfaceC1022a != null) {
                    if (bVar.m != null) {
                        drawable = c.a(c.this, bVar.c, bVar.m, drawable);
                    }
                    a aVar = new a(drawable);
                    aVar.b = this.b;
                    interfaceC1022a.a(aVar);
                }
            }

            @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
            public final void a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = c;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "82ac28cd94a61c639985c78b81a5b93d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "82ac28cd94a61c639985c78b81a5b93d");
                    return;
                }
                super.a();
                if (interfaceC1022a != null) {
                    interfaceC1022a.a();
                }
                if (TextUtils.isEmpty(bVar.h)) {
                    return;
                }
                final c cVar = c.this;
                final a.b bVar2 = bVar;
                final a.InterfaceC1022a interfaceC1022a2 = interfaceC1022a;
                Object[] objArr5 = {bVar2, interfaceC1022a2};
                ChangeQuickRedirect changeQuickRedirect5 = c.a;
                if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "30570d50487d34878054cb8858bc3f30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "30570d50487d34878054cb8858bc3f30");
                    return;
                }
                Context context3 = cVar.b;
                if (bVar2 != null && bVar2.b != null && bVar2.b.getContext() != null) {
                    context3 = bVar2.b.getContext();
                }
                b.C0608b c3 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c3.b = context3;
                if (!cVar.a(bVar2.h, bVar2.m)) {
                    MPBitmapTransform mPBitmapTransform3 = new MPBitmapTransform(bVar2.j, bVar2.k, bVar2.l, new WeakReference(interfaceC1022a2));
                    mPBitmapTransform3.setRoundRadii(bVar2.i);
                    mPBitmapTransform3.setHasBlurRadius(bVar2.o);
                    mPBitmapTransform3.setHasClipRect(bVar2.n);
                    mPBitmapTransform3.setUrl(bVar2.c);
                    c3 = c3.a(new BitmapTransformation[]{mPBitmapTransform3}, new String[]{bVar2.a()});
                }
                c3.b(bVar2.h).a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.platform.machpro.c.3
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr6 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0b467f963debce7d5a5dce68090c62ff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0b467f963debce7d5a5dce68090c62ff");
                            return;
                        }
                        super.a(drawable);
                        if (interfaceC1022a2 != null) {
                            if (bVar2.m != null) {
                                drawable = c.a(c.this, bVar2.h, bVar2.m, drawable);
                            }
                            interfaceC1022a2.c(new a(drawable));
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e860dd8ac1b78b48ce0f68c06ad44965", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e860dd8ac1b78b48ce0f68c06ad44965");
                            return;
                        }
                        super.a();
                        if (interfaceC1022a2 != null) {
                            interfaceC1022a2.c(null);
                        }
                    }
                });
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.machpro.component.image.a {
        public static ChangeQuickRedirect a;
        String b;
        private boolean c;
        private final Drawable d;

        @Override // com.sankuai.waimai.machpro.component.image.a
        public final String e() {
            return this.b;
        }

        public a(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c593c9d0d6ebebe03cac4699ddd26532", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c593c9d0d6ebebe03cac4699ddd26532");
                return;
            }
            this.d = drawable;
            if (drawable instanceof PicassoGifDrawable) {
                this.c = true;
            }
        }

        @Override // com.sankuai.waimai.machpro.component.image.a
        public final boolean a() {
            return this.c;
        }

        @Override // com.sankuai.waimai.machpro.component.image.a
        public final Drawable b() {
            return this.d;
        }

        @Override // com.sankuai.waimai.machpro.component.image.a
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6f584546f47dfc985f2ba92c3b46c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6f584546f47dfc985f2ba92c3b46c5");
            } else if (this.d instanceof PicassoGifDrawable) {
                ((PicassoGifDrawable) this.d).start();
            }
        }

        @Override // com.sankuai.waimai.machpro.component.image.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e6fdc13f5a6894c4d92a4b0ee55a886", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e6fdc13f5a6894c4d92a4b0ee55a886");
            } else if (this.d instanceof PicassoGifDrawable) {
                ((PicassoGifDrawable) this.d).stop();
            }
        }

        @Override // com.sankuai.waimai.machpro.component.image.a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d65a49cb0b9e07dd112f9d5e0ec066", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d65a49cb0b9e07dd112f9d5e0ec066");
            } else if (this.d instanceof PicassoGifDrawable) {
                ((PicassoGifDrawable) this.d).a(i);
            }
        }
    }

    boolean a(String str, a.c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c29703b91716c368bdb867d99f986db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c29703b91716c368bdb867d99f986db")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || cVar == null) {
            return false;
        }
        return str.contains("@3x.") || str.contains("@2x.");
    }
}
