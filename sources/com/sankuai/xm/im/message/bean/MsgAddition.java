package com.sankuai.xm.im.message.bean;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.base.util.p;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.login.a;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
@Entity(name = MsgAddition.TABLE)
/* loaded from: classes6.dex */
public class MsgAddition {
    public static final String CATEGORY = "category";
    public static final String CHANNEL = "channel";
    public static final String DATA = "data";
    public static final String DID = "did";
    public static final String DT = "dt";
    public static final String FINAL = "final";
    public static final String FROM = "from_uid";
    public static final String MSG_ID = "msgid";
    public static final String RECEIVERS = "recvs";
    public static final String SEQ_ID = "seqid";
    public static final String STS = "sts";
    public static final String TABLE = "addition";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = "data")
    private String mAdditionData;
    @Property(name = "category")
    private int mCategory;
    @Property(name = "channel")
    private short mChannel;
    @Property(name = "did")
    private String mDeviceId;
    @Property(name = DT)
    private byte mDeviceType;
    @Property(name = FROM)
    private long mFromUid;
    @Property(name = FINAL)
    private boolean mIsFinal;
    @Id
    @Property(name = "msgid")
    private long mMsgId;
    @Property(name = RECEIVERS)
    private Set<Long> mReceivers;
    private int mRetries;
    private String mSendUuid;
    @Property(name = "seqid")
    private int mSeqId;
    @Property(name = "sts")
    private long mSts;

    @Deprecated
    public static MsgAddition createSendObj(@NonNull SessionId sessionId, @IntRange(from = 1) long j, @NonNull String str, boolean z, boolean z2) {
        Object[] objArr = {sessionId, new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8cbce7f2d0e7cce9ace04f772fa8fbe", 6917529027641081856L) ? (MsgAddition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8cbce7f2d0e7cce9ace04f772fa8fbe") : new MsgAddition();
    }

    @GetM(property = "mCategory")
    @Deprecated
    public int getCategory() {
        return this.mCategory;
    }

    @SetM(property = "mCategory")
    public void setCategory(int i) {
        this.mCategory = i;
    }

    @GetM(property = "mFromUid")
    public long getFromUid() {
        return this.mFromUid;
    }

    @SetM(property = "mFromUid")
    public void setFromUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3034653590c00d58b4f97ce910a86c92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3034653590c00d58b4f97ce910a86c92");
        } else {
            this.mFromUid = j;
        }
    }

    @GetM(property = "mDeviceType")
    public byte getDeviceType() {
        return this.mDeviceType;
    }

    @SetM(property = "mDeviceType")
    public void setDeviceType(byte b) {
        this.mDeviceType = b;
    }

    @GetM(property = "mDeviceId")
    public String getDeviceId() {
        return this.mDeviceId;
    }

    @SetM(property = "mDeviceId")
    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    @GetM(property = "mMsgId")
    public long getMsgId() {
        return this.mMsgId;
    }

    @SetM(property = "mMsgId")
    public void setMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aba59f2cbcc0b57a513aff9f82340c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aba59f2cbcc0b57a513aff9f82340c7");
        } else {
            this.mMsgId = j;
        }
    }

    @GetM(property = "mChannel")
    public short getChannel() {
        return this.mChannel;
    }

    @SetM(property = "mChannel")
    public void setChannel(short s) {
        this.mChannel = s;
    }

    @GetM(property = "mAdditionData")
    public String getAdditionData() {
        return this.mAdditionData;
    }

    @SetM(property = "mAdditionData")
    public void setAdditionData(String str) {
        this.mAdditionData = str;
    }

    @GetM(property = "mSts")
    public long getSts() {
        return this.mSts;
    }

    @SetM(property = "mSts")
    public void setSts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e4334f1904db5b55a89a8c0215a9e08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e4334f1904db5b55a89a8c0215a9e08");
        } else {
            this.mSts = j;
        }
    }

    @GetM(property = "mSeqId")
    public int getSeqId() {
        return this.mSeqId;
    }

    @SetM(property = "mSeqId")
    public void setSeqId(int i) {
        this.mSeqId = i;
    }

    @GetM(property = "mIsFinal")
    public boolean isFinal() {
        return this.mIsFinal;
    }

    @SetM(property = "mIsFinal")
    public void setFinal(boolean z) {
        this.mIsFinal = z;
    }

    @Deprecated
    public String getSendUuid() {
        return this.mSendUuid;
    }

    public boolean isOnlyOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea4e52fc0cced2d047267f07d10e4d6d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea4e52fc0cced2d047267f07d10e4d6d")).booleanValue() : b.b(this.mReceivers) == 1 && this.mReceivers.contains(Long.valueOf(a.a().e()));
    }

    public Set<Long> getReceiverSet() {
        return this.mReceivers;
    }

    public void setReceivers(Set<Long> set) {
        this.mReceivers = set;
    }

    public void setReceivers(long[] jArr) {
        Object[] objArr = {jArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c482c1b97257e55f6b8cfffe8ed2d12f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c482c1b97257e55f6b8cfffe8ed2d12f");
        } else if (jArr != null) {
            this.mReceivers = new HashSet(jArr.length);
            for (long j : jArr) {
                this.mReceivers.add(Long.valueOf(j));
            }
        }
    }

    public long[] getReceiversArr() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c77f623cba647ad719e755b845fc29b0", 6917529027641081856L)) {
            return (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c77f623cba647ad719e755b845fc29b0");
        }
        if (b.a(this.mReceivers)) {
            return null;
        }
        long[] jArr = new long[this.mReceivers.size()];
        for (Long l : this.mReceivers) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    @SetM(property = "mReceivers")
    public void setReceivers(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a9d3a808e5e500df7eef1056987e1db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a9d3a808e5e500df7eef1056987e1db");
        } else if (this.mReceivers == null && !ac.a(str)) {
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            if (b.b(split)) {
                return;
            }
            this.mReceivers = new HashSet(split.length);
            for (String str2 : split) {
                this.mReceivers.add(Long.valueOf(Long.parseLong(str2)));
            }
        }
    }

    @GetM(property = "mReceivers")
    public String getReceivers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aab25107f2294fd742646b19f4511d31", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aab25107f2294fd742646b19f4511d31");
        }
        if (b.a(this.mReceivers)) {
            return "";
        }
        String obj = this.mReceivers.toString();
        return obj.substring(1, obj.length() - 1);
    }

    public int getRetries() {
        return this.mRetries;
    }

    public void addRetry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be1f483fed2c8fd60b01b6f7f885847f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be1f483fed2c8fd60b01b6f7f885847f");
        } else {
            this.mRetries++;
        }
    }

    public boolean newThan(MsgAddition msgAddition) {
        Object[] objArr = {msgAddition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb0f640f9c3dad33fe42a092ec7c7f57", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb0f640f9c3dad33fe42a092ec7c7f57")).booleanValue() : msgAddition == null || this.mSts > msgAddition.mSts || (this.mSts == msgAddition.mSts && this.mSeqId > msgAddition.mSeqId);
    }

    public boolean valid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f17c4761f88df215e799805b18b065cf", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f17c4761f88df215e799805b18b065cf")).booleanValue();
        }
        if (this.mMsgId > 0) {
            return !ac.a(this.mAdditionData) || neverChange();
        }
        return false;
    }

    public boolean neverChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f627037017b1b23fbe178d86f7cf92ce", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f627037017b1b23fbe178d86f7cf92ce")).booleanValue() : ac.a(this.mAdditionData) && this.mIsFinal;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "373915f263863a9fbb325c7617b21984", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "373915f263863a9fbb325c7617b21984")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof MsgAddition) {
            MsgAddition msgAddition = (MsgAddition) obj;
            return this.mMsgId == msgAddition.mMsgId && this.mChannel == msgAddition.mChannel;
        }
        return false;
    }

    @RequiresApi(api = 19)
    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "754673fd8a920568d561f8cfc9fc7a68", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "754673fd8a920568d561f8cfc9fc7a68")).intValue() : p.a(Long.valueOf(this.mMsgId), Short.valueOf(this.mChannel));
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24084c5f8e32c62f1a4f4ae14b5acdcd", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24084c5f8e32c62f1a4f4ae14b5acdcd");
        }
        return "MsgAddition{ mFromUid=" + this.mFromUid + ", mDeviceType=" + ((int) this.mDeviceType) + ", mDeviceId='" + this.mDeviceId + "', mMsgId=" + this.mMsgId + ", mChannel=" + ((int) this.mChannel) + ", mAdditionData='" + this.mAdditionData + "', mReceivers=" + this.mReceivers + ", mSts=" + this.mSts + ", mSeqId=" + this.mSeqId + ", mIsFinal=" + this.mIsFinal + '}';
    }
}
