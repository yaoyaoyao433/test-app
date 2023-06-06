package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.wrapperviews.events.l;
import com.dianping.shield.dynamic.model.module.TabModuleInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNTabModuleItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperView;", "Lcom/dianping/shield/dynamic/model/module/TabModuleInfo;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnHoverStatusChangedProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createInfoInstance", "onHoverStatusChanged", "", "params", "Lorg/json/JSONObject;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class g extends a<TabModuleInfo> implements com.dianping.gcmrnmodule.protocols.f {
    public static ChangeQuickRedirect i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc6cfffd6c1150d63f437a20538994fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc6cfffd6c1150d63f437a20538994fe");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2863c691dfb51f53f1de9e53777573", RobustBitConfig.DEFAULT_VALUE) ? (TabModuleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2863c691dfb51f53f1de9e53777573") : new TabModuleInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.modules.a, com.dianping.gcmrnmodule.protocols.f
    public final void a_(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40bfd1f17afd7fda44d7eb3f1eea9372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40bfd1f17afd7fda44d7eb3f1eea9372");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new l(getId(), jSONObject));
    }
}
