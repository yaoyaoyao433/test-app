package com.meituan.android.yoda.plugins;

import android.content.Context;
import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements DFPInfoProvider {
    public static ChangeQuickRedirect a;
    private Context b;

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String business() {
        return "yoda";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String dpid() {
        return "";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getChannel() {
        return "";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getMagicNumber() {
        return "123";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getPushToken() {
        return "";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String optional() {
        return "";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String source() {
        return "";
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df01d63182d8ab30f5f91505ac3c5a69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df01d63182d8ab30f5f91505ac3c5a69");
            return;
        }
        this.b = null;
        this.b = context;
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getUUID() {
        String str;
        Exception e;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f41bf2d4048b9b264dafc6cf39f593", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f41bf2d4048b9b264dafc6cf39f593");
        }
        try {
            str = GetUUID.getInstance().getUUID(this.b);
        } catch (Exception e2) {
            str = "";
            e = e2;
        }
        try {
            com.meituan.android.yoda.monitor.log.a.a("FingerPrintInfoProvider", "getUUID, uuid = " + str, true);
        } catch (Exception e3) {
            e = e3;
            com.meituan.android.yoda.monitor.log.a.a("FingerPrintInfoProvider", "getUUID, exception = " + e.getMessage(), true);
            return str;
        }
        return str;
    }
}
