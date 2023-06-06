package com.meituan.android.identifycardrecognizer.fragment;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PeopleCaptureFragment extends BaseCaptureFragment {
    public static ChangeQuickRedirect u;

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final void a(int i) {
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final int c() {
        return 10;
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0152b316d6b193d1350364c64547cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0152b316d6b193d1350364c64547cc2");
            return;
        }
        super.onViewCreated(view, bundle);
        this.h.setVisibility(8);
        this.e.setVisibility(0);
        this.i.setVisibility(8);
        this.g.setBackgroundColor(Color.parseColor("#66000000"));
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96d71457b036f5a9cb9bae8002e5da01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96d71457b036f5a9cb9bae8002e5da01");
        } else if (getActivity() != null) {
            ((com.meituan.android.identifycardrecognizer.g) getActivity()).a(11, str);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final Bitmap a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c983356f405271f8abf4f6a1bc56c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c983356f405271f8abf4f6a1bc56c5");
        }
        new Handler(Looper.getMainLooper()).post(h.a(this));
        int b = b(this.p);
        if (this.p == 1) {
            return a(bArr, 0, 0, 0, 0, true, (b + this.s) % 360);
        }
        return a(bArr, 0, 0, 0, 0, false, (b + this.s) % 360);
    }

    public static /* synthetic */ void a(PeopleCaptureFragment peopleCaptureFragment) {
        Object[] objArr = {peopleCaptureFragment};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04ce53a0be0153f27ac3fc478be53ef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04ce53a0be0153f27ac3fc478be53ef5");
        } else if (peopleCaptureFragment.isDetached()) {
        } else {
            peopleCaptureFragment.a(peopleCaptureFragment.j.getWidth(), peopleCaptureFragment.j.getHeight());
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f9c99c32cc38543b6b15aa6db6d8b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f9c99c32cc38543b6b15aa6db6d8b8")).booleanValue();
        }
        com.meituan.android.paybase.common.analyse.a.a(d(), "点击返回", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
        if (getActivity() != null) {
            getActivity().finish();
            return true;
        }
        return true;
    }
}
