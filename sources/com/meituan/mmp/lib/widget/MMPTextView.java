package com.meituan.mmp.lib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MMPTextView extends TextView implements com.meituan.mmp.lib.api.coverview.e {
    public static ChangeQuickRedirect a;
    public com.meituan.mmp.lib.api.coverview.b b;
    public boolean c;
    private d d;

    public MMPTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14469c5cd1754fe4c37620837064d215", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14469c5cd1754fe4c37620837064d215");
        } else {
            a();
        }
    }

    public MMPTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c873688587ba2334e087d78cf69c91dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c873688587ba2334e087d78cf69c91dc");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21db83443ebc3726c695adb367eb0d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21db83443ebc3726c695adb367eb0d47");
            return;
        }
        if (Build.BRAND.equalsIgnoreCase("xiaomi") && t.a() != null) {
            setTypeface(t.a());
        }
        super.setIncludeFontPadding(false);
        super.setLineSpacing(0.0f, 1.0f);
        super.setSpannableFactory(new Spannable.Factory() { // from class: com.meituan.mmp.lib.widget.MMPTextView.1
            public static ChangeQuickRedirect a;

            @Override // android.text.Spannable.Factory
            public final Spannable newSpannable(CharSequence charSequence) {
                Object[] objArr2 = {charSequence};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "537fb3dada8f715054bb32a239c0fa6c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Spannable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "537fb3dada8f715054bb32a239c0fa6c");
                }
                Spannable newSpannable = super.newSpannable(charSequence);
                if (MMPTextView.this.d != null && !TextUtils.isEmpty(newSpannable)) {
                    newSpannable.setSpan(MMPTextView.this.d, 0, newSpannable.length(), 18);
                }
                return newSpannable;
            }
        });
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7768ec0d099ad017443b8a7293b3e5e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7768ec0d099ad017443b8a7293b3e5e6");
            return;
        }
        super.onDetachedFromWindow();
        setOnClickListener(null);
        setOnTouchListener(null);
        this.d = null;
    }

    public void setLineHeightEx(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8809c89084c25120e6df687212ecc7a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8809c89084c25120e6df687212ecc7a7");
            return;
        }
        if (this.d == null) {
            this.d = new d(i);
        }
        d dVar = this.d;
        float f = i;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "dc2db95b68f10a344469991348bdaa33", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "dc2db95b68f10a344469991348bdaa33")).booleanValue();
        } else if (dVar.b == Math.round(f)) {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object[] objArr = {charSequence, bufferType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f68bf742dd7372d2615bde77cb500d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f68bf742dd7372d2615bde77cb500d3a");
            return;
        }
        if (bufferType == TextView.BufferType.NORMAL) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        super.setText(charSequence, bufferType);
    }

    public com.meituan.mmp.lib.api.coverview.b getCoverUpdateObserver() {
        return this.b;
    }

    @Override // com.meituan.mmp.lib.api.coverview.e
    public final void a(com.meituan.mmp.lib.api.coverview.b bVar) {
        this.b = bVar;
    }

    @Override // com.meituan.mmp.lib.api.coverview.e
    public void setIsCustomCallOutView(boolean z) {
        this.c = z;
    }

    public void setFakeBoldText(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401b09f03d3e2d8fe0ecef7e3db2938d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401b09f03d3e2d8fe0ecef7e3db2938d");
        } else {
            getPaint().setFakeBoldText(z);
        }
    }
}
