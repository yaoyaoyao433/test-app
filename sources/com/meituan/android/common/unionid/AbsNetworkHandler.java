package com.meituan.android.common.unionid;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public abstract class AbsNetworkHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface INetworkCallback {
        void success(String str);
    }

    public abstract void sendRequest(String str, Map<String, ? extends Object> map, INetworkCallback iNetworkCallback);
}
