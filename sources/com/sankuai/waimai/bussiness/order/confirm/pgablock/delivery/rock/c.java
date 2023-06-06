package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.DeliveryInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.a;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a {
    public static ChangeQuickRedirect p;
    public b q;
    protected com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c r;
    protected com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.a s;
    public boolean t;
    public boolean u;
    private long v;
    private boolean w;
    private boolean x;

    public c(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar, b bVar) {
        super(context, aVar, bVar);
        Object[] objArr = {context, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b5c293dc8512283af4291e7b9a0036", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b5c293dc8512283af4291e7b9a0036");
            return;
        }
        this.v = -1L;
        this.x = false;
        this.u = false;
        this.q = bVar;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "expected_arrival_time", 0);
        this.r = new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c(this.b, this.d.aH_(), this.d.aI_(), this.d.t.a());
        this.r.x = new c.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.a
            public final void a(AddressItem addressItem) {
                Object[] objArr2 = {addressItem};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3d3903d7561bee6b5c5a6f936928e93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3d3903d7561bee6b5c5a6f936928e93");
                } else if (addressItem != null) {
                    c.this.b(addressItem);
                } else {
                    c.this.c(false);
                    c.this.q.a(c.this.d.aL_(), true, false);
                }
            }
        };
        this.s = new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.a(this.b, this.d.t.a(), new a.InterfaceC0896a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.a.InterfaceC0896a
            public final void a(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11273f012cc7710a10296f251360a8a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11273f012cc7710a10296f251360a8a9");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("iconUrl", str);
                hashMap.put("category", Integer.valueOf(i));
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a("address_label_icon_event", hashMap);
            }
        });
    }

    public final void a(DeliveryInfo deliveryInfo) {
        Object[] objArr = {deliveryInfo};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cadc44340dabaac998acae4b6811082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cadc44340dabaac998acae4b6811082");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("delivery_tip_area", deliveryInfo.mOrderDeliveryTipArea);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("localState", this.o);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("suggest_address", deliveryInfo.addressItem);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c("expected_delivery_time", (deliveryInfo == null || deliveryInfo.mExpectedArrivalInfo == null) ? "" : deliveryInfo.mExpectedArrivalInfo.selectViewTime);
        this.e = deliveryInfo;
        this.k = deliveryInfo.business_type_list;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c cVar = this.r;
        AddressItem addressItem = this.e.addressItem;
        Object[] objArr2 = {addressItem};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "314557928fec6f04efd8f6b78c1abe72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "314557928fec6f04efd8f6b78c1abe72");
        } else {
            if (addressItem != null) {
                addressItem.setExtraDetail();
            }
            cVar.s = addressItem;
        }
        this.r.b(this.d.aH_());
        this.r.d = this.d.aI_();
        int i = deliveryInfo.addressType;
        if (this.u) {
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.b, this.f);
        } else if (i != 3) {
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.b, this.e.addressItem);
        }
        if (this.e.addressType == 3) {
            b(true);
        } else {
            b(false);
        }
        if (this.e.mExpectedArrivalInfo != null) {
            d(this.e.mExpectedArrivalInfo.dateTypeTip);
            a(this.e.mExpectedArrivalInfo.unixTime);
            a(this.e.mExpectedArrivalInfo.deliveryTime);
            c(this.e.mExpectedArrivalInfo.selectViewTime);
            b(this.e.mExpectedArrivalInfo.deliveryTimeTip);
        } else if (this.e.isPreOrder == 1) {
            d("送达时间");
            a(0);
            a("");
            c("未选择(必选)");
            b("");
        } else {
            d("送达时间");
            a(0);
            a("");
            c("");
            b("");
        }
        switch (this.e.addressType) {
            case 0:
                e(this.b.getString(R.string.wm_order_confirm_add_delivery_address));
                a(-1L);
                a((AddressItem) null);
                break;
            case 1:
                a(this.e.addressItem.id);
                a(this.e.addressItem);
                AddressItem addressItem2 = this.e.addressItem;
                Object[] objArr3 = {addressItem2};
                ChangeQuickRedirect changeQuickRedirect3 = p;
                if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f51ca98c36521d73f1e79461676e1a78", RobustBitConfig.DEFAULT_VALUE)) {
                    if (addressItem2.addrBrief != null) {
                        String str = addressItem2.addrBrief + StringUtil.SPACE + addressItem2.addrBuildingNum;
                        if (addressItem2.addressType == 1) {
                            str = this.b.getString(R.string.wm_order_confirm_pick_up_address, new Object[]{str});
                        }
                        e(str);
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f51ca98c36521d73f1e79461676e1a78");
                    break;
                }
                break;
            case 2:
                e(this.b.getString(R.string.wm_order_confirm_choose_delivery_address));
                a(-1L);
                a((AddressItem) null);
                break;
            case 3:
                e(this.b.getString(R.string.wm_order_confirm_choose_delivery_address));
                a((AddressItem) null);
                break;
        }
        if (this.n != this.e.isAssignDeliveryTime) {
            a(true);
        } else {
            a(false);
        }
        c(this.j);
        this.n = this.e.isAssignDeliveryTime;
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501bc93d2ef741058b4092ce3e4366e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501bc93d2ef741058b4092ce3e4366e1");
        } else if (this.d.aL_() != 1) {
            if (this.o != null) {
                this.o.put("isFirstLoadMtTab", Boolean.FALSE);
                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("localState", this.o);
            }
            if (this.q != null) {
                this.q.a(1, false, true);
            }
        }
    }

    private void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc024ee1f6cacc658fcc0764a5ac57ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc024ee1f6cacc658fcc0764a5ac57ed");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("addressString", str);
        b("addressString", str);
    }

    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe841fe00c6ba9ae5f8e486174d44d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe841fe00c6ba9ae5f8e486174d44d9")).booleanValue() : this.r != null && this.r.b();
    }

    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975f73a36c60ccff97fb67c62132c51a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975f73a36c60ccff97fb67c62132c51a");
        } else if (com.sankuai.waimai.platform.capacity.abtest.b.b(this.b)) {
            this.x = false;
            this.w = false;
        } else if (this.r != null) {
            this.r.w = false;
        }
    }

    public final int q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64593426d2df3f71c501e8880fd0e15c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64593426d2df3f71c501e8880fd0e15c")).intValue();
        }
        if (this.t) {
            return 0;
        }
        try {
            if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.b != null && com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.b.containsKey("need_recommend_pickup_cabinet")) {
                return Integer.parseInt(String.valueOf(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.b.get("need_recommend_pickup_cabinet")));
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.location.utils.b.a("MtDeliveryEventProcessor", e.getMessage(), new Object[0]);
        }
        return 0;
    }

    public final void a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0d0651b62be0e8aae45f597fb9cd00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0d0651b62be0e8aae45f597fb9cd00");
            return;
        }
        String valueOf = String.valueOf(map.get("action"));
        if (TextUtils.equals("clickAddressBubbleTipsAction", valueOf)) {
            b(this.e.addressItem);
        } else if (TextUtils.equals("clickCloseCabinetPopAction", valueOf)) {
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = p;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90a0ec4de2ded08acd23b0066a77a6f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90a0ec4de2ded08acd23b0066a77a6f6");
            } else if (map != null) {
                Map map2 = (Map) map.get("data");
                Map map3 = (Map) map.get("state");
                if (map2 != null) {
                    int parseInt = Integer.parseInt(String.valueOf(map2.get("need_recommend_pickup_cabinet")));
                    if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.b != null) {
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.b.put("need_recommend_pickup_cabinet", Integer.valueOf(parseInt));
                    }
                }
                if (map3 != null) {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) this.b, String.valueOf(map3.get("cabinetCloseCountKey")), Integer.parseInt(String.valueOf(map3.get("cabinetCloseCountValue"))));
                }
            }
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e35c4b8d180d5f28742b440de81b117f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e35c4b8d180d5f28742b440de81b117f");
        } else if (this.w) {
            this.r.a(i, i2, intent);
        } else if (i == 1002 && i2 == -1) {
            Bundle extras = intent.getExtras();
            HashMap hashMap = new HashMap();
            hashMap.put(OtherVerifyTypeConstants.REQUEST_CODE, Integer.valueOf(i));
            hashMap.put(Constant.KEY_RESULT_CODE, Integer.valueOf(i2));
            if (extras != null) {
                for (String str : extras.keySet()) {
                    hashMap.put(str, extras.get(str));
                }
            }
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b a = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a();
            Object[] objArr2 = {"activity_result_event", hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "a2b221cec24c8485ac39b89e2ed61543", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "a2b221cec24c8485ac39b89e2ed61543");
            } else if (a.b != null) {
                a.b.b("activity_result_event", hashMap);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        char c;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ab734648dba40405a022d800692627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ab734648dba40405a022d800692627");
            return;
        }
        switch (str.hashCode()) {
            case -1508022189:
                if (str.equals("show_time_dialog_event")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -714260709:
                if (str.equals("save_category_event")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -435489543:
                if (str.equals("update_is_from_address_event")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -146640267:
                if (str.equals("set_last_address_list")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 25122858:
                if (str.equals("update_address_info_event")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1472448525:
                if (str.equals("jump_to_edit_address_event")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1688293876:
                if (str.equals("sync_local_state_event")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1924040528:
                if (str.equals("show_address_dialog_event")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = p;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61da0cf573175b7a62b470c27766ff79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61da0cf573175b7a62b470c27766ff79");
                    return;
                } else if (map != null) {
                    try {
                        if (map.containsKey("addressId") && map.containsKey("from")) {
                            a(Long.parseLong(String.valueOf(map.get("addressId"))), Integer.parseInt(String.valueOf(map.get("from"))));
                            return;
                        }
                        return;
                    } catch (NumberFormatException e) {
                        com.sankuai.waimai.foundation.location.utils.b.a("MtDeliveryEventProcessor", e.getMessage(), new Object[0]);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                Object[] objArr3 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = p;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e831abe45d54f1b27e20e3c7e9ba70a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e831abe45d54f1b27e20e3c7e9ba70a1");
                    return;
                } else if (map != null) {
                    try {
                        this.s.a(Long.parseLong(String.valueOf(map.get("addressId"))), Integer.parseInt(String.valueOf(map.get("addressCategory"))), Integer.parseInt(String.valueOf(map.get("overrideAddressCategory"))));
                        return;
                    } catch (NumberFormatException e2) {
                        com.sankuai.waimai.foundation.location.utils.b.a("MtDeliveryEventProcessor", e2.getMessage(), new Object[0]);
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                a();
                return;
            case 3:
                Object[] objArr4 = {map};
                ChangeQuickRedirect changeQuickRedirect4 = p;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "761993ad4976883826decbf96dd19359", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "761993ad4976883826decbf96dd19359");
                    return;
                } else if (map != null) {
                    try {
                        Map<? extends String, ? extends Object> map2 = (Map) map.get("localState");
                        if (map2 != null) {
                            if (this.o == null) {
                                this.o = new HashMap();
                            }
                            this.o.putAll(map2);
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("localState", this.o);
                            if (map2.containsKey("agreeIsSelected")) {
                                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "self_delivery_agree_selected", map2.get("agreeIsSelected"));
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (JsonSyntaxException e3) {
                        com.sankuai.waimai.foundation.location.utils.b.a("MtDeliveryEventProcessor", e3.getMessage(), new Object[0]);
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                this.w = true;
                Activity activity = this.b;
                Object[] objArr5 = {activity, map};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "2b9fc4451ec6ad53598b5cb0956d8fe4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "2b9fc4451ec6ad53598b5cb0956d8fe4");
                    return;
                } else if (map != null) {
                    String a = a.a(activity, com.sankuai.waimai.bussiness.order.base.utils.a.a(Long.parseLong(String.valueOf(map.get("poiId"))), i.b(String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR))), com.sankuai.waimai.bussiness.order.base.utils.a.b, null));
                    if (Boolean.parseBoolean(String.valueOf(map.get("isAddCabinet")))) {
                        AddressItem addressItem = (AddressItem) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson((Map) map.get("addressItem")), (Class<Object>) AddressItem.class);
                        addressItem.addrBrief = "";
                        addressItem.addrBuildingNum = "";
                        com.sankuai.waimai.bussiness.order.base.a.a(activity, AddressScene.CABINET_SCENE, addressItem, a);
                        return;
                    }
                    com.sankuai.waimai.bussiness.order.base.a.a(activity, AddressScene.DEFAULT_SCENE, (AddressItem) null, a);
                    return;
                } else {
                    return;
                }
            case 5:
                Object[] objArr6 = {map};
                ChangeQuickRedirect changeQuickRedirect6 = p;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fc7a490bcbe180182a07de101f5f0078", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fc7a490bcbe180182a07de101f5f0078");
                    return;
                } else if (map != null) {
                    try {
                        this.x = Boolean.parseBoolean(String.valueOf(map.get("fromAddress")));
                        return;
                    } catch (Exception e4) {
                        com.sankuai.waimai.foundation.location.utils.b.a("MtDeliveryEventProcessor", e4.getMessage(), new Object[0]);
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                Object[] objArr7 = {map};
                ChangeQuickRedirect changeQuickRedirect7 = p;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8ea95a90c60385ca3f1960df9d08debf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8ea95a90c60385ca3f1960df9d08debf");
                    return;
                } else if (map != null) {
                    try {
                        int parseInt = Integer.parseInt(String.valueOf(map.get("type")));
                        if (parseInt != 1) {
                            if (parseInt == 2) {
                                com.sankuai.waimai.platform.domain.manager.location.a.b(this.b);
                                return;
                            }
                            return;
                        }
                        String json = com.sankuai.waimai.mach.utils.b.a().toJson(map.get("selectedAddressItem"));
                        if (TextUtils.isEmpty(json)) {
                            return;
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.b(this.b, (AddressItem) com.sankuai.waimai.mach.utils.b.a().fromJson(json, (Class<Object>) AddressItem.class));
                        return;
                    } catch (Exception e5) {
                        com.sankuai.waimai.foundation.location.utils.b.a("MtDeliveryEventProcessor", e5.getMessage(), new Object[0]);
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                Object[] objArr8 = {map};
                ChangeQuickRedirect changeQuickRedirect8 = p;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "b2838e504ff78b77a3890ccb3fedae47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "b2838e504ff78b77a3890ccb3fedae47");
                    return;
                } else if (map != null) {
                    try {
                        String valueOf = String.valueOf(map.get("user_addresses"));
                        if (TextUtils.isEmpty(valueOf)) {
                            return;
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.a((List) com.sankuai.waimai.mach.utils.b.a().fromJson(valueOf, new TypeToken<List<AddressItem>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.c.3
                        }.getType()));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public final void b(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4c7d9cdc21f4154163974829deb7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4c7d9cdc21f4154163974829deb7da");
        } else if (addressItem == null || addressItem.addrBrief == null) {
        } else {
            b(false);
            this.t = true;
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.b, addressItem);
            a(addressItem.id);
            a(addressItem);
            PhoneInfo phoneInfo = new PhoneInfo();
            phoneInfo.phone = com.sankuai.waimai.platform.domain.manager.location.a.b(addressItem.phone);
            phoneInfo.code = com.sankuai.waimai.platform.domain.manager.location.a.a(addressItem.phone);
            phoneInfo.valid_digit = Integer.MAX_VALUE;
            a(phoneInfo);
            c(false);
            this.q.a(this.d.aL_(), true, false);
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f21e0b88e5d251a64f590cb315a72d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f21e0b88e5d251a64f590cb315a72d4");
        } else {
            b("dateTypeTip", str);
        }
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4113281e268c82fe5830058a5256029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4113281e268c82fe5830058a5256029");
            return;
        }
        String valueOf = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("choose_address_schema") != null ? String.valueOf(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("choose_address_schema")) : null;
        if (!TextUtils.isEmpty(valueOf)) {
            com.sankuai.waimai.foundation.router.a.a(this.c, valueOf);
            return;
        }
        switch (i) {
            case 0:
                this.r.a(j);
                break;
            case 1:
            case 2:
                this.r.a(this.v);
                break;
        }
        if (this.e != null) {
            this.r.g = this.e.addressType != 1 ? 1 : 0;
            this.r.t = this.e.previewOrderCallbackInfo;
        }
        this.r.a();
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f71fa12f1817629bfd631cc2870b21b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f71fa12f1817629bfd631cc2870b21b");
        } else {
            this.v = j;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef8a006260d70b6e881ff677977e68e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef8a006260d70b6e881ff677977e68e1");
            return;
        }
        g();
        a(0);
    }

    public final boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6abf1337688c1f5635423b1452d3184d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6abf1337688c1f5635423b1452d3184d")).booleanValue() : com.sankuai.waimai.platform.capacity.abtest.b.b(this.b) ? this.x || this.w : this.r != null && this.r.w;
    }

    public final boolean s() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "254df7c8dceaa2c12cdbbfb9170e2eda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "254df7c8dceaa2c12cdbbfb9170e2eda")).booleanValue();
        }
        if (this.e.isAssignDeliveryTime != 1 || com.sankuai.waimai.platform.model.c.a().b() == 1) {
            if (k() || l()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = p;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f10cb7826c931fc322bb3ca1ebdbca5c", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f10cb7826c931fc322bb3ca1ebdbca5c")).booleanValue();
                } else {
                    if (this.e != null && this.e.stageShippingInfo != null) {
                        com.sankuai.waimai.bussiness.order.confirm.model.e eVar = this.e.stageShippingInfo.d;
                        if (eVar == null || eVar.f != 1) {
                            List<com.sankuai.waimai.bussiness.order.confirm.model.e> list = this.e.stageShippingInfo.c;
                            if (list != null && list.size() != 0) {
                                for (com.sankuai.waimai.bussiness.order.confirm.model.e eVar2 : list) {
                                    if (eVar2 == null || eVar2.f != 1) {
                                    }
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                    z = true;
                }
                if (z) {
                    z2 = true;
                    if (((this.e == null && this.e.isAssignDeliveryTime == 1) || !m()) && !z2) {
                        return true;
                    }
                    a();
                    return false;
                }
            }
            z2 = false;
            if (this.e == null && this.e.isAssignDeliveryTime == 1) {
            }
            return true;
        }
        return true;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.a
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217756d8a7987b392a4f98f3fc8b9006", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217756d8a7987b392a4f98f3fc8b9006")).booleanValue() : a("isDeliveryTimeTypeChange", false);
    }

    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb5722599bdaccfe1bb664786e5a752c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb5722599bdaccfe1bb664786e5a752c");
        } else if (this.r != null) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c cVar = this.r;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "1cc0714a5f05e933eaa32cc6b26e8ad9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "1cc0714a5f05e933eaa32cc6b26e8ad9");
            } else if (!cVar.v || cVar.o == null || cVar.m == null) {
            } else {
                cVar.m.b(cVar.o);
                cVar.m.notifyDataSetChanged();
                cVar.o = null;
                cVar.v = false;
            }
        }
    }
}
