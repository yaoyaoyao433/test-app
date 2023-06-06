package com.meituan.android.common.statistics.channel.beforeinit;

import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BeforeInitLxEventData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bid;
    public String channelName;
    public String cid;
    public EventLevel eventLevel;
    public boolean hasIndex;
    public int index;
    public String pageInfoKey;
    public boolean sf;
    public EventName type;
    public Map<String, Object> valLab;
    public boolean withPageInfo;

    public BeforeInitLxEventData(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b19257379e45bf8881dae89749d86c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b19257379e45bf8881dae89749d86c5");
            return;
        }
        this.channelName = "";
        this.type = builder.type;
        this.pageInfoKey = builder.pageInfoKey;
        this.cid = builder.cid;
        this.bid = builder.bid;
        this.valLab = builder.valLab;
        this.withPageInfo = builder.withPageInfo;
        this.sf = builder.sf;
        this.index = builder.index;
        this.channelName = builder.channelName;
        this.eventLevel = builder.eventLevel;
        this.hasIndex = builder.hasIndex;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78479e02d1b7cc9261e4259b8e1f3f69", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78479e02d1b7cc9261e4259b8e1f3f69");
        }
        return "BeforeInitLxEventData{type=" + this.type + ", pageInfoKey='" + this.pageInfoKey + "', cid='" + this.cid + "', bid='" + this.bid + "'}";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bid;
        public String channelName;
        public String cid;
        public EventLevel eventLevel;
        public boolean hasIndex;
        public int index;
        public String pageInfoKey;
        public boolean sf;
        public EventName type;
        public Map<String, Object> valLab;
        public boolean withPageInfo;

        public Builder(EventName eventName) {
            Object[] objArr = {eventName};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42678dbf4ad8311c2f4de6fbbfc8f0d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42678dbf4ad8311c2f4de6fbbfc8f0d2");
            } else {
                this.type = eventName;
            }
        }

        public Builder(EventName eventName, String str, String str2) {
            Object[] objArr = {eventName, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d9c902c131f39dfba1b1ed5b4055f1f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d9c902c131f39dfba1b1ed5b4055f1f");
                return;
            }
            this.type = eventName;
            this.channelName = str;
            this.pageInfoKey = str2;
        }

        public Builder setEventLevel(EventLevel eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }

        public Builder setPageInfoKey(String str) {
            this.pageInfoKey = str;
            return this;
        }

        public Builder setCid(String str) {
            this.cid = str;
            return this;
        }

        public Builder setBid(String str) {
            this.bid = str;
            return this;
        }

        public Builder setValLab(Map<String, Object> map) {
            this.valLab = map;
            return this;
        }

        public Builder setWithPageInfo(boolean z) {
            this.withPageInfo = z;
            return this;
        }

        public Builder setSf(boolean z) {
            this.sf = z;
            return this;
        }

        public Builder setIndex(int i) {
            this.index = i;
            this.hasIndex = true;
            return this;
        }

        public BeforeInitLxEventData build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "876b34d935866e2502309c50a5ada71f", 6917529027641081856L) ? (BeforeInitLxEventData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "876b34d935866e2502309c50a5ada71f") : new BeforeInitLxEventData(this);
        }
    }
}
