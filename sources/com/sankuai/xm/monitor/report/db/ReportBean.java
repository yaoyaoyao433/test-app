package com.sankuai.xm.monitor.report.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.NotNull;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(name = ReportBean.TABLE_NAME)
/* loaded from: classes6.dex */
public class ReportBean {
    public static final int FAILED = 10;
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String PRIORITY = "priority";
    public static final int RUNNING = 5;
    public static final String STATUS = "status";
    public static final int SUCCESS = 8;
    public static final String TABLE_NAME = "statistics_report";
    public static final String TIME = "time";
    public static final String TYPE = "statistics_type";
    public static final String TYPE_ELE = "ele";
    public static final String UID = "uid";
    public static final String VALUE = "value";
    public static final String VALUE_1 = "value1";
    public static final String VALUE_2 = "value2";
    public static final int WAIT = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Id(autoincrement = true)
    @Property(name = "id")
    @NotNull
    public int id;
    @Property(name = "name")
    @NotNull
    public String name;
    @Property(name = "priority")
    public int priority;
    @Property(name = "status")
    public int status;
    @Property(name = "time")
    public long time;
    @Property(name = TYPE)
    public String type;
    @Property(name = "uid")
    public String uid;
    @Property(name = "value")
    public String value;
    @Property(name = VALUE_1)
    public String value1;
    @Property(name = VALUE_2)
    public String value2;

    public ReportBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "639ef8d8e22d1f0bf1858440b2793e4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "639ef8d8e22d1f0bf1858440b2793e4d");
        } else {
            this.status = 1;
        }
    }

    @GetM(property = "id")
    public int getId() {
        return this.id;
    }

    @SetM(property = "id")
    public void setId(int i) {
        this.id = i;
    }

    @GetM(property = "name")
    public String getName() {
        return this.name;
    }

    @SetM(property = "name")
    public void setName(String str) {
        this.name = str;
    }

    @GetM(property = "type")
    public String getType() {
        return this.type;
    }

    @SetM(property = "type")
    public void setType(String str) {
        this.type = str;
    }

    @GetM(property = "priority")
    public int getPriority() {
        return this.priority;
    }

    @SetM(property = "priority")
    public void setPriority(int i) {
        this.priority = i;
    }

    @GetM(property = "time")
    public long getTime() {
        return this.time;
    }

    @SetM(property = "time")
    public void setTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ff0af77119f36cfb539db6267dff264", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ff0af77119f36cfb539db6267dff264");
        } else {
            this.time = j;
        }
    }

    @GetM(property = "value")
    public String getValue() {
        return this.value;
    }

    @SetM(property = "value")
    public void setValue(String str) {
        this.value = str;
    }

    @GetM(property = "status")
    public int getStatus() {
        return this.status;
    }

    @SetM(property = "status")
    public void setStatus(int i) {
        this.status = i;
    }

    @GetM(property = "uid")
    public String getUid() {
        return this.uid;
    }

    @SetM(property = "uid")
    public void setUid(String str) {
        this.uid = str;
    }

    @GetM(property = VALUE_1)
    public String getValue1() {
        return this.value1;
    }

    @SetM(property = VALUE_1)
    public void setValue1(String str) {
        this.value1 = str;
    }

    @GetM(property = VALUE_2)
    public String getValue2() {
        return this.value2;
    }

    @SetM(property = VALUE_2)
    public void setValue2(String str) {
        this.value2 = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5acf949d73a87b520846826d96bcb8b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5acf949d73a87b520846826d96bcb8b");
        }
        return "ReportBean{id=" + this.id + ", name='" + this.name + "', type='" + this.type + "', priority=" + this.priority + ", time=" + this.time + ", value='" + this.value + "', status=" + this.status + ", uid='" + this.uid + "', value1='" + this.value1 + "', value2='" + this.value2 + "'}";
    }
}
