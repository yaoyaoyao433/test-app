package com.tencent.liteav.beauty.b.a;

import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.beauty.NativeLoad;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends j {
    @Override // com.tencent.liteav.basic.opengl.j
    public boolean c() {
        this.a = NativeLoad.nativeLoadGLProgram(6);
        if (this.a != 0 && a()) {
            this.g = true;
        } else {
            this.g = false;
        }
        d();
        return this.g;
    }
}
