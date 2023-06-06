package com.sankuai.xm.monitor.report.db;

import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.cache.bean.DBGroupOpposite;
import com.sankuai.xm.monitor.trace.rule.d;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.NotNull;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
import java.util.Arrays;
/* compiled from: ProGuard */
@Entity(name = TraceBean.TABLE_NAME)
/* loaded from: classes6.dex */
public class TraceBean {
    public static final String ACTION = "action";
    public static final String CREATE_TIME = "create_time";
    public static final String DEADLINE = "deadline";
    public static final String EXE_TIME = "exe_time";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String PARAMS = "params";
    public static final String RULE = "rule";
    public static final String SHARED_IDS = "shared_ids";
    public static final String STATUS = "status";
    public static final int STATUS_BIZ_ERROR = 8;
    public static final int STATUS_CRASH = 2;
    public static final int STATUS_NORMAL = 1;
    public static final int STATUS_START = 0;
    public static final int STATUS_TIMEOUT = 4;
    public static final int STRATEGY_NONE = 2;
    public static final int STRATEGY_NORMAL = 0;
    public static final String TABLE_NAME = "chain_trace";
    public static final String TOOL = "tool";
    public static final int TRACE_DEFAULT_INTERVAL = 10000;
    public static final String TRACE_ID = "trace_id";
    public static final String TRACE_NAME = "trace_name";
    public static final String TYPE = "type";
    public static final String UID = "uid";
    public static final String UPDATE_TIME = "update_time";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = "action")
    private String action;
    @Property(name = CREATE_TIME)
    private long createTime;
    @Property(name = DEADLINE)
    private long deadline;
    @Property(name = EXE_TIME)
    private long exeTime;
    @Id
    @Property(name = "id")
    @NotNull
    private String id;
    @Property(name = "name")
    @NotNull
    private String name;
    @Property(name = "params")
    private String params;
    @Property(name = RULE)
    private int rule;
    @Property(name = SHARED_IDS)
    private String sharedIds;
    @Property(name = "status")
    private int status;
    @Property(name = TOOL)
    private int tool;
    @Id
    @Property(name = "trace_id")
    @NotNull
    private long traceId;
    @Property(name = TRACE_NAME)
    private String traceName;
    @Property(name = "type")
    @NotNull
    private String type;
    @Property(name = "uid")
    private long uid;
    @Property(name = UPDATE_TIME)
    private long updateTime;

    public TraceBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "314461ee3ef5a0b72048e185448e46f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "314461ee3ef5a0b72048e185448e46f0");
            return;
        }
        this.rule = 0;
        this.tool = d.c;
        this.status = 1;
    }

    @GetM(property = "id")
    public String getId() {
        return this.id;
    }

    @SetM(property = "id")
    public void setId(String str) {
        this.id = str;
    }

    @GetM(property = "name")
    public String getName() {
        return this.name;
    }

    @SetM(property = "name")
    public void setName(String str) {
        this.name = str;
    }

    @GetM(property = "uid")
    public long getUid() {
        return this.uid;
    }

    @SetM(property = "uid")
    public void setUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0a089e72bb2d7b1cd5e35b02d631acc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0a089e72bb2d7b1cd5e35b02d631acc");
        } else {
            this.uid = j;
        }
    }

    @GetM(property = RULE)
    public int getRule() {
        return this.rule;
    }

    @SetM(property = RULE)
    public void setRule(int i) {
        this.rule = i;
    }

    @GetM(property = TOOL)
    public int getTool() {
        return this.tool;
    }

    @SetM(property = TOOL)
    public void setTool(int i) {
        this.tool = i;
    }

    @GetM(property = DEADLINE)
    public long getDeadline() {
        if (this.deadline == 0) {
            return this.createTime + 10000;
        }
        return this.deadline;
    }

    @SetM(property = DEADLINE)
    public void setDeadline(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7841dce50d14e144997b692b946eac9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7841dce50d14e144997b692b946eac9");
        } else {
            this.deadline = j;
        }
    }

    @GetM(property = "createTime")
    public long getCreateTime() {
        return this.createTime;
    }

    @SetM(property = "createTime")
    public void setCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7b482e8725ca90e426d5a103bc9deca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7b482e8725ca90e426d5a103bc9deca");
        } else {
            this.createTime = j;
        }
    }

    @GetM(property = "exeTime")
    public long getExeTime() {
        return this.exeTime;
    }

    @SetM(property = "exeTime")
    public void setExeTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dd4cac13c10bac5550f0ea7204b2de0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dd4cac13c10bac5550f0ea7204b2de0");
        } else {
            this.exeTime = j;
        }
    }

    @GetM(property = DBGroupOpposite.UPDATE_TIME)
    public long getUpdateTime() {
        return this.updateTime;
    }

    @SetM(property = DBGroupOpposite.UPDATE_TIME)
    public void setUpdateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7102961b2c5c002272d64058e598f108", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7102961b2c5c002272d64058e598f108");
        } else {
            this.updateTime = j;
        }
    }

    @GetM(property = "status")
    public int getStatus() {
        return this.status;
    }

    @SetM(property = "status")
    public void setStatus(int i) {
        this.status = i;
    }

    @GetM(property = NetLogConstants.Tags.TRACE_ID)
    public long getTraceId() {
        return this.traceId;
    }

    @SetM(property = NetLogConstants.Tags.TRACE_ID)
    public void setTraceId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49374380ab6349d2981762a0d441d5fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49374380ab6349d2981762a0d441d5fb");
        } else {
            this.traceId = j;
        }
    }

    @GetM(property = "traceName")
    public String getTraceName() {
        return this.traceName;
    }

    @SetM(property = "traceName")
    public void setTraceName(String str) {
        this.traceName = str;
    }

    @GetM(property = "type")
    public String getType() {
        return this.type;
    }

    @SetM(property = "type")
    public void setType(String str) {
        this.type = str;
    }

    @GetM(property = "sharedIds")
    public String getSharedIds() {
        return this.sharedIds;
    }

    @SetM(property = "sharedIds")
    public void setSharedIds(String str) {
        this.sharedIds = str;
    }

    @GetM(property = "params")
    public String getParams() {
        return this.params;
    }

    @SetM(property = "params")
    public void setParams(String str) {
        this.params = str;
    }

    @GetM(property = "action")
    public String getAction() {
        return this.action;
    }

    @SetM(property = "action")
    public void setAction(String str) {
        this.action = str;
    }

    public void update(TraceBean traceBean) {
        Object[] objArr = {traceBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a5c62fde9adeb67dc95adbbff63336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a5c62fde9adeb67dc95adbbff63336");
            return;
        }
        updateStatus(traceBean);
        this.updateTime = traceBean.getUpdateTime();
    }

    public boolean finishStatus() {
        return this.status != 0;
    }

    private void updateStatus(TraceBean traceBean) {
        Object[] objArr = {traceBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39a7929e7108d885f5da349a51a43cdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39a7929e7108d885f5da349a51a43cdb");
        } else {
            setStatus(traceBean.getStatus() | getStatus());
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b47480da122e2c9a121828f4c04d370", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b47480da122e2c9a121828f4c04d370")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TraceBean traceBean = (TraceBean) obj;
        return this.rule == traceBean.rule && this.deadline == traceBean.deadline && this.createTime == traceBean.createTime && this.updateTime == traceBean.updateTime && this.status == traceBean.status && this.id.equals(traceBean.id) && this.name.equals(traceBean.name) && this.uid == traceBean.uid;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3281f1b275b0e8079922ae82bfb197f", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3281f1b275b0e8079922ae82bfb197f")).intValue() : hash(this.id, Long.valueOf(this.traceId), this.type, Integer.valueOf(this.rule), Integer.valueOf(this.tool), Long.valueOf(this.deadline), Long.valueOf(this.createTime), Long.valueOf(this.exeTime), Long.valueOf(this.updateTime), Integer.valueOf(this.status), Long.valueOf(this.uid));
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b12fe0c0ebf43e929070a74dae7954d4", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b12fe0c0ebf43e929070a74dae7954d4");
        }
        return "TraceBean{id='" + this.id + "', name='" + this.name + "', uid='" + this.uid + "', rule=" + this.rule + ", deadline=" + this.deadline + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", status=" + this.status + '}';
    }

    private int hash(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f77e001368f4896dc70c101479bf854", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f77e001368f4896dc70c101479bf854")).intValue() : Arrays.hashCode(objArr);
    }
}
