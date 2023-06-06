package com.dianping.shield.dynamic.template;

import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.processor.DynamicProcessorHolder;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.processor.AsyncProcessor;
import com.dianping.shield.node.processor.ObserverAsyncProcessorChain;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.r;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
import rx.j;
import rx.subscriptions.b;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0005JF\u0010\u000f\u001a\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\u00120\u0004j\n\u0012\u0006\b\u0001\u0012\u00020\u0012`\u00062\"\u0010\u0013\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017\u0012\u0004\u0012\u00020\u00100\u0014J\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/dianping/shield/dynamic/template/DynamicComputeTemplate;", "", "()V", "computeList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/template/ComputeInputTemplate;", "Lkotlin/collections/ArrayList;", "subscriptions", "Lrx/subscriptions/CompositeSubscription;", "getSubscriptions", "()Lrx/subscriptions/CompositeSubscription;", "subscriptions$delegate", "Lkotlin/Lazy;", "addComputeInputTemplate", "computeInputTemplate", "compute", "", "computingList", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "callbackFun", "Lkotlin/Function1;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "destroy", "initWithExecutor", "dynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class DynamicComputeTemplate {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(DynamicComputeTemplate.class), "subscriptions", "getSubscriptions()Lrx/subscriptions/CompositeSubscription;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<ComputeInputTemplate> computeList;
    private final d subscriptions$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    public final b getSubscriptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (b) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2d2bd2b4975ed08116a27bc586b7a0a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2d2bd2b4975ed08116a27bc586b7a0a") : this.subscriptions$delegate.a());
    }

    public DynamicComputeTemplate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8185eee6c47095675cb8dbcada94d22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8185eee6c47095675cb8dbcada94d22");
            return;
        }
        this.computeList = new ArrayList<>();
        this.subscriptions$delegate = e.a(kotlin.i.NONE, DynamicComputeTemplate$subscriptions$2.INSTANCE);
    }

    @NotNull
    public final DynamicComputeTemplate addComputeInputTemplate(@NotNull ComputeInputTemplate computeInputTemplate) {
        Object[] objArr = {computeInputTemplate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d614291f720994bab892b973feb2e467", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicComputeTemplate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d614291f720994bab892b973feb2e467");
        }
        h.b(computeInputTemplate, "computeInputTemplate");
        this.computeList.add(computeInputTemplate);
        return this;
    }

    public final void initWithExecutor(@NotNull DynamicExecutorInterface dynamicExecutorInterface) {
        Object[] objArr = {dynamicExecutorInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bedba4f34f4a0ef88f50d99cdec530d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bedba4f34f4a0ef88f50d99cdec530d");
            return;
        }
        h.b(dynamicExecutorInterface, "dynamicExecutor");
        ArrayList<AsyncProcessor> computeProcessors = dynamicExecutorInterface.getComputeProcessors();
        if (computeProcessors != null) {
            for (AsyncProcessor asyncProcessor : computeProcessors) {
                h.a((Object) asyncProcessor, "processor");
                addComputeInputTemplate(new ComputeInputTemplate(asyncProcessor));
            }
        }
    }

    public final void compute(@NotNull ArrayList<? extends IDynamicModuleViewItem> arrayList, @NotNull final kotlin.jvm.functions.b<? super HashSet<String>, r> bVar) {
        Object[] objArr = {arrayList, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b1f5aa846a2d7e8870267853a5e387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b1f5aa846a2d7e8870267853a5e387");
            return;
        }
        h.b(arrayList, "computingList");
        h.b(bVar, "callbackFun");
        final HashSet hashSet = new HashSet();
        getSubscriptions().a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Integer valueOf = Integer.valueOf(((IDynamicModuleViewItem) obj).getViewItemData().computePriority);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        final SortedMap a = v.a(linkedHashMap);
        final ObserverAsyncProcessorChain observerAsyncProcessorChain = new ObserverAsyncProcessorChain(DynamicProcessorHolder.INSTANCE);
        Iterator it = a.entrySet().iterator();
        while (it.hasNext()) {
            observerAsyncProcessorChain.addProcessor("StepComputeProcessor_" + ((Integer) ((Map.Entry) it.next()).getKey()));
        }
        rx.d a2 = rx.d.a(new d.a<T>() { // from class: com.dianping.shield.dynamic.template.DynamicComputeTemplate$compute$obs$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public final void call(j<? super Object> jVar) {
                b subscriptions;
                ArrayList arrayList2;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "03f1afe537ab58881c7aac3b59c555ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "03f1afe537ab58881c7aac3b59c555ed");
                    return;
                }
                ObserverAsyncProcessorChain observerAsyncProcessorChain2 = observerAsyncProcessorChain;
                h.a((Object) jVar, "subscriber");
                subscriptions = DynamicComputeTemplate.this.getSubscriptions();
                arrayList2 = DynamicComputeTemplate.this.computeList;
                observerAsyncProcessorChain2.startProcessor(jVar, subscriptions, a, hashSet, arrayList2);
            }
        });
        h.a((Object) a2, "Observable.create { subs…t, computeList)\n        }");
        getSubscriptions().a(rx.d.a(new j<Object>() { // from class: com.dianping.shield.dynamic.template.DynamicComputeTemplate$compute$subscription$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.e
            public final void onError(@Nullable Throwable th) {
            }

            @Override // rx.e
            public final void onNext(@Nullable Object obj3) {
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "284af175c371ab19ee960d0083bf9e1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "284af175c371ab19ee960d0083bf9e1e");
                } else {
                    kotlin.jvm.functions.b.this.invoke(hashSet);
                }
            }
        }, a2));
    }

    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f4497932db2d3a1acaa90592c711c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f4497932db2d3a1acaa90592c711c3a");
        } else {
            getSubscriptions().unsubscribe();
        }
    }
}
