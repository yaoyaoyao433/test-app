package com.dianping.shield.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/dianping/shield/monitor/ShieldGAType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "NATIVEMODULE", "PICASSOMODULE", "MRNMODULE", "NATIVEMODULESVC", "PICASSOMODULESVC", "MRNMODULESVC", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public enum ShieldGAType {
    NATIVEMODULE("NativeModule"),
    PICASSOMODULE("PicassoModule"),
    MRNMODULE("MRNModule"),
    NATIVEMODULESVC("NativeModulesVC"),
    PICASSOMODULESVC("PicassoModulesVC"),
    MRNMODULESVC("MRNModulesVC");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String type;

    public static ShieldGAType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ShieldGAType) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d88962ad41041cae31e75a9425c87c5", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d88962ad41041cae31e75a9425c87c5") : Enum.valueOf(ShieldGAType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ShieldGAType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ShieldGAType[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d19f7781e6d493ca0d3f6444ac3d4be", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d19f7781e6d493ca0d3f6444ac3d4be") : values().clone());
    }

    ShieldGAType(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b62b5126e5e6d9f9602f7d46a57a828b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b62b5126e5e6d9f9602f7d46a57a828b");
        } else {
            this.type = str;
        }
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
