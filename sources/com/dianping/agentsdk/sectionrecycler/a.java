package com.dianping.agentsdk.sectionrecycler;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.View;
import com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private Paint b;
    private Paint c;
    private TextPaint d;
    private Paint e;
    private InterfaceC0052a f;
    private ArrayList<String> g;
    private String h;
    private Rect i;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.agentsdk.sectionrecycler.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0052a {
        int getGroupPosition(int i);

        String getGroupText(int i);
    }

    public a(InterfaceC0052a interfaceC0052a) {
        Object[] objArr = {interfaceC0052a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8f609c7f59ef37aebca4ae6b440088", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8f609c7f59ef37aebca4ae6b440088");
            return;
        }
        this.g = new ArrayList<>();
        this.h = "";
        this.i = new Rect();
        this.f = interfaceC0052a;
        this.b = new Paint();
        this.b.setColor(-16711936);
        this.b.setStrokeWidth(8.0f);
        this.c = new Paint();
        this.c.setColor(-16776961);
        this.c.setStrokeWidth(12.0f);
        this.d = new TextPaint();
        this.d.setTextSize(40.0f);
        this.d.setColor(-1);
        this.e = new Paint();
        this.e.setColor(-12303292);
        this.e.setAlpha(TXLiveConstants.RENDER_ROTATION_180);
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition;
        Object[] objArr = {canvas, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99cef3a59d1ffc2f8278d3093fea5245", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99cef3a59d1ffc2f8278d3093fea5245");
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        if (this.f == null || recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        StringBuilder sb = new StringBuilder("start is ");
        sb.append(0);
        sb.append(" and end is 0");
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (recyclerView instanceof ShieldRecyclerViewInterface) {
                childAdapterPosition = ((ShieldRecyclerViewInterface) recyclerView).getShieldChildAdapterPosition(childAt);
            } else {
                childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            }
            int i2 = childAdapterPosition;
            a(canvas, childAt, i2, recyclerView, i2 == 0, i2 == recyclerView.getAdapter().getItemCount() - 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
        if (r1 != r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x028d, code lost:
        if (r25.f.getGroupPosition(r28) != r25.f.getGroupPosition(r0)) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.graphics.Canvas r26, android.view.View r27, int r28, android.support.v7.widget.RecyclerView r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.agentsdk.sectionrecycler.a.a(android.graphics.Canvas, android.view.View, int, android.support.v7.widget.RecyclerView, boolean, boolean):void");
    }
}
