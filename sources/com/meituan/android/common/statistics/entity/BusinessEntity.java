package com.meituan.android.common.statistics.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class BusinessEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bid;
    private String channel;
    private String cid;
    private boolean sf;
    private Map<String, Object> val_lab;
    private boolean withPageInfo;

    public final String getCid() {
        return this.cid;
    }

    public final BusinessEntity setCid(String str) {
        this.cid = str;
        return this;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final BusinessEntity setChannel(String str) {
        this.channel = str;
        return this;
    }

    public final String getBid() {
        return this.bid;
    }

    public final BusinessEntity setBid(String str) {
        this.bid = str;
        return this;
    }

    public final Map<String, Object> getValLab() {
        return this.val_lab;
    }

    public final BusinessEntity setValLab(Map<String, Object> map) {
        this.val_lab = map;
        return this;
    }

    public final BusinessEntity addValLab(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c888cb1087a9e30bf1e0cc9ca7b0aad0", 6917529027641081856L)) {
            return (BusinessEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c888cb1087a9e30bf1e0cc9ca7b0aad0");
        }
        if (this.val_lab == null) {
            this.val_lab = new HashMap();
        }
        this.val_lab.put(str, obj);
        return this;
    }

    public final BusinessEntity removeValLab(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f607718ca99457f38a8a6da929f61dba", 6917529027641081856L)) {
            return (BusinessEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f607718ca99457f38a8a6da929f61dba");
        }
        if (this.val_lab != null) {
            this.val_lab.remove(str);
        }
        return this;
    }

    public final boolean getSf() {
        return this.sf;
    }

    public final BusinessEntity setSf(boolean z) {
        this.sf = z;
        return this;
    }

    public final boolean getWithPageInfo() {
        return this.withPageInfo;
    }

    public final BusinessEntity setWithPageInfo(boolean z) {
        this.withPageInfo = z;
        return this;
    }
}
