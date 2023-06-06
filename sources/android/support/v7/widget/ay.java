package android.support.v7.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ay {
    private static final c a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface c {
        void a(@NonNull View view, @Nullable CharSequence charSequence);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements c {
        private b() {
        }

        @Override // android.support.v7.widget.ay.c
        public final void a(@NonNull View view, @Nullable CharSequence charSequence) {
            az.a(view, charSequence);
        }
    }

    /* compiled from: ProGuard */
    @TargetApi(26)
    /* loaded from: classes.dex */
    static class a implements c {
        private a() {
        }

        @Override // android.support.v7.widget.ay.c
        public final void a(@NonNull View view, @Nullable CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            a = new a();
        } else {
            a = new b();
        }
    }

    public static void a(@NonNull View view, @Nullable CharSequence charSequence) {
        a.a(view, charSequence);
    }
}
