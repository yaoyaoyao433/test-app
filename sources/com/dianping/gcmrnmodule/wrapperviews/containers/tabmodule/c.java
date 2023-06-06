package com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.protocols.g;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.extra.ScrollEventInfo;
import com.dianping.shield.dynamic.model.module.TabModuleConfigInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
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
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabsModulesContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/base/MRNModuleBaseListContainerWrapperView;", "Lcom/dianping/shield/dynamic/model/module/TabModuleConfigInfo;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnScrollEventProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "pageChangeScrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "getPageChangeScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "pageChangeScrollEvent$delegate", "Lkotlin/Lazy;", "addChildWrapperView", "", "child", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "index", "", "assertIsChildAndGetInfo", "childWrapperView", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class c extends com.dianping.gcmrnmodule.wrapperviews.containers.base.b<TabModuleConfigInfo> implements g {
    public static ChangeQuickRedirect g;
    public static final /* synthetic */ i[] h = {u.a(new s(u.a(c.class), "pageChangeScrollEvent", "getPageChangeScrollEvent()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;"))};
    @NotNull
    private final d i;

    @NotNull
    public final ScrollEvent getPageChangeScrollEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return (ScrollEvent) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560d6ec2576c5fc7c6e6c6f2c0dd19c7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560d6ec2576c5fc7c6e6c6f2c0dd19c7") : this.i.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/model/extra/ScrollEventInfo;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ScrollEventInfo> {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ScrollEventInfo invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b164e2862d312764599b2777217ab9ae", RobustBitConfig.DEFAULT_VALUE) ? (ScrollEventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b164e2862d312764599b2777217ab9ae") : new ScrollEventInfo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfed566ba410de506c2ef5ba19579bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfed566ba410de506c2ef5ba19579bc3");
        } else {
            this.i = e.a(kotlin.i.NONE, a.b);
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.base.b
    public final /* synthetic */ TabModuleConfigInfo a(com.dianping.gcmrnmodule.wrapperviews.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c995f51cc62c8056aa2d15ed20594439", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabModuleConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c995f51cc62c8056aa2d15ed20594439");
        }
        h.b(bVar, "childWrapperView");
        if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a) {
            return ((com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a) bVar).getInfo();
        }
        return null;
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void a(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb66cbbabb83d351cb3b8820d19d0cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb66cbbabb83d351cb3b8820d19d0cd");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.a(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void b(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38f2c4105b6bcda25a80f31c743b04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38f2c4105b6bcda25a80f31c743b04a");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.b(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void c(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "145843dfec52f5f3865d134f13d48765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "145843dfec52f5f3865d134f13d48765");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.c(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void d(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1803228e90b60ae3a8c0001397694b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1803228e90b60ae3a8c0001397694b");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.d(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void e(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd2db2f41fbb9e049058f20239a5e924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd2db2f41fbb9e049058f20239a5e924");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.e(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void a(@NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d07b303ecea72c59f4d9d5036134d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d07b303ecea72c59f4d9d5036134d7");
            return;
        }
        h.b(bVar, "child");
        super.a(bVar, i);
        if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a) {
            ((com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a) bVar).setIndex(i);
        }
    }
}
