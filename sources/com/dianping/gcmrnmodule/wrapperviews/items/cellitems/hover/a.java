package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover;

import com.dianping.gcmrnmodule.protocols.b;
import com.dianping.gcmrnmodule.protocols.f;
import com.dianping.gcmrnmodule.protocols.g;
import com.dianping.gcmrnmodule.protocols.h;
import com.dianping.gcmrnmodule.wrapperviews.c;
import com.dianping.gcmrnmodule.wrapperviews.events.l;
import com.dianping.gcmrnmodule.wrapperviews.events.v;
import com.dianping.shield.dynamic.model.cell.HoverCellInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.extra.ScrollEventInfo;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/hover/MRNModuleHoverCellItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;", "Lcom/dianping/shield/dynamic/model/cell/HoverCellInfo;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnSelectProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnHoverStatusChangedProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnScrollEventProtocol;", "Lcom/dianping/gcmrnmodule/protocols/IMRNViewInterface;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "hoverScrollEvent", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "getHoverScrollEvent", "()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "hoverScrollEvent$delegate", "Lkotlin/Lazy;", "moduleView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "createInfoInstance", "getMRNView", "onHoverStatusChanged", "", "params", "Lorg/json/JSONObject;", "onSelect", "setMRNView", Constants.EventType.VIEW, "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a<HoverCellInfo> implements b, f, g, h {
    public static ChangeQuickRedirect g;
    public static final /* synthetic */ i[] h = {u.a(new s(u.a(a.class), "hoverScrollEvent", "getHoverScrollEvent()Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;"))};
    private c i;
    @NotNull
    private final d j;

    @NotNull
    public final ScrollEvent getHoverScrollEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return (ScrollEvent) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72911b79d0adca86cd88f1496e5d1af5", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72911b79d0adca86cd88f1496e5d1af5") : this.j.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/dynamic/model/extra/ScrollEventInfo;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0070a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ScrollEventInfo> {
        public static ChangeQuickRedirect a;
        public static final C0070a b = new C0070a();

        public C0070a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ScrollEventInfo invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f9f50f08442b928805afa29851605d", RobustBitConfig.DEFAULT_VALUE) ? (ScrollEventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f9f50f08442b928805afa29851605d") : new ScrollEventInfo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c88591db5c77d0fc8d76313cb0b89a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c88591db5c77d0fc8d76313cb0b89a");
        } else {
            this.j = e.a(kotlin.i.NONE, C0070a.b);
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void a(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14195c4e0d389fb3bf4d52b0ec71160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14195c4e0d389fb3bf4d52b0ec71160");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.a(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void b(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b12113f289df2856aede75d628430e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b12113f289df2856aede75d628430e");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.b(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void c(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cc3b22cd8ecdf77e3591f63a4b2cbb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cc3b22cd8ecdf77e3591f63a4b2cbb8");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.c(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void d(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3edf6e57010424a1d848bad87a6778f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3edf6e57010424a1d848bad87a6778f8");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.d(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void e(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f1ebc574c6331b2053708d7f1a8839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f1ebc574c6331b2053708d7f1a8839");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.e(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d884201834c2f26887ded4601f75fd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoverCellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d884201834c2f26887ded4601f75fd9");
        }
        HoverCellInfo hoverCellInfo = new HoverCellInfo();
        hoverCellInfo.setViewType(Integer.valueOf(DMConstant.DynamicModuleViewType.MRNView.ordinal()));
        return hoverCellInfo;
    }

    @Override // com.dianping.gcmrnmodule.protocols.f
    public final void a_(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470505e2850e3548f8cad20ef598a753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470505e2850e3548f8cad20ef598a753");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new l(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8cbb0030c83223c6436c31fe37821ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8cbb0030c83223c6436c31fe37821ce");
            return;
        }
        super.h();
        ((HoverCellInfo) getInfo()).setHoverScrollEvent(getHoverScrollEvent());
        HoverCellInfo hoverCellInfo = (HoverCellInfo) getInfo();
        StringBuilder sb = new StringBuilder("{\"viewWidth\":");
        c cVar = this.i;
        sb.append(cVar != null ? cVar.getWidth() : 0);
        sb.append(",\"viewHeight\":");
        c cVar2 = this.i;
        sb.append(cVar2 != null ? cVar2.getHeight() : 0);
        sb.append('}');
        hoverCellInfo.setData(sb.toString());
        HoverCellInfo hoverCellInfo2 = (HoverCellInfo) getInfo();
        c cVar3 = this.i;
        hoverCellInfo2.setViewReactTag(Integer.valueOf(cVar3 != null ? cVar3.getId() : com.dianping.gcmrnmodule.wrapperviews.b.e));
    }

    @Override // com.dianping.gcmrnmodule.protocols.h
    public final void d(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6655ee919454fafd2527a1f66011100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6655ee919454fafd2527a1f66011100");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new v(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.b
    public final void setMRNView(@Nullable c cVar) {
        this.i = cVar;
    }

    @Nullable
    public final c getMRNView() {
        return this.i;
    }
}
