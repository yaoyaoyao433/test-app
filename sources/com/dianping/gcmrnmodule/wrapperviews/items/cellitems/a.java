package com.dianping.gcmrnmodule.wrapperviews.items.cellitems;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.protocols.c;
import com.dianping.gcmrnmodule.protocols.d;
import com.dianping.gcmrnmodule.protocols.e;
import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.events.g;
import com.dianping.gcmrnmodule.wrapperviews.events.k;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;", "T", "Lcom/dianping/shield/dynamic/model/cell/CellInfo$BaseCellInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnExposeProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnDisappearProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnAppearProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "onAppear", "", "params", "Lorg/json/JSONObject;", "onDisappear", "onExpose", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public abstract class a<T extends CellInfo.BaseCellInfo> extends b<T> implements c, d, e {
    public static ChangeQuickRedirect a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d02a664c9146626f6409f6bdce077e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d02a664c9146626f6409f6bdce077e7");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1a45dcdceeea893268c583b9f0a0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1a45dcdceeea893268c583b9f0a0e1");
            return;
        }
        super.h();
        ((CellInfo.BaseCellInfo) getInfo()).setHoverView(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.module.a) {
                CellInfo.BaseCellInfo baseCellInfo = (CellInfo.BaseCellInfo) getInfo();
                ViewInfo childInfo = ((com.dianping.gcmrnmodule.wrapperviews.containers.module.a) bVar).getChildInfo();
                if (!(childInfo instanceof HoverViewInfo)) {
                    childInfo = null;
                }
                baseCellInfo.setHoverView((HoverViewInfo) childInfo);
            }
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.e
    public final void c(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af07766968409bb7ee251f4031309ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af07766968409bb7ee251f4031309ab6");
            return;
        }
        h.b(jSONObject, "params");
        a(new k(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.d
    public final void b(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c29433ee8e34411a878df641ccec52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c29433ee8e34411a878df641ccec52");
            return;
        }
        h.b(jSONObject, "params");
        a(new g(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.c
    public final void a(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1dee8c8f1dc7569ddf8fb7a382fafdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1dee8c8f1dc7569ddf8fb7a382fafdd");
            return;
        }
        h.b(jSONObject, "params");
        a(new com.dianping.gcmrnmodule.wrapperviews.events.c(getId(), jSONObject));
    }
}
