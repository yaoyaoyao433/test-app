package com.dianping.shield.dynamic.processor;

import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.template.ComputeInputTemplate;
import com.dianping.shield.node.processor.ObserverAsyncProcessor;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.x;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import rx.d;
import rx.functions.k;
import rx.j;
import rx.subscriptions.b;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\\\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018J\b\u0010\u0019\u001a\u00020\u0014H\u0014J;\u0010\u001a\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, d2 = {"Lcom/dianping/shield/dynamic/processor/StepComputeProcessor;", "Lcom/dianping/shield/node/processor/ObserverAsyncProcessor;", Constants.SPEED_METER_STEP, "", "(I)V", "getStep", "()I", "computeInput", "", "subscriber", "Lrx/Subscriber;", "", "subscribers", "Lrx/subscriptions/CompositeSubscription;", "itemsMap", "", "", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "paintingErrorSet", "", "", "computeList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/template/ComputeInputTemplate;", "Lkotlin/collections/ArrayList;", "getName", "handleData", "obj", "", "", "(Lrx/Subscriber;Lrx/subscriptions/CompositeSubscription;[Ljava/lang/Object;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StepComputeProcessor extends ObserverAsyncProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int step;

    public StepComputeProcessor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0293cb34aff4b4d055c271f7c70f92c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0293cb34aff4b4d055c271f7c70f92c9");
        } else {
            this.step = i;
        }
    }

    public final int getStep() {
        return this.step;
    }

    public final void computeInput(@NotNull final j<Boolean> jVar, @NotNull final b bVar, @NotNull Map<Integer, ? extends List<? extends IDynamicModuleViewItem>> map, @NotNull final Set<String> set, @NotNull final ArrayList<ComputeInputTemplate> arrayList) {
        Object[] objArr = {jVar, bVar, map, set, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a92ecf217c898b97607b434baf91f9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a92ecf217c898b97607b434baf91f9d");
            return;
        }
        h.b(jVar, "subscriber");
        h.b(bVar, "subscribers");
        h.b(map, "itemsMap");
        h.b(set, "paintingErrorSet");
        h.b(arrayList, "computeList");
        List<? extends IDynamicModuleViewItem> list = map.get(Integer.valueOf(this.step));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ComputeInputTemplate computeInputTemplate : arrayList) {
                arrayList2.add(computeInputTemplate.computeInput(list));
            }
            bVar.a(d.a((List) arrayList2, (k) new k<R>() { // from class: com.dianping.shield.dynamic.processor.StepComputeProcessor$computeInput$1$subscription$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.k
                @NotNull
                public final ArrayList<Object> call(Object[] objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7eb6ca74f79f644e50bc8fe981d57987", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ArrayList) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7eb6ca74f79f644e50bc8fe981d57987");
                    }
                    ArrayList<Object> arrayList3 = new ArrayList<>();
                    for (Object obj : objArr2) {
                        arrayList3.add(obj);
                    }
                    return arrayList3;
                }
            }).a(1).c(new rx.functions.b<ArrayList<Object>>() { // from class: com.dianping.shield.dynamic.processor.StepComputeProcessor$computeInput$$inlined$let$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public final void call(ArrayList<Object> arrayList3) {
                    Object[] objArr2 = {arrayList3};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1f30675bf4de6ab20c37ad9610145251", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1f30675bf4de6ab20c37ad9610145251");
                        return;
                    }
                    h.a((Object) arrayList3, Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
                    for (T t : arrayList3) {
                        if (t instanceof Set) {
                            set.addAll((Set) t);
                        }
                    }
                    jVar.onNext(Boolean.FALSE);
                }
            }));
            return;
        }
        jVar.onNext(Boolean.FALSE);
    }

    @Override // com.dianping.shield.node.processor.ObserverAsyncProcessor
    public final void handleData(@NotNull j<Boolean> jVar, @NotNull b bVar, @NotNull Object... objArr) {
        Object[] objArr2 = {jVar, bVar, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7501f0db150f7f9c7e45a842ec9c2902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7501f0db150f7f9c7e45a842ec9c2902");
            return;
        }
        h.b(jVar, "subscriber");
        h.b(bVar, "subscribers");
        h.b(objArr, "obj");
        if (objArr.length == 3 && (objArr[0] instanceof Map) && (objArr[1] instanceof Set) && (objArr[2] instanceof List)) {
            Object obj = objArr[0];
            if (obj == null) {
                throw new o("null cannot be cast to non-null type kotlin.collections.Map<kotlin.Int, kotlin.collections.List<com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem>>");
            }
            Map<Integer, ? extends List<? extends IDynamicModuleViewItem>> map = (Map) obj;
            Object obj2 = objArr[1];
            if (obj2 == null) {
                throw new o("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
            }
            Set<String> a = x.a(obj2);
            Object obj3 = objArr[2];
            if (obj3 == null) {
                throw new o("null cannot be cast to non-null type kotlin.collections.ArrayList<com.dianping.shield.dynamic.template.ComputeInputTemplate> /* = java.util.ArrayList<com.dianping.shield.dynamic.template.ComputeInputTemplate> */");
            }
            computeInput(jVar, bVar, map, a, (ArrayList) obj3);
        }
    }

    @Override // com.dianping.shield.node.processor.ObserverAsyncProcessor
    @NotNull
    public final String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc32c033ee27fb26ce34208d42d9446a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc32c033ee27fb26ce34208d42d9446a");
        }
        return "StepComputeProcessor_" + this.step;
    }
}
