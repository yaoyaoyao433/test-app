package com.meituan.android.paycommon.lib.widgets;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AutoChangeNumberView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    public String b;
    public ObjectAnimator c;
    private float d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Animator animator);
    }

    public AutoChangeNumberView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224abc0996b33b8c335c3eebffa6a43e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224abc0996b33b8c335c3eebffa6a43e");
        }
    }

    public AutoChangeNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3615c5a95e4dad97fd6aeb95bd49df99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3615c5a95e4dad97fd6aeb95bd49df99");
        }
    }

    public float getNumber() {
        return this.d;
    }

    public void setNumber(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed17f4f37ea07c87bfe6237c494afb59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed17f4f37ea07c87bfe6237c494afb59");
            return;
        }
        this.d = f;
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        setText(String.format(this.b, Float.valueOf(f)));
    }
}
