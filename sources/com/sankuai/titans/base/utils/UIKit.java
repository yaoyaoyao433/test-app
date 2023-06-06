package com.sankuai.titans.base.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UIKit {
    private static final String TAG = "v-util";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void showView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c9d5c089c243327dab9b62af46848b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c9d5c089c243327dab9b62af46848b9");
        } else if (view == null) {
        } else {
            view.setVisibility(0);
        }
    }

    public static void hideView(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c63b59a5ad82fb103b6abda5d664367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c63b59a5ad82fb103b6abda5d664367");
        } else if (view == null) {
        } else {
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(4);
            }
        }
    }

    public static int dip2px(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53f5190ad32004c96302cd9f3aacc14d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53f5190ad32004c96302cd9f3aacc14d")).intValue() : context == null ? (int) f : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bitmap createBitmap(Context context, Bitmap bitmap, boolean z) {
        Object[] objArr = {context, bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0df95580e2e78a62197eb005dfae747", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0df95580e2e78a62197eb005dfae747");
        }
        if (bitmap != null && context != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float dip2px = dip2px(context, 40.0f);
            float dip2px2 = dip2px(context, 24.0f);
            if (z) {
                if (height == dip2px) {
                    return bitmap;
                }
                width = (width * dip2px) / height;
            } else if (height >= dip2px2 && height <= dip2px) {
                return bitmap;
            } else {
                if (height < dip2px2) {
                    width = (width * dip2px2) / height;
                    dip2px = dip2px2;
                } else if (height > dip2px) {
                    width = (width * dip2px) / height;
                } else {
                    dip2px = height;
                }
            }
            int i = (int) width;
            int i2 = (int) dip2px;
            if (i > 0 && i2 > 0) {
                try {
                    return Bitmap.createScaledBitmap(bitmap, i, i2, true);
                } catch (OutOfMemoryError e) {
                    Titans.serviceManager().getStatisticsService().reportClassError("UIKit", "createBitmap", e);
                }
            }
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #1 {Exception -> 0x007e, blocks: (B:30:0x007a, B:34:0x0082), top: B:40:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap downloadBitmap(java.lang.String r11, int r12) throws java.lang.Exception {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 1
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.titans.base.utils.UIKit.changeQuickRedirect
            java.lang.String r10 = "8eb6c5d4270d8ed0e782dc2bdab08268"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            return r11
        L25:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L2c
            return r2
        L2c:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L76
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L76
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.lang.Throwable -> L76
            java.net.URLConnection r11 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapURLConnection(r11)     // Catch: java.lang.Throwable -> L76
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch: java.lang.Throwable -> L76
            if (r12 <= 0) goto L43
            r11.setConnectTimeout(r12)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r12 = move-exception
            goto L78
        L43:
            r11.setDoInput(r8)     // Catch: java.lang.Throwable -> L41
            r11.setUseCaches(r8)     // Catch: java.lang.Throwable -> L41
            r11.connect()     // Catch: java.lang.Throwable -> L41
            java.io.InputStream r12 = r11.getInputStream()     // Catch: java.lang.Throwable -> L41
            android.graphics.Bitmap r0 = com.sankuai.waimai.launcher.util.image.a.a(r12)     // Catch: java.lang.Throwable -> L72
            if (r12 == 0) goto L5c
            r12.close()     // Catch: java.lang.Exception -> L5a
            goto L5c
        L5a:
            r11 = move-exception
            goto L62
        L5c:
            if (r11 == 0) goto L71
            r11.disconnect()     // Catch: java.lang.Exception -> L5a
            goto L71
        L62:
            com.sankuai.titans.protocol.services.IServiceManager r12 = com.sankuai.titans.base.Titans.serviceManager()
            com.sankuai.titans.protocol.services.IStatisticsService r12 = r12.getStatisticsService()
            java.lang.String r1 = "UIKit"
            java.lang.String r2 = "downloadBitmap"
            r12.reportClassError(r1, r2, r11)
        L71:
            return r0
        L72:
            r0 = move-exception
            r2 = r12
            r12 = r0
            goto L78
        L76:
            r12 = move-exception
            r11 = r2
        L78:
            if (r2 == 0) goto L80
            r2.close()     // Catch: java.lang.Exception -> L7e
            goto L80
        L7e:
            r11 = move-exception
            goto L86
        L80:
            if (r11 == 0) goto L95
            r11.disconnect()     // Catch: java.lang.Exception -> L7e
            goto L95
        L86:
            com.sankuai.titans.protocol.services.IServiceManager r0 = com.sankuai.titans.base.Titans.serviceManager()
            com.sankuai.titans.protocol.services.IStatisticsService r0 = r0.getStatisticsService()
            java.lang.String r1 = "UIKit"
            java.lang.String r2 = "downloadBitmap"
            r0.reportClassError(r1, r2, r11)
        L95:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.utils.UIKit.downloadBitmap(java.lang.String, int):android.graphics.Bitmap");
    }

    public static int getRGBAColor(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bca1eb78e2300739cc2c3b99c16dedd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bca1eb78e2300739cc2c3b99c16dedd5")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return getRGBAColor(str);
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("strColor", str);
            Titans.serviceManager().getStatisticsService().reportClassError("UIKit", "getRGBAColor", e, hashMap);
            return i;
        }
    }

    public static int getRGBAColor(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8635bac35d78034b5c4533a77e66f70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8635bac35d78034b5c4533a77e66f70")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new Exception("invalid color");
        }
        try {
            if (str.startsWith("#")) {
                str = str.substring(1);
            }
            int length = str.length();
            if (length == 4 || length == 3) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < length; i++) {
                    stringBuffer.append(str.charAt(i));
                    stringBuffer.append(str.charAt(i));
                }
                str = stringBuffer.toString();
            }
            if (str.length() == 8) {
                return (Integer.parseInt(str.substring(6), 16) << 24) + Integer.parseInt(str.substring(0, 6), 16);
            }
            if (str.length() == 6) {
                return (-16777216) + Integer.parseInt(str, 16);
            }
            throw new Exception("invalid color");
        } catch (Exception unused) {
            throw new Exception("invalid color");
        }
    }
}
