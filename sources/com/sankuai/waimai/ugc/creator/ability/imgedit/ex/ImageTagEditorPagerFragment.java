package com.sankuai.waimai.ugc.creator.ability.imgedit.ex;

import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.framework.BaseFragment;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ImageTagEditorPagerFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    public c b;

    public static ImageTagEditorPagerFragment a(ArrayList<ImageData> arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c0ce80763e338a4b6a680e59c97d31f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageTagEditorPagerFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c0ce80763e338a4b6a680e59c97d31f");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("input_media_data", arrayList);
        bundle.putInt("media_position", i);
        ImageTagEditorPagerFragment imageTagEditorPagerFragment = new ImageTagEditorPagerFragment();
        imageTagEditorPagerFragment.setArguments(bundle);
        return imageTagEditorPagerFragment;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment
    public final com.sankuai.waimai.ugc.creator.framework.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46b9bfa5220fef9099a432498a186ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ugc.creator.framework.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46b9bfa5220fef9099a432498a186ff");
        }
        this.b = new c(this);
        return this.b;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "044f51c2f9d7df02fdeab5943de1c56a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "044f51c2f9d7df02fdeab5943de1c56a");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }
}
