package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ChildRecylcerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private float d;
    private int e;

    public ChildRecylcerView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63dd4501103c55bb0b7e9e46f2325f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63dd4501103c55bb0b7e9e46f2325f6");
        } else {
            this.e = 0;
        }
    }

    public ChildRecylcerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a6f2ad328e0976a3090ca78234bf6c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a6f2ad328e0976a3090ca78234bf6c6");
        } else {
            this.e = 0;
        }
    }

    public ChildRecylcerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b04b254d5745877fce8aac36f809065", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b04b254d5745877fce8aac36f809065");
        } else {
            this.e = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        if (r15.d > r9) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.ChildRecylcerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
