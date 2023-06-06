package com.sankuai.waimai.store.drug.coupon;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.drug.coupon.a;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberCouponStatusResponse;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberResponse;
import com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MemberCouponEntry implements a.InterfaceC1146a {
    public static ChangeQuickRedirect a;
    private Context b;
    private CustomDialog c;

    public static /* synthetic */ void a(MemberCouponEntry memberCouponEntry, final long j, final String str, final DrugMemberCouponStatusResponse drugMemberCouponStatusResponse, List list, String str2) {
        Object[] objArr = {new Long(j), str, drugMemberCouponStatusResponse, list, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, memberCouponEntry, changeQuickRedirect, false, "a76e4c14f8bf3fc7221c8634a46d3ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, memberCouponEntry, changeQuickRedirect, false, "a76e4c14f8bf3fc7221c8634a46d3ea8");
        } else {
            com.sankuai.waimai.store.drug.base.net.b.a(str2).a(j, str, drugMemberCouponStatusResponse.cardInfo.brandId, drugMemberCouponStatusResponse.mobile, i.a().toJson(list), new j<DrugMemberResponse>() { // from class: com.sankuai.waimai.store.drug.coupon.MemberCouponEntry.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(DrugMemberResponse drugMemberResponse) {
                    DrugMemberResponse drugMemberResponse2 = drugMemberResponse;
                    Object[] objArr2 = {drugMemberResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85dfe9db8b864f63cc0a0e15c58fdb38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85dfe9db8b864f63cc0a0e15c58fdb38");
                        return;
                    }
                    Activity c = com.sankuai.waimai.store.manager.appinfo.a.c();
                    if (com.sankuai.waimai.store.util.b.a(c)) {
                        return;
                    }
                    try {
                        FragmentManager supportFragmentManager = ((FragmentActivity) c).getSupportFragmentManager();
                        SGMRNDialogFragment.a aVar = new SGMRNDialogFragment.a();
                        aVar.d = "flashbuy-membercard-complete-dialog";
                        aVar.b = "supermarket";
                        aVar.c = "flashbuy-drug-member";
                        aVar.a("position", "center").a("popUpInfo", i.a(drugMemberResponse2)).a("poiId", String.valueOf(j)).a(FoodDetailNetWorkPreLoader.URI_POI_STR, str).a("is_transparent_root", "0").a("is_opacity_load", "1").a("brandId", String.valueOf(drugMemberCouponStatusResponse.cardInfo.brandId)).a().show(supportFragmentManager, c.getClass().getSimpleName());
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "382aef2bef08fc2bfbd853d71c86a297", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "382aef2bef08fc2bfbd853d71c86a297");
                    } else {
                        MemberCouponEntry.this.a();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d877ebf8bdaa1baa226da6d29d1e0683", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d877ebf8bdaa1baa226da6d29d1e0683");
                    } else {
                        am.a(MemberCouponEntry.this.b, bVar.getMessage());
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf87a5d8be8a06b6aead03977c943f7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf87a5d8be8a06b6aead03977c943f7c");
                    } else {
                        MemberCouponEntry.this.b();
                    }
                }
            });
        }
    }

    public MemberCouponEntry(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e41e9012177e90cd1f5de31af6b6762", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e41e9012177e90cd1f5de31af6b6762");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.store.drug.coupon.a.InterfaceC1146a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b078f65c7a889b37c545434575c4b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b078f65c7a889b37c545434575c4b33");
        } else if (this.b instanceof SCBaseActivity) {
            ((SCBaseActivity) this.b).u();
        }
    }

    @Override // com.sankuai.waimai.store.drug.coupon.a.InterfaceC1146a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eb66af5206fb4c1bd8d8b7ca11d36c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eb66af5206fb4c1bd8d8b7ca11d36c2");
        } else if (this.b instanceof SCBaseActivity) {
            ((SCBaseActivity) this.b).v();
        }
    }

    @Override // com.sankuai.waimai.store.drug.coupon.a.InterfaceC1146a
    public final void a(String str, Dialog dialog) {
        Object[] objArr = {str, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674aae49190c2a70fdca440cdbb481ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674aae49190c2a70fdca440cdbb481ac");
        } else if (dialog == null || dialog.getWindow() == null || !dialog.isShowing()) {
            if (com.sankuai.waimai.store.util.b.a(this.b) || !(this.b instanceof SCBaseActivity)) {
                return;
            }
            am.a((Activity) ((SCBaseActivity) this.b), str);
        } else {
            View decorView = dialog.getWindow().getDecorView();
            if (decorView == null) {
                return;
            }
            am.a(decorView, str);
        }
    }

    @Subscribe
    public void onBindMemberCardSuccess(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a534da4d6a70c8e49f55019c469f206c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a534da4d6a70c8e49f55019c469f206c");
        } else if (com.sankuai.waimai.store.util.b.a(this.b)) {
        } else {
            com.sankuai.waimai.store.util.d.a(this.c);
        }
    }

    public static /* synthetic */ void b(MemberCouponEntry memberCouponEntry, DialogInterface dialogInterface) {
        Object[] objArr = {memberCouponEntry, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e63388027a05c7c7a0bcebebed9429ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e63388027a05c7c7a0bcebebed9429ed");
        } else {
            com.meituan.android.bus.a.a().b(memberCouponEntry);
        }
    }

    public static /* synthetic */ void a(MemberCouponEntry memberCouponEntry, DialogInterface dialogInterface) {
        Object[] objArr = {memberCouponEntry, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "444fc154e2cb8b9a11d1ef77e8834f67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "444fc154e2cb8b9a11d1ef77e8834f67");
        } else {
            com.meituan.android.bus.a.a().a(memberCouponEntry);
        }
    }

    @Override // com.sankuai.waimai.store.drug.coupon.a.InterfaceC1146a
    public final void a(final long j, final String str, final DrugMemberCouponStatusResponse drugMemberCouponStatusResponse, final List<com.sankuai.waimai.store.drug.coupon.model.a> list, final int i, final String str2) {
        Object[] objArr = {new Long(j), str, drugMemberCouponStatusResponse, list, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a76c777d1756e6b8f6580c1cca5e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a76c777d1756e6b8f6580c1cca5e90");
            return;
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_drug_dialog_member_coupon_entry, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.tv_member_coupon_entry_title)).setText(drugMemberCouponStatusResponse.title);
        ((TextView) inflate.findViewById(R.id.tv_member_coupon_entry_content)).setText(drugMemberCouponStatusResponse.subTitle);
        b.C0608b a2 = m.a(drugMemberCouponStatusResponse.cardInfo.logoUrl);
        a2.i = R.drawable.wm_sc_member_icon_default;
        a2.j = R.drawable.wm_sc_member_icon_default;
        a2.a((ImageView) inflate.findViewById(R.id.iv_member_coupon_entry_poi_icon));
        ((TextView) inflate.findViewById(R.id.tv_member_coupon_entry_poi_name)).setText(drugMemberCouponStatusResponse.cardInfo.brandName);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.cb_protocol);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_protocol);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a86a9268631164335155014d5ce4f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a86a9268631164335155014d5ce4f94");
        } else {
            this.c = new CustomDialog.a(this.b).a();
            this.c.setOnDismissListener(b.a(this));
            this.c.setOnShowListener(c.a(this));
        }
        if (drugMemberCouponStatusResponse.newMedicineTenant) {
            inflate.findViewById(R.id.ll_edit_area).setVisibility(0);
            Resources resources = this.b.getResources();
            Object[] objArr3 = new Object[1];
            objArr3[0] = TextUtils.isEmpty(drugMemberCouponStatusResponse.mobile) ? "*" : drugMemberCouponStatusResponse.mobile;
            SpannableString spannableString = new SpannableString(resources.getString(R.string.wm_drug_member_protocol, objArr3));
            spannableString.setSpan(new ClickableSpan() { // from class: com.sankuai.waimai.store.drug.coupon.MemberCouponEntry.1
                public static ChangeQuickRedirect a;

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(@NonNull TextPaint textPaint) {
                    Object[] objArr4 = {textPaint};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "df9d45787daa9921c64ce3235f8e4779", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "df9d45787daa9921c64ce3235f8e4779");
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint.setColor(MemberCouponEntry.this.b.getResources().getColor(R.color.wm_sg_member_btn_gradinet_end_color));
                    textPaint.setUnderlineText(false);
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(@NonNull View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "194d79bb33200b4657e3af4d1812a024", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "194d79bb33200b4657e3af4d1812a024");
                        return;
                    }
                    if (!com.sankuai.waimai.store.util.b.a(MemberCouponEntry.this.b)) {
                        com.sankuai.waimai.store.router.d.a(MemberCouponEntry.this.b, drugMemberCouponStatusResponse.protocolUrl);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(MemberCouponEntry.this.b, "b_waimai_m8l9j64r_mc").a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(j, str)).a("status", Integer.valueOf(i)).a("brand_id", Integer.valueOf(drugMemberCouponStatusResponse.cardInfo.brandId)).a();
                }
            }, 7, 13, 33);
            spannableString.setSpan(new ClickableSpan() { // from class: com.sankuai.waimai.store.drug.coupon.MemberCouponEntry.2
                public static ChangeQuickRedirect a;

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(@NonNull TextPaint textPaint) {
                    Object[] objArr4 = {textPaint};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "1ae3d06259091c3bbd28b3de1740aee9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "1ae3d06259091c3bbd28b3de1740aee9");
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(MemberCouponEntry.this.b.getResources().getColor(R.color.wm_sg_member_btn_gradinet_end_color));
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(@NonNull View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "f3625fcfc309cc8e3cfcbeb926e53c94", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "f3625fcfc309cc8e3cfcbeb926e53c94");
                        return;
                    }
                    if (!com.sankuai.waimai.store.util.b.a(MemberCouponEntry.this.b) && !TextUtils.isEmpty(drugMemberCouponStatusResponse.scheme)) {
                        String str3 = drugMemberCouponStatusResponse.scheme;
                        String json = i.a().toJson(list);
                        HashMap hashMap = new HashMap();
                        if (!TextUtils.isEmpty(json)) {
                            hashMap.put("coupon_list_info", json);
                        }
                        hashMap.put("is_edit_phone_number", "true");
                        com.sankuai.waimai.store.router.d.a(MemberCouponEntry.this.b, com.sankuai.waimai.store.router.a.a(str3, com.sankuai.waimai.store.router.a.a(hashMap)));
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(MemberCouponEntry.this.b, "b_waimai_fqel4ceg_mc").a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(j, str)).a("status", Integer.valueOf(i)).a("brand_id", Integer.valueOf(drugMemberCouponStatusResponse.cardInfo.brandId)).a();
                }
            }, spannableString.length() - 3, spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            inflate.findViewById(R.id.ll_edit_area).setVisibility(8);
        }
        inflate.findViewById(R.id.tv_member_coupon_entry_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.coupon.MemberCouponEntry.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "2927a0849346ed0de49a3a482282db96", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "2927a0849346ed0de49a3a482282db96");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(MemberCouponEntry.this.b, "b_5aqgv4qr").a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(j, str)).a();
                com.sankuai.waimai.store.util.d.a(MemberCouponEntry.this.c);
            }
        });
        inflate.findViewById(R.id.tv_member_coupon_entry_to_bind).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.coupon.MemberCouponEntry.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "37cb51509b355cd80076e0006948ed1a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "37cb51509b355cd80076e0006948ed1a");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(MemberCouponEntry.this.b, "b_waimai_ewq4mc1h_mc").a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(j, str)).a("status", Integer.valueOf(i)).a("brand_id", Integer.valueOf(drugMemberCouponStatusResponse.cardInfo.brandId)).a();
                if (!drugMemberCouponStatusResponse.newMedicineTenant) {
                    if (!com.sankuai.waimai.store.util.b.a(MemberCouponEntry.this.b)) {
                        com.sankuai.waimai.store.router.d.a(MemberCouponEntry.this.b, drugMemberCouponStatusResponse.scheme);
                    }
                } else if (checkBox != null && !checkBox.isChecked()) {
                    MemberCouponEntry.this.a(MemberCouponEntry.this.b.getResources().getString(R.string.wm_drug_protocol_tip), MemberCouponEntry.this.c);
                    return;
                } else {
                    MemberCouponEntry.a(MemberCouponEntry.this, j, str, drugMemberCouponStatusResponse, list, str2);
                }
                com.sankuai.waimai.store.util.d.a(MemberCouponEntry.this.c);
            }
        });
        this.c.setContentView(inflate);
        com.sankuai.waimai.store.util.d.b(this.c);
        com.sankuai.waimai.store.manager.judas.b.b(this.b, "b_waimai_k3em4jv1_mv").a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(j, str)).a("status", Integer.valueOf(i)).a("brand_id", Integer.valueOf(drugMemberCouponStatusResponse.cardInfo.brandId)).a();
    }
}
