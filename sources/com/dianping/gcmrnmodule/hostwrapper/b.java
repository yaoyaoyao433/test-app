package com.dianping.gcmrnmodule.hostwrapper;

import android.view.View;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.env.ShieldEnvironment;
import com.facebook.react.uimanager.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ-\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleEmbeddedHostWrapper;", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "dynamicChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "paintingCallback", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "parentHostId", "", "subId", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;Ljava/lang/String;Ljava/lang/String;)V", "parentHost", "getParentHost", "()Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "setParentHost", "(Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;)V", "callMethod", "", "method", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getAliasName", "getRootHost", "onLoad", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class b extends a {
    public static ChangeQuickRedirect h;
    @Nullable
    private a i;
    private final String j;
    private final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull IDynamicPaintingCallback<? extends DiffableInfo> iDynamicPaintingCallback, @NotNull String str, @NotNull String str2) {
        super(dynamicChassisInterface, iDynamicPaintingCallback);
        a aVar;
        h.b(dynamicChassisInterface, "dynamicChassis");
        h.b(iDynamicPaintingCallback, "paintingCallback");
        h.b(str, "parentHostId");
        h.b(str2, "subId");
        Object[] objArr = {dynamicChassisInterface, iDynamicPaintingCallback, str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d3d0e678e91db0793b7a4613da6ef96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d3d0e678e91db0793b7a4613da6ef96");
            return;
        }
        this.j = str;
        this.k = str2;
        c cVar = c.c;
        String str3 = this.j;
        Object[] objArr2 = {str3};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "1e5113c6c62800a652ffcc1aa44e705e", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (a) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "1e5113c6c62800a652ffcc1aa44e705e");
        } else {
            h.b(str3, "hostId");
            aVar = c.b.get(str3);
        }
        if (aVar != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            ((ConcurrentHashMap) (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "f05bf0ae9241c6e45c1326e71e57cf48", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "f05bf0ae9241c6e45c1326e71e57cf48") : aVar.f.a())).put(this.k, this);
        } else {
            aVar = null;
        }
        this.i = aVar;
        a aVar2 = this.i;
        this.c = aVar2 != null ? aVar2.c : null;
        as asVar = this.c;
        View j = asVar != null ? asVar.j(Integer.parseInt(this.k)) : null;
        a((com.dianping.gcmrnmodule.wrapperviews.a) (j instanceof com.dianping.gcmrnmodule.wrapperviews.a ? j : null));
        com.dianping.gcmrnmodule.wrapperviews.a<?> a = a();
        if (a != null) {
            a.setHostInterface(this);
        }
    }

    @Nullable
    public final a d() {
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b838ec7c99a9c55771c0259e8d9994c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b838ec7c99a9c55771c0259e8d9994c7");
        }
        if (this.i != null) {
            if (this.i instanceof b) {
                a aVar2 = this.i;
                if (aVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.hostwrapper.MRNModuleEmbeddedHostWrapper");
                }
                aVar = ((b) aVar2).d();
            } else {
                aVar = this.i;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return this;
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public final String getAliasName() {
        List a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5291bd20fe874535b7cf343c08ebc61", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5291bd20fe874535b7cf343c08ebc61");
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == this) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            Class<?> cls = getClass();
            shieldLogger.codeLogError(cls, "Stackoverflow: " + getHostName(), "MRNModuleEmbeddedHostWrapper");
            return "";
        }
        a aVar = this.i;
        if (aVar != null) {
            sb.append(aVar.getAliasName());
            sb.append(CommonConstant.Symbol.XOR);
        }
        a = g.a(getHostName(), new String[]{"#"}, false, 0);
        sb.append((String) a.get(0));
        String sb2 = sb.toString();
        h.a((Object) sb2, "sb.toString()");
        return sb2;
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a, com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public final void onLoad() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de328da39932103e487369f83619925b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de328da39932103e487369f83619925b");
        } else {
            c();
        }
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a, com.dianping.shield.dynamic.protocols.ICommonHost
    public final void callMethod(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "35d865dcb011d141a7386f04852b9fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "35d865dcb011d141a7386f04852b9fb5");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        a aVar = this.i;
        if (aVar != null) {
            aVar.callMethod(str, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
