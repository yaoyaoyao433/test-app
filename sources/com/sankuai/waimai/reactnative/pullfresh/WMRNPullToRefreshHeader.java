package com.sankuai.waimai.reactnative.pullfresh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic;
import com.sankuai.waimai.reactnative.pullfresh.a;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNPullToRefreshHeader extends FrameLayout implements com.sankuai.waimai.platform.widget.pullrefresh.a {
    public static ChangeQuickRedirect a;
    private boolean b;
    private boolean c;
    private ImageView d;
    private a e;

    public WMRNPullToRefreshHeader(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6df1f5990b2d765b2604009ec98933", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6df1f5990b2d765b2604009ec98933");
            return;
        }
        this.b = false;
        a(context);
    }

    public WMRNPullToRefreshHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cb2457dcf5569efa7bcfd6a232b6479", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cb2457dcf5569efa7bcfd6a232b6479");
            return;
        }
        this.b = false;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04ed28c0aa2a085db78cf497e9fb306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04ed28c0aa2a085db78cf497e9fb306");
            return;
        }
        ah.c(this, 0, 40, 0, 10);
        try {
            this.d = (ImageView) LayoutInflater.from(context).inflate(R.layout.wm_pull_refresh_header, (ViewGroup) this, true).findViewById(R.id.refresh_img_kangaroo);
            this.e = new a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim01));
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim02));
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim03));
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim04));
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim05));
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim06));
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim07));
            arrayList.add(Integer.valueOf((int) R.drawable.wm_common_pull_anim11));
            this.e.a(this.d, arrayList);
            this.c = true;
        } catch (Exception unused) {
            this.c = false;
            new View(getContext()).setLayoutParams(new ViewGroup.LayoutParams(-1, 100));
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public final void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5374e880d868b8dd2aff9326b772aa82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5374e880d868b8dd2aff9326b772aa82");
            return;
        }
        boolean z = i != 0;
        if (this.b != z) {
            this.b = z;
            if (this.c) {
                try {
                    if (z) {
                        a aVar = this.e;
                        Object[] objArr2 = {(byte) 1, 100};
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8b0f20927c0ea7611d7f25837effc9d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8b0f20927c0ea7611d7f25837effc9d6");
                            return;
                        }
                        aVar.a();
                        aVar.i = true;
                        aVar.h = 0;
                        aVar.c = 244;
                        aVar.g = new a.C1120a();
                        aVar.f.schedule(aVar.g, 0L, 100L);
                        return;
                    }
                    this.e.a();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public final void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i, int i2, @PullRefreshLogic.State int i3) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb44f31237263ff2ea01f10d49bd82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb44f31237263ff2ea01f10d49bd82d");
        } else if (this.c) {
            if (i3 == 1 || i3 == 2) {
                float a2 = o.a(i, 0, i2);
                this.d.setPivotX(this.d.getWidth() / 2);
                this.d.setPivotY(this.d.getHeight());
                this.d.setScaleX(a2);
                this.d.setScaleY(a2);
            }
        }
    }
}
