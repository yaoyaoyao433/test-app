package com.meituan.android.edfu.mbar.view;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView;
import com.meituan.android.edfu.edfupreviewer.api.b;
import com.meituan.android.edfu.edfupreviewer.surface.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EdfuCameraSurface extends EdfuCameraView {
    public static ChangeQuickRedirect f;
    private b g;

    public EdfuCameraSurface(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c65338768ccb223f8ecb646b251ae9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c65338768ccb223f8ecb646b251ae9");
        }
    }

    public EdfuCameraSurface(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b11807118d1e33cd5dc944ac2a232730", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b11807118d1e33cd5dc944ac2a232730");
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView
    public final b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e029c1b540f7924cac902895d60536dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e029c1b540f7924cac902895d60536dd");
        }
        if (this.g == null) {
            this.g = new h(context);
        }
        return this.g;
    }
}
