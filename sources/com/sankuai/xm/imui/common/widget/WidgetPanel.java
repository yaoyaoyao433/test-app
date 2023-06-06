package com.sankuai.xm.imui.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.widget.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WidgetPanel<W extends com.sankuai.xm.imui.common.widget.b> extends RelativeLayout {
    public static ChangeQuickRedirect b;
    private LayoutInflater a;
    public b c;
    public boolean d;
    public List<W> e;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b<T extends View> {
    }

    public WidgetPanel(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62933791b4b996829196f9553e4575d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62933791b4b996829196f9553e4575d");
        }
    }

    public WidgetPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dad8d4c6ac217f7557058edb88374c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dad8d4c6ac217f7557058edb88374c0");
        }
    }

    public WidgetPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "809ca2c07129917c96aba8fde7753d89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "809ca2c07129917c96aba8fde7753d89");
            return;
        }
        this.d = false;
        this.e = new ArrayList();
        this.a = LayoutInflater.from(context);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [H, com.sankuai.xm.imui.common.widget.WidgetPanel$b] */
    public final void a(b bVar, List<W> list) {
        View view;
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "617cff8d2734bbaae8366f3eef501225", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "617cff8d2734bbaae8366f3eef501225");
        } else if (bVar != null) {
            this.d = true;
            this.c = bVar;
            if (com.sankuai.xm.base.util.b.a(list)) {
                return;
            }
            for (W w : list) {
                Object[] objArr2 = {w};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9e9897cb374c1d82ea8a066b00a2d44", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9e9897cb374c1d82ea8a066b00a2d44");
                } else if (w != null && !this.e.contains(w)) {
                    if (this.d) {
                        Object[] objArr3 = {w};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fbcdd5871c3241fcb3b3bd86fb1b94f8", 6917529027641081856L)) {
                            view = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fbcdd5871c3241fcb3b3bd86fb1b94f8");
                        } else if (w == null) {
                            view = null;
                        } else {
                            w.h = this.c;
                            w.e = this;
                            w.b(getContext());
                            w.g = w.a(this.a, this);
                            view = w.g;
                        }
                        if (view != null) {
                            addView(view);
                        }
                        this.e.add(w);
                    } else {
                        d.d("WidgetPanel.installWidget: MUST call onAttach before installing widget!", new Object[0]);
                    }
                }
            }
        }
    }

    public final void a(W w) {
        View view;
        Object[] objArr = {w};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7015b990db9b609a4bbdfd2b7fb1ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7015b990db9b609a4bbdfd2b7fb1ad");
        } else if (w == null || !this.e.contains(w)) {
        } else {
            this.e.remove(w);
            if (this.d && (view = w.g) != null) {
                removeView(view);
            }
            w.f();
        }
    }

    public List<W> getInstalledWidgets() {
        return this.e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect c;
        private Map<String, Object> a;
        public int d;

        public a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c040440cceec34aa4d775c4ba0bbe2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c040440cceec34aa4d775c4ba0bbe2");
                return;
            }
            this.a = new HashMap();
            this.d = i;
        }
    }
}
