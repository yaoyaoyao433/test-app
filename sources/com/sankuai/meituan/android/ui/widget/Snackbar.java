package com.sankuai.meituan.android.ui.widget;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.SnackbarLayout;
import com.sankuai.meituan.android.ui.widget.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Snackbar {
    public static ChangeQuickRedirect a;
    private static final Handler k = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.meituan.android.ui.widget.Snackbar.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6201f67839aa71c9136b4787a789ea0f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6201f67839aa71c9136b4787a789ea0f")).booleanValue();
            }
            switch (message.what) {
                case 0:
                    Snackbar.a((Snackbar) message.obj);
                    return true;
                case 1:
                    Snackbar.b((Snackbar) message.obj);
                    return true;
                default:
                    return false;
            }
        }
    });
    int b;
    int c;
    public SnackbarLayout d;
    boolean e;
    b.a f;
    int[] g;
    private ViewGroup h;
    private Context i;
    private int j;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ShowType {
    }

    public static /* synthetic */ void a(Snackbar snackbar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, snackbar, changeQuickRedirect, false, "b8e6bbb6d20904fd1ce6ae2d03c4faa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, snackbar, changeQuickRedirect, false, "b8e6bbb6d20904fd1ce6ae2d03c4faa2");
            return;
        }
        if (snackbar.d.getParent() == null) {
            snackbar.h.addView(snackbar.d);
        }
        snackbar.d.setOnAttachStateChangeListener(new SnackbarLayout.a() { // from class: com.sankuai.meituan.android.ui.widget.Snackbar.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.android.ui.widget.SnackbarLayout.a
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e89df2df86c9cc3722769b1b5ddea389", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e89df2df86c9cc3722769b1b5ddea389");
                    return;
                }
                Snackbar snackbar2 = Snackbar.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = Snackbar.a;
                if (PatchProxy.isSupport(objArr3, snackbar2, changeQuickRedirect3, false, "81222f1e1aa3cf100d39b6609cdef52b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, snackbar2, changeQuickRedirect3, false, "81222f1e1aa3cf100d39b6609cdef52b")).booleanValue() : b.a().d(snackbar2.f)) {
                    Snackbar.k.post(new Runnable() { // from class: com.sankuai.meituan.android.ui.widget.Snackbar.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "06055df238576454597dd36dff1a8836", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "06055df238576454597dd36dff1a8836");
                            } else {
                                Snackbar.this.f();
                            }
                        }
                    });
                }
            }
        });
        if (!ViewCompat.isLaidOut(snackbar.d)) {
            snackbar.d.setOnLayoutChangeListener(new SnackbarLayout.b() { // from class: com.sankuai.meituan.android.ui.widget.Snackbar.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.android.ui.widget.SnackbarLayout.b
                public final void a(View view, int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f03f5d5c063fcf97ec0add445ca63735", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f03f5d5c063fcf97ec0add445ca63735");
                        return;
                    }
                    Snackbar.this.d.setOnLayoutChangeListener(null);
                    if (Snackbar.this.e) {
                        return;
                    }
                    Snackbar.this.e();
                }
            });
        } else if (snackbar.e) {
        } else {
            snackbar.e();
        }
    }

    public static /* synthetic */ void b(Snackbar snackbar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, snackbar, changeQuickRedirect, false, "2a0cb1af77dd35a06cca580d010d2a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, snackbar, changeQuickRedirect, false, "2a0cb1af77dd35a06cca580d010d2a54");
        } else if (snackbar.e && snackbar.d.getVisibility() == 0) {
        } else {
            snackbar.f();
        }
    }

    private Snackbar(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b89570a1aa3598318200d4497e99fc8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b89570a1aa3598318200d4497e99fc8b");
            return;
        }
        this.b = 2;
        this.e = false;
        this.h = viewGroup;
        this.i = viewGroup.getContext();
        this.d = (SnackbarLayout) LayoutInflater.from(this.i).inflate(R.layout.snackbar_design_layout_mt, this.h, false);
        this.d.setSnackbar(this);
        this.f = new b.a() { // from class: com.sankuai.meituan.android.ui.widget.Snackbar.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.android.ui.widget.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22a1b92a0cdcfce654d45faca25535d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22a1b92a0cdcfce654d45faca25535d1");
                    return;
                }
                Snackbar.k.sendMessage(Snackbar.k.obtainMessage(0, Snackbar.this));
            }

            @Override // com.sankuai.meituan.android.ui.widget.b.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5035f4a4705cbd4fded1ac60511559de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5035f4a4705cbd4fded1ac60511559de");
                    return;
                }
                Snackbar.k.sendMessage(Snackbar.k.obtainMessage(1, Snackbar.this));
            }
        };
    }

    public static Snackbar a(View view, CharSequence charSequence, int i, int i2) {
        Snackbar snackbar;
        Object[] objArr = {view, charSequence, Integer.valueOf(i), 17};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a160d52fcc61e7cf57bd25b0bde1ceb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Snackbar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a160d52fcc61e7cf57bd25b0bde1ceb");
        }
        Object[] objArr2 = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1963d4ee6a5383294a17c86252259c22", RobustBitConfig.DEFAULT_VALUE)) {
            snackbar = (Snackbar) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1963d4ee6a5383294a17c86252259c22");
        } else {
            ViewGroup a2 = a(view, false);
            if (a2 == null) {
                snackbar = null;
            } else {
                Snackbar snackbar2 = new Snackbar(a2);
                Object[] objArr3 = {charSequence};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, snackbar2, changeQuickRedirect3, false, "3d8ae494eedb067e3bc2d71905ac16ce", RobustBitConfig.DEFAULT_VALUE)) {
                    Snackbar snackbar3 = (Snackbar) PatchProxy.accessDispatch(objArr3, snackbar2, changeQuickRedirect3, false, "3d8ae494eedb067e3bc2d71905ac16ce");
                } else {
                    snackbar2.d.getMessageView().setText(charSequence);
                }
                snackbar2.j = i;
                snackbar = snackbar2;
            }
        }
        if (snackbar == null) {
            return null;
        }
        snackbar.a(17);
        return snackbar;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "008d36cb5b6b98fcbf8816be3e50d158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "008d36cb5b6b98fcbf8816be3e50d158");
            return;
        }
        this.c = i;
        if (this.h != null && (this.h instanceof FrameLayout)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.d.getLayoutParams().width, this.d.getLayoutParams().height);
            layoutParams.gravity = i;
            this.d.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f565fcb527fbd256cdaad5c0c791d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f565fcb527fbd256cdaad5c0c791d9");
            return;
        }
        this.g = new int[]{i, i2, i3, i4};
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, i2, i3, i4);
            this.d.setLayoutParams(layoutParams);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a8dca6c25ec357254dca37825515b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a8dca6c25ec357254dca37825515b8");
        } else {
            this.h = a(this.h, z);
        }
    }

    private static ViewGroup a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        ViewGroup viewGroup = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8b66d6d2ffed448d674e156844c880e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8b66d6d2ffed448d674e156844c880e");
        }
        if (z) {
            View rootView = view.getRootView();
            if (rootView instanceof ViewGroup) {
                return (ViewGroup) rootView;
            }
        } else {
            viewGroup = (ViewGroup) view.getRootView().findViewById(16908290);
        }
        if (viewGroup == null) {
            ViewGroup a2 = a(view);
            do {
                viewGroup = a2;
                if (viewGroup != null) {
                    a2 = a(viewGroup);
                } else if (viewGroup == null && (view instanceof ViewGroup)) {
                    return (ViewGroup) view;
                }
            } while (a2 != null);
            return viewGroup;
        }
        return viewGroup;
    }

    private static ViewGroup a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48cbea75ce9ec688b9739e89ede17887", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48cbea75ce9ec688b9739e89ede17887");
        }
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) parent;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4234f4b02a2eb23be927dbabea9fe386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4234f4b02a2eb23be927dbabea9fe386");
        } else if (this.i instanceof Application) {
            d();
        } else if (this.b == 1 && a(this.i)) {
            d();
        } else {
            b a2 = b.a();
            int i = this.j;
            b.a aVar = this.f;
            Object[] objArr2 = {Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d8fe78a00b7bbd5134bf6b6953aee127", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d8fe78a00b7bbd5134bf6b6953aee127");
                return;
            }
            synchronized (a2.b) {
                if (a2.e(aVar)) {
                    a2.d.c = i;
                    a2.c.removeCallbacksAndMessages(a2.d);
                    a2.b(a2.d);
                    return;
                }
                if (a2.f(aVar)) {
                    a2.e.c = i;
                } else {
                    a2.e = new b.C0584b(i, aVar);
                }
                if (a2.d == null || !a2.a(a2.d)) {
                    a2.d = null;
                    a2.b();
                }
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebabcb263c3a4be04d245bf7f0514c2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebabcb263c3a4be04d245bf7f0514c2a");
            return;
        }
        Toast toast = new Toast(this.i);
        toast.setView(this.d);
        toast.setGravity(this.c, 0, 0);
        if (this.j == -2 || this.j == 0) {
            toast.setDuration(1);
        } else {
            toast.setDuration(0);
        }
        toast.show();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2725199f59103dad59350064348126f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2725199f59103dad59350064348126f0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aab22a6a23d56707410829719a99f922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aab22a6a23d56707410829719a99f922");
        } else {
            b.a().a(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5004b339ec700324d6d650295b1b9afe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5004b339ec700324d6d650295b1b9afe");
        } else {
            b.a().c(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3723a78a074c606aa289e6d7f5319c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3723a78a074c606aa289e6d7f5319c3b");
            return;
        }
        b.a().b(this.f);
        ViewParent parent = this.d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.d);
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c8ffd4b4b42ff90b5a014b3fec9ecce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c8ffd4b4b42ff90b5a014b3fec9ecce")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
