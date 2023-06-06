package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.annotation.RequiresApi;
import android.support.v7.app.e;
import android.view.ActionMode;
import android.view.Window;
/* compiled from: ProGuard */
@RequiresApi(23)
/* loaded from: classes.dex */
public class f extends e {
    private final UiModeManager v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, Window window, android.support.v7.app.a aVar) {
        super(context, window, aVar);
        this.v = (UiModeManager) context.getSystemService("uimode");
    }

    @Override // android.support.v7.app.e, android.support.v7.app.b
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.app.e
    public final int d(int i) {
        if (i == 0 && this.v.getNightMode() == 0) {
            return -1;
        }
        return super.d(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends e.a {
        @Override // android.support.v7.app.e.a, android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (f.this.n() && i == 0) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }
}
