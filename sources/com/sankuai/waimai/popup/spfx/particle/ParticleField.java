package com.sankuai.waimai.popup.spfx.particle;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ParticleField extends View {
    public static ChangeQuickRedirect a;
    private ArrayList<a> b;

    public ParticleField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627af109a3f97504bbb3a3e0e99bca90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627af109a3f97504bbb3a3e0e99bca90");
        }
    }

    public ParticleField(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "583223a52e8aa9b5e21f98d420fb78c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "583223a52e8aa9b5e21f98d420fb78c3");
        }
    }

    public void setParticles(ArrayList<a> arrayList) {
        this.b = arrayList;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f79bd9c3a26f9607cd36143b6a9eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f79bd9c3a26f9607cd36143b6a9eb2");
            return;
        }
        super.onDraw(canvas);
        synchronized (this.b) {
            for (int i = 0; i < this.b.size(); i++) {
                this.b.get(i).a(canvas);
            }
        }
    }
}
