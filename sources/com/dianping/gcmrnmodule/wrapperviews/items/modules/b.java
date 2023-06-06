package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.annotation.SuppressLint;
import com.dianping.shield.dynamic.model.module.ContainerModuleInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNContainerModuleItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "Lcom/dianping/shield/dynamic/model/module/ContainerModuleInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", DMKeys.KEY_MODULE_KEYS, "Lcom/dianping/gcmrnmodule/objects/ModuleKeys;", "createInfoInstance", "setModuleKeys", "", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class b extends com.dianping.gcmrnmodule.wrapperviews.a<ContainerModuleInfo> {
    public static ChangeQuickRedirect g;
    private com.dianping.gcmrnmodule.objects.d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8258b29a4aedd269662db3637c649448", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8258b29a4aedd269662db3637c649448");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb5ee3d79048443c211551ea7b25a5a", RobustBitConfig.DEFAULT_VALUE) ? (ContainerModuleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb5ee3d79048443c211551ea7b25a5a") : new ContainerModuleInfo();
    }

    public final void setModuleKeys(@Nullable com.dianping.gcmrnmodule.objects.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd2994f8681e7ae8dad37a83a0f2454f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd2994f8681e7ae8dad37a83a0f2454f");
        } else if (dVar != null) {
            this.h = dVar;
            ((ContainerModuleInfo) getInfo()).setModuleKeys(dVar.b);
        } else {
            this.h = null;
            ((ContainerModuleInfo) getInfo()).setModuleKeys(null);
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a aVar;
        String moduleKey;
        com.dianping.gcmrnmodule.objects.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6338c8ec86f8ac46df6ef4c6374ca925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6338c8ec86f8ac46df6ef4c6374ca925");
            return;
        }
        super.h();
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            com.dianping.gcmrnmodule.wrapperviews.b bVar = (com.dianping.gcmrnmodule.wrapperviews.b) it.next();
            if ((bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) && (moduleKey = (aVar = (com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) bVar).getModuleKey()) != null && (dVar = this.h) != null) {
                dVar.a(moduleKey, aVar.getInfo());
            }
        }
    }
}
