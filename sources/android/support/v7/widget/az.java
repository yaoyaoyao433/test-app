package android.support.v7.widget;

import android.support.annotation.RestrictTo;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.alipay.sdk.app.PayTask;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class az implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    private static az i;
    private final View a;
    private final CharSequence b;
    private final Runnable c = new Runnable() { // from class: android.support.v7.widget.az.1
        @Override // java.lang.Runnable
        public final void run() {
            az.this.a(false);
        }
    };
    private final Runnable d = new Runnable() { // from class: android.support.v7.widget.az.2
        @Override // java.lang.Runnable
        public final void run() {
            az.this.a();
        }
    };
    private int e;
    private int f;
    private ba g;
    private boolean h;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public static void a(View view, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (i != null && i.a == view) {
                i.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new az(view, charSequence);
    }

    private az(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.e = view.getWidth() / 2;
        this.f = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.g == null || !this.h) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                }
            } else if (this.a.isEnabled() && this.g == null) {
                this.e = (int) motionEvent.getX();
                this.f = (int) motionEvent.getY();
                this.a.removeCallbacks(this.c);
                this.a.postDelayed(this.c, ViewConfiguration.getLongPressTimeout());
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        long longPressTimeout;
        if (ViewCompat.isAttachedToWindow(this.a)) {
            if (i != null) {
                i.a();
            }
            i = this;
            this.h = z;
            this.g = new ba(this.a.getContext());
            this.g.a(this.a, this.e, this.f, this.h, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.h) {
                longPressTimeout = 2500;
            } else if ((ViewCompat.getWindowSystemUiVisibility(this.a) & 1) == 1) {
                longPressTimeout = PayTask.j - ViewConfiguration.getLongPressTimeout();
            } else {
                longPressTimeout = 15000 - ViewConfiguration.getLongPressTimeout();
            }
            this.a.removeCallbacks(this.d);
            this.a.postDelayed(this.d, longPressTimeout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (i == this) {
            i = null;
            if (this.g != null) {
                this.g.a();
                this.g = null;
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        this.a.removeCallbacks(this.c);
        this.a.removeCallbacks(this.d);
    }
}
