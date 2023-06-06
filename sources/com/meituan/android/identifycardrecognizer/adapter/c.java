package com.meituan.android.identifycardrecognizer.adapter;

import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.identifycardrecognizer.PhotoSelectorActivity;
import com.meituan.android.identifycardrecognizer.adapter.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final b.c d;

    private c(b bVar, String str, b.c cVar) {
        this.b = bVar;
        this.c = str;
        this.d = cVar;
    }

    public static View.OnClickListener a(b bVar, String str, b.c cVar) {
        Object[] objArr = {bVar, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a417d85053d1f150ae73ff59fd1db5e", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a417d85053d1f150ae73ff59fd1db5e") : new c(bVar, str, cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8429e46c6b1d7f5ff4fe50bc3932023b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8429e46c6b1d7f5ff4fe50bc3932023b");
            return;
        }
        b bVar = this.b;
        String str = this.c;
        b.c cVar = this.d;
        Object[] objArr2 = {bVar, str, cVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f15bb3422f6a2820ab074d7dcf4942f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f15bb3422f6a2820ab074d7dcf4942f0");
            return;
        }
        if (bVar.e.contains(str)) {
            bVar.e.remove(str);
            bVar.a(cVar, false);
        } else if (bVar.e.size() < bVar.d) {
            bVar.e.add(str);
            bVar.a(cVar, true);
        }
        if (bVar.f != null) {
            bVar.e.size();
        }
        PhotoSelectorActivity photoSelectorActivity = (PhotoSelectorActivity) bVar.b;
        int size = bVar.e.size();
        Object[] objArr3 = {Integer.valueOf(size)};
        ChangeQuickRedirect changeQuickRedirect3 = PhotoSelectorActivity.a;
        if (PatchProxy.isSupport(objArr3, photoSelectorActivity, changeQuickRedirect3, false, "f6af59fca2fa665a39ff020560b27c60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, photoSelectorActivity, changeQuickRedirect3, false, "f6af59fca2fa665a39ff020560b27c60");
        } else if (size <= 0) {
            photoSelectorActivity.b.setEnabled(false);
            ((GradientDrawable) photoSelectorActivity.b.getBackground()).setColor(photoSelectorActivity.getResources().getColor(R.color.identifycard_recognizer_color_selector_button_gray));
        } else {
            photoSelectorActivity.b.setEnabled(true);
            ((GradientDrawable) photoSelectorActivity.b.getBackground()).setColor(com.meituan.android.identifycardrecognizer.utils.a.b);
            if (photoSelectorActivity.c == 1) {
                if (size == 1) {
                    photoSelectorActivity.b.setTag("less");
                } else {
                    photoSelectorActivity.b.setTag("ok");
                }
            }
        }
        bVar.notifyItemRangeChanged(0, bVar.c.size(), "mask_state");
    }
}
