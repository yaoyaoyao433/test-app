package com.sankuai.meituan.mapsdk.maps.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.a;
import com.sankuai.meituan.mapsdk.mapcore.utils.g;
import com.sankuai.meituan.mapsdk.maps.DensityUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class BitmapDescriptorFactory {
    private static final AtomicLong a = new AtomicLong(0);
    public static ChangeQuickRedirect changeQuickRedirect;

    public static BitmapDescriptor fromResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afbfcc6e57c6669740e59f8265237aa9", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afbfcc6e57c6669740e59f8265237aa9");
        }
        try {
            Context a2 = a.a();
            if (a2 == null) {
                return null;
            }
            return fromBitmap(com.sankuai.waimai.launcher.util.image.a.a(a2.getResources().openRawResource(i)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromResource(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8ad555967630428e539571d4d61e1f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8ad555967630428e539571d4d61e1f3");
        }
        if (context == null) {
            return null;
        }
        try {
            return fromBitmap(com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), i));
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromResource(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1736d35d37694ac9825bd9bf7de25e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1736d35d37694ac9825bd9bf7de25e7");
        }
        try {
            Context a2 = a.a();
            Bitmap a3 = com.sankuai.waimai.launcher.util.image.a.a(a2.getResources().openRawResource(i));
            if (z) {
                a3.setDensity(DensityUtils.getDensityDpi(a2));
            }
            if (a2 == null) {
                return null;
            }
            return fromBitmap(a3);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromResourceWithDpi(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e35271323f3fd1334209c40d0b42117c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e35271323f3fd1334209c40d0b42117c");
        }
        try {
            Context a2 = a.a();
            Bitmap a3 = com.sankuai.waimai.launcher.util.image.a.a(a2.getResources().openRawResource(i));
            a3.setDensity(DensityUtils.getDensityDpi(a2));
            if (a2 == null) {
                return null;
            }
            return fromBitmap(a3);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96a4606459e4d04877843fde33a47e10", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96a4606459e4d04877843fde33a47e10");
        }
        try {
            return fromBitmap(g.a(view));
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromView(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42683740435c429f55ad2a93c52a5ce3", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42683740435c429f55ad2a93c52a5ce3");
        }
        try {
            Bitmap a2 = g.a(view);
            if (z) {
                a2.setDensity(DensityUtils.getDensityDpi(a.a()));
            }
            return fromBitmap(a2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromViewWithDpi(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af2e7811e8597798023870dbfc1b7ffd", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af2e7811e8597798023870dbfc1b7ffd");
        }
        try {
            Bitmap a2 = g.a(view);
            a2.setDensity(DensityUtils.getDensityDpi(a.a()));
            return fromBitmap(a2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromViewLayout(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67eee0a9dea594b2a2ef678170fd96fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67eee0a9dea594b2a2ef678170fd96fb");
        }
        if (view == null) {
            return null;
        }
        try {
            Context context = view.getContext();
            if (context != null) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(view);
                frameLayout.destroyDrawingCache();
                return fromBitmap(g.a(frameLayout));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ff7bde0f1dcd19863ba8b95adfff437", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ff7bde0f1dcd19863ba8b95adfff437");
        }
        try {
            return fromBitmap(com.sankuai.waimai.launcher.util.image.a.a(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        InputStream wrapOpenStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f32912e146575cce6b64440585e1fa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f32912e146575cce6b64440585e1fa6");
        }
        try {
            if (a.a() != null) {
                wrapOpenStream = a.a().getAssets().open(str);
            } else {
                wrapOpenStream = HttpURLWrapper.wrapOpenStream(BitmapDescriptorFactory.class.getResource("/assets/" + str));
            }
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(wrapOpenStream);
            wrapOpenStream.close();
            return fromBitmap(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BitmapDescriptor fromFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06d17599dc22fc3667fee787f68a805b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06d17599dc22fc3667fee787f68a805b");
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(fileInputStream);
            fileInputStream.close();
            return fromBitmap(a2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor defaultMarker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "21db2eb0c7437ea4d219a8ee7ef14604", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "21db2eb0c7437ea4d219a8ee7ef14604") : fromResource(R.drawable.marker_default);
    }

    public static BitmapDescriptor fromBitmap(@Nullable Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f5954b9bf414d59ba17e5a4f2ade1a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f5954b9bf414d59ba17e5a4f2ade1a5");
        }
        String str = "meituanmapsdk_" + a.addAndGet(1L);
        if (bitmap == null) {
            return null;
        }
        return new BitmapDescriptor(str, bitmap);
    }

    public static BitmapDescriptor fromBitmap(String str, Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "498f60bfa83711298b326e8a8fb8f68f", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "498f60bfa83711298b326e8a8fb8f68f");
        }
        if (bitmap == null) {
            return null;
        }
        return new BitmapDescriptor(str, bitmap);
    }

    public static BitmapDescriptor fromBitmapDescriptor(BitmapDescriptor bitmapDescriptor, Bitmap bitmap) {
        Object[] objArr = {bitmapDescriptor, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc6d286558aea2a7283794b686b38b10", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc6d286558aea2a7283794b686b38b10");
        }
        if (bitmapDescriptor == null || bitmap == null) {
            return null;
        }
        return new BitmapDescriptor(bitmapDescriptor.getId(), bitmap);
    }

    @Deprecated
    public static BitmapDescriptor fromBitmap(Bitmap bitmap, boolean z) {
        Object[] objArr = {bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09424e1e96e79619626bc1866dd0ea7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09424e1e96e79619626bc1866dd0ea7b");
        }
        if (bitmap == null || a.a() == null) {
            return null;
        }
        if (z) {
            bitmap.setDensity(DensityUtils.getDensityDpi(a.a()));
        }
        String str = "meituanmapsdk_" + a.addAndGet(1L);
        if (bitmap == null) {
            return null;
        }
        return new BitmapDescriptor(str, bitmap);
    }
}
