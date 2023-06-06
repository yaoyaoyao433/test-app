package com.meituan.android.recce.views.text;

import android.content.Context;
import com.facebook.react.views.text.ReactTextView;
import com.meituan.android.recce.views.anim.RecceAnim;
import com.meituan.android.recce.views.anim.RecceAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceTextView extends ReactTextView implements RecceAnim {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RecceAnimator recceAnimator;

    public RecceTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "601d559798dac7a43e3f464472b52eda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "601d559798dac7a43e3f464472b52eda");
        }
    }

    @Override // com.meituan.android.recce.views.anim.RecceAnim
    public void start(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "775021b82d9625bc307b46bfc4212036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "775021b82d9625bc307b46bfc4212036");
        } else if (z) {
            getRecceAnimator().start();
        } else {
            getRecceAnimator().cancel();
        }
    }

    @Override // com.meituan.android.recce.views.anim.RecceAnim
    public void bindAnimData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b749d62ed656cd604bd0e7b4bb1082b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b749d62ed656cd604bd0e7b4bb1082b2");
        } else {
            getRecceAnimator().config(str);
        }
    }

    private RecceAnimator getRecceAnimator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8891c42bc3cb07b49e4af94fac382305", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecceAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8891c42bc3cb07b49e4af94fac382305");
        }
        if (this.recceAnimator == null) {
            this.recceAnimator = new RecceAnimator(this);
        }
        return this.recceAnimator;
    }
}
