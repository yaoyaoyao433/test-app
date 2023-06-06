package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sg extends Handler {
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    private final so d;

    public sg(so soVar, Looper looper) {
        super(looper);
        this.d = soVar;
        kn.b(km.T);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CameraPosition a2;
        super.handleMessage(message);
        so soVar = this.d;
        if (soVar == null || soVar.e_ == 0 || !((VectorMap) soVar.e_).a() || (a2 = soVar.a()) == null) {
            return;
        }
        if (message.what == 2) {
            soVar.aa();
            kn.d(km.T);
        }
        if (message.what == 0) {
            soVar.onCameraChange(a2);
        } else if (message.what == 1) {
            soVar.ay = true;
            if (soVar.av != null && soVar.aw) {
                soVar.av.onMapStable();
            }
            soVar.onCameraChangeFinished(a2);
        }
        soVar.V();
    }
}
