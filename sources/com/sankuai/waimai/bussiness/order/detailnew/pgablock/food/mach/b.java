package com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.business.order.api.detail.model.b;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.GroupChatEntrance;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.manager.d;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static Map<String, Object> b = new HashMap();
    public static boolean c = false;
    public static int d = 0;
    public static int e = 0;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b f;
    public GroupChatEntrance g;
    public e h;
    public long i;
    public int j;
    private Context k;
    private com.sankuai.waimai.business.order.api.detail.block.a l;

    public b(Context context, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0961221f43e3b1e3fd999379fac70d6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0961221f43e3b1e3fd999379fac70d6b");
            return;
        }
        this.j = -1;
        this.k = context;
        this.l = aVar;
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        char c2;
        String str2;
        ArrayList arrayList;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c25640ff216f6460bbbee423bfd5f0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c25640ff216f6460bbbee423bfd5f0b");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -530971608) {
            if (hashCode == 1520273584 && str.equals("jump_im_event")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("call_phone_event")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d916954ac0d756687dda4fd30784d8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d916954ac0d756687dda4fd30784d8e");
                    return;
                }
                String valueOf = String.valueOf(map.get(Constants.EventConstants.KEY_ORDER_ID));
                String valueOf2 = String.valueOf(map.get("poiId"));
                String valueOf3 = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
                if (aa.a(valueOf3)) {
                    valueOf3 = "";
                }
                String str3 = valueOf3;
                int a2 = map.containsKey("unReadCount") ? r.a(String.valueOf(map.get("unReadCount")), 0) : 0;
                int a3 = map.containsKey("type") ? r.a(String.valueOf(map.get("type")), -1) : -1;
                this.j = a3;
                if (a3 != -1) {
                    if (a3 == 2) {
                        com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) this.k, r.a(valueOf, 0L), r.a(valueOf2, 0L), str3, 10, c(), false, a2 > 0, 2, this.l);
                        return;
                    } else if (a3 != 1) {
                        if (a3 == 0) {
                            com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) this.k, 3, r.a(valueOf, 0L), r.a(valueOf2, 0L), str3, 0L, 10, c(), false, this.h, this.f);
                            return;
                        }
                        return;
                    } else {
                        String valueOf4 = String.valueOf(map.get("riderDXID"));
                        String valueOf5 = String.valueOf(map.get("riderAppID"));
                        RiderInfo.b bVar = new RiderInfo.b();
                        bVar.e = r.a(valueOf4, 0L);
                        bVar.d = r.a(valueOf5, 0);
                        com.sankuai.waimai.bussiness.order.detailnew.im.a.a((Activity) this.k, r.a(valueOf, 0L), bVar, c());
                        return;
                    }
                }
                return;
            case 1:
                if (map != null) {
                    Object[] objArr3 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4499b98e718b299a3542ff1e420e022", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4499b98e718b299a3542ff1e420e022");
                        return;
                    }
                    String valueOf6 = String.valueOf(map.get(Constants.EventConstants.KEY_ORDER_ID));
                    boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("use_privacy")));
                    boolean e2 = this.f != null ? this.f.e() : false;
                    String valueOf7 = String.valueOf(map.get("user_phone"));
                    boolean parseBoolean2 = Boolean.parseBoolean(String.valueOf(map.get("on_dialog")));
                    int a4 = map.containsKey("type") ? r.a(String.valueOf(map.get("type")), -1) : -1;
                    if (a4 == 0) {
                        if (parseBoolean) {
                            i.a(this.k, valueOf6, valueOf7, 1, this.f != null ? this.f.w : null);
                            return;
                        }
                        String[] strArr = this.f != null ? this.f.u : null;
                        if (!parseBoolean2) {
                            i.b((Activity) this.k, strArr);
                            return;
                        } else {
                            i.a((Activity) this.k, strArr);
                            return;
                        }
                    } else if (a4 != 1) {
                        if (a4 == 3) {
                            String valueOf8 = map.containsKey("delivery_carrier_phone") ? String.valueOf(map.get("delivery_carrier_phone")) : "";
                            if (TextUtils.isEmpty(valueOf8)) {
                                return;
                            }
                            i.b(this.k, valueOf8);
                            return;
                        }
                        return;
                    } else {
                        if (map.containsKey("phoneItems") && (arrayList = (ArrayList) map.get("phoneItems")) != null && arrayList.size() > 0) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                HashMap hashMap = (HashMap) it.next();
                                if (hashMap.containsKey("phone")) {
                                    str2 = String.valueOf(hashMap.get("phone"));
                                    i.a(this.k, valueOf6, parseBoolean, e2, str2, valueOf7);
                                    return;
                                }
                            }
                        }
                        str2 = "";
                        i.a(this.k, valueOf6, parseBoolean, e2, str2, valueOf7);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6d2de4d939f91b0d3e1dbf172b1f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6d2de4d939f91b0d3e1dbf172b1f5a");
        }
        if (this.k instanceof BaseActivity) {
            return ((BaseActivity) this.k).w();
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5022676129f18c128e23000ac3be2b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5022676129f18c128e23000ac3be2b2");
        } else if (this.f == null || this.f.k == null || this.f.k.i == null) {
            d = 0;
            a(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY);
        } else {
            Iterator<RiderInfo.b> it = this.f.k.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RiderInfo.b next = it.next();
                if (next != null && next.a == i.c) {
                    if (next.e > 0) {
                        com.sankuai.waimai.bussiness.order.detailnew.im.a.a(next.e, (short) next.d, "im-peer", new d.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.imbase.manager.d.a
                            public final void a(int i) {
                                Object[] objArr2 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65ce47f5387ec5a338e954b966c4a7b2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65ce47f5387ec5a338e954b966c4a7b2");
                                    return;
                                }
                                if (i > 0) {
                                    b.d = 2;
                                } else {
                                    b.d = 0;
                                }
                                b.this.a(i, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY);
                            }
                        });
                        return;
                    }
                }
            }
            d = 0;
            a(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2333ad646b9a2b1170179476c412f80a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2333ad646b9a2b1170179476c412f80a");
        } else if (this.f == null || this.f.j == null || this.f.j.h == null) {
            e = 0;
            a(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING);
        } else {
            Iterator<b.a> it = this.f.j.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b.a next = it.next();
                if (next != null && next.a == i.c) {
                    if (next.e != null && next.e.b > 0) {
                        com.sankuai.waimai.bussiness.order.detailnew.im.a.a(next.e.b, (short) next.e.c, "pub-service", new d.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.imbase.manager.d.a
                            public final void a(int i) {
                                Object[] objArr2 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8123e6fe3e2ae55fed07f32b446cd6c8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8123e6fe3e2ae55fed07f32b446cd6c8");
                                    return;
                                }
                                if (i > 0) {
                                    b.e = 2;
                                } else {
                                    b.e = 0;
                                }
                                b.this.a(i, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING);
                            }
                        });
                        return;
                    }
                }
            }
            d = 0;
            a(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3b09057eb924c7bcbf88150bd62593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3b09057eb924c7bcbf88150bd62593");
            return;
        }
        if (i2 == 2024) {
            b.put("poi", Integer.valueOf(i));
        } else if (i2 != 2026) {
            switch (i2) {
                case 2052:
                    b.put("group", Integer.valueOf(i));
                    break;
                case 2053:
                    b.put("doctor", Integer.valueOf(i));
                    break;
            }
        } else {
            b.put("rider", Integer.valueOf(i));
        }
        if (b.size() == 4) {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f49e0f9e3af47a65335b099ccc3fdf68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f49e0f9e3af47a65335b099ccc3fdf68");
                    } else {
                        f.a().a("im_notification_response_event", b.b);
                    }
                }
            }, 100L);
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c881a06e49d8c19ef09800ec85c13b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c881a06e49d8c19ef09800ec85c13b80");
            return;
        }
        if (i2 == 2024) {
            b.put("poi", 0);
        } else if (i2 != 2026) {
            switch (i2) {
                case 2052:
                    b.put("group", 0);
                    break;
                case 2053:
                    b.put("doctor", 0);
                    break;
            }
        } else {
            b.put("rider", 0);
        }
        f.a().a("im_notification_response_event", b);
    }
}
