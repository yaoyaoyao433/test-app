package com.dianping.gcmrnmodule.processor;

import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.processor.AbstractProcessorHolder;
import com.dianping.shield.node.processor.AsyncProcessor;
import com.dianping.shield.node.processor.AsyncProcessorChain;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/dianping/gcmrnmodule/processor/MRNComputeProcessorHolder;", "Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "Lcom/dianping/shield/node/processor/AsyncProcessor;", "hostContainer", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "mrnInputComputeChain", "Lcom/dianping/shield/node/processor/AsyncProcessorChain;", "getMrnInputComputeChain", "()Lcom/dianping/shield/node/processor/AsyncProcessorChain;", "mrnInputComputeChain$delegate", "Lkotlin/Lazy;", "initProcessor", "key", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class b extends AbstractProcessorHolder<AsyncProcessor> {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] b = {u.a(new s(u.a(b.class), "mrnInputComputeChain", "getMrnInputComputeChain()Lcom/dianping/shield/node/processor/AsyncProcessorChain;"))};
    @NotNull
    public final d c;
    private final DynamicChassisInterface d;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/node/processor/AsyncProcessorChain;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<AsyncProcessorChain> {
        public static ChangeQuickRedirect a;

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ AsyncProcessorChain invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e88c3097f30dcbedc4dae6bf66b958dd", RobustBitConfig.DEFAULT_VALUE) ? (AsyncProcessorChain) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e88c3097f30dcbedc4dae6bf66b958dd") : new AsyncProcessorChain(b.this).addProcessor(com.dianping.gcmrnmodule.processor.a.class);
        }
    }

    public b(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostContainer");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7570a2dcc142d0eac7cab48f3ebdd186", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7570a2dcc142d0eac7cab48f3ebdd186");
            return;
        }
        this.d = dynamicChassisInterface;
        this.c = e.a(kotlin.i.NONE, new a());
    }

    @Override // com.dianping.shield.node.processor.AbstractProcessorHolder
    public final /* synthetic */ AsyncProcessor initProcessor(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc33e3aeaee6ae1c6d508122407fb661", RobustBitConfig.DEFAULT_VALUE)) {
            return (AsyncProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc33e3aeaee6ae1c6d508122407fb661");
        }
        h.b(obj, "key");
        if (h.a(obj, com.dianping.gcmrnmodule.processor.a.class)) {
            return new com.dianping.gcmrnmodule.processor.a(this.d);
        }
        return null;
    }
}
