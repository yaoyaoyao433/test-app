package com.dianping.titans.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ViewUtils {
    private static final String TAG = "v-util";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void showView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8368a3918edaa757d273139fe30f8b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8368a3918edaa757d273139fe30f8b81");
        } else if (view == null) {
        } else {
            view.setVisibility(0);
        }
    }

    public static void showView(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dfaa69525c5e9e84b1dba25ec33eda17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dfaa69525c5e9e84b1dba25ec33eda17");
        } else if (z) {
            showView(view);
        } else {
            hideView(view, z2);
        }
    }

    public static void hideView(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63179d6b0145e647329bfbf62a689cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63179d6b0145e647329bfbf62a689cde");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb448bc627d1f1ddb221be1a13668229", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb448bc627d1f1ddb221be1a13668229")).intValue() : context == null ? (int) f : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bitmap createBitmap(Context context, Bitmap bitmap, boolean z) {
        Object[] objArr = {context, bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68b73d16f3878fd7b36d771d32051b88", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68b73d16f3878fd7b36d771d32051b88");
        }
        if (z) {
            return resizeBitmap(context, bitmap, dip2px(context, 40.0f), dip2px(context, 40.0f), false);
        }
        return resizeBitmap(context, bitmap, dip2px(context, 40.0f), dip2px(context, 24.0f), false);
    }

    public static Bitmap resizeBitmap(Context context, Bitmap bitmap, int i, int i2, boolean z) {
        float f;
        Object[] objArr = {context, bitmap, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25486854aee46a3cf7ee932e237344de", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25486854aee46a3cf7ee932e237344de");
        }
        if (bitmap == null || context == null || i <= 0 || i2 <= 0 || i < i2) {
            return bitmap;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f2 = i2;
        if (height < f2 || height > i) {
            if (height < f2) {
                width = (width * f2) / height;
                f = f2;
            } else {
                f = i;
                if (height > f) {
                    width = (width * f) / height;
                } else {
                    f = height;
                }
            }
            int i3 = (int) width;
            int i4 = (int) f;
            if (i3 > 0 && i4 > 0) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i4, true);
                    if (z) {
                        bitmap.recycle();
                    }
                    return createScaledBitmap;
                } catch (OutOfMemoryError unused) {
                }
            }
            return bitmap;
        }
        return bitmap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static android.graphics.Bitmap downloadBitmap(java.lang.String r11, int r12) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 1
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.titans.utils.ViewUtils.changeQuickRedirect
            java.lang.String r10 = "c5f5e8eaaa134962a5701f595842b8c3"
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
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L72
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L72
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.lang.Throwable -> L72
            java.net.URLConnection r11 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapURLConnection(r11)     // Catch: java.lang.Throwable -> L72
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch: java.lang.Throwable -> L72
            if (r12 <= 0) goto L43
            r11.setConnectTimeout(r12)     // Catch: java.lang.Throwable -> L63
            goto L43
        L41:
            r12 = move-exception
            goto L67
        L43:
            r11.setDoInput(r8)     // Catch: java.lang.Throwable -> L63
            r11.setUseCaches(r8)     // Catch: java.lang.Throwable -> L63
            r11.connect()     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r12 = r11.getInputStream()     // Catch: java.lang.Throwable -> L63
            android.graphics.Bitmap r0 = com.sankuai.waimai.launcher.util.image.a.a(r12)     // Catch: java.lang.Throwable -> L74
            if (r12 == 0) goto L59
            r12.close()     // Catch: java.lang.Exception -> L7f
        L59:
            if (r11 == 0) goto L7f
            r11.disconnect()     // Catch: java.lang.Exception -> L7f
            goto L7f
        L5f:
            r0 = move-exception
            r2 = r12
            r12 = r0
            goto L67
        L63:
            r12 = r2
            goto L74
        L65:
            r12 = move-exception
            r11 = r2
        L67:
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.lang.Exception -> L71
        L6c:
            if (r11 == 0) goto L71
            r11.disconnect()     // Catch: java.lang.Exception -> L71
        L71:
            throw r12
        L72:
            r11 = r2
            r12 = r11
        L74:
            if (r12 == 0) goto L79
            r12.close()     // Catch: java.lang.Exception -> L7e
        L79:
            if (r11 == 0) goto L7e
            r11.disconnect()     // Catch: java.lang.Exception -> L7e
        L7e:
            r0 = r2
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.utils.ViewUtils.downloadBitmap(java.lang.String, int):android.graphics.Bitmap");
    }
}
