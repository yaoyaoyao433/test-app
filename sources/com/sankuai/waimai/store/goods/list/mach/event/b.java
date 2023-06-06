package com.sankuai.waimai.store.goods.list.mach.event;

import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;
    public BaseActivity b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;

    public b(BaseActivity baseActivity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {baseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07e9957eb31676f9634700861de240e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07e9957eb31676f9634700861de240e");
            return;
        }
        this.b = baseActivity;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.mach.event.c
    public final List a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a970c7a3ddba267325e4e0cffb736e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a970c7a3ddba267325e4e0cffb736e") : Arrays.asList("jump", "foods_detail_click_foods_item");
    }

    @Override // com.sankuai.waimai.store.goods.list.mach.event.c
    public final void a(String str, final Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dfb73b883ee70a15caee123361e9c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dfb73b883ee70a15caee123361e9c2e");
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1293350888) {
            if (hashCode == 3273774 && str.equals("jump")) {
                c = 0;
            }
        } else if (str.equals("foods_detail_click_foods_item")) {
            c = 1;
        }
        switch (c) {
            case 0:
                if (map == null || map.isEmpty()) {
                    return;
                }
                OnJsEventJump.JumpBean jumpBean = new OnJsEventJump.JumpBean();
                if (map.get("type") != null) {
                    jumpBean.type = r.a(String.valueOf(map.get("type")), 0);
                }
                if (map.get(NetLogConstants.Details.SCHEME) != null) {
                    jumpBean.scheme = String.valueOf(map.get(NetLogConstants.Details.SCHEME));
                }
                HashMap hashMap = new HashMap();
                if (map.get("append_params") != null && (map.get("append_params") instanceof Map)) {
                    for (Map.Entry entry : ((Map) map.get("append_params")).entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null && entry.getValue() != null) {
                            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                    }
                }
                jumpBean.append_params = hashMap;
                BaseActivity baseActivity = this.b;
                Object[] objArr2 = {jumpBean, baseActivity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ad059d52a75e93703fa33de2ad3a6c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ad059d52a75e93703fa33de2ad3a6c7");
                    return;
                }
                String str2 = jumpBean.scheme;
                if (TextUtils.isEmpty(str2) || com.sankuai.waimai.store.util.b.a(baseActivity)) {
                    return;
                }
                if (jumpBean.type == 0) {
                    d.a(baseActivity, str2);
                    return;
                } else {
                    d.a(baseActivity, str2, jumpBean.append_params);
                    return;
                }
            case 1:
                if (this.b == null || map == null || map.get("spu") == null || this.c == null) {
                    return;
                }
                al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.list.mach.event.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.al.b
                    public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                        GoodsSpu goodsSpu2 = goodsSpu;
                        Object[] objArr3 = {goodsSpu2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fe83612e18c8d654498747ab3b0b17ab", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fe83612e18c8d654498747ab3b0b17ab");
                        } else if (goodsSpu2 == null || b.this.b == null) {
                        } else {
                            g.a(b.this.b, goodsSpu2, b.this.c.b);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.sankuai.waimai.store.util.al.b
                    /* renamed from: b */
                    public GoodsSpu a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "708ec8b2045ee804faeba3b427c6ab52", RobustBitConfig.DEFAULT_VALUE)) {
                            return (GoodsSpu) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "708ec8b2045ee804faeba3b427c6ab52");
                        }
                        String a2 = i.a(map.get("spu"));
                        GoodsSpu goodsSpu = new GoodsSpu();
                        try {
                            goodsSpu.parseJson(new JSONObject(a2));
                        } catch (JSONException e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                        return goodsSpu;
                    }
                }, t.a(this.b.w()) ? getClass().getSimpleName() : this.b.w());
                return;
            default:
                super.a(str, map);
                return;
        }
    }
}
