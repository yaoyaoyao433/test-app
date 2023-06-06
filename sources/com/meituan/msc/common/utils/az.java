package com.meituan.msc.common.utils;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.SnareTestManager;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class az {
    public static ChangeQuickRedirect a;

    public static boolean a(View view, boolean z, String str) {
        Bitmap b;
        Object[] objArr = {view, (byte) 0, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        Bitmap bitmap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52d6371c88ae4c4b70146558b03c605a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52d6371c88ae4c4b70146558b03c605a")).booleanValue();
        }
        PerfTrace.begin("WhiteScreenCheck");
        try {
            try {
                if (view != null) {
                    if (MSCHornRollbackConfig.d().c().isRollbackWhiteScreenCheckChange) {
                        b = a(view, false);
                    } else {
                        if (view.getWidth() > 0 && view.getHeight() > 0) {
                            b = b(view, false);
                        }
                        a("view wh <= 0", true, str);
                    }
                    Bitmap bitmap2 = b;
                    if (bitmap2 == null) {
                        a("bitmap is null", true, str);
                        PerfTrace.end("WhiteScreenCheck");
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        return false;
                    }
                    boolean a2 = a(bitmap2);
                    PerfTrace.end("WhiteScreenCheck");
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    return a2;
                }
                a("view is null", true, str);
                PerfTrace.end("WhiteScreenCheck");
                return false;
            } catch (OutOfMemoryError e) {
                com.meituan.msc.modules.reporter.g.a("WhiteScreenViewCheck OOM", e);
                a(SnareTestManager.TAG_OOM, true, str);
                PerfTrace.end("WhiteScreenCheck");
                if (0 != 0) {
                    bitmap.recycle();
                }
                return false;
            }
        } catch (Throwable th) {
            PerfTrace.end("WhiteScreenCheck");
            if (0 != 0) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public static void a(String str, boolean z, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2375060a1719ac5b1f402575e06c9b79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2375060a1719ac5b1f402575e06c9b79");
        } else if (MSCHornRollbackConfig.d().c().isRollbackWhiteScreenCheckCancelReport) {
        } else {
            new MSCReporter().b("msc.page.white.screen.cancel.count").a("reason", str).a("isReportDefault", Boolean.valueOf(z)).a("pagePath", str2).c();
        }
    }

    private static boolean a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70b4fc01accc1b10672930012e35d373", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70b4fc01accc1b10672930012e35d373")).booleanValue();
        }
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (i != iArr[i2]) {
                return false;
            }
        }
        bitmap.recycle();
        return true;
    }

    private static Bitmap a(View view, boolean z) {
        Bitmap bitmap;
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94374ff29e9811a739089b7b45d29125", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94374ff29e9811a739089b7b45d29125");
        }
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        if (z) {
            try {
                if (view instanceof ViewGroup) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(view);
                    while (!linkedList.isEmpty()) {
                        View view2 = (View) linkedList.removeLast();
                        if (view2 instanceof TextureView) {
                            bitmap = ((TextureView) view2).getBitmap();
                            break;
                        } else if (view2 instanceof ViewGroup) {
                            for (int i = 0; i < ((ViewGroup) view2).getChildCount(); i++) {
                                linkedList.add(((ViewGroup) view2).getChildAt(i));
                            }
                        }
                    }
                }
            } catch (OutOfMemoryError unused) {
                view.setDrawingCacheEnabled(false);
                view.destroyDrawingCache();
                return null;
            } catch (Throwable th) {
                view.setDrawingCacheEnabled(false);
                view.destroyDrawingCache();
                throw th;
            }
        }
        bitmap = null;
        if (bitmap == null) {
            bitmap = view.getDrawingCache();
        }
        Bitmap createScaledBitmap = bitmap != null ? Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, false) : null;
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createScaledBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap b(android.view.View r13, boolean r14) {
        /*
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r10 = 1
            r8[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.msc.common.utils.az.a
            java.lang.String r12 = "ef61753d0fb347a21336e13b30df8c5e"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r11, r10, r12)
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            return r13
        L25:
            if (r13 != 0) goto L28
            return r2
        L28:
            if (r14 == 0) goto L6c
            boolean r14 = r13 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            if (r14 == 0) goto L6c
            java.util.LinkedList r14 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            r14.<init>()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            r14.add(r13)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
        L36:
            boolean r1 = r14.isEmpty()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            if (r1 != 0) goto L6c
            java.lang.Object r1 = r14.removeLast()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            boolean r3 = r1 instanceof android.view.TextureView     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            if (r3 == 0) goto L4d
            android.view.TextureView r1 = (android.view.TextureView) r1     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            android.graphics.Bitmap r14 = r1.getBitmap()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            goto L6d
        L4d:
            boolean r3 = r1 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            if (r3 == 0) goto L36
            r3 = 0
        L52:
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            int r4 = r4.getChildCount()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            if (r3 >= r4) goto L36
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            android.view.View r4 = r4.getChildAt(r3)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            r14.add(r4)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6a
            int r3 = r3 + 1
            goto L52
        L68:
            r13 = move-exception
            goto La2
        L6a:
            r14 = r2
            goto La8
        L6c:
            r14 = r2
        L6d:
            if (r14 != 0) goto L91
            int r1 = r13.getWidth()     // Catch: java.lang.Throwable -> L8c java.lang.OutOfMemoryError -> L8f
            int r3 = r13.getHeight()     // Catch: java.lang.Throwable -> L8c java.lang.OutOfMemoryError -> L8f
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L8c java.lang.OutOfMemoryError -> L8f
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r3, r4)     // Catch: java.lang.Throwable -> L8c java.lang.OutOfMemoryError -> L8f
            android.graphics.Canvas r14 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L87 java.lang.OutOfMemoryError -> L8a
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L87 java.lang.OutOfMemoryError -> L8a
            r13.draw(r14)     // Catch: java.lang.Throwable -> L87 java.lang.OutOfMemoryError -> L8a
            r14 = r1
            goto L91
        L87:
            r13 = move-exception
            r2 = r1
            goto La2
        L8a:
            r14 = r1
            goto La8
        L8c:
            r13 = move-exception
            r2 = r14
            goto La2
        L8f:
            goto La8
        L91:
            if (r14 == 0) goto Lae
            int r13 = r14.getWidth()     // Catch: java.lang.Throwable -> L8c java.lang.OutOfMemoryError -> L8f
            int r13 = r13 / r0
            int r1 = r14.getHeight()     // Catch: java.lang.Throwable -> L8c java.lang.OutOfMemoryError -> L8f
            int r1 = r1 / r0
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createScaledBitmap(r14, r13, r1, r9)     // Catch: java.lang.Throwable -> L8c java.lang.OutOfMemoryError -> L8f
            goto Laf
        La2:
            if (r2 == 0) goto La7
            r2.recycle()
        La7:
            throw r13
        La8:
            if (r14 == 0) goto Lad
            r14.recycle()
        Lad:
            return r2
        Lae:
            r13 = r2
        Laf:
            if (r14 == 0) goto Lb4
            r14.recycle()
        Lb4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.common.utils.az.b(android.view.View, boolean):android.graphics.Bitmap");
    }
}
