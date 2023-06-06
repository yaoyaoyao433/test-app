package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IdCardCaptureFragment extends BaseCaptureFragment {
    public static ChangeQuickRedirect u;
    private int v;

    public static IdCardCaptureFragment a(String str, int i) {
        Object[] objArr = {null, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c86cc323121a2e43a6b4f1b45898dd04", RobustBitConfig.DEFAULT_VALUE)) {
            return (IdCardCaptureFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c86cc323121a2e43a6b4f1b45898dd04");
        }
        IdCardCaptureFragment idCardCaptureFragment = new IdCardCaptureFragment();
        Bundle bundle = new Bundle();
        bundle.putString("outputDir", null);
        bundle.putInt("cardType", i);
        idCardCaptureFragment.setArguments(bundle);
        return idCardCaptureFragment;
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9e171d50afb2ff62928b7da281adbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9e171d50afb2ff62928b7da281adbd");
            return;
        }
        super.onViewCreated(view, bundle);
        this.b.setImageResource(R.drawable.identifycard_recognizer_icon_white_back);
        this.h.setVisibility(0);
        this.h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.e.setVisibility(8);
        this.i.setVisibility(0);
        if (getArguments() != null) {
            this.v = getArguments().getInt("cardType", 0);
        }
        c(this.v);
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcbfb926529065461d723aa83424d339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcbfb926529065461d723aa83424d339");
            return;
        }
        if (i == 1) {
            this.i.a(getString(R.string.identifycard_recognizer_card_back_tip), getResources().getDimensionPixelSize(R.dimen.paybase__camera_preview_text_size), getResources().getColor(R.color.paybase__white));
        } else {
            this.i.a(getString(R.string.identifycard_recognizer_card_front_tip), getResources().getDimensionPixelSize(R.dimen.paybase__camera_preview_text_size), getResources().getColor(R.color.paybase__white));
        }
        d(this.s);
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final Bitmap a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb3d90ce9bafc6c400d042910f22a47", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb3d90ce9bafc6c400d042910f22a47");
        }
        Camera.Size pictureSize = this.l.getParameters().getPictureSize();
        int width = this.h.getWidth();
        int height = this.h.getHeight();
        int width2 = this.j.getWidth();
        int height2 = this.j.getHeight();
        int i5 = pictureSize.width;
        int i6 = pictureSize.height;
        new Handler(Looper.getMainLooper()).post(d.a(this, width2, height2));
        if (i5 <= i6) {
            i5 = i6;
            i6 = i5;
        }
        float f = i6;
        float f2 = i5;
        int i7 = (int) (width * (f / width2));
        int i8 = (int) (height * (f2 / height2));
        int b = b(this.p);
        if (this.s == 90 || this.s == 270) {
            float f3 = i7 * 1.1f;
            i = ((int) (f2 - f3)) / 2;
            float f4 = i8 * 1.1f;
            i2 = ((int) (f - f4)) / 2;
            i3 = (int) f3;
            i4 = (int) f4;
            if (i3 > i5) {
                i3 = i5 - 1;
            }
            if (i4 > i6) {
                i4 = i6 - 1;
            }
        } else {
            float f5 = i7 * 1.1f;
            i = ((int) (f - f5)) / 2;
            float f6 = i8 * 1.1f;
            i2 = ((int) (f2 - f6)) / 2;
            i3 = (int) f5;
            i4 = (int) f6;
            if (i3 > i6) {
                i3 = i6 - 1;
            }
            if (i4 > i5) {
                i4 = i5 - 1;
            }
        }
        int i9 = i3;
        int i10 = i4;
        int i11 = i < 0 ? 1 : i;
        if (i2 < 0) {
            i2 = 1;
        }
        return this.p == 1 ? a(bArr, i11, i2, i9, i10, true, (b + this.s) % 360) : a(bArr, i11, i2, i9, i10, false, (b + this.s) % 360);
    }

    public static /* synthetic */ void a(IdCardCaptureFragment idCardCaptureFragment, int i, int i2) {
        Object[] objArr = {idCardCaptureFragment, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ba3bd23d69526b18becd0411ce27d77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ba3bd23d69526b18becd0411ce27d77");
        } else if (idCardCaptureFragment.isDetached()) {
        } else {
            idCardCaptureFragment.a(i, i2);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19d263c3eac0f4bd1cf0f60b880bb2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19d263c3eac0f4bd1cf0f60b880bb2e");
            return;
        }
        super.a(i);
        d(i);
        this.h.setRotation(360 - i);
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99f56ff966f13d39d05c809e5cc9218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99f56ff966f13d39d05c809e5cc9218");
            return;
        }
        if (this.v == 0) {
            com.meituan.android.paybase.config.a.d().r().a(R.drawable.identifycard_recognizer_bg_renxiang).a(this.h);
        } else {
            com.meituan.android.paybase.config.a.d().r().a(R.drawable.identifycard_recognizer_bg_guohui).a(this.h);
        }
        this.h.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc74ae7c13ccb587ab733e630277978d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc74ae7c13ccb587ab733e630277978d");
        } else if (this.v == 0) {
            if (getActivity() != null) {
                ((com.meituan.android.identifycardrecognizer.g) getActivity()).a(11, str);
            }
        } else if (getActivity() != null) {
            ((com.meituan.android.identifycardrecognizer.g) getActivity()).a(12, str);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final int c() {
        return this.v == 0 ? 11 : 12;
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13e73008c417f24317800717d266f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13e73008c417f24317800717d266f18");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && this.v == 0) {
            this.v = 1;
            c(this.v);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return this.v == 0 ? "c_w03juo9t" : "c_yfedwj59";
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b1fba320705fc04adef9f59b79d13c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b1fba320705fc04adef9f59b79d13c");
        }
        HashMap<String, Object> e = super.e();
        e.put("item", com.meituan.android.identifycardrecognizer.utils.b.a());
        return e;
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ee076f3fcff52dc7fcd74b7c3c7f3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ee076f3fcff52dc7fcd74b7c3c7f3e")).booleanValue();
        }
        if (this.v != 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = u;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5ba62e17aa4a9e516c832646bbf8500", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5ba62e17aa4a9e516c832646bbf8500");
            } else {
                BasePayDialog.b a = new PayDialog.a(getActivity()).b("确认要离开吗？").a(IPaymentManager.NO_ACTION, (BasePayDialog.c) null);
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                a.b("确认", PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cc4c81c519c6e64cb4b6fa12316775cd", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cc4c81c519c6e64cb4b6fa12316775cd") : new e(this)).b(com.meituan.android.identifycardrecognizer.utils.a.b).b(false).a(false).a().show();
            }
        } else {
            com.meituan.android.paybase.common.analyse.a.a(d(), "点击返回", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
            if (getActivity() != null) {
                getActivity().finish();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageInfo", "IdCardCaptureFragment");
        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_backfrompage_sc", hashMap);
        return true;
    }

    public static /* synthetic */ void a(IdCardCaptureFragment idCardCaptureFragment, Dialog dialog) {
        Object[] objArr = {idCardCaptureFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5ded8d34f283bc1fd1411995212abd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5ded8d34f283bc1fd1411995212abd8");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(idCardCaptureFragment.d(), "点击确认返回", com.meituan.android.identifycardrecognizer.utils.b.a(), com.meituan.android.identifycardrecognizer.utils.b.c);
        dialog.dismiss();
        if (idCardCaptureFragment.getActivity() != null) {
            idCardCaptureFragment.getActivity().finish();
        }
    }
}
