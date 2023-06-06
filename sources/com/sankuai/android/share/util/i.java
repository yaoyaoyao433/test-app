package com.sankuai.android.share.util;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static a a(String str, Map<String, Object> map) {
        a aVar = new a(str, map);
        aVar.event_type = Constants.EventType.VIEW;
        aVar.nm = EventName.MGE;
        aVar.c = 0;
        return aVar;
    }

    public static a b(String str, Map<String, Object> map) {
        a aVar = new a(str, map);
        aVar.event_type = "click";
        aVar.nm = EventName.MGE;
        aVar.c = 0;
        return aVar;
    }

    public static a c(String str, Map<String, Object> map) {
        a aVar = new a(str, map);
        aVar.event_type = Constants.EventType.VIEW;
        aVar.nm = EventName.MODEL_VIEW;
        aVar.c = 1;
        return aVar;
    }

    public static a d(String str, Map<String, Object> map) {
        a aVar = new a(str, map);
        aVar.event_type = "click";
        aVar.nm = EventName.CLICK;
        aVar.c = 1;
        return aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends EventInfo {
        public static ChangeQuickRedirect a;
        public String b;
        public int c;

        public a(String str, Map<String, Object> map) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "220744e5b83834337928862a9de8b55b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "220744e5b83834337928862a9de8b55b");
                return;
            }
            this.c = 0;
            this.level = EventLevel.URGENT;
            this.val_bid = str;
            if (map != null) {
                this.val_lab = map;
            }
        }

        public final a a(String str) {
            this.b = null;
            this.val_cid = str;
            return this;
        }

        public final void a() {
            int i;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7961599e0c9520d20b541a4dd39267e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7961599e0c9520d20b541a4dd39267e6");
                return;
            }
            Channel channel = Statistics.getChannel();
            if (channel == null) {
                return;
            }
            if (this.c == 0) {
                channel.writeEvent(this.b, this);
            } else if (this.c == 1) {
                if (TextUtils.isEmpty(this.index)) {
                    if (this.nm == EventName.CLICK) {
                        channel.writeModelClick(this.b, this.val_bid, this.val_lab, this.val_cid);
                        return;
                    } else if (this.nm == EventName.MODEL_VIEW) {
                        channel.writeModelView(this.b, this.val_bid, this.val_lab, this.val_cid);
                        return;
                    } else if (this.nm == EventName.PAGE_VIEW) {
                        channel.writePageView(this.b, this.val_cid, this.val_lab);
                        return;
                    } else if (this.nm == EventName.PAGE_DISAPPEAR) {
                        channel.writePageDisappear(this.b, this.val_cid, this.val_lab);
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    i = Integer.parseInt(this.index);
                } catch (Exception unused) {
                    i = -1;
                }
                if (this.nm == EventName.CLICK) {
                    channel.writeModelClick(this.b, this.val_bid, this.val_lab, this.val_cid, i);
                } else if (this.nm == EventName.MODEL_VIEW) {
                    channel.writeModelView(this.b, this.val_bid, this.val_lab, this.val_cid, i);
                } else if (this.nm == EventName.PAGE_VIEW) {
                    channel.writePageView(this.b, this.val_cid, this.val_lab);
                } else if (this.nm == EventName.PAGE_DISAPPEAR) {
                    channel.writePageDisappear(this.b, this.val_cid, this.val_lab);
                }
            }
        }
    }
}
