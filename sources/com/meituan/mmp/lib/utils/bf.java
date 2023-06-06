package com.meituan.mmp.lib.utils;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class bf {
    public static ChangeQuickRedirect a;

    public static boolean a(View view, boolean z) {
        Bitmap bitmap;
        Object[] objArr = {view, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06be82ea6c6a95f64b85ca9233d878c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06be82ea6c6a95f64b85ca9233d878c1")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        try {
            bitmap = b(view, false);
            if (bitmap == null) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                return false;
            }
            try {
                boolean a2 = a(bitmap);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                return a2;
            } catch (Throwable th) {
                th = th;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
    }

    private static boolean a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03de6d7b203f775f99341f8defac17d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03de6d7b203f775f99341f8defac17d1")).booleanValue();
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

    private static Bitmap b(View view, boolean z) {
        Bitmap bitmap;
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b93edce73241c0e3b7c47ff21de90232", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b93edce73241c0e3b7c47ff21de90232");
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
}
