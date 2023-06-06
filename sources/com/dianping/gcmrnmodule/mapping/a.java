package com.dianping.gcmrnmodule.mapping;

import com.dianping.gcmrnmodule.hostwrapper.b;
import com.dianping.gcmrnmodule.hostwrapper.d;
import com.dianping.gcmrnmodule.objects.e;
import com.dianping.gcmrnmodule.objects.f;
import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.mapping.DynamicViewDataMapping;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleView;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/dianping/gcmrnmodule/mapping/MRNModuleMapping;", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "()V", "envMapping", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface$EnvCreator;", "Lkotlin/collections/HashMap;", "getExecEnvironment", "type", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a implements DynamicMappingInterface {
    public static ChangeQuickRedirect a;
    public static final a b = new a();
    private static HashMap<String, DynamicMappingInterface.EnvCreator> c = new HashMap<>();

    static {
        DynamicViewDataMapping.INSTANCE.getViewDataMapping().put(DMConstant.DynamicModuleViewType.MRNView, new DynamicMappingInterface.ViewDataCreator() { // from class: com.dianping.gcmrnmodule.mapping.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.shield.dynamic.mapping.DynamicMappingInterface.ViewDataCreator
            public final boolean isSingleButton() {
                return true;
            }

            @Override // com.dianping.shield.dynamic.mapping.DynamicMappingInterface.ViewDataCreator
            @Nullable
            public final DynamicModuleViewData initViewData() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5423a75d079aa7283ef7ae4993e91ff4", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleViewData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5423a75d079aa7283ef7ae4993e91ff4") : new f();
            }

            @Override // com.dianping.shield.dynamic.mapping.DynamicMappingInterface.ViewDataCreator
            @Nullable
            public final DynamicModuleView initView() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3651203f38358a3efcef99ad5231cab0", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3651203f38358a3efcef99ad5231cab0") : new e();
            }
        });
        C0065a c0065a = new C0065a();
        c.put("Dynamic_Module", c0065a);
        c.put("Dynamic_PAGE", c0065a);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"com/dianping/gcmrnmodule/mapping/MRNModuleMapping$mrnEnvCreator$1", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface$EnvCreator;", "initExecEnvironment", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "chassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "paintingCallback", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.mapping.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0065a implements DynamicMappingInterface.EnvCreator {
        public static ChangeQuickRedirect a;

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/dianping/gcmrnmodule/mapping/MRNModuleMapping$mrnEnvCreator$1$initExecEnvironment$1", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment$HostCreator;", "create", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "data", "", "", "([Ljava/lang/Object;)Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.dianping.gcmrnmodule.mapping.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0066a implements DynamicExecEnvironment.HostCreator {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ DynamicChassisInterface b;
            public final /* synthetic */ IDynamicPaintingCallback c;

            public C0066a(DynamicChassisInterface dynamicChassisInterface, IDynamicPaintingCallback iDynamicPaintingCallback) {
                this.b = dynamicChassisInterface;
                this.c = iDynamicPaintingCallback;
            }

            @Override // com.dianping.shield.dynamic.env.DynamicExecEnvironment.HostCreator
            @NotNull
            public final DynamicHostInterface create(@NotNull Object... objArr) {
                Object[] objArr2 = {objArr};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "41f0be3d1205f2a0aa1a5a5e738513de", RobustBitConfig.DEFAULT_VALUE)) {
                    return (DynamicHostInterface) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "41f0be3d1205f2a0aa1a5a5e738513de");
                }
                h.b(objArr, "data");
                if (objArr.length == 3) {
                    Object obj = objArr[0];
                    if (!(obj instanceof com.dianping.gcmrnmodule.contentview.a)) {
                        obj = null;
                    }
                    com.dianping.gcmrnmodule.contentview.a aVar = (com.dianping.gcmrnmodule.contentview.a) obj;
                    Object obj2 = objArr[1];
                    if (!(obj2 instanceof String)) {
                        obj2 = null;
                    }
                    String str = (String) obj2;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    Object obj3 = objArr[2];
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    String str3 = (String) obj3;
                    if (str3 == null) {
                        str3 = "";
                    }
                    return new d(aVar, str2, str3, this.b, this.c);
                } else if (objArr.length == 2) {
                    DynamicChassisInterface dynamicChassisInterface = this.b;
                    IDynamicPaintingCallback iDynamicPaintingCallback = this.c;
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        String str4 = (String) obj4;
                        Object obj5 = objArr[1];
                        if (obj5 != null) {
                            return new b(dynamicChassisInterface, iDynamicPaintingCallback, str4, (String) obj5);
                        }
                        throw new o("null cannot be cast to non-null type kotlin.String");
                    }
                    throw new o("null cannot be cast to non-null type kotlin.String");
                } else {
                    return new com.dianping.gcmrnmodule.hostwrapper.f(this.b, this.c);
                }
            }
        }

        @Override // com.dianping.shield.dynamic.mapping.DynamicMappingInterface.EnvCreator
        @Nullable
        public final DynamicExecEnvironment initExecEnvironment(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull IDynamicPaintingCallback<? extends DiffableInfo> iDynamicPaintingCallback) {
            Object[] objArr = {dynamicChassisInterface, iDynamicPaintingCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb7a98755b5720a611b6b6176d49836", RobustBitConfig.DEFAULT_VALUE)) {
                return (DynamicExecEnvironment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb7a98755b5720a611b6b6176d49836");
            }
            h.b(dynamicChassisInterface, "chassis");
            h.b(iDynamicPaintingCallback, "paintingCallback");
            return new DynamicExecEnvironment(new C0066a(dynamicChassisInterface, iDynamicPaintingCallback), new com.dianping.gcmrnmodule.env.a(dynamicChassisInterface));
        }
    }

    @Override // com.dianping.shield.dynamic.mapping.DynamicMappingInterface
    @Nullable
    public final DynamicMappingInterface.EnvCreator getExecEnvironment(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97c6a95c79cc95489c41485d6efc093", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicMappingInterface.EnvCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97c6a95c79cc95489c41485d6efc093");
        }
        h.b(str, "type");
        return c.get(str);
    }
}
