package com.meituan.android.edfu.edfucamera.cameraview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.android.edfu.camerainterface.camera.AspectRatio;
import com.meituan.android.edfu.camerainterface.cameraDevice.c;
import com.meituan.android.edfu.camerainterface.cameraDevice.d;
import com.meituan.android.edfu.edfucamera.cameraview.EdfuCameraView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class EdfuBaseCameraView extends FrameLayout {
    public static ChangeQuickRedirect a;

    public abstract d getCameraDevice();

    public abstract int getFacing();

    public boolean getPreviewStart() {
        return false;
    }

    public abstract void setAspectRatio(AspectRatio aspectRatio);

    public void setCameraDataCallback(c.a aVar) {
    }

    public abstract void setFacing(int i);

    public abstract void setFlash(@EdfuCameraView.Flash int i);

    public abstract void setPrivacyToken(String str);

    public EdfuBaseCameraView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb61b2eac2623403de97c204cce6d93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb61b2eac2623403de97c204cce6d93");
        }
    }

    public EdfuBaseCameraView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d58d6c1a6f2b86cdd2c460e06bca1815", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d58d6c1a6f2b86cdd2c460e06bca1815");
        }
    }

    public EdfuBaseCameraView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5d34f6ea17f08fa35db59bbc96596d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5d34f6ea17f08fa35db59bbc96596d");
        }
    }
}
