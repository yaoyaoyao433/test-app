package com.sankuai.waimai.store.orderlist.helper;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.business.order.api.model.g;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.order.b;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
import com.sankuai.waimai.store.router.c;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    protected String b;
    protected Activity c;
    protected int d;
    protected boolean e;
    Handler f;
    public com.sankuai.waimai.store.orderlist.listener.b g;
    private CustomDialog h;

    public static /* synthetic */ void a(b bVar, int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "4fbbb8035d48c16342c7552e55639649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "4fbbb8035d48c16342c7552e55639649");
        } else if (i == 1) {
            if (TextUtils.isEmpty(str)) {
                am.a(bVar.c, (int) R.string.wm_sc_order_base_server_error_cancel_pay);
            } else {
                am.a(bVar.c, str);
            }
        } else if (i == 401) {
            if (TextUtils.isEmpty(str)) {
                am.a(bVar.c, (int) R.string.wm_sc_order_base_invalid_token_login_again);
            } else {
                am.a(bVar.c, str);
            }
        } else if (!TextUtils.isEmpty(str)) {
            am.a(bVar.c, str);
        } else {
            am.a(bVar.c, (int) R.string.takeout_loading_fail_try_afterwhile);
        }
    }

    public b(Activity activity, int i, Handler handler, String str, com.sankuai.waimai.store.orderlist.listener.b bVar) {
        Object[] objArr = {activity, Integer.valueOf(i), handler, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c62def349c572320bbb7ad47e4f749e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c62def349c572320bbb7ad47e4f749e");
            return;
        }
        this.d = i;
        this.c = activity;
        this.f = handler;
        this.b = str;
        this.g = bVar;
        this.e = activity.getResources().getBoolean(R.bool.wm_is_mt_flavor);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ac033532e00ff50de771f98f0a20fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ac033532e00ff50de771f98f0a20fb");
            return;
        }
        OrderListFragment.c = true;
        if (this.f != null) {
            this.f.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.orderlist.helper.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    OrderListFragment.c = false;
                }
            }, 1000L);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a138e1b36ed2c8d6707bb28a58227b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a138e1b36ed2c8d6707bb28a58227b52");
        } else {
            d.a(this.c, str);
        }
    }

    public final void a(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ae5704c13b635434de465ff92fef014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ae5704c13b635434de465ff92fef014");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("hash_id", order.getHashId());
        bundle.putInt("position", i);
        bundle.putInt("dingDanStatus", order.getStatus());
        bundle.putInt("payStatus", order.getPayStatus());
        bundle.putInt("commentStatus", order.getCommentStatus());
        bundle.putBoolean("hasBubble", order.isHasStatusBubble());
        bundle.putBoolean("is_sc_orderlist", true);
        bundle.putInt("ordertype", this.d + 1);
        d.b(this.c, c.l, bundle, 113);
    }

    public final void a(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a6bd467201343376288d9387467102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a6bd467201343376288d9387467102");
            return;
        }
        AddressItem addressItem = new AddressItem();
        addressItem.lat = order.getLatitude();
        addressItem.lng = order.getLongitude();
        com.sankuai.waimai.platform.domain.manager.location.a.b(this.c, addressItem);
        if (TextUtils.isEmpty(order.restaurantScheme) && order.isLegOrderType()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", order.getPoiId());
        bundle.putString("poiName", order.getPoiName());
        bundle.putString("from", "from order deatail");
        d.a(this.c, order.restaurantScheme, bundle);
    }

    public final void b(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7722a84cd6e8c687025246831fd8b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7722a84cd6e8c687025246831fd8b2");
        } else if (this.e) {
            if (order.getIsPoiOpen() == 0) {
                new CustomDialog.a(this.c).a(R.string.wm_sc_dialog_title_tips).b(R.string.wm_sc_order_base_close_poi_change_another).a(R.string.wm_sc_order_base_i_know_1, (DialogInterface.OnClickListener) null).b();
            } else if (order.getIsPoiOpen() != 0) {
                AddressItem addressItem = new AddressItem();
                addressItem.lat = order.getLatitude();
                addressItem.lng = order.getLongitude();
                com.sankuai.waimai.platform.domain.manager.location.a.b(this.c, addressItem);
                com.sankuai.waimai.store.manager.order.a.a(new b.a().a(this.c).a(String.valueOf(order.getOrderId())).a(order.getPoiId()).b);
            }
        } else {
            com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_ORDER_LIST_PREORDER;
            b.a a2 = new b.a().a(this.c).a(String.valueOf(order.getOrderId()));
            a2.b.c = "0";
            b.a a3 = a2.a(order.getPoiId());
            a3.b.e = order.getPoiName();
            com.sankuai.waimai.store.manager.order.a.a(a3.b);
        }
    }

    public final void c(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac9a8652be26ed5ba10da5e5112aaf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac9a8652be26ed5ba10da5e5112aaf0");
            return;
        }
        final Activity activity = this.c;
        final String str = this.b;
        final String valueOf = String.valueOf(order.getOrderId());
        byte b = order.businessType == 1 ? (byte) 1 : (byte) 0;
        Object[] objArr2 = {activity, str, valueOf, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "903b6d38045da63108b8574ad003dada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "903b6d38045da63108b8574ad003dada");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            new CustomDialog.a(activity).b(b != 0 ? R.string.wm_sc_order_make_sure_got_good : R.string.wm_sc_order_make_sure_good_arrival).a(R.string.confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.helper.b.6
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15a4e93ee16d1acd236cee7708eb2a15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15a4e93ee16d1acd236cee7708eb2a15");
                        return;
                    }
                    String str2 = valueOf;
                    final Activity activity2 = activity;
                    String str3 = str;
                    Object[] objArr4 = {str2, activity2, str3};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "6b4e553bad7cf3db7ae69ddf5b52b3fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "6b4e553bad7cf3db7ae69ddf5b52b3fd");
                        return;
                    }
                    final Dialog a2 = com.sankuai.waimai.store.util.d.a(activity2);
                    com.sankuai.waimai.store.base.net.wm.a.a(str3).a(str2, new j<com.sankuai.waimai.store.orderlist.model.a>() { // from class: com.sankuai.waimai.store.orderlist.helper.b.7
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final void a() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7de5045b0d7749e43678feea45179463", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7de5045b0d7749e43678feea45179463");
                            }
                        }

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final void b() {
                        }

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(com.sankuai.waimai.store.orderlist.model.a aVar) {
                            com.sankuai.waimai.store.orderlist.model.a aVar2 = aVar;
                            Object[] objArr5 = {aVar2};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e7dbfeefda9f413c00d73a4150db56ba", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e7dbfeefda9f413c00d73a4150db56ba");
                                return;
                            }
                            com.sankuai.waimai.store.util.d.a(a2);
                            am.a(activity2, (int) R.string.wm_sc_order_confirm_receive_success);
                            if (aVar2.a != null) {
                                CustomDialog.a aVar3 = new CustomDialog.a(activity2);
                                aVar3.d.e = aVar2.a.a;
                                aVar3.d.f = R.drawable.wm_sc_order_ic_coupon_poi;
                                aVar3.a(aVar2.a.b).b(aVar2.a.c).a(false).a(R.string.known, (DialogInterface.OnClickListener) null).b();
                            }
                            com.sankuai.waimai.business.order.api.submit.c.a().updateOrderStatus();
                        }

                        @Override // com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr5 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a51e2faf9d319182271b4851456a0454", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a51e2faf9d319182271b4851456a0454");
                                return;
                            }
                            com.sankuai.waimai.store.util.d.a(a2);
                            if (!TextUtils.isEmpty(bVar.getMessage())) {
                                am.a(activity2, bVar.getMessage());
                            } else {
                                am.a(activity2, (int) R.string.wm_sc_order_confirm_receive_failed);
                            }
                        }
                    });
                }
            }).b(R.string.cancel, (DialogInterface.OnClickListener) null).b();
        }
    }

    public final void d(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2990949ca084680a93c1b61672978fbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2990949ca084680a93c1b61672978fbe");
            return;
        }
        Activity activity = this.c;
        String str = this.b;
        String valueOf = String.valueOf(order.getOrderId());
        String valueOf2 = String.valueOf(order.getPoiId());
        Object[] objArr2 = {activity, str, valueOf, valueOf2, null};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.order.api.orderlist.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "81bf8afc910489ff16646d923c79bd51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "81bf8afc910489ff16646d923c79bd51");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            com.sankuai.waimai.business.order.api.orderlist.a.b(activity, str, valueOf, valueOf2, "", null, "1");
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0928f5a7b204f2d1c335484c8b05c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0928f5a7b204f2d1c335484c8b05c2e");
            return;
        }
        String string = this.c.getResources().getString(R.string.wm_sc_order_list_refund_status_mrn_uri, com.sankuai.waimai.store.orderlist.utils.a.a());
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(str)) {
            str = string + str.substring(str.indexOf("order_view_id%3D") + 16);
        }
        d.a(this.c, str);
    }

    public final void e(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefe044f38f3b64477786dc32bd4f9b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefe044f38f3b64477786dc32bd4f9b5");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poi_id", order.getPoiId());
        d.a(this.c, c.m, bundle);
    }

    public final void f(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62013b35928b2287014a84333d38ec85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62013b35928b2287014a84333d38ec85");
        } else if (order == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("order_view_id", String.valueOf(order.getOrderId()));
            bundle.putString("poiId", String.valueOf(order.getPoiId()));
            d.b(this.c, this.c.getResources().getString(R.string.wm_sc_order_by_friend_mrn_uri, com.sankuai.waimai.store.orderlist.utils.a.a()), bundle, 114);
        }
    }

    public final void b(Order order, int i) {
        Object[] objArr = {order, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb089fab3cfe4b52d87a5711a6b8b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb089fab3cfe4b52d87a5711a6b8b3f");
            return;
        }
        String valueOf = String.valueOf(order.getHashId());
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        final Dialog a2 = com.sankuai.waimai.store.util.d.a(this.c);
        com.sankuai.waimai.store.base.net.wm.a.a(this.b).a(valueOf, "1", 2, new k<g>() { // from class: com.sankuai.waimai.store.orderlist.helper.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                g gVar = (g) obj;
                Object[] objArr2 = {gVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34eaaa7d4bac16c5d414694746d72efa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34eaaa7d4bac16c5d414694746d72efa");
                    return;
                }
                com.sankuai.waimai.store.util.d.a(a2);
                if (f.a(b.this.c)) {
                    return;
                }
                am.a(b.this.c, gVar.a);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3b48d247a9fcadc39db4e3205077c1a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3b48d247a9fcadc39db4e3205077c1a");
                    return;
                }
                com.sankuai.waimai.store.util.d.a(a2);
                String str = bVar.b;
                if (!TextUtils.isEmpty(str)) {
                    am.a(b.this.c, str);
                } else {
                    am.a(b.this.c, b.this.c.getResources().getString(R.string.wm_sc_common_net_error_info));
                }
            }
        });
    }

    public final void a(final long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8baeacb4d074a2a68ba50ce0c984719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8baeacb4d074a2a68ba50ce0c984719");
        } else if (TextUtils.isEmpty(com.sankuai.waimai.platform.domain.manager.user.a.i().e())) {
            am.a(this.c, (int) R.string.wm_sc_order_base_login_before_pay);
            com.sankuai.waimai.platform.domain.manager.user.a.a((Context) this.c);
        } else {
            IPaymentManager iPaymentManager = (IPaymentManager) com.sankuai.waimai.router.a.a(IPaymentManager.class, IPaymentManager.KEY);
            if (iPaymentManager != null) {
                Activity activity = this.c;
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bd78d83e0371dae8f83340cdbefc41c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bd78d83e0371dae8f83340cdbefc41c5");
                } else if (activity instanceof BaseActivity) {
                    ((BaseActivity) activity).u();
                }
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.EventConstants.KEY_ORDER_ID, str);
                hashMap.put("payCode", "2");
                hashMap.put("selfPay", "0");
                hashMap.put("tag", this.b);
                hashMap.put("cid", "c_waimai_m5pcse9e");
                iPaymentManager.startOrderPay(this.c, hashMap, new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.d>>() { // from class: com.sankuai.waimai.store.orderlist.helper.b.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52901c1f195dd2a4cfba2077148cc519", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52901c1f195dd2a4cfba2077148cc519");
                        } else if (baseResponse != null) {
                            if (baseResponse.code == 0 && baseResponse.data != 0) {
                                String str2 = ((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).c;
                                String str3 = ((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).g;
                                String str4 = ((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).b;
                                if (b.this.g != null) {
                                    b.this.g.a(j, str2, str3, str4, ((com.sankuai.waimai.business.order.api.model.d) baseResponse.data).j);
                                    return;
                                }
                                return;
                            }
                            b.a(b.this, baseResponse.code, baseResponse.msg);
                        } else {
                            am.a(b.this.c, (int) R.string.takeout_loading_fail_try_afterwhile);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8b79fa3dc3122a66ef3ccfb7b0b5075", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8b79fa3dc3122a66ef3ccfb7b0b5075");
                        } else if (TextUtils.equals(th.getMessage(), IPaymentManager.NO_ACTION)) {
                        } else {
                            am.a(b.this.c, (int) R.string.takeout_loading_fail_try_afterwhile);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
                    public final void onCompleted() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f1749893a46d2b8b52c1d73184152a9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f1749893a46d2b8b52c1d73184152a9");
                            return;
                        }
                        Activity activity2 = b.this.c;
                        Object[] objArr4 = {activity2};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "7f8dc51db423b259e032822c4019220b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "7f8dc51db423b259e032822c4019220b");
                        } else if (activity2 instanceof BaseActivity) {
                            ((BaseActivity) activity2).v();
                        }
                    }
                });
            }
        }
    }

    public final void a(final com.sankuai.waimai.store.orderlist.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fb8d8450f18b413a3e74036bf21383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fb8d8450f18b413a3e74036bf21383");
            return;
        }
        if (this.h != null && this.h.isShowing()) {
            this.h.dismiss();
        }
        this.h = new CustomDialog.a(this.c).b(R.string.wm_sc_order_list_delete_order_check).a(R.string.wm_sc_order_base_delete, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.helper.b.5
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02a22813ece94bba7a1d6b9608d81927", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02a22813ece94bba7a1d6b9608d81927");
                } else if (b.this.f != null) {
                    b.this.f.obtainMessage(1000001, bVar).sendToTarget();
                }
            }
        }).b(R.string.wm_sc_common_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.helper.b.4
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6096c8d920e3e3ba2f582906041a5080", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6096c8d920e3e3ba2f582906041a5080");
                } else {
                    dialogInterface.dismiss();
                }
            }
        }).a(false).b();
    }
}
