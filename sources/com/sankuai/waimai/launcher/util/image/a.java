package com.sankuai.waimai.launcher.util.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.manipulator.annotation.CallSiteReplacement;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
import java.io.InputStream;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static int b = 1620;
    public static int c = 2880;
    private static boolean d = com.sankuai.meituan.takeoutnew.a.f;

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Object[] objArr = {inputStream, null, options};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a875de1a0f6737cbe0b8cdcb4d858f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a875de1a0f6737cbe0b8cdcb4d858f8");
        }
        if (d) {
            if (options == null) {
                return BitmapFactory.decodeStream(inputStream, null, null);
            }
            if (options.inJustDecodeBounds) {
                return BitmapFactory.decodeStream(inputStream, null, options);
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            a(decodeStream);
            return decodeStream;
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "737c14f66185d5bf5df5389009dc1672", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "737c14f66185d5bf5df5389009dc1672");
        }
        if (!d) {
            return BitmapFactory.decodeStream(inputStream);
        }
        return a(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), options};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd6998d9d4830bc8da4dfad49f667783", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd6998d9d4830bc8da4dfad49f667783");
        }
        if (d) {
            if (options == null) {
                return BitmapFactory.decodeByteArray(bArr, i, i2, null);
            }
            if (options.inJustDecodeBounds) {
                return BitmapFactory.decodeByteArray(bArr, i, i2, options);
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            a(decodeByteArray);
            return decodeByteArray;
        }
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e69236e9828b1b1dd4c34fa11d0a8b6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e69236e9828b1b1dd4c34fa11d0a8b6c");
        }
        if (!d) {
            return BitmapFactory.decodeByteArray(bArr, 0, i2);
        }
        return a(bArr, 0, i2, null);
    }

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(String str, BitmapFactory.Options options) {
        Object[] objArr = {str, options};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b7648d212763c9f85f9209281d5aa87", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b7648d212763c9f85f9209281d5aa87");
        }
        if (d) {
            if (options == null) {
                return BitmapFactory.decodeFile(str, null);
            }
            if (options.inJustDecodeBounds) {
                return BitmapFactory.decodeFile(str, options);
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            a(decodeFile);
            return decodeFile;
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ffafb3bfb800ef2424bf9bd3a0ed52d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ffafb3bfb800ef2424bf9bd3a0ed52d");
        }
        if (!d) {
            return BitmapFactory.decodeFile(str);
        }
        return a(str, (BitmapFactory.Options) null);
    }

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(Resources resources, int i, BitmapFactory.Options options) {
        Object[] objArr = {resources, Integer.valueOf(i), options};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9465ead0e2f8f89b3949aaeab1581c68", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9465ead0e2f8f89b3949aaeab1581c68");
        }
        if (d) {
            if (options == null) {
                return BitmapFactory.decodeResource(resources, i, null);
            }
            if (options.inJustDecodeBounds) {
                return BitmapFactory.decodeResource(resources, i, options);
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
            a(decodeResource);
            return decodeResource;
        }
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @CallSiteReplacement(targetClass = "android.graphics.BitmapFactory")
    public static Bitmap a(Resources resources, int i) {
        Object[] objArr = {resources, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5a5bf321f5c65693641b4eeb65400d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5a5bf321f5c65693641b4eeb65400d5");
        }
        if (!d) {
            return BitmapFactory.decodeResource(resources, i);
        }
        return a(resources, i, (BitmapFactory.Options) null);
    }

    private static void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d74d2b4088c0046522eeb5dec6ce17a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d74d2b4088c0046522eeb5dec6ce17a5");
        } else if (bitmap == null) {
        } else {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width >= b || height >= c) {
                Sniffer.smell("waimai_android", "com.sankuai.meituan.takeoutnew.util.image.BitmapFactoryGuard", "", "大图监控", "bitmap size=[" + width + Constants.GestureMoveEvent.KEY_X + height + "]/ limit=[" + b + Constants.GestureMoveEvent.KEY_X + c + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "760a023c1a1ee266fe8e4f0e09d1a48c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "760a023c1a1ee266fe8e4f0e09d1a48c");
            return;
        }
        DisplayMetrics displayMetrics = com.meituan.android.singleton.b.a.getResources().getDisplayMetrics();
        c = (int) (displayMetrics.heightPixels * 1.5f);
        b = (int) (displayMetrics.widthPixels * 1.5f);
        d = true;
    }
}
