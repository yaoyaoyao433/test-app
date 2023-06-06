package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class DBMessage extends Message {
    public static final String CONTENT = "content";
    public static final String RESERVE_32_FIVE = "reserve32Five";
    public static final String RESERVE_32_FOUR = "reserve32Four";
    public static final String RESERVE_32_ONE = "reserve32One";
    public static final String RESERVE_32_SIX = "reserve32Six";
    public static final String RESERVE_32_THREE = "reserve32Three";
    public static final String RESERVE_32_TWO = "reserve32Two";
    public static final String RESERVE_64_FIVE = "reserve64Five";
    public static final String RESERVE_64_FOUR = "reserve64Four";
    public static final String RESERVE_64_ONE = "reserve64One";
    public static final String RESERVE_64_THREE = "reserve64Three";
    public static final String RESERVE_64_TWO = "reserve64Two";
    public static final String RESERVE_CONTENT_ONE = "reserveContentOne";
    public static final String RESERVE_CONTENT_THREE = "reserveContentThree";
    public static final String RESERVE_CONTENT_TWO = "reserveContentTwo";
    public static final String RESERVE_STRING_FOUR = "reserveStringFour";
    public static final String RESERVE_STRING_ONE = "reserveStringOne";
    public static final String RESERVE_STRING_THREE = "reserveStringThree";
    public static final String RESERVE_STRING_TWO = "reserveStringTwo";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = "content")
    private String mContent;
    @Property(name = RESERVE_32_FIVE)
    private int mReserve32Five;
    @Property(name = RESERVE_32_FOUR)
    private int mReserve32Four;
    @Property(name = RESERVE_32_ONE)
    private int mReserve32One;
    @Property(name = RESERVE_32_SIX)
    private int mReserve32Six;
    @Property(name = RESERVE_32_THREE)
    private int mReserve32Three;
    @Property(name = RESERVE_32_TWO)
    private int mReserve32Two;
    @Property(name = RESERVE_64_FIVE)
    private long mReserve64Five;
    @Property(name = RESERVE_64_FOUR)
    private long mReserve64Four;
    @Property(name = RESERVE_64_ONE)
    private long mReserve64One;
    @Property(name = RESERVE_64_THREE)
    private long mReserve64Three;
    @Property(name = RESERVE_64_TWO)
    private long mReserve64Two;
    @Property(name = RESERVE_CONTENT_ONE)
    private String mReserveContentOne;
    @Property(name = RESERVE_CONTENT_THREE)
    private String mReserveContentThree;
    @Property(name = RESERVE_CONTENT_TWO)
    private String mReserveContentTwo;
    @Property(name = RESERVE_STRING_FOUR)
    private String mReserveStringFour;
    @Property(name = RESERVE_STRING_ONE)
    private String mReserveStringOne;
    @Property(name = RESERVE_STRING_THREE)
    private String mReserveStringThree;
    @Property(name = RESERVE_STRING_TWO)
    private String mReserveStringTwo;

    public DBMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1edffa51c6250b2a4ceb922b3ae7af0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1edffa51c6250b2a4ceb922b3ae7af0");
            return;
        }
        this.mContent = "";
        this.mReserveContentOne = "";
        this.mReserveContentTwo = "";
        this.mReserveContentThree = "";
        this.mReserveStringOne = "";
        this.mReserveStringTwo = "";
        this.mReserveStringThree = "";
        this.mReserveStringFour = "";
        this.mReserve64One = 0L;
        this.mReserve64Two = 0L;
        this.mReserve64Three = 0L;
        this.mReserve64Four = 0L;
        this.mReserve64Five = 0L;
        this.mReserve32One = 0;
        this.mReserve32Two = 0;
        this.mReserve32Three = 0;
        this.mReserve32Four = 0;
        this.mReserve32Five = 0;
        this.mReserve32Six = 0;
    }

    @GetM(property = "mContent")
    public String getContent() {
        return this.mContent;
    }

    @SetM(property = "mContent")
    public void setContent(String str) {
        this.mContent = str;
    }

    @GetM(property = "mReserveContentOne")
    public String getReserveContentOne() {
        return this.mReserveContentOne;
    }

    @SetM(property = "mReserveContentOne")
    public void setReserveContentOne(String str) {
        this.mReserveContentOne = str;
    }

    @GetM(property = "mReserveContentTwo")
    public String getReserveContentTwo() {
        return this.mReserveContentTwo;
    }

    @SetM(property = "mReserveContentTwo")
    public void setReserveContentTwo(String str) {
        this.mReserveContentTwo = str;
    }

    @GetM(property = "mReserveContentThree")
    public String getReserveContentThree() {
        return this.mReserveContentThree;
    }

    @SetM(property = "mReserveContentThree")
    public void setReserveContentThree(String str) {
        this.mReserveContentThree = str;
    }

    @GetM(property = "mReserveStringOne")
    public String getReserveStringOne() {
        return this.mReserveStringOne;
    }

    @SetM(property = "mReserveStringOne")
    public void setReserveStringOne(String str) {
        this.mReserveStringOne = str;
    }

    @GetM(property = "mReserveStringTwo")
    public String getReserveStringTwo() {
        return this.mReserveStringTwo;
    }

    @SetM(property = "mReserveStringTwo")
    public void setReserveStringTwo(String str) {
        this.mReserveStringTwo = str;
    }

    @GetM(property = "mReserveStringThree")
    public String getReserveStringThree() {
        return this.mReserveStringThree;
    }

    @SetM(property = "mReserveStringThree")
    public void setReserveStringThree(String str) {
        this.mReserveStringThree = str;
    }

    @GetM(property = "mReserveStringFour")
    public String getReserveStringFour() {
        return this.mReserveStringFour;
    }

    @SetM(property = "mReserveStringFour")
    public void setReserveStringFour(String str) {
        this.mReserveStringFour = str;
    }

    @GetM(property = "mReserve64One")
    public long getReserve64One() {
        return this.mReserve64One;
    }

    @SetM(property = "mReserve64One")
    public void setReserve64One(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72fbae655bc1ef9583390579baa417c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72fbae655bc1ef9583390579baa417c0");
        } else {
            this.mReserve64One = j;
        }
    }

    @GetM(property = "mReserve64Two")
    public long getReserve64Two() {
        return this.mReserve64Two;
    }

    @SetM(property = "mReserve64Two")
    public void setReserve64Two(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd2ca4ad97ecf5466c63c35277650ff1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd2ca4ad97ecf5466c63c35277650ff1");
        } else {
            this.mReserve64Two = j;
        }
    }

    @GetM(property = "mReserve64Three")
    public long getReserve64Three() {
        return this.mReserve64Three;
    }

    @SetM(property = "mReserve64Three")
    public void setReserve64Three(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41d1c68638cfd30814530ebdfbe34469", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41d1c68638cfd30814530ebdfbe34469");
        } else {
            this.mReserve64Three = j;
        }
    }

    @GetM(property = "mReserve64Four")
    public long getReserve64Four() {
        return this.mReserve64Four;
    }

    @SetM(property = "mReserve64Four")
    public void setReserve64Four(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f037070d7ede7d8a8d1b4fa949f8fa20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f037070d7ede7d8a8d1b4fa949f8fa20");
        } else {
            this.mReserve64Four = j;
        }
    }

    @GetM(property = "mReserve64Five")
    public long getReserve64Five() {
        return this.mReserve64Five;
    }

    @SetM(property = "mReserve64Five")
    public void setReserve64Five(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b58cb06eb455e56bc6747bba7f2d243b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b58cb06eb455e56bc6747bba7f2d243b");
        } else {
            this.mReserve64Five = j;
        }
    }

    @GetM(property = "mReserve32One")
    public int getReserve32One() {
        return this.mReserve32One;
    }

    @SetM(property = "mReserve32One")
    public void setReserve32One(int i) {
        this.mReserve32One = i;
    }

    @GetM(property = "mReserve32Two")
    public int getReserve32Two() {
        return this.mReserve32Two;
    }

    @SetM(property = "mReserve32Two")
    public void setReserve32Two(int i) {
        this.mReserve32Two = i;
    }

    @GetM(property = "mReserve32Three")
    public int getReserve32Three() {
        return this.mReserve32Three;
    }

    @SetM(property = "mReserve32Three")
    public void setReserve32Three(int i) {
        this.mReserve32Three = i;
    }

    @GetM(property = "mReserve32Four")
    public int getReserve32Four() {
        return this.mReserve32Four;
    }

    @SetM(property = "mReserve32Four")
    public void setReserve32Four(int i) {
        this.mReserve32Four = i;
    }

    @GetM(property = "mReserve32Five")
    public int getReserve32Five() {
        return this.mReserve32Five;
    }

    @SetM(property = "mReserve32Five")
    public void setReserve32Five(int i) {
        this.mReserve32Five = i;
    }

    @GetM(property = "mReserve32Six")
    public int getReserve32Six() {
        return this.mReserve32Six;
    }

    @SetM(property = "mReserve32Six")
    public void setReserve32Six(int i) {
        this.mReserve32Six = i;
    }

    @Override // com.sankuai.xm.im.message.bean.Message
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0678ab6d951538d8376f0496d55367f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0678ab6d951538d8376f0496d55367f");
        }
        return "DBMessage{" + super.toString() + ", mContent='" + this.mContent + "', mReserveContentOne='" + this.mReserveContentOne + "', mReserveContentTwo='" + this.mReserveContentTwo + "', mReserveContentThree='" + this.mReserveContentThree + "', mReserveStringOne='" + this.mReserveStringOne + "', mReserveStringTwo='" + this.mReserveStringTwo + "', mReserveStringThree='" + this.mReserveStringThree + "', mReserveStringFour='" + this.mReserveStringFour + "', mReserve64One=" + this.mReserve64One + ", mReserve64Two=" + this.mReserve64Two + ", mReserve64Three=" + this.mReserve64Three + ", mReserve64Four=" + this.mReserve64Four + ", mReserve64Five=" + this.mReserve64Five + ", mReserve32One=" + this.mReserve32One + ", mReserve32Two=" + this.mReserve32Two + ", mReserve32Three=" + this.mReserve32Three + ", mReserve32Four=" + this.mReserve32Four + ", mReserve32Five=" + this.mReserve32Five + ", mReserve32Six=" + this.mReserve32Six + '}';
    }
}
