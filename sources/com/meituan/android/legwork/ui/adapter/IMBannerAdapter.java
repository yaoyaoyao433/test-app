package com.meituan.android.legwork.ui.adapter;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IMBannerAdapter implements IBannerAdapter {
    public static ChangeQuickRedirect a;
    private View b;
    private TextView c;
    private IMInitializeData d;

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public boolean isOverlay() {
        return false;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1851360c2588cf1c281be886d862fc6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1851360c2588cf1c281be886d862fc6b");
        }
    }

    public IMBannerAdapter() {
    }

    public IMBannerAdapter(IMInitializeData iMInitializeData) {
        Object[] objArr = {iMInitializeData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a2559e006b4e2d436c26c1504ddaba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a2559e006b4e2d436c26c1504ddaba");
        } else {
            this.d = iMInitializeData;
        }
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0bcf18481a68aedfd336f110e3fb88", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0bcf18481a68aedfd336f110e3fb88");
        }
        this.b = layoutInflater.inflate(R.layout.legwork_im_banner, viewGroup, false);
        this.b.setVisibility(8);
        this.c = (TextView) this.b.findViewById(R.id.title_tv);
        if (this.d != null && !TextUtils.isEmpty(this.d.opMsg)) {
            this.c.setText(this.d.opMsg);
            this.c.setVisibility(0);
            this.b.setVisibility(0);
        }
        return this.b;
    }
}
