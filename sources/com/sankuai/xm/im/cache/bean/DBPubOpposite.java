package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Index;
import com.sankuai.xm.tinyormapt.annotation.NotNull;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "key_index", unique = true, value = "key"), @Index(name = "sending_time_index", value = DBPubOpposite.SENDING_TIME)}, name = DBPubOpposite.TABLE_NAME)
/* loaded from: classes6.dex */
public final class DBPubOpposite {
    public static final String KEY = "key";
    public static final String RECV_OPPOSITE_TIME = "recvOppositeTime";
    public static final String SENDING_TIME = "sendingTime";
    public static final String SEND_OPPOSITE_TIME = "sendOppositeTime";
    public static final String TABLE_NAME = "msg_pub_opposite";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Id
    @Property(name = "key")
    @NotNull
    private String mKey;
    @Property(name = RECV_OPPOSITE_TIME)
    private long mRecvOppositeTime;
    @Property(name = SEND_OPPOSITE_TIME)
    private long mSendOppositeTime;
    @Property(name = SENDING_TIME)
    private long mSendingTime;

    public DBPubOpposite() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2b00588b97a52b8b95e881c3aaed04d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2b00588b97a52b8b95e881c3aaed04d");
            return;
        }
        this.mSendingTime = 0L;
        this.mSendOppositeTime = 0L;
        this.mRecvOppositeTime = 0L;
    }

    @GetM(property = "mKey")
    public final String getKey() {
        return this.mKey;
    }

    @SetM(property = "mKey")
    public final void setKey(String str) {
        this.mKey = str;
    }

    @GetM(property = "mSendingTime")
    public final long getSendingTime() {
        return this.mSendingTime;
    }

    @SetM(property = "mSendingTime")
    public final void setSendingTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bca1155b3893c1861b41d9a284e8628", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bca1155b3893c1861b41d9a284e8628");
        } else {
            this.mSendingTime = j;
        }
    }

    @GetM(property = "mSendOppositeTime")
    public final long getSendOppositeTime() {
        return this.mSendOppositeTime;
    }

    @SetM(property = "mSendOppositeTime")
    public final void setSendOppositeTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9465c86ce66a6e94fb93949dae99efa3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9465c86ce66a6e94fb93949dae99efa3");
        } else {
            this.mSendOppositeTime = j;
        }
    }

    @GetM(property = "mRecvOppositeTime")
    public final long getRecvOppositeTime() {
        return this.mRecvOppositeTime;
    }

    @SetM(property = "mRecvOppositeTime")
    public final void setRecvOppositeTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8f860e0944c73ade5f4ec8de89335fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8f860e0944c73ade5f4ec8de89335fd");
        } else {
            this.mRecvOppositeTime = j;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f02bf9d8a7753968914b992575275e3c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f02bf9d8a7753968914b992575275e3c");
        }
        return "DBPubOpposite{, mKey=" + this.mKey + ", mSendingTime=" + this.mSendingTime + ", mSendOppositeTime=" + this.mSendOppositeTime + ", mRecvOppositeTime=" + this.mRecvOppositeTime + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
