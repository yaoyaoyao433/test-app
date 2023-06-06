package com.meituan.android.privacy.interfaces.def;

import android.media.MediaRecorder;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p implements com.meituan.android.privacy.interfaces.v {
    public static ChangeQuickRedirect a;
    private final MediaRecorder b;

    public p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8f3f88761f934a9ea58710ce472d803", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8f3f88761f934a9ea58710ce472d803");
        } else {
            this.b = new MediaRecorder();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be5f06ded2a96151cce958da0ad8f5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be5f06ded2a96151cce958da0ad8f5f");
        } else {
            this.b.start();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void b() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dff13604b9a10787915b54dfe7345bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dff13604b9a10787915b54dfe7345bd");
        } else {
            this.b.stop();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695973aac61dd339e066c868bd86f967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695973aac61dd339e066c868bd86f967");
        } else {
            this.b.reset();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void d() throws IllegalStateException, IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271e5c710081df056606a17da1bcb887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271e5c710081df056606a17da1bcb887");
        } else {
            this.b.prepare();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(int i) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5198cf17dc7c2ecba233f3af3ba31c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5198cf17dc7c2ecba233f3af3ba31c0");
        } else {
            this.b.setAudioEncoder(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void b(int i) {
        Object[] objArr = {16000};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b056d7a8497aa344a154fcc32a260811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b056d7a8497aa344a154fcc32a260811");
        } else {
            this.b.setAudioSamplingRate(16000);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void c(int i) throws IllegalStateException {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25749234786c0207676606f3302952a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25749234786c0207676606f3302952a9");
        } else {
            this.b.setAudioSource(1);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(String str) throws IllegalStateException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96492f934d28c45eaa713ebf2e11217c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96492f934d28c45eaa713ebf2e11217c");
        } else {
            this.b.setOutputFile(str);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4779543e9e623598d23e3a4488837885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4779543e9e623598d23e3a4488837885");
        } else {
            this.b.setPreviewDisplay(surface);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d199c989be80d9fcaa03eb51c4048c4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d199c989be80d9fcaa03eb51c4048c4d");
        } else {
            this.b.setOrientationHint(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(MediaRecorder.OnErrorListener onErrorListener) {
        Object[] objArr = {onErrorListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75c1e17004d4e5c3e84a0217e3fcbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75c1e17004d4e5c3e84a0217e3fcbde");
        } else {
            this.b.setOnErrorListener(onErrorListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(MediaRecorder.OnInfoListener onInfoListener) {
        Object[] objArr = {onInfoListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c98a1876b3feec1138d3c7a86cc652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c98a1876b3feec1138d3c7a86cc652");
        } else {
            this.b.setOnInfoListener(onInfoListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void e(int i) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8fb8469f7ba8639382277191ce1836f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8fb8469f7ba8639382277191ce1836f");
        } else {
            this.b.setOutputFormat(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void f(int i) throws IllegalStateException {
        Object[] objArr = {2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c43415cfec8cdfe035246fe8c481a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c43415cfec8cdfe035246fe8c481a1");
        } else {
            this.b.setVideoEncoder(2);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void g(int i) {
        Object[] objArr = {1048576};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e60cc808f66a19c49c4ac9630667af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e60cc808f66a19c49c4ac9630667af7");
        } else {
            this.b.setVideoEncodingBitRate(1048576);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void h(int i) throws IllegalStateException {
        Object[] objArr = {30};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ce3c6915cc690e380be784715a3270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ce3c6915cc690e380be784715a3270");
        } else {
            this.b.setVideoFrameRate(30);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void i(int i) throws IllegalStateException {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61813822376350f59bf3559b75f93f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61813822376350f59bf3559b75f93f7e");
        } else {
            this.b.setVideoSource(1);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(int i, int i2) throws IllegalStateException {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b800c4ba9790f8c7e6c2151842672c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b800c4ba9790f8c7e6c2151842672c");
        } else {
            this.b.setVideoSize(i, i2);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void a(com.meituan.android.privacy.interfaces.p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4005a256efbc2448c56cb1ad67e225a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4005a256efbc2448c56cb1ad67e225a4");
        } else {
            this.b.setCamera(pVar.i());
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void j(int i) throws IllegalArgumentException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d275c76f517b5d58d992a5d4f07c7d9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d275c76f517b5d58d992a5d4f07c7d9f");
        } else {
            this.b.setMaxDuration(i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de75637056b19e36832e28488fa82d90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de75637056b19e36832e28488fa82d90");
        } else {
            this.b.release();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.v
    public final int f() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ffea038d9a62284562ec2445585517", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ffea038d9a62284562ec2445585517")).intValue() : this.b.getMaxAmplitude();
    }
}
