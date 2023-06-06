package com.dianping.gcmrnmodule.hostwrapper;

import android.view.View;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.util.j;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.as;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleStandardHostWrapper;", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "rootContentView", "Lcom/dianping/gcmrnmodule/contentview/MRNModuleBaseRootView;", Constants.ModelBeanConstants.KEY_BUNDLE_NAME, "", "moduleName", "chassisInterface", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "paintingCallback", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "(Lcom/dianping/gcmrnmodule/contentview/MRNModuleBaseRootView;Ljava/lang/String;Ljava/lang/String;Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;)V", "hostWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "getHostWrapperView", "()Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "setHostWrapperView", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;)V", "addBatchListener", "", "getAliasName", "onLoad", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class d extends com.dianping.gcmrnmodule.hostwrapper.a {
    public static ChangeQuickRedirect h;
    @Nullable
    private com.dianping.gcmrnmodule.wrapperviews.a<?> i;
    private final com.dianping.gcmrnmodule.contentview.a j;
    private final String k;
    private final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@Nullable com.dianping.gcmrnmodule.contentview.a aVar, @Nullable String str, @Nullable String str2, @NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull IDynamicPaintingCallback<? extends DiffableInfo> iDynamicPaintingCallback) {
        super(dynamicChassisInterface, iDynamicPaintingCallback);
        h.b(dynamicChassisInterface, "chassisInterface");
        h.b(iDynamicPaintingCallback, "paintingCallback");
        Object[] objArr = {aVar, str, str2, dynamicChassisInterface, iDynamicPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83a4555a680447ca5f46467859cb2c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83a4555a680447ca5f46467859cb2c4");
            return;
        }
        this.j = aVar;
        this.k = str;
        this.l = str2;
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a
    public final void a(@Nullable com.dianping.gcmrnmodule.wrapperviews.a<?> aVar) {
        this.i = aVar;
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a
    @Nullable
    public final com.dianping.gcmrnmodule.wrapperviews.a<?> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b89bd664a3dbbc54df27426c95811a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b89bd664a3dbbc54df27426c95811a3");
        }
        com.dianping.gcmrnmodule.contentview.a aVar = this.j;
        if (aVar != null) {
            return aVar.getHostWrapperView();
        }
        return null;
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a, com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public final void onLoad() {
        ReactInstanceManager reactInstanceManager;
        ReactContext currentReactContext;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e7cbe41d99866404b97256aae80a94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e7cbe41d99866404b97256aae80a94");
            return;
        }
        com.dianping.gcmrnmodule.contentview.a aVar = this.j;
        if (aVar != null) {
            aVar.setDynamicHostInterface(this);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7093cac280a5bdb318f68dba8192f497", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7093cac280a5bdb318f68dba8192f497");
                return;
            }
            com.dianping.gcmrnmodule.contentview.a aVar2 = this.j;
            if (aVar2 == null || (reactInstanceManager = aVar2.getReactInstanceManager()) == null || (currentReactContext = reactInstanceManager.getCurrentReactContext()) == null) {
                return;
            }
            UIManagerModule uIManagerModule = (UIManagerModule) currentReactContext.getNativeModule(UIManagerModule.class);
            this.c = uIManagerModule != null ? uIManagerModule.getUIImplementation() : null;
            currentReactContext.runOnNativeModulesQueueThread(new a(aVar2, this));
        }
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public final String getAliasName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94af5ad9b40e8afa8bbf0c17b61e4e4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94af5ad9b40e8afa8bbf0c17b61e4e4b");
        }
        return this.k + '^' + this.l;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/dianping/gcmrnmodule/hostwrapper/MRNModuleStandardHostWrapper$addBatchListener$1$1$1", "com/dianping/gcmrnmodule/hostwrapper/MRNModuleStandardHostWrapper$$special$$inlined$let$lambda$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.dianping.gcmrnmodule.contentview.a b;
        public final /* synthetic */ d c;

        public a(com.dianping.gcmrnmodule.contentview.a aVar, d dVar) {
            this.b = aVar;
            this.c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb48b1c09b62a5d4e888982720a62b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb48b1c09b62a5d4e888982720a62b9");
                return;
            }
            as asVar = this.c.c;
            if (asVar != null) {
                asVar.b(this.b.getRootViewTag(), View.MeasureSpec.makeMeasureSpec(j.a(this.c.getHostContext()), 1073741824), 0);
            }
        }
    }
}
