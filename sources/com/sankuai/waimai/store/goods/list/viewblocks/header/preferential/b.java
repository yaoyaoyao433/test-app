package com.sankuai.waimai.store.goods.list.viewblocks.header.preferential;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.coupon.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends com.sankuai.waimai.store.base.b implements d, c.a {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.a b;
    protected a c;
    public RecyclerView d;
    @NonNull
    SCBaseActivity e;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    private View g;
    private View h;
    private RelativeLayout i;
    private final a.b j;
    private String k;
    private final com.sankuai.waimai.store.goods.list.helper.b l;

    public void c() {
    }

    public static /* synthetic */ void a(b bVar, final Dialog dialog, final Poi.PoiCouponItem poiCouponItem, String str) {
        Object[] objArr = {dialog, poiCouponItem, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a9fa938e17bb24a1b5e742b9b5fd707b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a9fa938e17bb24a1b5e742b9b5fd707b");
            return;
        }
        String str2 = bVar.k;
        String valueOf = String.valueOf(poiCouponItem.mActivityId);
        long e = bVar.e();
        int i = poiCouponItem.mCouponScore;
        k<Poi.PoiCouponItem> kVar = new k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                Poi.PoiCouponItem poiCouponItem2 = (Poi.PoiCouponItem) obj;
                Object[] objArr2 = {poiCouponItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06da5a210c15acfc4021e1cb34b510a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06da5a210c15acfc4021e1cb34b510a5");
                    return;
                }
                super.a((AnonymousClass4) poiCouponItem2);
                com.sankuai.waimai.store.util.d.a(dialog);
                poiCouponItem.copyMainValueFrom(poiCouponItem2);
                b.this.c.notifyDataSetChanged();
                com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82674e204e720e6502d00a9ea787cf52", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82674e204e720e6502d00a9ea787cf52");
                    return;
                }
                super.a(bVar2);
                b.a(b.this, b.this.e, bVar2, dialog);
            }
        };
        Object[] objArr2 = {str2, str, valueOf, new Long(e), Integer.valueOf(i), kVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.utils.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "758bae4dfa1fb497f9b2b70554fec4d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "758bae4dfa1fb497f9b2b70554fec4d0");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str2).a(str, valueOf, i, e, kVar);
        }
    }

    public static /* synthetic */ void a(b bVar, Context context, com.sankuai.waimai.store.repository.net.b bVar2, Dialog dialog) {
        Object[] objArr = {context, bVar2, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "67364ae5d09f5d0cf1e120634555201f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "67364ae5d09f5d0cf1e120634555201f");
            return;
        }
        com.sankuai.waimai.store.util.d.a(dialog);
        if (bVar2 == null) {
            am.a((Activity) bVar.e, bVar.e.getString(R.string.wm_sc_common_net_error_info));
            return;
        }
        String message = bVar2.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = bVar.e.getString(R.string.wm_sc_common_net_error_info);
        }
        am.a((Activity) bVar.e, message);
    }

    public b(@NonNull SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, String str) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae82c1d7e696f342bb037d967f93587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae82c1d7e696f342bb037d967f93587");
            return;
        }
        this.e = sCBaseActivity;
        this.f = aVar;
        this.k = str;
        this.j = new com.sankuai.waimai.store.coupon.c(new com.sankuai.waimai.store.coupon.b(this.e));
        this.l = new com.sankuai.waimai.store.goods.list.helper.b(this.e, aVar.f());
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b314739bb990451e960e7a40a708722a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b314739bb990451e960e7a40a708722a");
            return;
        }
        FlowLayout flowLayout = (FlowLayout) findView(R.id.preferential_activity);
        flowLayout.setMaxLines(1);
        this.b = new com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.a(this);
        flowLayout.setAdapter(this.b);
        this.g = findView(R.id.preferential_layout);
        this.i = (RelativeLayout) findView(R.id.drug_store_coupon_info_list);
        this.h = findView(R.id.preferential_all);
        if (this.h instanceof ImageView) {
            ((ImageView) this.h).setImageDrawable(com.sankuai.waimai.store.view.a.a(getContext(), (int) R.dimen.wm_sc_common_dimen_3_half, (int) R.dimen.wm_sc_common_dimen_6, (int) R.color.wm_sc_color_222426, a.EnumC1338a.RIGHT));
        } else if (this.h instanceof TextView) {
            com.sankuai.waimai.store.view.a a2 = com.sankuai.waimai.store.view.a.a(getContext(), (int) R.dimen.wm_sc_common_dimen_3_half, (int) R.dimen.wm_sc_common_dimen_6, (int) R.color.wm_sc_color_222426, a.EnumC1338a.RIGHT);
            ((TextView) this.h).setCompoundDrawablePadding(h.a(this.mContext, 3.0f));
            ((TextView) this.h).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
        }
        this.d = (RecyclerView) findView(R.id.preferential_details);
        this.d.setNestedScrollingEnabled(false);
        this.d.setLayoutManager(new ExtendedLinearLayoutManager(getContext(), 0, false));
        this.c = new a(this);
        this.d.setAdapter(this.c);
    }

    public void a(List<Poi.LabelInfoListItem> list, Poi.PoiCouponEntity poiCouponEntity) {
        String str;
        String sb;
        Object[] objArr = {list, poiCouponEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af64740b452889c6cf3e6a3eba64b13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af64740b452889c6cf3e6a3eba64b13b");
            return;
        }
        this.b.a(list);
        if (poiCouponEntity != null) {
            ArrayList<Poi.PoiCouponItem> poiCouponItems = poiCouponEntity.getPoiCouponItems();
            if (poiCouponItems != null && poiCouponItems.size() > 0) {
                this.c.b_(poiCouponEntity.getPoiCouponItems());
            } else {
                this.c.b_(null);
                u.a((View) this.i, 8);
            }
            if (!this.c.g()) {
                for (int i = 0; i < this.c.getItemCount(); i++) {
                    Poi.PoiCouponItem h = this.c.h(i);
                    if (h != null && h.couponShowType == 4) {
                        this.l.a(h);
                    }
                }
            }
            String str2 = poiCouponEntity.couponDiscountDesc;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29aaca730f73f61bbf7eae25ed71fae8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29aaca730f73f61bbf7eae25ed71fae8");
            } else if (!t.a(str2) && (this.h instanceof TextView)) {
                ((TextView) this.h).setText(str2);
            }
        } else {
            this.c.b_(null);
        }
        if (this.c.g()) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
        if (!this.b.isEmpty()) {
            Object[] objArr3 = {list};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c837a178b6f7903b7913628bbe9fec0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c837a178b6f7903b7913628bbe9fec0a");
            } else {
                com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_waimai_sg_scl9r6pa_mv").a("poi_id", this.f.d());
                Object[] objArr4 = {list};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "08cc17848c8d4a348821755143c77dd7", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "08cc17848c8d4a348821755143c77dd7");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (Poi.LabelInfoListItem labelInfoListItem : list) {
                        if (labelInfoListItem != null) {
                            sb2.append(1);
                            sb2.append("#");
                            sb2.append(labelInfoListItem.type);
                            sb2.append("#");
                            sb2.append(labelInfoListItem.content);
                            sb2.append(CommonConstant.Symbol.COMMA);
                        }
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    sb = sb2.toString();
                }
                a2.a("poi_tag_text", sb).a();
            }
        }
        if (this.b.isEmpty() && this.c.g()) {
            hide();
            return;
        }
        show();
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "729822dffdc43212f7f80935444e9ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "729822dffdc43212f7f80935444e9ff3");
        } else {
            com.sankuai.waimai.store.callback.a a3 = com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_waimai_ejaec914_mv").a("poi_id", this.f.d());
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "64d5e1df88e7e9c492fc4d0e1e10dd2b", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "64d5e1df88e7e9c492fc4d0e1e10dd2b");
            } else {
                str = (this.f == null || this.f.b == null) ? "" : this.f.b.abExpInfo;
            }
            a3.a("stid", str).a();
        }
        this.g.setOnClickListener(new View$OnClickListenerC1196b(this.e, this.f));
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.d
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f63b1de79113ab3a23f5fdfae2eae73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f63b1de79113ab3a23f5fdfae2eae73");
        } else if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            final Poi.PoiCouponItem h = this.c.h(i);
            if (h != null) {
                Object[] objArr2 = {h};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91754cd863fab40d7702d78cd68a05ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91754cd863fab40d7702d78cd68a05ab");
                } else if (!h.isCouponHasGone()) {
                    long e = e();
                    if (h.couponShowType == 4) {
                        com.sankuai.waimai.store.coupons.a.a().a(this.e, this.f, 0);
                    } else {
                        if (h.mCouponStatus == 0) {
                            if (h.mCouponType == 20016) {
                                this.j.a(e, this.f.h(), this.k, null);
                            } else if (h.couponShowType == 9 || h.couponShowType == 12) {
                                final Dialog a2 = com.sankuai.waimai.store.util.d.a(this.e);
                                Object[] objArr3 = {a2, h};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ead8d314e1052ac2883232391d7b0e30", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ead8d314e1052ac2883232391d7b0e30");
                                } else {
                                    String str = this.k;
                                    k<Poi.MemberToken> kVar = new k<Poi.MemberToken>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b.3
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                        public final /* synthetic */ void a(Object obj) {
                                            Poi.MemberToken memberToken = (Poi.MemberToken) obj;
                                            Object[] objArr4 = {memberToken};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "943ecb7a0913d9bedcd8979d4dab9b0e", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "943ecb7a0913d9bedcd8979d4dab9b0e");
                                                return;
                                            }
                                            super.a((AnonymousClass3) memberToken);
                                            if (memberToken == null || TextUtils.isEmpty(memberToken.token)) {
                                                b.a(b.this, b.this.e, (com.sankuai.waimai.store.repository.net.b) null, a2);
                                            } else {
                                                b.a(b.this, a2, h, memberToken.token);
                                            }
                                        }

                                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                            Object[] objArr4 = {bVar};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e07ac79f5bc6d9e8c6108704e915bbe1", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e07ac79f5bc6d9e8c6108704e915bbe1");
                                                return;
                                            }
                                            super.a(bVar);
                                            b.a(b.this, b.this.e, bVar, a2);
                                        }
                                    };
                                    Object[] objArr4 = {str, kVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.utils.c.a;
                                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "709749d9e75dd137e3c6abb35b810a03", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "709749d9e75dd137e3c6abb35b810a03");
                                    } else {
                                        com.sankuai.waimai.store.base.net.sg.a.a((Object) str).b(kVar);
                                    }
                                }
                            } else {
                                final Dialog a3 = com.sankuai.waimai.store.util.d.a(this.e);
                                com.sankuai.waimai.store.goods.list.utils.c.a(this.k, e, this.f.h(), h, new k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final /* synthetic */ void a(Object obj) {
                                        Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) obj;
                                        Object[] objArr5 = {poiCouponItem};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a7f803094f78867a3798c344de0ea4fa", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a7f803094f78867a3798c344de0ea4fa");
                                            return;
                                        }
                                        super.a((AnonymousClass2) poiCouponItem);
                                        com.sankuai.waimai.store.util.d.a(a3);
                                        h.copyValueFrom(poiCouponItem);
                                        b.this.c.notifyDataSetChanged();
                                        com.sankuai.waimai.store.manager.coupon.c.a().a(h);
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                        Object[] objArr5 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "873e28dee1c2649539846ffcfe48398f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "873e28dee1c2649539846ffcfe48398f");
                                            return;
                                        }
                                        super.a(bVar);
                                        b.a(b.this, b.this.e, bVar, a3);
                                    }
                                });
                            }
                        } else if (h.mCouponStatus == 1) {
                            String str2 = h.mSchemeUrl;
                            if (!TextUtils.isEmpty(str2)) {
                                com.sankuai.waimai.store.router.d.a(this.e, str2);
                            }
                        }
                        c();
                    }
                }
                a(getContext(), i, h);
            }
        } else {
            com.sankuai.waimai.store.manager.user.a.a(view.getContext(), new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d3c32a20cb688a5cbfa3e005496d18f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d3c32a20cb688a5cbfa3e005496d18f3");
                    } else {
                        com.sankuai.waimai.store.manager.poi.a.a().a(b.this.f.d());
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.d
    public final void a(int i, Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {Integer.valueOf(i), poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14aab2d8caa1f04ded8e6a5b05f07ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14aab2d8caa1f04ded8e6a5b05f07ad");
            return;
        }
        a(getContext(), i, poiCouponItem);
        com.sankuai.waimai.store.coupons.a a2 = com.sankuai.waimai.store.coupons.a.a();
        Context context = this.mContext;
        com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = this.f;
        Object[] objArr2 = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.coupons.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "32d41343bbdb0a8a62bf718e1093b9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "32d41343bbdb0a8a62bf718e1093b9d7");
        } else {
            a2.a(context, aVar, 2);
        }
    }

    private void a(Context context, int i, Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {context, Integer.valueOf(i), poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd276f793c9ac5aef8292f0ee6b6f7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd276f793c9ac5aef8292f0ee6b6f7c");
        } else if (context == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(context, "b_waimai_2cydkaj6_mc").a("index", Integer.valueOf(i)).a("coupon_source", Integer.valueOf(poiCouponItem.mCouponType)).a("is_new", Integer.valueOf(poiCouponItem.mIsLimitNewUser ? 1 : 0)).a("poi_id", this.f.d()).a("coupon_id", Long.valueOf(poiCouponItem.mCouponId)).a("status", Integer.valueOf(poiCouponItem.mCouponStatus)).a("button_name", poiCouponItem.mCouponButtonText).a("stid", (this.f == null || this.f.b == null) ? "" : this.f.b.abExpInfo).a("coupon_show_type", Integer.valueOf(poiCouponItem.couponShowType)).a();
        }
    }

    private long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a905fcd737c111a2ea43a37c313cf1", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a905fcd737c111a2ea43a37c313cf1")).longValue() : this.f.f();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.d
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c4b4b2fcb1a13a1c33e1dc94d45256", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c4b4b2fcb1a13a1c33e1dc94d45256") : this.f.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60527c9926d873d5290bc18fc3166b5e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60527c9926d873d5290bc18fc3166b5e")).booleanValue() : this.c.getItemCount() == 1;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aeacd033d44f55f5faf104c42724133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aeacd033d44f55f5faf104c42724133");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed80e3f15c0e2cf4bea77aaa4153199c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed80e3f15c0e2cf4bea77aaa4153199c");
        } else if (poiCouponItem != null) {
            for (int i = 0; i < this.c.getItemCount(); i++) {
                Poi.PoiCouponItem h = this.c.h(i);
                if (h != null && h.mCouponId == poiCouponItem.mCouponId) {
                    h.copyValueFrom(poiCouponItem);
                }
            }
            this.c.notifyDataSetChanged();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class View$OnClickListenerC1196b implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        private Activity c;
        private com.sankuai.waimai.store.platform.domain.manager.poi.a d;

        private View$OnClickListenerC1196b(Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
            Object[] objArr = {b.this, activity, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55cb844d4c75a321b30f8c24d6e51221", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55cb844d4c75a321b30f8c24d6e51221");
                return;
            }
            this.c = activity;
            this.d = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ebff7145a21e76cc3f65603663d7bd6", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ebff7145a21e76cc3f65603663d7bd6");
                return;
            }
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c4a217779238c998091b4b7655cdac2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c4a217779238c998091b4b7655cdac2");
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(view.getContext(), "b_waimai_ejaec914_mc").a("poi_id", this.d.d()).a("stid", this.d.b == null ? "" : this.d.b.abExpInfo).a();
            }
            b.this.c();
            com.sankuai.waimai.store.coupons.a.a().a(this.c, this.d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends f<Poi.PoiCouponItem, d> {
        public static ChangeQuickRedirect a;

        private a(d dVar) {
            super(dVar);
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08cc267ba02874b436fd8ad7a5a0cc36", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08cc267ba02874b436fd8ad7a5a0cc36");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562ddfbc761df949480822338c92b739", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562ddfbc761df949480822338c92b739") : f().d();
        }
    }
}
