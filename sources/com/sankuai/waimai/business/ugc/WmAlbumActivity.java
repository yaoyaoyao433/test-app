package com.sankuai.waimai.business.ugc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.ability.imgedit.ex.ImageEditorAbilityBlock;
import com.sankuai.waimai.ugc.creator.framework.BaseActivity;
import com.sankuai.waimai.ugc.creator.framework.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmAlbumActivity extends BaseActivity {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseActivity
    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60781fcefdc15947d5ab0d567898b424", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60781fcefdc15947d5ab0d567898b424") : new ImageEditorAbilityBlock();
    }
}
