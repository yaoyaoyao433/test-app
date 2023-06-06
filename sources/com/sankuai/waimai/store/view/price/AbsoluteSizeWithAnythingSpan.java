package com.sankuai.waimai.store.view.price;

import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AbsoluteSizeWithAnythingSpan extends AbsoluteSizeSpan {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;
    private Typeface d;

    public AbsoluteSizeWithAnythingSpan(int i, boolean z, Typeface typeface, int i2) {
        super(i / 2, true);
        Object[] objArr = {Integer.valueOf(i), (byte) 1, typeface, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a0ac499946bf60bb7dc938f49dd639", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a0ac499946bf60bb7dc938f49dd639");
            return;
        }
        this.b = false;
        this.b = true;
        this.d = typeface;
        this.c = i2;
    }

    public AbsoluteSizeWithAnythingSpan(int i, Typeface typeface, int i2) {
        super(i / 2, true);
        Object[] objArr = {Integer.valueOf(i), typeface, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad11124409a9f1a3f8ede00605fdf4dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad11124409a9f1a3f8ede00605fdf4dd");
            return;
        }
        this.b = false;
        this.d = typeface;
        this.c = i2;
    }

    public AbsoluteSizeWithAnythingSpan(int i, int i2) {
        super(i / 2, true);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb0e0a88a32a2fb174172f36277aa0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb0e0a88a32a2fb174172f36277aa0a");
            return;
        }
        this.b = false;
        this.c = i2;
    }

    @Override // android.text.style.AbsoluteSizeSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19cfa3aa2095f8b271586141f8df389a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19cfa3aa2095f8b271586141f8df389a");
            return;
        }
        super.updateDrawState(textPaint);
        if (this.b) {
            textPaint.setStrikeThruText(true);
        }
        if (this.c != 0) {
            textPaint.setColor(this.c);
        }
        if (this.d != null) {
            textPaint.setTypeface(this.d);
        }
    }
}
