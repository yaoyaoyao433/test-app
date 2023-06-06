package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.media.b;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_73683689400daa450bd26ff4af85599b implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6fcbadb5f0be22e556ce499814ecd4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6fcbadb5f0be22e556ce499814ecd4b");
            return;
        }
        eVar.a("/wmmediapreview", "com.sankuai.waimai.business.ugc.WmCameraActivity", new com.sankuai.waimai.business.ugc.a());
        eVar.a("selectvideocover", "com.sankuai.waimai.business.ugc.WmCameraActivity", new com.sankuai.waimai.business.ugc.a());
        eVar.a("/editimage", "com.sankuai.waimai.business.ugc.WmAlbumActivity", new i[0]);
        eVar.a("/imgedit", "com.sankuai.waimai.business.ugc.WmAlbumActivity", new i[0]);
        eVar.a("/wmmediachoose", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", new b());
        eVar.a("/wmvideopreivew", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", new b());
        eVar.a("/ugcpicker", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", new b());
        eVar.a("/wmvideoselect", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", new b());
        eVar.a("/wmmediachooseinner", "com.sankuai.waimai.business.ugc.media.WmMediaActivity", new b());
        eVar.a("/wmvideoedit", "com.sankuai.waimai.business.ugc.WmVideoEditActivity", new i[0]);
        eVar.a("/wmvideoclip", "com.sankuai.waimai.business.ugc.WmVideoClipActivity", new i[0]);
    }
}
