package com.dianping.gcmrnmodule.wrapperviews.shadow;

import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ah;
import com.facebook.react.uimanager.bg;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleViewHostWrapperShadowView;", "Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleBaseWrapperShadowView;", "()V", "hostShadowNode", "Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleWrapperHostWrapperShadowView;", "getHostShadowNode", "()Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleWrapperHostWrapperShadowView;", "setHostShadowNode", "(Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleWrapperHostWrapperShadowView;)V", "<set-?>", "Lcom/facebook/yoga/YogaNode;", "hostYogaNode", "getHostYogaNode", "()Lcom/facebook/yoga/YogaNode;", "hostYogaNodePointer", "", "getHostYogaNodePointer", "()Ljava/lang/Long;", "setHostYogaNodePointer", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "originYogaNode", "addChildAt", "", "child", "Lcom/facebook/react/uimanager/ReactShadowNodeImpl;", "i", "", "dispose", "isWrapperLeafNode", "", "isYogaLeafNode", "markUpdated", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleViewHostWrapperShadowView extends MRNModuleBaseWrapperShadowView {
    public static ChangeQuickRedirect c;
    public static final a g = new a(null);
    @NotNull
    private static com.facebook.yoga.a i;
    @Nullable
    MRNModuleWrapperHostWrapperShadowView d;
    @Nullable
    Long e;
    @Nullable
    d f;
    private d h;

    @Override // com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView
    public final boolean a() {
        return true;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView, com.facebook.react.uimanager.ReactShadowNodeImpl
    public final boolean isYogaLeafNode() {
        return false;
    }

    public MRNModuleViewHostWrapperShadowView() {
        d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16208ec8130c15b3765c389da9e55403", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16208ec8130c15b3765c389da9e55403");
            return;
        }
        this.h = com.dianping.gcmrnmodule.wrapperviews.shadow.a.b.a(this);
        d acquire = bg.a().acquire();
        this.f = acquire == null ? d.a(i) : acquire;
        this.e = com.dianping.gcmrnmodule.wrapperviews.shadow.a.b.a(this.f);
        d dVar2 = this.f;
        if (dVar2 == null || (dVar = this.h) == null) {
            return;
        }
        dVar2.a(dVar, 0);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/shadow/MRNModuleViewHostWrapperShadowView$Companion;", "", "()V", "yogaConfig", "Lcom/facebook/yoga/YogaConfig;", "getYogaConfig", "()Lcom/facebook/yoga/YogaConfig;", "setYogaConfig", "(Lcom/facebook/yoga/YogaConfig;)V", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    static {
        com.facebook.yoga.a a2 = ah.a();
        h.a((Object) a2, "ReactYogaConfigProvider.get()");
        i = a2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView, com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public final void addChildAt(@Nullable ReactShadowNodeImpl reactShadowNodeImpl, int i2) {
        Object[] objArr = {reactShadowNodeImpl, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cb4a929f53be34e8902a7edf7c791fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cb4a929f53be34e8902a7edf7c791fb");
            return;
        }
        super.addChildAt(reactShadowNodeImpl, i2);
        if ((reactShadowNodeImpl instanceof MRNModuleShadowView) || (reactShadowNodeImpl instanceof MRNModuleViewItemWrapperShadowView)) {
            a(this);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final void markUpdated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a52cd467a5860a2ee8a97703034833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a52cd467a5860a2ee8a97703034833");
            return;
        }
        super.markUpdated();
        MRNModuleWrapperHostWrapperShadowView mRNModuleWrapperHostWrapperShadowView = this.d;
        if (mRNModuleWrapperHostWrapperShadowView != null) {
            mRNModuleWrapperHostWrapperShadowView.markUpdated();
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView, com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public final void dispose() {
        HashSet<MRNModuleViewHostWrapperShadowView> hashSet;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c65cf082959599f5f18b76fb7bdb89e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c65cf082959599f5f18b76fb7bdb89e");
            return;
        }
        MRNModuleWrapperHostWrapperShadowView mRNModuleWrapperHostWrapperShadowView = this.d;
        if (mRNModuleWrapperHostWrapperShadowView != null && (hashSet = mRNModuleWrapperHostWrapperShadowView.b) != null) {
            hashSet.remove(this);
        }
        Long l = this.e;
        if (l != null) {
            MRNModuleNative.mrnmoduleYogaRemoveParent(l.longValue());
        }
        d dVar = this.f;
        if (dVar != null) {
            dVar.b(0);
            dVar.b();
            bg.a().release(dVar);
        }
        this.h = null;
        super.dispose();
    }
}
