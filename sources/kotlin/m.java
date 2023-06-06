package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class m<T> implements Serializable, d<T> {
    private kotlin.jvm.functions.a<? extends T> a;
    private volatile Object b;
    private final Object c;

    private m(@NotNull kotlin.jvm.functions.a<? extends T> aVar, @Nullable Object obj) {
        kotlin.jvm.internal.h.b(aVar, "initializer");
        this.a = aVar;
        this.b = p.a;
        this.c = obj == null ? this : obj;
    }

    public /* synthetic */ m(kotlin.jvm.functions.a aVar, Object obj, int i, kotlin.jvm.internal.f fVar) {
        this(aVar, null);
    }

    @Override // kotlin.d
    public final T a() {
        T t;
        T t2 = (T) this.b;
        if (t2 != p.a) {
            return t2;
        }
        synchronized (this.c) {
            t = (T) this.b;
            if (t == p.a) {
                kotlin.jvm.functions.a<? extends T> aVar = this.a;
                if (aVar == null) {
                    kotlin.jvm.internal.h.a();
                }
                t = aVar.invoke();
                this.b = t;
                this.a = null;
            }
        }
        return t;
    }

    private final Object writeReplace() {
        return new b(a());
    }

    @NotNull
    public final String toString() {
        return this.b != p.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
