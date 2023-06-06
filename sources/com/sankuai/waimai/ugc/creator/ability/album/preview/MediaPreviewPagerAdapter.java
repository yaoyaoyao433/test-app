package com.sankuai.waimai.ugc.creator.ability.album.preview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MediaPreviewPagerAdapter extends FragmentStatePagerAdapter {
    public static ChangeQuickRedirect a;
    private final List<ImageData> b;

    public MediaPreviewPagerAdapter(FragmentManager fragmentManager, List<ImageData> list) {
        super(fragmentManager);
        Object[] objArr = {fragmentManager, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484cae1671064fc83968745a572e7846", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484cae1671064fc83968745a572e7846");
        } else {
            this.b = list;
        }
    }

    @Override // android.support.v4.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f011dfd57a785b1548f1c225b0f1cd1a", RobustBitConfig.DEFAULT_VALUE) ? (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f011dfd57a785b1548f1c225b0f1cd1a") : MediaPreviewPagerFragment.a(this.b.get(i));
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "214939d19f9126a7dc662e053282d9da", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "214939d19f9126a7dc662e053282d9da")).intValue() : this.b.size();
    }
}
