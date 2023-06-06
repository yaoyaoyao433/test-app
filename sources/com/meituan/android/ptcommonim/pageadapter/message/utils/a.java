package com.meituan.android.ptcommonim.pageadapter.message.utils;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.RequiresApi;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static int[] b = new int[2];

    public static void a(com.meituan.android.ptcommonim.pageadapter.message.item.a aVar) {
        View a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e9cb715f19ba8f0e01d18a4b316db46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e9cb715f19ba8f0e01d18a4b316db46");
        } else if (aVar == null || (a2 = aVar.a()) == null) {
        } else {
            aVar.f = true;
            Object[] objArr2 = {aVar, a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8b24ac084076fc3c22b2275b572d9895", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8b24ac084076fc3c22b2275b572d9895");
                return;
            }
            RunnableC0357a runnableC0357a = new RunnableC0357a(aVar, a2);
            aVar.g = runnableC0357a;
            a2.postDelayed(runnableC0357a, 500L);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.pageadapter.message.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class RunnableC0357a implements Runnable {
        public static ChangeQuickRedirect a;
        private final WeakReference<com.meituan.android.ptcommonim.pageadapter.message.item.a> b;
        private final WeakReference<View> c;

        public RunnableC0357a(com.meituan.android.ptcommonim.pageadapter.message.item.a aVar, View view) {
            Object[] objArr = {aVar, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c995d44e670287b826dd7bf82f794c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c995d44e670287b826dd7bf82f794c6");
                return;
            }
            this.b = new WeakReference<>(aVar);
            this.c = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        @RequiresApi(api = 19)
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8af94aac349556c052bace0b6c9da26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8af94aac349556c052bace0b6c9da26");
                return;
            }
            com.meituan.android.ptcommonim.pageadapter.message.item.a aVar = this.b.get();
            View view = this.c.get();
            if (aVar == null || view == null || !aVar.f || !view.isAttachedToWindow()) {
                return;
            }
            if (view.getGlobalVisibleRect(new Rect())) {
                if (!aVar.h) {
                    return;
                }
                if (a.a(view, 0, 0, a.a(view.getContext()), a.b(view.getContext()), 70, a.b)) {
                    aVar.i = true;
                    aVar.a(view);
                    return;
                }
            }
            view.postDelayed(this, 500L);
        }
    }

    public static void b(com.meituan.android.ptcommonim.pageadapter.message.item.a aVar) {
        View a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52cabe535e3c2918a49a33ef3e299d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52cabe535e3c2918a49a33ef3e299d02");
        } else if (aVar == null || (a2 = aVar.a()) == null) {
        } else {
            Object[] objArr2 = {aVar, a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4f5aff97fc203e0bdfb4e09de06f1afd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4f5aff97fc203e0bdfb4e09de06f1afd");
            } else if (aVar.g != null) {
                a2.removeCallbacks(aVar.g);
                aVar.g = null;
            }
            aVar.f = false;
        }
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4abc237d06f20a8404a147a00f1b5490", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4abc237d06f20a8404a147a00f1b5490")).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0db6fd994df5dd81d59cb495815e46f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0db6fd994df5dd81d59cb495815e46f9")).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static boolean a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Object[] objArr = {view, 0, 0, Integer.valueOf(i3), Integer.valueOf(i4), 70, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b757bc5ca2a3c95a9faeddfe030bfa29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b757bc5ca2a3c95a9faeddfe030bfa29")).booleanValue();
        }
        if (iArr != null && iArr.length == 2 && view.getVisibility() == 0 && view.isAttachedToWindow()) {
            view.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            int width = view.getWidth() + i6;
            int height = view.getHeight() + i7;
            Object[] objArr2 = {Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(width), Integer.valueOf(height), 0, 0, Integer.valueOf(i3), Integer.valueOf(i4), 70};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a8a014fa6892e23287794445bd771054", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a8a014fa6892e23287794445bd771054")).booleanValue();
            }
            int i8 = width - i6;
            int i9 = height - i7;
            float f = (i7 < 0 || height > i4) ? (height <= 0 || height > i4) ? (i7 < 0 || i7 >= i4) ? 0.0f : (i4 - i7) / i9 : (height - 0) / i9 : 1.0f;
            return ((i6 < 0 || width > i3) ? (width <= 0 || width > i3) ? (i6 < 0 || i6 >= i3) ? f * 0.0f : f * (((float) (i3 - i6)) / ((float) i8)) : f * (((float) (width - 0)) / ((float) i8)) : f * 1.0f) * 100.0f >= ((float) 70);
        }
        return false;
    }
}
