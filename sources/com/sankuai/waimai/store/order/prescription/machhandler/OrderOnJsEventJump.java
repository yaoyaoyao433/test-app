package com.sankuai.waimai.store.order.prescription.machhandler;

import android.app.Activity;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.waimai.store.order.prescription.b;
import com.sankuai.waimai.store.router.d;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class OrderOnJsEventJump implements b {
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

    @Override // com.sankuai.waimai.store.order.prescription.b
    public final String a() {
        return "jump";
    }

    @Override // com.sankuai.waimai.store.order.prescription.b
    public final void a(com.sankuai.waimai.store.order.prescription.view.b bVar, Map<String, Object> map) {
        Object[] objArr = {bVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3bc2b59b7e0f60fe03c27d102ee3eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3bc2b59b7e0f60fe03c27d102ee3eb8");
        } else if (map != null && map.size() != 0) {
            JumpBean jumpBean = new JumpBean();
            if (map.get("type") != null) {
                if (map.get("type").getClass().equals(Long.class)) {
                    jumpBean.type = ((Long) map.get("type")).intValue();
                } else if (map.get("type").getClass().equals(String.class)) {
                    try {
                        jumpBean.type = Integer.valueOf((String) map.get("type")).intValue();
                    } catch (Exception e) {
                        a.a(e);
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
            Activity e2 = bVar.e();
            Object[] objArr2 = {jumpBean, e2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eada8de975be65b7ebf0f7811bf7e147", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eada8de975be65b7ebf0f7811bf7e147");
                return;
            }
            String str = jumpBean.scheme;
            if (TextUtils.isEmpty(str) || com.sankuai.waimai.store.util.b.a(e2)) {
                return;
            }
            if (jumpBean.type == 0) {
                d.a(e2, str);
            } else {
                d.a(e2, str, jumpBean.append_params);
            }
        }
    }
}
