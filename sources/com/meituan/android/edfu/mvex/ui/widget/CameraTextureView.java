package com.meituan.android.edfu.mvex.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CameraTextureView extends EdfuCameraView {
    public static ChangeQuickRedirect f;

    public CameraTextureView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896d10480cc5d1898afdccd3da9ffb09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896d10480cc5d1898afdccd3da9ffb09");
        }
    }

    public CameraTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e70ac4fd179d5d08c0783eab44f5389", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e70ac4fd179d5d08c0783eab44f5389");
        }
    }

    public CameraTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4954bb4a0cc712cb6edbf6ab56840a0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4954bb4a0cc712cb6edbf6ab56840a0f");
        }
    }

    @Override // com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView
    public final com.meituan.android.edfu.edfupreviewer.api.b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3e7412592f00faf597df7950f51bda", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.edfu.edfupreviewer.api.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3e7412592f00faf597df7950f51bda") : new com.meituan.android.edfu.edfupreviewer.surface.b(context);
    }
}
