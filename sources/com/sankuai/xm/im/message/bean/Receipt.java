package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Receipt {
    public static final String MSG_ID = "msgId";
    public static final String MSG_UUID = "msgUuid";
    public static final String RECEIPT_COUNT = "receiptCount";
    public static final String RECEIPT_UIDS = "receiptUids";
    public static final String STAMP = "stamp";
    public static final String UN_RECEIPT_COUNT = "unReceiptCount";
    public static final String UN_RECEIPT_UIDS = "unReceiptUids";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Id
    @Property(name = "msgUuid")
    private String mMsgUuid;
    @Property(name = RECEIPT_COUNT)
    private int mReceiptCount;
    @Property(name = RECEIPT_UIDS)
    private String mReceiptUids;
    @Property(name = STAMP)
    private long mStamp;
    @Property(name = UN_RECEIPT_COUNT)
    private int mUnReceiptCount;
    @Property(name = UN_RECEIPT_UIDS)
    private String mUnReceiptUids;
    @Property(name = "msgId")
    private long msgId;

    @GetM(property = "mMsgUuid")
    public String getMsgUuid() {
        return this.mMsgUuid;
    }

    @SetM(property = "mMsgUuid")
    public void setMsgUuid(String str) {
        this.mMsgUuid = str;
    }

    @GetM(property = "mUnReceiptUids")
    public String getUnReceiptUids() {
        return this.mUnReceiptUids;
    }

    @SetM(property = "mUnReceiptUids")
    public void setUnReceiptUids(String str) {
        this.mUnReceiptUids = str;
    }

    @GetM(property = "mReceiptUids")
    public String getReceiptUids() {
        return this.mReceiptUids;
    }

    @SetM(property = "mReceiptUids")
    public void setReceiptUids(String str) {
        this.mReceiptUids = str;
    }

    @GetM(property = "mUnReceiptCount")
    public int getUnReceiptCount() {
        return this.mUnReceiptCount;
    }

    @SetM(property = "mUnReceiptCount")
    public void setUnReceiptCount(int i) {
        this.mUnReceiptCount = i;
    }

    @GetM(property = "mReceiptCount")
    public int getReceiptCount() {
        return this.mReceiptCount;
    }

    @SetM(property = "mReceiptCount")
    public void setReceiptCount(int i) {
        this.mReceiptCount = i;
    }

    @GetM(property = "mStamp")
    public long getStamp() {
        return this.mStamp;
    }

    @SetM(property = "mStamp")
    public void setStamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d92eef2ba05b2253e15834ea0664d0a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d92eef2ba05b2253e15834ea0664d0a6");
        } else {
            this.mStamp = j;
        }
    }

    @GetM(property = "msgId")
    public long getMsgId() {
        return this.msgId;
    }

    @SetM(property = "msgId")
    public void setMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0e2dd9d3ea8fa02d87c125d8947f6e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0e2dd9d3ea8fa02d87c125d8947f6e5");
        } else {
            this.msgId = j;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "786966ad2963e7d892030559d9fbe6e9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "786966ad2963e7d892030559d9fbe6e9");
        }
        return "Receipt{msgId=" + this.msgId + ", mMsgUuid='" + this.mMsgUuid + "', mUnReceiptCount=" + this.mUnReceiptCount + ", mReceiptCount=" + this.mReceiptCount + ", mUnReceiptUids='" + this.mUnReceiptUids + "', mReceiptUids='" + this.mReceiptUids + "', mStamp=" + this.mStamp + '}';
    }
}
