package com.sankuai.waimai.business.ugc;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.framework.BaseActivity;
import com.sankuai.waimai.ugc.creator.framework.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmVideoClipActivity extends BaseActivity {
    public static ChangeQuickRedirect a;
    private VideoData d;

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseActivity
    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3239d74ef274aba6bd2be7904228dec0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3239d74ef274aba6bd2be7904228dec0");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "564f8c6e8aea5a99df8e561c16d48310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "564f8c6e8aea5a99df8e561c16d48310");
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.d = (VideoData) intent.getParcelableExtra("input_media_data");
            }
        }
        return new com.sankuai.waimai.ugc.creator.ability.videoclip.a(this.d);
    }
}
