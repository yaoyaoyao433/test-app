package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.bussiness.order.base.widget.picker.SingleWheelPicker;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.DeliveryInfo;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a {
    public static ChangeQuickRedirect p;
    PhoneCodeOption q;

    public f(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar, b bVar) {
        super(context, aVar, bVar);
        Object[] objArr = {context, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e59e57da33a4257e616ee46e9f8c7f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e59e57da33a4257e616ee46e9f8c7f1");
        }
    }

    public final void a(DeliveryInfo deliveryInfo) {
        Object[] objArr = {deliveryInfo};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f1458f767fd7c954706fa12d20a13d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f1458f767fd7c954706fa12d20a13d");
            return;
        }
        this.e = deliveryInfo;
        this.k = deliveryInfo.business_type_list;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c("expected_delivery_time", (deliveryInfo == null || deliveryInfo.mExpectedArrivalInfo == null) ? "" : deliveryInfo.mExpectedArrivalInfo.selectViewTime);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("delivery_tip_area", deliveryInfo.mOrderDeliveryTipArea);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("suggest_address", deliveryInfo.addressItem);
        if (this.e.mExpectedArrivalInfo != null) {
            a(this.e.mExpectedArrivalInfo.unixTime);
            a(this.e.mExpectedArrivalInfo.deliveryTime);
            c(this.e.mExpectedArrivalInfo.selectViewTime);
            b(this.e.mExpectedArrivalInfo.deliveryTimeTip);
        } else if (this.e.isPreOrder == 1) {
            a(0);
            a("");
            c("未选择(必选)");
            b("");
        } else {
            a(0);
            a("");
            c("");
            b("");
        }
        a(this.e.addressItem);
        c(this.j);
        if (this.n != this.e.isAssignDeliveryTime) {
            a(true);
        } else {
            a(false);
        }
        this.n = deliveryInfo.isAssignDeliveryTime;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7610d97ddf969ee82250aae9cfc1ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7610d97ddf969ee82250aae9cfc1ca");
        } else {
            a(0);
        }
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad9c14ac2eefe623531ded38b094499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad9c14ac2eefe623531ded38b094499");
            return;
        }
        char c = 65535;
        if (str.hashCode() == 610037757 && str.equals("show_self_delivery_map_event")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        Activity activity = this.b;
        Object[] objArr2 = {activity, map};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "693c262319b358e113c7b7430f6420dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "693c262319b358e113c7b7430f6420dd");
        } else if (map != null) {
            try {
                if (map.containsKey("poiName") && map.containsKey("addressItem") && map.containsKey("poiIcon")) {
                    String valueOf = String.valueOf(map.get("poiName"));
                    String valueOf2 = String.valueOf(map.get("poiIcon"));
                    AddressItem addressItem = (AddressItem) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson((Map) map.get("addressItem")), (Class<Object>) AddressItem.class);
                    Object[] objArr3 = {activity, valueOf, addressItem, valueOf2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0f6a4e6c327439116bd2a4bff05555c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0f6a4e6c327439116bd2a4bff05555c6");
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putDouble("poiLatitude", addressItem.lat / 1000000.0d);
                    bundle.putDouble("poiLongitude", addressItem.lng / 1000000.0d);
                    bundle.putString("poiName", valueOf);
                    bundle.putString(GearsLocator.ADDRESS, addressItem.addrBrief);
                    bundle.putString("poiIconUrl", valueOf2);
                    bundle.putString("distance", addressItem.distance);
                    com.sankuai.waimai.foundation.router.a.a(activity, activity.getResources().getString(R.string.wm_order_selfdelivery_mrn_entry), bundle);
                }
            } catch (NumberFormatException e) {
                com.sankuai.waimai.foundation.location.utils.b.a("SelfDeliveryEventProcessor", e.getMessage(), new Object[0]);
            }
        }
    }

    public final void a(@Nullable Map<String, Object> map) {
        int i;
        final List list;
        int i2;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3a6bd2d0c1cd6147a0e67c602ccdc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3a6bd2d0c1cd6147a0e67c602ccdc6");
        } else if (map == null) {
        } else {
            String valueOf = String.valueOf(map.get("action"));
            if (TextUtils.equals("inputPhoneAction", valueOf)) {
                Map map2 = (Map) map.get("data");
                if (map2 != null) {
                    String valueOf2 = String.valueOf(map2.get("recipient_phone"));
                    try {
                        i2 = Integer.parseInt(String.valueOf(map2.get("valid_digit")));
                    } catch (Exception unused) {
                        i2 = 0;
                    }
                    PhoneInfo phoneInfo = new PhoneInfo();
                    phoneInfo.phone = com.sankuai.waimai.platform.domain.manager.location.a.b(valueOf2);
                    phoneInfo.code = com.sankuai.waimai.platform.domain.manager.location.a.a(valueOf2);
                    phoneInfo.valid_digit = i2;
                    a(phoneInfo);
                    if (Integer.parseInt(String.valueOf(map.get("isUpdate"))) == 1) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = p;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1b1138735ac0bc90489ffa0a2f4ad45", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1b1138735ac0bc90489ffa0a2f4ad45");
                        } else {
                            this.d.a(0);
                        }
                    }
                }
            } else if (TextUtils.equals("clickPhoneCodeOptionsAction", valueOf)) {
                Object[] objArr3 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = p;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "106dd8185e438740110cf4f05fda85e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "106dd8185e438740110cf4f05fda85e2");
                    return;
                }
                try {
                    Map map3 = (Map) map.get("data");
                    i = Integer.parseInt(String.valueOf(map3.get("phone_code_index")));
                    try {
                        list = (List) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(map3.get("phone_code_options")), new TypeToken<List<PhoneCodeOption>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.f.1
                        }.getType());
                    } catch (Exception unused2) {
                        list = null;
                        if (i != -1) {
                            return;
                        }
                        return;
                    }
                } catch (Exception unused3) {
                    i = -1;
                }
                if (i != -1 || list == null || list.size() == 0 || list == null || list.size() <= 0) {
                    return;
                }
                SingleWheelPicker a = SingleWheelPicker.a(new ArrayList<com.sankuai.waimai.platform.ui.a>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.f.2
                    {
                        addAll(list);
                    }
                });
                a.e = i;
                Object[] objArr4 = {this, list};
                ChangeQuickRedirect changeQuickRedirect4 = g.a;
                a.d = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b7457a343a297057dc8b954d90cff684", RobustBitConfig.DEFAULT_VALUE) ? (SingleWheelPicker.b) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b7457a343a297057dc8b954d90cff684") : new g(this, list);
                a.a(((FragmentActivity) this.b).getSupportFragmentManager());
            }
        }
    }

    public final void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d0fcd86cde0fe0a4372a4aac1931b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d0fcd86cde0fe0a4372a4aac1931b0");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.j = false;
            c(false);
            new RooAlertDialog.a(new ContextThemeWrapper(this.b, 2131558627)).a(str).b(str2).a(R.string.wm_order_self_delivery_confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.f.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30598152200ad18e2b7dec88e49f90b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30598152200ad18e2b7dec88e49f90b2");
                        return;
                    }
                    dialogInterface.dismiss();
                    f.this.d.aa.a();
                }
            }).b(R.string.wm_order_self_delivery_think_again, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.f.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "627cbbdb837d1be130a10c7617fbb6e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "627cbbdb837d1be130a10c7617fbb6e6");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).b();
        }
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717c339579db12229b662a504441a465", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717c339579db12229b662a504441a465")).booleanValue();
        }
        if ((this.e != null && this.e.isAssignDeliveryTime == 1) && m() && com.sankuai.waimai.platform.model.c.a().b() == 1) {
            a();
            return false;
        }
        return true;
    }
}
