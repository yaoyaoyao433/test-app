package com.sankuai.waimai.store.drug.goods.list.helper;

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
public final class b implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    public ScrollView b;
    public List<RecyclerView.k> c;
    public int d;
    public boolean e;
    public RecyclerView f;
    public Handler g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef742e8cf58b947be3e8dbd1d6691bcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef742e8cf58b947be3e8dbd1d6691bcf");
            return;
        }
        this.d = 0;
        this.g = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.drug.goods.list.helper.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a3b96a2e85c80bb2d45fedaa05f2a7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a3b96a2e85c80bb2d45fedaa05f2a7b");
                    return;
                }
                super.handleMessage(message);
                if (b.this.d != b.this.b.getScrollY() || b.this.c == null) {
                    return;
                }
                b.this.a(0);
            }
        };
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8213c3afa89068ca9452c650fd29296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8213c3afa89068ca9452c650fd29296");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112ecc63a56f622a3dd479d224db34af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112ecc63a56f622a3dd479d224db34af")).booleanValue();
        }
        Object[] objArr2 = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d283779a00835b40654425556f50d55d", RobustBitConfig.DEFAULT_VALUE)) {
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
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d283779a00835b40654425556f50d55d");
        }
        return false;
    }
}
