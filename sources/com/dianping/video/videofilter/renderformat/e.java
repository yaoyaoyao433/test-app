package com.dianping.video.videofilter.renderformat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class e {
    public static ChangeQuickRedirect b = null;
    protected static final String c = "e";
    public com.dianping.video.model.d d;
    protected com.dianping.video.model.b[] e;
    public ArrayList<com.dianping.video.model.c> f;

    public abstract void a(com.dianping.video.model.d dVar, int i, int i2);

    public final void a(int i, int i2, com.dianping.video.model.c cVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf05e105d290be52a71c9b6321217090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf05e105d290be52a71c9b6321217090");
        } else if (cVar != null) {
            if (cVar.c == null && cVar.b == null) {
                return;
            }
            if (i2 > this.e[i].d.size()) {
                this.e[i].d.add(cVar);
            } else {
                this.e[i].d.add(i2, cVar);
            }
        }
    }

    public final void a(int i, com.dianping.video.videofilter.gpuimage.f fVar) {
        Object[] objArr = {Integer.valueOf(i), fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f56e6f802a6f00ab618c139df826a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f56e6f802a6f00ab618c139df826a2");
        } else if (fVar == null) {
        } else {
            Iterator<com.dianping.video.model.c> it = this.e[i].d.iterator();
            while (it.hasNext()) {
                if (it.next().c == fVar) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public final void a(com.dianping.video.model.b[] bVarArr) {
        this.e = bVarArr;
    }

    public final com.dianping.video.model.b[] a() {
        return this.e;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91455865e077be5a6ac763d01c93f98e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91455865e077be5a6ac763d01c93f98e");
        }
        return "VideoRenderStrategy{renderStrategyModel=" + this.d + ", frameRenderInfos=" + Arrays.toString(this.e) + '}';
    }
}
