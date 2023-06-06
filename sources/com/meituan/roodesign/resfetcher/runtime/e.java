package com.meituan.roodesign.resfetcher.runtime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.dianping.picasso.PicassoUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.plugin.RooResourceProvider;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static Map<String, Map<String, List<com.meituan.roodesign.resfetcher.plugin.a>>> b = new HashMap();

    public static void a(ImageView imageView, String str, String str2) {
        Object[] objArr = {imageView, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e410fbac1f424b51e54a123a30ad3866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e410fbac1f424b51e54a123a30ad3866");
        } else if (imageView.isInEditMode()) {
            imageView.setImageDrawable(a(imageView.getContext(), str, str2, 0, 0));
        }
    }

    public static void a(View view, String str, String str2, int i, int i2) {
        Object[] objArr = {view, str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "363ba985e46ab47f16104e7f10e95238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "363ba985e46ab47f16104e7f10e95238");
        } else if (view.isInEditMode()) {
            view.setBackground(a(view.getContext(), str, str2, i, i2));
        }
    }

    public static Drawable a(Context context, String str, String str2, int i, int i2) {
        com.meituan.roodesign.resfetcher.plugin.a a2;
        Drawable a3;
        Object[] objArr = {context, str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Drawable drawable = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d312f5f1f083f52d4b253b453f9a6b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d312f5f1f083f52d4b253b453f9a6b8");
        }
        int identifier = context.getResources().getIdentifier(str2, PicassoUtils.DEF_TYPE, context.getPackageName());
        try {
            if (i2 != 0 || i != 0) {
                a3 = com.meituan.roodesign.resfetcher.utils.a.a(context.getResources(), com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), identifier), i, i2, str2);
            } else {
                a3 = ResourcesCompat.getDrawable(context.getResources(), identifier, null);
            }
            drawable = a3;
            return drawable;
        } catch (Exception unused) {
            if (TextUtils.isEmpty(str)) {
                return drawable;
            }
            Map<String, List<com.meituan.roodesign.resfetcher.plugin.a>> map = b.get(str);
            if (map == null) {
                map = a(context, str);
            }
            if (map == null || (a2 = d.a(context, map, str2)) == null) {
                return drawable;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(a2.b).openConnection());
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
                Bitmap a4 = com.sankuai.waimai.launcher.util.image.a.a(httpURLConnection.getInputStream());
                a4.setDensity(a2.e);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), a4);
                bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics().densityDpi);
                return (i2 == 0 && i == 0) ? bitmapDrawable : com.meituan.roodesign.resfetcher.utils.a.a(context.getResources(), bitmapDrawable.getBitmap(), i, i2, str2);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Map<String, List<com.meituan.roodesign.resfetcher.plugin.a>> a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96f57226b1b057ec2de658870a9ec798", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96f57226b1b057ec2de658870a9ec798");
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.putAll(((RooResourceProvider) Class.forName("com.meituan.roodesign.generate.RooResourcesMap_" + str).newInstance()).getResourceMap());
            b.put(str, hashMap);
            return hashMap;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
