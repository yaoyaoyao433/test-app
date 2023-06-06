package com.meituan.android.neohybrid.neo.loading;

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
    private InterfaceC0305b k;
    private boolean l;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.neo.loading.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0305b {
        void a(c cVar, View view, String str);
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a4b60ce455ca92d4b5ac429c95ff142d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a4b60ce455ca92d4b5ac429c95ff142d");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5470a55aaea92359c7be5115275d8283", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5470a55aaea92359c7be5115275d8283");
        }
        b bVar = e.get(activity);
        return bVar != null ? bVar : new b(activity);
    }

    public static a b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9d1d0a5fe7faedcc671937bc35a0f71", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9d1d0a5fe7faedcc671937bc35a0f71") : new a(activity);
    }

    private b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6d481aee6cfd44dd300236bb479579", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6d481aee6cfd44dd300236bb479579");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c8f3ee8b5c138a56f7592541edeed07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c8f3ee8b5c138a56f7592541edeed07");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70379098ff4bc36b422af842ec9b9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70379098ff4bc36b422af842ec9b9c6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938de3ee098b66bb8b76d60286bb5333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938de3ee098b66bb8b76d60286bb5333");
        } else {
            a(c.CANCEL, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8694a6c0a02e5980d9034e4af05b5430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8694a6c0a02e5980d9034e4af05b5430");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a81f6c656506d9c19b4e8361a69aa8af", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a81f6c656506d9c19b4e8361a69aa8af");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7b7a5d0dfa98ad9ed003850b467763", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7b7a5d0dfa98ad9ed003850b467763");
                return;
            }
            this.b = b.a(activity);
            this.c = this.b.l;
        }
    }
}
