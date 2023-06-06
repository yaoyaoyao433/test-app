package android.arch.lifecycle;

import android.app.Application;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p {
    private final b a;
    private final r b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        @NonNull
        <T extends o> T a(@NonNull Class<T> cls);
    }

    public p(@NonNull r rVar, @NonNull b bVar) {
        this.a = bVar;
        this.b = rVar;
    }

    @NonNull
    @MainThread
    public final <T extends o> T a(@NonNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
        T t = (T) this.b.a.get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.a.a(cls);
        this.b.a(str, t2);
        return t2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c implements b {
        @Override // android.arch.lifecycle.p.b
        @NonNull
        public <T extends o> T a(@NonNull Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends c {
        private static a a;
        private Application b;

        @NonNull
        public static a a(@NonNull Application application) {
            if (a == null) {
                a = new a(application);
            }
            return a;
        }

        private a(@NonNull Application application) {
            this.b = application;
        }

        @Override // android.arch.lifecycle.p.c, android.arch.lifecycle.p.b
        @NonNull
        public final <T extends o> T a(@NonNull Class<T> cls) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    return cls.getConstructor(Application.class).newInstance(this.b);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.a(cls);
        }
    }
}
