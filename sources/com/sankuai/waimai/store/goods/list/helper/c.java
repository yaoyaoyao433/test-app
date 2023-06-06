package com.sankuai.waimai.store.goods.list.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private ScrollView b;
    private List<RecyclerView.k> c;
    private int d;
    private boolean e;
    private RecyclerView f;
    private Handler g;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbdc6e056db430a6c0fc0e12555a9777", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbdc6e056db430a6c0fc0e12555a9777");
            return;
        }
        this.d = 0;
        this.g = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.goods.list.helper.c.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fb0823369329140a8c2684623029978", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fb0823369329140a8c2684623029978");
                    return;
                }
                super.handleMessage(message);
                if (c.this.d != c.this.b.getScrollY() || c.this.c == null) {
                    return;
                }
                c.this.a(0);
            }
        };
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e3f5079d25d6cbfea12abe8fe2b266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e3f5079d25d6cbfea12abe8fe2b266");
        } else {
            this.g.removeCallbacksAndMessages(null);
        }
    }

    public final void a(ScrollView scrollView, List<RecyclerView.k> list) {
        Object[] objArr = {scrollView, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "609787545a091198c6e1fb57cd942a61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "609787545a091198c6e1fb57cd942a61");
            return;
        }
        this.b = scrollView;
        this.c = list;
        this.f = new RecyclerView(scrollView.getContext());
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de89fb316f5647d0972a199998d4d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de89fb316f5647d0972a199998d4d26");
        } else if (com.sankuai.shangou.stone.util.a.b(this.c)) {
        } else {
            int max = Math.max(this.b.getScrollY(), 0);
            if (this.e) {
                if (max != this.d) {
                    a(1);
                }
            } else {
                if (max != this.d) {
                    a(2);
                }
                this.g.removeMessages(0);
                this.g.sendEmptyMessageDelayed(0, 5L);
            }
            this.d = max;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e0c8cd5e787c1b73dc36f9537bcae04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e0c8cd5e787c1b73dc36f9537bcae04");
            return;
        }
        for (RecyclerView.k kVar : this.c) {
            if (kVar != null) {
                kVar.onScrollStateChanged(this.f, i);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4efc8d45680f276a3f82784e608c245", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4efc8d45680f276a3f82784e608c245")).booleanValue();
        }
        Object[] objArr2 = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5acccec3436c54d69f9ce2a9b25db761", RobustBitConfig.DEFAULT_VALUE)) {
            switch (motionEvent.getAction()) {
                case 0:
                case 2:
                    this.e = true;
                    break;
                case 1:
                case 3:
                    this.e = false;
                    this.d = this.b.getScrollY();
                    this.g.removeMessages(0);
                    this.g.sendEmptyMessageDelayed(0, 5L);
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5acccec3436c54d69f9ce2a9b25db761");
        }
        return false;
    }
}
