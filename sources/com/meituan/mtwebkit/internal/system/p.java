package com.meituan.mtwebkit.internal.system;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebStorage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p extends MTWebStorage {
    public static ChangeQuickRedirect a;
    private WebStorage b;

    public p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e501d30d55ec4af907f42ba152efdc47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e501d30d55ec4af907f42ba152efdc47");
        } else {
            this.b = WebStorage.getInstance();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebStorage
    public final void getOrigins(final MTValueCallback<Map> mTValueCallback) {
        Object[] objArr = {mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6072fb7d64696edaac75ce4bad50dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6072fb7d64696edaac75ce4bad50dbb");
        } else {
            this.b.getOrigins(mTValueCallback == null ? null : new ValueCallback<Map>() { // from class: com.meituan.mtwebkit.internal.system.p.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Map map) {
                    Map map2 = map;
                    Object[] objArr2 = {map2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7dba4d6e8c32d773eab1247fa38418ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7dba4d6e8c32d773eab1247fa38418ac");
                    } else {
                        mTValueCallback.onReceiveValue(map2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebStorage
    public final void getUsageForOrigin(String str, final MTValueCallback<Long> mTValueCallback) {
        Object[] objArr = {str, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f20680ce360c5a824138c1166623f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f20680ce360c5a824138c1166623f3");
        } else {
            this.b.getUsageForOrigin(str, mTValueCallback == null ? null : new ValueCallback<Long>() { // from class: com.meituan.mtwebkit.internal.system.p.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Long l) {
                    Long l2 = l;
                    Object[] objArr2 = {l2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bfa4df2a12074f6689335a6a04330a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bfa4df2a12074f6689335a6a04330a9");
                    } else {
                        mTValueCallback.onReceiveValue(l2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebStorage
    public final void getQuotaForOrigin(String str, final MTValueCallback<Long> mTValueCallback) {
        Object[] objArr = {str, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea4c8f71167699d1ae04bec3e3e4a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea4c8f71167699d1ae04bec3e3e4a20");
        } else {
            this.b.getQuotaForOrigin(str, mTValueCallback == null ? null : new ValueCallback<Long>() { // from class: com.meituan.mtwebkit.internal.system.p.3
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Long l) {
                    Long l2 = l;
                    Object[] objArr2 = {l2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f5c854e5c8d62208b38f17136f54075", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f5c854e5c8d62208b38f17136f54075");
                    } else {
                        mTValueCallback.onReceiveValue(l2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebStorage
    public final void setQuotaForOrigin(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26602e1e2f087540d776885dfebfa8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26602e1e2f087540d776885dfebfa8f0");
        } else {
            this.b.setQuotaForOrigin(str, j);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebStorage
    public final void deleteOrigin(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea5d1a4a78e83807dafa9cfab2bd352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea5d1a4a78e83807dafa9cfab2bd352");
        } else {
            this.b.deleteOrigin(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebStorage
    public final void deleteAllData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd323bae0f3967b50cbb319c9b267e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd323bae0f3967b50cbb319c9b267e0");
        } else {
            this.b.deleteAllData();
        }
    }
}
