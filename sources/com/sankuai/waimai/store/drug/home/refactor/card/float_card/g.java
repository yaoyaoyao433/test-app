package com.sankuai.waimai.store.drug.home.refactor.card.float_card;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.home.refactor.l;
import com.sankuai.waimai.store.repository.model.FloatSmallDrugChest;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    View b;
    UniversalImageView c;
    LinearLayout d;
    com.sankuai.waimai.store.expose.v2.entity.b e;
    FloatSmallDrugChest f;
    com.sankuai.waimai.store.param.a g;
    private UniversalImageView h;

    public g(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a768b4eaef1cfab5d4cd6025ac15c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a768b4eaef1cfab5d4cd6025ac15c6");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c13b2e6ec07a2ad24b815feec04d02", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c13b2e6ec07a2ad24b815feec04d02");
        }
        this.d = (LinearLayout) viewGroup;
        View inflate = layoutInflater.inflate(R.layout.wm_drug_channel_float_small_drug_chest, viewGroup, false);
        this.b = inflate.findViewById(R.id.small_drug_chest_of_channel_float);
        this.c = (UniversalImageView) inflate.findViewById(R.id.iv_small_drug_chest_of_channel_float);
        this.h = (UniversalImageView) inflate.findViewById(R.id.iv_small_drug_chest_close);
        this.e = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_mosdf5bw", "b_waimai_sg_b7z4qadu_mv", inflate);
        l.b();
        return inflate;
    }

    public final void a(final FloatSmallDrugChest floatSmallDrugChest, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {floatSmallDrugChest, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2275f8410bd4166d7205df2056b17b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2275f8410bd4166d7205df2056b17b0b");
            return;
        }
        this.f = floatSmallDrugChest;
        this.g = aVar;
        if (p.a(floatSmallDrugChest, this.b, this.d, this.e)) {
            return;
        }
        if (!l.a()) {
            u.a(this.d, this.b);
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = this.e;
        bVar.e = "b_waimai_sg_b7z4qadu_mv_" + this.e.hashCode();
        bVar.a("activity_id", floatSmallDrugChest.actUUid).a("ug_activity_id", Integer.valueOf(a(floatSmallDrugChest))).a("ug_activity_type", Integer.valueOf(b(floatSmallDrugChest))).a("cat_id", Long.valueOf(this.g.c)).a("stid", floatSmallDrugChest.stidInfo);
        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.e);
        b.C0608b b = m.b(floatSmallDrugChest.floatIconUrl);
        b.j = R.drawable.wm_sc_comment_img_load_placeholder;
        b.a(new BitmapTransformation[0]).a((ImageView) this.c);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.g.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdfd6a6b2f6f477b8726ec55f38a5677", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdfd6a6b2f6f477b8726ec55f38a5677");
                    return;
                }
                if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                    com.sankuai.waimai.store.router.d.a(g.this.mContext, floatSmallDrugChest.innerUrl);
                } else {
                    com.sankuai.waimai.store.manager.user.a.a(view.getContext());
                }
                com.sankuai.waimai.store.manager.judas.b.a("c_waimai_mosdf5bw", "b_waimai_sg_b7z4qadu_mc").a(com.sankuai.waimai.store.manager.judas.b.a((Object) g.this.mContext)).a("activity_id", floatSmallDrugChest.actUUid).a("stid", floatSmallDrugChest.stidInfo).a("ug_activity_id", Integer.valueOf(g.this.a(floatSmallDrugChest))).a("ug_activity_type", Integer.valueOf(g.this.b(floatSmallDrugChest))).a("cat_id", Long.valueOf(g.this.g.c)).a();
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.g.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37fb8a37a5f25d3ef5d841a63effcea0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37fb8a37a5f25d3ef5d841a63effcea0");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a("c_waimai_mosdf5bw", "b_waimai_jk3qv6f4_mc").a(com.sankuai.waimai.store.manager.judas.b.a((Object) g.this.mContext)).a("cat_id", Long.valueOf(g.this.g.c)).a();
                l.a(true);
                u.c(g.this.b, g.this.d);
            }
        });
    }

    int a(FloatSmallDrugChest floatSmallDrugChest) {
        Object[] objArr = {floatSmallDrugChest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6f721dc29a9384a15279e268736117", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6f721dc29a9384a15279e268736117")).intValue();
        }
        if (floatSmallDrugChest == null || floatSmallDrugChest.expData == null) {
            return -999;
        }
        try {
            String str = (String) floatSmallDrugChest.expData.get("buried_point");
            if (str == null) {
                return -999;
            }
            return new JSONObject(str).optInt("ug_activity_id");
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return -999;
        }
    }

    int b(FloatSmallDrugChest floatSmallDrugChest) {
        Object[] objArr = {floatSmallDrugChest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc9114cdc8b9133855f29af319b901b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc9114cdc8b9133855f29af319b901b")).intValue();
        }
        if (floatSmallDrugChest == null || floatSmallDrugChest.expData == null) {
            return -999;
        }
        try {
            String str = (String) floatSmallDrugChest.expData.get("buried_point");
            if (str == null) {
                return -999;
            }
            return new JSONObject(str).optInt("ug_activity_type");
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return -999;
        }
    }
}
