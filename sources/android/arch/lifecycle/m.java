package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ReportFragment;
import android.arch.lifecycle.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements f {
    private static final m i = new m();
    Handler e;
    int a = 0;
    int b = 0;
    boolean c = true;
    boolean d = true;
    final g f = new g(this);
    Runnable g = new Runnable() { // from class: android.arch.lifecycle.m.1
        @Override // java.lang.Runnable
        public final void run() {
            m.a(m.this);
            m.this.a();
        }
    };
    private ReportFragment.a h = new ReportFragment.a() { // from class: android.arch.lifecycle.m.2
        @Override // android.arch.lifecycle.ReportFragment.a
        public final void a() {
            m mVar = m.this;
            mVar.a++;
            if (mVar.a == 1 && mVar.d) {
                mVar.f.a(d.a.ON_START);
                mVar.d = false;
            }
        }

        @Override // android.arch.lifecycle.ReportFragment.a
        public final void b() {
            m mVar = m.this;
            mVar.b++;
            if (mVar.b == 1) {
                if (mVar.c) {
                    mVar.f.a(d.a.ON_RESUME);
                    mVar.c = false;
                    return;
                }
                mVar.e.removeCallbacks(mVar.g);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        m mVar = i;
        mVar.e = new Handler();
        mVar.f.a(d.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new b() { // from class: android.arch.lifecycle.m.3
            @Override // android.arch.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ReportFragment.b(activity).a = m.this.h;
            }

            @Override // android.arch.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                m mVar2 = m.this;
                mVar2.b--;
                if (mVar2.b == 0) {
                    mVar2.e.postDelayed(mVar2.g, 700L);
                }
            }

            @Override // android.arch.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                m mVar2;
                mVar2.a--;
                m.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.a == 0 && this.c) {
            this.f.a(d.a.ON_STOP);
            this.d = true;
        }
    }

    private m() {
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public final d getLifecycle() {
        return this.f;
    }

    static /* synthetic */ void a(m mVar) {
        if (mVar.b == 0) {
            mVar.c = true;
            mVar.f.a(d.a.ON_PAUSE);
        }
    }
}
