package com.dianping.video.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.FloatBuffer;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public FloatBuffer b;
    public FloatBuffer c;
    public ArrayList<c> d;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "492830eb5845cc6b126195bb818af6df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "492830eb5845cc6b126195bb818af6df");
        }
        return "FrameRenderInfo{renderFilterInfos=" + this.d + '}';
    }
}
