package com.dianping.gcmrnmodule.wrapperviews.items.viewitems;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.protocols.d;
import com.dianping.gcmrnmodule.protocols.e;
import com.dianping.gcmrnmodule.protocols.h;
import com.dianping.gcmrnmodule.wrapperviews.events.g;
import com.dianping.gcmrnmodule.wrapperviews.events.k;
import com.dianping.gcmrnmodule.wrapperviews.events.v;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\r\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemWrapperView;", "T", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnSelectProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnExposeProtocol;", "Lcom/dianping/gcmrnmodule/protocols/IMRNViewInterface;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnDisappearProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnAppearProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "moduleView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "createInfoInstance", "()Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "createViewInfo", "getMRNView", "onAppear", "", "params", "Lorg/json/JSONObject;", "onDisappear", "onExpose", "onSelect", "setMRNView", Constants.EventType.VIEW, "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class c<T extends ViewInfo> extends com.dianping.gcmrnmodule.wrapperviews.b<T> implements com.dianping.gcmrnmodule.protocols.b, com.dianping.gcmrnmodule.protocols.c, d, e, h {
    public static ChangeQuickRedirect g;
    private com.dianping.gcmrnmodule.wrapperviews.c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90a6ee7445654729ee8b593c361b216d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90a6ee7445654729ee8b593c361b216d");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4041d4132827a31f7f6b7138b0c4b94b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4041d4132827a31f7f6b7138b0c4b94b");
        }
        ViewInfo a = a();
        a.setViewType(Integer.valueOf(DMConstant.DynamicModuleViewType.MRNView.ordinal()));
        if (a != null) {
            return a;
        }
        throw new o("null cannot be cast to non-null type T");
    }

    @NotNull
    public ViewInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c490491d3a6df6e90a7f4f820007b1", RobustBitConfig.DEFAULT_VALUE) ? (ViewInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c490491d3a6df6e90a7f4f820007b1") : new ViewInfo();
    }

    @Override // com.dianping.gcmrnmodule.protocols.h
    public final void d(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5414748f919e9d59ac92cb7535f4c940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5414748f919e9d59ac92cb7535f4c940");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new v(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.e
    public final void c(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338775fc59d22eb43e98bc72a984c635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338775fc59d22eb43e98bc72a984c635");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new k(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.c
    public final void a(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088b80c785f09065c1fb49768dee33f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088b80c785f09065c1fb49768dee33f0");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new com.dianping.gcmrnmodule.wrapperviews.events.c(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.d
    public final void b(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a59bdbc25a40dd6f3fea686abacd77d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a59bdbc25a40dd6f3fea686abacd77d9");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new g(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e7b3cb0b2d57c5c7cdb9f511f2af8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e7b3cb0b2d57c5c7cdb9f511f2af8e");
            return;
        }
        super.h();
        ViewInfo viewInfo = (ViewInfo) getInfo();
        StringBuilder sb = new StringBuilder("{\"viewWidth\":");
        com.dianping.gcmrnmodule.wrapperviews.c cVar = this.a;
        sb.append(cVar != null ? cVar.getWidth() : 0);
        sb.append(",\"viewHeight\":");
        com.dianping.gcmrnmodule.wrapperviews.c cVar2 = this.a;
        sb.append(cVar2 != null ? cVar2.getHeight() : 0);
        sb.append('}');
        viewInfo.setData(sb.toString());
        ((ViewInfo) getInfo()).setIdentifier(String.valueOf(getId()));
        ViewInfo viewInfo2 = (ViewInfo) getInfo();
        com.dianping.gcmrnmodule.wrapperviews.c cVar3 = this.a;
        viewInfo2.setViewReactTag(Integer.valueOf(cVar3 != null ? cVar3.getId() : com.dianping.gcmrnmodule.wrapperviews.b.e));
    }

    @Override // com.dianping.gcmrnmodule.protocols.b
    public void setMRNView(@Nullable com.dianping.gcmrnmodule.wrapperviews.c cVar) {
        this.a = cVar;
    }

    @Nullable
    public com.dianping.gcmrnmodule.wrapperviews.c getMRNView() {
        return this.a;
    }
}
