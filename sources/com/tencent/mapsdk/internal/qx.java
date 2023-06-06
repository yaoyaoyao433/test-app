package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qx implements TrafficEvent {
    private static final String a = "yyyy/MM/dd HH时";
    private static final String[] c = {"交通事故", "交通管制", "道路施工", "路上障碍物", "活动", "恶劣天气", "灾害", "拥堵", "检查", "一般事故", "积水", "其他事件"};
    private static final String[] d = {"发生", "出现", "有", "有", "有", "出现", "有", "出现", "有", "发生", "有", "有"};
    private Detail b;

    public qx(Detail detail) {
        this.b = detail;
    }

    private Detail a() {
        return this.b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final String getSource() {
        return this.b.basic.source;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final String getType() {
        if (this.b.basic.type > c.length) {
            String[] strArr = c;
            return strArr[strArr.length - 1];
        }
        return c[this.b.basic.type - 1];
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final int getStartTime() {
        return this.b.basic.start_time;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final int getEndTime() {
        return this.b.basic.end_time;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final int getUpdateTime() {
        return this.b.basic.update_time;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final String getMessage() {
        return this.b.basic.message;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final String getRoadName() {
        return this.b.basic.roadname;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final String getDescription() {
        String str;
        if (this.b.basic.type > c.length) {
            str = d[c.length - 1];
        } else {
            str = d[this.b.basic.type - 1];
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(a, Locale.US);
        return simpleDateFormat.format(new Date(this.b.basic.start_time * 1000)) + " - " + simpleDateFormat.format(new Date(this.b.basic.end_time * 1000)) + (char) 65292 + getRoadName() + str + getType();
    }
}
