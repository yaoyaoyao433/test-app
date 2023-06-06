package com.meituan.mmp.lib.api.canvas;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements f {
    public static ChangeQuickRedirect a;
    public String b;
    public j c;
    public j d;
    public Stack<j> e;
    public Stack<j> f;
    public Paint g;
    public Paint h;
    public c i;
    private f j;

    public i(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8728706deca02d3d3c588b2d4f74cc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8728706deca02d3d3c588b2d4f74cc4");
            return;
        }
        this.g = new Paint();
        this.i = null;
        this.j = fVar;
        this.c = new j();
        this.d = new j();
        this.c.setStyle(Paint.Style.STROKE);
        this.d.setStyle(Paint.Style.FILL);
        this.c.setAntiAlias(true);
        this.d.setAntiAlias(true);
        this.c.setStrokeWidth(p.a(1.0f));
        this.d.setStrokeWidth(p.a(1.0f));
        this.e = new Stack<>();
        this.f = new Stack<>();
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
