package com.sankuai.waimai.store.goods.list.viewblocks.drugcompose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.poi.NewMemberInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.c;
import com.sankuai.waimai.store.util.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    LinearLayout c;
    boolean d;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9c5dc3fa834c95ce7a57aa8ea376eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9c5dc3fa834c95ce7a57aa8ea376eb");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3d8c6fd59fe7701c2664e0be691902", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3d8c6fd59fe7701c2664e0be691902") : layoutInflater.inflate(R.layout.wm_sc_compose_poi_member_layout, viewGroup, true);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bc5e69bff6875b4c8376e8ba26424fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bc5e69bff6875b4c8376e8ba26424fe");
            return;
        }
        this.b = (TextView) findView(R.id.compose_poi_member_hint_label);
        this.c = (LinearLayout) findView(R.id.compose_poi_member_logo);
        this.c.setBackground(new e.a().c(ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FAF1E9)).a(h.a(this.mContext, 50.0f)).b(h.a(this.mContext, 0.5f)).a(ContextCompat.getColor(this.mContext, R.color.wm_sg_color_EED7C2)).a());
    }

    public final void a(Poi poi) {
        int[] iArr;
        int i;
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364ee9b715cf2d959791114bc4c8237d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364ee9b715cf2d959791114bc4c8237d");
        } else if (poi == null || poi.mNewMemberInfo == null) {
            u.b(this.mView);
        } else {
            NewMemberInfo newMemberInfo = poi.mNewMemberInfo;
            if (!newMemberInfo.isSupportMember) {
                u.b(this.mView);
                return;
            }
            this.d = true;
            u.a(this.c);
            HashMap hashMap = new HashMap();
            hashMap.put("is_vip", Integer.valueOf(newMemberInfo.isPoiMember ? 1 : 0));
            hashMap.put("poi_id", poi.getOfficialPoiId());
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b46db329396d729061e1c2e1ee7d89a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b46db329396d729061e1c2e1ee7d89a6");
            } else {
                com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_pq2bus9u", this.mView);
                bVar.b(hashMap);
                if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, bVar);
                }
            }
            if (!newMemberInfo.isPoiMember) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de89b11e52c4d54f4966c709e5c9ed56", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de89b11e52c4d54f4966c709e5c9ed56")).intValue();
                } else {
                    Context context = this.mContext;
                    Object[] objArr4 = {context, "compose_member_hint_text"};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.util.c.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b084801975fe57c581aac14b796c015c", RobustBitConfig.DEFAULT_VALUE)) {
                        iArr = (int[]) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b084801975fe57c581aac14b796c015c");
                    } else {
                        int[] iArr2 = new int[2];
                        long b = ab.b().b(context, "compose_member_hint_text", 0L);
                        Object[] objArr5 = {new Long(b)};
                        ChangeQuickRedirect changeQuickRedirect5 = c.a.a;
                        if ((PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e0ebcbee0b547232d6ca89e839e99afc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e0ebcbee0b547232d6ca89e839e99afc")).intValue() : (int) (33554431 & b)) == com.sankuai.waimai.store.util.c.a()) {
                            iArr2[0] = c.a.b(b);
                        }
                        iArr2[1] = c.a.a(b);
                        iArr = iArr2;
                    }
                    i = iArr[1];
                }
                if (i <= 0) {
                    u.a(this.b);
                    u.a(this.b, newMemberInfo.joinText);
                    com.sankuai.waimai.store.util.c.a(this.mContext, "compose_member_hint_text", 1, 1);
                    this.mView.setOnClickListener(new View$OnClickListenerC1191a(this.mContext, newMemberInfo.scheme, hashMap));
                }
            }
            u.b(this.b);
            this.mView.setOnClickListener(new View$OnClickListenerC1191a(this.mContext, newMemberInfo.scheme, hashMap));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class View$OnClickListenerC1191a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public Context b;
        public String c;
        public Map<String, Object> d;

        public View$OnClickListenerC1191a(Context context, String str, @NonNull Map<String, Object> map) {
            Object[] objArr = {a.this, context, str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc42a14f4fec00900ff035a6d0fdeea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc42a14f4fec00900ff035a6d0fdeea");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38970d03dd4f094b8a001f267c9a8c73", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38970d03dd4f094b8a001f267c9a8c73");
            } else if (TextUtils.isEmpty(this.c)) {
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(this.b, "b_atsidyig").a(a.this.getContext()).b(this.d).a();
                com.sankuai.waimai.store.router.d.a(this.b, this.c);
            }
        }
    }
}
