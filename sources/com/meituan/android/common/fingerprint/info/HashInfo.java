package com.meituan.android.common.fingerprint.info;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HashInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String hash;
    private long ts;

    public HashInfo(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce5aa1798fbaa622aee90132556b456e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce5aa1798fbaa622aee90132556b456e");
            return;
        }
        this.hash = str;
        this.ts = j;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public long getTs() {
        return this.ts;
    }

    public void setTs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a549a680a19273b67cb1a91ac3333fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a549a680a19273b67cb1a91ac3333fa");
        } else {
            this.ts = j;
        }
    }
}
