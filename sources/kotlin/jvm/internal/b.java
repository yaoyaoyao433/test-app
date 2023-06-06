package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class b implements Serializable, kotlin.reflect.b {
    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER = a.a;
    @SinceKotlin(version = "1.1")
    protected final Object receiver;
    private transient kotlin.reflect.b reflected;

    protected abstract kotlin.reflect.b computeReflected();

    /* compiled from: ProGuard */
    @SinceKotlin(version = "1.2")
    /* loaded from: classes7.dex */
    public static class a implements Serializable {
        private static final a a = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return a;
        }
    }

    public b() {
        this(NO_RECEIVER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SinceKotlin(version = "1.1")
    public b(Object obj) {
        this.receiver = obj;
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @SinceKotlin(version = "1.1")
    public kotlin.reflect.b compute() {
        kotlin.reflect.b bVar = this.reflected;
        if (bVar == null) {
            kotlin.reflect.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SinceKotlin(version = "1.1")
    public kotlin.reflect.b getReflected() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new kotlin.jvm.b();
    }

    public kotlin.reflect.d getOwner() {
        throw new AbstractMethodError();
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    @Override // kotlin.reflect.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    @Override // kotlin.reflect.b
    public kotlin.reflect.l getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // kotlin.reflect.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // kotlin.reflect.b
    @SinceKotlin(version = "1.1")
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @Override // kotlin.reflect.b
    @SinceKotlin(version = "1.1")
    public kotlin.reflect.m getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.b
    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.b
    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.b
    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.b
    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
