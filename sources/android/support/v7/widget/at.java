package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class at extends ContextWrapper {
    private static final Object a = new Object();
    private static ArrayList<WeakReference<at>> b;
    private final Resources c;
    private final Resources.Theme d;

    private at(@NonNull Context context) {
        super(context);
        if (bb.a()) {
            this.c = new bb(this, context.getResources());
            this.d = this.c.newTheme();
            this.d.setTo(context.getTheme());
            return;
        }
        this.c = new av(this, context.getResources());
        this.d = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.d == null ? super.getTheme() : this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.d == null) {
            super.setTheme(i);
        } else {
            this.d.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.c.getAssets();
    }

    public static Context a(@NonNull Context context) {
        boolean z = false;
        if (!(context instanceof at) && !(context.getResources() instanceof av) && !(context.getResources() instanceof bb) && (Build.VERSION.SDK_INT < 21 || bb.a())) {
            z = true;
        }
        if (z) {
            synchronized (a) {
                if (b == null) {
                    b = new ArrayList<>();
                } else {
                    for (int size = b.size() - 1; size >= 0; size--) {
                        WeakReference<at> weakReference = b.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            b.remove(size);
                        }
                    }
                    for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                        WeakReference<at> weakReference2 = b.get(size2);
                        at atVar = weakReference2 != null ? weakReference2.get() : null;
                        if (atVar != null && atVar.getBaseContext() == context) {
                            return atVar;
                        }
                    }
                }
                at atVar2 = new at(context);
                b.add(new WeakReference<>(atVar2));
                return atVar2;
            }
        }
        return context;
    }
}
