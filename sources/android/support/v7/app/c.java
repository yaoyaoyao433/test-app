package android.support.v7.app;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatDelegateImplV9;
import android.support.v7.app.f;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;
/* compiled from: ProGuard */
@RequiresApi(24)
/* loaded from: classes.dex */
public final class c extends f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, Window window, android.support.v7.app.a aVar) {
        super(context, window, aVar);
    }

    @Override // android.support.v7.app.f, android.support.v7.app.e, android.support.v7.app.b
    final Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends f.a {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            AppCompatDelegateImplV9.PanelFeatureState a = c.this.a(0, true);
            if (a != null && a.j != null) {
                super.onProvideKeyboardShortcuts(list, a.j, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }
    }
}
