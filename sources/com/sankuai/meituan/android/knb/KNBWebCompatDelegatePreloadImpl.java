package com.sankuai.meituan.android.knb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.dianping.titans.widget.TitansWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebCompatDelegatePreloadImpl extends KNBWebCompatDelegateImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean loaded;
    private View rootView;

    public KNBWebCompatDelegatePreloadImpl(Context context, IKnbActivityHandler iKnbActivityHandler) {
        super(context, iKnbActivityHandler);
        Object[] objArr = {context, iKnbActivityHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d703eab1ac8bf6256192a2db1cba395c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d703eab1ac8bf6256192a2db1cba395c");
        } else {
            this.loaded = false;
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca73bd0b49b8bd9e3e8fd1304de0bcff", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca73bd0b49b8bd9e3e8fd1304de0bcff");
        }
        if (this.rootView != null) {
            return this.rootView;
        }
        this.rootView = super.onCreateView(layoutInflater, viewGroup);
        return this.rootView;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl
    public void inflateWebView(ViewStub viewStub) {
        Object[] objArr = {viewStub};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb663ef7def35fbd06979e6cc4b292f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb663ef7def35fbd06979e6cc4b292f8");
            return;
        }
        TitansWebView titansWebView = new TitansWebView(new MutableContextWrapper(viewStub.getContext()));
        ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewInLayout(viewStub);
        titansWebView.setId(R.id.layout_webview);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(titansWebView, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(titansWebView, indexOfChild);
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebCompatDelegateImpl, com.sankuai.meituan.android.knb.KNBWebCompatDelegate
    public void onCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e23ab3dfc6245fb271cc415c286caaf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e23ab3dfc6245fb271cc415c286caaf0");
        } else if (this.loaded) {
        } else {
            super.onCreated(bundle);
            this.loaded = true;
        }
    }
}
