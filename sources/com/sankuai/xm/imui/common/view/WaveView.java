package com.sankuai.xm.imui.common.view;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WaveView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final Paint g;
    private final LinkedList<Integer> h;
    private int i;
    private boolean j;

    public WaveView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9d53bae74d876e4746d64671547595", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9d53bae74d876e4746d64671547595");
        }
    }

    public WaveView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a653b5a2777287001eb3977c79d9160a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a653b5a2777287001eb3977c79d9160a");
        }
    }

    public WaveView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd7b759e7fc6034df83ad0fd0467b44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd7b759e7fc6034df83ad0fd0467b44");
            return;
        }
        this.g = new Paint();
        this.h = new LinkedList<>();
        this.i = 10;
        this.j = false;
        this.b = k.a(context, 2.0f);
        this.c = k.a(context, 3.0f);
        this.d = 19;
        this.e = k.a(context, 6.0f);
        this.f = k.a(context, 36.0f);
        this.g.setStrokeWidth(this.b);
        this.g.setAntiAlias(true);
        this.g.setStrokeCap(Paint.Cap.ROUND);
        this.g.setColor(getResources().getColor(R.color.xm_sdk_recording_text_deep_color));
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d4e9cf39fde717c8dfb55ebe7598f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d4e9cf39fde717c8dfb55ebe7598f6");
        } else if (z == this.j) {
        } else {
            this.j = z;
            if (z) {
                setText((CharSequence) null);
            }
            invalidate();
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce51db3fd588aeb42fd7ec6adfcba412", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce51db3fd588aeb42fd7ec6adfcba412");
        } else if (z) {
            getBackground().setLevel(1);
            this.g.setColor(getResources().getColor(R.color.xm_sdk_recording_text_light_color));
            setTextColor(getResources().getColor(R.color.xm_sdk_recording_text_light_color));
        } else {
            getBackground().setLevel(0);
            this.g.setColor(getResources().getColor(R.color.xm_sdk_recording_text_deep_color));
            setTextColor(getResources().getColor(R.color.xm_sdk_recording_text_deep_color));
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6bbed07b14a86ff7748dd152a5f05e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6bbed07b14a86ff7748dd152a5f05e6");
            return;
        }
        d.a("WaveView::putValue value:%s", Integer.valueOf(i));
        if (i > this.i) {
            this.i = i;
        }
        this.h.add(0, Integer.valueOf(i));
        if (this.h.size() > (this.d / 2) + (this.d % 2 != 1 ? 0 : 1)) {
            this.h.pollLast();
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.common.view.WaveView.onDraw(android.graphics.Canvas):void");
    }
}
