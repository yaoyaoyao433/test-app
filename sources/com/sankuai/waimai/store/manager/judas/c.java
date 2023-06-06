package com.sankuai.waimai.store.manager.judas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.cache.ClickBidCache;
import com.sankuai.waimai.store.util.monitor.monitor.JudasMonitor;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.store.callback.a {
    public static ChangeQuickRedirect a;
    String b;
    private final EventInfo c;
    private final Map<String, Object> d;
    private final Map<String, Object> e;
    private boolean f;

    public c(@NonNull EventName eventName, @NonNull String str, @NonNull String str2) {
        Object[] objArr = {eventName, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0d987865a98740cc00d5d47d179276", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0d987865a98740cc00d5d47d179276");
            return;
        }
        this.c = new EventInfo();
        this.d = new HashMap();
        this.e = new HashMap();
        this.c.nm = eventName;
        this.c.val_bid = str2;
        this.c.val_cid = str;
        this.f = false;
    }

    @Override // com.sankuai.waimai.store.callback.a
    public final com.sankuai.waimai.store.callback.a a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c757dd10031592c2318fcd2e977bb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c757dd10031592c2318fcd2e977bb4");
        }
        if (map != null && !map.isEmpty()) {
            this.d.putAll(map);
        }
        return this;
    }

    @Override // com.sankuai.waimai.store.callback.a
    public final com.sankuai.waimai.store.callback.a a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.sankuai.waimai.store.callback.a
    public final com.sankuai.waimai.store.callback.a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367dc9862a289f10265f58f1e6574faf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367dc9862a289f10265f58f1e6574faf");
        }
        this.b = AppUtil.generatePageInfoKey(context);
        return this;
    }

    @Override // com.sankuai.waimai.store.callback.a
    public final com.sankuai.waimai.store.callback.a a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89444342e0c7873805063e17f6236dea", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89444342e0c7873805063e17f6236dea");
        }
        this.d.put(str, String.valueOf(obj));
        return this;
    }

    @Override // com.sankuai.waimai.store.callback.a
    public final com.sankuai.waimai.store.callback.a b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9f8ce11b533cd3aae6274e934566eeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9f8ce11b533cd3aae6274e934566eeb");
        }
        if (map != null) {
            this.d.putAll(map);
        }
        return this;
    }

    @Override // com.sankuai.waimai.store.callback.a
    public final com.sankuai.waimai.store.callback.a c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed30993f57e5d8eacefc76ab0d77d85e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed30993f57e5d8eacefc76ab0d77d85e");
        }
        if (map != null) {
            this.e.putAll(map);
        }
        return this;
    }

    @Override // com.sankuai.waimai.store.callback.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1913e4c0901e763f67c829059c74bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1913e4c0901e763f67c829059c74bf8");
        } else if (this.c.nm == null || TextUtils.isEmpty(this.c.val_bid)) {
        } else {
            this.d.put("x_env", com.sankuai.waimai.store.base.net.sg.c.a().b());
            this.c.val_lab = this.d;
            Channel channel = Statistics.getChannel("waimai");
            if (!this.e.isEmpty()) {
                channel.updateTag("waimai", this.e);
            }
            if (EventName.CLICK.equals(this.c.nm)) {
                channel.writeModelClick(this.b, this.c.val_bid, this.c.val_lab, this.c.val_cid, false);
            } else if (this.f && EventName.MODEL_VIEW.equals(this.c.nm)) {
                channel.writeModeViewMergable(this.b, this.c.val_bid, this.c.val_lab, this.c.val_cid);
            } else if (EventName.MODEL_VIEW.equals(this.c.nm)) {
                channel.writeModelView(this.b, this.c.val_bid, this.c.val_lab, this.c.val_cid);
            } else {
                channel.writeEvent(this.b, this.c);
            }
            a(this.c);
            com.sankuai.waimai.store.search.ui.result.datamarket.d.a().a(this.c, 1);
        }
    }

    public static void a(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "818411744a5c15732de7dee55555e10f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "818411744a5c15732de7dee55555e10f");
        } else if (eventInfo == null) {
        } else {
            EventName eventName = eventInfo.nm;
            String str = eventInfo.val_cid;
            String str2 = eventInfo.val_bid;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                String str3 = "nm:" + eventName + ",cid:" + str + ",bid = " + str2;
                com.sankuai.shangou.stone.util.log.a.d("SGJudasManager", eventName.toString() + " -> " + str3, new Object[0]);
                com.sankuai.waimai.store.util.monitor.c.a(JudasMonitor.CidEmptyException, "", str3);
            }
            JudasMonitorService b = b();
            if (b != null) {
                b.onCommit(eventInfo);
            }
            if (eventName == EventName.CLICK) {
                com.sankuai.waimai.store.util.monitor.cache.b.a(ClickBidCache.create(str2, str));
            }
        }
    }

    private static JudasMonitorService b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67475c2a687b0be6bee282d85b9c62b5", RobustBitConfig.DEFAULT_VALUE) ? (JudasMonitorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67475c2a687b0be6bee282d85b9c62b5") : (JudasMonitorService) com.sankuai.waimai.router.a.a(JudasMonitorService.class, JudasMonitorService.KEY);
    }
}
