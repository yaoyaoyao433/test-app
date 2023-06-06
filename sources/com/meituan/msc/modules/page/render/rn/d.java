package com.meituan.msc.modules.page.render.rn;

import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.mmpviews.image.MPImageManager;
import com.meituan.msc.mmpviews.list.item.MSCListCellViewManager;
import com.meituan.msc.mmpviews.list.msclist.view.MSCListViewManager;
import com.meituan.msc.mmpviews.perflist.item.RListCellViewManager;
import com.meituan.msc.mmpviews.perflist.view.PerfListViewManager;
import com.meituan.msc.mmpviews.richtext.MPRichTextViewManager;
import com.meituan.msc.mmpviews.scroll.MPScrollViewManager;
import com.meituan.msc.mmpviews.swiper.MPSwiperItemViewManager;
import com.meituan.msc.mmpviews.swiper.MPSwiperViewManager;
import com.meituan.msc.mmpviews.text.MPRawTextManager;
import com.meituan.msc.mmpviews.text.MPTextViewManager;
import com.meituan.msc.mmpviews.text.MPVirtualTextViewManager;
import com.meituan.msc.mmpviews.view.MPViewManager;
import com.meituan.msc.uimanager.as;
import com.meituan.msc.views.gradient.RNLinearGradientManager;
import com.meituan.msc.views.image.RNRCTImageManager;
import com.meituan.msc.views.modal.RNModalHostManager;
import com.meituan.msc.views.scroll.RNHorizontalScrollContainerViewManager;
import com.meituan.msc.views.scroll.RNHorizontalScrollViewManager;
import com.meituan.msc.views.scroll.RNScrollViewManager;
import com.meituan.msc.views.shadowview.RNShadowViewManager;
import com.meituan.msc.views.text.RNRawTextManager;
import com.meituan.msc.views.text.RNTextViewManager;
import com.meituan.msc.views.text.RNVirtualTextViewManager;
import com.meituan.msc.views.view.RNViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.msc.e {
    public static ChangeQuickRedirect a;
    public IFileModule b;

    public d(IFileModule iFileModule) {
        Object[] objArr = {iFileModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23f949593b72ae4b60e49bd5e2e4c9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23f949593b72ae4b60e49bd5e2e4c9e");
        } else {
            this.b = iFileModule;
        }
    }

    @Override // com.meituan.msc.e
    public final List<as> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be739f4bd926fdf137f22841ecde2119", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be739f4bd926fdf137f22841ecde2119") : Arrays.asList(new RNViewManager(), new RNRawTextManager(), new RNTextViewManager(), new RNScrollViewManager(), new RNLinearGradientManager(), new RNShadowViewManager(), new RNModalHostManager(), new RNVirtualTextViewManager(), new RNHorizontalScrollContainerViewManager(), new RNHorizontalScrollViewManager(), new RNRCTImageManager(MSCEnvHelper.getContext(), false, 2.0f, true, false, this.b), new MPViewManager(), new MPRichTextViewManager(), new MPRawTextManager(), new MPTextViewManager(), new MPVirtualTextViewManager(), new MPImageManager(MSCEnvHelper.getContext(), this.b), new MPScrollViewManager(), new MSCListViewManager(this.b), new MSCListCellViewManager(), new PerfListViewManager(this.b), new RListCellViewManager(), new MPSwiperViewManager(), new MPSwiperItemViewManager());
    }
}
