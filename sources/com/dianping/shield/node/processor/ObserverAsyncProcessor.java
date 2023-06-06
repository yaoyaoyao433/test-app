package com.dianping.shield.node.processor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
import rx.j;
import rx.subscriptions.b;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0004\u001a\u00020\u0005H\u0014J;\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001H$¢\u0006\u0002\u0010\u000fJ9\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/node/processor/ObserverAsyncProcessor;", "", "()V", "nextProcessor", "getName", "", "handleData", "", "subscriber", "Lrx/Subscriber;", "", "subscribers", "Lrx/subscriptions/CompositeSubscription;", "obj", "", "(Lrx/Subscriber;Lrx/subscriptions/CompositeSubscription;[Ljava/lang/Object;)V", "startProcessor", "outSubscriber", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ObserverAsyncProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public ObserverAsyncProcessor nextProcessor;

    public abstract void handleData(@NotNull j<Boolean> jVar, @NotNull b bVar, @NotNull Object... objArr);

    public final void startProcessor(@NotNull final j<Object> jVar, @NotNull final b bVar, @NotNull final Object... objArr) {
        Object[] objArr2 = {jVar, bVar, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e443245d8b430205aae071e0054b6d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e443245d8b430205aae071e0054b6d53");
            return;
        }
        h.b(jVar, "outSubscriber");
        h.b(bVar, "subscribers");
        h.b(objArr, "obj");
        bVar.a(d.a((d.a) new d.a<Boolean>() { // from class: com.dianping.shield.node.processor.ObserverAsyncProcessor$startProcessor$subscription$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public final void call(j<? super Boolean> jVar2) {
                Object[] objArr3 = {jVar2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e0aba57c6597827399c7982202ffa349", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e0aba57c6597827399c7982202ffa349");
                    return;
                }
                ObserverAsyncProcessor observerAsyncProcessor = ObserverAsyncProcessor.this;
                if (jVar2 == null) {
                    throw new o("null cannot be cast to non-null type rx.Subscriber<kotlin.Boolean>");
                }
                b bVar2 = bVar;
                Object[] objArr4 = objArr;
                observerAsyncProcessor.handleData(jVar2, bVar2, Arrays.copyOf(objArr4, objArr4.length));
            }
        }).a(1).c(new rx.functions.b<Boolean>() { // from class: com.dianping.shield.node.processor.ObserverAsyncProcessor$startProcessor$subscription$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public final void call(Boolean bool) {
                Object[] objArr3 = {bool};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07051c7bcb8bcd433aa13edf372f10d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07051c7bcb8bcd433aa13edf372f10d6");
                } else if (!bool.booleanValue()) {
                    jVar.onNext(ObserverAsyncProcessor.this.getName());
                    ObserverAsyncProcessor observerAsyncProcessor = ObserverAsyncProcessor.this.nextProcessor;
                    if (observerAsyncProcessor == null) {
                        jVar.onCompleted();
                        return;
                    }
                    j<Object> jVar2 = jVar;
                    b bVar2 = bVar;
                    Object[] objArr4 = objArr;
                    observerAsyncProcessor.startProcessor(jVar2, bVar2, Arrays.copyOf(objArr4, objArr4.length));
                } else {
                    jVar.onCompleted();
                }
            }
        }));
    }

    @NotNull
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4e5de9e0ad7221d23c6fbce358d628b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4e5de9e0ad7221d23c6fbce358d628b");
        }
        String simpleName = getClass().getSimpleName();
        h.a((Object) simpleName, "this.javaClass.simpleName");
        return simpleName;
    }
}
