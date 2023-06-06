package com.sankuai.waimai.platform.widget.pullrefresh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DefaultPullRefreshHeader extends FrameLayout implements a {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private boolean c;

    public DefaultPullRefreshHeader(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327c0a8f21228692862967a801c860d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327c0a8f21228692862967a801c860d0");
            return;
        }
        this.c = false;
        a(context);
    }

    public DefaultPullRefreshHeader(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bfa42bbd9219e9843c4a08a8487e49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bfa42bbd9219e9843c4a08a8487e49");
            return;
        }
        this.c = false;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63d71b506d094370e77f72cf0b0be86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63d71b506d094370e77f72cf0b0be86");
            return;
        }
        ah.c(this, 0, 44, 0, 0);
        this.b = (ImageView) LayoutInflater.from(context).inflate(R.layout.wm_common_ptr_layout_header, (ViewGroup) this, true).findViewById(R.id.refresh_img);
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fd21b6d95335fde036330090928d32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fd21b6d95335fde036330090928d32");
            return;
        }
        boolean z = i != 0;
        if (this.c != z) {
            this.c = z;
            if (z) {
                this.b.setImageResource(R.drawable.wm_common_pull_anim);
            } else {
                this.b.setImageDrawable(null);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.a
    public final void a(@NonNull b bVar, int i, int i2, @PullRefreshLogic.State int i3) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33b2a9e252906eead07f984151cabef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33b2a9e252906eead07f984151cabef8");
        } else if (i3 == 1 || i3 == 2) {
            float a2 = o.a(i, 0, i2);
            this.b.setPivotX(this.b.getWidth() / 2);
            this.b.setPivotY(this.b.getHeight());
            this.b.setScaleX(a2);
            this.b.setScaleY(a2);
        }
    }
}
