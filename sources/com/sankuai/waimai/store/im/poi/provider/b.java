package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.poi.block.SGIMMachNormalBlock;
import com.sankuai.waimai.store.im.poi.block.b;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.IMUIManager;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.im.poi.provider.a<Map> {
    public static ChangeQuickRedirect h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public SGIMMachNormalBlock a;
        public FrameLayout b;
        public FrameLayout c;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sc_common_im_mach_card;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final /* synthetic */ void a(View view, @NonNull final com.sankuai.xm.imui.session.entity.b bVar, @Nullable Object obj) {
        com.sankuai.waimai.store.im.poi.model.a aVar;
        Map<String, Object> map = (Map) obj;
        Object[] objArr = {view, bVar, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "288f6b996d60e683a15e1fdf269020e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "288f6b996d60e683a15e1fdf269020e0");
        } else if (view == null || view.getTag() == null || !(view.getTag() instanceof a) || map == null || this.g == null) {
        } else {
            BaseModuleDesc baseModuleDesc = new BaseModuleDesc();
            baseModuleDesc.templateId = this.g.templateId;
            baseModuleDesc.moduleId = this.g.moduleId;
            baseModuleDesc.nativeId = this.g.nativeId;
            baseModuleDesc.moduleTitle = this.g.moduleId;
            baseModuleDesc.jsonData = map;
            final a aVar2 = (a) view.getTag();
            Map map2 = (Map) this.b.h().get(this.g.templateId);
            if (map2 != null && (aVar = (com.sankuai.waimai.store.im.poi.model.a) map2.get(String.valueOf(((GeneralMessage) bVar.b).getMsgUuid()))) != null) {
                aVar2.a.a(aVar.b, aVar.a);
            }
            aVar2.a.k = bVar;
            aVar2.a.a(baseModuleDesc, baseModuleDesc.templateId, String.valueOf(((GeneralMessage) bVar.b).getMsgUuid()), this.g);
            aVar2.a.a(new b.a() { // from class: com.sankuai.waimai.store.im.poi.provider.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.im.poi.block.b.a
                public final void a(Map<String, Object> map3, com.sankuai.waimai.store.mach.event.a aVar3) {
                    Object[] objArr2 = {map3, aVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5bc3a4e50689a93e5941a652a31d18b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5bc3a4e50689a93e5941a652a31d18b");
                    } else if (map3 != null) {
                        b.this.a(bVar, map3, aVar3);
                    }
                }

                @Override // com.sankuai.waimai.store.im.poi.block.b.a
                public final void a(Map<String, Object> map3) {
                    Object[] objArr2 = {map3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "194f1841820f43a6ac307e89e5a2dc7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "194f1841820f43a6ac307e89e5a2dc7d");
                    } else if (map3 != null) {
                        b bVar2 = b.this;
                        com.sankuai.xm.imui.session.entity.b bVar3 = bVar;
                        Object[] objArr3 = {bVar3, map3};
                        ChangeQuickRedirect changeQuickRedirect3 = b.h;
                        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "b84625da9ed26247096e5aa1d8b6a545", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "b84625da9ed26247096e5aa1d8b6a545");
                        } else if (bVar3 == null || map3 == null || bVar3.b == 0 || map3.get("msg_id") == null) {
                        } else {
                            try {
                                if (TextUtils.equals(String.valueOf(map3.get("msg_id")), String.valueOf(((GeneralMessage) bVar3.b).getMsgId()))) {
                                    IMUIManager.a().a(bVar3.b);
                                }
                            } catch (Exception e) {
                                if (com.sankuai.waimai.store.config.k.a()) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.im.poi.block.b.a
                public final void a(com.sankuai.waimai.mach.node.a aVar3) {
                    Object[] objArr2 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcac3f2aa31ffaa9c2f5e78780954dad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcac3f2aa31ffaa9c2f5e78780954dad");
                    } else if (aVar3 != null) {
                        aVar2.a.a(aVar3.s(), aVar3.t());
                    }
                }
            });
        }
    }

    public b(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, long j, SGCommonDataInfo.IMDynamicCard iMDynamicCard, com.sankuai.waimai.store.im.poi.contract.a aVar2) {
        super(aVar, null, aVar2, iMDynamicCard);
        Object[] objArr = {aVar, null, new Long(j), iMDynamicCard, aVar2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d4391d9ab5d722d69d79d1e6b36572", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d4391d9ab5d722d69d79d1e6b36572");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.c, com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b4e3d3cdaaaa4c586fb8da72c3f1dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b4e3d3cdaaaa4c586fb8da72c3f1dd");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_common_im_mach_card, viewGroup, false);
        a aVar = new a();
        aVar.b = (FrameLayout) inflate.findViewById(R.id.framelayout);
        aVar.c = (FrameLayout) inflate.findViewById(R.id.rl_sg_mach_container);
        SGIMMachNormalBlock sGIMMachNormalBlock = new SGIMMachNormalBlock(context, com.sankuai.waimai.business.im.utils.d.a, this.d, this.b);
        sGIMMachNormalBlock.bindView(inflate);
        aVar.a = sGIMMachNormalBlock;
        inflate.setTag(aVar);
        return inflate;
    }

    public final void a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable Map<String, Object> map, com.sankuai.waimai.store.mach.event.a aVar) {
        com.sankuai.waimai.store.im.poi.model.b bVar2;
        Object[] objArr = {bVar, map, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51694312eeae89c0085e09d77dd94b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51694312eeae89c0085e09d77dd94b5");
        } else if (bVar == null || map == null || bVar.b == null || map.get("data") == null || map.get("msg_uuid") == null || !(map.get("msg_uuid") instanceof String)) {
        } else {
            String str = (String) map.get("msg_uuid");
            if (TextUtils.equals(str, String.valueOf(bVar.b.getMsgUuid()))) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bVar.b.getData(), "utf-8"));
                    jSONObject.put("data", new JSONObject(com.sankuai.waimai.store.util.i.a(map.get("data"))));
                    bVar.b.setData(((String) Objects.requireNonNull(jSONObject.toString())).getBytes());
                    Map<String, Object> map2 = (Map) map.get("data");
                    Object[] objArr2 = {aVar, str, map2};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d4ae6b7f1676863a54ede5d27c2f3ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d4ae6b7f1676863a54ede5d27c2f3ee");
                    } else if (aVar instanceof com.sankuai.waimai.store.mach.d) {
                        try {
                            String str2 = ((com.sankuai.waimai.store.mach.d) aVar).o;
                            if (this.b.ak_().get(str2) == null || (bVar2 = (com.sankuai.waimai.store.im.poi.model.b) ((Map) this.b.ak_().get(str2)).get(str)) == null) {
                                return;
                            }
                            bVar2.c = map2;
                        } catch (Exception e) {
                            com.sankuai.waimai.store.base.log.a.a(e);
                        }
                    }
                } catch (Exception e2) {
                    com.sankuai.waimai.store.base.log.a.a(e2);
                }
            }
        }
    }
}
