package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.m;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j implements Handler.Callback {
    private static final j c = new j();
    private volatile m d;
    final Map<FragmentManager, RequestManagerFragment> a = new HashMap();
    final Map<android.support.v4.app.FragmentManager, SupportRequestManagerFragment> b = new HashMap();
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    public static j a() {
        return c;
    }

    j() {
    }

    private m b(Context context) {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new m(context.getApplicationContext(), new b(), new f());
                }
            }
        }
        return this.d;
    }

    public final m a(Context context) {
        while (context != null) {
            if (com.bumptech.glide.util.h.c() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return a((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            return b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    private m a(FragmentActivity fragmentActivity) {
        if (com.bumptech.glide.util.h.d()) {
            return a(fragmentActivity.getApplicationContext());
        }
        b((Activity) fragmentActivity);
        return a(fragmentActivity, fragmentActivity.getSupportFragmentManager());
    }

    @TargetApi(11)
    private m a(Activity activity) {
        if (com.bumptech.glide.util.h.d() || Build.VERSION.SDK_INT < 11) {
            return a(activity.getApplicationContext());
        }
        b(activity);
        return a(activity, activity.getFragmentManager());
    }

    @TargetApi(17)
    private static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(17)
    public final RequestManagerFragment a(FragmentManager fragmentManager) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null) {
            RequestManagerFragment requestManagerFragment2 = this.a.get(fragmentManager);
            if (requestManagerFragment2 == null) {
                RequestManagerFragment requestManagerFragment3 = new RequestManagerFragment();
                this.a.put(fragmentManager, requestManagerFragment3);
                fragmentManager.beginTransaction().add(requestManagerFragment3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.e.obtainMessage(1, fragmentManager).sendToTarget();
                return requestManagerFragment3;
            }
            return requestManagerFragment2;
        }
        return requestManagerFragment;
    }

    @TargetApi(11)
    private m a(Context context, FragmentManager fragmentManager) {
        RequestManagerFragment a = a(fragmentManager);
        m mVar = a.c;
        if (mVar == null) {
            m mVar2 = new m(context, a.a, a.b);
            a.c = mVar2;
            return mVar2;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SupportRequestManagerFragment a(android.support.v4.app.FragmentManager fragmentManager) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null) {
            SupportRequestManagerFragment supportRequestManagerFragment2 = this.b.get(fragmentManager);
            if (supportRequestManagerFragment2 == null) {
                SupportRequestManagerFragment supportRequestManagerFragment3 = new SupportRequestManagerFragment();
                this.b.put(fragmentManager, supportRequestManagerFragment3);
                fragmentManager.beginTransaction().add(supportRequestManagerFragment3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.e.obtainMessage(2, fragmentManager).sendToTarget();
                return supportRequestManagerFragment3;
            }
            return supportRequestManagerFragment2;
        }
        return supportRequestManagerFragment;
    }

    private m a(Context context, android.support.v4.app.FragmentManager fragmentManager) {
        SupportRequestManagerFragment a = a(fragmentManager);
        m mVar = a.a;
        if (mVar == null) {
            m mVar2 = new m(context, a.b, a.c);
            a.a = mVar2;
            return mVar2;
        }
        return mVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentCallbacks remove;
        Object obj = null;
        boolean z = true;
        switch (message.what) {
            case 1:
                obj = (FragmentManager) message.obj;
                remove = this.a.remove(obj);
                break;
            case 2:
                obj = (android.support.v4.app.FragmentManager) message.obj;
                remove = this.b.remove(obj);
                break;
            default:
                z = false;
                remove = null;
                break;
        }
        if (z && remove == null && Log.isLoggable("RMRetriever", 5)) {
            new StringBuilder("Failed to remove expected request manager fragment, manager: ").append(obj);
        }
        return z;
    }
}
