package com.meituan.roodesign.resfetcher.runtime;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.plugin.RooResourceProvider;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static Map<String, List<com.meituan.roodesign.resfetcher.plugin.a>> b = null;
    private static boolean c = false;

    @MainThread
    public static void a(final ImageView imageView, String str, int i, int i2) {
        Object[] objArr = {imageView, str, 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17ad9e1041d2a02b0188ab9cd33d7dc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17ad9e1041d2a02b0188ab9cd33d7dc6");
        } else if (imageView != null) {
            b(imageView.getContext(), str, new b() { // from class: com.meituan.roodesign.resfetcher.runtime.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.roodesign.resfetcher.runtime.b
                public final void a(Drawable drawable, boolean z) {
                    Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c0b8ba13b4403571b316076d0d63144", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c0b8ba13b4403571b316076d0d63144");
                    } else {
                        imageView.setImageDrawable(drawable);
                    }
                }
            });
        }
    }

    @MainThread
    public static void a(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "011c89e4bfda90d8d966cdcf7fab5274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "011c89e4bfda90d8d966cdcf7fab5274");
        } else {
            a(imageView, str, 0, 0);
        }
    }

    @MainThread
    public static void a(final View view, final String str, int i, int i2, final int i3, final int i4) {
        Drawable bitmapDrawable;
        Object[] objArr = {view, str, 0, 0, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60d9440aeb67a98227cf380692a54c78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60d9440aeb67a98227cf380692a54c78");
        } else if (view != null) {
            Context context = view.getContext();
            b bVar = new b() { // from class: com.meituan.roodesign.resfetcher.runtime.c.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.roodesign.resfetcher.runtime.b
                public final void a(Drawable drawable, boolean z) {
                    Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e391dc39c746a88d2a936ebb117b6f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e391dc39c746a88d2a936ebb117b6f3");
                        return;
                    }
                    if (!z && (i3 != 0 || i4 != 0)) {
                        drawable = com.meituan.roodesign.resfetcher.utils.a.a(view.getResources(), ((BitmapDrawable) drawable).getBitmap(), i3, i4, str);
                    }
                    view.setBackground(drawable);
                }
            };
            Object[] objArr2 = {context, str, Integer.valueOf(i3), Integer.valueOf(i4), bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d5b0e8154dfaa6e80d9c42552000f900", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d5b0e8154dfaa6e80d9c42552000f900");
            } else if (context != null) {
                a(context);
                int identifier = context.getResources().getIdentifier(str, PicassoUtils.DEF_TYPE, context.getPackageName());
                if (identifier != 0) {
                    if (i3 != 0 || i4 != 0) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        bitmapDrawable = new BitmapDrawable(context.getResources(), com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), identifier, options));
                    } else {
                        bitmapDrawable = context.getDrawable(identifier);
                    }
                    bVar.a(bitmapDrawable, false);
                    return;
                }
                c(context, str, bVar);
            }
        }
    }

    @MainThread
    public static void a(Context context, String str, b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db69ef8cceaaee821c15ac6b03607907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db69ef8cceaaee821c15ac6b03607907");
            return;
        }
        Object[] objArr2 = {context, str, 0, 0, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a964ab3e1b18f41955ca0735864f7a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a964ab3e1b18f41955ca0735864f7a68");
        } else {
            b(context, str, bVar);
        }
    }

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0bd2ecc297b5655262b98052b039a7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0bd2ecc297b5655262b98052b039a7c");
        }
        if (b == null) {
            a();
        }
        com.meituan.roodesign.resfetcher.plugin.a a2 = d.a(context, b, str);
        if (a2 != null) {
            return a2.b;
        }
        return null;
    }

    private static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e68b88975141efd8838e200edfb7b8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e68b88975141efd8838e200edfb7b8ef");
            return;
        }
        List<RooResourceProvider> a2 = com.sankuai.waimai.router.a.a(RooResourceProvider.class);
        b = new ConcurrentHashMap();
        for (RooResourceProvider rooResourceProvider : a2) {
            b.putAll(rooResourceProvider.getResourceMap());
        }
    }

    private static void b(Context context, String str, b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3159f16fb1956bd9af3bcb97e58b34f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3159f16fb1956bd9af3bcb97e58b34f");
        } else if (context != null) {
            a(context);
            int identifier = context.getResources().getIdentifier(str, PicassoUtils.DEF_TYPE, context.getPackageName());
            if (identifier != 0) {
                bVar.a(context.getDrawable(identifier), false);
            } else {
                c(context, str, bVar);
            }
        }
    }

    private static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa99c9c4a9c233e7a112f018ba49f326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa99c9c4a9c233e7a112f018ba49f326");
        } else if (c) {
        } else {
            com.sankuai.waimai.router.a.a(context);
            c = true;
        }
    }

    private static void c(Context context, String str, b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e76a9e473e7e06b1ef649d218093dbce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e76a9e473e7e06b1ef649d218093dbce");
            return;
        }
        if (b == null) {
            a();
        }
        com.meituan.roodesign.resfetcher.plugin.a a2 = d.a(context, b, str);
        if (a2 != null) {
            String str2 = a2.b;
            int a3 = d.a(context, a2.c, a2.e);
            int a4 = d.a(context, a2.d, a2.e);
            if (bVar != null) {
                bVar.a(new a(a3, a4), true);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            f fVar = new f(context, a2, bVar);
            RequestCreator i = Picasso.g(context).d(str2).i();
            if (!b(context)) {
                i.o = false;
            }
            i.a(fVar);
        }
    }

    private static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f24abd1a1df07bd73c2b6ce2adabba7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f24abd1a1df07bd73c2b6ce2adabba7")).booleanValue();
        }
        String packageName = context.getApplicationContext().getPackageName();
        return packageName != null && packageName.startsWith("com.dianping.v1");
    }
}
