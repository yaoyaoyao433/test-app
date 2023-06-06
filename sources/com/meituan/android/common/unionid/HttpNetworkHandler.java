package com.meituan.android.common.unionid;

import android.util.Log;
import com.meituan.android.common.unionid.AbsNetworkHandler;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class HttpNetworkHandler extends AbsNetworkHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String TAG_LOG;

    public HttpNetworkHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42bd56580b6b80892820110164ac25af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42bd56580b6b80892820110164ac25af");
        } else {
            this.TAG_LOG = HttpNetworkHandler.class.getSimpleName();
        }
    }

    @Override // com.meituan.android.common.unionid.AbsNetworkHandler
    public void sendRequest(String str, Map<String, ? extends Object> map, AbsNetworkHandler.INetworkCallback iNetworkCallback) {
        Object[] objArr = {str, map, iNetworkCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c3df4973db16c1d6c3a2e3fe5b07595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c3df4973db16c1d6c3a2e3fe5b07595");
            return;
        }
        try {
            LogUtils.i(this.TAG_LOG, "sendRequest");
        } catch (Exception e) {
            String str2 = this.TAG_LOG;
            Log.e(str2, "sendRequest is error:" + e.getMessage(), e);
        }
    }

    private long getWaitTimeExp(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcc11c58ec9c6ca9f74848e18a91e035", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcc11c58ec9c6ca9f74848e18a91e035")).longValue() : ((long) Math.pow(2.0d, i)) * 1000;
    }
}
