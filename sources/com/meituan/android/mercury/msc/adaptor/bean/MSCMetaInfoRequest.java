package com.meituan.android.mercury.msc.adaptor.bean;

import android.support.annotation.Keep;
import com.meituan.android.mercury.msc.adaptor.callback.a;
import com.meituan.met.mercury.load.bean.MSCAppIdPublishId;
import com.meituan.met.mercury.load.repository.BaseLoadRequest;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MSCMetaInfoRequest extends BaseLoadRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    public List<MSCAppIdPublishId> cacheMscVersion;
    public a callback;
    public boolean forceUpdate;
    public String metaInfoTestUrl;
    public List<String> mscAppIds;
    public int preloadTag;
    public long validTime;

    public MSCMetaInfoRequest(String str, boolean z, String str2, a aVar) {
        super(ContainerInfo.ENV_MSC);
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcadcc72fa1a1a8423b443951f4b4a2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcadcc72fa1a1a8423b443951f4b4a2c");
            return;
        }
        this.appId = str;
        this.forceUpdate = z;
        this.callback = aVar;
        this.metaInfoTestUrl = str2;
    }

    public MSCMetaInfoRequest(List<String> list, boolean z, String str, a aVar) {
        super(ContainerInfo.ENV_MSC);
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ecdba20160c73b7d380a00bf0aeaa8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ecdba20160c73b7d380a00bf0aeaa8d");
            return;
        }
        this.mscAppIds = list;
        this.forceUpdate = z;
        this.callback = aVar;
        this.metaInfoTestUrl = str;
    }

    public MSCMetaInfoRequest(List<String> list, boolean z, String str, int i, a aVar) {
        super(ContainerInfo.ENV_MSC);
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "349b4e81aefd3e9746fde711d69a4c59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "349b4e81aefd3e9746fde711d69a4c59");
            return;
        }
        this.mscAppIds = list;
        this.forceUpdate = z;
        this.callback = aVar;
        this.metaInfoTestUrl = str;
        this.preloadTag = i;
    }

    public MSCMetaInfoRequest(String str, long j, boolean z, String str2, a aVar) {
        super(ContainerInfo.ENV_MSC);
        Object[] objArr = {str, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "112248571801b8f3df5a9468ca209c93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "112248571801b8f3df5a9468ca209c93");
            return;
        }
        this.appId = str;
        this.forceUpdate = z;
        this.callback = aVar;
        this.validTime = j;
        this.metaInfoTestUrl = str2;
    }

    @Override // com.meituan.met.mercury.load.repository.BaseLoadRequest
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6279ba105b76fb159f1466a68c082ac0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6279ba105b76fb159f1466a68c082ac0");
        }
        return "MSCMetaInfoRequest{appId='" + this.appId + "', forceUpdate=" + this.forceUpdate + ", mscAppIds=" + this.mscAppIds + ", cacheMscVersion=" + this.cacheMscVersion + ", callback=" + this.callback + ", validTime=" + this.validTime + ", metaInfoTestUrl='" + this.metaInfoTestUrl + "'}";
    }
}
