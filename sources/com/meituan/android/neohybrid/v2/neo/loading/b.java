package com.meituan.android.neohybrid.v2.neo.loading;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements DialogInterface.OnCancelListener {
    public static ChangeQuickRedirect a;
    private static final Map<Activity, b> e = new WeakHashMap();
    WeakReference<Activity> b;
    LoadingDialog c;
    c d;
    private boolean f;
    private View g;
    private View h;
    private boolean i;
    private boolean j;
    private InterfaceC0314b k;
    private boolean l;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.loading.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0314b {
        void a(c cVar, View view, String str);
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "0512ac78e91462d4a6d3185ede8ba885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "0512ac78e91462d4a6d3185ede8ba885");
            return;
        }
        Activity b = bVar.b();
        if (b == null || b.isFinishing() || b.isDestroyed() || e.containsKey(b)) {
            bVar.a(c.FAIL, "init error");
            return;
        }
        bVar.l = true;
        bVar.c = new LoadingDialog(bVar.b(), bVar.h, bVar.f);
        bVar.c.setCancelable(bVar.i);
        bVar.c.setCanceledOnTouchOutside(bVar.j);
        bVar.c.setOnCancelListener(bVar);
        bVar.g = bVar.c.b;
        e.put(b, bVar);
        bVar.a(c.READY, "");
    }

    public static b a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edcf204955b747f2ab4e885d9006eb8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edcf204955b747f2ab4e885d9006eb8b");
        }
        b bVar = e.get(activity);
        return bVar != null ? bVar : new b(activity);
    }

    public static a b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48199ce2555777d4978f8bad5aa416a5", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48199ce2555777d4978f8bad5aa416a5") : new a(activity);
    }

    private b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4fae6bf6ee040ee2070a6829105b5f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4fae6bf6ee040ee2070a6829105b5f4");
            return;
        }
        this.b = new WeakReference<>(activity);
        if (activity == null) {
            a(c.FAIL, "activity null");
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa95ae9a2716f457f4ac80ff9da91b38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa95ae9a2716f457f4ac80ff9da91b38");
            return;
        }
        this.c = null;
        this.g = null;
        this.h = null;
        this.k = null;
        if (this.b != null) {
            e.remove(this.b.get());
        }
        this.d = c.CLEAR;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36b76c4e072229e2df4e2ecc170c29f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36b76c4e072229e2df4e2ecc170c29f3");
            return;
        }
        Activity activity = this.b.get();
        if (this.d != c.SHOW || this.c == null || activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        this.c.dismiss();
        a(c.HIDE, str);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c6fe8d817dad866ea95b6044d6c763d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c6fe8d817dad866ea95b6044d6c763d");
        } else {
            a(c.CANCEL, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "526dc0b0d9ccde3a755427e6f6eb48f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "526dc0b0d9ccde3a755427e6f6eb48f6");
        } else if (this.d == cVar || this.d == c.CLEAR) {
        } else {
            this.d = cVar;
            if (this.k != null) {
                this.k.a(this.d, this.g, str);
            }
            if (cVar == null || cVar.h > 0) {
                a();
            }
        }
    }

    private Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a98ae63d254aa5a098b6714e9b57cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a98ae63d254aa5a098b6714e9b57cc");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        b b;
        boolean c;

        private a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9becc86e01c51eed4f2fe379a2e0fb4d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9becc86e01c51eed4f2fe379a2e0fb4d");
                return;
            }
            this.b = b.a(activity);
            this.c = this.b.l;
        }
    }
}
