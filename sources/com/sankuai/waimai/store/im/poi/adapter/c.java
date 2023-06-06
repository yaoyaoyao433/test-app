package com.sankuai.waimai.store.im.poi.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.base.g;
import com.sankuai.waimai.store.im.poi.model.SGIMRelatedCouponListData;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.view.standard.FlashButton;
import com.sankuai.waimai.store.view.standard.FlashPrice;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g<a> {
    public static ChangeQuickRedirect c;
    public List<SGIMRelatedCouponListData.CouponInfo.CouponItem> d;
    String e;
    public SGIMRelatedCouponListData f;
    public com.sankuai.xm.imui.session.entity.b<GeneralMessage> g;
    String h;
    private Drawable i;
    private Drawable j;
    private Drawable k;

    public static /* synthetic */ void a(c cVar, final SGIMRelatedCouponListData.CouponInfo.CouponItem couponItem, final int i, final FlashButton flashButton) {
        Object[] objArr = {couponItem, Integer.valueOf(i), flashButton};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "ecfd75d31a923cd8c16010df0a3b0e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "ecfd75d31a923cd8c16010df0a3b0e91");
        } else if (couponItem.useStatus != 1) {
            if (!t.a(couponItem.jumUrl)) {
                com.sankuai.waimai.store.router.d.a(cVar.b, couponItem.jumUrl);
            } else {
                com.sankuai.waimai.store.im.base.net.b.a(cVar.e).a(NumberUtils.parseLong(couponItem.poiId, 0L), cVar.h, NumberUtils.parseLong(couponItem.couponId, 0L), NumberUtils.parseLong(couponItem.couponType, 0L), NumberUtils.parseLong(couponItem.activityId, 0L), new j<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.im.poi.adapter.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f1ce5a62cae3cc56f75e0bff19a5e60", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f1ce5a62cae3cc56f75e0bff19a5e60");
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(Poi.PoiCouponItem poiCouponItem) {
                        Poi.PoiCouponItem poiCouponItem2 = poiCouponItem;
                        Object[] objArr2 = {poiCouponItem2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bd964d7dd1c0d08a8d70e532766c1dc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bd964d7dd1c0d08a8d70e532766c1dc");
                            return;
                        }
                        c cVar2 = c.this;
                        String str = couponItem.poiId;
                        String str2 = c.this.h;
                        Object[] objArr3 = {str, str2, "用户已领券"};
                        ChangeQuickRedirect changeQuickRedirect3 = c.c;
                        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "adc8e85c4eab543c901568cba2f6b9c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "adc8e85c4eab543c901568cba2f6b9c6");
                        } else {
                            com.sankuai.waimai.store.im.base.net.b.a(cVar2.e).a(str, str2, "用户已领券");
                        }
                        flashButton.setText(poiCouponItem2.mCouponButtonText);
                        if (!TextUtils.isEmpty(poiCouponItem2.mSchemeUrl)) {
                            couponItem.useStatus = 2;
                            couponItem.jumUrl = poiCouponItem2.mSchemeUrl;
                        } else {
                            couponItem.useStatus = 1;
                        }
                        c.this.f.mCouponInfo.couponList.set(i, couponItem);
                        c cVar3 = c.this;
                        com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar = c.this.g;
                        SGIMRelatedCouponListData sGIMRelatedCouponListData = c.this.f;
                        Object[] objArr4 = {bVar, sGIMRelatedCouponListData};
                        ChangeQuickRedirect changeQuickRedirect4 = c.c;
                        if (PatchProxy.isSupport(objArr4, cVar3, changeQuickRedirect4, false, "18eb3b0213d91c94a044fe483221c4a1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar3, changeQuickRedirect4, false, "18eb3b0213d91c94a044fe483221c4a1");
                        } else if (bVar != null && sGIMRelatedCouponListData != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bVar.b.getData(), "utf-8"));
                                jSONObject.put("data", new JSONObject(i.a(sGIMRelatedCouponListData)));
                                bVar.b.setData(((String) Objects.requireNonNull(jSONObject.toString())).getBytes());
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                            }
                        }
                        c.this.notifyDataSetChanged();
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2678f667a5843102ecfb1173877f98c7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2678f667a5843102ecfb1173877f98c7");
                            return;
                        }
                        String message = bVar.getMessage();
                        if (t.a(message)) {
                            message = "领取失败";
                        }
                        am.a(c.this.b, message);
                    }
                });
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.s sVar, final int i) {
        String c2;
        String str;
        final a aVar = (a) sVar;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7954a71f83f4ce610cd3f693a183967b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7954a71f83f4ce610cd3f693a183967b");
            return;
        }
        final SGIMRelatedCouponListData.CouponInfo.CouponItem couponItem = (SGIMRelatedCouponListData.CouponInfo.CouponItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i);
        if (couponItem != null) {
            if (NumberUtils.parseInt(couponItem.restrictions, 0) > 0) {
                u.a(aVar.b);
                u.a(aVar.b, String.format(this.b.getString(R.string.wm_sg_im_user_related_coupon_des), couponItem.restrictions));
            } else {
                u.c(aVar.b);
            }
            aVar.c.setText(couponItem.couponName);
            aVar.a.setPriceTheme(0);
            aVar.a.setPrice(couponItem.couponAmount);
            aVar.a.setPriceSize(7);
            if (couponItem.canStack == 1) {
                u.a(aVar.d);
                u.a(aVar.d, (int) R.string.wm_sg_im_user_related_coupon_type);
            } else {
                u.c(aVar.d);
            }
            long parseLong = NumberUtils.parseLong(couponItem.validPeriod, 0L) * 1000;
            if (parseLong > 0) {
                u.a(aVar.e);
                TextView textView = aVar.e;
                Object[] objArr2 = {new Long(parseLong)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.util.b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6459fd45deeed0da4add1b7676e609f1", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6459fd45deeed0da4add1b7676e609f1");
                } else {
                    if (t.a(com.sankuai.waimai.platform.utils.time.b.c(parseLong))) {
                        str = "";
                    } else {
                        str = "至" + c2.replaceAll(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.DOT);
                    }
                }
                u.a(textView, str);
            } else {
                u.c(aVar.e);
            }
            if (couponItem.useStatus == 1) {
                aVar.f.setText(this.b.getString(R.string.wm_sc_shop_has_accept_coupon));
                aVar.f.setButtonType(0);
                aVar.f.a(this.i, R.color.white, R.dimen.wm_sc_common_dimen_10);
            } else if (couponItem.useStatus == 2) {
                aVar.f.setText(this.b.getString(R.string.wm_sc_shop_accept_use));
                aVar.f.setButtonType(2);
                aVar.f.a(this.j, R.color.red, R.dimen.wm_sc_common_dimen_10);
            } else {
                aVar.f.setText(this.b.getString(R.string.wm_sc_shop_accept_coupon));
                aVar.f.a(this.k, R.color.white, R.dimen.wm_sc_common_dimen_16);
            }
            aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7ae3fa1d553abdbfc99da9be470a9f6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7ae3fa1d553abdbfc99da9be470a9f6");
                        return;
                    }
                    if (c.this.a != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", couponItem.poiId);
                        hashMap.put("coupon_id", couponItem.couponId);
                        hashMap.put("coupon_view_id", t.a(couponItem.couponViewId) ? "-999" : couponItem.couponViewId);
                        c.this.a.a(hashMap);
                    }
                    c.a(c.this, couponItem, i, aVar.f);
                }
            });
            View view = aVar.itemView;
            Object[] objArr3 = {view, couponItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "26c2202e3ae4e98e36e48cb615f52143", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "26c2202e3ae4e98e36e48cb615f52143");
                return;
            }
            String str2 = couponItem.couponId + CommonConstant.Symbol.UNDERLINE + i;
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", couponItem.poiId);
            hashMap.put("coupon_id", couponItem.couponId);
            hashMap.put("coupon_view_id", t.a(couponItem.couponViewId) ? "-999" : couponItem.couponViewId);
            this.a.a(str2, i, hashMap, view);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672e2bcf384f71cb9d04b6f0d1c4c60f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672e2bcf384f71cb9d04b6f0d1c4c60f");
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_sg_im_related_coupon_list_item, viewGroup, false);
        this.i = new e.a().a(h.a(this.b, 6.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(this.b, R.color.wm_sc_common_cccccc), ContextCompat.getColor(this.b, R.color.wm_sc_common_cccccc)}).a();
        this.j = new e.a().a(h.a(this.b, 6.0f)).a(com.sankuai.waimai.store.util.b.b(this.b, R.color.red)).b(h.a(this.b, 0.5f)).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(this.b, R.color.white), ContextCompat.getColor(this.b, R.color.white)}).a();
        this.k = new e.a().a(h.a(this.b, 6.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(this.b, R.color.wm_sc_nox_search_color_FF720D), ContextCompat.getColor(this.b, R.color.wm_sc_nox_search_color_FF4060)}).a();
        return new a(inflate);
    }

    public c(@NonNull Context context, @NonNull com.sankuai.waimai.store.im.base.d dVar, String str) {
        super(context, dVar);
        Object[] objArr = {context, dVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91269c5503a82d44cedaca37adec3958", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91269c5503a82d44cedaca37adec3958");
            return;
        }
        this.d = new ArrayList();
        this.e = "SG_WM_CHAT";
        this.h = str;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6c58c72f533b0daf48c770bbd1fee8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6c58c72f533b0daf48c770bbd1fee8")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.d)) {
            return 0;
        }
        return this.d.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.s {
        public FlashPrice a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public FlashButton f;

        public a(View view) {
            super(view);
            this.a = (FlashPrice) view.findViewById(R.id.sg_im_related_coupon);
            this.b = (TextView) view.findViewById(R.id.sg_im_related_coupon_des);
            this.c = (TextView) view.findViewById(R.id.sg_im_related_coupon_title);
            this.d = (TextView) view.findViewById(R.id.sg_im_related_coupon_type);
            this.e = (TextView) view.findViewById(R.id.sg_im_related_coupon_date);
            this.f = (FlashButton) view.findViewById(R.id.sg_im_related_coupon_receive);
        }
    }
}
