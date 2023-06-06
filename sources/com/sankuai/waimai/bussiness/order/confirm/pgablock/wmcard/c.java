package com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard;

import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.bussiness.order.confirm.model.b;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.l;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.bussiness.order.confirm.model.b b;
    Context c;
    com.sankuai.waimai.bussiness.order.confirm.a d;
    private boolean e;
    private b.a f;

    public c(com.sankuai.waimai.bussiness.order.confirm.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2697a4c92d7dd9b732ed1d344cac9b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2697a4c92d7dd9b732ed1d344cac9b3");
            return;
        }
        this.d = aVar;
        this.c = context;
    }

    public final void a(Map<String, Object> map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366b49d4e5b7974d83233f67831df727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366b49d4e5b7974d83233f67831df727");
            return;
        }
        a(com.sankuai.waimai.mach.utils.b.a().toJson(map), z);
        a(this.b);
        if ((d.c.containsKey("hint_next_refresh") ? ((Boolean) d.c.get("hint_next_refresh")).booleanValue() : false) && this.e) {
            d.a("hint_next_refresh", Boolean.FALSE);
            l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d44550dc94c4b19f228139b07af0922", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d44550dc94c4b19f228139b07af0922");
                    } else {
                        c.this.d.aV.a();
                    }
                }
            }, 100, "show_coupon");
        }
        a();
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab458c48959f15a17f087d91fd44accf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab458c48959f15a17f087d91fd44accf");
            return;
        }
        String str2 = z ? "magic_coupon_tied" : "member_tied";
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("biz_client_data_map") == null || jSONObject.optJSONObject("biz_client_data_map").optJSONObject(str2) == null) {
                return;
            }
            this.b = com.sankuai.waimai.bussiness.order.confirm.model.b.a(jSONObject.optJSONObject("biz_client_data_map").optJSONObject(str2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void a(com.sankuai.waimai.bussiness.order.confirm.model.b bVar) {
        if (bVar != null) {
            this.e = bVar.h;
        } else {
            this.e = false;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "255999ee88fd8aa914fa8cfb156aa01c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "255999ee88fd8aa914fa8cfb156aa01c");
        } else if (this.b == null) {
            this.f = null;
        } else {
            boolean booleanValue = d.c.containsKey("member_sale_click") ? ((Boolean) d.c.get("member_sale_click")).booleanValue() : false;
            if (this.b != null && this.b.j != null) {
                b.a aVar = this.b.j;
                if (booleanValue) {
                    d.a("member_sale_click", Boolean.FALSE);
                    this.f = aVar;
                    b();
                }
            } else if (this.b == null || TextUtils.isEmpty(this.b.e)) {
                this.f = null;
            } else if (booleanValue) {
                d.a("member_sale_click", Boolean.FALSE);
                this.f = null;
                ae.a(this.c, this.b.e);
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388312bf88de274a5169f86e118098cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388312bf88de274a5169f86e118098cb");
        } else if (this.b != null && this.b.j != null) {
            String str = this.b.j.b;
            String str2 = this.b.j.c;
            if (TextUtils.isEmpty(str2)) {
                str2 = this.c.getString(R.string.wm_order_confirm_wmcard_member_alert_title);
                if (this.b.k == 13) {
                    str2 = this.c.getString(R.string.wm_order_confirm_wmcard_coupon_alert_title);
                }
            }
            String string = this.c.getString(R.string.wm_order_confirm_wmcard_member_alert_cancel);
            String string2 = this.c.getString(R.string.wm_order_confirm_wmcard_member_alert_confirm);
            final String str3 = "JUMP_SELECT_USER_COUPON";
            ArrayList<b.a.C0893a> arrayList = this.b.j.d;
            int i = 1;
            if (arrayList != null && arrayList.size() == 2) {
                b.a.C0893a c0893a = null;
                b.a.C0893a c0893a2 = null;
                for (int i2 = 0; i2 < 2; i2++) {
                    b.a.C0893a c0893a3 = arrayList.get(i2);
                    if (c0893a3.b == 0) {
                        c0893a = c0893a3;
                    } else if (c0893a3.b == 1) {
                        c0893a2 = c0893a3;
                    }
                }
                if (c0893a == null || c0893a2 == null) {
                    return;
                }
                if (!TextUtils.isEmpty(c0893a.c)) {
                    string = c0893a.c;
                }
                if (!TextUtils.isEmpty(c0893a2.c)) {
                    string2 = c0893a2.c;
                }
                str3 = c0893a2.d;
            }
            JudasManualManager.a b = JudasManualManager.b("b_waimai_bspqqukj_mv");
            if (this.b.k == 31) {
                i = 2;
            } else if (this.b.k == 13) {
                i = 3;
            }
            b.a("td_sales_type", i).a("c_ykhs39e").a(this.c).a();
            new RooAlertDialog.a(new ContextThemeWrapper(this.c, 2131558962)).a(str).b(str2).a(string2, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.c.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74eae274b3747d4a8dcb384ce425442d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74eae274b3747d4a8dcb384ce425442d");
                        return;
                    }
                    if (str3 != null && str3.equals("JUMP_SELECT_USER_COUPON")) {
                        c.this.d.aW.a((com.meituan.android.cube.pga.common.b<String>) "");
                    }
                    dialogInterface.dismiss();
                    JudasManualManager.a("b_waimai_9yp3l245_mc").a("td_sales_type", c.this.b.k != 31 ? c.this.b.k == 13 ? 3 : 1 : 2).a("c_ykhs39e").a(c.this.c).a();
                }
            }).b(string, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard.c.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a69bb9685ca198c765d62f68f2bde4c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a69bb9685ca198c765d62f68f2bde4c8");
                        return;
                    }
                    dialogInterface.dismiss();
                    JudasManualManager.a("b_waimai_2j6zds1o_mc").a("td_sales_type", c.this.b.k != 31 ? c.this.b.k == 13 ? 3 : 1 : 2).a("c_ykhs39e").a(c.this.c).a();
                }
            }).b();
        }
    }
}
