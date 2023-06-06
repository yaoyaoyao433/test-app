package com.meituan.android.neohybrid.v2.neo.bridge;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.protocol.kernel.NeoBridgeInterface;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.d;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.f;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.h;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.i;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.j;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.m;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.o;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.p;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class NeoBridgeV2 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> customizeHandlers;
    public com.meituan.android.neohybrid.v2.core.a mNeoCompat;

    public NeoBridgeV2(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0386daba3bc48041aecc2a0971bfced", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0386daba3bc48041aecc2a0971bfced");
            return;
        }
        this.customizeHandlers = new HashMap();
        this.mNeoCompat = aVar;
    }

    @Keep
    @NeoBridgeInterface
    public String tunnel(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "454a2ed0c64b0160096ebc7c6e49e3b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "454a2ed0c64b0160096ebc7c6e49e3b7");
        }
        if (isIllegal()) {
            return failResult("tunnel: context error.");
        }
        return new r(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @NeoBridgeInterface
    public String notify(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfbbf64bbe69144d17f6f61c232effd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfbbf64bbe69144d17f6f61c232effd1");
        }
        if (isIllegal()) {
            return failResult("notify: context error.");
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.mNeoCompat, "b_pay_1tpd4rr8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("action", str).b);
        return new m(this.mNeoCompat, str, str2, str3, aVar).c();
    }

    @Keep
    @NeoBridgeInterface
    public String nsf(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7fdf25657acfb38d3ef774bf4b5ca68", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7fdf25657acfb38d3ef774bf4b5ca68");
        }
        if (isIllegal()) {
            return failResult("nsf: context error.");
        }
        return new i(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @NeoBridgeInterface
    public String request(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cd5d7de347576516127b01131d578ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cd5d7de347576516127b01131d578ab");
        }
        if (isIllegal()) {
            return failResult("request: context error.");
        }
        if (!this.mNeoCompat.f().isNeoRequestBridge()) {
            return failResult("neo request bridge is close");
        }
        return new o(this.mNeoCompat, str, str2, str3, aVar).c();
    }

    public void setNeoBridgeCustomizeHandlers(Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> map) {
        this.customizeHandlers = map;
    }

    @Keep
    @NeoBridgeInterface
    public String customize(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d05542e15074b33ba5341eb65a529077", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d05542e15074b33ba5341eb65a529077");
        }
        if (isIllegal()) {
            return failResult("customize: context error.");
        }
        if (this.customizeHandlers == null || this.customizeHandlers.isEmpty()) {
            this.customizeHandlers = b.a(this.mNeoCompat.f().getScene());
        }
        return new d(this.mNeoCompat, str, str2, str3, this.customizeHandlers).c();
    }

    @Keep
    @NeoBridgeInterface
    public String kit(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00becdf676d09f77cbfa922522365af2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00becdf676d09f77cbfa922522365af2");
        }
        if (isIllegal()) {
            return failResult("kit: context error.");
        }
        return new f(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @NeoBridgeInterface
    public String ssr(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9466b341167990f67ddc0eb239c8c38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9466b341167990f67ddc0eb239c8c38");
        }
        if (isIllegal()) {
            return failResult("kit: context error.");
        }
        return new p(this.mNeoCompat, str, str2, str3).c();
    }

    @Keep
    @NeoBridgeInterface
    public String log(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee2f2303ef6cf4d972bb8359b20fe08c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee2f2303ef6cf4d972bb8359b20fe08c");
        }
        if (isIllegal()) {
            return failResult("log: context error.");
        }
        return new h(this.mNeoCompat, str, str2, str3, aVar).c();
    }

    @Keep
    @NeoBridgeInterface
    public String navigate(@NonNull String str, @Nullable String str2, @Nullable String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b2cbdc55eeb7371d80c511c4c6f5c78", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b2cbdc55eeb7371d80c511c4c6f5c78");
        }
        if (isIllegal()) {
            return failResult("navigate: context error.");
        }
        return new j(this.mNeoCompat, str, str2, str3, aVar).c();
    }

    public boolean isIllegal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d28e6044fbcac326bcc3c46b3d83506", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d28e6044fbcac326bcc3c46b3d83506")).booleanValue() : this.mNeoCompat == null || this.mNeoCompat.b() == null || this.mNeoCompat.a() == null;
    }

    public String failResult(@Nullable String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e46b7a2b257dda83eb11c446b2ababd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e46b7a2b257dda83eb11c446b2ababd2");
        }
        return new NeoBridgeBean(-1, (strArr == null || strArr.length <= 0) ? "" : strArr[0]).toString();
    }

    public static void registerNeoBridgeCustomize(com.meituan.android.neohybrid.v2.core.a aVar, String... strArr) {
        Object[] objArr = {aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c0bda1c25ffd62ff8532ec9fc1632d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c0bda1c25ffd62ff8532ec9fc1632d9");
            return;
        }
        b.a(aVar.f().getScene(), strArr);
        b.a(aVar, strArr);
    }
}
