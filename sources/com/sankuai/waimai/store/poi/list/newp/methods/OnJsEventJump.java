package com.sankuai.waimai.store.poi.list.newp.methods;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class OnJsEventJump implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class JumpBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("append_params")
        public Map<String, String> append_params;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("type")
        public int type;
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2be84712341f366fae326d702ef5c95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2be84712341f366fae326d702ef5c95");
        } else if (map != null && map.size() != 0) {
            JumpBean jumpBean = new JumpBean();
            if (map.get("type") != null) {
                if (map.get("type").getClass().equals(Long.class)) {
                    jumpBean.type = ((Long) map.get("type")).intValue();
                } else if (map.get("type").getClass().equals(String.class)) {
                    try {
                        jumpBean.type = Integer.valueOf((String) map.get("type")).intValue();
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
            }
            if (map.get(NetLogConstants.Details.SCHEME) instanceof String) {
                jumpBean.scheme = (String) map.get(NetLogConstants.Details.SCHEME);
            }
            HashMap hashMap = new HashMap();
            if (map.get("append_params") instanceof Map) {
                for (Map.Entry entry : ((Map) map.get("append_params")).entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        if (entry.getValue() instanceof String) {
                            hashMap.put(entry.getKey(), (String) entry.getValue());
                        } else {
                            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                    }
                }
            }
            jumpBean.append_params = hashMap;
            a(jumpBean, aVar.a());
        }
    }

    private void a(JumpBean jumpBean, Context context) {
        Object[] objArr = {jumpBean, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f15da3bc3bbb0ee4ae5ae022968eba56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f15da3bc3bbb0ee4ae5ae022968eba56");
            return;
        }
        String str = jumpBean.scheme;
        if (TextUtils.isEmpty(str) || com.sankuai.waimai.store.util.b.a(context)) {
            return;
        }
        if (jumpBean.type == 0) {
            com.sankuai.waimai.store.router.d.a(context, str);
        } else {
            com.sankuai.waimai.store.router.d.a(context, str, jumpBean.append_params);
        }
    }
}
