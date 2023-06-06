package com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.d;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public ViewGroup c;
    PopupWindow d;
    boolean e;
    Context f;
    f g;
    public RecyclerView h;
    public int i;
    public com.sankuai.waimai.bussiness.order.confirm.a j;
    public boolean k;
    public d l;

    public a(Context context, f fVar, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {context, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d35be049352d652c1f84a4cc462b3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d35be049352d652c1f84a4cc462b3d");
            return;
        }
        this.e = false;
        this.l = new d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
            public final int d() {
                return 1;
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3db6c3e616f88789dfa225ef065c1be", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3db6c3e616f88789dfa225ef065c1be")).booleanValue();
                }
                a aVar2 = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "367cf27f1503780cccabf281b9a73d91", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "367cf27f1503780cccabf281b9a73d91")).booleanValue();
                }
                return (TextUtils.isEmpty(aVar2.b) ^ true) && !aVar2.a();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e54a0fd65457509d8a38801a0fdc35b2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e54a0fd65457509d8a38801a0fdc35b2")).booleanValue() : a.this.a();
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a7d51be9a4feb1bf4ad2b895c234d06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a7d51be9a4feb1bf4ad2b895c234d06");
                    return;
                }
                final a aVar2 = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "c430a3bb885212805a82d304face870a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "c430a3bb885212805a82d304face870a");
                } else if (aVar2.e) {
                } else {
                    aVar2.e = true;
                    View inflate = LayoutInflater.from(aVar2.f).inflate(R.layout.wm_order_confirm_layout_privacy_guide, (ViewGroup) null);
                    ((TextView) inflate.findViewById(R.id.txt_pricacy_guide_content)).setText(aVar2.b);
                    aVar2.d = new PopupWindow(inflate, -1, -2);
                    aVar2.d.setBackgroundDrawable(new BitmapDrawable());
                    aVar2.d.setOutsideTouchable(true);
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e7b99dfbc18baa227ec7d0367cbe500c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e7b99dfbc18baa227ec7d0367cbe500c");
                                return;
                            }
                            Activity activity = (Activity) a.this.f;
                            if (a.this.d == null) {
                                return;
                            }
                            View childAt = a.this.h.getChildAt(a.this.i);
                            Rect rect = a.this.j.V.a().b;
                            rect.set(rect.left, rect.top, rect.right, rect.bottom - (a.this.k ? 100 : 0));
                            rect.bottom -= 50;
                            boolean z = !ah.a(childAt, rect);
                            if (activity.isFinishing() || a.this.c.getWindowToken() == null || !z) {
                                return;
                            }
                            p.a(a.this.d, a.this.c, 51, 0, b.A().m() - g.a(activity, 105.0f));
                        }
                    }, 200L);
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f734ae6a3165b5aa838efd406ba6ede", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f734ae6a3165b5aa838efd406ba6ede");
                                return;
                            }
                            if (a.this.g != null) {
                                a.this.h.smoothScrollToPosition(a.this.i);
                            }
                            a.this.b();
                        }
                    });
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.a.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b238828c34d2bb412188609af171f1ea", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b238828c34d2bb412188609af171f1ea");
                            } else {
                                a.this.b();
                            }
                        }
                    }, MetricsAnrManager.ANR_THRESHOLD);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cc8dd47497ab2d11ba17d7073518fc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cc8dd47497ab2d11ba17d7073518fc3");
                    return;
                }
                a aVar2 = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "4188732baa68c54194ff0e3df3687eae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "4188732baa68c54194ff0e3df3687eae");
                } else {
                    aVar2.b();
                }
            }
        };
        this.f = context;
        this.g = fVar;
        this.j = aVar;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d41a7ee37dd2a9e42d42d83ac2adcef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d41a7ee37dd2a9e42d42d83ac2adcef")).booleanValue() : !com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.f, "order_confirm_privacy_guide_first", true);
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438820e6cf9298fdcc4dd6e438e07074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438820e6cf9298fdcc4dd6e438e07074");
        } else if (this.d == null || !this.d.isShowing()) {
        } else {
            c();
            p.a(this.d);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0fd18cbc36b7b9d7cf3b6984a94463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0fd18cbc36b7b9d7cf3b6984a94463");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.f, "order_confirm_privacy_guide_first", false);
        }
    }
}
