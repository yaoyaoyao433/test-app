package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import com.dianping.picasso.PicassoUtils;
import java.lang.Thread;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public abstract class b extends AppCompatDelegate {
    private static boolean o;
    private static final boolean p;
    private static final int[] q;
    final Context b;
    final Window c;
    final Window.Callback d;
    final Window.Callback e;
    final android.support.v7.app.a f;
    ActionBar g;
    MenuInflater h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    private CharSequence r;
    private boolean s;

    abstract void a(int i, Menu menu);

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    abstract android.support.v7.view.b b(b.a aVar);

    abstract void b(CharSequence charSequence);

    abstract boolean b(int i, Menu menu);

    @Override // android.support.v7.app.AppCompatDelegate
    public void c(Bundle bundle) {
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean j() {
        return false;
    }

    abstract void l();

    public boolean n() {
        return false;
    }

    static {
        boolean z = Build.VERSION.SDK_INT < 21;
        p = z;
        if (z && !o) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: android.support.v7.app.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    String message;
                    boolean z2 = false;
                    if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains(PicassoUtils.DEF_TYPE) || message.contains("Drawable"))) {
                        z2 = true;
                    }
                    if (z2) {
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
            o = true;
        }
        q = new int[]{16842836};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, Window window, android.support.v7.app.a aVar) {
        this.b = context;
        this.c = window;
        this.f = aVar;
        this.d = this.c.getCallback();
        if (this.d instanceof C0007b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.e = a(this.d);
        this.c.setCallback(this.e);
        aw a2 = aw.a(context, (AttributeSet) null, q);
        Drawable b = a2.b(0);
        if (b != null) {
            this.c.setBackgroundDrawable(b);
        }
        a2.a.recycle();
    }

    Window.Callback a(Window.Callback callback) {
        return new C0007b(callback);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public ActionBar a() {
        l();
        return this.g;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public MenuInflater b() {
        if (this.h == null) {
            l();
            this.h = new android.support.v7.view.g(this.g != null ? this.g.e() : this.b);
        }
        return this.h;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public final ActionBarDrawerToggle.a h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context m() {
        ActionBar a2 = a();
        Context e = a2 != null ? a2.e() : null;
        return e == null ? this.b : e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements ActionBarDrawerToggle.a {
        a() {
        }

        @Override // android.support.v7.app.ActionBarDrawerToggle.a
        public final void a(int i) {
            ActionBar a = b.this.a();
            if (a != null) {
                a.c(i);
            }
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void c() {
        this.s = true;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void d() {
        this.s = false;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void g() {
        this.n = true;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public final void a(CharSequence charSequence) {
        this.r = charSequence;
        b(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence o() {
        if (this.d instanceof Activity) {
            return ((Activity) this.d).getTitle();
        }
        return this.r;
    }

    /* compiled from: ProGuard */
    /* renamed from: android.support.v7.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0007b extends android.support.v7.view.i {
        @Override // android.support.v7.view.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0007b(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return b.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || b.this.a(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.k = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.k = false;
            }
            return onPreparePanel;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            b.this.b(i, menu);
            return true;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            b.this.a(i, menu);
        }
    }
}
