package com.dianping.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NovaRecyclerView2 extends RecyclerView implements com.dianping.judas.interfaces.c {
    public static ChangeQuickRedirect a;
    public d b;
    private String c;
    private boolean d;
    private com.dianping.judas.b e;

    public NovaRecyclerView2(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ca6e3815d185dce2b9a99061b7b8ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ca6e3815d185dce2b9a99061b7b8ab");
            return;
        }
        this.d = false;
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        setItemViewCacheSize(0);
    }

    public NovaRecyclerView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8dc9865811051a9a56fe785610b3c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8dc9865811051a9a56fe785610b3c4");
            return;
        }
        this.d = false;
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        setItemViewCacheSize(0);
        a(context, attributeSet);
    }

    public NovaRecyclerView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217b67abc4fa55d5e709841de9637989", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217b67abc4fa55d5e709841de9637989");
            return;
        }
        this.d = false;
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        setItemViewCacheSize(0);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51815019e42e7a0b064791fddaf5354e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51815019e42e7a0b064791fddaf5354e");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.exposeBlockId});
        this.c = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115edfe69740cab06ff39811fd4bff5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115edfe69740cab06ff39811fd4bff5b")).booleanValue();
        }
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f30f23632584277ebce863c42a95224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f30f23632584277ebce863c42a95224");
            return;
        }
        switch (i) {
            case 0:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
                a.a().a(this.c, linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
                return;
            case 1:
                return;
            default:
                return;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb8e6a95d225968ef1877da25b9659b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb8e6a95d225968ef1877da25b9659b");
        } else if (this.d) {
        } else {
            this.d = true;
            postDelayed(new Runnable() { // from class: com.dianping.widget.view.NovaRecyclerView2.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2482797784f322d72d4ce028a250e928", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2482797784f322d72d4ce028a250e928");
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) NovaRecyclerView2.this.getLayoutManager();
                    a.a().a(NovaRecyclerView2.this.c, linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
                }
            }, 200L);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f7c86267a35a8cc8f68804e389ee3e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f7c86267a35a8cc8f68804e389ee3e2");
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c04023e422f54a0fec4560c1d6d6a9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c04023e422f54a0fec4560c1d6d6a9a");
        } else {
            super.onFinishInflate();
        }
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c744758e45c0581635b2896b108856e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c744758e45c0581635b2896b108856e");
        } else {
            this.e.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86fab667fba789e397453b057c0d79ab", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86fab667fba789e397453b057c0d79ab") : this.e.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac874f3e748085d325a9a09c3f879bf", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac874f3e748085d325a9a09c3f879bf") : this.e.getGAUserInfo();
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb2f1892ddbd82f963c2e406ee06fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb2f1892ddbd82f963c2e406ee06fb8");
        } else {
            this.e.a(str, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a767a91ab20b0f16eb86852bc3f811", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a767a91ab20b0f16eb86852bc3f811") : this.e.a(aVar);
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc6decf38fb7e1bffb7b7b849a2fa384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc6decf38fb7e1bffb7b7b849a2fa384");
        } else {
            this.e.a(eventInfo, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de57dc586783b0697841b7d35e4997e6", RobustBitConfig.DEFAULT_VALUE) ? (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de57dc586783b0697841b7d35e4997e6") : this.e.b(aVar);
    }

    public void setExposeBlockId(String str) {
        this.c = str;
    }
}
