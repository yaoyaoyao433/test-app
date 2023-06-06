package com.meituan.android.mrn.monitor;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.o;
import com.facebook.react.views.image.RCTRoundImageView;
import com.meituan.android.mrn.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public int a = 0;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
    }

    @SuppressLint({"NewApi"})
    private static void a(ImageView imageView, a aVar, boolean z, float f, float f2) {
        Object[] objArr = {imageView, aVar, (byte) 0, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaf7dca534d9c323e4521268b49ad214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaf7dca534d9c323e4521268b49ad214");
        } else if (imageView == null) {
        } else {
            aVar.a++;
            Bitmap a2 = com.facebook.react.a.a(imageView.getDrawable(), false);
            if (a2 == null) {
                return;
            }
            int width = a2.getWidth();
            int height = a2.getHeight();
            int width2 = imageView.getWidth();
            int height2 = imageView.getHeight();
            int allocationByteCount = a2.getAllocationByteCount();
            aVar.b += allocationByteCount;
            float f3 = width;
            float f4 = width2;
            if (f3 > f4 * f) {
                float f5 = height;
                float f6 = height2;
                if (f5 > f6 * f) {
                    aVar.c++;
                    if (imageView instanceof RCTRoundImageView) {
                        com.facebook.common.logging.a.b("ImageMemoryMonitor", String.format("图片超出了图片框的尺寸的%s倍: %s", Float.valueOf(f), ((RCTRoundImageView) imageView).getImageSource().j));
                    }
                    float min = Math.min(f5 / f6, f3 / f4) / f;
                    aVar.d = (int) (aVar.d + ((1.0f - (((f5 / min) * (f3 / min)) / (height * width))) * allocationByteCount));
                }
            }
            if (aj.a(imageView, f2)) {
                aVar.e++;
                aVar.f += allocationByteCount;
            }
        }
    }

    public static void a(com.meituan.android.mrn.engine.k kVar) {
        ReactContext currentReactContext;
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ed682f637ec0334591f2adfa4f62b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ed682f637ec0334591f2adfa4f62b1c");
        } else if (kVar != null && kVar.k != null && kVar.b != null && kVar.b != null && (currentReactContext = kVar.b.getCurrentReactContext()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            a aVar = new a();
            Collection<RCTRoundImageView> b = com.facebook.react.a.b(currentReactContext);
            com.meituan.android.mrn.config.k.a();
            com.meituan.android.mrn.config.k.a();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (RCTRoundImageView rCTRoundImageView : b) {
                a(rCTRoundImageView, aVar, false, 2.0f, 1.0f);
                com.facebook.react.views.image.c imageSource = rCTRoundImageView.getImageSource();
                if (imageSource != null) {
                    if (rCTRoundImageView.getTransformedSource() != null) {
                        i++;
                        i2++;
                    } else if (o.a(imageSource.a)) {
                        i2++;
                    }
                }
                if (rCTRoundImageView.isFailedToLoadTransformedSource()) {
                    i3++;
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("totalCount", aVar.a);
                jSONObject.put("overflowImageCount", aVar.c);
                jSONObject.put("overflowImageSize", aVar.d / 1024);
                jSONObject.put("leaveScreenImageCount", aVar.e);
                jSONObject.put("leaveScreenImageSize", aVar.f / 1024);
                jSONObject.put("transformToVenusUrlCount", i2);
                jSONObject.put("transformToVenusUrlByMRNCount", i);
                jSONObject.put("failedToLoadTransformedSourceCount", i3);
            } catch (JSONException unused) {
            }
            g a2 = g.a().c(kVar.k).d(kVar.i != null ? kVar.i.f : "Unknown").a("page_count", String.valueOf(kVar.f()));
            a2.d = jSONObject.toString();
            a2.a("MRNImageMemoryUsage", aVar.b / 1024);
            com.facebook.common.logging.a.b("ImageMemoryMonitor", String.format("MRN大图监控耗费时间: %s ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        }
    }
}
