package com.sankuai.waimai.store.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGViewSwitcher extends ViewSwitcher {
    public static ChangeQuickRedirect a;
    public b b;
    private int c;
    private int d;
    private List<String> e;
    private a f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public SGViewSwitcher(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bddace82b3687bae25b6750ccd90851", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bddace82b3687bae25b6750ccd90851");
        }
    }

    public SGViewSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa51bae15b7f9aa6e8b863c0970d198", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa51bae15b7f9aa6e8b863c0970d198");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4c58cdde204ebb3047cf8bba7b5af31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4c58cdde204ebb3047cf8bba7b5af31");
        } else {
            this.e = new ArrayList();
            this.b = new b(this);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c07104a92e14c8bcf6774d2fc9f07c03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c07104a92e14c8bcf6774d2fc9f07c03");
            return;
        }
        setInAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.wm_sc_base_in_animation));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.wm_sc_base_out_animation));
    }

    public final void a(List list, int i) {
        Object[] objArr = {list, 3000};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a149ab6c532be0e1e0858b325d3e6cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a149ab6c532be0e1e0858b325d3e6cc5");
        } else if (list == null) {
        } else {
            this.c = -1;
            this.d = 3000;
            this.e.clear();
            this.e.addAll(list);
            a();
            b();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6bee44d6910c2443847d9f77053c3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6bee44d6910c2443847d9f77053c3c");
        } else if (this.e == null || this.e.size() < 2) {
        } else {
            this.c = this.c != this.e.size() + (-1) ? this.c + 1 : 0;
            a(this.e.get(this.c), getNextView(), this.c);
            showNext();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4390711d7c3ad47e007129433f96b562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4390711d7c3ad47e007129433f96b562");
        } else if (this.e == null || this.e.size() < 2) {
        } else {
            this.b.removeMessages(0);
            this.b.sendEmptyMessageDelayed(0, this.d);
        }
    }

    private void a(String str, View view, final int i) {
        Object[] objArr = {str, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0121728f1778be6e1c74f68c19b417ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0121728f1778be6e1c74f68c19b417ca");
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setText(str);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.SGViewSwitcher.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2735dcf6a48382bbca377a9e71b8774", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2735dcf6a48382bbca377a9e71b8774");
                    } else if (SGViewSwitcher.this.f != null) {
                        a unused = SGViewSwitcher.this.f;
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference b;

        public b(SGViewSwitcher sGViewSwitcher) {
            Object[] objArr = {sGViewSwitcher};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a3ee4ed7496ac6a971b13b1aaa657d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a3ee4ed7496ac6a971b13b1aaa657d");
            } else {
                this.b = new WeakReference(sGViewSwitcher);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4576b2fcc622e50d0ae2d7fa8880561d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4576b2fcc622e50d0ae2d7fa8880561d");
            } else if (this.b == null || !(this.b.get() instanceof SGViewSwitcher)) {
            } else {
                SGViewSwitcher sGViewSwitcher = (SGViewSwitcher) this.b.get();
                sGViewSwitcher.a();
                sGViewSwitcher.b();
            }
        }
    }

    public void setOnClickListener(a aVar) {
        this.f = aVar;
    }
}
