package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.bean.GroupDBMessage;
import com.sankuai.xm.im.cache.bean.PersonalDBMessage;
import com.sankuai.xm.im.cache.bean.PubDBMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Message {
    public static final String CATEGORY = "category";
    public static final String CHANNEL = "channel";
    public static final String CHAT_ID = "chatId";
    public static final String CTS = "cts";
    public static final String DIRECTION = "direction";
    public static final String ERROR_CODE = "errorCode";
    public static final String EXTENSION = "extension";
    public static final String FILE_STATUS = "fileStatus";
    public static final String FROM_APPID = "fromAppId";
    public static final String FROM_NAME = "fromName";
    public static final String FROM_PUB_ID = "fromPubId";
    public static final String FROM_PUB_NAME = "fromPubName";
    public static final String FROM_UID = "fromUid";
    public static final String GROUP_NAME = "groupName";
    public static final String MSG_COMPATIBLE = "compatible";
    public static final String MSG_FLAG = "flag";
    public static final String MSG_ID = "msgId";
    public static final String MSG_OPPOSITE_STATUS = "msgOppositeStatus";
    public static final String MSG_SEQID = "seqid";
    public static final String MSG_SOURCE = "msgSource";
    public static final String MSG_STATUS = "msgStatus";
    public static final String MSG_UUID = "msgUuid";
    public static final String MSG_VERSION = "version";
    public static final String PEER_APPID = "peerAppId";
    public static final String PEER_UID = "peerUid";
    public static final String PUB_CATEGORY = "pubCategory";
    public static final String RECEIPT = "receipt";
    public static final String SID = "sid";
    public static final String STS = "sts";
    public static final String TO_APPID = "toAppId";
    public static final String TO_UID = "toUid";
    public static final String TYPE = "type";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected long mAdminUid;
    @Property(name = "category")
    protected int mCategory;
    @Property(name = "channel")
    protected short mChannel;
    @Property(name = CHAT_ID)
    protected long mChatId;
    protected int mClusterId;
    @Property(name = MSG_COMPATIBLE)
    protected String mCompatible;
    protected long mConversationId;
    @Property(name = CTS)
    protected long mCts;
    protected String mDeviceId;
    @Property(name = "direction")
    protected int mDirection;
    @Property(name = "errorCode")
    protected int mErrorCode;
    @Property(name = "extension")
    protected String mExtension;
    @Property(name = FILE_STATUS)
    protected int mFileStatus;
    @Property(name = FROM_APPID)
    protected short mFromAppId;
    @Property(name = "fromName")
    protected String mFromName;
    @Property(exclude = {PersonalDBMessage.TABLE_NAME, PubDBMessage.TABLE_NAME}, name = FROM_PUB_ID)
    protected long mFromPubId;
    @Property(exclude = {PersonalDBMessage.TABLE_NAME, PubDBMessage.TABLE_NAME}, name = FROM_PUB_NAME)
    protected String mFromPubName;
    @Property(name = "fromUid")
    protected long mFromUid;
    @Property(name = GROUP_NAME)
    protected String mGroupName;
    @Property(name = "flag")
    protected long mMsgFlag;
    @Property(name = "msgId")
    protected long mMsgId;
    @Property(name = MSG_OPPOSITE_STATUS)
    protected int mMsgOppositeStatus;
    @Property(name = "seqid")
    protected long mMsgSeqid;
    @Property(exclude = {PersonalDBMessage.TABLE_NAME, PubDBMessage.TABLE_NAME}, name = MSG_SOURCE)
    protected byte mMsgSource;
    @Property(name = MSG_STATUS)
    protected int mMsgStatus;
    @Property(name = "type")
    protected int mMsgType;
    @Id
    @Property(name = "msgUuid")
    protected String mMsgUuid;
    @Property(name = "version")
    protected long mMsgVersion;
    @Property(name = PEER_APPID)
    protected short mPeerAppId;
    protected short mPeerDeviceType;
    @Property(name = PEER_UID)
    protected long mPeerUid;
    @Property(name = PUB_CATEGORY)
    protected int mPubCategory;
    @Property(name = RECEIPT)
    protected boolean mReceipt;
    @Property(exclude = {GroupDBMessage.TABLE_NAME}, name = SID)
    protected String mSID;
    protected long mSeqId;
    @Property(name = "sts")
    protected long mSts;
    @Property(name = TO_APPID)
    protected short mToAppId;
    @Property(name = TO_UID)
    protected long mToUid;

    public Message() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9f806e01bb9d929ec87427cde63e23c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9f806e01bb9d929ec87427cde63e23c");
            return;
        }
        this.mCategory = 1;
        this.mPubCategory = 0;
        this.mMsgType = 1;
        this.mMsgId = 0L;
        this.mMsgUuid = "";
        this.mFromAppId = (short) 0;
        this.mToAppId = (short) 0;
        this.mPeerAppId = (short) 0;
        this.mChatId = 0L;
        this.mFromUid = 0L;
        this.mFromName = "";
        this.mToUid = 0L;
        this.mPeerUid = 0L;
        this.mSts = 0L;
        this.mCts = 0L;
        this.mMsgStatus = 5;
        this.mFileStatus = 0;
        this.mExtension = "";
        this.mReceipt = false;
        this.mDirection = 0;
        this.mMsgOppositeStatus = 0;
        this.mErrorCode = 0;
        this.mSeqId = 0L;
        this.mClusterId = 0;
        this.mGroupName = "";
        this.mChannel = (short) 0;
        this.mPeerDeviceType = (short) 0;
        this.mConversationId = 0L;
        this.mMsgVersion = 0L;
        this.mMsgSeqid = 0L;
        this.mMsgFlag = 0L;
        this.mAdminUid = 0L;
        this.mCompatible = "";
        this.mDeviceId = "";
        this.mSID = "";
        this.mFromPubName = "";
    }

    public short getPeerDeviceType() {
        return this.mPeerDeviceType;
    }

    public Message setPeerDeviceType(short s) {
        this.mPeerDeviceType = s;
        return this;
    }

    @GetM(property = "mChannel")
    public short getChannel() {
        return this.mChannel;
    }

    @SetM(property = "mChannel")
    public Message setChannel(short s) {
        this.mChannel = s;
        return this;
    }

    @GetM(property = "mCategory")
    public int getCategory() {
        return this.mCategory;
    }

    @SetM(property = "mCategory")
    public void setCategory(int i) {
        this.mCategory = i;
    }

    @GetM(property = "mPubCategory")
    public int getPubCategory() {
        return this.mPubCategory;
    }

    @SetM(property = "mPubCategory")
    public void setPubCategory(int i) {
        this.mPubCategory = i;
    }

    @GetM(property = "mMsgType")
    public int getMsgType() {
        return this.mMsgType;
    }

    @SetM(property = "mMsgType")
    public void setMsgType(int i) {
        this.mMsgType = i;
    }

    @GetM(property = "mMsgId")
    public long getMsgId() {
        return this.mMsgId;
    }

    @SetM(property = "mMsgId")
    public void setMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d74dc5851e862db23e6edf8832c608f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d74dc5851e862db23e6edf8832c608f0");
        } else {
            this.mMsgId = j;
        }
    }

    @GetM(property = "mMsgUuid")
    public String getMsgUuid() {
        return this.mMsgUuid;
    }

    @SetM(property = "mMsgUuid")
    public void setMsgUuid(String str) {
        this.mMsgUuid = str;
    }

    @GetM(property = "mFromAppId")
    public short getFromAppId() {
        return this.mFromAppId;
    }

    @SetM(property = "mFromAppId")
    public void setFromAppId(short s) {
        this.mFromAppId = s;
    }

    @GetM(property = "mToAppId")
    public short getToAppId() {
        return this.mToAppId;
    }

    @SetM(property = "mToAppId")
    public void setToAppId(short s) {
        this.mToAppId = s;
    }

    @GetM(property = "mPeerAppId")
    public short getPeerAppId() {
        return this.mPeerAppId;
    }

    @SetM(property = "mPeerAppId")
    public void setPeerAppId(short s) {
        this.mPeerAppId = s;
    }

    @GetM(property = "mChatId")
    public long getChatId() {
        return this.mChatId;
    }

    @SetM(property = "mChatId")
    public void setChatId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb88c2f721b5df1cdb6ed77b3ac6b040", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb88c2f721b5df1cdb6ed77b3ac6b040");
        } else {
            this.mChatId = j;
        }
    }

    @GetM(property = "mFromUid")
    public long getFromUid() {
        return this.mFromUid;
    }

    @SetM(property = "mFromUid")
    public void setFromUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67631c4f554d3b99be1e8e50d0e9f313", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67631c4f554d3b99be1e8e50d0e9f313");
        } else {
            this.mFromUid = j;
        }
    }

    @GetM(property = "mFromName")
    public String getFromName() {
        return this.mFromName;
    }

    @SetM(property = "mFromName")
    public void setFromName(String str) {
        this.mFromName = str;
    }

    @GetM(property = "mToUid")
    public long getToUid() {
        return this.mToUid;
    }

    @SetM(property = "mToUid")
    public void setToUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e241d83dd0ed2965556bcc65645bb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e241d83dd0ed2965556bcc65645bb5");
        } else {
            this.mToUid = j;
        }
    }

    @GetM(property = "mSts")
    public long getSts() {
        return this.mSts;
    }

    @SetM(property = "mSts")
    public void setSts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbdf1ae42314e2891674b51944f2f7b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbdf1ae42314e2891674b51944f2f7b6");
        } else {
            this.mSts = j;
        }
    }

    @GetM(property = "mPeerUid")
    public long getPeerUid() {
        return this.mPeerUid;
    }

    @SetM(property = "mPeerUid")
    public void setPeerUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9157e38c60cfdd10f65679cb7804ad0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9157e38c60cfdd10f65679cb7804ad0");
        } else {
            this.mPeerUid = j;
        }
    }

    @GetM(property = "mCts")
    public long getCts() {
        return this.mCts;
    }

    @SetM(property = "mCts")
    public void setCts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc43dca5c4af505c9ccdd9d5ab23a764", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc43dca5c4af505c9ccdd9d5ab23a764");
        } else {
            this.mCts = j;
        }
    }

    @GetM(property = "mMsgStatus")
    public int getMsgStatus() {
        return this.mMsgStatus;
    }

    @SetM(property = "mMsgStatus")
    public void setMsgStatus(int i) {
        this.mMsgStatus = i;
    }

    @GetM(property = "mFileStatus")
    public int getFileStatus() {
        return this.mFileStatus;
    }

    @SetM(property = "mFileStatus")
    public void setFileStatus(int i) {
        this.mFileStatus = i;
    }

    @GetM(property = "mExtension")
    public String getExtension() {
        return this.mExtension;
    }

    @SetM(property = "mExtension")
    public void setExtension(String str) {
        this.mExtension = str;
    }

    @GetM(property = "mReceipt")
    public boolean isReceipt() {
        return this.mReceipt;
    }

    @SetM(property = "mReceipt")
    public void setReceipt(boolean z) {
        this.mReceipt = z;
    }

    @GetM(property = "mDirection")
    public int getDirection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a30b3135e3fb34ab010033394bd8c233", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a30b3135e3fb34ab010033394bd8c233")).intValue();
        }
        if (this.mDirection == 0) {
            this.mDirection = this.mFromUid == IMClient.a().k() ? 1 : 2;
        }
        return this.mDirection;
    }

    @SetM(property = "mDirection")
    public void setDirection(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba46e9ffcd88806e1cf18993e7bdb5c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba46e9ffcd88806e1cf18993e7bdb5c0");
        } else if (i == 0) {
            this.mDirection = this.mFromUid != IMClient.a().k() ? 2 : 1;
        } else {
            this.mDirection = i;
        }
    }

    public long getSeqId() {
        return this.mSeqId;
    }

    public void setSeqId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6279e42e780de6fb8a280bf5c8606d21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6279e42e780de6fb8a280bf5c8606d21");
        } else {
            this.mSeqId = j;
        }
    }

    public int getClusterId() {
        return this.mClusterId;
    }

    public void setClusterId(int i) {
        this.mClusterId = i;
    }

    @GetM(property = "mGroupName")
    public String getGroupName() {
        return this.mGroupName;
    }

    @SetM(property = "mGroupName")
    public void setGroupName(String str) {
        this.mGroupName = str;
    }

    public long getConversationId() {
        return this.mConversationId;
    }

    public void setConversationId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3e3a48d0a8a4ebe88baaa3dabdf3d18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3e3a48d0a8a4ebe88baaa3dabdf3d18");
        } else {
            this.mConversationId = j;
        }
    }

    @GetM(property = "mMsgVersion")
    public long getMsgVersion() {
        return this.mMsgVersion;
    }

    @SetM(property = "mMsgVersion")
    public void setMsgVersion(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9442ca71c926576b33fdaefb07ef1352", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9442ca71c926576b33fdaefb07ef1352");
        } else if (j != -1) {
            this.mMsgVersion = j;
        }
    }

    @GetM(property = "mMsgSeqid")
    public long getMsgSeqid() {
        return this.mMsgSeqid;
    }

    @SetM(property = "mMsgSeqid")
    public void setMsgSeqid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7b65919df30a2dd4040ed4892a1d7c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7b65919df30a2dd4040ed4892a1d7c6");
            return;
        }
        if (j < 0) {
            j = 0;
        }
        this.mMsgSeqid = j;
    }

    @GetM(property = "mMsgFlag")
    public long getMsgFlag() {
        return this.mMsgFlag;
    }

    @SetM(property = "mMsgFlag")
    public void setMsgFlag(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e364c944afc674594340f98f6cced37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e364c944afc674594340f98f6cced37");
            return;
        }
        if (j < 0) {
            j = 0;
        }
        this.mMsgFlag = j;
    }

    @GetM(property = "mMsgOppositeStatus")
    public int getMsgOppositeStatus() {
        return this.mMsgOppositeStatus;
    }

    @SetM(property = "mMsgOppositeStatus")
    public void setMsgOppositeStatus(int i) {
        this.mMsgOppositeStatus = i;
    }

    @GetM(property = "mErrorCode")
    public int getErrorCode() {
        return this.mErrorCode;
    }

    @SetM(property = "mErrorCode")
    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }

    public long getAdminUid() {
        return this.mAdminUid;
    }

    public void setAdminUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "873a33405ab8fa96a30e8313c8aa7e74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "873a33405ab8fa96a30e8313c8aa7e74");
        } else {
            this.mAdminUid = j;
        }
    }

    @GetM(property = "mCompatible")
    public String getCompatible() {
        return this.mCompatible;
    }

    @SetM(property = "mCompatible")
    public void setCompatible(String str) {
        this.mCompatible = str;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    @GetM(property = "mSID")
    public String getSID() {
        return this.mSID == null ? "" : this.mSID;
    }

    @SetM(property = "mSID")
    public void setSID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00521d5c787cfee74c7dd3470b580745", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00521d5c787cfee74c7dd3470b580745");
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mSID = str;
    }

    @GetM(property = "mFromPubId")
    public long getFromPubId() {
        return this.mFromPubId;
    }

    @SetM(property = "mFromPubId")
    public void setFromPubId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8ceb402e7ea619dd03eb0d10a7c7137", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8ceb402e7ea619dd03eb0d10a7c7137");
        } else {
            this.mFromPubId = j;
        }
    }

    @GetM(property = "mFromPubName")
    public String getFromPubName() {
        return this.mFromPubName;
    }

    @SetM(property = "mFromPubName")
    public void setFromPubName(String str) {
        this.mFromPubName = str;
    }

    @GetM(property = "mMsgSource")
    public byte getMsgSource() {
        return this.mMsgSource;
    }

    @SetM(property = "mMsgSource")
    public void setMsgSource(byte b) {
        this.mMsgSource = b;
    }

    public void copyTo(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea4341a2f41fe4b6fd5115d78c2dba5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea4341a2f41fe4b6fd5115d78c2dba5b");
            return;
        }
        message.mCategory = this.mCategory;
        message.mPubCategory = this.mPubCategory;
        message.mMsgType = this.mMsgType;
        message.mMsgId = this.mMsgId;
        message.mMsgUuid = this.mMsgUuid;
        message.mFromAppId = this.mFromAppId;
        message.mToAppId = this.mToAppId;
        message.mPeerAppId = this.mPeerAppId;
        message.mChatId = this.mChatId;
        message.mFromUid = this.mFromUid;
        message.mFromName = this.mFromName;
        message.mToUid = this.mToUid;
        message.mPeerUid = this.mPeerUid;
        message.mSts = this.mSts;
        message.mCts = this.mCts;
        message.mMsgStatus = this.mMsgStatus;
        message.mFileStatus = this.mFileStatus;
        message.mExtension = this.mExtension;
        message.mReceipt = this.mReceipt;
        message.mDirection = this.mDirection;
        message.mSeqId = this.mSeqId;
        message.mClusterId = this.mClusterId;
        message.mGroupName = this.mGroupName;
        message.mChannel = this.mChannel;
        message.mConversationId = this.mConversationId;
        message.mAdminUid = this.mAdminUid;
        message.mMsgVersion = this.mMsgVersion;
        message.mMsgOppositeStatus = this.mMsgOppositeStatus;
        message.mErrorCode = this.mErrorCode;
        message.mCompatible = this.mCompatible;
        message.mMsgSeqid = this.mMsgSeqid;
        message.mMsgFlag = this.mMsgFlag;
        message.mDeviceId = this.mDeviceId;
        message.mSID = this.mSID;
        message.mFromPubId = this.mFromPubId;
        message.mFromPubName = this.mFromPubName;
        message.mMsgSource = this.mMsgSource;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3d23d0f2d9e8e2f3dffe89983328063", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3d23d0f2d9e8e2f3dffe89983328063");
        }
        return "Message{" + keyParamToString() + ", mFromAppId=" + ((int) this.mFromAppId) + ", mToAppId=" + ((int) this.mToAppId) + ", mFromName='" + this.mFromName + "', mSts=" + this.mSts + ", mMsgStatus=" + this.mMsgStatus + ", mFileStatus=" + this.mFileStatus + " , mExtension = '" + this.mExtension + "', mReceipt=" + this.mReceipt + ", mDirection=" + this.mDirection + ", mGroupName='" + this.mGroupName + ", mConversationId='" + this.mConversationId + ", mAdminUid=" + this.mAdminUid + 125;
    }

    public String keyParamToString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d69efb3bf2d5b43c4a327f3a334adb77", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d69efb3bf2d5b43c4a327f3a334adb77");
        }
        return "key = (" + SessionId.a(this) + ", mMsgType=" + this.mMsgType + ", mMsgId=" + this.mMsgId + ", mMsgUuid='" + this.mMsgUuid + ", mFromUid=" + this.mFromUid + ", mFromPubId=" + this.mFromPubId + ", mMsgSeqId=" + this.mMsgSeqid + ", mMsgFlag=" + this.mMsgFlag + ", mDeviceId=" + this.mDeviceId + ", mErrorCode=" + this.mErrorCode + ')';
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dbb73c081bbd14f41119d7a344a5266", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dbb73c081bbd14f41119d7a344a5266")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Message message = (Message) obj;
        if (getCategory() == message.getCategory()) {
            return this.mMsgUuid != null ? this.mMsgUuid.equals(message.mMsgUuid) : message.mMsgUuid == null;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c25b91757edf426d5a7f6ec88c47bb8a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c25b91757edf426d5a7f6ec88c47bb8a")).intValue();
        }
        if (this.mMsgUuid != null) {
            return this.mMsgUuid.hashCode();
        }
        return 0;
    }

    public void setSessionId(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6472c8b7cec1c09bd5b0eef98a5a8885", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6472c8b7cec1c09bd5b0eef98a5a8885");
        } else if (sessionId == null) {
        } else {
            this.mChatId = sessionId.b;
            this.mCategory = sessionId.e;
            this.mPeerUid = sessionId.c;
            this.mChannel = sessionId.g;
            this.mPeerAppId = sessionId.d;
            this.mPubCategory = sessionId.e();
            this.mSID = sessionId.g();
        }
    }
}
