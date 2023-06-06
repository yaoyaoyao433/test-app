package com.sankuai.waimai.business.im.method;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.view.WMIMReceiveCouponDialog;
import com.sankuai.waimai.business.im.group.model.i;
import com.sankuai.waimai.business.im.model.l;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.utils.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.message.bean.EventMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements c {
    public static ChangeQuickRedirect a;
    Context b;
    public a c;
    private com.sankuai.waimai.business.im.common.contract.a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull String str, @Nullable Map<String, Object> map);
    }

    public b(com.sankuai.waimai.business.im.common.contract.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca209115587885bc1efddf90684969ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca209115587885bc1efddf90684969ed");
            return;
        }
        this.d = aVar;
        this.b = context;
    }

    @Override // com.sankuai.waimai.business.im.method.c
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        l lVar;
        String string;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab5b84ac040d06b7776296d136b777cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab5b84ac040d06b7776296d136b777cf");
        } else if (str.equals("receive_coupon_dialog")) {
            int a2 = r.a(String.valueOf(map.get("status")), 0);
            try {
                lVar = (l) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map.get("couponData")), (Class<Object>) l.class);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                lVar = null;
            }
            if (a2 == 1 || a2 == 2) {
                if (a2 == 1) {
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.common.rxbus.b(lVar == null ? "" : lVar.j));
                    string = this.b.getString(R.string.wm_im_obtain_success);
                } else {
                    string = this.b.getString(R.string.wm_im_coupon_has_obtain);
                }
                WMIMReceiveCouponDialog wMIMReceiveCouponDialog = new WMIMReceiveCouponDialog(this.b);
                wMIMReceiveCouponDialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
                final String valueOf = String.valueOf(map.get(NetLogConstants.Details.SCHEME));
                wMIMReceiveCouponDialog.d = new WMIMReceiveCouponDialog.a() { // from class: com.sankuai.waimai.business.im.method.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.im.common.view.WMIMReceiveCouponDialog.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75475bc5482ea9ee304ec7e2e5874e27", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75475bc5482ea9ee304ec7e2e5874e27");
                        } else if (TextUtils.isEmpty(valueOf)) {
                        } else {
                            Uri parse = Uri.parse(valueOf);
                            String str2 = "";
                            if (com.sankuai.waimai.foundation.core.a.d()) {
                                str2 = parse.getQueryParameter("waimai");
                            } else if (com.sankuai.waimai.foundation.core.a.e()) {
                                str2 = parse.getQueryParameter(AbsApiFactory.PASSPORT_ONLINE_URL);
                            } else if (com.sankuai.waimai.foundation.core.a.f()) {
                                str2 = parse.getQueryParameter("dianping");
                            }
                            com.sankuai.waimai.foundation.router.a.a(b.this.b, str2);
                        }
                    }
                };
                wMIMReceiveCouponDialog.b = string;
                wMIMReceiveCouponDialog.c = lVar;
                wMIMReceiveCouponDialog.show();
            }
        } else if (str.equals("toast")) {
            ae.a(this.b, String.valueOf(map.get("content")));
        } else if (str.equals("insert_event_message")) {
            EventMessage b = com.sankuai.xm.imui.common.util.c.b(String.valueOf(map.get("message")));
            this.d.b(b);
            f.b(b, false);
        } else if (str.equals("router_event")) {
            com.sankuai.waimai.foundation.router.a.a(this.b, String.valueOf(map.get(NetLogConstants.Details.SCHEME)));
        } else if (str.equals("mach_back_event")) {
            this.d.o();
        } else if (str.equals("mach_banner_event")) {
            this.d.b(Boolean.parseBoolean(String.valueOf(map.get("visible"))));
        } else if (str.equals("mach_at_someone")) {
            this.d.b(Long.parseLong(String.valueOf(map.get("poiDxId"))));
        } else if (str.equals("click_coupon_event")) {
            if (map == null) {
                return;
            }
            i iVar = new i();
            iVar.a = String.valueOf(map.get("button_text"));
            iVar.b = String.valueOf(map.get("button_link"));
            iVar.c = String.valueOf(map.get("button_icon"));
            iVar.d = Integer.parseInt(String.valueOf(map.get("button_type")));
            iVar.e = String.valueOf(map.get("button_data"));
            this.d.a(iVar);
        } else if (!str.equals("judas_event")) {
            if (this.c != null) {
                this.c.a(str, map);
            }
        } else {
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85b3fd3c86f9a394246459cb55f1a66f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85b3fd3c86f9a394246459cb55f1a66f");
            } else if (map == null || !map.containsKey("bid")) {
            } else {
                String valueOf2 = String.valueOf(map.get("bid"));
                String valueOf3 = String.valueOf(map.get("cid"));
                if (TextUtils.isEmpty(valueOf3)) {
                    valueOf3 = d.a;
                }
                int a3 = r.a(String.valueOf(map.get("judasType")), -1);
                Map<String, Object> hashMap = new HashMap<>();
                if (map.containsKey("valLab") && (map.get("valLab") instanceof Map)) {
                    hashMap = (Map) map.get("valLab");
                }
                if (a3 == 1) {
                    JudasManualManager.b(valueOf2).a(valueOf3).a(hashMap).a();
                } else if (a3 == 2) {
                    JudasManualManager.a(valueOf2).a(valueOf3).a(hashMap).a();
                }
            }
        }
    }
}
