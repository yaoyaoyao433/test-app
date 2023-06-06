package com.dianping.shield.dynamic.template;

import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.processor.AsyncProcessor;
import com.dianping.shield.node.processor.OnAsyncProcessorFinishListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/dynamic/template/ComputeInputTemplate;", "", "processor", "Lcom/dianping/shield/node/processor/AsyncProcessor;", "(Lcom/dianping/shield/node/processor/AsyncProcessor;)V", "errorSet", "Ljava/util/HashSet;", "", "getProcessor", "()Lcom/dianping/shield/node/processor/AsyncProcessor;", "computeInput", "Lrx/Observable;", "diffViewItems", "", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ComputeInputTemplate {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HashSet<String> errorSet;
    @NotNull
    private final AsyncProcessor processor;

    public ComputeInputTemplate(@NotNull AsyncProcessor asyncProcessor) {
        h.b(asyncProcessor, "processor");
        Object[] objArr = {asyncProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bc4634d26109918c2bd03f8ce3d7d07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bc4634d26109918c2bd03f8ce3d7d07");
            return;
        }
        this.processor = asyncProcessor;
        this.errorSet = new HashSet<>();
    }

    @NotNull
    public final AsyncProcessor getProcessor() {
        return this.processor;
    }

    @NotNull
    public final d<Object> computeInput(@NotNull final List<? extends IDynamicModuleViewItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35f0e5536e63115bd499570a4afece6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35f0e5536e63115bd499570a4afece6f");
        }
        h.b(list, "diffViewItems");
        d<Object> a = d.a(new d.a<T>() { // from class: com.dianping.shield.dynamic.template.ComputeInputTemplate$computeInput$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public final void call(final j<? super Object> jVar) {
                HashSet hashSet;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f644abdd68862bf8852d806c542a9c3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f644abdd68862bf8852d806c542a9c3a");
                    return;
                }
                hashSet = ComputeInputTemplate.this.errorSet;
                ComputeInputTemplate.this.getProcessor().startProcessor(new OnAsyncProcessorFinishListener() { // from class: com.dianping.shield.dynamic.template.ComputeInputTemplate$computeInput$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.processor.OnAsyncProcessorFinishListener
                    public final void onDataHandleComplete(boolean z) {
                        HashSet hashSet2;
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d71554c2d2801f043e7083667c8650b4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d71554c2d2801f043e7083667c8650b4");
                            return;
                        }
                        j jVar2 = jVar;
                        hashSet2 = ComputeInputTemplate.this.errorSet;
                        jVar2.onNext(hashSet2);
                    }
                }, list, hashSet);
            }
        });
        h.a((Object) a, "Observable.create { subs…tems, errorSet)\n        }");
        return a;
    }
}
