package com.sankuai.waimai.reactnative.tag;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends TagCanvasView {
    public static ChangeQuickRedirect a;
    private InterfaceC1123a d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.reactnative.tag.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1123a {
        void a(int i, int i2);
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1ea2a6533085a96339786ace7741e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1ea2a6533085a96339786ace7741e8");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView, com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e6463ddbb9d53c2df3fa06a759f1f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e6463ddbb9d53c2df3fa06a759f1f6");
            return;
        }
        super.onMeasure(i, i2);
        if (this.d != null) {
            this.d.a(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void setMeasuredSizeListener(InterfaceC1123a interfaceC1123a) {
        this.d = interfaceC1123a;
    }
}
