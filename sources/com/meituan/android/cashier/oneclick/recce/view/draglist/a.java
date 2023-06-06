package com.meituan.android.cashier.oneclick.recce.view.draglist;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.android.cashier.oneclick.recce.view.draglist.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a<T extends c> extends FrameLayout {
    public static ChangeQuickRedirect a;
    private DragList<T> b;
    private View c;
    private com.meituan.android.cashier.oneclick.recce.view.draglist.event.a d;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9cf112b513259602abeaca6bba4db64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9cf112b513259602abeaca6bba4db64");
            return;
        }
        this.b = new DragList<>(context);
        this.c = new C0189a(context);
        addView(this.b);
        addView(this.c);
        setDragListEnabled(true);
        if (this.b != null) {
            DragList<T> dragList = this.b;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            dragList.setOnDragFinishCallback(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "14ac6f1d359c0f3900a83c37ec0f157f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cashier.oneclick.recce.view.draglist.event.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "14ac6f1d359c0f3900a83c37ec0f157f") : new b(this));
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c46e7d93b6d5ffbfaf45a0227deb42b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c46e7d93b6d5ffbfaf45a0227deb42b");
        } else if (aVar.d != null) {
            com.dianping.networklog.c.a("mOnDragFinishCallback is invoked", 3, new String[]{"Recce-Android"});
            aVar.d.a(str);
        } else {
            com.dianping.networklog.c.a("mOnDragFinishCallback is empty", 3, new String[]{"Recce-Android"});
        }
    }

    public final void setDragListEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9309a1955f5ad7797d0d03797fcf1b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9309a1955f5ad7797d0d03797fcf1b5");
            return;
        }
        this.c.setVisibility(z ? 4 : 0);
        setItemStyle(z);
    }

    public final void setData(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baca587cf8e88395a0d6223132b786fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baca587cf8e88395a0d6223132b786fe");
        } else if (list == null || list.isEmpty()) {
        } else {
            this.b.setData(list);
        }
    }

    public final void setItemBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15764b703c6959f7edb6e63ded64e978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15764b703c6959f7edb6e63ded64e978");
        } else if (this.b != null) {
            this.b.setItemBackgroundColor(i);
        }
    }

    public final void setItemStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29bce2db7b964ab71ce2d8aa23085a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29bce2db7b964ab71ce2d8aa23085a6");
        } else if (this.b != null) {
            this.b.setItemStyle(z);
        }
    }

    public final void setOnDragFinishCallback(com.meituan.android.cashier.oneclick.recce.view.draglist.event.a aVar) {
        this.d = aVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.cashier.oneclick.recce.view.draglist.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0189a extends View {
        public C0189a(Context context) {
            super(context);
            setBackground(ContextCompat.getDrawable(context, R.drawable.cashieroneclick__drag_list_mask_background));
            setClickable(true);
        }
    }
}
