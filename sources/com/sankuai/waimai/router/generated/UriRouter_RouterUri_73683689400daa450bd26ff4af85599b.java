package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.media.b;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_73683689400daa450bd26ff4af85599b implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "621f7b8978db9e58b454e1d2e83c9152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "621f7b8978db9e58b454e1d2e83c9152");
            return;
        }
        hVar.a("", "", "/wmmediapreview", "com.sankuai.waimai.business.ugc.WmCameraActivity", false, new com.sankuai.waimai.business.ugc.a());
        hVar.a("", "", "selectvideocover", "com.sankuai.waimai.business.ugc.WmCameraActivity", false, new com.sankuai.waimai.business.ugc.a());
        hVar.a("", "", "takeout/selectvideocover", "com.sankuai.waimai.business.ugc.WmCameraActivity", false, new com.sankuai.waimai.business.ugc.a());
        hVar.a("", "", "/editimage", "com.sankuai.waimai.business.ugc.WmAlbumActivity", false, new i[0]);
        hVar.a("", "", "/takeout/editimage", "com.sankuai.waimai.business.ugc.WmAlbumActivity", false, new i[0]);
        hVar.a("", "", "/imgedit", "com.sankuai.waimai.business.ugc.WmAlbumActivity", false, new i[0]);
        hVar.a("", "", "/wmmediachoose", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
        hVar.a("", "", "/takeout/wmmediachoose", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
        hVar.a("", "", "/wmvideopreivew", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
        hVar.a("", "", "/takeout/wmvideopreivew", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
        hVar.a("", "", "/ugcpicker", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
        hVar.a("", "", "/takeout/ugcpicker", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
        hVar.a("", "", "/wmvideoselect", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
        hVar.a("", "", "/takeout/wmvideoselect", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", false, new b());
    }
}
