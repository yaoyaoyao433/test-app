package com.sankuai.titans.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class LoadingViewTemplate implements ILoadingViewTemplate {
    public static ChangeQuickRedirect changeQuickRedirect;
    private View loadingView;

    @Override // com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate
    public long getShowDuration() {
        return 0L;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate
    public abstract View inflateLoadingView(@NonNull LayoutInflater layoutInflater);

    @Override // com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate
    public boolean isFullscreen() {
        return false;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate
    public void onDismiss() {
    }

    public LoadingViewTemplate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62abd9b45b00da734a25e2dcc6affa9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62abd9b45b00da734a25e2dcc6affa9e");
        } else {
            this.loadingView = null;
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate
    public final View getLoadingView(boolean z, @Nullable LayoutInflater layoutInflater) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), layoutInflater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "333c2fd2bd69001a3bfa41f91334f35d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "333c2fd2bd69001a3bfa41f91334f35d");
        }
        if (this.loadingView == null && z && layoutInflater != null) {
            this.loadingView = inflateLoadingView(layoutInflater);
        }
        return this.loadingView;
    }
}
