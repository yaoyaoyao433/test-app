package com.sankuai.waimai.launcher.util.aop;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.facebook.react.views.image.RCTRoundImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(RCTRoundImageView rCTRoundImageView) {
        Object[] objArr = {rCTRoundImageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec92857b424592d1d2c100893440edb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec92857b424592d1d2c100893440edb3");
            return;
        }
        com.facebook.react.views.image.c imageSource = rCTRoundImageView.getImageSource();
        if (!a(imageSource) || rCTRoundImageView.getWidth() <= 0 || rCTRoundImageView.getHeight() <= 0) {
            return;
        }
        try {
            Uri uri = imageSource.a;
            if (uri == null || !a(uri.getHost())) {
                return;
            }
            String lastPathSegment = uri.getLastPathSegment();
            boolean z = !lastPathSegment.contains(".webp");
            String a2 = a(uri.getPathSegments().get(0), lastPathSegment, rCTRoundImageView.getWidth(), rCTRoundImageView.getHeight());
            if (z || !a2.isEmpty()) {
                Uri.Builder buildUpon = uri.buildUpon();
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(uri.getPath());
                sb.append(z ? ".webp" : "");
                String uri2 = buildUpon.path(sb.toString()).build().toString();
                imageSource.a(uri2);
                com.sankuai.waimai.foundation.utils.log.a.b("WMRNCdnResize", "append cdn param, %s => %s", uri, uri2);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    @SuppressLint({"DefaultLocale"})
    private static String a(String str, String str2, int i, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8d85a92a8924e417d6fe7b9d8c9efa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8d85a92a8924e417d6fe7b9d8c9efa3");
        }
        return str.matches("^\\d+(\\.\\d+){1,2}(\\.[ao])?$") || str2.matches(".*@.*\\d+[wh].*") ? "" : String.format("/%d.%d.85", Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2656073d69e5df1878aaa04721bd1188", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2656073d69e5df1878aaa04721bd1188")).booleanValue();
        }
        if (str != null) {
            return (str.length() >= 14 && str.endsWith(".meituan.net") && ((str.charAt(0) == 'p' && Character.isDigit(str.charAt(1))) || str.startsWith("img."))) || str.equals("pic.meituan.com");
        }
        return false;
    }

    public static boolean a(com.facebook.react.views.image.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37730f54368694cb0ed54c4c0e98a89f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37730f54368694cb0ed54c4c0e98a89f")).booleanValue() : (cVar == null || cVar.g || cVar.h) ? false : true;
    }
}
