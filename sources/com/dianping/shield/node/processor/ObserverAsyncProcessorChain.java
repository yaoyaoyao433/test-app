package com.dianping.shield.node.processor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
import rx.j;
import rx.subscriptions.b;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nJ;\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0013\"\u0004\u0018\u00010\nH\u0014¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/dianping/shield/node/processor/ObserverAsyncProcessorChain;", "Lcom/dianping/shield/node/processor/ObserverAsyncProcessor;", "processorHolder", "Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "(Lcom/dianping/shield/node/processor/AbstractProcessorHolder;)V", "processorList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addProcessor", "processorKey", "", "handleData", "", "subscriber", "Lrx/Subscriber;", "", "subscribers", "Lrx/subscriptions/CompositeSubscription;", "obj", "", "(Lrx/Subscriber;Lrx/subscriptions/CompositeSubscription;[Ljava/lang/Object;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ObserverAsyncProcessorChain extends ObserverAsyncProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AbstractProcessorHolder<ObserverAsyncProcessor> processorHolder;
    private ArrayList<ObserverAsyncProcessor> processorList;

    public ObserverAsyncProcessorChain(@NotNull AbstractProcessorHolder<ObserverAsyncProcessor> abstractProcessorHolder) {
        h.b(abstractProcessorHolder, "processorHolder");
        Object[] objArr = {abstractProcessorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6a3ed40ea4bb126f8bc568c377c6b07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6a3ed40ea4bb126f8bc568c377c6b07");
            return;
        }
        this.processorHolder = abstractProcessorHolder;
        this.processorList = new ArrayList<>();
    }

    @NotNull
    public final ObserverAsyncProcessor addProcessor(@NotNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4551523fc982b73543591cf8741fba1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ObserverAsyncProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4551523fc982b73543591cf8741fba1");
        }
        h.b(obj, "processorKey");
        ObserverAsyncProcessor processor = this.processorHolder.getProcessor(obj);
        if (processor != null) {
            this.processorList.add(processor);
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.dianping.shield.node.processor.ObserverAsyncProcessor, T] */
    @Override // com.dianping.shield.node.processor.ObserverAsyncProcessor
    public final void handleData(@NotNull final j<Boolean> jVar, @NotNull final b bVar, @NotNull final Object... objArr) {
        int i = 0;
        Object[] objArr2 = {jVar, bVar, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "740c459b43d71fb2757c6086136cdc10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "740c459b43d71fb2757c6086136cdc10");
            return;
        }
        h.b(jVar, "subscriber");
        h.b(bVar, "subscribers");
        h.b(objArr, "obj");
        if (!this.processorList.isEmpty()) {
            final t.b bVar2 = new t.b();
            ObserverAsyncProcessor observerAsyncProcessor = this.processorList.get(0);
            h.a((Object) observerAsyncProcessor, "processorList[0]");
            bVar2.a = observerAsyncProcessor;
            for (ObserverAsyncProcessor observerAsyncProcessor2 : this.processorList) {
                if (i < this.processorList.size() - 1) {
                    observerAsyncProcessor2.nextProcessor = this.processorList.get(i + 1);
                }
                i++;
            }
            d a = d.a(new d.a<T>() { // from class: com.dianping.shield.node.processor.ObserverAsyncProcessorChain$handleData$obs$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public final void call(j<? super Object> jVar2) {
                    Object[] objArr3 = {jVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "844fea80b039f9ae08eeb3a52d1070f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "844fea80b039f9ae08eeb3a52d1070f2");
                        return;
                    }
                    h.a((Object) jVar2, "sub");
                    b bVar3 = bVar;
                    Object[] objArr4 = objArr;
                    ((ObserverAsyncProcessor) t.b.this.a).startProcessor(jVar2, bVar3, Arrays.copyOf(objArr4, objArr4.length));
                }
            });
            h.a((Object) a, "Observable.create { sub …bers, *obj)\n            }");
            bVar.a(d.a(new j<Object>() { // from class: com.dianping.shield.node.processor.ObserverAsyncProcessorChain$handleData$subscription$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.e
                public final void onError(@Nullable Throwable th) {
                }

                @Override // rx.e
                public final void onNext(@Nullable Object obj) {
                }

                @Override // rx.e
                public final void onCompleted() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c09fd45c7e840e27c4b32b2155ba880", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c09fd45c7e840e27c4b32b2155ba880");
                    } else {
                        j.this.onNext(Boolean.FALSE);
                    }
                }
            }, a));
            return;
        }
        jVar.onNext(Boolean.FALSE);
    }
}
