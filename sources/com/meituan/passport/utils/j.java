package com.meituan.passport.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.meituan.passport.LoginActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ViewUtil;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static int k;
    private static Handler l = new Handler(Looper.getMainLooper());
    public String b;
    private final View c;
    private final View d;
    private final View e;
    private a f;
    private Activity g;
    private boolean h;
    private int i;
    private boolean j;

    public static /* synthetic */ boolean b(j jVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "b3255d55c81635ed281354161d3bb2fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "b3255d55c81635ed281354161d3bb2fa")).booleanValue();
        }
        return ((double) jVar.h()) / ((double) jVar.g.getWindow().getDecorView().getRootView().getHeight()) > 0.3d;
    }

    public static /* synthetic */ void f(j jVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "0f9ab8a76349e606a135431f3cb5579e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "0f9ab8a76349e606a135431f3cb5579e");
        } else if (jVar.f != null) {
            jVar.c.getViewTreeObserver().removeOnGlobalLayoutListener(jVar.f);
        }
    }

    public static /* synthetic */ int g(j jVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "e1407e07da74b39b11223e26c6f32388", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "e1407e07da74b39b11223e26c6f32388")).intValue();
        }
        return jVar.g() - jVar.f();
    }

    public static /* synthetic */ void j(j jVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "d7a3fb2946a43412446df5ec7966a693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "d7a3fb2946a43412446df5ec7966a693");
        } else if (jVar.f != null) {
            jVar.c.getViewTreeObserver().addOnGlobalLayoutListener(jVar.f);
        }
    }

    public j(Activity activity, View view, View view2, View view3) {
        Object[] objArr = {activity, view, view2, view3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d5d9251ece0d6d9d97cf55a80b4f8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d5d9251ece0d6d9d97cf55a80b4f8b");
            return;
        }
        this.b = "log_tag";
        this.i = 0;
        this.j = false;
        this.c = view;
        this.d = view2;
        this.g = activity;
        this.e = view3;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886be1053728236a585f744093f1e33e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886be1053728236a585f744093f1e33e");
            return;
        }
        this.h = true;
        if (this.f == null) {
            this.f = new a(this.c, this.d, this.e);
        }
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(this.f);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e15b98d535208e2150e85b95446408e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e15b98d535208e2150e85b95446408e");
            return;
        }
        this.h = false;
        if (this.f != null) {
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.f);
        }
        if (this.f != null) {
            this.f = null;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78592e0e648f540ff2f6817afc83d848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78592e0e648f540ff2f6817afc83d848");
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad42cb9931aa72d20824d4cf768d096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad42cb9931aa72d20824d4cf768d096");
            return;
        }
        this.c.scrollBy(0, -this.i);
        this.i = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect a;
        private View c;
        private View d;
        private View e;

        public a(View view, View view2, View view3) {
            Object[] objArr = {j.this, view, view2, view3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cc6f9a616a425bd20c177010bf26bd6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cc6f9a616a425bd20c177010bf26bd6");
                return;
            }
            this.c = view;
            this.d = view2;
            this.e = view3;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int height;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8064fb58bc77521038fce7d6986c3ee6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8064fb58bc77521038fce7d6986c3ee6");
                return;
            }
            if (j.this.g != null && j.this.g.getWindow() != null) {
                Window window = j.this.g.getWindow();
                if (j.b(j.this)) {
                    window.setFlags(8192, 8192);
                } else {
                    window.clearFlags(8192);
                }
            }
            if (j.this.h) {
                if (j.b(j.this) && j.this.g() >= j.this.h()) {
                    j.f(j.this);
                    j.l.postDelayed(k.a(j.this), 100L);
                    int g = j.g(j.this);
                    this.c.scrollBy(0, g);
                    j.this.i += g;
                    return;
                }
                Rect rect = new Rect();
                try {
                    this.c.getWindowVisibleDisplayFrame(rect);
                    if (!j.b(j.this)) {
                        j.this.e();
                        return;
                    }
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    this.d.getLocationInWindow(iArr);
                    this.e.getLocationOnScreen(iArr2);
                    int height2 = (iArr[1] + this.d.getHeight()) - rect.bottom;
                    int i = iArr2[1];
                    LoginActivity loginActivity = (LoginActivity) j.this.g;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = LoginActivity.c;
                    if (PatchProxy.isSupport(objArr2, loginActivity, changeQuickRedirect2, false, "2747c5faffd4f3932944944484dcdc4d", RobustBitConfig.DEFAULT_VALUE)) {
                        height = ((Integer) PatchProxy.accessDispatch(objArr2, loginActivity, changeQuickRedirect2, false, "2747c5faffd4f3932944944484dcdc4d")).intValue();
                    } else {
                        height = loginActivity.d != null ? loginActivity.d.getHeight() : 0;
                    }
                    int statusBarHeight = (i - height) - ViewUtil.getStatusBarHeight(j.this.g);
                    if (height2 <= statusBarHeight) {
                        statusBarHeight = height2;
                    }
                    this.c.scrollBy(0, statusBarHeight);
                    j.this.i += statusBarHeight;
                } catch (Exception unused) {
                }
            }
        }

        public static /* synthetic */ void a(j jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dca61fd693e378ac0676b417aeae5668", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dca61fd693e378ac0676b417aeae5668");
            } else {
                j.j(jVar);
            }
        }
    }

    private int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed905412fb6dffbae66f287ca61bff0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed905412fb6dffbae66f287ca61bff0")).intValue();
        }
        int height = this.g.getWindow().getDecorView().getRootView().getHeight();
        int[] iArr = new int[2];
        this.d.getLocationInWindow(iArr);
        return height - (iArr[1] + this.d.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b31dba7f34f4bb502ced4f99022de3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b31dba7f34f4bb502ced4f99022de3")).intValue();
        }
        if (!this.j) {
            k = f();
            this.j = true;
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505f1f4ce36bb4e403af7d97cc53da9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505f1f4ce36bb4e403af7d97cc53da9f")).intValue();
        }
        Rect rect = new Rect();
        this.g.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return this.g.getWindow().getDecorView().getRootView().getHeight() - rect.bottom;
    }
}
