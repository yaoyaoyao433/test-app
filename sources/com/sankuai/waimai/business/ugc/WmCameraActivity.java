package com.sankuai.waimai.business.ugc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.ability.preview.c;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.MediaData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.framework.BaseActivity;
import com.sankuai.waimai.ugc.creator.framework.b;
import com.sankuai.waimai.ugc.creator.utils.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmCameraActivity extends BaseActivity {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseActivity
    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfed4211943e4c3c711584de3ed7a714", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfed4211943e4c3c711584de3ed7a714");
        }
        int a2 = j.a(getIntent(), "KEY_ROUTER_TARGET_ABILITY", 0);
        if (a2 == 1) {
            MediaData mediaData = (MediaData) getIntent().getParcelableExtra("input_media_data");
            if (mediaData instanceof VideoData) {
                return new c((VideoData) mediaData);
            }
            if (mediaData instanceof ImageData) {
                return new com.sankuai.waimai.ugc.creator.ability.preview.b((ImageData) mediaData);
            }
        } else if (a2 == 2) {
            return new com.sankuai.waimai.ugc.creator.ability.videocover.a();
        }
        return new b();
    }
}
