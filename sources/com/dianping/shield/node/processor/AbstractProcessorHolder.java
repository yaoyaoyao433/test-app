package com.dianping.shield.node.processor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0002\u0010\rR*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "T", "", "()V", "processorMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "addProcessor", "", "key", "processor", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getProcessor", "(Ljava/lang/Object;)Ljava/lang/Object;", "initProcessor", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class AbstractProcessorHolder<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<Object, T> processorMap;

    @Nullable
    public abstract T initProcessor(@NotNull Object obj);

    public AbstractProcessorHolder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15d68905ce92f5fb844635facc99972a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15d68905ce92f5fb844635facc99972a");
        } else {
            this.processorMap = new HashMap<>();
        }
    }

    public void addProcessor(@NotNull Object obj, T t) {
        Object[] objArr = {obj, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4494e14afd2432f9a38c4f3d6c5c2fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4494e14afd2432f9a38c4f3d6c5c2fda");
            return;
        }
        h.b(obj, "key");
        this.processorMap.put(obj, t);
    }

    @Nullable
    public T getProcessor(@NotNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4471ea0a75965edea335eb30b047a88", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4471ea0a75965edea335eb30b047a88");
        }
        h.b(obj, "key");
        T t = this.processorMap.get(obj);
        if (t == null && (t = initProcessor(obj)) != null) {
            addProcessor(obj, t);
        }
        return t;
    }
}
