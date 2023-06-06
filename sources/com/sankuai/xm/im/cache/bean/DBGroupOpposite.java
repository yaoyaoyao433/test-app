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
@Entity(indexes = {@Index(name = "msgid_index", unique = true, value = "msgid")}, name = DBGroupOpposite.TABLE_NAME)
/* loaded from: classes6.dex */
public final class DBGroupOpposite {
    public static final String MSGID = "msgid";
    public static final String READ_UIDS = "readUids";
    public static final String TABLE_NAME = "msg_group_opposite";
    public static final String UNREAD_UIDS = "unreadUids";
    public static final String UPDATE_TIME = "updateTime";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Id
    @Property(name = "msgid")
    @NotNull
    private long mMsgid;
    @Property(name = READ_UIDS)
    private String mReadUids;
    @Property(name = UNREAD_UIDS)
    private String mUnreadUids;
    @Property(name = UPDATE_TIME)
    private long mUpdateTime;

    public DBGroupOpposite() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03a7aaf95bbe6e2b3c08330a11438845", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03a7aaf95bbe6e2b3c08330a11438845");
            return;
        }
        this.mReadUids = "";
        this.mUnreadUids = "";
    }

    @GetM(property = "mMsgid")
    public final long getMsgId() {
        return this.mMsgid;
    }

    @SetM(property = "mMsgid")
    public final void setMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a081a69e379e32dd63675d100179b74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a081a69e379e32dd63675d100179b74");
        } else {
            this.mMsgid = j;
        }
    }

    @GetM(property = "mReadUids")
    public final String getReadUids() {
        return this.mReadUids;
    }

    @SetM(property = "mReadUids")
    public final void setReadUids(String str) {
        this.mReadUids = str;
    }

    @GetM(property = "mUnreadUids")
    public final String getUnreadUids() {
        return this.mUnreadUids;
    }

    @SetM(property = "mUnreadUids")
    public final void setUnreadUids(String str) {
        this.mUnreadUids = str;
    }

    @GetM(property = "mUpdateTime")
    public final long getUpdateTime() {
        return this.mUpdateTime;
    }

    @SetM(property = "mUpdateTime")
    public final void setUpdateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfbe7f081f633f625a7feead623360ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfbe7f081f633f625a7feead623360ad");
        } else {
            this.mUpdateTime = j;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e93202d00268e91524c72e3bec59fc59", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e93202d00268e91524c72e3bec59fc59");
        }
        return "DBGroupOpposite{, msgid=" + this.mMsgid + ", readUids=" + this.mReadUids + ", unreadUids=" + this.mUnreadUids + ", updateTime=" + this.mUpdateTime + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
