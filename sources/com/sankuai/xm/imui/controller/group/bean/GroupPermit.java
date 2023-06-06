package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(name = GroupPermit.TABLE_NAME)
/* loaded from: classes6.dex */
public class GroupPermit {
    public static final String GROUP_ID = "gid";
    public static final String NAME = "name";
    public static final String TABLE_NAME = "group_permit";
    public static final String VALUE = "value";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Id
    @Property(name = "gid")
    private long mGid;
    @Id
    @Property(name = "name")
    private String mName;
    @Property(name = "value")
    private int mValue;

    @GetM(property = "mGid")
    public long getGid() {
        return this.mGid;
    }

    @SetM(property = "mGid")
    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c82b1368977ecc548394b3fbe4a195a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c82b1368977ecc548394b3fbe4a195a");
        } else {
            this.mGid = j;
        }
    }

    @GetM(property = "mName")
    public String getName() {
        return this.mName;
    }

    @SetM(property = "mName")
    public void setName(String str) {
        this.mName = str;
    }

    @GetM(property = "mValue")
    public int getValue() {
        return this.mValue;
    }

    @SetM(property = "mValue")
    public void setValue(int i) {
        this.mValue = i;
    }

    public String getStringValue() {
        return this.mValue == 1 ? "true" : "false";
    }

    public void setStringValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc3400c8de7f797fe45892cbb42d2ddd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc3400c8de7f797fe45892cbb42d2ddd");
        } else {
            this.mValue = "true".equals(str) ? 1 : 0;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cfb5503d9bdb7cb467a71bd5e528fc0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cfb5503d9bdb7cb467a71bd5e528fc0");
        }
        return "GroupPermit{mGid=" + this.mGid + ", mName='" + this.mName + "', mValue=" + this.mValue + '}';
    }
}
