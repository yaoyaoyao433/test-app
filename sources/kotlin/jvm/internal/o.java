package kotlin.jvm.internal;

import kotlin.SinceKotlin;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class o extends b implements kotlin.reflect.i {
    public o() {
    }

    @SinceKotlin(version = "1.1")
    public o(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.b
    @SinceKotlin(version = "1.1")
    public kotlin.reflect.i getReflected() {
        return (kotlin.reflect.i) super.getReflected();
    }

    @Override // kotlin.reflect.i
    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    @Override // kotlin.reflect.i
    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getOwner().equals(oVar.getOwner()) && getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && h.a(getBoundReceiver(), oVar.getBoundReceiver());
        } else if (obj instanceof kotlin.reflect.i) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        kotlin.reflect.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
