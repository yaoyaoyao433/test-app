package kotlin.jvm.internal;

import kotlin.SinceKotlin;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class g extends b implements kotlin.reflect.e {
    private final int arity;

    public g(int i) {
        this.arity = i;
    }

    @SinceKotlin(version = "1.1")
    public g(int i, Object obj) {
        super(obj);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.b
    @SinceKotlin(version = "1.1")
    public kotlin.reflect.e getReflected() {
        return (kotlin.reflect.e) super.getReflected();
    }

    @Override // kotlin.jvm.internal.b
    @SinceKotlin(version = "1.1")
    protected kotlin.reflect.b computeReflected() {
        return u.a(this);
    }

    @Override // kotlin.reflect.e
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.e
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.e
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.reflect.e
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (getOwner() != null ? getOwner().equals(gVar.getOwner()) : gVar.getOwner() == null) {
                if (getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && h.a(getBoundReceiver(), gVar.getBoundReceiver())) {
                    return true;
                }
            }
            return false;
        } else if (obj instanceof kotlin.reflect.e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
