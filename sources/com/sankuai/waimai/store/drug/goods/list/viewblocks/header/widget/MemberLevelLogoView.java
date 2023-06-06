package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiMemberInfo;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.l;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MemberLevelLogoView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public String b;
    public Map<String, Object> c;
    private TextView d;
    private ImageView e;
    private TextView f;
    private ImageView g;
    private TextView h;

    public MemberLevelLogoView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8877d5b56dd0d4395fc009bc7313796", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8877d5b56dd0d4395fc009bc7313796");
        }
    }

    public MemberLevelLogoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ec1b8f2eba5911db2e8fa472af75c3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ec1b8f2eba5911db2e8fa472af75c3a");
        }
    }

    public MemberLevelLogoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ff7acb70b5d83d122b2d158aa8a4b86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ff7acb70b5d83d122b2d158aa8a4b86");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e03f6cda33e73978a6ae97ebd6af1af9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e03f6cda33e73978a6ae97ebd6af1af9");
            return;
        }
        setBackgroundResource(R.drawable.wm_drug_poi_member_entrance_bg);
        inflate(getContext(), R.layout.wm_drug_market_member_level_logo, this);
        this.d = (TextView) findViewById(R.id.poi_member_entrance_title);
        this.e = (ImageView) findViewById(R.id.logo_view);
        this.f = (TextView) findViewById(R.id.member_entrance_text);
        this.g = (ImageView) findViewById(R.id.img_member_icon);
        this.h = (TextView) findViewById(R.id.act_guide_view);
        this.h.setBackground(e.a(getContext(), new int[]{R.color.wm_st_common_F3E1CA, R.color.wm_st_common_E8CEB4}, (int) R.dimen.wm_sc_common_dimen_4));
        ImageView imageView = (ImageView) findViewById(R.id.member_entrance);
        imageView.setImageDrawable(a.a(imageView.getContext(), (int) R.dimen.wm_sc_common_dimen_3_half, (int) R.dimen.wm_sc_common_dimen_6, (int) R.color.wm_sg_color_222426, a.EnumC1338a.RIGHT));
    }

    public void setMemberLevel(PoiMemberInfo poiMemberInfo) {
        Object[] objArr = {poiMemberInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6836aef6e4ed66ce50e0ab19720770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6836aef6e4ed66ce50e0ab19720770");
        } else if (poiMemberInfo == null || !poiMemberInfo.isSupportMember) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.d.setText(TextUtils.isEmpty(poiMemberInfo.level) ? getContext().getString(R.string.wm_sc_member_ship) : poiMemberInfo.level);
            String str = poiMemberInfo.joinText;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "821684ace83822bb9487b217b84ca7bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "821684ace83822bb9487b217b84ca7bb");
            } else {
                u.a(this.f, l.a(str, "#FF4A26"));
            }
            m.a(poiMemberInfo.logoUrl, (int) getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_30), ImageQualityUtil.b()).a(this.e);
            this.g.setVisibility(poiMemberInfo.isPoiMember ? 0 : 8);
            if (TextUtils.isEmpty(poiMemberInfo.actGuide)) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
                this.h.setText(poiMemberInfo.actGuide);
            }
            final String str2 = poiMemberInfo.scheme;
            setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.widget.MemberLevelLogoView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "272ec71cb27ad7b035ae8fa4fbb515fd", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "272ec71cb27ad7b035ae8fa4fbb515fd");
                        return;
                    }
                    if (!TextUtils.isEmpty(MemberLevelLogoView.this.b)) {
                        b.a(view.getContext(), MemberLevelLogoView.this.b).a(MemberLevelLogoView.this.getContext()).b(MemberLevelLogoView.this.c).a();
                    }
                    d.a(view.getContext(), str2);
                }
            });
        }
    }
}
