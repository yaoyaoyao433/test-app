package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.poi.NewMemberInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    boolean b;
    public ObjectAnimator c;
    private MemberView d;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac4c0db90298f8fdbaafccba681720a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac4c0db90298f8fdbaafccba681720a");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ef4e332456f9fee115afec89831fbe6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ef4e332456f9fee115afec89831fbe6") : layoutInflater.inflate(R.layout.wm_drug_compose_poi_member_layout, viewGroup, true);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa2196fdb213d1e9322b33bdd1c2bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa2196fdb213d1e9322b33bdd1c2bfa");
        } else {
            this.d = (MemberView) findView(R.id.member_view);
        }
    }

    public final void a(Poi poi) {
        int i;
        String str;
        String substring;
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2333f506a36ce99be360e2e11b63f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2333f506a36ce99be360e2e11b63f5");
            return;
        }
        this.b = false;
        if (poi == null || poi.mNewMemberInfo == null) {
            u.b(this.mView);
            return;
        }
        NewMemberInfo newMemberInfo = poi.mNewMemberInfo;
        if (!newMemberInfo.isSupportMember) {
            u.b(this.mView);
            return;
        }
        this.b = true;
        HashMap hashMap = new HashMap();
        hashMap.put("is_vip", Integer.valueOf(newMemberInfo.isPoiMember ? 1 : 0));
        hashMap.put("poi_id", poi.getOfficialPoiId());
        hashMap.put("status", newMemberInfo.status);
        hashMap.put("text", newMemberInfo.joinText);
        hashMap.put("stid", poi.abExpInfo);
        hashMap.put("brand_id", poi.brandId);
        Object[] objArr2 = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5228126a2e57e2a7e45351184693a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5228126a2e57e2a7e45351184693a80");
        } else {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_ci9l8kwx_mv", this.mView);
            bVar.b(hashMap);
            if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, bVar);
            }
        }
        if (newMemberInfo.showAnimation == 1) {
            Object[] objArr3 = {newMemberInfo};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6cb93c7bd2a22d045af5c5fdd3a1941f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6cb93c7bd2a22d045af5c5fdd3a1941f");
            } else {
                final TextView textView = (TextView) this.mView.findViewById(R.id.left_anim_view);
                u.a(textView);
                MemberRightView memberRightView = (MemberRightView) this.mView.findViewById(R.id.member_view_anim);
                u.a(memberRightView);
                final LightingAnimationView lightingAnimationView = (LightingAnimationView) this.mView.findViewById(R.id.m_lighting_animation_view);
                u.a(lightingAnimationView);
                String str2 = newMemberInfo.joinText;
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "35777b04a4bb091d19db009718ae5520", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "35777b04a4bb091d19db009718ae5520");
                } else {
                    if (TextUtils.isEmpty(str2)) {
                        substring = "";
                    } else if (str2.length() > 8) {
                        substring = str2.substring(0, 8);
                    } else {
                        str = str2;
                    }
                    str = substring;
                }
                textView.setText(str);
                float measureText = textView.getPaint().measureText(str) + textView.getPaddingLeft();
                float a2 = memberRightView.a();
                ConstraintLayout constraintLayout = (ConstraintLayout) this.mView.findViewById(R.id.wm_drug_goods_member_view_constraint);
                ((LinearLayout.LayoutParams) constraintLayout.getLayoutParams()).width = (int) (a2 + measureText);
                this.c = ObjectAnimator.ofFloat(textView, RecceAnimUtils.TRANSLATION_X, -measureText);
                this.c.setInterpolator(new DecelerateInterpolator());
                this.c.setDuration(1100L);
                this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr5 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cffd8ee2d1a5caca8bbc04d8b7b1f9b1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cffd8ee2d1a5caca8bbc04d8b7b1f9b1");
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (Math.abs(floatValue) < 20.0f && textView.getVisibility() == 0) {
                            textView.setVisibility(8);
                        }
                        if (Math.abs(floatValue) <= 20.0f || textView.getVisibility() != 8) {
                            return;
                        }
                        textView.setVisibility(0);
                    }
                });
                this.c.start();
                constraintLayout.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6de1c1584028501cadacd8409fc6b0e7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6de1c1584028501cadacd8409fc6b0e7");
                            return;
                        }
                        LightingAnimationView lightingAnimationView2 = lightingAnimationView;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = LightingAnimationView.a;
                        if (PatchProxy.isSupport(objArr6, lightingAnimationView2, changeQuickRedirect6, false, "0a70c1b1523a724ee258ac154a436916", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, lightingAnimationView2, changeQuickRedirect6, false, "0a70c1b1523a724ee258ac154a436916");
                        } else {
                            lightingAnimationView2.a(lightingAnimationView2.getWidth(), lightingAnimationView2.getHeight(), lightingAnimationView2.c, lightingAnimationView2.b);
                        }
                    }
                }, 1100L);
            }
            i = 1;
            u.c(this.d);
        } else {
            u.a(this.d);
            MemberView memberView = this.d;
            String str3 = newMemberInfo.joinText;
            String string = getContext().getString(R.string.wm_sc_member_ship);
            Object[] objArr5 = {str3, string};
            ChangeQuickRedirect changeQuickRedirect5 = MemberView.a;
            if (PatchProxy.isSupport(objArr5, memberView, changeQuickRedirect5, false, "39d6b7873a8f1824bf17a505cdf9b5ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, memberView, changeQuickRedirect5, false, "39d6b7873a8f1824bf17a505cdf9b5ff");
            } else {
                memberView.c = string;
                if (TextUtils.isEmpty(str3)) {
                    memberView.b = "";
                } else if (str3.length() > 8) {
                    memberView.b = str3.substring(0, 8);
                } else {
                    memberView.b = str3;
                }
                memberView.requestLayout();
            }
            i = 1;
        }
        View[] viewArr = new View[i];
        viewArr[0] = this.mView;
        u.a(viewArr);
        View[] viewArr2 = new View[i];
        viewArr2[0] = this.mView.findViewById(R.id.wm_drug_goods_member_view_constraint);
        u.a(viewArr2);
        this.mView.setOnClickListener(new View$OnClickListenerC1149a(this.mContext, newMemberInfo.scheme, hashMap));
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5e1bcc832feda264995c4e01566250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5e1bcc832feda264995c4e01566250");
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            this.c.cancel();
        }
        this.c = null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class View$OnClickListenerC1149a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public Context b;
        public String c;
        public Map<String, Object> d;

        public View$OnClickListenerC1149a(Context context, String str, @NonNull Map<String, Object> map) {
            Object[] objArr = {a.this, context, str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8f8206f17927fc99b07543869917b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8f8206f17927fc99b07543869917b4");
                return;
            }
            this.b = context;
            this.c = str;
            this.d = map;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0f848dbe23259304fa947e88a6c61b", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0f848dbe23259304fa947e88a6c61b");
            } else if (TextUtils.isEmpty(this.c)) {
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(this.b, "b_waimai_ci9l8kwx_mc").a(a.this.getContext()).b(this.d).a();
                com.sankuai.waimai.store.router.d.a(this.b, this.c);
            }
        }
    }
}
