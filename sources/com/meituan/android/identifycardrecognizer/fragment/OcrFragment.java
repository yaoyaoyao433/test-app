package com.meituan.android.identifycardrecognizer.fragment;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.android.identifycardrecognizer.PhotoSelectorActivity;
import com.meituan.android.identifycardrecognizer.widgets.rotate.RotateImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OcrFragment extends BaseCaptureFragment {
    public static ChangeQuickRedirect u;
    private boolean A;
    private boolean B;
    public boolean v;
    private String z;

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final int c() {
        return -1;
    }

    public OcrFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e29635f53fd2fdc1a824e0ceebd8054", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e29635f53fd2fdc1a824e0ceebd8054");
        } else {
            this.v = true;
        }
    }

    public static OcrFragment a(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac0ba3289b663616f8069925ef6d07ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (OcrFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac0ba3289b663616f8069925ef6d07ef");
        }
        OcrFragment ocrFragment = new OcrFragment();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putBoolean("needRecognize", z);
        bundle.putBoolean("needVerify", z2);
        ocrFragment.setArguments(bundle);
        return ocrFragment;
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = u;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d213c3d818701a36ac4954e12f8663", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d213c3d818701a36ac4954e12f8663") : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d7a83a6f0f92b1a063d8668cb49289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d7a83a6f0f92b1a063d8668cb49289");
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.z = getArguments().getString("type", "");
            this.A = getArguments().getBoolean("needRecognize", false);
            this.B = getArguments().getBoolean("needVerify", false);
        }
        this.b.setImageResource(R.drawable.identifycard_recognizer_icon_white_back);
        this.h.setVisibility(0);
        this.h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.e.setVisibility(0);
        this.i.setVisibility(0);
        RotateImageView rotateImageView = this.e;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        rotateImageView.setOnClickListener(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "26ff0654c543ae03a57380b1d8ee99c0", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "26ff0654c543ae03a57380b1d8ee99c0") : new f(this));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = u;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e66a65b018149eedf5e17cc99a5005bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e66a65b018149eedf5e17cc99a5005bc");
        } else if (TextUtils.equals(this.z, "1") || TextUtils.equals(this.z, "101")) {
            this.i.a(getString(R.string.identifycard_recognizer_card_front_tip), getResources().getDimensionPixelSize(R.dimen.paybase__camera_preview_text_size), getResources().getColor(R.color.paybase__white));
            com.meituan.android.paybase.config.a.d().r().a(R.drawable.identifycard_recognizer_bg_renxiang).a(this.h);
        } else {
            this.i.a(getString(R.string.identifycard_recognizer_tip), getResources().getDimensionPixelSize(R.dimen.paybase__camera_preview_text_size), getResources().getColor(R.color.paybase__white));
            com.meituan.android.paybase.config.a.d().r().a(R.drawable.identifycard_recognizer_rect).a(this.h);
        }
    }

    public static /* synthetic */ void a(OcrFragment ocrFragment, View view) {
        Object[] objArr = {ocrFragment, view};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d51eb3eb2d97f9263b86df793cc41f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d51eb3eb2d97f9263b86df793cc41f6");
        } else {
            PhotoSelectorActivity.a(ocrFragment.getActivity(), 2, ocrFragment.z, ocrFragment.A, ocrFragment.B);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fec04d944914ce27dc7914d82ad74c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fec04d944914ce27dc7914d82ad74c8");
        } else if (getActivity() != null) {
            ((com.meituan.android.identifycardrecognizer.g) getActivity()).a(13, str);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final Bitmap a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4617176cff5267f55600c154553dfc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4617176cff5267f55600c154553dfc8");
        }
        Camera.Size pictureSize = this.l.getParameters().getPictureSize();
        int width = this.h.getWidth();
        int height = this.h.getHeight();
        int width2 = this.j.getWidth();
        int height2 = this.j.getHeight();
        int i5 = pictureSize.width;
        int i6 = pictureSize.height;
        new Handler(Looper.getMainLooper()).post(g.a(this, width2, height2));
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

    public static /* synthetic */ void a(OcrFragment ocrFragment, int i, int i2) {
        Object[] objArr = {ocrFragment, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b8317fed3f5183bf961fa8b37735f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b8317fed3f5183bf961fa8b37735f7d");
        } else if (ocrFragment.isDetached()) {
        } else {
            ocrFragment.a(i, i2);
        }
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3627ff042aaa3974d664da1aa26b1865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3627ff042aaa3974d664da1aa26b1865");
            return;
        }
        super.a(i);
        this.h.setRotation(360 - i);
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ee220a50fca5c1150ed3841614d69b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ee220a50fca5c1150ed3841614d69b")).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageInfo", "OcrFragment");
        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_backfrompage_sc", hashMap);
        if (getActivity() != null) {
            getActivity().finish();
            return true;
        }
        return true;
    }

    @Override // com.meituan.android.identifycardrecognizer.fragment.BaseCaptureFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8158fafdff0570137afc4dd9e295e990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8158fafdff0570137afc4dd9e295e990");
            return;
        }
        super.onResume();
        if (!this.v || this.l == null) {
            return;
        }
        com.meituan.android.identifycardrecognizer.utils.d.a("b_pay_certificate_beginsuccess_sc", null);
        this.v = false;
    }
}
