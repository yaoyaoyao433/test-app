package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.b;
import android.support.v7.app.e;
import android.support.v7.view.f;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public class e extends d {
    private int v;
    private boolean w;
    private boolean x;
    private b y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, Window window, android.support.v7.app.a aVar) {
        super(context, window, aVar);
        this.v = -100;
        this.x = true;
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.AppCompatDelegate
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle == null || this.v != -100) {
            return;
        }
        this.v = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // android.support.v7.app.b
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.b
    public boolean n() {
        return this.x;
    }

    @Override // android.support.v7.app.b, android.support.v7.app.AppCompatDelegate
    public void c() {
        super.c();
        j();
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.b, android.support.v7.app.AppCompatDelegate
    public void d() {
        super.d();
        if (this.y != null) {
            this.y.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(int i) {
        if (i != -100) {
            if (i != 0) {
                return i;
            }
            s();
            b bVar = this.y;
            bVar.b = bVar.a.a();
            return bVar.b ? 2 : 1;
        }
        return -1;
    }

    @Override // android.support.v7.app.b, android.support.v7.app.AppCompatDelegate
    public void c(Bundle bundle) {
        super.c(bundle);
        if (this.v != -100) {
            bundle.putInt("appcompat:local_night_mode", this.v);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.b, android.support.v7.app.AppCompatDelegate
    public void g() {
        super.g();
        if (this.y != null) {
            this.y.a();
        }
    }

    private void s() {
        if (this.y == null) {
            this.y = new b(m.a(this.b));
        }
    }

    private boolean t() {
        if (this.w && (this.b instanceof Activity)) {
            try {
                return (this.b.getPackageManager().getActivityInfo(new ComponentName(this.b, this.b.getClass()), 0).configChanges & 512) == 0;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                return true;
            }
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends b.C0007b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (e.this.n()) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.b, callback);
            android.support.v7.view.b a = e.this.a(aVar);
            if (a != null) {
                return aVar.b(a);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @VisibleForTesting
    /* loaded from: classes.dex */
    public final class b {
        m a;
        boolean b;
        BroadcastReceiver c;
        IntentFilter d;

        b(@NonNull m mVar) {
            this.a = mVar;
            this.b = mVar.a();
        }

        final void a() {
            if (this.c != null) {
                e.this.b.unregisterReceiver(this.c);
                this.c = null;
            }
        }
    }

    @Override // android.support.v7.app.b, android.support.v7.app.AppCompatDelegate
    public boolean j() {
        int i = this.v != -100 ? this.v : AppCompatDelegate.a;
        int d = d(i);
        boolean z = false;
        if (d != -1) {
            Resources resources = this.b.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            int i3 = d == 2 ? 32 : 16;
            if (i2 != i3) {
                if (t()) {
                    ((Activity) this.b).recreate();
                } else {
                    Configuration configuration2 = new Configuration(configuration);
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
                    resources.updateConfiguration(configuration2, displayMetrics);
                    if (Build.VERSION.SDK_INT < 26) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            j.c(resources);
                        } else if (Build.VERSION.SDK_INT >= 23) {
                            j.b(resources);
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            j.a(resources);
                        }
                    }
                }
                z = true;
            }
        }
        if (i == 0) {
            s();
            final b bVar = this.y;
            bVar.a();
            if (bVar.c == null) {
                bVar.c = new BroadcastReceiver() { // from class: android.support.v7.app.AppCompatDelegateImplV14$AutoNightModeManager$1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        e.b bVar2 = e.b.this;
                        boolean a2 = bVar2.a.a();
                        if (a2 != bVar2.b) {
                            bVar2.b = a2;
                            e.this.j();
                        }
                    }
                };
            }
            if (bVar.d == null) {
                bVar.d = new IntentFilter();
                bVar.d.addAction("android.intent.action.TIME_SET");
                bVar.d.addAction("android.intent.action.TIMEZONE_CHANGED");
                bVar.d.addAction("android.intent.action.TIME_TICK");
            }
            e.this.b.registerReceiver(bVar.c, bVar.d);
        }
        this.w = true;
        return z;
    }
}
