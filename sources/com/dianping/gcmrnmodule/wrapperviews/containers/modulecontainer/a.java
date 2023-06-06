package com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.c;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.f;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.g;
import com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent;
import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/modulecontainer/MRNModuleModuleContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "Lcom/dianping/shield/dynamic/model/vc/ModuleKeyUnionType$StringKey;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "moduleBaseHostWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "moduleKey", "", "getModuleKey", "()Ljava/lang/String;", "setModuleKey", "(Ljava/lang/String;)V", "parentHostId", "getParentHostId", "addChildWrapperView", "", "child", "index", "", "createInfoInstance", "removeChildWrapperViewAt", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends b<ModuleKeyUnionType.StringKey> {
    public static ChangeQuickRedirect a;
    private com.dianping.gcmrnmodule.wrapperviews.a<?> g;
    @Nullable
    private String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2127a8ce72bdf3181e78bb094d860668", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2127a8ce72bdf3181e78bb094d860668");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ ModuleKeyUnionType.StringKey g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf328ac246d0663f1095867b1e9735b", RobustBitConfig.DEFAULT_VALUE) ? (ModuleKeyUnionType.StringKey) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf328ac246d0663f1095867b1e9735b") : new ModuleKeyUnionType.StringKey(null);
    }

    @Nullable
    public final String getModuleKey() {
        return this.h;
    }

    public final void setModuleKey(@Nullable String str) {
        this.h = str;
    }

    private final String getParentHostId() {
        com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b774677beb6bbda33da0a3a1d9a07d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b774677beb6bbda33da0a3a1d9a07d9");
        }
        com.dianping.gcmrnmodule.wrapperviews.a<?> hostWrapperView = getHostWrapperView();
        if (hostWrapperView == null || (hostInterface = hostWrapperView.getHostInterface()) == null) {
            return null;
        }
        return hostInterface.e;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641af76a5275dc513f2bff36b05001ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641af76a5275dc513f2bff36b05001ac");
            return;
        }
        super.h();
        ModuleKeyUnionType.StringKey info = getInfo();
        String str = this.h;
        if (str != null) {
            com.dianping.gcmrnmodule.wrapperviews.a<?> aVar = this.g;
            if (aVar instanceof c) {
                StringBuilder sb = new StringBuilder("mrn_");
                sb.append(str);
                sb.append('#');
                sb.append(getParentHostId());
                sb.append("__");
                com.dianping.gcmrnmodule.wrapperviews.a<?> aVar2 = this.g;
                if (aVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNModuleItemWrapperView");
                }
                sb.append(((c) aVar2).getId());
                str = sb.toString();
            } else if (aVar instanceof f) {
                StringBuilder sb2 = new StringBuilder(ConfigurableScrollTabAgent.MRN_SCROLL_TAB_PREFIX);
                sb2.append(str);
                sb2.append('#');
                sb2.append(getParentHostId());
                sb2.append("__");
                com.dianping.gcmrnmodule.wrapperviews.a<?> aVar3 = this.g;
                if (aVar3 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNScrollTabModuleItemWrapperView");
                }
                sb2.append(((f) aVar3).getId());
                str = sb2.toString();
            } else if (aVar instanceof g) {
                StringBuilder sb3 = new StringBuilder("mrntab_");
                sb3.append(str);
                sb3.append('#');
                sb3.append(getParentHostId());
                sb3.append("__");
                com.dianping.gcmrnmodule.wrapperviews.a<?> aVar4 = this.g;
                if (aVar4 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNTabModuleItemWrapperView");
                }
                sb3.append(((g) aVar4).getId());
                str = sb3.toString();
            } else if (aVar instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.b) {
                StringBuilder sb4 = new StringBuilder("mrncontainer_");
                sb4.append(str);
                sb4.append('#');
                sb4.append(getParentHostId());
                sb4.append("__");
                com.dianping.gcmrnmodule.wrapperviews.a<?> aVar5 = this.g;
                if (aVar5 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNContainerModuleItemWrapperView");
                }
                sb4.append(((com.dianping.gcmrnmodule.wrapperviews.items.modules.b) aVar5).getId());
                str = sb4.toString();
            }
        } else {
            str = null;
        }
        info.setKey(str);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void a(@NotNull b<?> bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fdccfe5c347e371a5041b00f00defb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fdccfe5c347e371a5041b00f00defb0");
            return;
        }
        h.b(bVar, "child");
        if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.a) {
            this.g = (com.dianping.gcmrnmodule.wrapperviews.a) bVar;
        }
        super.a(bVar, i);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    @Nullable
    public final b<?> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4313d8c88b93f5b914154648e1325c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4313d8c88b93f5b914154648e1325c");
        }
        if (this.g != null) {
            this.g = null;
        }
        return super.a(i);
    }
}
