package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Index;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "session_key", unique = true, value = "key")}, name = DBSession.TABLE_NAME)
/* loaded from: classes6.dex */
public final class DBSession extends DBMessage {
    public static final int FLAG_ALL = -1;
    public static final int FLAG_KEY = 1;
    public static final int FLAG_MSG_SEQID = 32;
    public static final int FLAG_MSG_STATUS = 8;
    public static final int FLAG_MSG_TYPE = 16;
    public static final int FLAG_MSG_UUID = 2;
    public static final int FLAG_NO_CHANGE = 0;
    public static final int FLAG_UNREAD = 4;
    public static final String KEY = "key";
    public static final String TABLE_NAME = "session";
    public static final String UN_READ = "unread";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mFlag;
    @Property(name = "key")
    private String mKey;
    @Property(name = UN_READ)
    private int mUnRead;

    public DBSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f9311df529a210930f78e16c1186f02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f9311df529a210930f78e16c1186f02");
        } else {
            this.mFlag = 0;
        }
    }

    public DBSession(DBMessage dBMessage) {
        Object[] objArr = {dBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8b1df43489a570380488c702f12edad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8b1df43489a570380488c702f12edad");
            return;
        }
        this.mFlag = 0;
        setCategory(dBMessage.getCategory());
        setPubCategory(dBMessage.getPubCategory());
        setMsgType(dBMessage.getMsgType());
        setMsgId(dBMessage.getMsgId());
        setMsgUuid(dBMessage.getMsgUuid());
        setFromAppId(dBMessage.getFromAppId());
        setToAppId(dBMessage.getToAppId());
        setPeerAppId(dBMessage.getPeerAppId());
        setChatId(dBMessage.getChatId());
        setFromUid(dBMessage.getFromUid());
        setFromName(dBMessage.getFromName());
        setToUid(dBMessage.getToUid());
        setPeerUid(dBMessage.getPeerUid());
        setSts(dBMessage.getSts());
        setCts(dBMessage.getCts());
        setMsgStatus(dBMessage.getMsgStatus());
        setFileStatus(dBMessage.getFileStatus());
        setExtension(dBMessage.getExtension());
        setReceipt(dBMessage.isReceipt());
        setDirection(dBMessage.getDirection());
        setSeqId(dBMessage.getSeqId());
        setDeviceId(dBMessage.getDeviceId());
        setClusterId(dBMessage.getClusterId());
        setGroupName(dBMessage.getGroupName());
        setChannel(dBMessage.getChannel());
        setMsgVersion(dBMessage.getMsgVersion());
        setPeerDeviceType(dBMessage.getPeerDeviceType());
        setCompatible(dBMessage.getCompatible());
        setMsgSeqid(dBMessage.getMsgSeqid());
        setSID(dBMessage.getSID());
        setContent(dBMessage.getContent());
        setReserveContentOne(dBMessage.getReserveContentOne());
        setReserveContentTwo(dBMessage.getReserveContentTwo());
        setReserveContentThree(dBMessage.getReserveContentThree());
        setReserveStringOne(dBMessage.getReserveStringOne());
        setReserveStringTwo(dBMessage.getReserveStringTwo());
        setReserveStringThree(dBMessage.getReserveStringThree());
        setReserveStringFour(dBMessage.getReserveStringFour());
        setReserve64One(dBMessage.getReserve64One());
        setReserve64Two(dBMessage.getReserve64Two());
        setReserve64Three(dBMessage.getReserve64Three());
        setReserve64Four(dBMessage.getReserve64Four());
        setReserve64Five(dBMessage.getReserve64Five());
        setReserve32One(dBMessage.getReserve32One());
        setReserve32Two(dBMessage.getReserve32Two());
        setReserve32Three(dBMessage.getReserve32Three());
        setReserve32Four(dBMessage.getReserve32Four());
        setReserve32Five(dBMessage.getReserve32Five());
        setReserve32Six(dBMessage.getReserve32Six());
        setKey(SessionId.a(dBMessage).f());
        setUnRead(0);
        setErrorCode(dBMessage.getErrorCode());
        setFromPubId(dBMessage.getFromPubId());
        setFromPubName(dBMessage.getFromPubName());
        setMsgSource(dBMessage.getMsgSource());
    }

    public final int getFlag() {
        return this.mFlag;
    }

    public final void setFlag(int i) {
        this.mFlag = i;
    }

    @GetM(property = "mUnRead")
    public final int getUnRead() {
        return this.mUnRead;
    }

    @SetM(property = "mUnRead")
    public final void setUnRead(int i) {
        this.mUnRead = i;
    }

    @GetM(property = "mKey")
    public final String getKey() {
        return this.mKey;
    }

    @SetM(property = "mKey")
    public final void setKey(String str) {
        this.mKey = str;
    }

    @Override // com.sankuai.xm.im.cache.bean.DBMessage, com.sankuai.xm.im.message.bean.Message
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a14ec03b61bbb05ae218a1c138830fe", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a14ec03b61bbb05ae218a1c138830fe");
        }
        return "DBSesssion{" + super.keyParamToString() + ", mUnRead=" + this.mUnRead + ", mKey='" + this.mKey + "'} ";
    }

    /* renamed from: clone */
    public final DBSession m27clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c54e3c5f2dc37444c93566ddb4da30bb", 6917529027641081856L)) {
            return (DBSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c54e3c5f2dc37444c93566ddb4da30bb");
        }
        DBSession dBSession = new DBSession();
        dBSession.setChatId(getChatId());
        dBSession.setContent(getContent());
        dBSession.setReserve32One(getReserve32One());
        dBSession.setReserve32Two(getReserve32Two());
        dBSession.setReserve32Three(getReserve32Three());
        dBSession.setReserve32Four(getReserve32Four());
        dBSession.setReserve32Five(getReserve32Five());
        dBSession.setReserve32Six(getReserve32Six());
        dBSession.setReserve64One(getReserve64One());
        dBSession.setReserve64Two(getReserve64Two());
        dBSession.setReserve64Three(getReserve64Three());
        dBSession.setReserve64Four(getReserve64Four());
        dBSession.setReserve64Five(getReserve64Five());
        dBSession.setReserveContentOne(getReserveContentOne());
        dBSession.setReserveContentTwo(getReserveContentTwo());
        dBSession.setReserveContentThree(getReserveContentThree());
        dBSession.setReserveStringOne(getReserveStringOne());
        dBSession.setReserveStringTwo(getReserveStringTwo());
        dBSession.setReserveStringThree(getReserveStringThree());
        dBSession.setReserveStringFour(getReserveStringFour());
        dBSession.setCategory(getCategory());
        dBSession.setPubCategory(getPubCategory());
        dBSession.setMsgId(getMsgId());
        dBSession.setMsgUuid(getMsgUuid());
        dBSession.setMsgStatus(getMsgStatus());
        dBSession.setMsgType(getMsgType());
        dBSession.setFileStatus(getFileStatus());
        dBSession.setFromUid(getFromUid());
        dBSession.setFromAppId(getFromAppId());
        dBSession.setFromName(getFromName());
        dBSession.setGroupName(getGroupName());
        dBSession.setPeerUid(getPeerUid());
        dBSession.setPeerAppId(getPeerAppId());
        dBSession.setPeerUid(getPeerUid());
        dBSession.setToAppId(getToAppId());
        dBSession.setToUid(getToUid());
        dBSession.setCts(getCts());
        dBSession.setSts(getSts());
        dBSession.setExtension(getExtension());
        dBSession.setChannel(getChannel());
        dBSession.setPeerDeviceType(getPeerDeviceType());
        dBSession.setFlag(getFlag());
        dBSession.setMsgVersion(getMsgVersion());
        dBSession.setCompatible(getCompatible());
        dBSession.setMsgSeqid(getMsgSeqid());
        dBSession.setDeviceId(getDeviceId());
        dBSession.setSID(getSID());
        dBSession.setKey(getKey());
        dBSession.setUnRead(getUnRead());
        dBSession.setErrorCode(getErrorCode());
        dBSession.setFromPubId(getFromPubId());
        dBSession.setFromPubName(getFromPubName());
        dBSession.setMsgSource(getMsgSource());
        return dBSession;
    }

    private String contentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23f34fdf29f44ec3264716cde38bb740", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23f34fdf29f44ec3264716cde38bb740");
        }
        return super.toString() + toString();
    }

    private boolean contentEquals(DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "003bbc041464b85d54c0c48969a878c0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "003bbc041464b85d54c0c48969a878c0")).booleanValue();
        }
        if (this == dBSession) {
            return true;
        }
        return dBSession != null && ac.a(dBSession.contentString(), contentString());
    }

    public final boolean equals(DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751d0edc88ff3b70af062f3920166ca9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751d0edc88ff3b70af062f3920166ca9")).booleanValue();
        }
        this.mFlag = 0;
        diff(dBSession);
        return this.mFlag == 0;
    }

    public final boolean allEquals(DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15db6b32c8244ad0370bb28fa36a5f89", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15db6b32c8244ad0370bb28fa36a5f89")).booleanValue() : equals(dBSession) && contentEquals(dBSession);
    }

    public final boolean change(int i) {
        return (i & this.mFlag) != 0;
    }

    private int diff(DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3e00783f237ccb57983962fe12de8ca", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3e00783f237ccb57983962fe12de8ca")).intValue();
        }
        if (dBSession == null) {
            this.mFlag = -1;
            return this.mFlag;
        }
        if (!getKey().equals(dBSession.getKey())) {
            this.mFlag = 1 | this.mFlag;
        }
        if (!getMsgUuid().equals(dBSession.getMsgUuid())) {
            this.mFlag |= 2;
        }
        if (getMsgStatus() != dBSession.getMsgStatus()) {
            this.mFlag |= 8;
        }
        if (getMsgType() != dBSession.getMsgType()) {
            this.mFlag |= 16;
        }
        if (getUnRead() != dBSession.getUnRead()) {
            this.mFlag |= 4;
        }
        if (getMsgSeqid() != dBSession.getMsgSeqid()) {
            this.mFlag |= 32;
        }
        return this.mFlag;
    }
}
