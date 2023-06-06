package com.meituan.msc.modules.api.msi.components.coverview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.msc.common.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MSCTextView extends TextView implements c {
    public static ChangeQuickRedirect c;
    private j a;
    public a d;

    public MSCTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c890e2236f5984e771f2c21bd1c526", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c890e2236f5984e771f2c21bd1c526");
        } else {
            a();
        }
    }

    public MSCTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e3f4b1cffb65357d0094928525370b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e3f4b1cffb65357d0094928525370b");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ccdbe51c7ee8e042dead16ab41cbd6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ccdbe51c7ee8e042dead16ab41cbd6b");
            return;
        }
        if (Build.BRAND.equalsIgnoreCase("xiaomi") && s.a() != null) {
            setTypeface(s.a());
        }
        super.setIncludeFontPadding(false);
        super.setLineSpacing(0.0f, 1.0f);
        super.setSpannableFactory(new Spannable.Factory() { // from class: com.meituan.msc.modules.api.msi.components.coverview.MSCTextView.1
            public static ChangeQuickRedirect a;

            @Override // android.text.Spannable.Factory
            public final Spannable newSpannable(CharSequence charSequence) {
                Object[] objArr2 = {charSequence};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "547aca92f1feb06d8aa9825c1d0610d0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Spannable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "547aca92f1feb06d8aa9825c1d0610d0");
                }
                Spannable newSpannable = super.newSpannable(charSequence);
                if (MSCTextView.this.a != null && !TextUtils.isEmpty(newSpannable)) {
                    newSpannable.setSpan(MSCTextView.this.a, 0, newSpannable.length(), 18);
                }
                return newSpannable;
            }
        });
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90cc6257ae720044a7822a4ce9cab745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90cc6257ae720044a7822a4ce9cab745");
            return;
        }
        super.onDetachedFromWindow();
        setOnClickListener(null);
        setOnTouchListener(null);
        this.a = null;
    }

    public void setLineHeightEx(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25de476ba7b291c8386bd4746fad140f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25de476ba7b291c8386bd4746fad140f");
            return;
        }
        if (this.a == null) {
            this.a = new j(i);
        }
        j jVar = this.a;
        float f = i;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "5e1657d7ecce580cf11228c7b98a6946", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "5e1657d7ecce580cf11228c7b98a6946")).booleanValue();
        } else if (jVar.b == Math.round(f)) {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object[] objArr = {charSequence, bufferType};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30100def742bc997bbe169a2fff8491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30100def742bc997bbe169a2fff8491");
            return;
        }
        if (bufferType == TextView.BufferType.NORMAL) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // com.meituan.msc.modules.api.msi.components.coverview.c
    public a getCoverUpdateObserver() {
        return this.d;
    }

    @Override // com.meituan.msc.modules.api.msi.components.coverview.c
    public final void a(a aVar) {
        this.d = aVar;
    }

    public void setFakeBoldText(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c037defe10bf242fb7d0f32b0ecdf8a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c037defe10bf242fb7d0f32b0ecdf8a4");
        } else {
            getPaint().setFakeBoldText(z);
        }
    }
}
