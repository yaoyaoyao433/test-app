package com.dianping.gcmrnmodule.protocols;

import com.dianping.gcmrnmodule.wrapperviews.events.u;
import com.dianping.shield.component.entity.ScrollEventBean;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u001e\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\u001e\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\u001e\u0010\r\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\u001e\u0010\u000e\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\u001e\u0010\u000f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnScrollEventProtocol;", "", "dispatchScrollEvent", "", "scrollEventBean", "Lcom/dianping/shield/component/entity/ScrollEventBean;", "type", "Lcom/facebook/react/views/scroll/ScrollEventType;", Constants.EventType.VIEW, "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "params", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "onScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, DMKeys.KEY_ON_SCROLL_END_DRAG, "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public interface g {
    void a(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar);

    void b(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar);

    void c(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar);

    void d(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar);

    void e(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;

        public static void a(g gVar, @Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
            Object[] objArr = {gVar, obj, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4aca75ba8a44610a292b702415fae701", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4aca75ba8a44610a292b702415fae701");
                return;
            }
            kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
            if (obj instanceof ScrollEventBean) {
                a(gVar, (ScrollEventBean) obj, com.facebook.react.views.scroll.i.BEGIN_DRAG, bVar);
            }
        }

        public static void b(g gVar, @Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
            Object[] objArr = {gVar, obj, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50419e849cc324c90037905160fcb1bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50419e849cc324c90037905160fcb1bf");
                return;
            }
            kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
            if (obj instanceof ScrollEventBean) {
                a(gVar, (ScrollEventBean) obj, com.facebook.react.views.scroll.i.END_DRAG, bVar);
            }
        }

        public static void c(g gVar, @Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
            Object[] objArr = {gVar, obj, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0eb9c0da82b2d01aea0b9b5d65b3ad7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0eb9c0da82b2d01aea0b9b5d65b3ad7");
                return;
            }
            kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
            if (obj instanceof ScrollEventBean) {
                a(gVar, (ScrollEventBean) obj, com.facebook.react.views.scroll.i.SCROLL, bVar);
            }
        }

        public static void d(g gVar, @Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
            Object[] objArr = {gVar, obj, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0047132c08228bee5ea01dc1dbff7ed7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0047132c08228bee5ea01dc1dbff7ed7");
                return;
            }
            kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
            if (obj instanceof ScrollEventBean) {
                a(gVar, (ScrollEventBean) obj, com.facebook.react.views.scroll.i.MOMENTUM_BEGIN, bVar);
            }
        }

        public static void e(g gVar, @Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
            Object[] objArr = {gVar, obj, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "583e1ff1e50648b4caa8ee6c60f10c07", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "583e1ff1e50648b4caa8ee6c60f10c07");
                return;
            }
            kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
            if (obj instanceof ScrollEventBean) {
                a(gVar, (ScrollEventBean) obj, com.facebook.react.views.scroll.i.MOMENTUM_END, bVar);
            }
        }

        private static void a(g gVar, ScrollEventBean scrollEventBean, com.facebook.react.views.scroll.i iVar, com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
            Object[] objArr = {gVar, scrollEventBean, iVar, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "389dd93cd4e1df6f8efe534ba87c2707", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "389dd93cd4e1df6f8efe534ba87c2707");
                return;
            }
            u a2 = u.a(bVar.getId(), scrollEventBean, iVar);
            kotlin.jvm.internal.h.a((Object) a2, "OnScrollEvent.obtain(\n  …           type\n        )");
            bVar.a(a2);
        }
    }
}
